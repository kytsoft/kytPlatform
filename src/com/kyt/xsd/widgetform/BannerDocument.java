/*
 * An XML document type.
 * Localname: banner
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.BannerDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one banner(@) element.
 *
 * This is a complex type.
 */
public interface BannerDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BannerDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("banner88e5doctype");
    
    /**
     * Gets the "banner" element
     */
    com.kyt.xsd.widgetform.BannerDocument.Banner getBanner();
    
    /**
     * Sets the "banner" element
     */
    void setBanner(com.kyt.xsd.widgetform.BannerDocument.Banner banner);
    
    /**
     * Appends and returns a new empty "banner" element
     */
    com.kyt.xsd.widgetform.BannerDocument.Banner addNewBanner();
    
    /**
     * An XML banner(@).
     *
     * This is a complex type.
     */
    public interface Banner extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Banner.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("bannerb42delemtype");
        
        /**
         * Gets the "style" attribute
         */
        java.lang.String getStyle();
        
        /**
         * Gets (as xml) the "style" attribute
         */
        org.apache.xmlbeans.XmlString xgetStyle();
        
        /**
         * True if has "style" attribute
         */
        boolean isSetStyle();
        
        /**
         * Sets the "style" attribute
         */
        void setStyle(java.lang.String style);
        
        /**
         * Sets (as xml) the "style" attribute
         */
        void xsetStyle(org.apache.xmlbeans.XmlString style);
        
        /**
         * Unsets the "style" attribute
         */
        void unsetStyle();
        
        /**
         * Gets the "text" attribute
         */
        java.lang.String getText();
        
        /**
         * Gets (as xml) the "text" attribute
         */
        org.apache.xmlbeans.XmlString xgetText();
        
        /**
         * True if has "text" attribute
         */
        boolean isSetText();
        
        /**
         * Sets the "text" attribute
         */
        void setText(java.lang.String text);
        
        /**
         * Sets (as xml) the "text" attribute
         */
        void xsetText(org.apache.xmlbeans.XmlString text);
        
        /**
         * Unsets the "text" attribute
         */
        void unsetText();
        
        /**
         * Gets the "text-style" attribute
         */
        java.lang.String getTextStyle();
        
        /**
         * Gets (as xml) the "text-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetTextStyle();
        
        /**
         * True if has "text-style" attribute
         */
        boolean isSetTextStyle();
        
        /**
         * Sets the "text-style" attribute
         */
        void setTextStyle(java.lang.String textStyle);
        
        /**
         * Sets (as xml) the "text-style" attribute
         */
        void xsetTextStyle(org.apache.xmlbeans.XmlString textStyle);
        
        /**
         * Unsets the "text-style" attribute
         */
        void unsetTextStyle();
        
        /**
         * Gets the "left-text" attribute
         */
        java.lang.String getLeftText();
        
        /**
         * Gets (as xml) the "left-text" attribute
         */
        org.apache.xmlbeans.XmlString xgetLeftText();
        
        /**
         * True if has "left-text" attribute
         */
        boolean isSetLeftText();
        
        /**
         * Sets the "left-text" attribute
         */
        void setLeftText(java.lang.String leftText);
        
        /**
         * Sets (as xml) the "left-text" attribute
         */
        void xsetLeftText(org.apache.xmlbeans.XmlString leftText);
        
        /**
         * Unsets the "left-text" attribute
         */
        void unsetLeftText();
        
        /**
         * Gets the "left-text-style" attribute
         */
        java.lang.String getLeftTextStyle();
        
        /**
         * Gets (as xml) the "left-text-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetLeftTextStyle();
        
        /**
         * True if has "left-text-style" attribute
         */
        boolean isSetLeftTextStyle();
        
        /**
         * Sets the "left-text-style" attribute
         */
        void setLeftTextStyle(java.lang.String leftTextStyle);
        
        /**
         * Sets (as xml) the "left-text-style" attribute
         */
        void xsetLeftTextStyle(org.apache.xmlbeans.XmlString leftTextStyle);
        
        /**
         * Unsets the "left-text-style" attribute
         */
        void unsetLeftTextStyle();
        
        /**
         * Gets the "right-text" attribute
         */
        java.lang.String getRightText();
        
        /**
         * Gets (as xml) the "right-text" attribute
         */
        org.apache.xmlbeans.XmlString xgetRightText();
        
        /**
         * True if has "right-text" attribute
         */
        boolean isSetRightText();
        
        /**
         * Sets the "right-text" attribute
         */
        void setRightText(java.lang.String rightText);
        
        /**
         * Sets (as xml) the "right-text" attribute
         */
        void xsetRightText(org.apache.xmlbeans.XmlString rightText);
        
        /**
         * Unsets the "right-text" attribute
         */
        void unsetRightText();
        
        /**
         * Gets the "right-text-style" attribute
         */
        java.lang.String getRightTextStyle();
        
        /**
         * Gets (as xml) the "right-text-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetRightTextStyle();
        
        /**
         * True if has "right-text-style" attribute
         */
        boolean isSetRightTextStyle();
        
        /**
         * Sets the "right-text-style" attribute
         */
        void setRightTextStyle(java.lang.String rightTextStyle);
        
        /**
         * Sets (as xml) the "right-text-style" attribute
         */
        void xsetRightTextStyle(org.apache.xmlbeans.XmlString rightTextStyle);
        
        /**
         * Unsets the "right-text-style" attribute
         */
        void unsetRightTextStyle();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.BannerDocument.Banner newInstance() {
              return (com.kyt.xsd.widgetform.BannerDocument.Banner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.BannerDocument.Banner newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.BannerDocument.Banner) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.BannerDocument newInstance() {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.BannerDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.BannerDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.BannerDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.BannerDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.BannerDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.BannerDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.BannerDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.BannerDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.BannerDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.BannerDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.BannerDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.BannerDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.BannerDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.BannerDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.BannerDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.BannerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.BannerDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.BannerDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
