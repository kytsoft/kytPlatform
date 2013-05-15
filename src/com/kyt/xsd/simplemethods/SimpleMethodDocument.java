/*
 * An XML document type.
 * Localname: simple-method
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.SimpleMethodDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one simple-method(@) element.
 *
 * This is a complex type.
 */
public interface SimpleMethodDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SimpleMethodDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("simplemethod6183doctype");
    
    /**
     * Gets the "simple-method" element
     */
    com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod getSimpleMethod();
    
    /**
     * Sets the "simple-method" element
     */
    void setSimpleMethod(com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod simpleMethod);
    
    /**
     * Appends and returns a new empty "simple-method" element
     */
    com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod addNewSimpleMethod();
    
    /**
     * An XML simple-method(@).
     *
     * This is a complex type.
     */
    public interface SimpleMethod extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SimpleMethod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("simplemethod215belemtype");
        
        /**
         * Gets array of all "CallOperations" elements
         */
        org.apache.xmlbeans.XmlObject[] getCallOperationsArray();
        
        /**
         * Gets ith "CallOperations" element
         */
        org.apache.xmlbeans.XmlObject getCallOperationsArray(int i);
        
        /**
         * Returns number of "CallOperations" element
         */
        int sizeOfCallOperationsArray();
        
        /**
         * Sets array of all "CallOperations" element
         */
        void setCallOperationsArray(org.apache.xmlbeans.XmlObject[] callOperationsArray);
        
        /**
         * Sets ith "CallOperations" element
         */
        void setCallOperationsArray(int i, org.apache.xmlbeans.XmlObject callOperations);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CallOperations" element
         */
        org.apache.xmlbeans.XmlObject insertNewCallOperations(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CallOperations" element
         */
        org.apache.xmlbeans.XmlObject addNewCallOperations();
        
        /**
         * Removes the ith "CallOperations" element
         */
        void removeCallOperations(int i);
        
        /**
         * Gets array of all "EventOperations" elements
         */
        org.apache.xmlbeans.XmlObject[] getEventOperationsArray();
        
        /**
         * Gets ith "EventOperations" element
         */
        org.apache.xmlbeans.XmlObject getEventOperationsArray(int i);
        
        /**
         * Returns number of "EventOperations" element
         */
        int sizeOfEventOperationsArray();
        
        /**
         * Sets array of all "EventOperations" element
         */
        void setEventOperationsArray(org.apache.xmlbeans.XmlObject[] eventOperationsArray);
        
        /**
         * Sets ith "EventOperations" element
         */
        void setEventOperationsArray(int i, org.apache.xmlbeans.XmlObject eventOperations);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "EventOperations" element
         */
        org.apache.xmlbeans.XmlObject insertNewEventOperations(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "EventOperations" element
         */
        org.apache.xmlbeans.XmlObject addNewEventOperations();
        
        /**
         * Removes the ith "EventOperations" element
         */
        void removeEventOperations(int i);
        
        /**
         * Gets array of all "ServiceOperations" elements
         */
        org.apache.xmlbeans.XmlObject[] getServiceOperationsArray();
        
        /**
         * Gets ith "ServiceOperations" element
         */
        org.apache.xmlbeans.XmlObject getServiceOperationsArray(int i);
        
        /**
         * Returns number of "ServiceOperations" element
         */
        int sizeOfServiceOperationsArray();
        
        /**
         * Sets array of all "ServiceOperations" element
         */
        void setServiceOperationsArray(org.apache.xmlbeans.XmlObject[] serviceOperationsArray);
        
        /**
         * Sets ith "ServiceOperations" element
         */
        void setServiceOperationsArray(int i, org.apache.xmlbeans.XmlObject serviceOperations);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ServiceOperations" element
         */
        org.apache.xmlbeans.XmlObject insertNewServiceOperations(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ServiceOperations" element
         */
        org.apache.xmlbeans.XmlObject addNewServiceOperations();
        
        /**
         * Removes the ith "ServiceOperations" element
         */
        void removeServiceOperations(int i);
        
        /**
         * Gets array of all "EnvOperations" elements
         */
        org.apache.xmlbeans.XmlObject[] getEnvOperationsArray();
        
        /**
         * Gets ith "EnvOperations" element
         */
        org.apache.xmlbeans.XmlObject getEnvOperationsArray(int i);
        
        /**
         * Returns number of "EnvOperations" element
         */
        int sizeOfEnvOperationsArray();
        
        /**
         * Sets array of all "EnvOperations" element
         */
        void setEnvOperationsArray(org.apache.xmlbeans.XmlObject[] envOperationsArray);
        
        /**
         * Sets ith "EnvOperations" element
         */
        void setEnvOperationsArray(int i, org.apache.xmlbeans.XmlObject envOperations);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "EnvOperations" element
         */
        org.apache.xmlbeans.XmlObject insertNewEnvOperations(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "EnvOperations" element
         */
        org.apache.xmlbeans.XmlObject addNewEnvOperations();
        
        /**
         * Removes the ith "EnvOperations" element
         */
        void removeEnvOperations(int i);
        
        /**
         * Gets array of all "EntityMiscOperations" elements
         */
        org.apache.xmlbeans.XmlObject[] getEntityMiscOperationsArray();
        
        /**
         * Gets ith "EntityMiscOperations" element
         */
        org.apache.xmlbeans.XmlObject getEntityMiscOperationsArray(int i);
        
        /**
         * Returns number of "EntityMiscOperations" element
         */
        int sizeOfEntityMiscOperationsArray();
        
        /**
         * Sets array of all "EntityMiscOperations" element
         */
        void setEntityMiscOperationsArray(org.apache.xmlbeans.XmlObject[] entityMiscOperationsArray);
        
        /**
         * Sets ith "EntityMiscOperations" element
         */
        void setEntityMiscOperationsArray(int i, org.apache.xmlbeans.XmlObject entityMiscOperations);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "EntityMiscOperations" element
         */
        org.apache.xmlbeans.XmlObject insertNewEntityMiscOperations(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "EntityMiscOperations" element
         */
        org.apache.xmlbeans.XmlObject addNewEntityMiscOperations();
        
        /**
         * Removes the ith "EntityMiscOperations" element
         */
        void removeEntityMiscOperations(int i);
        
        /**
         * Gets array of all "EntityFindOperations" elements
         */
        org.apache.xmlbeans.XmlObject[] getEntityFindOperationsArray();
        
        /**
         * Gets ith "EntityFindOperations" element
         */
        org.apache.xmlbeans.XmlObject getEntityFindOperationsArray(int i);
        
        /**
         * Returns number of "EntityFindOperations" element
         */
        int sizeOfEntityFindOperationsArray();
        
        /**
         * Sets array of all "EntityFindOperations" element
         */
        void setEntityFindOperationsArray(org.apache.xmlbeans.XmlObject[] entityFindOperationsArray);
        
        /**
         * Sets ith "EntityFindOperations" element
         */
        void setEntityFindOperationsArray(int i, org.apache.xmlbeans.XmlObject entityFindOperations);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "EntityFindOperations" element
         */
        org.apache.xmlbeans.XmlObject insertNewEntityFindOperations(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "EntityFindOperations" element
         */
        org.apache.xmlbeans.XmlObject addNewEntityFindOperations();
        
        /**
         * Removes the ith "EntityFindOperations" element
         */
        void removeEntityFindOperations(int i);
        
        /**
         * Gets array of all "EntityValueOperations" elements
         */
        org.apache.xmlbeans.XmlObject[] getEntityValueOperationsArray();
        
        /**
         * Gets ith "EntityValueOperations" element
         */
        org.apache.xmlbeans.XmlObject getEntityValueOperationsArray(int i);
        
        /**
         * Returns number of "EntityValueOperations" element
         */
        int sizeOfEntityValueOperationsArray();
        
        /**
         * Sets array of all "EntityValueOperations" element
         */
        void setEntityValueOperationsArray(org.apache.xmlbeans.XmlObject[] entityValueOperationsArray);
        
        /**
         * Sets ith "EntityValueOperations" element
         */
        void setEntityValueOperationsArray(int i, org.apache.xmlbeans.XmlObject entityValueOperations);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "EntityValueOperations" element
         */
        org.apache.xmlbeans.XmlObject insertNewEntityValueOperations(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "EntityValueOperations" element
         */
        org.apache.xmlbeans.XmlObject addNewEntityValueOperations();
        
        /**
         * Removes the ith "EntityValueOperations" element
         */
        void removeEntityValueOperations(int i);
        
        /**
         * Gets array of all "EntityListOperations" elements
         */
        org.apache.xmlbeans.XmlObject[] getEntityListOperationsArray();
        
        /**
         * Gets ith "EntityListOperations" element
         */
        org.apache.xmlbeans.XmlObject getEntityListOperationsArray(int i);
        
        /**
         * Returns number of "EntityListOperations" element
         */
        int sizeOfEntityListOperationsArray();
        
        /**
         * Sets array of all "EntityListOperations" element
         */
        void setEntityListOperationsArray(org.apache.xmlbeans.XmlObject[] entityListOperationsArray);
        
        /**
         * Sets ith "EntityListOperations" element
         */
        void setEntityListOperationsArray(int i, org.apache.xmlbeans.XmlObject entityListOperations);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "EntityListOperations" element
         */
        org.apache.xmlbeans.XmlObject insertNewEntityListOperations(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "EntityListOperations" element
         */
        org.apache.xmlbeans.XmlObject addNewEntityListOperations();
        
        /**
         * Removes the ith "EntityListOperations" element
         */
        void removeEntityListOperations(int i);
        
        /**
         * Gets array of all "EntityTxOperations" elements
         */
        org.apache.xmlbeans.XmlObject[] getEntityTxOperationsArray();
        
        /**
         * Gets ith "EntityTxOperations" element
         */
        org.apache.xmlbeans.XmlObject getEntityTxOperationsArray(int i);
        
        /**
         * Returns number of "EntityTxOperations" element
         */
        int sizeOfEntityTxOperationsArray();
        
        /**
         * Sets array of all "EntityTxOperations" element
         */
        void setEntityTxOperationsArray(org.apache.xmlbeans.XmlObject[] entityTxOperationsArray);
        
        /**
         * Sets ith "EntityTxOperations" element
         */
        void setEntityTxOperationsArray(int i, org.apache.xmlbeans.XmlObject entityTxOperations);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "EntityTxOperations" element
         */
        org.apache.xmlbeans.XmlObject insertNewEntityTxOperations(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "EntityTxOperations" element
         */
        org.apache.xmlbeans.XmlObject addNewEntityTxOperations();
        
        /**
         * Removes the ith "EntityTxOperations" element
         */
        void removeEntityTxOperations(int i);
        
        /**
         * Gets array of all "ControlOperations" elements
         */
        org.apache.xmlbeans.XmlObject[] getControlOperationsArray();
        
        /**
         * Gets ith "ControlOperations" element
         */
        org.apache.xmlbeans.XmlObject getControlOperationsArray(int i);
        
        /**
         * Returns number of "ControlOperations" element
         */
        int sizeOfControlOperationsArray();
        
        /**
         * Sets array of all "ControlOperations" element
         */
        void setControlOperationsArray(org.apache.xmlbeans.XmlObject[] controlOperationsArray);
        
        /**
         * Sets ith "ControlOperations" element
         */
        void setControlOperationsArray(int i, org.apache.xmlbeans.XmlObject controlOperations);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ControlOperations" element
         */
        org.apache.xmlbeans.XmlObject insertNewControlOperations(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ControlOperations" element
         */
        org.apache.xmlbeans.XmlObject addNewControlOperations();
        
        /**
         * Removes the ith "ControlOperations" element
         */
        void removeControlOperations(int i);
        
        /**
         * Gets array of all "IfBasicOperations" elements
         */
        org.apache.xmlbeans.XmlObject[] getIfBasicOperationsArray();
        
        /**
         * Gets ith "IfBasicOperations" element
         */
        org.apache.xmlbeans.XmlObject getIfBasicOperationsArray(int i);
        
        /**
         * Returns number of "IfBasicOperations" element
         */
        int sizeOfIfBasicOperationsArray();
        
        /**
         * Sets array of all "IfBasicOperations" element
         */
        void setIfBasicOperationsArray(org.apache.xmlbeans.XmlObject[] ifBasicOperationsArray);
        
        /**
         * Sets ith "IfBasicOperations" element
         */
        void setIfBasicOperationsArray(int i, org.apache.xmlbeans.XmlObject ifBasicOperations);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IfBasicOperations" element
         */
        org.apache.xmlbeans.XmlObject insertNewIfBasicOperations(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IfBasicOperations" element
         */
        org.apache.xmlbeans.XmlObject addNewIfBasicOperations();
        
        /**
         * Removes the ith "IfBasicOperations" element
         */
        void removeIfBasicOperations(int i);
        
        /**
         * Gets array of all "IfOtherOperations" elements
         */
        org.apache.xmlbeans.XmlObject[] getIfOtherOperationsArray();
        
        /**
         * Gets ith "IfOtherOperations" element
         */
        org.apache.xmlbeans.XmlObject getIfOtherOperationsArray(int i);
        
        /**
         * Returns number of "IfOtherOperations" element
         */
        int sizeOfIfOtherOperationsArray();
        
        /**
         * Sets array of all "IfOtherOperations" element
         */
        void setIfOtherOperationsArray(org.apache.xmlbeans.XmlObject[] ifOtherOperationsArray);
        
        /**
         * Sets ith "IfOtherOperations" element
         */
        void setIfOtherOperationsArray(int i, org.apache.xmlbeans.XmlObject ifOtherOperations);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IfOtherOperations" element
         */
        org.apache.xmlbeans.XmlObject insertNewIfOtherOperations(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IfOtherOperations" element
         */
        org.apache.xmlbeans.XmlObject addNewIfOtherOperations();
        
        /**
         * Removes the ith "IfOtherOperations" element
         */
        void removeIfOtherOperations(int i);
        
        /**
         * Gets array of all "OtherOperations" elements
         */
        org.apache.xmlbeans.XmlObject[] getOtherOperationsArray();
        
        /**
         * Gets ith "OtherOperations" element
         */
        org.apache.xmlbeans.XmlObject getOtherOperationsArray(int i);
        
        /**
         * Returns number of "OtherOperations" element
         */
        int sizeOfOtherOperationsArray();
        
        /**
         * Sets array of all "OtherOperations" element
         */
        void setOtherOperationsArray(org.apache.xmlbeans.XmlObject[] otherOperationsArray);
        
        /**
         * Sets ith "OtherOperations" element
         */
        void setOtherOperationsArray(int i, org.apache.xmlbeans.XmlObject otherOperations);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "OtherOperations" element
         */
        org.apache.xmlbeans.XmlObject insertNewOtherOperations(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "OtherOperations" element
         */
        org.apache.xmlbeans.XmlObject addNewOtherOperations();
        
        /**
         * Removes the ith "OtherOperations" element
         */
        void removeOtherOperations(int i);
        
        /**
         * Gets the "method-name" attribute
         */
        java.lang.String getMethodName();
        
        /**
         * Gets (as xml) the "method-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetMethodName();
        
        /**
         * Sets the "method-name" attribute
         */
        void setMethodName(java.lang.String methodName);
        
        /**
         * Sets (as xml) the "method-name" attribute
         */
        void xsetMethodName(org.apache.xmlbeans.XmlString methodName);
        
        /**
         * Gets the "short-description" attribute
         */
        java.lang.String getShortDescription();
        
        /**
         * Gets (as xml) the "short-description" attribute
         */
        org.apache.xmlbeans.XmlString xgetShortDescription();
        
        /**
         * Sets the "short-description" attribute
         */
        void setShortDescription(java.lang.String shortDescription);
        
        /**
         * Sets (as xml) the "short-description" attribute
         */
        void xsetShortDescription(org.apache.xmlbeans.XmlString shortDescription);
        
        /**
         * Gets the "login-required" attribute
         */
        com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.LoginRequired.Enum getLoginRequired();
        
        /**
         * Gets (as xml) the "login-required" attribute
         */
        com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.LoginRequired xgetLoginRequired();
        
        /**
         * True if has "login-required" attribute
         */
        boolean isSetLoginRequired();
        
        /**
         * Sets the "login-required" attribute
         */
        void setLoginRequired(com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.LoginRequired.Enum loginRequired);
        
        /**
         * Sets (as xml) the "login-required" attribute
         */
        void xsetLoginRequired(com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.LoginRequired loginRequired);
        
        /**
         * Unsets the "login-required" attribute
         */
        void unsetLoginRequired();
        
        /**
         * Gets the "use-transaction" attribute
         */
        com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.UseTransaction.Enum getUseTransaction();
        
        /**
         * Gets (as xml) the "use-transaction" attribute
         */
        com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.UseTransaction xgetUseTransaction();
        
        /**
         * True if has "use-transaction" attribute
         */
        boolean isSetUseTransaction();
        
        /**
         * Sets the "use-transaction" attribute
         */
        void setUseTransaction(com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.UseTransaction.Enum useTransaction);
        
        /**
         * Sets (as xml) the "use-transaction" attribute
         */
        void xsetUseTransaction(com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.UseTransaction useTransaction);
        
        /**
         * Unsets the "use-transaction" attribute
         */
        void unsetUseTransaction();
        
        /**
         * Gets the "default-error-code" attribute
         */
        java.lang.String getDefaultErrorCode();
        
        /**
         * Gets (as xml) the "default-error-code" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultErrorCode();
        
        /**
         * True if has "default-error-code" attribute
         */
        boolean isSetDefaultErrorCode();
        
        /**
         * Sets the "default-error-code" attribute
         */
        void setDefaultErrorCode(java.lang.String defaultErrorCode);
        
        /**
         * Sets (as xml) the "default-error-code" attribute
         */
        void xsetDefaultErrorCode(org.apache.xmlbeans.XmlString defaultErrorCode);
        
        /**
         * Unsets the "default-error-code" attribute
         */
        void unsetDefaultErrorCode();
        
        /**
         * Gets the "default-success-code" attribute
         */
        java.lang.String getDefaultSuccessCode();
        
        /**
         * Gets (as xml) the "default-success-code" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultSuccessCode();
        
        /**
         * True if has "default-success-code" attribute
         */
        boolean isSetDefaultSuccessCode();
        
        /**
         * Sets the "default-success-code" attribute
         */
        void setDefaultSuccessCode(java.lang.String defaultSuccessCode);
        
        /**
         * Sets (as xml) the "default-success-code" attribute
         */
        void xsetDefaultSuccessCode(org.apache.xmlbeans.XmlString defaultSuccessCode);
        
        /**
         * Unsets the "default-success-code" attribute
         */
        void unsetDefaultSuccessCode();
        
        /**
         * Gets the "parameter-map-name" attribute
         */
        java.lang.String getParameterMapName();
        
        /**
         * Gets (as xml) the "parameter-map-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetParameterMapName();
        
        /**
         * True if has "parameter-map-name" attribute
         */
        boolean isSetParameterMapName();
        
        /**
         * Sets the "parameter-map-name" attribute
         */
        void setParameterMapName(java.lang.String parameterMapName);
        
        /**
         * Sets (as xml) the "parameter-map-name" attribute
         */
        void xsetParameterMapName(org.apache.xmlbeans.XmlString parameterMapName);
        
        /**
         * Unsets the "parameter-map-name" attribute
         */
        void unsetParameterMapName();
        
        /**
         * Gets the "event-request-object-name" attribute
         */
        java.lang.String getEventRequestObjectName();
        
        /**
         * Gets (as xml) the "event-request-object-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEventRequestObjectName();
        
        /**
         * True if has "event-request-object-name" attribute
         */
        boolean isSetEventRequestObjectName();
        
        /**
         * Sets the "event-request-object-name" attribute
         */
        void setEventRequestObjectName(java.lang.String eventRequestObjectName);
        
        /**
         * Sets (as xml) the "event-request-object-name" attribute
         */
        void xsetEventRequestObjectName(org.apache.xmlbeans.XmlString eventRequestObjectName);
        
        /**
         * Unsets the "event-request-object-name" attribute
         */
        void unsetEventRequestObjectName();
        
        /**
         * Gets the "event-response-object-name" attribute
         */
        java.lang.String getEventResponseObjectName();
        
        /**
         * Gets (as xml) the "event-response-object-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEventResponseObjectName();
        
        /**
         * True if has "event-response-object-name" attribute
         */
        boolean isSetEventResponseObjectName();
        
        /**
         * Sets the "event-response-object-name" attribute
         */
        void setEventResponseObjectName(java.lang.String eventResponseObjectName);
        
        /**
         * Sets (as xml) the "event-response-object-name" attribute
         */
        void xsetEventResponseObjectName(org.apache.xmlbeans.XmlString eventResponseObjectName);
        
        /**
         * Unsets the "event-response-object-name" attribute
         */
        void unsetEventResponseObjectName();
        
        /**
         * Gets the "event-response-code-name" attribute
         */
        java.lang.String getEventResponseCodeName();
        
        /**
         * Gets (as xml) the "event-response-code-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEventResponseCodeName();
        
        /**
         * True if has "event-response-code-name" attribute
         */
        boolean isSetEventResponseCodeName();
        
        /**
         * Sets the "event-response-code-name" attribute
         */
        void setEventResponseCodeName(java.lang.String eventResponseCodeName);
        
        /**
         * Sets (as xml) the "event-response-code-name" attribute
         */
        void xsetEventResponseCodeName(org.apache.xmlbeans.XmlString eventResponseCodeName);
        
        /**
         * Unsets the "event-response-code-name" attribute
         */
        void unsetEventResponseCodeName();
        
        /**
         * Gets the "event-error-message-name" attribute
         */
        java.lang.String getEventErrorMessageName();
        
        /**
         * Gets (as xml) the "event-error-message-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEventErrorMessageName();
        
        /**
         * True if has "event-error-message-name" attribute
         */
        boolean isSetEventErrorMessageName();
        
        /**
         * Sets the "event-error-message-name" attribute
         */
        void setEventErrorMessageName(java.lang.String eventErrorMessageName);
        
        /**
         * Sets (as xml) the "event-error-message-name" attribute
         */
        void xsetEventErrorMessageName(org.apache.xmlbeans.XmlString eventErrorMessageName);
        
        /**
         * Unsets the "event-error-message-name" attribute
         */
        void unsetEventErrorMessageName();
        
        /**
         * Gets the "event-event-message-name" attribute
         */
        java.lang.String getEventEventMessageName();
        
        /**
         * Gets (as xml) the "event-event-message-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEventEventMessageName();
        
        /**
         * True if has "event-event-message-name" attribute
         */
        boolean isSetEventEventMessageName();
        
        /**
         * Sets the "event-event-message-name" attribute
         */
        void setEventEventMessageName(java.lang.String eventEventMessageName);
        
        /**
         * Sets (as xml) the "event-event-message-name" attribute
         */
        void xsetEventEventMessageName(org.apache.xmlbeans.XmlString eventEventMessageName);
        
        /**
         * Unsets the "event-event-message-name" attribute
         */
        void unsetEventEventMessageName();
        
        /**
         * Gets the "service-response-message-name" attribute
         */
        java.lang.String getServiceResponseMessageName();
        
        /**
         * Gets (as xml) the "service-response-message-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetServiceResponseMessageName();
        
        /**
         * True if has "service-response-message-name" attribute
         */
        boolean isSetServiceResponseMessageName();
        
        /**
         * Sets the "service-response-message-name" attribute
         */
        void setServiceResponseMessageName(java.lang.String serviceResponseMessageName);
        
        /**
         * Sets (as xml) the "service-response-message-name" attribute
         */
        void xsetServiceResponseMessageName(org.apache.xmlbeans.XmlString serviceResponseMessageName);
        
        /**
         * Unsets the "service-response-message-name" attribute
         */
        void unsetServiceResponseMessageName();
        
        /**
         * Gets the "service-error-message-name" attribute
         */
        java.lang.String getServiceErrorMessageName();
        
        /**
         * Gets (as xml) the "service-error-message-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetServiceErrorMessageName();
        
        /**
         * True if has "service-error-message-name" attribute
         */
        boolean isSetServiceErrorMessageName();
        
        /**
         * Sets the "service-error-message-name" attribute
         */
        void setServiceErrorMessageName(java.lang.String serviceErrorMessageName);
        
        /**
         * Sets (as xml) the "service-error-message-name" attribute
         */
        void xsetServiceErrorMessageName(org.apache.xmlbeans.XmlString serviceErrorMessageName);
        
        /**
         * Unsets the "service-error-message-name" attribute
         */
        void unsetServiceErrorMessageName();
        
        /**
         * Gets the "service-error-message-list-name" attribute
         */
        java.lang.String getServiceErrorMessageListName();
        
        /**
         * Gets (as xml) the "service-error-message-list-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetServiceErrorMessageListName();
        
        /**
         * True if has "service-error-message-list-name" attribute
         */
        boolean isSetServiceErrorMessageListName();
        
        /**
         * Sets the "service-error-message-list-name" attribute
         */
        void setServiceErrorMessageListName(java.lang.String serviceErrorMessageListName);
        
        /**
         * Sets (as xml) the "service-error-message-list-name" attribute
         */
        void xsetServiceErrorMessageListName(org.apache.xmlbeans.XmlString serviceErrorMessageListName);
        
        /**
         * Unsets the "service-error-message-list-name" attribute
         */
        void unsetServiceErrorMessageListName();
        
        /**
         * Gets the "service-error-message-map-name" attribute
         */
        java.lang.String getServiceErrorMessageMapName();
        
        /**
         * Gets (as xml) the "service-error-message-map-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetServiceErrorMessageMapName();
        
        /**
         * True if has "service-error-message-map-name" attribute
         */
        boolean isSetServiceErrorMessageMapName();
        
        /**
         * Sets the "service-error-message-map-name" attribute
         */
        void setServiceErrorMessageMapName(java.lang.String serviceErrorMessageMapName);
        
        /**
         * Sets (as xml) the "service-error-message-map-name" attribute
         */
        void xsetServiceErrorMessageMapName(org.apache.xmlbeans.XmlString serviceErrorMessageMapName);
        
        /**
         * Unsets the "service-error-message-map-name" attribute
         */
        void unsetServiceErrorMessageMapName();
        
        /**
         * Gets the "service-success-message-name" attribute
         */
        java.lang.String getServiceSuccessMessageName();
        
        /**
         * Gets (as xml) the "service-success-message-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetServiceSuccessMessageName();
        
        /**
         * True if has "service-success-message-name" attribute
         */
        boolean isSetServiceSuccessMessageName();
        
        /**
         * Sets the "service-success-message-name" attribute
         */
        void setServiceSuccessMessageName(java.lang.String serviceSuccessMessageName);
        
        /**
         * Sets (as xml) the "service-success-message-name" attribute
         */
        void xsetServiceSuccessMessageName(org.apache.xmlbeans.XmlString serviceSuccessMessageName);
        
        /**
         * Unsets the "service-success-message-name" attribute
         */
        void unsetServiceSuccessMessageName();
        
        /**
         * Gets the "service-success-message-list-name" attribute
         */
        java.lang.String getServiceSuccessMessageListName();
        
        /**
         * Gets (as xml) the "service-success-message-list-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetServiceSuccessMessageListName();
        
        /**
         * True if has "service-success-message-list-name" attribute
         */
        boolean isSetServiceSuccessMessageListName();
        
        /**
         * Sets the "service-success-message-list-name" attribute
         */
        void setServiceSuccessMessageListName(java.lang.String serviceSuccessMessageListName);
        
        /**
         * Sets (as xml) the "service-success-message-list-name" attribute
         */
        void xsetServiceSuccessMessageListName(org.apache.xmlbeans.XmlString serviceSuccessMessageListName);
        
        /**
         * Unsets the "service-success-message-list-name" attribute
         */
        void unsetServiceSuccessMessageListName();
        
        /**
         * Gets the "locale-name" attribute
         */
        java.lang.String getLocaleName();
        
        /**
         * Gets (as xml) the "locale-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetLocaleName();
        
        /**
         * True if has "locale-name" attribute
         */
        boolean isSetLocaleName();
        
        /**
         * Sets the "locale-name" attribute
         */
        void setLocaleName(java.lang.String localeName);
        
        /**
         * Sets (as xml) the "locale-name" attribute
         */
        void xsetLocaleName(org.apache.xmlbeans.XmlString localeName);
        
        /**
         * Unsets the "locale-name" attribute
         */
        void unsetLocaleName();
        
        /**
         * Gets the "delegator-name" attribute
         */
        java.lang.String getDelegatorName();
        
        /**
         * Gets (as xml) the "delegator-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetDelegatorName();
        
        /**
         * True if has "delegator-name" attribute
         */
        boolean isSetDelegatorName();
        
        /**
         * Sets the "delegator-name" attribute
         */
        void setDelegatorName(java.lang.String delegatorName);
        
        /**
         * Sets (as xml) the "delegator-name" attribute
         */
        void xsetDelegatorName(org.apache.xmlbeans.XmlString delegatorName);
        
        /**
         * Unsets the "delegator-name" attribute
         */
        void unsetDelegatorName();
        
        /**
         * Gets the "security-name" attribute
         */
        java.lang.String getSecurityName();
        
        /**
         * Gets (as xml) the "security-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetSecurityName();
        
        /**
         * True if has "security-name" attribute
         */
        boolean isSetSecurityName();
        
        /**
         * Sets the "security-name" attribute
         */
        void setSecurityName(java.lang.String securityName);
        
        /**
         * Sets (as xml) the "security-name" attribute
         */
        void xsetSecurityName(org.apache.xmlbeans.XmlString securityName);
        
        /**
         * Unsets the "security-name" attribute
         */
        void unsetSecurityName();
        
        /**
         * Gets the "dispatcher-name" attribute
         */
        java.lang.String getDispatcherName();
        
        /**
         * Gets (as xml) the "dispatcher-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetDispatcherName();
        
        /**
         * True if has "dispatcher-name" attribute
         */
        boolean isSetDispatcherName();
        
        /**
         * Sets the "dispatcher-name" attribute
         */
        void setDispatcherName(java.lang.String dispatcherName);
        
        /**
         * Sets (as xml) the "dispatcher-name" attribute
         */
        void xsetDispatcherName(org.apache.xmlbeans.XmlString dispatcherName);
        
        /**
         * Unsets the "dispatcher-name" attribute
         */
        void unsetDispatcherName();
        
        /**
         * Gets the "user-login-name" attribute
         */
        java.lang.String getUserLoginName();
        
        /**
         * Gets (as xml) the "user-login-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetUserLoginName();
        
        /**
         * True if has "user-login-name" attribute
         */
        boolean isSetUserLoginName();
        
        /**
         * Sets the "user-login-name" attribute
         */
        void setUserLoginName(java.lang.String userLoginName);
        
        /**
         * Sets (as xml) the "user-login-name" attribute
         */
        void xsetUserLoginName(org.apache.xmlbeans.XmlString userLoginName);
        
        /**
         * Unsets the "user-login-name" attribute
         */
        void unsetUserLoginName();
        
        /**
         * An XML login-required(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.SimpleMethodDocument$SimpleMethod$LoginRequired.
         */
        public interface LoginRequired extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoginRequired.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("loginrequired81feattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.SimpleMethodDocument$SimpleMethod$LoginRequired.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TRUE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_TRUE = 1;
                static final int INT_FALSE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.LoginRequired newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.LoginRequired) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.LoginRequired newInstance() {
                  return (com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.LoginRequired) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.LoginRequired newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.LoginRequired) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML use-transaction(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.SimpleMethodDocument$SimpleMethod$UseTransaction.
         */
        public interface UseTransaction extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UseTransaction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("usetransactionf55battrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.SimpleMethodDocument$SimpleMethod$UseTransaction.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TRUE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_TRUE = 1;
                static final int INT_FALSE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.UseTransaction newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.UseTransaction) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.UseTransaction newInstance() {
                  return (com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.UseTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.UseTransaction newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod.UseTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod newInstance() {
              return (com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument newInstance() {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.SimpleMethodDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.SimpleMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
