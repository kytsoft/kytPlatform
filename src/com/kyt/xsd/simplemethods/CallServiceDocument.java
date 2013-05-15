/*
 * An XML document type.
 * Localname: call-service
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.CallServiceDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one call-service(@) element.
 *
 * This is a complex type.
 */
public interface CallServiceDocument extends com.kyt.xsd.simplemethods.CallOperationsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CallServiceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("callservice013fdoctype");
    
    /**
     * Gets the "call-service" element
     */
    com.kyt.xsd.simplemethods.CallServiceDocument.CallService getCallService();
    
    /**
     * Sets the "call-service" element
     */
    void setCallService(com.kyt.xsd.simplemethods.CallServiceDocument.CallService callService);
    
    /**
     * Appends and returns a new empty "call-service" element
     */
    com.kyt.xsd.simplemethods.CallServiceDocument.CallService addNewCallService();
    
    /**
     * An XML call-service(@).
     *
     * This is a complex type.
     */
    public interface CallService extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CallService.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("callservice1e2delemtype");
        
        /**
         * Gets the "error-prefix" element
         */
        com.kyt.xsd.simplemethods.ErrorPrefixDocument.ErrorPrefix getErrorPrefix();
        
        /**
         * True if has "error-prefix" element
         */
        boolean isSetErrorPrefix();
        
        /**
         * Sets the "error-prefix" element
         */
        void setErrorPrefix(com.kyt.xsd.simplemethods.ErrorPrefixDocument.ErrorPrefix errorPrefix);
        
        /**
         * Appends and returns a new empty "error-prefix" element
         */
        com.kyt.xsd.simplemethods.ErrorPrefixDocument.ErrorPrefix addNewErrorPrefix();
        
        /**
         * Unsets the "error-prefix" element
         */
        void unsetErrorPrefix();
        
        /**
         * Gets the "error-suffix" element
         */
        com.kyt.xsd.simplemethods.ErrorSuffixDocument.ErrorSuffix getErrorSuffix();
        
        /**
         * True if has "error-suffix" element
         */
        boolean isSetErrorSuffix();
        
        /**
         * Sets the "error-suffix" element
         */
        void setErrorSuffix(com.kyt.xsd.simplemethods.ErrorSuffixDocument.ErrorSuffix errorSuffix);
        
        /**
         * Appends and returns a new empty "error-suffix" element
         */
        com.kyt.xsd.simplemethods.ErrorSuffixDocument.ErrorSuffix addNewErrorSuffix();
        
        /**
         * Unsets the "error-suffix" element
         */
        void unsetErrorSuffix();
        
        /**
         * Gets the "success-prefix" element
         */
        com.kyt.xsd.simplemethods.SuccessPrefixDocument.SuccessPrefix getSuccessPrefix();
        
        /**
         * True if has "success-prefix" element
         */
        boolean isSetSuccessPrefix();
        
        /**
         * Sets the "success-prefix" element
         */
        void setSuccessPrefix(com.kyt.xsd.simplemethods.SuccessPrefixDocument.SuccessPrefix successPrefix);
        
        /**
         * Appends and returns a new empty "success-prefix" element
         */
        com.kyt.xsd.simplemethods.SuccessPrefixDocument.SuccessPrefix addNewSuccessPrefix();
        
        /**
         * Unsets the "success-prefix" element
         */
        void unsetSuccessPrefix();
        
        /**
         * Gets the "success-suffix" element
         */
        com.kyt.xsd.simplemethods.SuccessSuffixDocument.SuccessSuffix getSuccessSuffix();
        
        /**
         * True if has "success-suffix" element
         */
        boolean isSetSuccessSuffix();
        
        /**
         * Sets the "success-suffix" element
         */
        void setSuccessSuffix(com.kyt.xsd.simplemethods.SuccessSuffixDocument.SuccessSuffix successSuffix);
        
        /**
         * Appends and returns a new empty "success-suffix" element
         */
        com.kyt.xsd.simplemethods.SuccessSuffixDocument.SuccessSuffix addNewSuccessSuffix();
        
        /**
         * Unsets the "success-suffix" element
         */
        void unsetSuccessSuffix();
        
        /**
         * Gets the "message-prefix" element
         */
        com.kyt.xsd.simplemethods.MessagePrefixDocument.MessagePrefix getMessagePrefix();
        
        /**
         * True if has "message-prefix" element
         */
        boolean isSetMessagePrefix();
        
        /**
         * Sets the "message-prefix" element
         */
        void setMessagePrefix(com.kyt.xsd.simplemethods.MessagePrefixDocument.MessagePrefix messagePrefix);
        
        /**
         * Appends and returns a new empty "message-prefix" element
         */
        com.kyt.xsd.simplemethods.MessagePrefixDocument.MessagePrefix addNewMessagePrefix();
        
        /**
         * Unsets the "message-prefix" element
         */
        void unsetMessagePrefix();
        
        /**
         * Gets the "message-suffix" element
         */
        com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix getMessageSuffix();
        
        /**
         * True if has "message-suffix" element
         */
        boolean isSetMessageSuffix();
        
        /**
         * Sets the "message-suffix" element
         */
        void setMessageSuffix(com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix messageSuffix);
        
        /**
         * Appends and returns a new empty "message-suffix" element
         */
        com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix addNewMessageSuffix();
        
        /**
         * Unsets the "message-suffix" element
         */
        void unsetMessageSuffix();
        
        /**
         * Gets the "default-message" element
         */
        com.kyt.xsd.simplemethods.DefaultMessageDocument.DefaultMessage getDefaultMessage();
        
        /**
         * True if has "default-message" element
         */
        boolean isSetDefaultMessage();
        
        /**
         * Sets the "default-message" element
         */
        void setDefaultMessage(com.kyt.xsd.simplemethods.DefaultMessageDocument.DefaultMessage defaultMessage);
        
        /**
         * Appends and returns a new empty "default-message" element
         */
        com.kyt.xsd.simplemethods.DefaultMessageDocument.DefaultMessage addNewDefaultMessage();
        
        /**
         * Unsets the "default-message" element
         */
        void unsetDefaultMessage();
        
        /**
         * Gets array of all "results-to-map" elements
         */
        com.kyt.xsd.simplemethods.ResultsToMapDocument.ResultsToMap[] getResultsToMapArray();
        
        /**
         * Gets ith "results-to-map" element
         */
        com.kyt.xsd.simplemethods.ResultsToMapDocument.ResultsToMap getResultsToMapArray(int i);
        
        /**
         * Returns number of "results-to-map" element
         */
        int sizeOfResultsToMapArray();
        
        /**
         * Sets array of all "results-to-map" element
         */
        void setResultsToMapArray(com.kyt.xsd.simplemethods.ResultsToMapDocument.ResultsToMap[] resultsToMapArray);
        
        /**
         * Sets ith "results-to-map" element
         */
        void setResultsToMapArray(int i, com.kyt.xsd.simplemethods.ResultsToMapDocument.ResultsToMap resultsToMap);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "results-to-map" element
         */
        com.kyt.xsd.simplemethods.ResultsToMapDocument.ResultsToMap insertNewResultsToMap(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "results-to-map" element
         */
        com.kyt.xsd.simplemethods.ResultsToMapDocument.ResultsToMap addNewResultsToMap();
        
        /**
         * Removes the ith "results-to-map" element
         */
        void removeResultsToMap(int i);
        
        /**
         * Gets array of all "result-to-field" elements
         */
        com.kyt.xsd.simplemethods.ResultToFieldDocument.ResultToField[] getResultToFieldArray();
        
        /**
         * Gets ith "result-to-field" element
         */
        com.kyt.xsd.simplemethods.ResultToFieldDocument.ResultToField getResultToFieldArray(int i);
        
        /**
         * Returns number of "result-to-field" element
         */
        int sizeOfResultToFieldArray();
        
        /**
         * Sets array of all "result-to-field" element
         */
        void setResultToFieldArray(com.kyt.xsd.simplemethods.ResultToFieldDocument.ResultToField[] resultToFieldArray);
        
        /**
         * Sets ith "result-to-field" element
         */
        void setResultToFieldArray(int i, com.kyt.xsd.simplemethods.ResultToFieldDocument.ResultToField resultToField);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "result-to-field" element
         */
        com.kyt.xsd.simplemethods.ResultToFieldDocument.ResultToField insertNewResultToField(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "result-to-field" element
         */
        com.kyt.xsd.simplemethods.ResultToFieldDocument.ResultToField addNewResultToField();
        
        /**
         * Removes the ith "result-to-field" element
         */
        void removeResultToField(int i);
        
        /**
         * Gets array of all "result-to-request" elements
         */
        com.kyt.xsd.simplemethods.ResultToRequestDocument.ResultToRequest[] getResultToRequestArray();
        
        /**
         * Gets ith "result-to-request" element
         */
        com.kyt.xsd.simplemethods.ResultToRequestDocument.ResultToRequest getResultToRequestArray(int i);
        
        /**
         * Returns number of "result-to-request" element
         */
        int sizeOfResultToRequestArray();
        
        /**
         * Sets array of all "result-to-request" element
         */
        void setResultToRequestArray(com.kyt.xsd.simplemethods.ResultToRequestDocument.ResultToRequest[] resultToRequestArray);
        
        /**
         * Sets ith "result-to-request" element
         */
        void setResultToRequestArray(int i, com.kyt.xsd.simplemethods.ResultToRequestDocument.ResultToRequest resultToRequest);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "result-to-request" element
         */
        com.kyt.xsd.simplemethods.ResultToRequestDocument.ResultToRequest insertNewResultToRequest(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "result-to-request" element
         */
        com.kyt.xsd.simplemethods.ResultToRequestDocument.ResultToRequest addNewResultToRequest();
        
        /**
         * Removes the ith "result-to-request" element
         */
        void removeResultToRequest(int i);
        
        /**
         * Gets array of all "result-to-session" elements
         */
        com.kyt.xsd.simplemethods.ResultToSessionDocument.ResultToSession[] getResultToSessionArray();
        
        /**
         * Gets ith "result-to-session" element
         */
        com.kyt.xsd.simplemethods.ResultToSessionDocument.ResultToSession getResultToSessionArray(int i);
        
        /**
         * Returns number of "result-to-session" element
         */
        int sizeOfResultToSessionArray();
        
        /**
         * Sets array of all "result-to-session" element
         */
        void setResultToSessionArray(com.kyt.xsd.simplemethods.ResultToSessionDocument.ResultToSession[] resultToSessionArray);
        
        /**
         * Sets ith "result-to-session" element
         */
        void setResultToSessionArray(int i, com.kyt.xsd.simplemethods.ResultToSessionDocument.ResultToSession resultToSession);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "result-to-session" element
         */
        com.kyt.xsd.simplemethods.ResultToSessionDocument.ResultToSession insertNewResultToSession(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "result-to-session" element
         */
        com.kyt.xsd.simplemethods.ResultToSessionDocument.ResultToSession addNewResultToSession();
        
        /**
         * Removes the ith "result-to-session" element
         */
        void removeResultToSession(int i);
        
        /**
         * Gets array of all "result-to-result" elements
         */
        com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult[] getResultToResultArray();
        
        /**
         * Gets ith "result-to-result" element
         */
        com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult getResultToResultArray(int i);
        
        /**
         * Returns number of "result-to-result" element
         */
        int sizeOfResultToResultArray();
        
        /**
         * Sets array of all "result-to-result" element
         */
        void setResultToResultArray(com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult[] resultToResultArray);
        
        /**
         * Sets ith "result-to-result" element
         */
        void setResultToResultArray(int i, com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult resultToResult);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "result-to-result" element
         */
        com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult insertNewResultToResult(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "result-to-result" element
         */
        com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult addNewResultToResult();
        
        /**
         * Removes the ith "result-to-result" element
         */
        void removeResultToResult(int i);
        
        /**
         * Gets the "service-name" attribute
         */
        java.lang.String getServiceName();
        
        /**
         * Gets (as xml) the "service-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetServiceName();
        
        /**
         * Sets the "service-name" attribute
         */
        void setServiceName(java.lang.String serviceName);
        
        /**
         * Sets (as xml) the "service-name" attribute
         */
        void xsetServiceName(org.apache.xmlbeans.XmlString serviceName);
        
        /**
         * Gets the "in-map-name" attribute
         */
        java.lang.String getInMapName();
        
        /**
         * Gets (as xml) the "in-map-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetInMapName();
        
        /**
         * True if has "in-map-name" attribute
         */
        boolean isSetInMapName();
        
        /**
         * Sets the "in-map-name" attribute
         */
        void setInMapName(java.lang.String inMapName);
        
        /**
         * Sets (as xml) the "in-map-name" attribute
         */
        void xsetInMapName(org.apache.xmlbeans.XmlString inMapName);
        
        /**
         * Unsets the "in-map-name" attribute
         */
        void unsetInMapName();
        
        /**
         * Gets the "include-user-login" attribute
         */
        com.kyt.xsd.simplemethods.CallServiceDocument.CallService.IncludeUserLogin.Enum getIncludeUserLogin();
        
        /**
         * Gets (as xml) the "include-user-login" attribute
         */
        com.kyt.xsd.simplemethods.CallServiceDocument.CallService.IncludeUserLogin xgetIncludeUserLogin();
        
        /**
         * True if has "include-user-login" attribute
         */
        boolean isSetIncludeUserLogin();
        
        /**
         * Sets the "include-user-login" attribute
         */
        void setIncludeUserLogin(com.kyt.xsd.simplemethods.CallServiceDocument.CallService.IncludeUserLogin.Enum includeUserLogin);
        
        /**
         * Sets (as xml) the "include-user-login" attribute
         */
        void xsetIncludeUserLogin(com.kyt.xsd.simplemethods.CallServiceDocument.CallService.IncludeUserLogin includeUserLogin);
        
        /**
         * Unsets the "include-user-login" attribute
         */
        void unsetIncludeUserLogin();
        
        /**
         * Gets the "break-on-error" attribute
         */
        com.kyt.xsd.simplemethods.CallServiceDocument.CallService.BreakOnError.Enum getBreakOnError();
        
        /**
         * Gets (as xml) the "break-on-error" attribute
         */
        com.kyt.xsd.simplemethods.CallServiceDocument.CallService.BreakOnError xgetBreakOnError();
        
        /**
         * True if has "break-on-error" attribute
         */
        boolean isSetBreakOnError();
        
        /**
         * Sets the "break-on-error" attribute
         */
        void setBreakOnError(com.kyt.xsd.simplemethods.CallServiceDocument.CallService.BreakOnError.Enum breakOnError);
        
        /**
         * Sets (as xml) the "break-on-error" attribute
         */
        void xsetBreakOnError(com.kyt.xsd.simplemethods.CallServiceDocument.CallService.BreakOnError breakOnError);
        
        /**
         * Unsets the "break-on-error" attribute
         */
        void unsetBreakOnError();
        
        /**
         * Gets the "error-code" attribute
         */
        java.lang.String getErrorCode();
        
        /**
         * Gets (as xml) the "error-code" attribute
         */
        org.apache.xmlbeans.XmlString xgetErrorCode();
        
        /**
         * True if has "error-code" attribute
         */
        boolean isSetErrorCode();
        
        /**
         * Sets the "error-code" attribute
         */
        void setErrorCode(java.lang.String errorCode);
        
        /**
         * Sets (as xml) the "error-code" attribute
         */
        void xsetErrorCode(org.apache.xmlbeans.XmlString errorCode);
        
        /**
         * Unsets the "error-code" attribute
         */
        void unsetErrorCode();
        
        /**
         * Gets the "success-code" attribute
         */
        java.lang.String getSuccessCode();
        
        /**
         * Gets (as xml) the "success-code" attribute
         */
        org.apache.xmlbeans.XmlString xgetSuccessCode();
        
        /**
         * True if has "success-code" attribute
         */
        boolean isSetSuccessCode();
        
        /**
         * Sets the "success-code" attribute
         */
        void setSuccessCode(java.lang.String successCode);
        
        /**
         * Sets (as xml) the "success-code" attribute
         */
        void xsetSuccessCode(org.apache.xmlbeans.XmlString successCode);
        
        /**
         * Unsets the "success-code" attribute
         */
        void unsetSuccessCode();
        
        /**
         * Gets the "require-new-transaction" attribute
         */
        com.kyt.xsd.simplemethods.CallServiceDocument.CallService.RequireNewTransaction.Enum getRequireNewTransaction();
        
        /**
         * Gets (as xml) the "require-new-transaction" attribute
         */
        com.kyt.xsd.simplemethods.CallServiceDocument.CallService.RequireNewTransaction xgetRequireNewTransaction();
        
        /**
         * True if has "require-new-transaction" attribute
         */
        boolean isSetRequireNewTransaction();
        
        /**
         * Sets the "require-new-transaction" attribute
         */
        void setRequireNewTransaction(com.kyt.xsd.simplemethods.CallServiceDocument.CallService.RequireNewTransaction.Enum requireNewTransaction);
        
        /**
         * Sets (as xml) the "require-new-transaction" attribute
         */
        void xsetRequireNewTransaction(com.kyt.xsd.simplemethods.CallServiceDocument.CallService.RequireNewTransaction requireNewTransaction);
        
        /**
         * Unsets the "require-new-transaction" attribute
         */
        void unsetRequireNewTransaction();
        
        /**
         * Gets the "transaction-timeout" attribute
         */
        java.lang.String getTransactionTimeout();
        
        /**
         * Gets (as xml) the "transaction-timeout" attribute
         */
        org.apache.xmlbeans.XmlString xgetTransactionTimeout();
        
        /**
         * True if has "transaction-timeout" attribute
         */
        boolean isSetTransactionTimeout();
        
        /**
         * Sets the "transaction-timeout" attribute
         */
        void setTransactionTimeout(java.lang.String transactionTimeout);
        
        /**
         * Sets (as xml) the "transaction-timeout" attribute
         */
        void xsetTransactionTimeout(org.apache.xmlbeans.XmlString transactionTimeout);
        
        /**
         * Unsets the "transaction-timeout" attribute
         */
        void unsetTransactionTimeout();
        
        /**
         * An XML include-user-login(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.CallServiceDocument$CallService$IncludeUserLogin.
         */
        public interface IncludeUserLogin extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IncludeUserLogin.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("includeuserlogin9379attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.CallServiceDocument$CallService$IncludeUserLogin.
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
                public static com.kyt.xsd.simplemethods.CallServiceDocument.CallService.IncludeUserLogin newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.CallServiceDocument.CallService.IncludeUserLogin) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.CallServiceDocument.CallService.IncludeUserLogin newInstance() {
                  return (com.kyt.xsd.simplemethods.CallServiceDocument.CallService.IncludeUserLogin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.CallServiceDocument.CallService.IncludeUserLogin newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.CallServiceDocument.CallService.IncludeUserLogin) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML break-on-error(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.CallServiceDocument$CallService$BreakOnError.
         */
        public interface BreakOnError extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BreakOnError.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("breakonerrore0f5attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.CallServiceDocument$CallService$BreakOnError.
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
                public static com.kyt.xsd.simplemethods.CallServiceDocument.CallService.BreakOnError newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.CallServiceDocument.CallService.BreakOnError) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.CallServiceDocument.CallService.BreakOnError newInstance() {
                  return (com.kyt.xsd.simplemethods.CallServiceDocument.CallService.BreakOnError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.CallServiceDocument.CallService.BreakOnError newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.CallServiceDocument.CallService.BreakOnError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML require-new-transaction(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.CallServiceDocument$CallService$RequireNewTransaction.
         */
        public interface RequireNewTransaction extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequireNewTransaction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("requirenewtransaction409eattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.CallServiceDocument$CallService$RequireNewTransaction.
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
                public static com.kyt.xsd.simplemethods.CallServiceDocument.CallService.RequireNewTransaction newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.CallServiceDocument.CallService.RequireNewTransaction) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.CallServiceDocument.CallService.RequireNewTransaction newInstance() {
                  return (com.kyt.xsd.simplemethods.CallServiceDocument.CallService.RequireNewTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.CallServiceDocument.CallService.RequireNewTransaction newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.CallServiceDocument.CallService.RequireNewTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.CallServiceDocument.CallService newInstance() {
              return (com.kyt.xsd.simplemethods.CallServiceDocument.CallService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.CallServiceDocument.CallService newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.CallServiceDocument.CallService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.CallServiceDocument newInstance() {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallServiceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.CallServiceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.CallServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
