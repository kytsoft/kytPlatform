/*
 * An XML document type.
 * Localname: load-component
 * Namespace: 
 * Java type: com.kyt.xsd.componentloader.LoadComponentDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.componentloader;


/**
 * A document containing one load-component(@) element.
 *
 * This is a complex type.
 */
public interface LoadComponentDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoadComponentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2AE18A3ABC618611495E308C6E1E366F").resolveHandle("loadcomponent9d8fdoctype");
    
    /**
     * Gets the "load-component" element
     */
    com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent getLoadComponent();
    
    /**
     * Sets the "load-component" element
     */
    void setLoadComponent(com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent loadComponent);
    
    /**
     * Appends and returns a new empty "load-component" element
     */
    com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent addNewLoadComponent();
    
    /**
     * An XML load-component(@).
     *
     * This is a complex type.
     */
    public interface LoadComponent extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoadComponent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2AE18A3ABC618611495E308C6E1E366F").resolveHandle("loadcomponentf46delemtype");
        
        /**
         * Gets the "component-name" attribute
         */
        java.lang.String getComponentName();
        
        /**
         * Gets (as xml) the "component-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetComponentName();
        
        /**
         * True if has "component-name" attribute
         */
        boolean isSetComponentName();
        
        /**
         * Sets the "component-name" attribute
         */
        void setComponentName(java.lang.String componentName);
        
        /**
         * Sets (as xml) the "component-name" attribute
         */
        void xsetComponentName(org.apache.xmlbeans.XmlString componentName);
        
        /**
         * Unsets the "component-name" attribute
         */
        void unsetComponentName();
        
        /**
         * Gets the "component-location" attribute
         */
        java.lang.String getComponentLocation();
        
        /**
         * Gets (as xml) the "component-location" attribute
         */
        org.apache.xmlbeans.XmlString xgetComponentLocation();
        
        /**
         * Sets the "component-location" attribute
         */
        void setComponentLocation(java.lang.String componentLocation);
        
        /**
         * Sets (as xml) the "component-location" attribute
         */
        void xsetComponentLocation(org.apache.xmlbeans.XmlString componentLocation);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent newInstance() {
              return (com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.componentloader.LoadComponentDocument newInstance() {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.componentloader.LoadComponentDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.componentloader.LoadComponentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.componentloader.LoadComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
