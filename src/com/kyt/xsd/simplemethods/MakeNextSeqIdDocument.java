/*
 * An XML document type.
 * Localname: make-next-seq-id
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.MakeNextSeqIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one make-next-seq-id(@) element.
 *
 * This is a complex type.
 */
public interface MakeNextSeqIdDocument extends com.kyt.xsd.simplemethods.EntityMiscOperationsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MakeNextSeqIdDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("makenextseqid7a7ddoctype");
    
    /**
     * Gets the "make-next-seq-id" element
     */
    com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId getMakeNextSeqId();
    
    /**
     * Sets the "make-next-seq-id" element
     */
    void setMakeNextSeqId(com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId makeNextSeqId);
    
    /**
     * Appends and returns a new empty "make-next-seq-id" element
     */
    com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId addNewMakeNextSeqId();
    
    /**
     * An XML make-next-seq-id(@).
     *
     * This is a complex type.
     */
    public interface MakeNextSeqId extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MakeNextSeqId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("makenextseqidd1edelemtype");
        
        /**
         * Gets the "value-field" attribute
         */
        java.lang.String getValueField();
        
        /**
         * Gets (as xml) the "value-field" attribute
         */
        org.apache.xmlbeans.XmlString xgetValueField();
        
        /**
         * Sets the "value-field" attribute
         */
        void setValueField(java.lang.String valueField);
        
        /**
         * Sets (as xml) the "value-field" attribute
         */
        void xsetValueField(org.apache.xmlbeans.XmlString valueField);
        
        /**
         * Gets the "seq-field-name" attribute
         */
        java.lang.String getSeqFieldName();
        
        /**
         * Gets (as xml) the "seq-field-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetSeqFieldName();
        
        /**
         * Sets the "seq-field-name" attribute
         */
        void setSeqFieldName(java.lang.String seqFieldName);
        
        /**
         * Sets (as xml) the "seq-field-name" attribute
         */
        void xsetSeqFieldName(org.apache.xmlbeans.XmlString seqFieldName);
        
        /**
         * Gets the "numeric-padding" attribute
         */
        java.lang.String getNumericPadding();
        
        /**
         * Gets (as xml) the "numeric-padding" attribute
         */
        org.apache.xmlbeans.XmlString xgetNumericPadding();
        
        /**
         * True if has "numeric-padding" attribute
         */
        boolean isSetNumericPadding();
        
        /**
         * Sets the "numeric-padding" attribute
         */
        void setNumericPadding(java.lang.String numericPadding);
        
        /**
         * Sets (as xml) the "numeric-padding" attribute
         */
        void xsetNumericPadding(org.apache.xmlbeans.XmlString numericPadding);
        
        /**
         * Unsets the "numeric-padding" attribute
         */
        void unsetNumericPadding();
        
        /**
         * Gets the "increment-by" attribute
         */
        java.lang.String getIncrementBy();
        
        /**
         * Gets (as xml) the "increment-by" attribute
         */
        org.apache.xmlbeans.XmlString xgetIncrementBy();
        
        /**
         * True if has "increment-by" attribute
         */
        boolean isSetIncrementBy();
        
        /**
         * Sets the "increment-by" attribute
         */
        void setIncrementBy(java.lang.String incrementBy);
        
        /**
         * Sets (as xml) the "increment-by" attribute
         */
        void xsetIncrementBy(org.apache.xmlbeans.XmlString incrementBy);
        
        /**
         * Unsets the "increment-by" attribute
         */
        void unsetIncrementBy();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId newInstance() {
              return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument newInstance() {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.MakeNextSeqIdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
