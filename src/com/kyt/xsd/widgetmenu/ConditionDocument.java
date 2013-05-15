/*
 * An XML document type.
 * Localname: condition
 * Namespace: 
 * Java type: com.kyt.xsd.widgetmenu.ConditionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetmenu;


/**
 * A document containing one condition(@) element.
 *
 * This is a complex type.
 */
public interface ConditionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConditionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("conditiondcc2doctype");
    
    /**
     * Gets the "condition" element
     */
    com.kyt.xsd.widgetmenu.ConditionDocument.Condition getCondition();
    
    /**
     * Sets the "condition" element
     */
    void setCondition(com.kyt.xsd.widgetmenu.ConditionDocument.Condition condition);
    
    /**
     * Appends and returns a new empty "condition" element
     */
    com.kyt.xsd.widgetmenu.ConditionDocument.Condition addNewCondition();
    
    /**
     * An XML condition(@).
     *
     * This is a complex type.
     */
    public interface Condition extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Condition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("conditionedd9elemtype");
        
        /**
         * Gets the "AllConditionals" element
         */
        org.apache.xmlbeans.XmlObject getAllConditionals();
        
        /**
         * Sets the "AllConditionals" element
         */
        void setAllConditionals(org.apache.xmlbeans.XmlObject allConditionals);
        
        /**
         * Appends and returns a new empty "AllConditionals" element
         */
        org.apache.xmlbeans.XmlObject addNewAllConditionals();
        
        /**
         * Gets the "pass-style" attribute
         */
        java.lang.String getPassStyle();
        
        /**
         * Gets (as xml) the "pass-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetPassStyle();
        
        /**
         * True if has "pass-style" attribute
         */
        boolean isSetPassStyle();
        
        /**
         * Sets the "pass-style" attribute
         */
        void setPassStyle(java.lang.String passStyle);
        
        /**
         * Sets (as xml) the "pass-style" attribute
         */
        void xsetPassStyle(org.apache.xmlbeans.XmlString passStyle);
        
        /**
         * Unsets the "pass-style" attribute
         */
        void unsetPassStyle();
        
        /**
         * Gets the "disabled-style" attribute
         */
        java.lang.String getDisabledStyle();
        
        /**
         * Gets (as xml) the "disabled-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDisabledStyle();
        
        /**
         * True if has "disabled-style" attribute
         */
        boolean isSetDisabledStyle();
        
        /**
         * Sets the "disabled-style" attribute
         */
        void setDisabledStyle(java.lang.String disabledStyle);
        
        /**
         * Sets (as xml) the "disabled-style" attribute
         */
        void xsetDisabledStyle(org.apache.xmlbeans.XmlString disabledStyle);
        
        /**
         * Unsets the "disabled-style" attribute
         */
        void unsetDisabledStyle();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetmenu.ConditionDocument.Condition newInstance() {
              return (com.kyt.xsd.widgetmenu.ConditionDocument.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetmenu.ConditionDocument.Condition newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetmenu.ConditionDocument.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetmenu.ConditionDocument newInstance() {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetmenu.ConditionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetmenu.ConditionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetmenu.ConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
