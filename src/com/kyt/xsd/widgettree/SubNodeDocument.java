/*
 * An XML document type.
 * Localname: sub-node
 * Namespace: 
 * Java type: com.kyt.xsd.widgettree.SubNodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgettree;


/**
 * A document containing one sub-node(@) element.
 *
 * This is a complex type.
 */
public interface SubNodeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubNodeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("subnode78e8doctype");
    
    /**
     * Gets the "sub-node" element
     */
    com.kyt.xsd.widgettree.SubNodeDocument.SubNode getSubNode();
    
    /**
     * Sets the "sub-node" element
     */
    void setSubNode(com.kyt.xsd.widgettree.SubNodeDocument.SubNode subNode);
    
    /**
     * Appends and returns a new empty "sub-node" element
     */
    com.kyt.xsd.widgettree.SubNodeDocument.SubNode addNewSubNode();
    
    /**
     * An XML sub-node(@).
     *
     * This is a complex type.
     */
    public interface SubNode extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubNode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("subnodec20delemtype");
        
        /**
         * Gets the "entity-and" element
         */
        com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd getEntityAnd();
        
        /**
         * True if has "entity-and" element
         */
        boolean isSetEntityAnd();
        
        /**
         * Sets the "entity-and" element
         */
        void setEntityAnd(com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd entityAnd);
        
        /**
         * Appends and returns a new empty "entity-and" element
         */
        com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd addNewEntityAnd();
        
        /**
         * Unsets the "entity-and" element
         */
        void unsetEntityAnd();
        
        /**
         * Gets the "service" element
         */
        com.kyt.xsd.widgettree.ServiceDocument.Service getService();
        
        /**
         * True if has "service" element
         */
        boolean isSetService();
        
        /**
         * Sets the "service" element
         */
        void setService(com.kyt.xsd.widgettree.ServiceDocument.Service service);
        
        /**
         * Appends and returns a new empty "service" element
         */
        com.kyt.xsd.widgettree.ServiceDocument.Service addNewService();
        
        /**
         * Unsets the "service" element
         */
        void unsetService();
        
        /**
         * Gets the "entity-condition" element
         */
        com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition getEntityCondition();
        
        /**
         * True if has "entity-condition" element
         */
        boolean isSetEntityCondition();
        
        /**
         * Sets the "entity-condition" element
         */
        void setEntityCondition(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition entityCondition);
        
        /**
         * Appends and returns a new empty "entity-condition" element
         */
        com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition addNewEntityCondition();
        
        /**
         * Unsets the "entity-condition" element
         */
        void unsetEntityCondition();
        
        /**
         * Gets array of all "out-field-map" elements
         */
        com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap[] getOutFieldMapArray();
        
        /**
         * Gets ith "out-field-map" element
         */
        com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap getOutFieldMapArray(int i);
        
        /**
         * Returns number of "out-field-map" element
         */
        int sizeOfOutFieldMapArray();
        
        /**
         * Sets array of all "out-field-map" element
         */
        void setOutFieldMapArray(com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap[] outFieldMapArray);
        
        /**
         * Sets ith "out-field-map" element
         */
        void setOutFieldMapArray(int i, com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap outFieldMap);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "out-field-map" element
         */
        com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap insertNewOutFieldMap(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out-field-map" element
         */
        com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap addNewOutFieldMap();
        
        /**
         * Removes the ith "out-field-map" element
         */
        void removeOutFieldMap(int i);
        
        /**
         * Gets the "node-name" attribute
         */
        java.lang.String getNodeName();
        
        /**
         * Gets (as xml) the "node-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetNodeName();
        
        /**
         * Sets the "node-name" attribute
         */
        void setNodeName(java.lang.String nodeName);
        
        /**
         * Sets (as xml) the "node-name" attribute
         */
        void xsetNodeName(org.apache.xmlbeans.XmlString nodeName);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgettree.SubNodeDocument.SubNode newInstance() {
              return (com.kyt.xsd.widgettree.SubNodeDocument.SubNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgettree.SubNodeDocument.SubNode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgettree.SubNodeDocument.SubNode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgettree.SubNodeDocument newInstance() {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgettree.SubNodeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgettree.SubNodeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgettree.SubNodeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
