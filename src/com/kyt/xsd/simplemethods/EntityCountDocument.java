/*
 * An XML document type.
 * Localname: entity-count
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.EntityCountDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one entity-count(@) element.
 *
 * This is a complex type.
 */
public interface EntityCountDocument extends com.kyt.xsd.simplemethods.EntityFindOperationsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityCountDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("entitycountad9edoctype");
    
    /**
     * Gets the "entity-count" element
     */
    com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount getEntityCount();
    
    /**
     * Sets the "entity-count" element
     */
    void setEntityCount(com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount entityCount);
    
    /**
     * Appends and returns a new empty "entity-count" element
     */
    com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount addNewEntityCount();
    
    /**
     * An XML entity-count(@).
     *
     * This is a complex type.
     */
    public interface EntityCount extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityCount.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("entitycountf44delemtype");
        
        /**
         * Gets the "condition-expr" element
         */
        com.kyt.xsd.simplemethods.ConditionExprDocument.ConditionExpr getConditionExpr();
        
        /**
         * True if has "condition-expr" element
         */
        boolean isSetConditionExpr();
        
        /**
         * Sets the "condition-expr" element
         */
        void setConditionExpr(com.kyt.xsd.simplemethods.ConditionExprDocument.ConditionExpr conditionExpr);
        
        /**
         * Appends and returns a new empty "condition-expr" element
         */
        com.kyt.xsd.simplemethods.ConditionExprDocument.ConditionExpr addNewConditionExpr();
        
        /**
         * Unsets the "condition-expr" element
         */
        void unsetConditionExpr();
        
        /**
         * Gets the "condition-list" element
         */
        com.kyt.xsd.simplemethods.ConditionListDocument.ConditionList getConditionList();
        
        /**
         * True if has "condition-list" element
         */
        boolean isSetConditionList();
        
        /**
         * Sets the "condition-list" element
         */
        void setConditionList(com.kyt.xsd.simplemethods.ConditionListDocument.ConditionList conditionList);
        
        /**
         * Appends and returns a new empty "condition-list" element
         */
        com.kyt.xsd.simplemethods.ConditionListDocument.ConditionList addNewConditionList();
        
        /**
         * Unsets the "condition-list" element
         */
        void unsetConditionList();
        
        /**
         * Gets the "condition-object" element
         */
        com.kyt.xsd.simplemethods.ConditionObjectDocument.ConditionObject getConditionObject();
        
        /**
         * True if has "condition-object" element
         */
        boolean isSetConditionObject();
        
        /**
         * Sets the "condition-object" element
         */
        void setConditionObject(com.kyt.xsd.simplemethods.ConditionObjectDocument.ConditionObject conditionObject);
        
        /**
         * Appends and returns a new empty "condition-object" element
         */
        com.kyt.xsd.simplemethods.ConditionObjectDocument.ConditionObject addNewConditionObject();
        
        /**
         * Unsets the "condition-object" element
         */
        void unsetConditionObject();
        
        /**
         * Gets the "having-condition-list" element
         */
        com.kyt.xsd.simplemethods.HavingConditionListDocument.HavingConditionList getHavingConditionList();
        
        /**
         * True if has "having-condition-list" element
         */
        boolean isSetHavingConditionList();
        
        /**
         * Sets the "having-condition-list" element
         */
        void setHavingConditionList(com.kyt.xsd.simplemethods.HavingConditionListDocument.HavingConditionList havingConditionList);
        
        /**
         * Appends and returns a new empty "having-condition-list" element
         */
        com.kyt.xsd.simplemethods.HavingConditionListDocument.HavingConditionList addNewHavingConditionList();
        
        /**
         * Unsets the "having-condition-list" element
         */
        void unsetHavingConditionList();
        
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
         * Gets the "delegator-name" attribute
         */
        java.lang.String getDelegatorName();
        
        /**
         * Gets (as xml) the "delegator-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetDelegatorName();
        
        /**
         * True if has "delegator-name" attribute
         */
        boolean isSetDelegatorName();
        
        /**
         * Sets the "delegator-name" attribute
         */
        void setDelegatorName(java.lang.String delegatorName);
        
        /**
         * Sets (as xml) the "delegator-name" attribute
         */
        void xsetDelegatorName(org.apache.xmlbeans.XmlString delegatorName);
        
        /**
         * Unsets the "delegator-name" attribute
         */
        void unsetDelegatorName();
        
        /**
         * Gets the "count-field" attribute
         */
        java.lang.String getCountField();
        
        /**
         * Gets (as xml) the "count-field" attribute
         */
        org.apache.xmlbeans.XmlString xgetCountField();
        
        /**
         * Sets the "count-field" attribute
         */
        void setCountField(java.lang.String countField);
        
        /**
         * Sets (as xml) the "count-field" attribute
         */
        void xsetCountField(org.apache.xmlbeans.XmlString countField);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount newInstance() {
              return (com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.EntityCountDocument newInstance() {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityCountDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.EntityCountDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.EntityCountDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
