/*
 * An XML document type.
 * Localname: service
 * Namespace: 
 * Java type: com.kyt.xsd.widgettree.ServiceDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgettree;


/**
 * A document containing one service(@) element.
 *
 * This is a complex type.
 */
public interface ServiceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("servicef41cdoctype");
    
    /**
     * Gets the "service" element
     */
    com.kyt.xsd.widgettree.ServiceDocument.Service getService();
    
    /**
     * Sets the "service" element
     */
    void setService(com.kyt.xsd.widgettree.ServiceDocument.Service service);
    
    /**
     * Appends and returns a new empty "service" element
     */
    com.kyt.xsd.widgettree.ServiceDocument.Service addNewService();
    
    /**
     * An XML service(@).
     *
     * This is a complex type.
     */
    public interface Service extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Service.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("servicebe0delemtype");
        
        /**
         * Gets array of all "field-map" elements
         */
        com.kyt.xsd.widgettree.FieldMapDocument.FieldMap[] getFieldMapArray();
        
        /**
         * Gets ith "field-map" element
         */
        com.kyt.xsd.widgettree.FieldMapDocument.FieldMap getFieldMapArray(int i);
        
        /**
         * Returns number of "field-map" element
         */
        int sizeOfFieldMapArray();
        
        /**
         * Sets array of all "field-map" element
         */
        void setFieldMapArray(com.kyt.xsd.widgettree.FieldMapDocument.FieldMap[] fieldMapArray);
        
        /**
         * Sets ith "field-map" element
         */
        void setFieldMapArray(int i, com.kyt.xsd.widgettree.FieldMapDocument.FieldMap fieldMap);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field-map" element
         */
        com.kyt.xsd.widgettree.FieldMapDocument.FieldMap insertNewFieldMap(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field-map" element
         */
        com.kyt.xsd.widgettree.FieldMapDocument.FieldMap addNewFieldMap();
        
        /**
         * Removes the ith "field-map" element
         */
        void removeFieldMap(int i);
        
        /**
         * Gets the "service-name" attribute
         */
        java.lang.String getServiceName();
        
        /**
         * Gets (as xml) the "service-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetServiceName();
        
        /**
         * Sets the "service-name" attribute
         */
        void setServiceName(java.lang.String serviceName);
        
        /**
         * Sets (as xml) the "service-name" attribute
         */
        void xsetServiceName(org.apache.xmlbeans.XmlString serviceName);
        
        /**
         * Gets the "result-map" attribute
         */
        java.lang.String getResultMap();
        
        /**
         * Gets (as xml) the "result-map" attribute
         */
        org.apache.xmlbeans.XmlString xgetResultMap();
        
        /**
         * True if has "result-map" attribute
         */
        boolean isSetResultMap();
        
        /**
         * Sets the "result-map" attribute
         */
        void setResultMap(java.lang.String resultMap);
        
        /**
         * Sets (as xml) the "result-map" attribute
         */
        void xsetResultMap(org.apache.xmlbeans.XmlString resultMap);
        
        /**
         * Unsets the "result-map" attribute
         */
        void unsetResultMap();
        
        /**
         * Gets the "auto-field-map" attribute
         */
        java.lang.String getAutoFieldMap();
        
        /**
         * Gets (as xml) the "auto-field-map" attribute
         */
        org.apache.xmlbeans.XmlString xgetAutoFieldMap();
        
        /**
         * True if has "auto-field-map" attribute
         */
        boolean isSetAutoFieldMap();
        
        /**
         * Sets the "auto-field-map" attribute
         */
        void setAutoFieldMap(java.lang.String autoFieldMap);
        
        /**
         * Sets (as xml) the "auto-field-map" attribute
         */
        void xsetAutoFieldMap(org.apache.xmlbeans.XmlString autoFieldMap);
        
        /**
         * Unsets the "auto-field-map" attribute
         */
        void unsetAutoFieldMap();
        
        /**
         * Gets the "result-map-list" attribute
         */
        java.lang.String getResultMapList();
        
        /**
         * Gets (as xml) the "result-map-list" attribute
         */
        org.apache.xmlbeans.XmlString xgetResultMapList();
        
        /**
         * True if has "result-map-list" attribute
         */
        boolean isSetResultMapList();
        
        /**
         * Sets the "result-map-list" attribute
         */
        void setResultMapList(java.lang.String resultMapList);
        
        /**
         * Sets (as xml) the "result-map-list" attribute
         */
        void xsetResultMapList(org.apache.xmlbeans.XmlString resultMapList);
        
        /**
         * Unsets the "result-map-list" attribute
         */
        void unsetResultMapList();
        
        /**
         * Gets the "result-map-value" attribute
         */
        java.lang.String getResultMapValue();
        
        /**
         * Gets (as xml) the "result-map-value" attribute
         */
        org.apache.xmlbeans.XmlString xgetResultMapValue();
        
        /**
         * True if has "result-map-value" attribute
         */
        boolean isSetResultMapValue();
        
        /**
         * Sets the "result-map-value" attribute
         */
        void setResultMapValue(java.lang.String resultMapValue);
        
        /**
         * Sets (as xml) the "result-map-value" attribute
         */
        void xsetResultMapValue(org.apache.xmlbeans.XmlString resultMapValue);
        
        /**
         * Unsets the "result-map-value" attribute
         */
        void unsetResultMapValue();
        
        /**
         * Gets the "value" attribute
         */
        java.lang.String getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        org.apache.xmlbeans.XmlString xgetValue();
        
        /**
         * True if has "value" attribute
         */
        boolean isSetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(java.lang.String value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(org.apache.xmlbeans.XmlString value);
        
        /**
         * Unsets the "value" attribute
         */
        void unsetValue();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgettree.ServiceDocument.Service newInstance() {
              return (com.kyt.xsd.widgettree.ServiceDocument.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgettree.ServiceDocument.Service newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgettree.ServiceDocument.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgettree.ServiceDocument newInstance() {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgettree.ServiceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgettree.ServiceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgettree.ServiceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgettree.ServiceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgettree.ServiceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgettree.ServiceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgettree.ServiceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgettree.ServiceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgettree.ServiceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgettree.ServiceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgettree.ServiceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgettree.ServiceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgettree.ServiceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgettree.ServiceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgettree.ServiceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgettree.ServiceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgettree.ServiceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgettree.ServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
