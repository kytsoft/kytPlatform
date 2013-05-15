/*
 * An XML document type.
 * Localname: check-errors
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.CheckErrorsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one check-errors(@) element.
 *
 * This is a complex type.
 */
public interface CheckErrorsDocument extends com.kyt.xsd.simplemethods.ControlOperationsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CheckErrorsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("checkerrorsd6c9doctype");
    
    /**
     * Gets the "check-errors" element
     */
    com.kyt.xsd.simplemethods.CheckErrorsDocument.CheckErrors getCheckErrors();
    
    /**
     * Sets the "check-errors" element
     */
    void setCheckErrors(com.kyt.xsd.simplemethods.CheckErrorsDocument.CheckErrors checkErrors);
    
    /**
     * Appends and returns a new empty "check-errors" element
     */
    com.kyt.xsd.simplemethods.CheckErrorsDocument.CheckErrors addNewCheckErrors();
    
    /**
     * An XML check-errors(@).
     *
     * This is a complex type.
     */
    public interface CheckErrors extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CheckErrors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("checkerrors18edelemtype");
        
        /**
         * Gets the "error-prefix" element
         */
        com.kyt.xsd.simplemethods.ErrorPrefixDocument.ErrorPrefix getErrorPrefix();
        
        /**
         * True if has "error-prefix" element
         */
        boolean isSetErrorPrefix();
        
        /**
         * Sets the "error-prefix" element
         */
        void setErrorPrefix(com.kyt.xsd.simplemethods.ErrorPrefixDocument.ErrorPrefix errorPrefix);
        
        /**
         * Appends and returns a new empty "error-prefix" element
         */
        com.kyt.xsd.simplemethods.ErrorPrefixDocument.ErrorPrefix addNewErrorPrefix();
        
        /**
         * Unsets the "error-prefix" element
         */
        void unsetErrorPrefix();
        
        /**
         * Gets the "error-suffix" element
         */
        com.kyt.xsd.simplemethods.ErrorSuffixDocument.ErrorSuffix getErrorSuffix();
        
        /**
         * True if has "error-suffix" element
         */
        boolean isSetErrorSuffix();
        
        /**
         * Sets the "error-suffix" element
         */
        void setErrorSuffix(com.kyt.xsd.simplemethods.ErrorSuffixDocument.ErrorSuffix errorSuffix);
        
        /**
         * Appends and returns a new empty "error-suffix" element
         */
        com.kyt.xsd.simplemethods.ErrorSuffixDocument.ErrorSuffix addNewErrorSuffix();
        
        /**
         * Unsets the "error-suffix" element
         */
        void unsetErrorSuffix();
        
        /**
         * Gets the "message-prefix" element
         */
        com.kyt.xsd.simplemethods.MessagePrefixDocument.MessagePrefix getMessagePrefix();
        
        /**
         * True if has "message-prefix" element
         */
        boolean isSetMessagePrefix();
        
        /**
         * Sets the "message-prefix" element
         */
        void setMessagePrefix(com.kyt.xsd.simplemethods.MessagePrefixDocument.MessagePrefix messagePrefix);
        
        /**
         * Appends and returns a new empty "message-prefix" element
         */
        com.kyt.xsd.simplemethods.MessagePrefixDocument.MessagePrefix addNewMessagePrefix();
        
        /**
         * Unsets the "message-prefix" element
         */
        void unsetMessagePrefix();
        
        /**
         * Gets the "message-suffix" element
         */
        com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix getMessageSuffix();
        
        /**
         * True if has "message-suffix" element
         */
        boolean isSetMessageSuffix();
        
        /**
         * Sets the "message-suffix" element
         */
        void setMessageSuffix(com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix messageSuffix);
        
        /**
         * Appends and returns a new empty "message-suffix" element
         */
        com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix addNewMessageSuffix();
        
        /**
         * Unsets the "message-suffix" element
         */
        void unsetMessageSuffix();
        
        /**
         * Gets the "error-code" attribute
         */
        java.lang.String getErrorCode();
        
        /**
         * Gets (as xml) the "error-code" attribute
         */
        org.apache.xmlbeans.XmlString xgetErrorCode();
        
        /**
         * True if has "error-code" attribute
         */
        boolean isSetErrorCode();
        
        /**
         * Sets the "error-code" attribute
         */
        void setErrorCode(java.lang.String errorCode);
        
        /**
         * Sets (as xml) the "error-code" attribute
         */
        void xsetErrorCode(org.apache.xmlbeans.XmlString errorCode);
        
        /**
         * Unsets the "error-code" attribute
         */
        void unsetErrorCode();
        
        /**
         * Gets the "error-list-name" attribute
         */
        java.lang.String getErrorListName();
        
        /**
         * Gets (as xml) the "error-list-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetErrorListName();
        
        /**
         * True if has "error-list-name" attribute
         */
        boolean isSetErrorListName();
        
        /**
         * Sets the "error-list-name" attribute
         */
        void setErrorListName(java.lang.String errorListName);
        
        /**
         * Sets (as xml) the "error-list-name" attribute
         */
        void xsetErrorListName(org.apache.xmlbeans.XmlString errorListName);
        
        /**
         * Unsets the "error-list-name" attribute
         */
        void unsetErrorListName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.CheckErrorsDocument.CheckErrors newInstance() {
              return (com.kyt.xsd.simplemethods.CheckErrorsDocument.CheckErrors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.CheckErrorsDocument.CheckErrors newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.CheckErrorsDocument.CheckErrors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument newInstance() {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.CheckErrorsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.CheckErrorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
