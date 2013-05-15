/*
 * An XML document type.
 * Localname: before-logout
 * Namespace: 
 * Java type: com.kyt.xsd.siteconf.BeforeLogoutDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.siteconf;


/**
 * A document containing one before-logout(@) element.
 *
 * This is a complex type.
 */
public interface BeforeLogoutDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BeforeLogoutDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s84D90CD5D79D0AAA45EE7E769F6351B0").resolveHandle("beforelogoute7bfdoctype");
    
    /**
     * Gets the "before-logout" element
     */
    com.kyt.xsd.siteconf.BeforeLogoutDocument.BeforeLogout getBeforeLogout();
    
    /**
     * Sets the "before-logout" element
     */
    void setBeforeLogout(com.kyt.xsd.siteconf.BeforeLogoutDocument.BeforeLogout beforeLogout);
    
    /**
     * Appends and returns a new empty "before-logout" element
     */
    com.kyt.xsd.siteconf.BeforeLogoutDocument.BeforeLogout addNewBeforeLogout();
    
    /**
     * An XML before-logout(@).
     *
     * This is a complex type.
     */
    public interface BeforeLogout extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BeforeLogout.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s84D90CD5D79D0AAA45EE7E769F6351B0").resolveHandle("beforelogout35d3elemtype");
        
        /**
         * Gets array of all "event" elements
         */
        com.kyt.xsd.siteconf.EventDocument.Event[] getEventArray();
        
        /**
         * Gets ith "event" element
         */
        com.kyt.xsd.siteconf.EventDocument.Event getEventArray(int i);
        
        /**
         * Returns number of "event" element
         */
        int sizeOfEventArray();
        
        /**
         * Sets array of all "event" element
         */
        void setEventArray(com.kyt.xsd.siteconf.EventDocument.Event[] eventArray);
        
        /**
         * Sets ith "event" element
         */
        void setEventArray(int i, com.kyt.xsd.siteconf.EventDocument.Event event);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "event" element
         */
        com.kyt.xsd.siteconf.EventDocument.Event insertNewEvent(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "event" element
         */
        com.kyt.xsd.siteconf.EventDocument.Event addNewEvent();
        
        /**
         * Removes the ith "event" element
         */
        void removeEvent(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.siteconf.BeforeLogoutDocument.BeforeLogout newInstance() {
              return (com.kyt.xsd.siteconf.BeforeLogoutDocument.BeforeLogout) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.siteconf.BeforeLogoutDocument.BeforeLogout newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.siteconf.BeforeLogoutDocument.BeforeLogout) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument newInstance() {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.siteconf.BeforeLogoutDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.siteconf.BeforeLogoutDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
