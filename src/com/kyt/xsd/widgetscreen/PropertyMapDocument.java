/*
 * An XML document type.
 * Localname: property-map
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.PropertyMapDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen;


/**
 * A document containing one property-map(@) element.
 *
 * This is a complex type.
 */
public interface PropertyMapDocument extends com.kyt.xsd.widgetscreen.AllActionsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PropertyMapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDBBEF08129F0DD9F5CC86C4698C5DE42").resolveHandle("propertymap205ddoctype");
    
    /**
     * Gets the "property-map" element
     */
    com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap getPropertyMap();
    
    /**
     * Sets the "property-map" element
     */
    void setPropertyMap(com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap propertyMap);
    
    /**
     * Appends and returns a new empty "property-map" element
     */
    com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap addNewPropertyMap();
    
    /**
     * An XML property-map(@).
     *
     * This is a complex type.
     */
    public interface PropertyMap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PropertyMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDBBEF08129F0DD9F5CC86C4698C5DE42").resolveHandle("propertymap3e6delemtype");
        
        /**
         * Gets the "resource" attribute
         */
        java.lang.String getResource();
        
        /**
         * Gets (as xml) the "resource" attribute
         */
        org.apache.xmlbeans.XmlString xgetResource();
        
        /**
         * Sets the "resource" attribute
         */
        void setResource(java.lang.String resource);
        
        /**
         * Sets (as xml) the "resource" attribute
         */
        void xsetResource(org.apache.xmlbeans.XmlString resource);
        
        /**
         * Gets the "map-name" attribute
         */
        java.lang.String getMapName();
        
        /**
         * Gets (as xml) the "map-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetMapName();
        
        /**
         * Sets the "map-name" attribute
         */
        void setMapName(java.lang.String mapName);
        
        /**
         * Sets (as xml) the "map-name" attribute
         */
        void xsetMapName(org.apache.xmlbeans.XmlString mapName);
        
        /**
         * Gets the "global" attribute
         */
        com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap.Global.Enum getGlobal();
        
        /**
         * Gets (as xml) the "global" attribute
         */
        com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap.Global xgetGlobal();
        
        /**
         * True if has "global" attribute
         */
        boolean isSetGlobal();
        
        /**
         * Sets the "global" attribute
         */
        void setGlobal(com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap.Global.Enum global);
        
        /**
         * Sets (as xml) the "global" attribute
         */
        void xsetGlobal(com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap.Global global);
        
        /**
         * Unsets the "global" attribute
         */
        void unsetGlobal();
        
        /**
         * An XML global(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.PropertyMapDocument$PropertyMap$Global.
         */
        public interface Global extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Global.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDBBEF08129F0DD9F5CC86C4698C5DE42").resolveHandle("globalcdf0attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetscreen.PropertyMapDocument$PropertyMap$Global.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TRUE
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
                
                static final int INT_TRUE = 1;
                static final int INT_FALSE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
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
                public static com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap.Global newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap.Global) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap.Global newInstance() {
                  return (com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap.Global) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap.Global newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap.Global) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap newInstance() {
              return (com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetscreen.PropertyMapDocument.PropertyMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument newInstance() {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetscreen.PropertyMapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetscreen.PropertyMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
