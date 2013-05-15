/*
 * An XML document type.
 * Localname: convert
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.ConvertDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one convert(@) element.
 *
 * This is a complex type.
 */
public interface ConvertDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConvertDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("convert4b1adoctype");
    
    /**
     * Gets the "convert" element
     */
    com.kyt.xsd.simplemethods.ConvertDocument.Convert getConvert();
    
    /**
     * Sets the "convert" element
     */
    void setConvert(com.kyt.xsd.simplemethods.ConvertDocument.Convert convert);
    
    /**
     * Appends and returns a new empty "convert" element
     */
    com.kyt.xsd.simplemethods.ConvertDocument.Convert addNewConvert();
    
    /**
     * An XML convert(@).
     *
     * This is a complex type.
     */
    public interface Convert extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Convert.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("convert4689elemtype");
        
        /**
         * Gets the "fail-message" element
         */
        com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage getFailMessage();
        
        /**
         * True if has "fail-message" element
         */
        boolean isSetFailMessage();
        
        /**
         * Sets the "fail-message" element
         */
        void setFailMessage(com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage failMessage);
        
        /**
         * Appends and returns a new empty "fail-message" element
         */
        com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage addNewFailMessage();
        
        /**
         * Unsets the "fail-message" element
         */
        void unsetFailMessage();
        
        /**
         * Gets the "fail-property" element
         */
        com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty getFailProperty();
        
        /**
         * True if has "fail-property" element
         */
        boolean isSetFailProperty();
        
        /**
         * Sets the "fail-property" element
         */
        void setFailProperty(com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty failProperty);
        
        /**
         * Appends and returns a new empty "fail-property" element
         */
        com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty addNewFailProperty();
        
        /**
         * Unsets the "fail-property" element
         */
        void unsetFailProperty();
        
        /**
         * Gets the "to-field" attribute
         */
        java.lang.String getToField();
        
        /**
         * Gets (as xml) the "to-field" attribute
         */
        org.apache.xmlbeans.XmlString xgetToField();
        
        /**
         * True if has "to-field" attribute
         */
        boolean isSetToField();
        
        /**
         * Sets the "to-field" attribute
         */
        void setToField(java.lang.String toField);
        
        /**
         * Sets (as xml) the "to-field" attribute
         */
        void xsetToField(org.apache.xmlbeans.XmlString toField);
        
        /**
         * Unsets the "to-field" attribute
         */
        void unsetToField();
        
        /**
         * Gets the "type" attribute
         */
        com.kyt.xsd.simplemethods.ConvertDocument.Convert.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        com.kyt.xsd.simplemethods.ConvertDocument.Convert.Type xgetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(com.kyt.xsd.simplemethods.ConvertDocument.Convert.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(com.kyt.xsd.simplemethods.ConvertDocument.Convert.Type type);
        
        /**
         * Gets the "replace" attribute
         */
        com.kyt.xsd.simplemethods.ConvertDocument.Convert.Replace.Enum getReplace();
        
        /**
         * Gets (as xml) the "replace" attribute
         */
        com.kyt.xsd.simplemethods.ConvertDocument.Convert.Replace xgetReplace();
        
        /**
         * True if has "replace" attribute
         */
        boolean isSetReplace();
        
        /**
         * Sets the "replace" attribute
         */
        void setReplace(com.kyt.xsd.simplemethods.ConvertDocument.Convert.Replace.Enum replace);
        
        /**
         * Sets (as xml) the "replace" attribute
         */
        void xsetReplace(com.kyt.xsd.simplemethods.ConvertDocument.Convert.Replace replace);
        
        /**
         * Unsets the "replace" attribute
         */
        void unsetReplace();
        
        /**
         * Gets the "set-if-null" attribute
         */
        com.kyt.xsd.simplemethods.ConvertDocument.Convert.SetIfNull.Enum getSetIfNull();
        
        /**
         * Gets (as xml) the "set-if-null" attribute
         */
        com.kyt.xsd.simplemethods.ConvertDocument.Convert.SetIfNull xgetSetIfNull();
        
        /**
         * True if has "set-if-null" attribute
         */
        boolean isSetSetIfNull();
        
        /**
         * Sets the "set-if-null" attribute
         */
        void setSetIfNull(com.kyt.xsd.simplemethods.ConvertDocument.Convert.SetIfNull.Enum setIfNull);
        
        /**
         * Sets (as xml) the "set-if-null" attribute
         */
        void xsetSetIfNull(com.kyt.xsd.simplemethods.ConvertDocument.Convert.SetIfNull setIfNull);
        
        /**
         * Unsets the "set-if-null" attribute
         */
        void unsetSetIfNull();
        
        /**
         * Gets the "format" attribute
         */
        java.lang.String getFormat();
        
        /**
         * Gets (as xml) the "format" attribute
         */
        org.apache.xmlbeans.XmlString xgetFormat();
        
        /**
         * True if has "format" attribute
         */
        boolean isSetFormat();
        
        /**
         * Sets the "format" attribute
         */
        void setFormat(java.lang.String format);
        
        /**
         * Sets (as xml) the "format" attribute
         */
        void xsetFormat(org.apache.xmlbeans.XmlString format);
        
        /**
         * Unsets the "format" attribute
         */
        void unsetFormat();
        
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.ConvertDocument$Convert$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("type3ee3attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum PLAIN_STRING = Enum.forString("PlainString");
            static final Enum STRING = Enum.forString("String");
            static final Enum BIG_DECIMAL = Enum.forString("BigDecimal");
            static final Enum DOUBLE = Enum.forString("Double");
            static final Enum FLOAT = Enum.forString("Float");
            static final Enum LONG = Enum.forString("Long");
            static final Enum INTEGER = Enum.forString("Integer");
            static final Enum DATE = Enum.forString("Date");
            static final Enum TIME = Enum.forString("Time");
            static final Enum TIMESTAMP = Enum.forString("Timestamp");
            static final Enum BOOLEAN = Enum.forString("Boolean");
            
            static final int INT_PLAIN_STRING = Enum.INT_PLAIN_STRING;
            static final int INT_STRING = Enum.INT_STRING;
            static final int INT_BIG_DECIMAL = Enum.INT_BIG_DECIMAL;
            static final int INT_DOUBLE = Enum.INT_DOUBLE;
            static final int INT_FLOAT = Enum.INT_FLOAT;
            static final int INT_LONG = Enum.INT_LONG;
            static final int INT_INTEGER = Enum.INT_INTEGER;
            static final int INT_DATE = Enum.INT_DATE;
            static final int INT_TIME = Enum.INT_TIME;
            static final int INT_TIMESTAMP = Enum.INT_TIMESTAMP;
            static final int INT_BOOLEAN = Enum.INT_BOOLEAN;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.ConvertDocument$Convert$Type.
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
                static final int INT_LONG = 6;
                static final int INT_INTEGER = 7;
                static final int INT_DATE = 8;
                static final int INT_TIME = 9;
                static final int INT_TIMESTAMP = 10;
                static final int INT_BOOLEAN = 11;
                
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
                      new Enum("Long", INT_LONG),
                      new Enum("Integer", INT_INTEGER),
                      new Enum("Date", INT_DATE),
                      new Enum("Time", INT_TIME),
                      new Enum("Timestamp", INT_TIMESTAMP),
                      new Enum("Boolean", INT_BOOLEAN),
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
                public static com.kyt.xsd.simplemethods.ConvertDocument.Convert.Type newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.ConvertDocument.Convert.Type) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.ConvertDocument.Convert.Type newInstance() {
                  return (com.kyt.xsd.simplemethods.ConvertDocument.Convert.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.ConvertDocument.Convert.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.ConvertDocument.Convert.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML replace(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.ConvertDocument$Convert$Replace.
         */
        public interface Replace extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Replace.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("replace33a5attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.ConvertDocument$Convert$Replace.
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
                public static com.kyt.xsd.simplemethods.ConvertDocument.Convert.Replace newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.ConvertDocument.Convert.Replace) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.ConvertDocument.Convert.Replace newInstance() {
                  return (com.kyt.xsd.simplemethods.ConvertDocument.Convert.Replace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.ConvertDocument.Convert.Replace newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.ConvertDocument.Convert.Replace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML set-if-null(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.ConvertDocument$Convert$SetIfNull.
         */
        public interface SetIfNull extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetIfNull.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("setifnulld4bdattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.ConvertDocument$Convert$SetIfNull.
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
                public static com.kyt.xsd.simplemethods.ConvertDocument.Convert.SetIfNull newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.ConvertDocument.Convert.SetIfNull) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.ConvertDocument.Convert.SetIfNull newInstance() {
                  return (com.kyt.xsd.simplemethods.ConvertDocument.Convert.SetIfNull) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.ConvertDocument.Convert.SetIfNull newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.ConvertDocument.Convert.SetIfNull) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.ConvertDocument.Convert newInstance() {
              return (com.kyt.xsd.simplemethods.ConvertDocument.Convert) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.ConvertDocument.Convert newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.ConvertDocument.Convert) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.ConvertDocument newInstance() {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.ConvertDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.ConvertDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.ConvertDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
