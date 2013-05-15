/*
 * An XML document type.
 * Localname: notification
 * Namespace: 
 * Java type: com.kyt.xsd.serviceconfig.NotificationDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceconfig;


/**
 * A document containing one notification(@) element.
 *
 * This is a complex type.
 */
public interface NotificationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NotificationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D637E5802563A0747322C44F433925D").resolveHandle("notificationa3e4doctype");
    
    /**
     * Gets the "notification" element
     */
    com.kyt.xsd.serviceconfig.NotificationDocument.Notification getNotification();
    
    /**
     * Sets the "notification" element
     */
    void setNotification(com.kyt.xsd.serviceconfig.NotificationDocument.Notification notification);
    
    /**
     * Appends and returns a new empty "notification" element
     */
    com.kyt.xsd.serviceconfig.NotificationDocument.Notification addNewNotification();
    
    /**
     * An XML notification(@).
     *
     * This is a complex type.
     */
    public interface Notification extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Notification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D637E5802563A0747322C44F433925D").resolveHandle("notificationdf8delemtype");
        
        /**
         * Gets the "subject" attribute
         */
        java.lang.String getSubject();
        
        /**
         * Gets (as xml) the "subject" attribute
         */
        org.apache.xmlbeans.XmlString xgetSubject();
        
        /**
         * Sets the "subject" attribute
         */
        void setSubject(java.lang.String subject);
        
        /**
         * Sets (as xml) the "subject" attribute
         */
        void xsetSubject(org.apache.xmlbeans.XmlString subject);
        
        /**
         * Gets the "screen" attribute
         */
        java.lang.String getScreen();
        
        /**
         * Gets (as xml) the "screen" attribute
         */
        org.apache.xmlbeans.XmlString xgetScreen();
        
        /**
         * Sets the "screen" attribute
         */
        void setScreen(java.lang.String screen);
        
        /**
         * Sets (as xml) the "screen" attribute
         */
        void xsetScreen(org.apache.xmlbeans.XmlString screen);
        
        /**
         * Gets the "service" attribute
         */
        java.lang.String getService();
        
        /**
         * Gets (as xml) the "service" attribute
         */
        org.apache.xmlbeans.XmlString xgetService();
        
        /**
         * True if has "service" attribute
         */
        boolean isSetService();
        
        /**
         * Sets the "service" attribute
         */
        void setService(java.lang.String service);
        
        /**
         * Sets (as xml) the "service" attribute
         */
        void xsetService(org.apache.xmlbeans.XmlString service);
        
        /**
         * Unsets the "service" attribute
         */
        void unsetService();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.serviceconfig.NotificationDocument.Notification newInstance() {
              return (com.kyt.xsd.serviceconfig.NotificationDocument.Notification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.serviceconfig.NotificationDocument.Notification newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.serviceconfig.NotificationDocument.Notification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.serviceconfig.NotificationDocument newInstance() {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceconfig.NotificationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceconfig.NotificationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
