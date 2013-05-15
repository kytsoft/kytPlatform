/*
 * An XML document type.
 * Localname: submit
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.SubmitDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one submit(@) element.
 *
 * This is a complex type.
 */
public interface SubmitDocument extends com.kyt.xsd.widgetform.AllFieldsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubmitDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("submit49d1doctype");
    
    /**
     * Gets the "submit" element
     */
    com.kyt.xsd.widgetform.SubmitDocument.Submit getSubmit();
    
    /**
     * Sets the "submit" element
     */
    void setSubmit(com.kyt.xsd.widgetform.SubmitDocument.Submit submit);
    
    /**
     * Appends and returns a new empty "submit" element
     */
    com.kyt.xsd.widgetform.SubmitDocument.Submit addNewSubmit();
    
    /**
     * An XML submit(@).
     *
     * This is a complex type.
     */
    public interface Submit extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Submit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("submitfdadelemtype");
        
        /**
         * Gets the "button-type" attribute
         */
        com.kyt.xsd.widgetform.SubmitDocument.Submit.ButtonType.Enum getButtonType();
        
        /**
         * Gets (as xml) the "button-type" attribute
         */
        com.kyt.xsd.widgetform.SubmitDocument.Submit.ButtonType xgetButtonType();
        
        /**
         * True if has "button-type" attribute
         */
        boolean isSetButtonType();
        
        /**
         * Sets the "button-type" attribute
         */
        void setButtonType(com.kyt.xsd.widgetform.SubmitDocument.Submit.ButtonType.Enum buttonType);
        
        /**
         * Sets (as xml) the "button-type" attribute
         */
        void xsetButtonType(com.kyt.xsd.widgetform.SubmitDocument.Submit.ButtonType buttonType);
        
        /**
         * Unsets the "button-type" attribute
         */
        void unsetButtonType();
        
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
         * Gets the "background-submit-refresh-target" attribute
         */
        java.lang.String getBackgroundSubmitRefreshTarget();
        
        /**
         * Gets (as xml) the "background-submit-refresh-target" attribute
         */
        org.apache.xmlbeans.XmlString xgetBackgroundSubmitRefreshTarget();
        
        /**
         * True if has "background-submit-refresh-target" attribute
         */
        boolean isSetBackgroundSubmitRefreshTarget();
        
        /**
         * Sets the "background-submit-refresh-target" attribute
         */
        void setBackgroundSubmitRefreshTarget(java.lang.String backgroundSubmitRefreshTarget);
        
        /**
         * Sets (as xml) the "background-submit-refresh-target" attribute
         */
        void xsetBackgroundSubmitRefreshTarget(org.apache.xmlbeans.XmlString backgroundSubmitRefreshTarget);
        
        /**
         * Unsets the "background-submit-refresh-target" attribute
         */
        void unsetBackgroundSubmitRefreshTarget();
        
        /**
         * Gets the "request-confirmation" attribute
         */
        com.kyt.xsd.widgetform.SubmitDocument.Submit.RequestConfirmation.Enum getRequestConfirmation();
        
        /**
         * Gets (as xml) the "request-confirmation" attribute
         */
        com.kyt.xsd.widgetform.SubmitDocument.Submit.RequestConfirmation xgetRequestConfirmation();
        
        /**
         * True if has "request-confirmation" attribute
         */
        boolean isSetRequestConfirmation();
        
        /**
         * Sets the "request-confirmation" attribute
         */
        void setRequestConfirmation(com.kyt.xsd.widgetform.SubmitDocument.Submit.RequestConfirmation.Enum requestConfirmation);
        
        /**
         * Sets (as xml) the "request-confirmation" attribute
         */
        void xsetRequestConfirmation(com.kyt.xsd.widgetform.SubmitDocument.Submit.RequestConfirmation requestConfirmation);
        
        /**
         * Unsets the "request-confirmation" attribute
         */
        void unsetRequestConfirmation();
        
        /**
         * Gets the "confirmation-message" attribute
         */
        java.lang.String getConfirmationMessage();
        
        /**
         * Gets (as xml) the "confirmation-message" attribute
         */
        org.apache.xmlbeans.XmlString xgetConfirmationMessage();
        
        /**
         * True if has "confirmation-message" attribute
         */
        boolean isSetConfirmationMessage();
        
        /**
         * Sets the "confirmation-message" attribute
         */
        void setConfirmationMessage(java.lang.String confirmationMessage);
        
        /**
         * Sets (as xml) the "confirmation-message" attribute
         */
        void xsetConfirmationMessage(org.apache.xmlbeans.XmlString confirmationMessage);
        
        /**
         * Unsets the "confirmation-message" attribute
         */
        void unsetConfirmationMessage();
        
        /**
         * An XML button-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.SubmitDocument$Submit$ButtonType.
         */
        public interface ButtonType extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ButtonType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("buttontype07caattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum BUTTON = Enum.forString("button");
            static final Enum TEXT_LINK = Enum.forString("text-link");
            static final Enum IMAGE = Enum.forString("image");
            
            static final int INT_BUTTON = Enum.INT_BUTTON;
            static final int INT_TEXT_LINK = Enum.INT_TEXT_LINK;
            static final int INT_IMAGE = Enum.INT_IMAGE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.SubmitDocument$Submit$ButtonType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_BUTTON
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
                
                static final int INT_BUTTON = 1;
                static final int INT_TEXT_LINK = 2;
                static final int INT_IMAGE = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("button", INT_BUTTON),
                      new Enum("text-link", INT_TEXT_LINK),
                      new Enum("image", INT_IMAGE),
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
                public static com.kyt.xsd.widgetform.SubmitDocument.Submit.ButtonType newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.SubmitDocument.Submit.ButtonType) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.SubmitDocument.Submit.ButtonType newInstance() {
                  return (com.kyt.xsd.widgetform.SubmitDocument.Submit.ButtonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.SubmitDocument.Submit.ButtonType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.SubmitDocument.Submit.ButtonType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML request-confirmation(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.SubmitDocument$Submit$RequestConfirmation.
         */
        public interface RequestConfirmation extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestConfirmation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("requestconfirmation0fc0attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.SubmitDocument$Submit$RequestConfirmation.
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
                public static com.kyt.xsd.widgetform.SubmitDocument.Submit.RequestConfirmation newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.SubmitDocument.Submit.RequestConfirmation) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.SubmitDocument.Submit.RequestConfirmation newInstance() {
                  return (com.kyt.xsd.widgetform.SubmitDocument.Submit.RequestConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.SubmitDocument.Submit.RequestConfirmation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.SubmitDocument.Submit.RequestConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.SubmitDocument.Submit newInstance() {
              return (com.kyt.xsd.widgetform.SubmitDocument.Submit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.SubmitDocument.Submit newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.SubmitDocument.Submit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.SubmitDocument newInstance() {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.SubmitDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.SubmitDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubmitDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.SubmitDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubmitDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.SubmitDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubmitDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.SubmitDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubmitDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.SubmitDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubmitDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.SubmitDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubmitDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.SubmitDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubmitDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.SubmitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.SubmitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.SubmitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
