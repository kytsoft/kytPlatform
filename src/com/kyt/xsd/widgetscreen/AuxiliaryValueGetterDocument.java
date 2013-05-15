/*
 * An XML document type.
 * Localname: auxiliary-value-getter
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen;


/**
 * A document containing one auxiliary-value-getter(@) element.
 *
 * This is a complex type.
 */
public interface AuxiliaryValueGetterDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuxiliaryValueGetterDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDBBEF08129F0DD9F5CC86C4698C5DE42").resolveHandle("auxiliaryvaluegetterae47doctype");
    
    /**
     * Gets the "auxiliary-value-getter" element
     */
    com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument.AuxiliaryValueGetter getAuxiliaryValueGetter();
    
    /**
     * Sets the "auxiliary-value-getter" element
     */
    void setAuxiliaryValueGetter(com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument.AuxiliaryValueGetter auxiliaryValueGetter);
    
    /**
     * Appends and returns a new empty "auxiliary-value-getter" element
     */
    com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument.AuxiliaryValueGetter addNewAuxiliaryValueGetter();
    
    /**
     * An XML auxiliary-value-getter(@).
     *
     * This is a complex type.
     */
    public interface AuxiliaryValueGetter extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AuxiliaryValueGetter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDBBEF08129F0DD9F5CC86C4698C5DE42").resolveHandle("auxiliaryvaluegetter546delemtype");
        
        /**
         * Gets the "entity-name" attribute
         */
        java.lang.String getEntityName();
        
        /**
         * Gets (as xml) the "entity-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityName();
        
        /**
         * True if has "entity-name" attribute
         */
        boolean isSetEntityName();
        
        /**
         * Sets the "entity-name" attribute
         */
        void setEntityName(java.lang.String entityName);
        
        /**
         * Sets (as xml) the "entity-name" attribute
         */
        void xsetEntityName(org.apache.xmlbeans.XmlString entityName);
        
        /**
         * Unsets the "entity-name" attribute
         */
        void unsetEntityName();
        
        /**
         * Gets the "auxiliary-field-name" attribute
         */
        java.lang.String getAuxiliaryFieldName();
        
        /**
         * Gets (as xml) the "auxiliary-field-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetAuxiliaryFieldName();
        
        /**
         * True if has "auxiliary-field-name" attribute
         */
        boolean isSetAuxiliaryFieldName();
        
        /**
         * Sets the "auxiliary-field-name" attribute
         */
        void setAuxiliaryFieldName(java.lang.String auxiliaryFieldName);
        
        /**
         * Sets (as xml) the "auxiliary-field-name" attribute
         */
        void xsetAuxiliaryFieldName(org.apache.xmlbeans.XmlString auxiliaryFieldName);
        
        /**
         * Unsets the "auxiliary-field-name" attribute
         */
        void unsetAuxiliaryFieldName();
        
        /**
         * Gets the "entity-id-name" attribute
         */
        java.lang.String getEntityIdName();
        
        /**
         * Gets (as xml) the "entity-id-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityIdName();
        
        /**
         * True if has "entity-id-name" attribute
         */
        boolean isSetEntityIdName();
        
        /**
         * Sets the "entity-id-name" attribute
         */
        void setEntityIdName(java.lang.String entityIdName);
        
        /**
         * Sets (as xml) the "entity-id-name" attribute
         */
        void xsetEntityIdName(org.apache.xmlbeans.XmlString entityIdName);
        
        /**
         * Unsets the "entity-id-name" attribute
         */
        void unsetEntityIdName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument.AuxiliaryValueGetter newInstance() {
              return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument.AuxiliaryValueGetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument.AuxiliaryValueGetter newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument.AuxiliaryValueGetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument newInstance() {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetscreen.AuxiliaryValueGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
