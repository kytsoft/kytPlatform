/*
 * An XML document type.
 * Localname: log
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.LogDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one log(@) element.
 *
 * This is a complex type.
 */
public interface LogDocument extends com.kyt.xsd.simplemethods.OtherOperationsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LogDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("log9c2bdoctype");
    
    /**
     * Gets the "log" element
     */
    com.kyt.xsd.simplemethods.LogDocument.Log getLog();
    
    /**
     * Sets the "log" element
     */
    void setLog(com.kyt.xsd.simplemethods.LogDocument.Log log);
    
    /**
     * Appends and returns a new empty "log" element
     */
    com.kyt.xsd.simplemethods.LogDocument.Log addNewLog();
    
    /**
     * An XML log(@).
     *
     * This is a complex type.
     */
    public interface Log extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Log.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("logf7ebelemtype");
        
        /**
         * Gets array of all "field" elements
         */
        com.kyt.xsd.simplemethods.FieldDocument.Field[] getFieldArray();
        
        /**
         * Gets ith "field" element
         */
        com.kyt.xsd.simplemethods.FieldDocument.Field getFieldArray(int i);
        
        /**
         * Returns number of "field" element
         */
        int sizeOfFieldArray();
        
        /**
         * Sets array of all "field" element
         */
        void setFieldArray(com.kyt.xsd.simplemethods.FieldDocument.Field[] fieldArray);
        
        /**
         * Sets ith "field" element
         */
        void setFieldArray(int i, com.kyt.xsd.simplemethods.FieldDocument.Field field);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field" element
         */
        com.kyt.xsd.simplemethods.FieldDocument.Field insertNewField(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field" element
         */
        com.kyt.xsd.simplemethods.FieldDocument.Field addNewField();
        
        /**
         * Removes the ith "field" element
         */
        void removeField(int i);
        
        /**
         * Gets array of all "string" elements
         */
        com.kyt.xsd.simplemethods.StringDocument.String[] getStringArray();
        
        /**
         * Gets ith "string" element
         */
        com.kyt.xsd.simplemethods.StringDocument.String getStringArray(int i);
        
        /**
         * Returns number of "string" element
         */
        int sizeOfStringArray();
        
        /**
         * Sets array of all "string" element
         */
        void setStringArray(com.kyt.xsd.simplemethods.StringDocument.String[] stringArray);
        
        /**
         * Sets ith "string" element
         */
        void setStringArray(int i, com.kyt.xsd.simplemethods.StringDocument.String string);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "string" element
         */
        com.kyt.xsd.simplemethods.StringDocument.String insertNewString(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "string" element
         */
        com.kyt.xsd.simplemethods.StringDocument.String addNewString();
        
        /**
         * Removes the ith "string" element
         */
        void removeString(int i);
        
        /**
         * Gets the "level" attribute
         */
        com.kyt.xsd.simplemethods.LogDocument.Log.Level.Enum getLevel();
        
        /**
         * Gets (as xml) the "level" attribute
         */
        com.kyt.xsd.simplemethods.LogDocument.Log.Level xgetLevel();
        
        /**
         * Sets the "level" attribute
         */
        void setLevel(com.kyt.xsd.simplemethods.LogDocument.Log.Level.Enum level);
        
        /**
         * Sets (as xml) the "level" attribute
         */
        void xsetLevel(com.kyt.xsd.simplemethods.LogDocument.Log.Level level);
        
        /**
         * Gets the "message" attribute
         */
        java.lang.String getMessage();
        
        /**
         * Gets (as xml) the "message" attribute
         */
        org.apache.xmlbeans.XmlString xgetMessage();
        
        /**
         * True if has "message" attribute
         */
        boolean isSetMessage();
        
        /**
         * Sets the "message" attribute
         */
        void setMessage(java.lang.String message);
        
        /**
         * Sets (as xml) the "message" attribute
         */
        void xsetMessage(org.apache.xmlbeans.XmlString message);
        
        /**
         * Unsets the "message" attribute
         */
        void unsetMessage();
        
        /**
         * An XML level(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.LogDocument$Log$Level.
         */
        public interface Level extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Level.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("level3ad7attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum VERBOSE = Enum.forString("verbose");
            static final Enum TIMING = Enum.forString("timing");
            static final Enum INFO = Enum.forString("info");
            static final Enum IMPORTANT = Enum.forString("important");
            static final Enum WARNING = Enum.forString("warning");
            static final Enum ERROR = Enum.forString("error");
            static final Enum FATAL = Enum.forString("fatal");
            static final Enum ALWAYS = Enum.forString("always");
            
            static final int INT_VERBOSE = Enum.INT_VERBOSE;
            static final int INT_TIMING = Enum.INT_TIMING;
            static final int INT_INFO = Enum.INT_INFO;
            static final int INT_IMPORTANT = Enum.INT_IMPORTANT;
            static final int INT_WARNING = Enum.INT_WARNING;
            static final int INT_ERROR = Enum.INT_ERROR;
            static final int INT_FATAL = Enum.INT_FATAL;
            static final int INT_ALWAYS = Enum.INT_ALWAYS;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.LogDocument$Log$Level.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_VERBOSE
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
                
                static final int INT_VERBOSE = 1;
                static final int INT_TIMING = 2;
                static final int INT_INFO = 3;
                static final int INT_IMPORTANT = 4;
                static final int INT_WARNING = 5;
                static final int INT_ERROR = 6;
                static final int INT_FATAL = 7;
                static final int INT_ALWAYS = 8;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("verbose", INT_VERBOSE),
                      new Enum("timing", INT_TIMING),
                      new Enum("info", INT_INFO),
                      new Enum("important", INT_IMPORTANT),
                      new Enum("warning", INT_WARNING),
                      new Enum("error", INT_ERROR),
                      new Enum("fatal", INT_FATAL),
                      new Enum("always", INT_ALWAYS),
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
                public static com.kyt.xsd.simplemethods.LogDocument.Log.Level newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.LogDocument.Log.Level) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.LogDocument.Log.Level newInstance() {
                  return (com.kyt.xsd.simplemethods.LogDocument.Log.Level) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.LogDocument.Log.Level newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.LogDocument.Log.Level) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.LogDocument.Log newInstance() {
              return (com.kyt.xsd.simplemethods.LogDocument.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.LogDocument.Log newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.LogDocument.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.LogDocument newInstance() {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.LogDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.LogDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.LogDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.LogDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.LogDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.LogDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.LogDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.LogDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.LogDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.LogDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.LogDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.LogDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.LogDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.LogDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.LogDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.LogDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.LogDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.LogDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
