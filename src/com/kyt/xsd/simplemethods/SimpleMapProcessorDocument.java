/*
 * An XML document type.
 * Localname: simple-map-processor
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.SimpleMapProcessorDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one simple-map-processor(@) element.
 *
 * This is a complex type.
 */
public interface SimpleMapProcessorDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SimpleMapProcessorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("simplemapprocessora67fdoctype");
    
    /**
     * Gets the "simple-map-processor" element
     */
    com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor getSimpleMapProcessor();
    
    /**
     * Sets the "simple-map-processor" element
     */
    void setSimpleMapProcessor(com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor simpleMapProcessor);
    
    /**
     * Appends and returns a new empty "simple-map-processor" element
     */
    com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor addNewSimpleMapProcessor();
    
    /**
     * An XML simple-map-processor(@).
     *
     * This is a complex type.
     */
    public interface SimpleMapProcessor extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SimpleMapProcessor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("simplemapprocessor472delemtype");
        
        /**
         * Gets array of all "make-in-string" elements
         */
        com.kyt.xsd.simplemethods.MakeInStringDocument.MakeInString[] getMakeInStringArray();
        
        /**
         * Gets ith "make-in-string" element
         */
        com.kyt.xsd.simplemethods.MakeInStringDocument.MakeInString getMakeInStringArray(int i);
        
        /**
         * Returns number of "make-in-string" element
         */
        int sizeOfMakeInStringArray();
        
        /**
         * Sets array of all "make-in-string" element
         */
        void setMakeInStringArray(com.kyt.xsd.simplemethods.MakeInStringDocument.MakeInString[] makeInStringArray);
        
        /**
         * Sets ith "make-in-string" element
         */
        void setMakeInStringArray(int i, com.kyt.xsd.simplemethods.MakeInStringDocument.MakeInString makeInString);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "make-in-string" element
         */
        com.kyt.xsd.simplemethods.MakeInStringDocument.MakeInString insertNewMakeInString(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "make-in-string" element
         */
        com.kyt.xsd.simplemethods.MakeInStringDocument.MakeInString addNewMakeInString();
        
        /**
         * Removes the ith "make-in-string" element
         */
        void removeMakeInString(int i);
        
        /**
         * Gets array of all "process" elements
         */
        com.kyt.xsd.simplemethods.ProcessDocument.Process[] getProcessArray();
        
        /**
         * Gets ith "process" element
         */
        com.kyt.xsd.simplemethods.ProcessDocument.Process getProcessArray(int i);
        
        /**
         * Returns number of "process" element
         */
        int sizeOfProcessArray();
        
        /**
         * Sets array of all "process" element
         */
        void setProcessArray(com.kyt.xsd.simplemethods.ProcessDocument.Process[] processArray);
        
        /**
         * Sets ith "process" element
         */
        void setProcessArray(int i, com.kyt.xsd.simplemethods.ProcessDocument.Process process);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "process" element
         */
        com.kyt.xsd.simplemethods.ProcessDocument.Process insertNewProcess(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "process" element
         */
        com.kyt.xsd.simplemethods.ProcessDocument.Process addNewProcess();
        
        /**
         * Removes the ith "process" element
         */
        void removeProcess(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor newInstance() {
              return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument newInstance() {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.SimpleMapProcessorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
