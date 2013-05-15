/*
 * An XML document type.
 * Localname: set
 * Namespace: 
 * Java type: com.kyt.xsd.widgetmenu.SetDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetmenu;


/**
 * A document containing one set(@) element.
 *
 * This is a complex type.
 */
public interface SetDocument extends com.kyt.xsd.widgetmenu.AllActionsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("setb549doctype");
    
    /**
     * Gets the "set" element
     */
    com.kyt.xsd.widgetmenu.SetDocument.Set getSet();
    
    /**
     * Sets the "set" element
     */
    void setSet(com.kyt.xsd.widgetmenu.SetDocument.Set set);
    
    /**
     * Appends and returns a new empty "set" element
     */
    com.kyt.xsd.widgetmenu.SetDocument.Set addNewSet();
    
    /**
     * An XML set(@).
     *
     * This is a complex type.
     */
    public interface Set extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Set.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("set5ba7elemtype");
        
        /**
         * Gets the "field" attribute
         */
        java.lang.String getField();
        
        /**
         * Gets (as xml) the "field" attribute
         */
        org.apache.xmlbeans.XmlString xgetField();
        
        /**
         * Sets the "field" attribute
         */
        void setField(java.lang.String field);
        
        /**
         * Sets (as xml) the "field" attribute
         */
        void xsetField(org.apache.xmlbeans.XmlString field);
        
        /**
         * Gets the "from-field" attribute
         */
        java.lang.String getFromField();
        
        /**
         * Gets (as xml) the "from-field" attribute
         */
        org.apache.xmlbeans.XmlString xgetFromField();
        
        /**
         * True if has "from-field" attribute
         */
        boolean isSetFromField();
        
        /**
         * Sets the "from-field" attribute
         */
        void setFromField(java.lang.String fromField);
        
        /**
         * Sets (as xml) the "from-field" attribute
         */
        void xsetFromField(org.apache.xmlbeans.XmlString fromField);
        
        /**
         * Unsets the "from-field" attribute
         */
        void unsetFromField();
        
        /**
         * Gets the "value" attribute
         */
        java.lang.String getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        org.apache.xmlbeans.XmlString xgetValue();
        
        /**
         * True if has "value" attribute
         */
        boolean isSetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(java.lang.String value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(org.apache.xmlbeans.XmlString value);
        
        /**
         * Unsets the "value" attribute
         */
        void unsetValue();
        
        /**
         * Gets the "default-value" attribute
         */
        java.lang.String getDefaultValue();
        
        /**
         * Gets (as xml) the "default-value" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultValue();
        
        /**
         * True if has "default-value" attribute
         */
        boolean isSetDefaultValue();
        
        /**
         * Sets the "default-value" attribute
         */
        void setDefaultValue(java.lang.String defaultValue);
        
        /**
         * Sets (as xml) the "default-value" attribute
         */
        void xsetDefaultValue(org.apache.xmlbeans.XmlString defaultValue);
        
        /**
         * Unsets the "default-value" attribute
         */
        void unsetDefaultValue();
        
        /**
         * Gets the "global" attribute
         */
        com.kyt.xsd.widgetmenu.SetDocument.Set.Global.Enum getGlobal();
        
        /**
         * Gets (as xml) the "global" attribute
         */
        com.kyt.xsd.widgetmenu.SetDocument.Set.Global xgetGlobal();
        
        /**
         * True if has "global" attribute
         */
        boolean isSetGlobal();
        
        /**
         * Sets the "global" attribute
         */
        void setGlobal(com.kyt.xsd.widgetmenu.SetDocument.Set.Global.Enum global);
        
        /**
         * Sets (as xml) the "global" attribute
         */
        void xsetGlobal(com.kyt.xsd.widgetmenu.SetDocument.Set.Global global);
        
        /**
         * Unsets the "global" attribute
         */
        void unsetGlobal();
        
        /**
         * Gets the "type" attribute
         */
        com.kyt.xsd.widgetmenu.SetDocument.Set.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        com.kyt.xsd.widgetmenu.SetDocument.Set.Type xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(com.kyt.xsd.widgetmenu.SetDocument.Set.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(com.kyt.xsd.widgetmenu.SetDocument.Set.Type type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "to-scope" attribute
         */
        com.kyt.xsd.widgetmenu.SetDocument.Set.ToScope.Enum getToScope();
        
        /**
         * Gets (as xml) the "to-scope" attribute
         */
        com.kyt.xsd.widgetmenu.SetDocument.Set.ToScope xgetToScope();
        
        /**
         * True if has "to-scope" attribute
         */
        boolean isSetToScope();
        
        /**
         * Sets the "to-scope" attribute
         */
        void setToScope(com.kyt.xsd.widgetmenu.SetDocument.Set.ToScope.Enum toScope);
        
        /**
         * Sets (as xml) the "to-scope" attribute
         */
        void xsetToScope(com.kyt.xsd.widgetmenu.SetDocument.Set.ToScope toScope);
        
        /**
         * Unsets the "to-scope" attribute
         */
        void unsetToScope();
        
        /**
         * Gets the "from-scope" attribute
         */
        com.kyt.xsd.widgetmenu.SetDocument.Set.FromScope.Enum getFromScope();
        
        /**
         * Gets (as xml) the "from-scope" attribute
         */
        com.kyt.xsd.widgetmenu.SetDocument.Set.FromScope xgetFromScope();
        
        /**
         * True if has "from-scope" attribute
         */
        boolean isSetFromScope();
        
        /**
         * Sets the "from-scope" attribute
         */
        void setFromScope(com.kyt.xsd.widgetmenu.SetDocument.Set.FromScope.Enum fromScope);
        
        /**
         * Sets (as xml) the "from-scope" attribute
         */
        void xsetFromScope(com.kyt.xsd.widgetmenu.SetDocument.Set.FromScope fromScope);
        
        /**
         * Unsets the "from-scope" attribute
         */
        void unsetFromScope();
        
        /**
         * An XML global(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.SetDocument$Set$Global.
         */
        public interface Global extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Global.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("globald5eaattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.SetDocument$Set$Global.
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
                public static com.kyt.xsd.widgetmenu.SetDocument.Set.Global newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.SetDocument.Set.Global) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.SetDocument.Set.Global newInstance() {
                  return (com.kyt.xsd.widgetmenu.SetDocument.Set.Global) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.SetDocument.Set.Global newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.SetDocument.Set.Global) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.SetDocument$Set$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("type4e01attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum PLAIN_STRING = Enum.forString("PlainString");
            static final Enum STRING = Enum.forString("String");
            static final Enum BIG_DECIMAL = Enum.forString("BigDecimal");
            static final Enum DOUBLE = Enum.forString("Double");
            static final Enum FLOAT = Enum.forString("Float");
            static final Enum LIST = Enum.forString("List");
            static final Enum LONG = Enum.forString("Long");
            static final Enum INTEGER = Enum.forString("Integer");
            static final Enum DATE = Enum.forString("Date");
            static final Enum TIME = Enum.forString("Time");
            static final Enum TIMESTAMP = Enum.forString("Timestamp");
            static final Enum BOOLEAN = Enum.forString("Boolean");
            static final Enum OBJECT = Enum.forString("Object");
            static final Enum NEW_LIST = Enum.forString("NewList");
            static final Enum NEW_MAP = Enum.forString("NewMap");
            
            static final int INT_PLAIN_STRING = Enum.INT_PLAIN_STRING;
            static final int INT_STRING = Enum.INT_STRING;
            static final int INT_BIG_DECIMAL = Enum.INT_BIG_DECIMAL;
            static final int INT_DOUBLE = Enum.INT_DOUBLE;
            static final int INT_FLOAT = Enum.INT_FLOAT;
            static final int INT_LIST = Enum.INT_LIST;
            static final int INT_LONG = Enum.INT_LONG;
            static final int INT_INTEGER = Enum.INT_INTEGER;
            static final int INT_DATE = Enum.INT_DATE;
            static final int INT_TIME = Enum.INT_TIME;
            static final int INT_TIMESTAMP = Enum.INT_TIMESTAMP;
            static final int INT_BOOLEAN = Enum.INT_BOOLEAN;
            static final int INT_OBJECT = Enum.INT_OBJECT;
            static final int INT_NEW_LIST = Enum.INT_NEW_LIST;
            static final int INT_NEW_MAP = Enum.INT_NEW_MAP;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.SetDocument$Set$Type.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PLAIN_STRING
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
                
                static final int INT_PLAIN_STRING = 1;
                static final int INT_STRING = 2;
                static final int INT_BIG_DECIMAL = 3;
                static final int INT_DOUBLE = 4;
                static final int INT_FLOAT = 5;
                static final int INT_LIST = 6;
                static final int INT_LONG = 7;
                static final int INT_INTEGER = 8;
                static final int INT_DATE = 9;
                static final int INT_TIME = 10;
                static final int INT_TIMESTAMP = 11;
                static final int INT_BOOLEAN = 12;
                static final int INT_OBJECT = 13;
                static final int INT_NEW_LIST = 14;
                static final int INT_NEW_MAP = 15;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("PlainString", INT_PLAIN_STRING),
                      new Enum("String", INT_STRING),
                      new Enum("BigDecimal", INT_BIG_DECIMAL),
                      new Enum("Double", INT_DOUBLE),
                      new Enum("Float", INT_FLOAT),
                      new Enum("List", INT_LIST),
                      new Enum("Long", INT_LONG),
                      new Enum("Integer", INT_INTEGER),
                      new Enum("Date", INT_DATE),
                      new Enum("Time", INT_TIME),
                      new Enum("Timestamp", INT_TIMESTAMP),
                      new Enum("Boolean", INT_BOOLEAN),
                      new Enum("Object", INT_OBJECT),
                      new Enum("NewList", INT_NEW_LIST),
                      new Enum("NewMap", INT_NEW_MAP),
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
                public static com.kyt.xsd.widgetmenu.SetDocument.Set.Type newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.SetDocument.Set.Type) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.SetDocument.Set.Type newInstance() {
                  return (com.kyt.xsd.widgetmenu.SetDocument.Set.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.SetDocument.Set.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.SetDocument.Set.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML to-scope(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.SetDocument$Set$ToScope.
         */
        public interface ToScope extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ToScope.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("toscopefd49attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum SCREEN = Enum.forString("screen");
            static final Enum USER = Enum.forString("user");
            static final Enum APPLICATION = Enum.forString("application");
            
            static final int INT_SCREEN = Enum.INT_SCREEN;
            static final int INT_USER = Enum.INT_USER;
            static final int INT_APPLICATION = Enum.INT_APPLICATION;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.SetDocument$Set$ToScope.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SCREEN
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
                
                static final int INT_SCREEN = 1;
                static final int INT_USER = 2;
                static final int INT_APPLICATION = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("screen", INT_SCREEN),
                      new Enum("user", INT_USER),
                      new Enum("application", INT_APPLICATION),
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
                public static com.kyt.xsd.widgetmenu.SetDocument.Set.ToScope newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.SetDocument.Set.ToScope) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.SetDocument.Set.ToScope newInstance() {
                  return (com.kyt.xsd.widgetmenu.SetDocument.Set.ToScope) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.SetDocument.Set.ToScope newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.SetDocument.Set.ToScope) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML from-scope(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.SetDocument$Set$FromScope.
         */
        public interface FromScope extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FromScope.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("fromscopea1b8attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum SCREEN = Enum.forString("screen");
            static final Enum USER = Enum.forString("user");
            static final Enum APPLICATION = Enum.forString("application");
            
            static final int INT_SCREEN = Enum.INT_SCREEN;
            static final int INT_USER = Enum.INT_USER;
            static final int INT_APPLICATION = Enum.INT_APPLICATION;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.SetDocument$Set$FromScope.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SCREEN
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
                
                static final int INT_SCREEN = 1;
                static final int INT_USER = 2;
                static final int INT_APPLICATION = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("screen", INT_SCREEN),
                      new Enum("user", INT_USER),
                      new Enum("application", INT_APPLICATION),
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
                public static com.kyt.xsd.widgetmenu.SetDocument.Set.FromScope newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.SetDocument.Set.FromScope) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.SetDocument.Set.FromScope newInstance() {
                  return (com.kyt.xsd.widgetmenu.SetDocument.Set.FromScope) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.SetDocument.Set.FromScope newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.SetDocument.Set.FromScope) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetmenu.SetDocument.Set newInstance() {
              return (com.kyt.xsd.widgetmenu.SetDocument.Set) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetmenu.SetDocument.Set newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetmenu.SetDocument.Set) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetmenu.SetDocument newInstance() {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetmenu.SetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetmenu.SetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.SetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetmenu.SetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.SetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.SetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.SetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.SetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.SetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.SetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.SetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.SetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.SetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.SetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.SetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetmenu.SetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetmenu.SetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetmenu.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
