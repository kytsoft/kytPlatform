/*
 * An XML document type.
 * Localname: related-role-getter
 * Namespace: 
 * Java type: com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetmenu;


/**
 * A document containing one related-role-getter(@) element.
 *
 * This is a complex type.
 */
public interface RelatedRoleGetterDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedRoleGetterDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("relatedrolegetter9287doctype");
    
    /**
     * Gets the "related-role-getter" element
     */
    com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument.RelatedRoleGetter getRelatedRoleGetter();
    
    /**
     * Sets the "related-role-getter" element
     */
    void setRelatedRoleGetter(com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument.RelatedRoleGetter relatedRoleGetter);
    
    /**
     * Appends and returns a new empty "related-role-getter" element
     */
    com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument.RelatedRoleGetter addNewRelatedRoleGetter();
    
    /**
     * An XML related-role-getter(@).
     *
     * This is a complex type.
     */
    public interface RelatedRoleGetter extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedRoleGetter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("relatedrolegetter35a3elemtype");
        
        /**
         * Gets the "entity-name" attribute
         */
        java.lang.String getEntityName();
        
        /**
         * Gets (as xml) the "entity-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityName();
        
        /**
         * True if has "entity-name" attribute
         */
        boolean isSetEntityName();
        
        /**
         * Sets the "entity-name" attribute
         */
        void setEntityName(java.lang.String entityName);
        
        /**
         * Sets (as xml) the "entity-name" attribute
         */
        void xsetEntityName(org.apache.xmlbeans.XmlString entityName);
        
        /**
         * Unsets the "entity-name" attribute
         */
        void unsetEntityName();
        
        /**
         * Gets the "role-entity-name" attribute
         */
        java.lang.String getRoleEntityName();
        
        /**
         * Gets (as xml) the "role-entity-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetRoleEntityName();
        
        /**
         * True if has "role-entity-name" attribute
         */
        boolean isSetRoleEntityName();
        
        /**
         * Sets the "role-entity-name" attribute
         */
        void setRoleEntityName(java.lang.String roleEntityName);
        
        /**
         * Sets (as xml) the "role-entity-name" attribute
         */
        void xsetRoleEntityName(org.apache.xmlbeans.XmlString roleEntityName);
        
        /**
         * Unsets the "role-entity-name" attribute
         */
        void unsetRoleEntityName();
        
        /**
         * Gets the "role-type-field-name" attribute
         */
        java.lang.String getRoleTypeFieldName();
        
        /**
         * Gets (as xml) the "role-type-field-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetRoleTypeFieldName();
        
        /**
         * True if has "role-type-field-name" attribute
         */
        boolean isSetRoleTypeFieldName();
        
        /**
         * Sets the "role-type-field-name" attribute
         */
        void setRoleTypeFieldName(java.lang.String roleTypeFieldName);
        
        /**
         * Sets (as xml) the "role-type-field-name" attribute
         */
        void xsetRoleTypeFieldName(org.apache.xmlbeans.XmlString roleTypeFieldName);
        
        /**
         * Unsets the "role-type-field-name" attribute
         */
        void unsetRoleTypeFieldName();
        
        /**
         * Gets the "party-field-name" attribute
         */
        java.lang.String getPartyFieldName();
        
        /**
         * Gets (as xml) the "party-field-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetPartyFieldName();
        
        /**
         * True if has "party-field-name" attribute
         */
        boolean isSetPartyFieldName();
        
        /**
         * Sets the "party-field-name" attribute
         */
        void setPartyFieldName(java.lang.String partyFieldName);
        
        /**
         * Sets (as xml) the "party-field-name" attribute
         */
        void xsetPartyFieldName(org.apache.xmlbeans.XmlString partyFieldName);
        
        /**
         * Unsets the "party-field-name" attribute
         */
        void unsetPartyFieldName();
        
        /**
         * Gets the "owner-entity-field-name" attribute
         */
        java.lang.String getOwnerEntityFieldName();
        
        /**
         * Gets (as xml) the "owner-entity-field-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetOwnerEntityFieldName();
        
        /**
         * True if has "owner-entity-field-name" attribute
         */
        boolean isSetOwnerEntityFieldName();
        
        /**
         * Sets the "owner-entity-field-name" attribute
         */
        void setOwnerEntityFieldName(java.lang.String ownerEntityFieldName);
        
        /**
         * Sets (as xml) the "owner-entity-field-name" attribute
         */
        void xsetOwnerEntityFieldName(org.apache.xmlbeans.XmlString ownerEntityFieldName);
        
        /**
         * Unsets the "owner-entity-field-name" attribute
         */
        void unsetOwnerEntityFieldName();
        
        /**
         * Gets the "entity-id-name" attribute
         */
        java.lang.String getEntityIdName();
        
        /**
         * Gets (as xml) the "entity-id-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityIdName();
        
        /**
         * True if has "entity-id-name" attribute
         */
        boolean isSetEntityIdName();
        
        /**
         * Sets the "entity-id-name" attribute
         */
        void setEntityIdName(java.lang.String entityIdName);
        
        /**
         * Sets (as xml) the "entity-id-name" attribute
         */
        void xsetEntityIdName(org.apache.xmlbeans.XmlString entityIdName);
        
        /**
         * Unsets the "entity-id-name" attribute
         */
        void unsetEntityIdName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument.RelatedRoleGetter newInstance() {
              return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument.RelatedRoleGetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument.RelatedRoleGetter newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument.RelatedRoleGetter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument newInstance() {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetmenu.RelatedRoleGetterDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
