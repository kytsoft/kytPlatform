/*
 * An XML document type.
 * Localname: service-config
 * Namespace: 
 * Java type: com.kyt.xsd.serviceconfig.ServiceConfigDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceconfig;


/**
 * A document containing one service-config(@) element.
 *
 * This is a complex type.
 */
public interface ServiceConfigDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceConfigDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D637E5802563A0747322C44F433925D").resolveHandle("serviceconfig6213doctype");
    
    /**
     * Gets the "service-config" element
     */
    com.kyt.xsd.serviceconfig.ServiceConfigDocument.ServiceConfig getServiceConfig();
    
    /**
     * Sets the "service-config" element
     */
    void setServiceConfig(com.kyt.xsd.serviceconfig.ServiceConfigDocument.ServiceConfig serviceConfig);
    
    /**
     * Appends and returns a new empty "service-config" element
     */
    com.kyt.xsd.serviceconfig.ServiceConfigDocument.ServiceConfig addNewServiceConfig();
    
    /**
     * An XML service-config(@).
     *
     * This is a complex type.
     */
    public interface ServiceConfig extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D637E5802563A0747322C44F433925D").resolveHandle("serviceconfig0cedelemtype");
        
        /**
         * Gets array of all "service-engine" elements
         */
        com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine[] getServiceEngineArray();
        
        /**
         * Gets ith "service-engine" element
         */
        com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine getServiceEngineArray(int i);
        
        /**
         * Returns number of "service-engine" element
         */
        int sizeOfServiceEngineArray();
        
        /**
         * Sets array of all "service-engine" element
         */
        void setServiceEngineArray(com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine[] serviceEngineArray);
        
        /**
         * Sets ith "service-engine" element
         */
        void setServiceEngineArray(int i, com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine serviceEngine);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "service-engine" element
         */
        com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine insertNewServiceEngine(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "service-engine" element
         */
        com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine addNewServiceEngine();
        
        /**
         * Removes the ith "service-engine" element
         */
        void removeServiceEngine(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.serviceconfig.ServiceConfigDocument.ServiceConfig newInstance() {
              return (com.kyt.xsd.serviceconfig.ServiceConfigDocument.ServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.serviceconfig.ServiceConfigDocument.ServiceConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.serviceconfig.ServiceConfigDocument.ServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument newInstance() {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceconfig.ServiceConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceconfig.ServiceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
