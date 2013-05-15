/*
 * An XML document type.
 * Localname: jndi-config
 * Namespace: 
 * Java type: com.kyt.xsd.jndiconfig.JndiConfigDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.jndiconfig;


/**
 * A document containing one jndi-config(@) element.
 *
 * This is a complex type.
 */
public interface JndiConfigDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JndiConfigDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s00370B0382B381D7CE0E66259C46BC10").resolveHandle("jndiconfig72addoctype");
    
    /**
     * Gets the "jndi-config" element
     */
    com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig getJndiConfig();
    
    /**
     * Sets the "jndi-config" element
     */
    void setJndiConfig(com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig jndiConfig);
    
    /**
     * Appends and returns a new empty "jndi-config" element
     */
    com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig addNewJndiConfig();
    
    /**
     * An XML jndi-config(@).
     *
     * This is a complex type.
     */
    public interface JndiConfig extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JndiConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s00370B0382B381D7CE0E66259C46BC10").resolveHandle("jndiconfigf86felemtype");
        
        /**
         * Gets array of all "jndi-server" elements
         */
        com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer[] getJndiServerArray();
        
        /**
         * Gets ith "jndi-server" element
         */
        com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer getJndiServerArray(int i);
        
        /**
         * Returns number of "jndi-server" element
         */
        int sizeOfJndiServerArray();
        
        /**
         * Sets array of all "jndi-server" element
         */
        void setJndiServerArray(com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer[] jndiServerArray);
        
        /**
         * Sets ith "jndi-server" element
         */
        void setJndiServerArray(int i, com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer jndiServer);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "jndi-server" element
         */
        com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer insertNewJndiServer(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "jndi-server" element
         */
        com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer addNewJndiServer();
        
        /**
         * Removes the ith "jndi-server" element
         */
        void removeJndiServer(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig newInstance() {
              return (com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument newInstance() {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.jndiconfig.JndiConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.jndiconfig.JndiConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
