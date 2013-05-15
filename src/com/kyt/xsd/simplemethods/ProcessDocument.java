/*
 * An XML document type.
 * Localname: process
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.ProcessDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one process(@) element.
 *
 * This is a complex type.
 */
public interface ProcessDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProcessDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("process4bd6doctype");
    
    /**
     * Gets the "process" element
     */
    com.kyt.xsd.simplemethods.ProcessDocument.Process getProcess();
    
    /**
     * Sets the "process" element
     */
    void setProcess(com.kyt.xsd.simplemethods.ProcessDocument.Process process);
    
    /**
     * Appends and returns a new empty "process" element
     */
    com.kyt.xsd.simplemethods.ProcessDocument.Process addNewProcess();
    
    /**
     * An XML process(@).
     *
     * This is a complex type.
     */
    public interface Process extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Process.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("process8d01elemtype");
        
        /**
         * Gets array of all "validate-method" elements
         */
        com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod[] getValidateMethodArray();
        
        /**
         * Gets ith "validate-method" element
         */
        com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod getValidateMethodArray(int i);
        
        /**
         * Returns number of "validate-method" element
         */
        int sizeOfValidateMethodArray();
        
        /**
         * Sets array of all "validate-method" element
         */
        void setValidateMethodArray(com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod[] validateMethodArray);
        
        /**
         * Sets ith "validate-method" element
         */
        void setValidateMethodArray(int i, com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod validateMethod);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "validate-method" element
         */
        com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod insertNewValidateMethod(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "validate-method" element
         */
        com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod addNewValidateMethod();
        
        /**
         * Removes the ith "validate-method" element
         */
        void removeValidateMethod(int i);
        
        /**
         * Gets array of all "compare" elements
         */
        com.kyt.xsd.simplemethods.CompareDocument.Compare[] getCompareArray();
        
        /**
         * Gets ith "compare" element
         */
        com.kyt.xsd.simplemethods.CompareDocument.Compare getCompareArray(int i);
        
        /**
         * Returns number of "compare" element
         */
        int sizeOfCompareArray();
        
        /**
         * Sets array of all "compare" element
         */
        void setCompareArray(com.kyt.xsd.simplemethods.CompareDocument.Compare[] compareArray);
        
        /**
         * Sets ith "compare" element
         */
        void setCompareArray(int i, com.kyt.xsd.simplemethods.CompareDocument.Compare compare);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "compare" element
         */
        com.kyt.xsd.simplemethods.CompareDocument.Compare insertNewCompare(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "compare" element
         */
        com.kyt.xsd.simplemethods.CompareDocument.Compare addNewCompare();
        
        /**
         * Removes the ith "compare" element
         */
        void removeCompare(int i);
        
        /**
         * Gets array of all "compare-field" elements
         */
        com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField[] getCompareFieldArray();
        
        /**
         * Gets ith "compare-field" element
         */
        com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField getCompareFieldArray(int i);
        
        /**
         * Returns number of "compare-field" element
         */
        int sizeOfCompareFieldArray();
        
        /**
         * Sets array of all "compare-field" element
         */
        void setCompareFieldArray(com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField[] compareFieldArray);
        
        /**
         * Sets ith "compare-field" element
         */
        void setCompareFieldArray(int i, com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField compareField);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "compare-field" element
         */
        com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField insertNewCompareField(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "compare-field" element
         */
        com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField addNewCompareField();
        
        /**
         * Removes the ith "compare-field" element
         */
        void removeCompareField(int i);
        
        /**
         * Gets array of all "regexp" elements
         */
        com.kyt.xsd.simplemethods.RegexpDocument.Regexp[] getRegexpArray();
        
        /**
         * Gets ith "regexp" element
         */
        com.kyt.xsd.simplemethods.RegexpDocument.Regexp getRegexpArray(int i);
        
        /**
         * Returns number of "regexp" element
         */
        int sizeOfRegexpArray();
        
        /**
         * Sets array of all "regexp" element
         */
        void setRegexpArray(com.kyt.xsd.simplemethods.RegexpDocument.Regexp[] regexpArray);
        
        /**
         * Sets ith "regexp" element
         */
        void setRegexpArray(int i, com.kyt.xsd.simplemethods.RegexpDocument.Regexp regexp);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "regexp" element
         */
        com.kyt.xsd.simplemethods.RegexpDocument.Regexp insertNewRegexp(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "regexp" element
         */
        com.kyt.xsd.simplemethods.RegexpDocument.Regexp addNewRegexp();
        
        /**
         * Removes the ith "regexp" element
         */
        void removeRegexp(int i);
        
        /**
         * Gets array of all "not-empty" elements
         */
        com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty[] getNotEmptyArray();
        
        /**
         * Gets ith "not-empty" element
         */
        com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty getNotEmptyArray(int i);
        
        /**
         * Returns number of "not-empty" element
         */
        int sizeOfNotEmptyArray();
        
        /**
         * Sets array of all "not-empty" element
         */
        void setNotEmptyArray(com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty[] notEmptyArray);
        
        /**
         * Sets ith "not-empty" element
         */
        void setNotEmptyArray(int i, com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty notEmpty);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "not-empty" element
         */
        com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty insertNewNotEmpty(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "not-empty" element
         */
        com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty addNewNotEmpty();
        
        /**
         * Removes the ith "not-empty" element
         */
        void removeNotEmpty(int i);
        
        /**
         * Gets array of all "copy" elements
         */
        com.kyt.xsd.simplemethods.CopyDocument.Copy[] getCopyArray();
        
        /**
         * Gets ith "copy" element
         */
        com.kyt.xsd.simplemethods.CopyDocument.Copy getCopyArray(int i);
        
        /**
         * Returns number of "copy" element
         */
        int sizeOfCopyArray();
        
        /**
         * Sets array of all "copy" element
         */
        void setCopyArray(com.kyt.xsd.simplemethods.CopyDocument.Copy[] copyArray);
        
        /**
         * Sets ith "copy" element
         */
        void setCopyArray(int i, com.kyt.xsd.simplemethods.CopyDocument.Copy copy);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "copy" element
         */
        com.kyt.xsd.simplemethods.CopyDocument.Copy insertNewCopy(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "copy" element
         */
        com.kyt.xsd.simplemethods.CopyDocument.Copy addNewCopy();
        
        /**
         * Removes the ith "copy" element
         */
        void removeCopy(int i);
        
        /**
         * Gets array of all "convert" elements
         */
        com.kyt.xsd.simplemethods.ConvertDocument.Convert[] getConvertArray();
        
        /**
         * Gets ith "convert" element
         */
        com.kyt.xsd.simplemethods.ConvertDocument.Convert getConvertArray(int i);
        
        /**
         * Returns number of "convert" element
         */
        int sizeOfConvertArray();
        
        /**
         * Sets array of all "convert" element
         */
        void setConvertArray(com.kyt.xsd.simplemethods.ConvertDocument.Convert[] convertArray);
        
        /**
         * Sets ith "convert" element
         */
        void setConvertArray(int i, com.kyt.xsd.simplemethods.ConvertDocument.Convert convert);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "convert" element
         */
        com.kyt.xsd.simplemethods.ConvertDocument.Convert insertNewConvert(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "convert" element
         */
        com.kyt.xsd.simplemethods.ConvertDocument.Convert addNewConvert();
        
        /**
         * Removes the ith "convert" element
         */
        void removeConvert(int i);
        
        /**
         * Gets the "field" attribute
         */
        java.lang.String getField();
        
        /**
         * Gets (as xml) the "field" attribute
         */
        org.apache.xmlbeans.XmlString xgetField();
        
        /**
         * Sets the "field" attribute
         */
        void setField(java.lang.String field);
        
        /**
         * Sets (as xml) the "field" attribute
         */
        void xsetField(org.apache.xmlbeans.XmlString field);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.ProcessDocument.Process newInstance() {
              return (com.kyt.xsd.simplemethods.ProcessDocument.Process) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.ProcessDocument.Process newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.ProcessDocument.Process) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.ProcessDocument newInstance() {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.ProcessDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.ProcessDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.ProcessDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
