/*
 * An XML document type.
 * Localname: request-parameters-to-list
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.RequestParametersToListDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one request-parameters-to-list(@) element.
 *
 * This is a complex type.
 */
public interface RequestParametersToListDocument extends com.kyt.xsd.simplemethods.EventOperationsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestParametersToListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("requestparameterstolist6304doctype");
    
    /**
     * Gets the "request-parameters-to-list" element
     */
    com.kyt.xsd.simplemethods.RequestParametersToListDocument.RequestParametersToList getRequestParametersToList();
    
    /**
     * Sets the "request-parameters-to-list" element
     */
    void setRequestParametersToList(com.kyt.xsd.simplemethods.RequestParametersToListDocument.RequestParametersToList requestParametersToList);
    
    /**
     * Appends and returns a new empty "request-parameters-to-list" element
     */
    com.kyt.xsd.simplemethods.RequestParametersToListDocument.RequestParametersToList addNewRequestParametersToList();
    
    /**
     * An XML request-parameters-to-list(@).
     *
     * This is a complex type.
     */
    public interface RequestParametersToList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestParametersToList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("requestparameterstolistd60delemtype");
        
        /**
         * Gets the "request-name" attribute
         */
        java.lang.String getRequestName();
        
        /**
         * Gets (as xml) the "request-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetRequestName();
        
        /**
         * Sets the "request-name" attribute
         */
        void setRequestName(java.lang.String requestName);
        
        /**
         * Sets (as xml) the "request-name" attribute
         */
        void xsetRequestName(org.apache.xmlbeans.XmlString requestName);
        
        /**
         * Gets the "list-name" attribute
         */
        java.lang.String getListName();
        
        /**
         * Gets (as xml) the "list-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetListName();
        
        /**
         * True if has "list-name" attribute
         */
        boolean isSetListName();
        
        /**
         * Sets the "list-name" attribute
         */
        void setListName(java.lang.String listName);
        
        /**
         * Sets (as xml) the "list-name" attribute
         */
        void xsetListName(org.apache.xmlbeans.XmlString listName);
        
        /**
         * Unsets the "list-name" attribute
         */
        void unsetListName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.RequestParametersToListDocument.RequestParametersToList newInstance() {
              return (com.kyt.xsd.simplemethods.RequestParametersToListDocument.RequestParametersToList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.RequestParametersToListDocument.RequestParametersToList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.RequestParametersToListDocument.RequestParametersToList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument newInstance() {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.RequestParametersToListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.RequestParametersToListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
