// ============================================================================
//
// Copyright (C) 2006-2011 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.runprocess;

import org.talend.commons.ui.runtime.exception.ExceptionHandler;
import org.talend.designer.runprocess.i18n.Messages;

/**
 * Message about a process. <br/>
 * 
 * $Id$
 * 
 * 
 */
public class ProcessMessage implements IProcessMessage {

    /** Type of the message. */
    public enum MsgType implements IMsgType {
        STD_OUT,
        STD_ERR,
        CORE_OUT,
        CORE_ERR
    }

    /** Type of the message. */
    public IMsgType type;

    /** Content of the message. */
    public String content;

    /**
     * Constrcucts a new ProcessMessage.
     */
    public ProcessMessage(IMsgType type, String content) {
        super();

        if (type == null) {
            ExceptionHandler.process(new IllegalArgumentException(Messages.getString("ProcessMessage.typeNull"))); //$NON-NLS-1$
        }
        if (content == null) {
            ExceptionHandler.process(new IllegalArgumentException(Messages.getString("ProcessMessage.contentNull"))); //$NON-NLS-1$
        }

        this.type = type;
        this.content = content;
    }

    /**
     * Getter for content.
     * 
     * @return the content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Getter for type.
     * 
     * @return the type
     */
    public IMsgType getType() {
        return this.type;
    }

}