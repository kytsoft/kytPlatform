/*
 * An XML document type.
 * Localname: image
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.ImageDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen;


/**
 * A document containing one image(@) element.
 *
 * This is a complex type.
 */
public interface ImageDocument extends com.kyt.xsd.widgetscreen.AllWidgetsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ImageDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDBBEF08129F0DD9F5CC86C4698C5DE42").resolveHandle("image0482doctype");
    
    /**
     * Gets the "image" element
     */
    com.kyt.xsd.widgetscreen.ImageDocument.Image getImage();
    
    /**
     * Sets the "image" element
     */
    void setImage(com.kyt.xsd.widgetscreen.ImageDocument.Image image);
    
    /**
     * Appends and returns a new empty "image" element
     */
    com.kyt.xsd.widgetscreen.ImageDocument.Image addNewImage();
    
    /**
     * An XML image(@).
     *
     * This is a complex type.
     */
    public interface Image extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Image.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDBBEF08129F0DD9F5CC86C4698C5DE42").resolveHandle("image3159elemtype");
        
        /**
         * Gets the "src" attribute
         */
        java.lang.String getSrc();
        
        /**
         * Gets (as xml) the "src" attribute
         */
        org.apache.xmlbeans.XmlString xgetSrc();
        
        /**
         * True if has "src" attribute
         */
        boolean isSetSrc();
        
        /**
         * Sets the "src" attribute
         */
        void setSrc(java.lang.String src);
        
        /**
         * Sets (as xml) the "src" attribute
         */
        void xsetSrc(org.apache.xmlbeans.XmlString src);
        
        /**
         * Unsets the "src" attribute
         */
        void unsetSrc();
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlString xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlString id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
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
         * Gets the "width" attribute
         */
        java.lang.String getWidth();
        
        /**
         * Gets (as xml) the "width" attribute
         */
        org.apache.xmlbeans.XmlString xgetWidth();
        
        /**
         * True if has "width" attribute
         */
        boolean isSetWidth();
        
        /**
         * Sets the "width" attribute
         */
        void setWidth(java.lang.String width);
        
        /**
         * Sets (as xml) the "width" attribute
         */
        void xsetWidth(org.apache.xmlbeans.XmlString width);
        
        /**
         * Unsets the "width" attribute
         */
        void unsetWidth();
        
        /**
         * Gets the "height" attribute
         */
        java.lang.String getHeight();
        
        /**
         * Gets (as xml) the "height" attribute
         */
        org.apache.xmlbeans.XmlString xgetHeight();
        
        /**
         * True if has "height" attribute
         */
        boolean isSetHeight();
        
        /**
         * Sets the "height" attribute
         */
        void setHeight(java.lang.String height);
        
        /**
         * Sets (as xml) the "height" attribute
         */
        void xsetHeight(org.apache.xmlbeans.XmlString height);
        
        /**
         * Unsets the "height" attribute
         */
        void unsetHeight();
        
        /**
         * Gets the "border" attribute
         */
        java.lang.String getBorder();
        
        /**
         * Gets (as xml) the "border" attribute
         */
        org.apache.xmlbeans.XmlString xgetBorder();
        
        /**
         * True if has "border" attribute
         */
        boolean isSetBorder();
        
        /**
         * Sets the "border" attribute
         */
        void setBorder(java.lang.String border);
        
        /**
         * Sets (as xml) the "border" attribute
         */
        void xsetBorder(org.apache.xmlbeans.XmlString border);
        
        /**
         * Unsets the "border" attribute
         */
        void unsetBorder();
        
        /**
         * Gets the "alt" attribute
         */
        java.lang.String getAlt();
        
        /**
         * Gets (as xml) the "alt" attribute
         */
        org.apache.xmlbeans.XmlString xgetAlt();
        
        /**
         * True if has "alt" attribute
         */
        boolean isSetAlt();
        
        /**
         * Sets the "alt" attribute
         */
        void setAlt(java.lang.String alt);
        
        /**
         * Sets (as xml) the "alt" attribute
         */
        void xsetAlt(org.apache.xmlbeans.XmlString alt);
        
        /**
         * Unsets the "alt" attribute
         */
        void unsetAlt();
        
        /**
         * Gets the "url-mode" attribute
         */
        com.kyt.xsd.widgetscreen.ImageDocument.Image.UrlMode.Enum getUrlMode();
        
        /**
         * Gets (as xml) the "url-mode" attribute
         */
        com.kyt.xsd.widgetscreen.ImageDocument.Image.UrlMode xgetUrlMode();
        
        /**
         * True if has "url-mode" attribute
         */
        boolean isSetUrlMode();
        
        /**
         * Sets the "url-mode" attribute
         */
        void setUrlMode(com.kyt.xsd.widgetscreen.ImageDocument.Image.UrlMode.Enum urlMode);
        
        /**
         * Sets (as xml) the "url-mode" attribute
         */
        void xsetUrlMode(com.kyt.xsd.widgetscreen.ImageDocument.Image.UrlMode urlMode);
        
        /**
         * Unsets the "url-mode" attribute
         */
        void unsetUrlMode();
        
        /**
         * An XML url-mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.ImageDocument$Image$UrlMode.
         */
        public interface UrlMode extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UrlMode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDBBEF08129F0DD9F5CC86C4698C5DE42").resolveHandle("urlmode1ebaattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum OFBIZ = Enum.forString("ofbiz");
            static final Enum CONTENT = Enum.forString("content");
            static final Enum RAW = Enum.forString("raw");
            
            static final int INT_OFBIZ = Enum.INT_OFBIZ;
            static final int INT_CONTENT = Enum.INT_CONTENT;
            static final int INT_RAW = Enum.INT_RAW;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetscreen.ImageDocument$Image$UrlMode.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_OFBIZ
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_OFBIZ = 1;
                static final int INT_CONTENT = 2;
                static final int INT_RAW = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("ofbiz", INT_OFBIZ),
                      new Enum("content", INT_CONTENT),
                      new Enum("raw", INT_RAW),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.widgetscreen.ImageDocument.Image.UrlMode newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetscreen.ImageDocument.Image.UrlMode) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetscreen.ImageDocument.Image.UrlMode newInstance() {
                  return (com.kyt.xsd.widgetscreen.ImageDocument.Image.UrlMode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetscreen.ImageDocument.Image.UrlMode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetscreen.ImageDocument.Image.UrlMode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetscreen.ImageDocument.Image newInstance() {
              return (com.kyt.xsd.widgetscreen.ImageDocument.Image) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetscreen.ImageDocument.Image newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetscreen.ImageDocument.Image) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetscreen.ImageDocument newInstance() {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetscreen.ImageDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetscreen.ImageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetscreen.ImageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
