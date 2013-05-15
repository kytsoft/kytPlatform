/*
 * An XML document type.
 * Localname: service-groups
 * Namespace: 
 * Java type: com.kyt.xsd.serviceconfig.ServiceGroupsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceconfig;


/**
 * A document containing one service-groups(@) element.
 *
 * This is a complex type.
 */
public interface ServiceGroupsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceGroupsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D637E5802563A0747322C44F433925D").resolveHandle("servicegroupsb8a5doctype");
    
    /**
     * Gets the "service-groups" element
     */
    com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups getServiceGroups();
    
    /**
     * Sets the "service-groups" element
     */
    void setServiceGroups(com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups serviceGroups);
    
    /**
     * Appends and returns a new empty "service-groups" element
     */
    com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups addNewServiceGroups();
    
    /**
     * An XML service-groups(@).
     *
     * This is a complex type.
     */
    public interface ServiceGroups extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceGroups.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D637E5802563A0747322C44F433925D").resolveHandle("servicegroupsc32delemtype");
        
        /**
         * Gets the "loader" attribute
         */
        java.lang.String getLoader();
        
        /**
         * Gets (as xml) the "loader" attribute
         */
        org.apache.xmlbeans.XmlString xgetLoader();
        
        /**
         * Sets the "loader" attribute
         */
        void setLoader(java.lang.String loader);
        
        /**
         * Sets (as xml) the "loader" attribute
         */
        void xsetLoader(org.apache.xmlbeans.XmlString loader);
        
        /**
         * Gets the "location" attribute
         */
        java.lang.String getLocation();
        
        /**
         * Gets (as xml) the "location" attribute
         */
        org.apache.xmlbeans.XmlString xgetLocation();
        
        /**
         * Sets the "location" attribute
         */
        void setLocation(java.lang.String location);
        
        /**
         * Sets (as xml) the "location" attribute
         */
        void xsetLocation(org.apache.xmlbeans.XmlString location);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups newInstance() {
              return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument newInstance() {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceconfig.ServiceGroupsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceconfig.ServiceGroupsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
