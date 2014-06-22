/**
 * MktowsApiSoapBindingStub.java
 * 
 * This file was auto-generated from WSDL by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPFactory;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;
import org.apache.axis.message.SOAPEnvelope;
import org.apache.axis.message.SOAPHeaderElement;
import org.talend.common.Signature;

public class MktowsApiSoapBindingStub extends org.apache.axis.client.Stub implements com.marketo.www.mktows.MktowsPort {

    private java.util.Vector cachedSerClasses = new java.util.Vector();

    private java.util.Vector cachedSerQNames = new java.util.Vector();

    private java.util.Vector cachedSerFactories = new java.util.Vector();

    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    int timeout;

    String clientAccessID;

    String secretKey;

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getClientAccessID() {
        return clientAccessID;
    }

    public void setClientAccessID(String clientAccessID) {
        this.clientAccessID = clientAccessID;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeMObject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
                "paramsDescribeMObject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                "http://www.marketo.com/mktows/", "ParamsDescribeMObject"), com.marketo.www.mktows.ParamsDescribeMObject.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessDescribeMObject"));
        oper.setReturnClass(com.marketo.www.mktows.SuccessDescribeMObject.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "successDescribeMObject"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCampaignsForSource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
                "paramsGetCampaignsForSource"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                "http://www.marketo.com/mktows/", "ParamsGetCampaignsForSource"),
                com.marketo.www.mktows.ParamsGetCampaignsForSource.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessGetCampaignsForSource"));
        oper.setReturnClass(com.marketo.www.mktows.SuccessGetCampaignsForSource.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "successGetCampaignsForSource"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
                "paramsGetLead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                "http://www.marketo.com/mktows/", "ParamsGetLead"), com.marketo.www.mktows.ParamsGetLead.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessGetLead"));
        oper.setReturnClass(com.marketo.www.mktows.SuccessGetLead.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "successGetLead"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLeadActivity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
                "paramsGetLeadActivity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                "http://www.marketo.com/mktows/", "ParamsGetLeadActivity"), com.marketo.www.mktows.ParamsGetLeadActivity.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessGetLeadActivity"));
        oper.setReturnClass(com.marketo.www.mktows.SuccessGetLeadActivity.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "successGetLeadActivity"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLeadChanges");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
                "paramsGetLeadChanges"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                "http://www.marketo.com/mktows/", "ParamsGetLeadChanges"), com.marketo.www.mktows.ParamsGetLeadChanges.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessGetLeadChanges"));
        oper.setReturnClass(com.marketo.www.mktows.SuccessGetLeadChanges.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "successGetLeadChanges"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMultipleLeads");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
                "paramsGetMultipleLeads"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                "http://www.marketo.com/mktows/", "ParamsGetMultipleLeads"), com.marketo.www.mktows.ParamsGetMultipleLeads.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessGetMultipleLeads"));
        oper.setReturnClass(com.marketo.www.mktows.SuccessGetMultipleLeads.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "successGetMultipleLeads"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listMObjects");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
                "paramsListMObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                "http://www.marketo.com/mktows/", "ParamsListMObjects"), com.marketo.www.mktows.ParamsListMObjects.class, false,
                false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessListMObjects"));
        oper.setReturnClass(com.marketo.www.mktows.SuccessListMObjects.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "successListMObjects"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("listOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
                "paramsListOperation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                "http://www.marketo.com/mktows/", "ParamsListOperation"), com.marketo.www.mktows.ParamsListOperation.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessListOperation"));
        oper.setReturnClass(com.marketo.www.mktows.SuccessListOperation.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "successListOperation"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("requestCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
                "paramsRequestCampaign"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                "http://www.marketo.com/mktows/", "ParamsRequestCampaign"), com.marketo.www.mktows.ParamsRequestCampaign.class,
                false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessRequestCampaign"));
        oper.setReturnClass(com.marketo.www.mktows.SuccessRequestCampaign.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "successRequestCampaign"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("syncLead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
                "paramsSyncLead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                "http://www.marketo.com/mktows/", "ParamsSyncLead"), com.marketo.www.mktows.ParamsSyncLead.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessSyncLead"));
        oper.setReturnClass(com.marketo.www.mktows.SuccessSyncLead.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "successSyncLead"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("syncMultipleLeads");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.marketo.com/mktows/",
                "paramsSyncMultipleLeads"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName(
                "http://www.marketo.com/mktows/", "ParamsSyncMultipleLeads"),
                com.marketo.www.mktows.ParamsSyncMultipleLeads.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessSyncMultipleLeads"));
        oper.setReturnClass(com.marketo.www.mktows.SuccessSyncMultipleLeads.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "successSyncMultipleLeads"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

    }

    public MktowsApiSoapBindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public MktowsApiSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public MktowsApiSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
        java.lang.Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ActivityRecord");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ActivityRecord.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ActivityType");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ActivityType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ActivityTypeFilter");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ActivityTypeFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ArrayOfActivityRecord");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ActivityRecord[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ActivityRecord");
        qName2 = new javax.xml.namespace.QName("", "activityRecord");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ArrayOfActivityType");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ActivityType[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ActivityType");
        qName2 = new javax.xml.namespace.QName("", "activityType");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ArrayOfAttribute");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.Attribute[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "Attribute");
        qName2 = new javax.xml.namespace.QName("", "attribute");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ArrayOfCampaignRecord");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.CampaignRecord[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "CampaignRecord");
        qName2 = new javax.xml.namespace.QName("", "campaignRecord");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ArrayOfLeadChangeRecord");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.LeadChangeRecord[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "LeadChangeRecord");
        qName2 = new javax.xml.namespace.QName("", "leadChangeRecord");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ArrayOfLeadKey");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.LeadKey[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "LeadKey");
        qName2 = new javax.xml.namespace.QName("", "leadKey");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ArrayOfLeadRecord");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.LeadRecord[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "LeadRecord");
        qName2 = new javax.xml.namespace.QName("", "leadRecord");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ArrayOfLeadStatus");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.LeadStatus[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "LeadStatus");
        qName2 = new javax.xml.namespace.QName("", "leadStatus");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ArrayOfMObjFieldMetadata");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.MObjFieldMetadata[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "MObjFieldMetadata");
        qName2 = new javax.xml.namespace.QName("", "field");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ArrayOfString");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = new javax.xml.namespace.QName("", "stringItem");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ArrayOfSyncStatus");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.SyncStatus[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SyncStatus");
        qName2 = new javax.xml.namespace.QName("", "syncStatus");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "Attribute");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.Attribute.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "CampaignRecord");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.CampaignRecord.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ForeignSysType");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ForeignSysType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "LeadActivityList");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.LeadActivityList.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "LeadChangeRecord");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.LeadChangeRecord.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "LeadKey");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.LeadKey.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "LeadKeyRef");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.LeadKeyRef.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "LeadRecord");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.LeadRecord.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "LeadStatus");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.LeadStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "LeadSyncStatus");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.LeadSyncStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ListKey");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ListKey.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ListKeyType");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ListKeyType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ListOperationType");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ListOperationType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "MObjectMetadata");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.MObjectMetadata.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "MObjFieldMetadata");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.MObjFieldMetadata.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ParamsDescribeMObject");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ParamsDescribeMObject.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ParamsGetCampaignsForSource");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ParamsGetCampaignsForSource.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ParamsGetLead");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ParamsGetLead.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ParamsGetLeadActivity");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ParamsGetLeadActivity.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ParamsGetLeadChanges");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ParamsGetLeadChanges.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ParamsGetMultipleLeads");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ParamsGetMultipleLeads.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ParamsListMObjects");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ParamsListMObjects.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ParamsListOperation");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ParamsListOperation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ParamsRequestCampaign");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ParamsRequestCampaign.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ParamsSyncLead");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ParamsSyncLead.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ParamsSyncMultipleLeads");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ParamsSyncMultipleLeads.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ReqCampSourceType");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ReqCampSourceType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ResultDescribeMObject");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ResultDescribeMObject.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ResultGetCampaignsForSource");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ResultGetCampaignsForSource.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ResultGetLead");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ResultGetLead.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ResultGetLeadChanges");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ResultGetLeadChanges.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ResultGetMultipleLeads");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ResultGetMultipleLeads.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ResultListMObjects");
        cachedSerQNames.add(qName);
        cls = java.lang.String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = new javax.xml.namespace.QName("", "objects");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ResultListOperation");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ResultListOperation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ResultRequestCampaign");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ResultRequestCampaign.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ResultSyncLead");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ResultSyncLead.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "ResultSyncMultipleLeads");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.ResultSyncMultipleLeads.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "StreamPosition");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.StreamPosition.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessDescribeMObject");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.SuccessDescribeMObject.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessGetCampaignsForSource");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.SuccessGetCampaignsForSource.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessGetLead");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.SuccessGetLead.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessGetLeadActivity");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.SuccessGetLeadActivity.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessGetLeadChanges");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.SuccessGetLeadChanges.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessGetMultipleLeads");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.SuccessGetMultipleLeads.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessListMObjects");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.SuccessListMObjects.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessListOperation");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.SuccessListOperation.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessRequestCampaign");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.SuccessRequestCampaign.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessSyncLead");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.SuccessSyncLead.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SuccessSyncMultipleLeads");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.SuccessSyncMultipleLeads.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://www.marketo.com/mktows/", "SyncStatus");
        cachedSerQNames.add(qName);
        cls = com.marketo.www.mktows.SyncStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            /*
             * if (super.cachedTimeout != null) { _call.setTimeout(super.cachedTimeout); }
             */
            // add an ability to set time out. feature 18073.
            _call.setTimeout(timeout);
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class) cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class) cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories
                                    .get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
                                    .get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        } catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.marketo.www.mktows.SuccessDescribeMObject describeMObject(
            com.marketo.www.mktows.ParamsDescribeMObject paramsDescribeMObject) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.marketo.com/mktows/describeMObject");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeMObject"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { paramsDescribeMObject });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.marketo.www.mktows.SuccessDescribeMObject) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.marketo.www.mktows.SuccessDescribeMObject) org.apache.axis.utils.JavaUtils.convert(_resp,
                            com.marketo.www.mktows.SuccessDescribeMObject.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.marketo.www.mktows.SuccessGetCampaignsForSource getCampaignsForSource(
            com.marketo.www.mktows.ParamsGetCampaignsForSource paramsGetCampaignsForSource) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.marketo.com/mktows/getCampaignsForSource");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getCampaignsForSource"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { paramsGetCampaignsForSource });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.marketo.www.mktows.SuccessGetCampaignsForSource) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.marketo.www.mktows.SuccessGetCampaignsForSource) org.apache.axis.utils.JavaUtils.convert(_resp,
                            com.marketo.www.mktows.SuccessGetCampaignsForSource.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.marketo.www.mktows.SuccessGetLead getLead(com.marketo.www.mktows.ParamsGetLead paramsGetLead)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();

        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.marketo.com/mktows/getLead");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLead"));

        setRequestHeaders(_call);
        setAttachments(_call);

        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { paramsGetLead });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.marketo.www.mktows.SuccessGetLead) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.marketo.www.mktows.SuccessGetLead) org.apache.axis.utils.JavaUtils.convert(_resp,
                            com.marketo.www.mktows.SuccessGetLead.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            // axisFaultException.printStackTrace();
            throw axisFaultException;
        }
    }

    @Override
    protected void setRequestHeaders(Call arg0) throws AxisFault {
        super.setRequestHeaders(arg0);
        // AuthenticationHeader
        try {
            addMarketoAuthenticatioNHeader(_call);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void addMarketoAuthenticatioNHeader(org.apache.axis.client.Call _call) throws Exception {
        // Request timestamp: a timestamp string in W3C WSDL date format

    	String requestTimestamp = formatAsW3C(Calendar.getInstance().getTime());
        // System.out.println(requestTimestamp);

        String stringToEncrypt = requestTimestamp + clientAccessID;
        String signature = Signature.hmac_sha1(stringToEncrypt, secretKey);

        QName authenticationHeaderName = new QName("", "AuthenticationHeader", "");
        SOAPHeaderElement authenticationHeader = new SOAPHeaderElement(authenticationHeaderName);

        authenticationHeader.setActor(null);
        authenticationHeader.setMustUnderstand(false);
        authenticationHeader.setEnvelope(new SOAPEnvelope());

        authenticationHeader.addAttribute(SOAPFactory.newInstance().createName("xmlns"), "http://www.marketo.com/mktows/");

        authenticationHeader.addChildElement("mktowsUserId").addTextNode(clientAccessID);
        authenticationHeader.addChildElement("requestSignature").addTextNode(signature);
        authenticationHeader.addChildElement("requestTimestamp").addTextNode(requestTimestamp);

        // System.out.println(authenticationHeader.getAsString());
        _call.addHeader(authenticationHeader);
    }
    
    public String formatAsW3C(java.util.Date dt) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        String text = df.format(dt);
        String w3cValue = text.substring(0, 22) + ":" + text.substring(22);
        return w3cValue;
    }

    public com.marketo.www.mktows.SuccessGetLeadActivity getLeadActivity(
            com.marketo.www.mktows.ParamsGetLeadActivity paramsGetLeadActivity) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.marketo.com/mktows/getLeadActivity");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLeadActivity"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { paramsGetLeadActivity });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.marketo.www.mktows.SuccessGetLeadActivity) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.marketo.www.mktows.SuccessGetLeadActivity) org.apache.axis.utils.JavaUtils.convert(_resp,
                            com.marketo.www.mktows.SuccessGetLeadActivity.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.marketo.www.mktows.SuccessGetLeadChanges getLeadChanges(
            com.marketo.www.mktows.ParamsGetLeadChanges paramsGetLeadChanges) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.marketo.com/mktows/getLeadChanges");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getLeadChanges"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { paramsGetLeadChanges });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.marketo.www.mktows.SuccessGetLeadChanges) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.marketo.www.mktows.SuccessGetLeadChanges) org.apache.axis.utils.JavaUtils.convert(_resp,
                            com.marketo.www.mktows.SuccessGetLeadChanges.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.marketo.www.mktows.SuccessGetMultipleLeads getMultipleLeads(
            com.marketo.www.mktows.ParamsGetMultipleLeads paramsGetMultipleLeads) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.marketo.com/mktows/getMultipleLeads");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getMultipleLeads"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { paramsGetMultipleLeads });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.marketo.www.mktows.SuccessGetMultipleLeads) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.marketo.www.mktows.SuccessGetMultipleLeads) org.apache.axis.utils.JavaUtils.convert(_resp,
                            com.marketo.www.mktows.SuccessGetMultipleLeads.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.marketo.www.mktows.SuccessListMObjects listMObjects(com.marketo.www.mktows.ParamsListMObjects paramsListMObjects)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.marketo.com/mktows/listMObjects");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listMObjects"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { paramsListMObjects });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.marketo.www.mktows.SuccessListMObjects) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.marketo.www.mktows.SuccessListMObjects) org.apache.axis.utils.JavaUtils.convert(_resp,
                            com.marketo.www.mktows.SuccessListMObjects.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.marketo.www.mktows.SuccessListOperation listOperation(
            com.marketo.www.mktows.ParamsListOperation paramsListOperation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.marketo.com/mktows/listOperation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "listOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { paramsListOperation });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.marketo.www.mktows.SuccessListOperation) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.marketo.www.mktows.SuccessListOperation) org.apache.axis.utils.JavaUtils.convert(_resp,
                            com.marketo.www.mktows.SuccessListOperation.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.marketo.www.mktows.SuccessRequestCampaign requestCampaign(
            com.marketo.www.mktows.ParamsRequestCampaign paramsRequestCampaign) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.marketo.com/mktows/requestCampaign");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "requestCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { paramsRequestCampaign });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.marketo.www.mktows.SuccessRequestCampaign) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.marketo.www.mktows.SuccessRequestCampaign) org.apache.axis.utils.JavaUtils.convert(_resp,
                            com.marketo.www.mktows.SuccessRequestCampaign.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.marketo.www.mktows.SuccessSyncLead syncLead(com.marketo.www.mktows.ParamsSyncLead paramsSyncLead)
            throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.marketo.com/mktows/syncLead");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "syncLead"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { paramsSyncLead });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.marketo.www.mktows.SuccessSyncLead) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.marketo.www.mktows.SuccessSyncLead) org.apache.axis.utils.JavaUtils.convert(_resp,
                            com.marketo.www.mktows.SuccessSyncLead.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public com.marketo.www.mktows.SuccessSyncMultipleLeads syncMultipleLeads(
            com.marketo.www.mktows.ParamsSyncMultipleLeads paramsSyncMultipleLeads) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.marketo.com/mktows/syncMultipleLeads");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "syncMultipleLeads"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { paramsSyncMultipleLeads });

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (com.marketo.www.mktows.SuccessSyncMultipleLeads) _resp;
                } catch (java.lang.Exception _exception) {
                    return (com.marketo.www.mktows.SuccessSyncMultipleLeads) org.apache.axis.utils.JavaUtils.convert(_resp,
                            com.marketo.www.mktows.SuccessSyncMultipleLeads.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}