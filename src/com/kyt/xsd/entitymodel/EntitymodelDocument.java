/*
 * An XML document type.
 * Localname: entitymodel
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.EntitymodelDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel;


/**
 * A document containing one entitymodel(@) element.
 *
 * This is a complex type.
 */
public interface EntitymodelDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntitymodelDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC06412D5939EE085657300132FC0B98").resolveHandle("entitymodel2f0ddoctype");
    
    /**
     * Gets the "entitymodel" element
     */
    com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel getEntitymodel();
    
    /**
     * Sets the "entitymodel" element
     */
    void setEntitymodel(com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel entitymodel);
    
    /**
     * Appends and returns a new empty "entitymodel" element
     */
    com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel addNewEntitymodel();
    
    /**
     * An XML entitymodel(@).
     *
     * This is a complex type.
     */
    public interface Entitymodel extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Entitymodel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC06412D5939EE085657300132FC0B98").resolveHandle("entitymodel492felemtype");
        
        /**
         * Gets the "title" element
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" element
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * True if has "title" element
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" element
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" element
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Unsets the "title" element
         */
        void unsetTitle();
        
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
         * Gets array of all "copyright" elements
         */
        java.lang.String[] getCopyrightArray();
        
        /**
         * Gets ith "copyright" element
         */
        java.lang.String getCopyrightArray(int i);
        
        /**
         * Gets (as xml) array of all "copyright" elements
         */
        org.apache.xmlbeans.XmlString[] xgetCopyrightArray();
        
        /**
         * Gets (as xml) ith "copyright" element
         */
        org.apache.xmlbeans.XmlString xgetCopyrightArray(int i);
        
        /**
         * Returns number of "copyright" element
         */
        int sizeOfCopyrightArray();
        
        /**
         * Sets array of all "copyright" element
         */
        void setCopyrightArray(java.lang.String[] copyrightArray);
        
        /**
         * Sets ith "copyright" element
         */
        void setCopyrightArray(int i, java.lang.String copyright);
        
        /**
         * Sets (as xml) array of all "copyright" element
         */
        void xsetCopyrightArray(org.apache.xmlbeans.XmlString[] copyrightArray);
        
        /**
         * Sets (as xml) ith "copyright" element
         */
        void xsetCopyrightArray(int i, org.apache.xmlbeans.XmlString copyright);
        
        /**
         * Inserts the value as the ith "copyright" element
         */
        void insertCopyright(int i, java.lang.String copyright);
        
        /**
         * Appends the value as the last "copyright" element
         */
        void addCopyright(java.lang.String copyright);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "copyright" element
         */
        org.apache.xmlbeans.XmlString insertNewCopyright(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "copyright" element
         */
        org.apache.xmlbeans.XmlString addNewCopyright();
        
        /**
         * Removes the ith "copyright" element
         */
        void removeCopyright(int i);
        
        /**
         * Gets array of all "author" elements
         */
        java.lang.String[] getAuthorArray();
        
        /**
         * Gets ith "author" element
         */
        java.lang.String getAuthorArray(int i);
        
        /**
         * Gets (as xml) array of all "author" elements
         */
        org.apache.xmlbeans.XmlString[] xgetAuthorArray();
        
        /**
         * Gets (as xml) ith "author" element
         */
        org.apache.xmlbeans.XmlString xgetAuthorArray(int i);
        
        /**
         * Returns number of "author" element
         */
        int sizeOfAuthorArray();
        
        /**
         * Sets array of all "author" element
         */
        void setAuthorArray(java.lang.String[] authorArray);
        
        /**
         * Sets ith "author" element
         */
        void setAuthorArray(int i, java.lang.String author);
        
        /**
         * Sets (as xml) array of all "author" element
         */
        void xsetAuthorArray(org.apache.xmlbeans.XmlString[] authorArray);
        
        /**
         * Sets (as xml) ith "author" element
         */
        void xsetAuthorArray(int i, org.apache.xmlbeans.XmlString author);
        
        /**
         * Inserts the value as the ith "author" element
         */
        void insertAuthor(int i, java.lang.String author);
        
        /**
         * Appends the value as the last "author" element
         */
        void addAuthor(java.lang.String author);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "author" element
         */
        org.apache.xmlbeans.XmlString insertNewAuthor(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "author" element
         */
        org.apache.xmlbeans.XmlString addNewAuthor();
        
        /**
         * Removes the ith "author" element
         */
        void removeAuthor(int i);
        
        /**
         * Gets the "version" element
         */
        java.lang.String getVersion();
        
        /**
         * Gets (as xml) the "version" element
         */
        org.apache.xmlbeans.XmlString xgetVersion();
        
        /**
         * True if has "version" element
         */
        boolean isSetVersion();
        
        /**
         * Sets the "version" element
         */
        void setVersion(java.lang.String version);
        
        /**
         * Sets (as xml) the "version" element
         */
        void xsetVersion(org.apache.xmlbeans.XmlString version);
        
        /**
         * Unsets the "version" element
         */
        void unsetVersion();
        
        /**
         * Gets the "default-resource-name" element
         */
        java.lang.String getDefaultResourceName();
        
        /**
         * Gets (as xml) the "default-resource-name" element
         */
        org.apache.xmlbeans.XmlString xgetDefaultResourceName();
        
        /**
         * True if has "default-resource-name" element
         */
        boolean isSetDefaultResourceName();
        
        /**
         * Sets the "default-resource-name" element
         */
        void setDefaultResourceName(java.lang.String defaultResourceName);
        
        /**
         * Sets (as xml) the "default-resource-name" element
         */
        void xsetDefaultResourceName(org.apache.xmlbeans.XmlString defaultResourceName);
        
        /**
         * Unsets the "default-resource-name" element
         */
        void unsetDefaultResourceName();
        
        /**
         * Gets array of all "entity" elements
         */
        com.kyt.xsd.entitymodel.EntityDocument.Entity[] getEntityArray();
        
        /**
         * Gets ith "entity" element
         */
        com.kyt.xsd.entitymodel.EntityDocument.Entity getEntityArray(int i);
        
        /**
         * Returns number of "entity" element
         */
        int sizeOfEntityArray();
        
        /**
         * Sets array of all "entity" element
         */
        void setEntityArray(com.kyt.xsd.entitymodel.EntityDocument.Entity[] entityArray);
        
        /**
         * Sets ith "entity" element
         */
        void setEntityArray(int i, com.kyt.xsd.entitymodel.EntityDocument.Entity entity);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity" element
         */
        com.kyt.xsd.entitymodel.EntityDocument.Entity insertNewEntity(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity" element
         */
        com.kyt.xsd.entitymodel.EntityDocument.Entity addNewEntity();
        
        /**
         * Removes the ith "entity" element
         */
        void removeEntity(int i);
        
        /**
         * Gets array of all "view-entity" elements
         */
        com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity[] getViewEntityArray();
        
        /**
         * Gets ith "view-entity" element
         */
        com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity getViewEntityArray(int i);
        
        /**
         * Returns number of "view-entity" element
         */
        int sizeOfViewEntityArray();
        
        /**
         * Sets array of all "view-entity" element
         */
        void setViewEntityArray(com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity[] viewEntityArray);
        
        /**
         * Sets ith "view-entity" element
         */
        void setViewEntityArray(int i, com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity viewEntity);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "view-entity" element
         */
        com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity insertNewViewEntity(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "view-entity" element
         */
        com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity addNewViewEntity();
        
        /**
         * Removes the ith "view-entity" element
         */
        void removeViewEntity(int i);
        
        /**
         * Gets array of all "extend-entity" elements
         */
        com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity[] getExtendEntityArray();
        
        /**
         * Gets ith "extend-entity" element
         */
        com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity getExtendEntityArray(int i);
        
        /**
         * Returns number of "extend-entity" element
         */
        int sizeOfExtendEntityArray();
        
        /**
         * Sets array of all "extend-entity" element
         */
        void setExtendEntityArray(com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity[] extendEntityArray);
        
        /**
         * Sets ith "extend-entity" element
         */
        void setExtendEntityArray(int i, com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity extendEntity);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extend-entity" element
         */
        com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity insertNewExtendEntity(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extend-entity" element
         */
        com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity addNewExtendEntity();
        
        /**
         * Removes the ith "extend-entity" element
         */
        void removeExtendEntity(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel newInstance() {
              return (com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.entitymodel.EntitymodelDocument newInstance() {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntitymodelDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entitymodel.EntitymodelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entitymodel.EntitymodelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
