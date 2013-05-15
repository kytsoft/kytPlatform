/*
 * An XML document type.
 * Localname: group-map
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.GroupMapDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig;


/**
 * A document containing one group-map(@) element.
 *
 * This is a complex type.
 */
public interface GroupMapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GroupMapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("groupmap28b5doctype");
    
    /**
     * Gets the "group-map" element
     */
    com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap getGroupMap();
    
    /**
     * Sets the "group-map" element
     */
    void setGroupMap(com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap groupMap);
    
    /**
     * Appends and returns a new empty "group-map" element
     */
    com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap addNewGroupMap();
    
    /**
     * An XML group-map(@).
     *
     * This is a complex type.
     */
    public interface GroupMap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GroupMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("groupmap313felemtype");
        
        /**
         * Gets the "group-name" attribute
         */
        java.lang.String getGroupName();
        
        /**
         * Gets (as xml) the "group-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetGroupName();
        
        /**
         * Sets the "group-name" attribute
         */
        void setGroupName(java.lang.String groupName);
        
        /**
         * Sets (as xml) the "group-name" attribute
         */
        void xsetGroupName(org.apache.xmlbeans.XmlString groupName);
        
        /**
         * Gets the "datasource-name" attribute
         */
        java.lang.String getDatasourceName();
        
        /**
         * Gets (as xml) the "datasource-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetDatasourceName();
        
        /**
         * Sets the "datasource-name" attribute
         */
        void setDatasourceName(java.lang.String datasourceName);
        
        /**
         * Sets (as xml) the "datasource-name" attribute
         */
        void xsetDatasourceName(org.apache.xmlbeans.XmlString datasourceName);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap newInstance() {
              return (com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.entityconfig.GroupMapDocument newInstance() {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.entityconfig.GroupMapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityconfig.GroupMapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityconfig.GroupMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
