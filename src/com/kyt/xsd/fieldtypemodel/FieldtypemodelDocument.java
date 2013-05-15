/*
 * An XML document type.
 * Localname: fieldtypemodel
 * Namespace: 
 * Java type: com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.fieldtypemodel;


/**
 * A document containing one fieldtypemodel(@) element.
 *
 * This is a complex type.
 */
public interface FieldtypemodelDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FieldtypemodelDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5DF7EEFB5972D9CA0C0A44A43867B1BF").resolveHandle("fieldtypemodelf92edoctype");
    
    /**
     * Gets the "fieldtypemodel" element
     */
    com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel getFieldtypemodel();
    
    /**
     * Sets the "fieldtypemodel" element
     */
    void setFieldtypemodel(com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel fieldtypemodel);
    
    /**
     * Appends and returns a new empty "fieldtypemodel" element
     */
    com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel addNewFieldtypemodel();
    
    /**
     * An XML fieldtypemodel(@).
     *
     * This is a complex type.
     */
    public interface Fieldtypemodel extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Fieldtypemodel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5DF7EEFB5972D9CA0C0A44A43867B1BF").resolveHandle("fieldtypemodelc64delemtype");
        
        /**
         * Gets array of all "field-type-def" elements
         */
        com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef[] getFieldTypeDefArray();
        
        /**
         * Gets ith "field-type-def" element
         */
        com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef getFieldTypeDefArray(int i);
        
        /**
         * Returns number of "field-type-def" element
         */
        int sizeOfFieldTypeDefArray();
        
        /**
         * Sets array of all "field-type-def" element
         */
        void setFieldTypeDefArray(com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef[] fieldTypeDefArray);
        
        /**
         * Sets ith "field-type-def" element
         */
        void setFieldTypeDefArray(int i, com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef fieldTypeDef);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field-type-def" element
         */
        com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef insertNewFieldTypeDef(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field-type-def" element
         */
        com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef addNewFieldTypeDef();
        
        /**
         * Removes the ith "field-type-def" element
         */
        void removeFieldTypeDef(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel newInstance() {
              return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument newInstance() {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
