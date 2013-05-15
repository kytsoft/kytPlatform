/*
 * An XML document type.
 * Localname: service-eca
 * Namespace: 
 * Java type: com.kyt.xsd.serviceeca.ServiceEcaDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceeca;


/**
 * A document containing one service-eca(@) element.
 *
 * This is a complex type.
 */
public interface ServiceEcaDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceEcaDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("serviceeca8252doctype");
    
    /**
     * Gets the "service-eca" element
     */
    com.kyt.xsd.serviceeca.ServiceEcaDocument.ServiceEca getServiceEca();
    
    /**
     * Sets the "service-eca" element
     */
    void setServiceEca(com.kyt.xsd.serviceeca.ServiceEcaDocument.ServiceEca serviceEca);
    
    /**
     * Appends and returns a new empty "service-eca" element
     */
    com.kyt.xsd.serviceeca.ServiceEcaDocument.ServiceEca addNewServiceEca();
    
    /**
     * An XML service-eca(@).
     *
     * This is a complex type.
     */
    public interface ServiceEca extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceEca.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s49739E8C6B658BE061B5E1F12BFAA25A").resolveHandle("serviceeca52f9elemtype");
        
        /**
         * Gets array of all "eca" elements
         */
        com.kyt.xsd.serviceeca.EcaDocument.Eca[] getEcaArray();
        
        /**
         * Gets ith "eca" element
         */
        com.kyt.xsd.serviceeca.EcaDocument.Eca getEcaArray(int i);
        
        /**
         * Returns number of "eca" element
         */
        int sizeOfEcaArray();
        
        /**
         * Sets array of all "eca" element
         */
        void setEcaArray(com.kyt.xsd.serviceeca.EcaDocument.Eca[] ecaArray);
        
        /**
         * Sets ith "eca" element
         */
        void setEcaArray(int i, com.kyt.xsd.serviceeca.EcaDocument.Eca eca);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "eca" element
         */
        com.kyt.xsd.serviceeca.EcaDocument.Eca insertNewEca(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "eca" element
         */
        com.kyt.xsd.serviceeca.EcaDocument.Eca addNewEca();
        
        /**
         * Removes the ith "eca" element
         */
        void removeEca(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.serviceeca.ServiceEcaDocument.ServiceEca newInstance() {
              return (com.kyt.xsd.serviceeca.ServiceEcaDocument.ServiceEca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.serviceeca.ServiceEcaDocument.ServiceEca newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.serviceeca.ServiceEcaDocument.ServiceEca) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument newInstance() {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceeca.ServiceEcaDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceeca.ServiceEcaDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
