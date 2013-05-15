/*
 * An XML document type.
 * Localname: html-template-decorator
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen;


/**
 * A document containing one html-template-decorator(@) element.
 *
 * This is a complex type.
 */
public interface HtmlTemplateDecoratorDocument extends com.kyt.xsd.widgetscreen.HtmlWidgetsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HtmlTemplateDecoratorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDBBEF08129F0DD9F5CC86C4698C5DE42").resolveHandle("htmltemplatedecorator8f71doctype");
    
    /**
     * Gets the "html-template-decorator" element
     */
    com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument.HtmlTemplateDecorator getHtmlTemplateDecorator();
    
    /**
     * Sets the "html-template-decorator" element
     */
    void setHtmlTemplateDecorator(com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument.HtmlTemplateDecorator htmlTemplateDecorator);
    
    /**
     * Appends and returns a new empty "html-template-decorator" element
     */
    com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument.HtmlTemplateDecorator addNewHtmlTemplateDecorator();
    
    /**
     * An XML html-template-decorator(@).
     *
     * This is a complex type.
     */
    public interface HtmlTemplateDecorator extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HtmlTemplateDecorator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDBBEF08129F0DD9F5CC86C4698C5DE42").resolveHandle("htmltemplatedecorator0077elemtype");
        
        /**
         * Gets array of all "html-template-decorator-section" elements
         */
        com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorSectionDocument.HtmlTemplateDecoratorSection[] getHtmlTemplateDecoratorSectionArray();
        
        /**
         * Gets ith "html-template-decorator-section" element
         */
        com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorSectionDocument.HtmlTemplateDecoratorSection getHtmlTemplateDecoratorSectionArray(int i);
        
        /**
         * Returns number of "html-template-decorator-section" element
         */
        int sizeOfHtmlTemplateDecoratorSectionArray();
        
        /**
         * Sets array of all "html-template-decorator-section" element
         */
        void setHtmlTemplateDecoratorSectionArray(com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorSectionDocument.HtmlTemplateDecoratorSection[] htmlTemplateDecoratorSectionArray);
        
        /**
         * Sets ith "html-template-decorator-section" element
         */
        void setHtmlTemplateDecoratorSectionArray(int i, com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorSectionDocument.HtmlTemplateDecoratorSection htmlTemplateDecoratorSection);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "html-template-decorator-section" element
         */
        com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorSectionDocument.HtmlTemplateDecoratorSection insertNewHtmlTemplateDecoratorSection(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "html-template-decorator-section" element
         */
        com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorSectionDocument.HtmlTemplateDecoratorSection addNewHtmlTemplateDecoratorSection();
        
        /**
         * Removes the ith "html-template-decorator-section" element
         */
        void removeHtmlTemplateDecoratorSection(int i);
        
        /**
         * Gets the "location" attribute
         */
        java.lang.String getLocation();
        
        /**
         * Gets (as xml) the "location" attribute
         */
        org.apache.xmlbeans.XmlString xgetLocation();
        
        /**
         * Sets the "location" attribute
         */
        void setLocation(java.lang.String location);
        
        /**
         * Sets (as xml) the "location" attribute
         */
        void xsetLocation(org.apache.xmlbeans.XmlString location);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument.HtmlTemplateDecorator newInstance() {
              return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument.HtmlTemplateDecorator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument.HtmlTemplateDecorator newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument.HtmlTemplateDecorator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument newInstance() {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetscreen.HtmlTemplateDecoratorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
