/*
 * An XML document type.
 * Localname: sql-load-path
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.SqlLoadPathDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig;


/**
 * A document containing one sql-load-path(@) element.
 *
 * This is a complex type.
 */
public interface SqlLoadPathDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SqlLoadPathDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("sqlloadpath5b94doctype");
    
    /**
     * Gets the "sql-load-path" element
     */
    com.kyt.xsd.entityconfig.SqlLoadPathDocument.SqlLoadPath getSqlLoadPath();
    
    /**
     * Sets the "sql-load-path" element
     */
    void setSqlLoadPath(com.kyt.xsd.entityconfig.SqlLoadPathDocument.SqlLoadPath sqlLoadPath);
    
    /**
     * Appends and returns a new empty "sql-load-path" element
     */
    com.kyt.xsd.entityconfig.SqlLoadPathDocument.SqlLoadPath addNewSqlLoadPath();
    
    /**
     * An XML sql-load-path(@).
     *
     * This is a complex type.
     */
    public interface SqlLoadPath extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SqlLoadPath.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("sqlloadpathd37delemtype");
        
        /**
         * Gets the "path" attribute
         */
        java.lang.String getPath();
        
        /**
         * Gets (as xml) the "path" attribute
         */
        org.apache.xmlbeans.XmlString xgetPath();
        
        /**
         * Sets the "path" attribute
         */
        void setPath(java.lang.String path);
        
        /**
         * Sets (as xml) the "path" attribute
         */
        void xsetPath(org.apache.xmlbeans.XmlString path);
        
        /**
         * Gets the "prepend-env" attribute
         */
        java.lang.String getPrependEnv();
        
        /**
         * Gets (as xml) the "prepend-env" attribute
         */
        org.apache.xmlbeans.XmlString xgetPrependEnv();
        
        /**
         * True if has "prepend-env" attribute
         */
        boolean isSetPrependEnv();
        
        /**
         * Sets the "prepend-env" attribute
         */
        void setPrependEnv(java.lang.String prependEnv);
        
        /**
         * Sets (as xml) the "prepend-env" attribute
         */
        void xsetPrependEnv(org.apache.xmlbeans.XmlString prependEnv);
        
        /**
         * Unsets the "prepend-env" attribute
         */
        void unsetPrependEnv();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.entityconfig.SqlLoadPathDocument.SqlLoadPath newInstance() {
              return (com.kyt.xsd.entityconfig.SqlLoadPathDocument.SqlLoadPath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.entityconfig.SqlLoadPathDocument.SqlLoadPath newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.entityconfig.SqlLoadPathDocument.SqlLoadPath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument newInstance() {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityconfig.SqlLoadPathDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityconfig.SqlLoadPathDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
