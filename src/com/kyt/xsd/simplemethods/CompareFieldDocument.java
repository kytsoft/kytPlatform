/*
 * An XML document type.
 * Localname: compare-field
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.CompareFieldDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one compare-field(@) element.
 *
 * This is a complex type.
 */
public interface CompareFieldDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompareFieldDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("comparefield3639doctype");
    
    /**
     * Gets the "compare-field" element
     */
    com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField getCompareField();
    
    /**
     * Sets the "compare-field" element
     */
    void setCompareField(com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField compareField);
    
    /**
     * Appends and returns a new empty "compare-field" element
     */
    com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField addNewCompareField();
    
    /**
     * An XML compare-field(@).
     *
     * This is a complex type.
     */
    public interface CompareField extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompareField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("comparefield9ec7elemtype");
        
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
         * Gets the "operator" attribute
         */
        com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Operator.Enum getOperator();
        
        /**
         * Gets (as xml) the "operator" attribute
         */
        com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Operator xgetOperator();
        
        /**
         * Sets the "operator" attribute
         */
        void setOperator(com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Operator.Enum operator);
        
        /**
         * Sets (as xml) the "operator" attribute
         */
        void xsetOperator(com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Operator operator);
        
        /**
         * Gets the "type" attribute
         */
        com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Type xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Type type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * An XML operator(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.CompareFieldDocument$CompareField$Operator.
         */
        public interface Operator extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Operator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("operatore38battrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum LESS = Enum.forString("less");
            static final Enum GREATER = Enum.forString("greater");
            static final Enum LESS_EQUALS = Enum.forString("less-equals");
            static final Enum GREATER_EQUALS = Enum.forString("greater-equals");
            static final Enum EQUALS = Enum.forString("equals");
            static final Enum NOT_EQUALS = Enum.forString("not-equals");
            static final Enum CONTAINS = Enum.forString("contains");
            
            static final int INT_LESS = Enum.INT_LESS;
            static final int INT_GREATER = Enum.INT_GREATER;
            static final int INT_LESS_EQUALS = Enum.INT_LESS_EQUALS;
            static final int INT_GREATER_EQUALS = Enum.INT_GREATER_EQUALS;
            static final int INT_EQUALS = Enum.INT_EQUALS;
            static final int INT_NOT_EQUALS = Enum.INT_NOT_EQUALS;
            static final int INT_CONTAINS = Enum.INT_CONTAINS;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.CompareFieldDocument$CompareField$Operator.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LESS
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
                
                static final int INT_LESS = 1;
                static final int INT_GREATER = 2;
                static final int INT_LESS_EQUALS = 3;
                static final int INT_GREATER_EQUALS = 4;
                static final int INT_EQUALS = 5;
                static final int INT_NOT_EQUALS = 6;
                static final int INT_CONTAINS = 7;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("less", INT_LESS),
                      new Enum("greater", INT_GREATER),
                      new Enum("less-equals", INT_LESS_EQUALS),
                      new Enum("greater-equals", INT_GREATER_EQUALS),
                      new Enum("equals", INT_EQUALS),
                      new Enum("not-equals", INT_NOT_EQUALS),
                      new Enum("contains", INT_CONTAINS),
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
                public static com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Operator newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Operator) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Operator newInstance() {
                  return (com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Operator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Operator newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Operator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.CompareFieldDocument$CompareField$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("typee021attrtype");
            
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
            static final Enum OBJECT = Enum.forString("Object");
            
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
            static final int INT_OBJECT = Enum.INT_OBJECT;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.CompareFieldDocument$CompareField$Type.
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
                static final int INT_OBJECT = 12;
                
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
                      new Enum("Object", INT_OBJECT),
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
                public static com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Type newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Type) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Type newInstance() {
                  return (com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField newInstance() {
              return (com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.CompareFieldDocument newInstance() {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.CompareFieldDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.CompareFieldDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.CompareFieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
