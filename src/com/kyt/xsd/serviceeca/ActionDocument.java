/*
 * An XML document type.
 * Localname: action
 * Namespace: 
 * Java type: com.kyt.xsd.serviceeca.ActionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceeca;


/**
 * A document containing one action(@) element.
 *
 * This is a complex type.
 */
public interface ActionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("action87efdoctype");
    
    /**
     * Gets the "action" element
     */
    com.kyt.xsd.serviceeca.ActionDocument.Action getAction();
    
    /**
     * Sets the "action" element
     */
    void setAction(com.kyt.xsd.serviceeca.ActionDocument.Action action);
    
    /**
     * Appends and returns a new empty "action" element
     */
    com.kyt.xsd.serviceeca.ActionDocument.Action addNewAction();
    
    /**
     * An XML action(@).
     *
     * This is a complex type.
     */
    public interface Action extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Action.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("actionff6delemtype");
        
        /**
         * Gets the "service" attribute
         */
        java.lang.String getService();
        
        /**
         * Gets (as xml) the "service" attribute
         */
        org.apache.xmlbeans.XmlString xgetService();
        
        /**
         * Sets the "service" attribute
         */
        void setService(java.lang.String service);
        
        /**
         * Sets (as xml) the "service" attribute
         */
        void xsetService(org.apache.xmlbeans.XmlString service);
        
        /**
         * Gets the "mode" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.Mode.Enum getMode();
        
        /**
         * Gets (as xml) the "mode" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.Mode xgetMode();
        
        /**
         * Sets the "mode" attribute
         */
        void setMode(com.kyt.xsd.serviceeca.ActionDocument.Action.Mode.Enum mode);
        
        /**
         * Sets (as xml) the "mode" attribute
         */
        void xsetMode(com.kyt.xsd.serviceeca.ActionDocument.Action.Mode mode);
        
        /**
         * Gets the "run-as-user" attribute
         */
        java.lang.String getRunAsUser();
        
        /**
         * Gets (as xml) the "run-as-user" attribute
         */
        org.apache.xmlbeans.XmlString xgetRunAsUser();
        
        /**
         * True if has "run-as-user" attribute
         */
        boolean isSetRunAsUser();
        
        /**
         * Sets the "run-as-user" attribute
         */
        void setRunAsUser(java.lang.String runAsUser);
        
        /**
         * Sets (as xml) the "run-as-user" attribute
         */
        void xsetRunAsUser(org.apache.xmlbeans.XmlString runAsUser);
        
        /**
         * Unsets the "run-as-user" attribute
         */
        void unsetRunAsUser();
        
        /**
         * Gets the "result-map-name" attribute
         */
        java.lang.String getResultMapName();
        
        /**
         * Gets (as xml) the "result-map-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetResultMapName();
        
        /**
         * True if has "result-map-name" attribute
         */
        boolean isSetResultMapName();
        
        /**
         * Sets the "result-map-name" attribute
         */
        void setResultMapName(java.lang.String resultMapName);
        
        /**
         * Sets (as xml) the "result-map-name" attribute
         */
        void xsetResultMapName(org.apache.xmlbeans.XmlString resultMapName);
        
        /**
         * Unsets the "result-map-name" attribute
         */
        void unsetResultMapName();
        
        /**
         * Gets the "new-transaction" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.NewTransaction.Enum getNewTransaction();
        
        /**
         * Gets (as xml) the "new-transaction" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.NewTransaction xgetNewTransaction();
        
        /**
         * True if has "new-transaction" attribute
         */
        boolean isSetNewTransaction();
        
        /**
         * Sets the "new-transaction" attribute
         */
        void setNewTransaction(com.kyt.xsd.serviceeca.ActionDocument.Action.NewTransaction.Enum newTransaction);
        
        /**
         * Sets (as xml) the "new-transaction" attribute
         */
        void xsetNewTransaction(com.kyt.xsd.serviceeca.ActionDocument.Action.NewTransaction newTransaction);
        
        /**
         * Unsets the "new-transaction" attribute
         */
        void unsetNewTransaction();
        
        /**
         * Gets the "result-to-context" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToContext.Enum getResultToContext();
        
        /**
         * Gets (as xml) the "result-to-context" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToContext xgetResultToContext();
        
        /**
         * True if has "result-to-context" attribute
         */
        boolean isSetResultToContext();
        
        /**
         * Sets the "result-to-context" attribute
         */
        void setResultToContext(com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToContext.Enum resultToContext);
        
        /**
         * Sets (as xml) the "result-to-context" attribute
         */
        void xsetResultToContext(com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToContext resultToContext);
        
        /**
         * Unsets the "result-to-context" attribute
         */
        void unsetResultToContext();
        
        /**
         * Gets the "result-to-result" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToResult.Enum getResultToResult();
        
        /**
         * Gets (as xml) the "result-to-result" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToResult xgetResultToResult();
        
        /**
         * True if has "result-to-result" attribute
         */
        boolean isSetResultToResult();
        
        /**
         * Sets the "result-to-result" attribute
         */
        void setResultToResult(com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToResult.Enum resultToResult);
        
        /**
         * Sets (as xml) the "result-to-result" attribute
         */
        void xsetResultToResult(com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToResult resultToResult);
        
        /**
         * Unsets the "result-to-result" attribute
         */
        void unsetResultToResult();
        
        /**
         * Gets the "ignore-failure" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreFailure.Enum getIgnoreFailure();
        
        /**
         * Gets (as xml) the "ignore-failure" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreFailure xgetIgnoreFailure();
        
        /**
         * True if has "ignore-failure" attribute
         */
        boolean isSetIgnoreFailure();
        
        /**
         * Sets the "ignore-failure" attribute
         */
        void setIgnoreFailure(com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreFailure.Enum ignoreFailure);
        
        /**
         * Sets (as xml) the "ignore-failure" attribute
         */
        void xsetIgnoreFailure(com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreFailure ignoreFailure);
        
        /**
         * Unsets the "ignore-failure" attribute
         */
        void unsetIgnoreFailure();
        
        /**
         * Gets the "ignore-error" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreError.Enum getIgnoreError();
        
        /**
         * Gets (as xml) the "ignore-error" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreError xgetIgnoreError();
        
        /**
         * True if has "ignore-error" attribute
         */
        boolean isSetIgnoreError();
        
        /**
         * Sets the "ignore-error" attribute
         */
        void setIgnoreError(com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreError.Enum ignoreError);
        
        /**
         * Sets (as xml) the "ignore-error" attribute
         */
        void xsetIgnoreError(com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreError ignoreError);
        
        /**
         * Unsets the "ignore-error" attribute
         */
        void unsetIgnoreError();
        
        /**
         * Gets the "persist" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.Persist.Enum getPersist();
        
        /**
         * Gets (as xml) the "persist" attribute
         */
        com.kyt.xsd.serviceeca.ActionDocument.Action.Persist xgetPersist();
        
        /**
         * True if has "persist" attribute
         */
        boolean isSetPersist();
        
        /**
         * Sets the "persist" attribute
         */
        void setPersist(com.kyt.xsd.serviceeca.ActionDocument.Action.Persist.Enum persist);
        
        /**
         * Sets (as xml) the "persist" attribute
         */
        void xsetPersist(com.kyt.xsd.serviceeca.ActionDocument.Action.Persist persist);
        
        /**
         * Unsets the "persist" attribute
         */
        void unsetPersist();
        
        /**
         * An XML mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.serviceeca.ActionDocument$Action$Mode.
         */
        public interface Mode extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("mode8870attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum SYNC = Enum.forString("sync");
            static final Enum ASYNC = Enum.forString("async");
            
            static final int INT_SYNC = Enum.INT_SYNC;
            static final int INT_ASYNC = Enum.INT_ASYNC;
            
            /**
             * Enumeration value class for com.kyt.xsd.serviceeca.ActionDocument$Action$Mode.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SYNC
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
                
                static final int INT_SYNC = 1;
                static final int INT_ASYNC = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("sync", INT_SYNC),
                      new Enum("async", INT_ASYNC),
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
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.Mode newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.Mode) type.newValue( obj ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.Mode newInstance() {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.Mode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.Mode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.Mode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML new-transaction(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.serviceeca.ActionDocument$Action$NewTransaction.
         */
        public interface NewTransaction extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NewTransaction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("newtransaction45c6attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.serviceeca.ActionDocument$Action$NewTransaction.
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
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.NewTransaction newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.NewTransaction) type.newValue( obj ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.NewTransaction newInstance() {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.NewTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.NewTransaction newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.NewTransaction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML result-to-context(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.serviceeca.ActionDocument$Action$ResultToContext.
         */
        public interface ResultToContext extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultToContext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("resulttocontext7ba2attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.serviceeca.ActionDocument$Action$ResultToContext.
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
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToContext newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToContext) type.newValue( obj ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToContext newInstance() {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToContext newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML result-to-result(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.serviceeca.ActionDocument$Action$ResultToResult.
         */
        public interface ResultToResult extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultToResult.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("resulttoresult83ccattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.serviceeca.ActionDocument$Action$ResultToResult.
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
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToResult newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToResult) type.newValue( obj ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToResult newInstance() {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToResult newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.ResultToResult) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ignore-failure(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.serviceeca.ActionDocument$Action$IgnoreFailure.
         */
        public interface IgnoreFailure extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IgnoreFailure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("ignorefailured95cattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.serviceeca.ActionDocument$Action$IgnoreFailure.
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
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreFailure newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreFailure) type.newValue( obj ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreFailure newInstance() {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreFailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreFailure newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreFailure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ignore-error(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.serviceeca.ActionDocument$Action$IgnoreError.
         */
        public interface IgnoreError extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IgnoreError.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("ignoreerror1a9aattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.serviceeca.ActionDocument$Action$IgnoreError.
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
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreError newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreError) type.newValue( obj ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreError newInstance() {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreError newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.IgnoreError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML persist(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.serviceeca.ActionDocument$Action$Persist.
         */
        public interface Persist extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Persist.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("persist02a9attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.serviceeca.ActionDocument$Action$Persist.
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
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.Persist newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.Persist) type.newValue( obj ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.Persist newInstance() {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.Persist) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.serviceeca.ActionDocument.Action.Persist newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.serviceeca.ActionDocument.Action.Persist) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.serviceeca.ActionDocument.Action newInstance() {
              return (com.kyt.xsd.serviceeca.ActionDocument.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.serviceeca.ActionDocument.Action newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.serviceeca.ActionDocument.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.serviceeca.ActionDocument newInstance() {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.serviceeca.ActionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.serviceeca.ActionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ActionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.serviceeca.ActionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ActionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.serviceeca.ActionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ActionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.serviceeca.ActionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ActionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.serviceeca.ActionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ActionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.serviceeca.ActionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ActionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.serviceeca.ActionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ActionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceeca.ActionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceeca.ActionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceeca.ActionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
