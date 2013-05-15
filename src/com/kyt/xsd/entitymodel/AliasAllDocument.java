/*
 * An XML document type.
 * Localname: alias-all
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.AliasAllDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel;


/**
 * A document containing one alias-all(@) element.
 *
 * This is a complex type.
 */
public interface AliasAllDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AliasAllDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC06412D5939EE085657300132FC0B98").resolveHandle("aliasall4c4bdoctype");
    
    /**
     * Gets the "alias-all" element
     */
    com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll getAliasAll();
    
    /**
     * Sets the "alias-all" element
     */
    void setAliasAll(com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll aliasAll);
    
    /**
     * Appends and returns a new empty "alias-all" element
     */
    com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll addNewAliasAll();
    
    /**
     * An XML alias-all(@).
     *
     * This is a complex type.
     */
    public interface AliasAll extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AliasAll.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC06412D5939EE085657300132FC0B98").resolveHandle("aliasallc76belemtype");
        
        /**
         * Gets the "description" element
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" element
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * True if has "description" element
         */
        boolean isSetDescription();
        
        /**
         * Sets the "description" element
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" element
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Unsets the "description" element
         */
        void unsetDescription();
        
        /**
         * Gets array of all "exclude" elements
         */
        com.kyt.xsd.entitymodel.ExcludeDocument.Exclude[] getExcludeArray();
        
        /**
         * Gets ith "exclude" element
         */
        com.kyt.xsd.entitymodel.ExcludeDocument.Exclude getExcludeArray(int i);
        
        /**
         * Returns number of "exclude" element
         */
        int sizeOfExcludeArray();
        
        /**
         * Sets array of all "exclude" element
         */
        void setExcludeArray(com.kyt.xsd.entitymodel.ExcludeDocument.Exclude[] excludeArray);
        
        /**
         * Sets ith "exclude" element
         */
        void setExcludeArray(int i, com.kyt.xsd.entitymodel.ExcludeDocument.Exclude exclude);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "exclude" element
         */
        com.kyt.xsd.entitymodel.ExcludeDocument.Exclude insertNewExclude(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "exclude" element
         */
        com.kyt.xsd.entitymodel.ExcludeDocument.Exclude addNewExclude();
        
        /**
         * Removes the ith "exclude" element
         */
        void removeExclude(int i);
        
        /**
         * Gets the "entity-alias" attribute
         */
        java.lang.String getEntityAlias();
        
        /**
         * Gets (as xml) the "entity-alias" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityAlias();
        
        /**
         * Sets the "entity-alias" attribute
         */
        void setEntityAlias(java.lang.String entityAlias);
        
        /**
         * Sets (as xml) the "entity-alias" attribute
         */
        void xsetEntityAlias(org.apache.xmlbeans.XmlString entityAlias);
        
        /**
         * Gets the "prefix" attribute
         */
        java.lang.String getPrefix();
        
        /**
         * Gets (as xml) the "prefix" attribute
         */
        org.apache.xmlbeans.XmlString xgetPrefix();
        
        /**
         * True if has "prefix" attribute
         */
        boolean isSetPrefix();
        
        /**
         * Sets the "prefix" attribute
         */
        void setPrefix(java.lang.String prefix);
        
        /**
         * Sets (as xml) the "prefix" attribute
         */
        void xsetPrefix(org.apache.xmlbeans.XmlString prefix);
        
        /**
         * Unsets the "prefix" attribute
         */
        void unsetPrefix();
        
        /**
         * Gets the "group-by" attribute
         */
        com.kyt.xsd.entitymodel.Boolean.Enum getGroupBy();
        
        /**
         * Gets (as xml) the "group-by" attribute
         */
        com.kyt.xsd.entitymodel.Boolean xgetGroupBy();
        
        /**
         * True if has "group-by" attribute
         */
        boolean isSetGroupBy();
        
        /**
         * Sets the "group-by" attribute
         */
        void setGroupBy(com.kyt.xsd.entitymodel.Boolean.Enum groupBy);
        
        /**
         * Sets (as xml) the "group-by" attribute
         */
        void xsetGroupBy(com.kyt.xsd.entitymodel.Boolean groupBy);
        
        /**
         * Unsets the "group-by" attribute
         */
        void unsetGroupBy();
        
        /**
         * Gets the "function" attribute
         */
        com.kyt.xsd.entitymodel.AggregateFunction.Enum getFunction();
        
        /**
         * Gets (as xml) the "function" attribute
         */
        com.kyt.xsd.entitymodel.AggregateFunction xgetFunction();
        
        /**
         * True if has "function" attribute
         */
        boolean isSetFunction();
        
        /**
         * Sets the "function" attribute
         */
        void setFunction(com.kyt.xsd.entitymodel.AggregateFunction.Enum function);
        
        /**
         * Sets (as xml) the "function" attribute
         */
        void xsetFunction(com.kyt.xsd.entitymodel.AggregateFunction function);
        
        /**
         * Unsets the "function" attribute
         */
        void unsetFunction();
        
        /**
         * Gets the "field-set" attribute
         */
        java.lang.String getFieldSet();
        
        /**
         * Gets (as xml) the "field-set" attribute
         */
        org.apache.xmlbeans.XmlString xgetFieldSet();
        
        /**
         * True if has "field-set" attribute
         */
        boolean isSetFieldSet();
        
        /**
         * Sets the "field-set" attribute
         */
        void setFieldSet(java.lang.String fieldSet);
        
        /**
         * Sets (as xml) the "field-set" attribute
         */
        void xsetFieldSet(org.apache.xmlbeans.XmlString fieldSet);
        
        /**
         * Unsets the "field-set" attribute
         */
        void unsetFieldSet();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll newInstance() {
              return (com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.entitymodel.AliasAllDocument newInstance() {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.entitymodel.AliasAllDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entitymodel.AliasAllDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entitymodel.AliasAllDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
