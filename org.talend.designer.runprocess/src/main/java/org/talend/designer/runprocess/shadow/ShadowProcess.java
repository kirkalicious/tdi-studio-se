// ============================================================================
//
// Copyright (C) 2006-2007 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.runprocess.shadow;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.talend.commons.ui.utils.PathUtils;
import org.talend.core.CorePlugin;
import org.talend.core.model.process.IContext;
import org.talend.core.model.process.IProcess;
import org.talend.core.model.utils.TalendTextUtils;
import org.talend.core.prefs.ITalendCorePrefConstants;
import org.talend.core.utils.CsvArray;
import org.talend.designer.runprocess.IProcessor;
import org.talend.designer.runprocess.ProcessStreamTrashReader;
import org.talend.designer.runprocess.ProcessorException;
import org.talend.designer.runprocess.ProcessorUtilities;
import org.talend.designer.runprocess.i18n.Messages;
import org.talend.repository.preview.ExcelSchemaBean;
import org.talend.repository.preview.IProcessDescription;

/**
 * Launch a Process in shadow mode. <br/>
 * 
 * $Id$
 * 
 * @param <T>
 * 
 */
public class ShadowProcess<T extends IProcessDescription> {

    /**
     * 
     */
    private static final String TEMP_LDAP_SCHEMA_FILE_NAME = "TempLDAPSchema";

    private static final String TEMP_WSDL_SCHEMA_FILE_NAME = "TempWSDLSchema";

    private static final String TEMP_SALEFORCE_SCHEMA_FILE_NAME = "TempSALESFORCESchema";

    /**
     * Available Shadow Process Types.
     * 
     * $Id$
     * 
     */
    public static enum EShadowProcessType {
        FILE_DELIMITED,
        FILE_POSITIONAL,
        FILE_CSV,
        FILE_REGEXP,
        FILE_XML,
        FILE_EXCEL,
        FILE_LDIF,
        WSDL_SCHEMA,
        LDAP_SCHEMA,
        SALESFORCE_SCHEMA;

        private EShadowProcessType() {

        }
    }

    // private static final String XML_EXT = "xml"; //$NON-NLS-1$

    private static final String CSV_EXT = "csv"; //$NON-NLS-1$

    private T description;

    private IPath inPath;

    private IPath outPath;

    private EShadowProcessType type;

    private Process process;

    /**
     * Constructs a new ShadowProcess.
     */
    public ShadowProcess(T description, EShadowProcessType type) {
        super();

        this.description = description;
        String filePath = description.getFilepath();

        if (filePath != null) {
            this.inPath = new Path(filePath);
            this.outPath = buildTempCSVFilename(this.inPath);
        } else if (type.name().equals("LDAP_SCHEMA")) {
            IPath tempPath = Path.fromOSString(CorePlugin.getDefault().getPreferenceStore().getString(
                    ITalendCorePrefConstants.FILE_PATH_TEMP));
            this.outPath = tempPath.append(TEMP_LDAP_SCHEMA_FILE_NAME + "." + CSV_EXT);
        } else if (type.name().equals("WSDL_SCHEMA")) {
            IPath tempPath = Path.fromOSString(CorePlugin.getDefault().getPreferenceStore().getString(
                    ITalendCorePrefConstants.FILE_PATH_TEMP));
            this.outPath = tempPath.append(TEMP_WSDL_SCHEMA_FILE_NAME + "." + CSV_EXT);
        } else if (type.name().equals("SALESFORCE_SCHEMA")) {
            IPath tempPath = Path.fromOSString(CorePlugin.getDefault().getPreferenceStore().getString(
                    ITalendCorePrefConstants.FILE_PATH_TEMP));
            this.outPath = tempPath.append(TEMP_SALEFORCE_SCHEMA_FILE_NAME + "." + CSV_EXT);
        }

        this.type = type;
    }

