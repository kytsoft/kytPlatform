/*
 * An XML document type.
 * Localname: eca
 * Namespace: 
 * Java type: com.kyt.xsd.entityeca.EcaDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityeca;


/**
 * A document containing one eca(@) element.
 *
 * This is a complex type.
 */
public interface EcaDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EcaDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s339F2D320A43D78ADCA3A257A145488D").resolveHandle("eca806adoctype");
    
    /**
     * Gets the "eca" element
     */
    com.kyt.xsd.entityeca.EcaDocument.Eca getEca();
    
    /**
     * Sets the "eca" element
     */
    void setEca(com.kyt.xsd.entityeca.EcaDocument.Eca eca);
    
    /**
     * Appends and returns a new empty "eca" element
     */
    com.kyt.xsd.entityeca.EcaDocument.Eca addNewEca();
    
    /**
     * An XML eca(@).
     *
     * This is a complex type.
     */
    public interface Eca extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Eca.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s339F2D320A43D78ADCA3A257A145488D").resolveHandle("eca5529elemtype");
        
        /**
         * Gets array of all "condition" elements
         */
        com.kyt.xsd.entityeca.ConditionDocument.Condition[] getConditionArray();
        
        /**
         * Gets ith "condition" element
         */
        com.kyt.xsd.entityeca.ConditionDocument.Condition getConditionArray(int i);
        
        /**
         * Returns number of "condition" element
         */
        int sizeOfConditionArray();
        
        /**
         * Sets array of all "condition" element
         */
        void setConditionArray(com.kyt.xsd.entityeca.ConditionDocument.Condition[] conditionArray);
        
        /**
         * Sets ith "condition" element
         */
        void setConditionArray(int i, com.kyt.xsd.entityeca.ConditionDocument.Condition condition);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "condition" element
         */
        com.kyt.xsd.entityeca.ConditionDocument.Condition insertNewCondition(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "condition" element
         */
        com.kyt.xsd.entityeca.ConditionDocument.Condition addNewCondition();
        
        /**
         * Removes the ith "condition" element
         */
        void removeCondition(int i);
        
        /**
         * Gets array of all "condition-field" elements
         */
        com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField[] getConditionFieldArray();
        
        /**
         * Gets ith "condition-field" element
         */
        com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField getConditionFieldArray(int i);
        
        /**
         * Returns number of "condition-field" element
         */
        int sizeOfConditionFieldArray();
        
        /**
         * Sets array of all "condition-field" element
         */
        void setConditionFieldArray(com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField[] conditionFieldArray);
        
        /**
         * Sets ith "condition-field" element
         */
        void setConditionFieldArray(int i, com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField conditionField);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "condition-field" element
         */
        com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField insertNewConditionField(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "condition-field" element
         */
        com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField addNewConditionField();
        
        /**
         * Removes the ith "condition-field" element
         */
        void removeConditionField(int i);
        
        /**
         * Gets array of all "set" elements
         */
        com.kyt.xsd.entityeca.SetDocument.Set[] getSetArray();
        
        /**
         * Gets ith "set" element
         */
        com.kyt.xsd.entityeca.SetDocument.Set getSetArray(int i);
        
        /**
         * Returns number of "set" element
         */
        int sizeOfSetArray();
        
        /**
         * Sets array of all "set" element
         */
        void setSetArray(com.kyt.xsd.entityeca.SetDocument.Set[] setArray);
        
        /**
         * Sets ith "set" element
         */
        void setSetArray(int i, com.kyt.xsd.entityeca.SetDocument.Set set);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "set" element
         */
        com.kyt.xsd.entityeca.SetDocument.Set insertNewSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "set" element
         */
        com.kyt.xsd.entityeca.SetDocument.Set addNewSet();
        
        /**
         * Removes the ith "set" element
         */
        void removeSet(int i);
        
        /**
         * Gets array of all "action" elements
         */
        com.kyt.xsd.entityeca.ActionDocument.Action[] getActionArray();
        
        /**
         * Gets ith "action" element
         */
        com.kyt.xsd.entityeca.ActionDocument.Action getActionArray(int i);
        
        /**
         * Returns number of "action" element
         */
        int sizeOfActionArray();
        
        /**
         * Sets array of all "action" element
         */
        void setActionArray(com.kyt.xsd.entityeca.ActionDocument.Action[] actionArray);
        
        /**
         * Sets ith "action" element
         */
        void setActionArray(int i, com.kyt.xsd.entityeca.ActionDocument.Action action);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "action" element
         */
        com.kyt.xsd.entityeca.ActionDocument.Action insertNewAction(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "action" element
         */
        com.kyt.xsd.entityeca.ActionDocument.Action addNewAction();
        
        /**
         * Removes the ith "action" element
         */
        void removeAction(int i);
        
        /**
         * Gets the "entity" attribute
         */
        java.lang.String getEntity();
        
        /**
         * Gets (as xml) the "entity" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntity();
        
        /**
         * Sets the "entity" attribute
         */
        void setEntity(java.lang.String entity);
        
        /**
         * Sets (as xml) the "entity" attribute
         */
        void xsetEntity(org.apache.xmlbeans.XmlString entity);
        
        /**
         * Gets the "operation" attribute
         */
        com.kyt.xsd.entityeca.EcaDocument.Eca.Operation.Enum getOperation();
        
        /**
         * Gets (as xml) the "operation" attribute
         */
        com.kyt.xsd.entityeca.EcaDocument.Eca.Operation xgetOperation();
        
        /**
         * Sets the "operation" attribute
         */
        void setOperation(com.kyt.xsd.entityeca.EcaDocument.Eca.Operation.Enum operation);
        
        /**
         * Sets (as xml) the "operation" attribute
         */
        void xsetOperation(com.kyt.xsd.entityeca.EcaDocument.Eca.Operation operation);
        
        /**
         * Gets the "event" attribute
         */
        com.kyt.xsd.entityeca.EcaDocument.Eca.Event.Enum getEvent();
        
        /**
         * Gets (as xml) the "event" attribute
         */
        com.kyt.xsd.entityeca.EcaDocument.Eca.Event xgetEvent();
        
        /**
         * Sets the "event" attribute
         */
        void setEvent(com.kyt.xsd.entityeca.EcaDocument.Eca.Event.Enum event);
        
        /**
         * Sets (as xml) the "event" attribute
         */
        void xsetEvent(com.kyt.xsd.entityeca.EcaDocument.Eca.Event event);
        
        /**
         * Gets the "run-on-error" attribute
         */
        com.kyt.xsd.entityeca.EcaDocument.Eca.RunOnError.Enum getRunOnError();
        
        /**
         * Gets (as xml) the "run-on-error" attribute
         */
        com.kyt.xsd.entityeca.EcaDocument.Eca.RunOnError xgetRunOnError();
        
        /**
         * True if has "run-on-error" attribute
         */
        boolean isSetRunOnError();
        
        /**
         * Sets the "run-on-error" attribute
         */
        void setRunOnError(com.kyt.xsd.entityeca.EcaDocument.Eca.RunOnError.Enum runOnError);
        
        /**
         * Sets (as xml) the "run-on-error" attribute
         */
        void xsetRunOnError(com.kyt.xsd.entityeca.EcaDocument.Eca.RunOnError runOnError);
        
        /**
         * Unsets the "run-on-error" attribute
         */
        void unsetRunOnError();
        
        /**
         * An XML operation(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityeca.EcaDocument$Eca$Operation.
         */
        public interface Operation extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Operation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s339F2D320A43D78ADCA3A257A145488D").resolveHandle("operationc378attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum CREATE = Enum.forString("create");
            static final Enum STORE = Enum.forString("store");
            static final Enum REMOVE = Enum.forString("remove");
            static final Enum FIND = Enum.forString("find");
            static final Enum CREATE_STORE = Enum.forString("create-store");
            static final Enum CREATE_REMOVE = Enum.forString("create-remove");
            static final Enum STORE_REMOVE = Enum.forString("store-remove");
            static final Enum CREATE_STORE_REMOVE = Enum.forString("create-store-remove");
            static final Enum ANY = Enum.forString("any");
            
            static final int INT_CREATE = Enum.INT_CREATE;
            static final int INT_STORE = Enum.INT_STORE;
            static final int INT_REMOVE = Enum.INT_REMOVE;
            static final int INT_FIND = Enum.INT_FIND;
            static final int INT_CREATE_STORE = Enum.INT_CREATE_STORE;
            static final int INT_CREATE_REMOVE = Enum.INT_CREATE_REMOVE;
            static final int INT_STORE_REMOVE = Enum.INT_STORE_REMOVE;
            static final int INT_CREATE_STORE_REMOVE = Enum.INT_CREATE_STORE_REMOVE;
            static final int INT_ANY = Enum.INT_ANY;
            
            /**
             * Enumeration value class for com.kyt.xsd.entityeca.EcaDocument$Eca$Operation.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CREATE
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
                
                static final int INT_CREATE = 1;
                static final int INT_STORE = 2;
                static final int INT_REMOVE = 3;
                static final int INT_FIND = 4;
                static final int INT_CREATE_STORE = 5;
                static final int INT_CREATE_REMOVE = 6;
                static final int INT_STORE_REMOVE = 7;
                static final int INT_CREATE_STORE_REMOVE = 8;
                static final int INT_ANY = 9;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("create", INT_CREATE),
                      new Enum("store", INT_STORE),
                      new Enum("remove", INT_REMOVE),
                      new Enum("find", INT_FIND),
                      new Enum("create-store", INT_CREATE_STORE),
                      new Enum("create-remove", INT_CREATE_REMOVE),
                      new Enum("store-remove", INT_STORE_REMOVE),
                      new Enum("create-store-remove", INT_CREATE_STORE_REMOVE),
                      new Enum("any", INT_ANY),
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
                public static com.kyt.xsd.entityeca.EcaDocument.Eca.Operation newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.entityeca.EcaDocument.Eca.Operation) type.newValue( obj ); }
                
                public static com.kyt.xsd.entityeca.EcaDocument.Eca.Operation newInstance() {
                  return (com.kyt.xsd.entityeca.EcaDocument.Eca.Operation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.entityeca.EcaDocument.Eca.Operation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.entityeca.EcaDocument.Eca.Operation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML event(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityeca.EcaDocument$Eca$Event.
         */
        public interface Event extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Event.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s339F2D320A43D78ADCA3A257A145488D").resolveHandle("event7e2battrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum VALIDATE = Enum.forString("validate");
            static final Enum RUN = Enum.forString("run");
            static final Enum RETURN = Enum.forString("return");
            static final Enum CACHE_CHECK = Enum.forString("cache-check");
            static final Enum CACHE_PUT = Enum.forString("cache-put");
            static final Enum CACHE_CLEAR = Enum.forString("cache-clear");
            
            static final int INT_VALIDATE = Enum.INT_VALIDATE;
            static final int INT_RUN = Enum.INT_RUN;
            static final int INT_RETURN = Enum.INT_RETURN;
            static final int INT_CACHE_CHECK = Enum.INT_CACHE_CHECK;
            static final int INT_CACHE_PUT = Enum.INT_CACHE_PUT;
            static final int INT_CACHE_CLEAR = Enum.INT_CACHE_CLEAR;
            
            /**
             * Enumeration value class for com.kyt.xsd.entityeca.EcaDocument$Eca$Event.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_VALIDATE
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
                
                static final int INT_VALIDATE = 1;
                static final int INT_RUN = 2;
                static final int INT_RETURN = 3;
                static final int INT_CACHE_CHECK = 4;
                static final int INT_CACHE_PUT = 5;
                static final int INT_CACHE_CLEAR = 6;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("validate", INT_VALIDATE),
                      new Enum("run", INT_RUN),
                      new Enum("return", INT_RETURN),
                      new Enum("cache-check", INT_CACHE_CHECK),
                      new Enum("cache-put", INT_CACHE_PUT),
                      new Enum("cache-clear", INT_CACHE_CLEAR),
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
                public static com.kyt.xsd.entityeca.EcaDocument.Eca.Event newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.entityeca.EcaDocument.Eca.Event) type.newValue( obj ); }
                
                public static com.kyt.xsd.entityeca.EcaDocument.Eca.Event newInstance() {
                  return (com.kyt.xsd.entityeca.EcaDocument.Eca.Event) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.entityeca.EcaDocument.Eca.Event newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.entityeca.EcaDocument.Eca.Event) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML run-on-error(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityeca.EcaDocument$Eca$RunOnError.
         */
        public interface RunOnError extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RunOnError.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s339F2D320A43D78ADCA3A257A145488D").resolveHandle("runonerror9ee5attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.entityeca.EcaDocument$Eca$RunOnError.
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
                public static com.kyt.xsd.entityeca.EcaDocument.Eca.RunOnError newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.entityeca.EcaDocument.Eca.RunOnError) type.newValue( obj ); }
                
                public static com.kyt.xsd.entityeca.EcaDocument.Eca.RunOnError newInstance() {
                  return (com.kyt.xsd.entityeca.EcaDocument.Eca.RunOnError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.entityeca.EcaDocument.Eca.RunOnError newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.entityeca.EcaDocument.Eca.RunOnError) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.entityeca.EcaDocument.Eca newInstance() {
              return (com.kyt.xsd.entityeca.EcaDocument.Eca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.entityeca.EcaDocument.Eca newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.entityeca.EcaDocument.Eca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.entityeca.EcaDocument newInstance() {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.entityeca.EcaDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.entityeca.EcaDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.entityeca.EcaDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.entityeca.EcaDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.entityeca.EcaDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.entityeca.EcaDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.entityeca.EcaDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.entityeca.EcaDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.entityeca.EcaDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.entityeca.EcaDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.entityeca.EcaDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.entityeca.EcaDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.entityeca.EcaDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.entityeca.EcaDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.entityeca.EcaDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityeca.EcaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityeca.EcaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityeca.EcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
