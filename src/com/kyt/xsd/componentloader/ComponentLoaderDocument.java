/*
 * An XML document type.
 * Localname: component-loader
 * Namespace: 
 * Java type: com.kyt.xsd.componentloader.ComponentLoaderDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.componentloader;


/**
 * A document containing one component-loader(@) element.
 *
 * This is a complex type.
 */
public interface ComponentLoaderDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComponentLoaderDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2AE18A3ABC618611495E308C6E1E366F").resolveHandle("componentloader4d5cdoctype");
    
    /**
     * Gets the "component-loader" element
     */
    com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader getComponentLoader();
    
    /**
     * Sets the "component-loader" element
     */
    void setComponentLoader(com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader componentLoader);
    
    /**
     * Appends and returns a new empty "component-loader" element
     */
    com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader addNewComponentLoader();
    
    /**
     * An XML component-loader(@).
     *
     * This is a complex type.
     */
    public interface ComponentLoader extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComponentLoader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2AE18A3ABC618611495E308C6E1E366F").resolveHandle("componentloader4f8delemtype");
        
        /**
         * Gets array of all "load-component" elements
         */
        com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent[] getLoadComponentArray();
        
        /**
         * Gets ith "load-component" element
         */
        com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent getLoadComponentArray(int i);
        
        /**
         * Returns number of "load-component" element
         */
        int sizeOfLoadComponentArray();
        
        /**
         * Sets array of all "load-component" element
         */
        void setLoadComponentArray(com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent[] loadComponentArray);
        
        /**
         * Sets ith "load-component" element
         */
        void setLoadComponentArray(int i, com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent loadComponent);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "load-component" element
         */
        com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent insertNewLoadComponent(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "load-component" element
         */
        com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent addNewLoadComponent();
        
        /**
         * Removes the ith "load-component" element
         */
        void removeLoadComponent(int i);
        
        /**
         * Gets array of all "load-components" elements
         */
        com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents[] getLoadComponentsArray();
        
        /**
         * Gets ith "load-components" element
         */
        com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents getLoadComponentsArray(int i);
        
        /**
         * Returns number of "load-components" element
         */
        int sizeOfLoadComponentsArray();
        
        /**
         * Sets array of all "load-components" element
         */
        void setLoadComponentsArray(com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents[] loadComponentsArray);
        
        /**
         * Sets ith "load-components" element
         */
        void setLoadComponentsArray(int i, com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents loadComponents);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "load-components" element
         */
        com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents insertNewLoadComponents(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "load-components" element
         */
        com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents addNewLoadComponents();
        
        /**
         * Removes the ith "load-components" element
         */
        void removeLoadComponents(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader newInstance() {
              return (com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument newInstance() {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.componentloader.ComponentLoaderDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.componentloader.ComponentLoaderDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