    private IProcess buildProcess() {
        IProcess ps = null;
        FileOutputDelimitedNode outNode = new FileOutputDelimitedNode(TalendTextUtils
                .addQuotes("" + PathUtils.getPortablePath(outPath.toOSString())), description.getEncoding()); //$NON-NLS-1$ //$NON-NLS-2$
        switch (type) {

        case FILE_DELIMITED:

        case FILE_CSV:
            FileInputDelimitedNode inDelimitedNode = new FileInputDelimitedNode(PathUtils.getPortablePath(inPath.toOSString()),
                    description //$NON-NLS-1$ //$NON-NLS-2$
                            .getRowSeparator(), description.getFieldSeparator(), description.getLimitRows(), description
                            .getHeaderRow(), description.getFooterRow(), description.getEscapeCharacter(), description
                            .getTextEnclosure(), description.getRemoveEmptyRowsToSkip(), description.isSplitRecord(), description
                            .getEncoding(), type);
            ps = new FileinToDelimitedProcess<FileInputDelimitedNode>(inDelimitedNode, outNode);
            break;

        case FILE_POSITIONAL:
            FileInputPositionalNode inPositionalNode = new FileInputPositionalNode(
                    PathUtils.getPortablePath(inPath.toOSString()), //$NON-NLS-1$ //$NON-NLS-2$
                    description.getRowSeparator(), description.getPattern(), description.getHeaderRow(), description
                            .getFooterRow(), description.getLimitRows(), description.getRemoveEmptyRowsToSkip(), description
                            .getEncoding());
            outNode.setColumnNumber(inPositionalNode.getColumnNumber());
            ps = new FileinToDelimitedProcess<FileInputPositionalNode>(inPositionalNode, outNode);
            break;

        case FILE_REGEXP:
            FileInputRegExpNode inRegExpNode = new FileInputRegExpNode(PathUtils.getPortablePath(inPath.toOSString()),
                    description //$NON-NLS-1$ //$NON-NLS-2$
                            .getRowSeparator(), description.getPattern(), description.getLimitRows(), description.getHeaderRow(),
                    description.getFooterRow(), description.getRemoveEmptyRowsToSkip(), description.getEncoding());
            ps = new FileinToDelimitedProcess<FileInputRegExpNode>(inRegExpNode, outNode);
            break;
        case FILE_XML:
            List<Map<String, String>> newmappings = new ArrayList<Map<String, String>>();
            List<Map<String, String>> oldmappings = description.getMapping();
            for (int i = 0; i < oldmappings.size(); i++) {
                Map<String, String> map = oldmappings.get(i);
                map.put("SCHEMA_COLUMN", "row" + i);
                newmappings.add(map);
            }
            FileInputXmlNode inXmlNode = new FileInputXmlNode(PathUtils.getPortablePath(inPath.toOSString()), description
                    .getLoopQuery(), //$NON-NLS-1$ //$NON-NLS-2$
                    description.getMapping(), description.getLoopLimit(), description.getEncoding());
            ps = new FileinToDelimitedProcess<FileInputXmlNode>(inXmlNode, outNode);
            break;
        case FILE_EXCEL:
            FileInputExcelNode excelNode = null;

            ExcelSchemaBean excelBean = description.getExcelSchemaBean();

            excelNode = new FileInputExcelNode(PathUtils.getPortablePath(inPath.toOSString()), description.getSchema(),
                    description.getEncoding() == null ? TalendTextUtils.addQuotes("ISO-8859-1") : description.getEncoding(),
                    Integer.toString(description.getLimitRows()), Integer.toString(description.getHeaderRow()), Integer
                            .toString(description.getFooterRow()), Boolean.toString(description.getRemoveEmptyRowsToSkip()),
                    excelBean);

            outNode.setMetadataList(excelNode.getMetadataList());

            ps = new FileinToDelimitedProcess<FileInputExcelNode>(excelNode, outNode);
            break;
        case FILE_LDIF:
            outNode = new FileOutputDelimitedForLDIF(TalendTextUtils.addQuotes(""
                    + PathUtils.getPortablePath(outPath.toOSString())), description.getEncoding());

            FileInputLdifNode inLdifNode = new FileInputLdifNode(PathUtils.getPortablePath(inPath.toOSString()), description
                    .getSchema(), description.getEncoding()); //$NON-NLS-1$ //$NON-NLS-2$
            outNode.setMetadataList(inLdifNode.getMetadataList());
            ps = new FileinToDelimitedProcess<FileInputLdifNode>(inLdifNode, outNode);
            break;
        case LDAP_SCHEMA:
            // outNode = new FileOutputDelimitedForLDIF(TalendTextUtils.addQuotes(""
            // + PathUtils.getPortablePath(outPath.toOSString())), description.getEncoding());

            LDAPSchemaInputNode inLDAPSchemaNode = new LDAPSchemaInputNode(TalendTextUtils.addQuotes(""
                    + PathUtils.getPortablePath(outPath.toOSString())), description.getSchema(), description.getEncoding(),
                    description.getLdapSchemaBean());

            outNode.setMetadataList(inLDAPSchemaNode.getMetadataList());
            ps = new FileinToDelimitedProcess<LDAPSchemaInputNode>(inLDAPSchemaNode, outNode);
            break;
        case WSDL_SCHEMA:
            // outNode = new FileOutputDelimitedForLDIF(TalendTextUtils.addQuotes(""
            // + PathUtils.getPortablePath(outPath.toOSString())), description.getEncoding());

            WSDLSchemaInputNode inWSDLSchemaNode = new WSDLSchemaInputNode(TalendTextUtils.addQuotes(""
                    + PathUtils.getPortablePath(outPath.toOSString())), description.getEncoding(), description.getSchema(),
                    description.getWsdlSchemaBean(), description.getWsdlSchemaBean().getParameters());

            outNode.setMetadataList(inWSDLSchemaNode.getMetadataList());
            ps = new FileinToDelimitedProcess<WSDLSchemaInputNode>(inWSDLSchemaNode, outNode);
            break;

        case SALESFORCE_SCHEMA:
            SalesforceSchemaInputNode inSalesforceNode = new SalesforceSchemaInputNode(description.getSchema(), description
                    .getSalesforceSchemaBean());
            outNode.setMetadataList(inSalesforceNode.getMetadataList());
            ps = new FileinToDelimitedProcess<SalesforceSchemaInputNode>(inSalesforceNode, outNode);
            break;
        default:
            break;
        }
        return ps;
    }

