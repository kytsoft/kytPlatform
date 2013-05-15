/*
 * An XML document type.
 * Localname: set
 * Namespace: 
 * Java type: com.kyt.xsd.serviceeca.SetDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceeca;


/**
 * A document containing one set(@) element.
 *
 * This is a complex type.
 */
public interface SetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("setb549doctype");
    
    /**
     * Gets the "set" element
     */
    com.kyt.xsd.serviceeca.SetDocument.Set getSet();
    
    /**
     * Sets the "set" element
     */
    void setSet(com.kyt.xsd.serviceeca.SetDocument.Set set);
    
    /**
     * Appends and returns a new empty "set" element
     */
    com.kyt.xsd.serviceeca.SetDocument.Set addNewSet();
    
    /**
     * An XML set(@).
     *
     * This is a complex type.
     */
    public interface Set extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Set.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("set5ba7elemtype");
        
        /**
         * Gets the "field-name" attribute
         */
        java.lang.String getFieldName();
        
        /**
         * Gets (as xml) the "field-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetFieldName();
        
        /**
         * Sets the "field-name" attribute
         */
        void setFieldName(java.lang.String fieldName);
        
        /**
         * Sets (as xml) the "field-name" attribute
         */
        void xsetFieldName(org.apache.xmlbeans.XmlString fieldName);
        
        /**
         * Gets the "env-name" attribute
         */
        java.lang.String getEnvName();
        
        /**
         * Gets (as xml) the "env-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEnvName();
        
        /**
         * True if has "env-name" attribute
         */
        boolean isSetEnvName();
        
        /**
         * Sets the "env-name" attribute
         */
        void setEnvName(java.lang.String envName);
        
        /**
         * Sets (as xml) the "env-name" attribute
         */
        void xsetEnvName(org.apache.xmlbeans.XmlString envName);
        
        /**
         * Unsets the "env-name" attribute
         */
        void unsetEnvName();
        
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
         * Gets the "format" attribute
         */
        com.kyt.xsd.serviceeca.SetDocument.Set.Format.Enum getFormat();
        
        /**
         * Gets (as xml) the "format" attribute
         */
        com.kyt.xsd.serviceeca.SetDocument.Set.Format xgetFormat();
        
        /**
         * True if has "format" attribute
         */
        boolean isSetFormat();
        
        /**
         * Sets the "format" attribute
         */
        void setFormat(com.kyt.xsd.serviceeca.SetDocument.Set.Format.Enum format);
        
        /**
         * Sets (as xml) the "format" attribute
         */
        void xsetFormat(com.kyt.xsd.serviceeca.SetDocument.Set.Format format);
        
        /**
         * Unsets the "format" attribute
         */
        void unsetFormat();
        
        /**
         * An XML format(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.serviceeca.SetDocument$Set$Format.
         */
        public interface Format extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Format.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("formatec3eattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum APPEND = Enum.forString("append");
            static final Enum TO_UPPER = Enum.forString("to-upper");
            static final Enum TO_LOWER = Enum.forString("to-lower");
            static final Enum HASH_CODE = Enum.forString("hash-code");
            static final Enum LONG = Enum.forString("long");
            static final Enum DOUBLE = Enum.forString("double");
            static final Enum UPPER_FIRST_CHAR = Enum.forString("upper-first-char");
            static final Enum LOWER_FIRST_CHAR = Enum.forString("lower-first-char");
            static final Enum DB_TO_JAVA = Enum.forString("db-to-java");
            static final Enum JAVA_TO_DB = Enum.forString("java-to-db");
            
            static final int INT_APPEND = Enum.INT_APPEND;
            static final int INT_TO_UPPER = Enum.INT_TO_UPPER;
            static final int INT_TO_LOWER = Enum.INT_TO_LOWER;
            static final int INT_HASH_CODE = Enum.INT_HASH_CODE;
            static final int INT_LONG = Enum.INT_LONG;
            static final int INT_DOUBLE = Enum.INT_DOUBLE;
            static final int INT_UPPER_FIRST_CHAR = Enum.INT_UPPER_FIRST_CHAR;
            static final int INT_LOWER_FIRST_CHAR = Enum.INT_LOWER_FIRST_CHAR;
            static final int INT_DB_TO_JAVA = Enum.INT_DB_TO_JAVA;
            static final int INT_JAVA_TO_DB = Enum.INT_JAVA_TO_DB;
            
            /**
             * Enumeration value class for com.kyt.xsd.serviceeca.SetDocument$Set$Format.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_APPEND
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
                
                static final int INT_APPEND = 1;
                static final int INT_TO_UPPER = 2;
                static final int INT_TO_LOWER = 3;
                static final int INT_HASH_CODE = 4;
                static final int INT_LONG = 5;
                static final int INT_DOUBLE = 6;
                static final int INT_UPPER_FIRST_CHAR = 7;
                static final int INT_LOWER_FIRST_CHAR = 8;
                static final int INT_DB_TO_JAVA = 9;
                static final int INT_JAVA_TO_DB = 10;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("append", INT_APPEND),
                      new Enum("to-upper", INT_TO_UPPER),
                      new Enum("to-lower", INT_TO_LOWER),
                      new Enum("hash-code", INT_HASH_CODE),
                      new Enum("long", INT_LONG),
                      new Enum("double", INT_DOUBLE),
                      new Enum("upper-first-char", INT_UPPER_FIRST_CHAR),
                      new Enum("lower-first-char", INT_LOWER_FIRST_CHAR),
                      new Enum("db-to-java", INT_DB_TO_JAVA),
                      new Enum("java-to-db", INT_JAVA_TO_DB),
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
                public static com.kyt.xsd.serviceeca.SetDocument.Set.Format newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.serviceeca.SetDocument.Set.Format) type.newValue( obj ); }
                
                public static com.kyt.xsd.serviceeca.SetDocument.Set.Format newInstance() {
                  return (com.kyt.xsd.serviceeca.SetDocument.Set.Format) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.serviceeca.SetDocument.Set.Format newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.serviceeca.SetDocument.Set.Format) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.serviceeca.SetDocument.Set newInstance() {
              return (com.kyt.xsd.serviceeca.SetDocument.Set) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.serviceeca.SetDocument.Set newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.serviceeca.SetDocument.Set) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.serviceeca.SetDocument newInstance() {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.serviceeca.SetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.serviceeca.SetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.serviceeca.SetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.serviceeca.SetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.serviceeca.SetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.serviceeca.SetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.serviceeca.SetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.serviceeca.SetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.serviceeca.SetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.serviceeca.SetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.serviceeca.SetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.serviceeca.SetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.serviceeca.SetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.serviceeca.SetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.serviceeca.SetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceeca.SetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceeca.SetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceeca.SetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
