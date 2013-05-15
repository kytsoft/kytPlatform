/*
 * An XML document type.
 * Localname: notification-group
 * Namespace: 
 * Java type: com.kyt.xsd.serviceconfig.NotificationGroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceconfig;


/**
 * A document containing one notification-group(@) element.
 *
 * This is a complex type.
 */
public interface NotificationGroupDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NotificationGroupDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D637E5802563A0747322C44F433925D").resolveHandle("notificationgroup3356doctype");
    
    /**
     * Gets the "notification-group" element
     */
    com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup getNotificationGroup();
    
    /**
     * Sets the "notification-group" element
     */
    void setNotificationGroup(com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup notificationGroup);
    
    /**
     * Appends and returns a new empty "notification-group" element
     */
    com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup addNewNotificationGroup();
    
    /**
     * An XML notification-group(@).
     *
     * This is a complex type.
     */
    public interface NotificationGroup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NotificationGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D637E5802563A0747322C44F433925D").resolveHandle("notificationgroup574delemtype");
        
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
         * Gets array of all "notify" elements
         */
        com.kyt.xsd.serviceconfig.NotifyDocument.Notify[] getNotifyArray();
        
        /**
         * Gets ith "notify" element
         */
        com.kyt.xsd.serviceconfig.NotifyDocument.Notify getNotifyArray(int i);
        
        /**
         * Returns number of "notify" element
         */
        int sizeOfNotifyArray();
        
        /**
         * Sets array of all "notify" element
         */
        void setNotifyArray(com.kyt.xsd.serviceconfig.NotifyDocument.Notify[] notifyArray);
        
        /**
         * Sets ith "notify" element
         */
        void setNotifyArray(int i, com.kyt.xsd.serviceconfig.NotifyDocument.Notify notify);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "notify" element
         */
        com.kyt.xsd.serviceconfig.NotifyDocument.Notify insertNewNotify(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "notify" element
         */
        com.kyt.xsd.serviceconfig.NotifyDocument.Notify addNewNotify();
        
        /**
         * Removes the ith "notify" element
         */
        void removeNotify(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup newInstance() {
              return (com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument newInstance() {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceconfig.NotificationGroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceconfig.NotificationGroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
