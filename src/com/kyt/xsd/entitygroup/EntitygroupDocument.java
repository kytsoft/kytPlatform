/*
 * An XML document type.
 * Localname: entitygroup
 * Namespace: 
 * Java type: com.kyt.xsd.entitygroup.EntitygroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitygroup;


/**
 * A document containing one entitygroup(@) element.
 *
 * This is a complex type.
 */
public interface EntitygroupDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntitygroupDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2ABA91212F8F5A7D7297A604D7ED519F").resolveHandle("entitygroup2a63doctype");
    
    /**
     * Gets the "entitygroup" element
     */
    com.kyt.xsd.entitygroup.EntitygroupDocument.Entitygroup getEntitygroup();
    
    /**
     * Sets the "entitygroup" element
     */
    void setEntitygroup(com.kyt.xsd.entitygroup.EntitygroupDocument.Entitygroup entitygroup);
    
    /**
     * Appends and returns a new empty "entitygroup" element
     */
    com.kyt.xsd.entitygroup.EntitygroupDocument.Entitygroup addNewEntitygroup();
    
    /**
     * An XML entitygroup(@).
     *
     * This is a complex type.
     */
    public interface Entitygroup extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Entitygroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s2ABA91212F8F5A7D7297A604D7ED519F").resolveHandle("entitygroupb15belemtype");
        
        /**
         * Gets array of all "entity-group" elements
         */
        com.kyt.xsd.entitygroup.EntityGroupDocument2.EntityGroup[] getEntityGroupArray();
        
        /**
         * Gets ith "entity-group" element
         */
        com.kyt.xsd.entitygroup.EntityGroupDocument2.EntityGroup getEntityGroupArray(int i);
        
        /**
         * Returns number of "entity-group" element
         */
        int sizeOfEntityGroupArray();
        
        /**
         * Sets array of all "entity-group" element
         */
        void setEntityGroupArray(com.kyt.xsd.entitygroup.EntityGroupDocument2.EntityGroup[] entityGroupArray);
        
        /**
         * Sets ith "entity-group" element
         */
        void setEntityGroupArray(int i, com.kyt.xsd.entitygroup.EntityGroupDocument2.EntityGroup entityGroup);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-group" element
         */
        com.kyt.xsd.entitygroup.EntityGroupDocument2.EntityGroup insertNewEntityGroup(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-group" element
         */
        com.kyt.xsd.entitygroup.EntityGroupDocument2.EntityGroup addNewEntityGroup();
        
        /**
         * Removes the ith "entity-group" element
         */
        void removeEntityGroup(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.entitygroup.EntitygroupDocument.Entitygroup newInstance() {
              return (com.kyt.xsd.entitygroup.EntitygroupDocument.Entitygroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.entitygroup.EntitygroupDocument.Entitygroup newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.entitygroup.EntitygroupDocument.Entitygroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.entitygroup.EntitygroupDocument newInstance() {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.entitygroup.EntitygroupDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entitygroup.EntitygroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entitygroup.EntitygroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