    private static IPath buildTempCSVFilename(IPath inPath) {
        String filename = inPath.lastSegment();
        if (inPath.getFileExtension() != null) {
            filename = filename.substring(0, filename.length() - inPath.getFileExtension().length());
        } else // Check if file has no suffix.
        {
            int length = filename.length();
            filename = filename.substring(0, length - 1) + ".";
        }

        filename += CSV_EXT;
        IPath tempPath;
        tempPath = Path.fromOSString(CorePlugin.getDefault().getPreferenceStore().getString(
                ITalendCorePrefConstants.FILE_PATH_TEMP));
        tempPath = tempPath.append(filename);

        return tempPath;
    }

    public CsvArray run() throws ProcessorException {
        IProcess talendProcess = buildProcess();
        IProcessor processor = ProcessorUtilities.getProcessor(talendProcess);
        // try {
        // Delete previous Perl generated file
        File previousFile = outPath.toFile();
        if (previousFile.exists()) {
            previousFile.delete();
        }

        // Process ps = processor.run(process.getContextManager().getDefaultContext(), Processor.NO_STATISTICS,
        // Processor.NO_TRACES,Processor.WATCH_ALLOWED);//Old

        IContext context = talendProcess.getContextManager().getDefaultContext();
        processor.setContext(context);
        process = processor.run(IProcessor.NO_STATISTICS, IProcessor.NO_TRACES, null);
        ProcessStreamTrashReader.readAndForget(process);

        if (!outPath.toFile().exists()) {
            throw new ProcessorException(Messages.getString("ShadowProcess.notGeneratedOutputException")); //$NON-NLS-1$
        }
        // FileInputStream fis = new FileInputStream(outPath.toFile());
        try {
            CsvArray array = new CsvArray();
            array = array.createFrom(outPath.toFile());
            return array;
        } catch (IOException ioe) {
            throw new ProcessorException(ioe);
        }
        // catch (ParserConfigurationException pce) {
        // throw new ProcessorException(pce);
        // } catch (SAXException se) {
        // throw new ProcessorException(se);
        // }
    }

    /**
     * If the process generate any error output, throw an ProcessorException.
     * <p>
     * DOC YeXiaowei Comment method "runWithErrorOutputAsException".
     * 
     * @return
     * @throws ProcessorException
     */
    public CsvArray runWithErrorOutputAsException() throws ProcessorException {

        IProcess talendProcess = buildProcess();

        IProcessor processor = ProcessorUtilities.getProcessor(talendProcess);

        File previousFile = outPath.toFile();
        if (previousFile.exists()) {
            previousFile.delete();
        }

        IContext context = talendProcess.getContextManager().getDefaultContext();
        processor.setContext(context);
        process = processor.run(IProcessor.NO_STATISTICS, IProcessor.NO_TRACES, null);

        String error = ProcessStreamTrashReader.readErrorStream(process);

        if (error != null) {
            throw new ProcessorException(error); //$NON-NLS-1$
        }

        if (!outPath.toFile().exists()) {
            throw new ProcessorException(Messages.getString("ShadowProcess.notGeneratedOutputException")); //$NON-NLS-1$
        }

        try {
            CsvArray array = new CsvArray();
            array = array.createFrom(outPath.toFile());
            return array;
        } catch (IOException ioe) {
            throw new ProcessorException(ioe);
        }
    }

    /**
     * Destroy the current process if exists.
     * 
     * @return error code of {@link java.lang.Process#exitValue()}
     */
    public int destroy() {
        int exitCode = 0;
        if (process != null) {
            process.destroy();
            try {
                exitCode = process.exitValue();
            } catch (IllegalThreadStateException itse) {
                // Can be throw on some UNIX system :(
                // but the process is really killed.
            }
            process = null;
        }
        return exitCode;
    }

}
