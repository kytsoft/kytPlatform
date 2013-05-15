/*
 * An XML document type.
 * Localname: display
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.DisplayDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one display(@) element.
 *
 * This is a complex type.
 */
public interface DisplayDocument extends com.kyt.xsd.widgetform.AllFieldsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DisplayDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("display4629doctype");
    
    /**
     * Gets the "display" element
     */
    com.kyt.xsd.widgetform.DisplayDocument.Display getDisplay();
    
    /**
     * Sets the "display" element
     */
    void setDisplay(com.kyt.xsd.widgetform.DisplayDocument.Display display);
    
    /**
     * Appends and returns a new empty "display" element
     */
    com.kyt.xsd.widgetform.DisplayDocument.Display addNewDisplay();
    
    /**
     * An XML display(@).
     *
     * This is a complex type.
     */
    public interface Display extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Display.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("displayf5e7elemtype");
        
        /**
         * Gets the "in-place-editor" element
         */
        com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor getInPlaceEditor();
        
        /**
         * True if has "in-place-editor" element
         */
        boolean isSetInPlaceEditor();
        
        /**
         * Sets the "in-place-editor" element
         */
        void setInPlaceEditor(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor inPlaceEditor);
        
        /**
         * Appends and returns a new empty "in-place-editor" element
         */
        com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor addNewInPlaceEditor();
        
        /**
         * Unsets the "in-place-editor" element
         */
        void unsetInPlaceEditor();
        
        /**
         * Gets the "also-hidden" attribute
         */
        com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden.Enum getAlsoHidden();
        
        /**
         * Gets (as xml) the "also-hidden" attribute
         */
        com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden xgetAlsoHidden();
        
        /**
         * True if has "also-hidden" attribute
         */
        boolean isSetAlsoHidden();
        
        /**
         * Sets the "also-hidden" attribute
         */
        void setAlsoHidden(com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden.Enum alsoHidden);
        
        /**
         * Sets (as xml) the "also-hidden" attribute
         */
        void xsetAlsoHidden(com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden alsoHidden);
        
        /**
         * Unsets the "also-hidden" attribute
         */
        void unsetAlsoHidden();
        
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
         * Gets the "type" attribute
         */
        com.kyt.xsd.widgetform.DisplayDocument.Display.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        com.kyt.xsd.widgetform.DisplayDocument.Display.Type xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(com.kyt.xsd.widgetform.DisplayDocument.Display.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(com.kyt.xsd.widgetform.DisplayDocument.Display.Type type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "currency" attribute
         */
        java.lang.String getCurrency();
        
        /**
         * Gets (as xml) the "currency" attribute
         */
        org.apache.xmlbeans.XmlString xgetCurrency();
        
        /**
         * True if has "currency" attribute
         */
        boolean isSetCurrency();
        
        /**
         * Sets the "currency" attribute
         */
        void setCurrency(java.lang.String currency);
        
        /**
         * Sets (as xml) the "currency" attribute
         */
        void xsetCurrency(org.apache.xmlbeans.XmlString currency);
        
        /**
         * Unsets the "currency" attribute
         */
        void unsetCurrency();
        
        /**
         * Gets the "image-location" attribute
         */
        java.lang.String getImageLocation();
        
        /**
         * Gets (as xml) the "image-location" attribute
         */
        org.apache.xmlbeans.XmlString xgetImageLocation();
        
        /**
         * True if has "image-location" attribute
         */
        boolean isSetImageLocation();
        
        /**
         * Sets the "image-location" attribute
         */
        void setImageLocation(java.lang.String imageLocation);
        
        /**
         * Sets (as xml) the "image-location" attribute
         */
        void xsetImageLocation(org.apache.xmlbeans.XmlString imageLocation);
        
        /**
         * Unsets the "image-location" attribute
         */
        void unsetImageLocation();
        
        /**
         * Gets the "default-value" attribute
         */
        java.lang.String getDefaultValue();
        
        /**
         * Gets (as xml) the "default-value" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultValue();
        
        /**
         * True if has "default-value" attribute
         */
        boolean isSetDefaultValue();
        
        /**
         * Sets the "default-value" attribute
         */
        void setDefaultValue(java.lang.String defaultValue);
        
        /**
         * Sets (as xml) the "default-value" attribute
         */
        void xsetDefaultValue(org.apache.xmlbeans.XmlString defaultValue);
        
        /**
         * Unsets the "default-value" attribute
         */
        void unsetDefaultValue();
        
        /**
         * An XML also-hidden(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DisplayDocument$Display$AlsoHidden.
         */
        public interface AlsoHidden extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AlsoHidden.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("alsohiddenf6bfattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DisplayDocument$Display$AlsoHidden.
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
                public static com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden newInstance() {
                  return (com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DisplayDocument$Display$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("typeee41attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TEXT = Enum.forString("text");
            static final Enum CURRENCY = Enum.forString("currency");
            static final Enum DATE = Enum.forString("date");
            static final Enum DATE_TIME = Enum.forString("date-time");
            static final Enum IMAGE = Enum.forString("image");
            static final Enum ACCOUNTING_NUMBER = Enum.forString("accounting-number");
            
            static final int INT_TEXT = Enum.INT_TEXT;
            static final int INT_CURRENCY = Enum.INT_CURRENCY;
            static final int INT_DATE = Enum.INT_DATE;
            static final int INT_DATE_TIME = Enum.INT_DATE_TIME;
            static final int INT_IMAGE = Enum.INT_IMAGE;
            static final int INT_ACCOUNTING_NUMBER = Enum.INT_ACCOUNTING_NUMBER;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DisplayDocument$Display$Type.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TEXT
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
                
                static final int INT_TEXT = 1;
                static final int INT_CURRENCY = 2;
                static final int INT_DATE = 3;
                static final int INT_DATE_TIME = 4;
                static final int INT_IMAGE = 5;
                static final int INT_ACCOUNTING_NUMBER = 6;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("text", INT_TEXT),
                      new Enum("currency", INT_CURRENCY),
                      new Enum("date", INT_DATE),
                      new Enum("date-time", INT_DATE_TIME),
                      new Enum("image", INT_IMAGE),
                      new Enum("accounting-number", INT_ACCOUNTING_NUMBER),
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
                public static com.kyt.xsd.widgetform.DisplayDocument.Display.Type newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DisplayDocument.Display.Type) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DisplayDocument.Display.Type newInstance() {
                  return (com.kyt.xsd.widgetform.DisplayDocument.Display.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DisplayDocument.Display.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DisplayDocument.Display.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.DisplayDocument.Display newInstance() {
              return (com.kyt.xsd.widgetform.DisplayDocument.Display) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.DisplayDocument.Display newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.DisplayDocument.Display) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.DisplayDocument newInstance() {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.DisplayDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.DisplayDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.DisplayDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.DisplayDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.DisplayDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.DisplayDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.DisplayDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.DisplayDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.DisplayDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.DisplayDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.DisplayDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
