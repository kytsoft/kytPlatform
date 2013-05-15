/*
 * An XML document type.
 * Localname: display-entity
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.DisplayEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one display-entity(@) element.
 *
 * This is a complex type.
 */
public interface DisplayEntityDocument extends com.kyt.xsd.widgetform.AllFieldsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DisplayEntityDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("displayentity7807doctype");
    
    /**
     * Gets the "display-entity" element
     */
    com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity getDisplayEntity();
    
    /**
     * Sets the "display-entity" element
     */
    void setDisplayEntity(com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity displayEntity);
    
    /**
     * Appends and returns a new empty "display-entity" element
     */
    com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity addNewDisplayEntity();
    
    /**
     * An XML display-entity(@).
     *
     * This is a complex type.
     */
    public interface DisplayEntity extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DisplayEntity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("displayentity336delemtype");
        
        /**
         * Gets the "sub-hyperlink" element
         */
        com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink getSubHyperlink();
        
        /**
         * True if has "sub-hyperlink" element
         */
        boolean isSetSubHyperlink();
        
        /**
         * Sets the "sub-hyperlink" element
         */
        void setSubHyperlink(com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink subHyperlink);
        
        /**
         * Appends and returns a new empty "sub-hyperlink" element
         */
        com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink addNewSubHyperlink();
        
        /**
         * Unsets the "sub-hyperlink" element
         */
        void unsetSubHyperlink();
        
        /**
         * Gets the "entity-name" attribute
         */
        java.lang.String getEntityName();
        
        /**
         * Gets (as xml) the "entity-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityName();
        
        /**
         * Sets the "entity-name" attribute
         */
        void setEntityName(java.lang.String entityName);
        
        /**
         * Sets (as xml) the "entity-name" attribute
         */
        void xsetEntityName(org.apache.xmlbeans.XmlString entityName);
        
        /**
         * Gets the "key-field-name" attribute
         */
        java.lang.String getKeyFieldName();
        
        /**
         * Gets (as xml) the "key-field-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetKeyFieldName();
        
        /**
         * True if has "key-field-name" attribute
         */
        boolean isSetKeyFieldName();
        
        /**
         * Sets the "key-field-name" attribute
         */
        void setKeyFieldName(java.lang.String keyFieldName);
        
        /**
         * Sets (as xml) the "key-field-name" attribute
         */
        void xsetKeyFieldName(org.apache.xmlbeans.XmlString keyFieldName);
        
        /**
         * Unsets the "key-field-name" attribute
         */
        void unsetKeyFieldName();
        
        /**
         * Gets the "description" attribute
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" attribute
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * True if has "description" attribute
         */
        boolean isSetDescription();
        
        /**
         * Sets the "description" attribute
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" attribute
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Unsets the "description" attribute
         */
        void unsetDescription();
        
        /**
         * Gets the "size" attribute
         */
        java.math.BigInteger getSize();
        
        /**
         * Gets (as xml) the "size" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetSize();
        
        /**
         * True if has "size" attribute
         */
        boolean isSetSize();
        
        /**
         * Sets the "size" attribute
         */
        void setSize(java.math.BigInteger size);
        
        /**
         * Sets (as xml) the "size" attribute
         */
        void xsetSize(org.apache.xmlbeans.XmlInteger size);
        
        /**
         * Unsets the "size" attribute
         */
        void unsetSize();
        
        /**
         * Gets the "cache" attribute
         */
        com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache.Enum getCache();
        
        /**
         * Gets (as xml) the "cache" attribute
         */
        com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache xgetCache();
        
        /**
         * True if has "cache" attribute
         */
        boolean isSetCache();
        
        /**
         * Sets the "cache" attribute
         */
        void setCache(com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache.Enum cache);
        
        /**
         * Sets (as xml) the "cache" attribute
         */
        void xsetCache(com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache cache);
        
        /**
         * Unsets the "cache" attribute
         */
        void unsetCache();
        
        /**
         * Gets the "also-hidden" attribute
         */
        com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden.Enum getAlsoHidden();
        
        /**
         * Gets (as xml) the "also-hidden" attribute
         */
        com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden xgetAlsoHidden();
        
        /**
         * True if has "also-hidden" attribute
         */
        boolean isSetAlsoHidden();
        
        /**
         * Sets the "also-hidden" attribute
         */
        void setAlsoHidden(com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden.Enum alsoHidden);
        
        /**
         * Sets (as xml) the "also-hidden" attribute
         */
        void xsetAlsoHidden(com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden alsoHidden);
        
        /**
         * Unsets the "also-hidden" attribute
         */
        void unsetAlsoHidden();
        
        /**
         * An XML cache(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DisplayEntityDocument$DisplayEntity$Cache.
         */
        public interface Cache extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cache.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("cached1d7attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DisplayEntityDocument$DisplayEntity$Cache.
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
                public static com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache newInstance() {
                  return (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML also-hidden(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DisplayEntityDocument$DisplayEntity$AlsoHidden.
         */
        public interface AlsoHidden extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlsoHidden.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("alsohiddenda45attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DisplayEntityDocument$DisplayEntity$AlsoHidden.
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
                public static com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden newInstance() {
                  return (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity newInstance() {
              return (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.DisplayEntityDocument newInstance() {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayEntityDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.DisplayEntityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.DisplayEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
