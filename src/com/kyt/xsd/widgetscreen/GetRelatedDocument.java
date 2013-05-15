/*
 * An XML document type.
 * Localname: get-related
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.GetRelatedDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen;


/**
 * A document containing one get-related(@) element.
 *
 * This is a complex type.
 */
public interface GetRelatedDocument extends com.kyt.xsd.widgetscreen.AllActionsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetRelatedDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDBBEF08129F0DD9F5CC86C4698C5DE42").resolveHandle("getrelated7a9bdoctype");
    
    /**
     * Gets the "get-related" element
     */
    com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated getGetRelated();
    
    /**
     * Sets the "get-related" element
     */
    void setGetRelated(com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated getRelated);
    
    /**
     * Appends and returns a new empty "get-related" element
     */
    com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated addNewGetRelated();
    
    /**
     * An XML get-related(@).
     *
     * This is a complex type.
     */
    public interface GetRelated extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetRelated.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDBBEF08129F0DD9F5CC86C4698C5DE42").resolveHandle("getrelated8fcbelemtype");
        
        /**
         * Gets the "value-field" attribute
         */
        java.lang.String getValueField();
        
        /**
         * Gets (as xml) the "value-field" attribute
         */
        org.apache.xmlbeans.XmlString xgetValueField();
        
        /**
         * Sets the "value-field" attribute
         */
        void setValueField(java.lang.String valueField);
        
        /**
         * Sets (as xml) the "value-field" attribute
         */
        void xsetValueField(org.apache.xmlbeans.XmlString valueField);
        
        /**
         * Gets the "relation-name" attribute
         */
        java.lang.String getRelationName();
        
        /**
         * Gets (as xml) the "relation-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetRelationName();
        
        /**
         * Sets the "relation-name" attribute
         */
        void setRelationName(java.lang.String relationName);
        
        /**
         * Sets (as xml) the "relation-name" attribute
         */
        void xsetRelationName(org.apache.xmlbeans.XmlString relationName);
        
        /**
         * Gets the "map" attribute
         */
        java.lang.String getMap();
        
        /**
         * Gets (as xml) the "map" attribute
         */
        org.apache.xmlbeans.XmlString xgetMap();
        
        /**
         * True if has "map" attribute
         */
        boolean isSetMap();
        
        /**
         * Sets the "map" attribute
         */
        void setMap(java.lang.String map);
        
        /**
         * Sets (as xml) the "map" attribute
         */
        void xsetMap(org.apache.xmlbeans.XmlString map);
        
        /**
         * Unsets the "map" attribute
         */
        void unsetMap();
        
        /**
         * Gets the "order-by-list" attribute
         */
        java.lang.String getOrderByList();
        
        /**
         * Gets (as xml) the "order-by-list" attribute
         */
        org.apache.xmlbeans.XmlString xgetOrderByList();
        
        /**
         * True if has "order-by-list" attribute
         */
        boolean isSetOrderByList();
        
        /**
         * Sets the "order-by-list" attribute
         */
        void setOrderByList(java.lang.String orderByList);
        
        /**
         * Sets (as xml) the "order-by-list" attribute
         */
        void xsetOrderByList(org.apache.xmlbeans.XmlString orderByList);
        
        /**
         * Unsets the "order-by-list" attribute
         */
        void unsetOrderByList();
        
        /**
         * Gets the "use-cache" attribute
         */
        java.lang.String getUseCache();
        
        /**
         * Gets (as xml) the "use-cache" attribute
         */
        org.apache.xmlbeans.XmlString xgetUseCache();
        
        /**
         * True if has "use-cache" attribute
         */
        boolean isSetUseCache();
        
        /**
         * Sets the "use-cache" attribute
         */
        void setUseCache(java.lang.String useCache);
        
        /**
         * Sets (as xml) the "use-cache" attribute
         */
        void xsetUseCache(org.apache.xmlbeans.XmlString useCache);
        
        /**
         * Unsets the "use-cache" attribute
         */
        void unsetUseCache();
        
        /**
         * Gets the "list" attribute
         */
        java.lang.String getList();
        
        /**
         * Gets (as xml) the "list" attribute
         */
        org.apache.xmlbeans.XmlString xgetList();
        
        /**
         * Sets the "list" attribute
         */
        void setList(java.lang.String list);
        
        /**
         * Sets (as xml) the "list" attribute
         */
        void xsetList(org.apache.xmlbeans.XmlString list);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated newInstance() {
              return (com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument newInstance() {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetscreen.GetRelatedDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetscreen.GetRelatedDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
