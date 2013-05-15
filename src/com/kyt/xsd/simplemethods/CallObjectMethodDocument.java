/*
 * An XML document type.
 * Localname: call-object-method
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.CallObjectMethodDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one call-object-method(@) element.
 *
 * This is a complex type.
 */
public interface CallObjectMethodDocument extends com.kyt.xsd.simplemethods.CallOperationsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CallObjectMethodDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("callobjectmethodee39doctype");
    
    /**
     * Gets the "call-object-method" element
     */
    com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod getCallObjectMethod();
    
    /**
     * Sets the "call-object-method" element
     */
    void setCallObjectMethod(com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod callObjectMethod);
    
    /**
     * Appends and returns a new empty "call-object-method" element
     */
    com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod addNewCallObjectMethod();
    
    /**
     * An XML call-object-method(@).
     *
     * This is a complex type.
     */
    public interface CallObjectMethod extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CallObjectMethod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("callobjectmethod132delemtype");
        
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
         * Gets the "obj-field" attribute
         */
        java.lang.String getObjField();
        
        /**
         * Gets (as xml) the "obj-field" attribute
         */
        org.apache.xmlbeans.XmlString xgetObjField();
        
        /**
         * Sets the "obj-field" attribute
         */
        void setObjField(java.lang.String objField);
        
        /**
         * Sets (as xml) the "obj-field" attribute
         */
        void xsetObjField(org.apache.xmlbeans.XmlString objField);
        
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
         * Gets the "ret-field" attribute
         */
        java.lang.String getRetField();
        
        /**
         * Gets (as xml) the "ret-field" attribute
         */
        org.apache.xmlbeans.XmlString xgetRetField();
        
        /**
         * True if has "ret-field" attribute
         */
        boolean isSetRetField();
        
        /**
         * Sets the "ret-field" attribute
         */
        void setRetField(java.lang.String retField);
        
        /**
         * Sets (as xml) the "ret-field" attribute
         */
        void xsetRetField(org.apache.xmlbeans.XmlString retField);
        
        /**
         * Unsets the "ret-field" attribute
         */
        void unsetRetField();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod newInstance() {
              return (com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument newInstance() {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.CallObjectMethodDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.CallObjectMethodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
