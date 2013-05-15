/*
 * An XML document type.
 * Localname: entity
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.EntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel;


/**
 * A document containing one entity(@) element.
 *
 * This is a complex type.
 */
public interface EntityDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC06412D5939EE085657300132FC0B98").resolveHandle("entityed9cdoctype");
    
    /**
     * Gets the "entity" element
     */
    com.kyt.xsd.entitymodel.EntityDocument.Entity getEntity();
    
    /**
     * Sets the "entity" element
     */
    void setEntity(com.kyt.xsd.entitymodel.EntityDocument.Entity entity);
    
    /**
     * Appends and returns a new empty "entity" element
     */
    com.kyt.xsd.entitymodel.EntityDocument.Entity addNewEntity();
    
    /**
     * An XML entity(@).
     *
     * This is a complex type.
     */
    public interface Entity extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Entity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC06412D5939EE085657300132FC0B98").resolveHandle("entity120delemtype");
        
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
         * Gets array of all "field" elements
         */
        com.kyt.xsd.entitymodel.FieldDocument.Field[] getFieldArray();
        
        /**
         * Gets ith "field" element
         */
        com.kyt.xsd.entitymodel.FieldDocument.Field getFieldArray(int i);
        
        /**
         * Returns number of "field" element
         */
        int sizeOfFieldArray();
        
        /**
         * Sets array of all "field" element
         */
        void setFieldArray(com.kyt.xsd.entitymodel.FieldDocument.Field[] fieldArray);
        
        /**
         * Sets ith "field" element
         */
        void setFieldArray(int i, com.kyt.xsd.entitymodel.FieldDocument.Field field);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field" element
         */
        com.kyt.xsd.entitymodel.FieldDocument.Field insertNewField(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field" element
         */
        com.kyt.xsd.entitymodel.FieldDocument.Field addNewField();
        
        /**
         * Removes the ith "field" element
         */
        void removeField(int i);
        
        /**
         * Gets array of all "prim-key" elements
         */
        com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey[] getPrimKeyArray();
        
        /**
         * Gets ith "prim-key" element
         */
        com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey getPrimKeyArray(int i);
        
        /**
         * Returns number of "prim-key" element
         */
        int sizeOfPrimKeyArray();
        
        /**
         * Sets array of all "prim-key" element
         */
        void setPrimKeyArray(com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey[] primKeyArray);
        
        /**
         * Sets ith "prim-key" element
         */
        void setPrimKeyArray(int i, com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey primKey);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "prim-key" element
         */
        com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey insertNewPrimKey(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "prim-key" element
         */
        com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey addNewPrimKey();
        
        /**
         * Removes the ith "prim-key" element
         */
        void removePrimKey(int i);
        
        /**
         * Gets array of all "relation" elements
         */
        com.kyt.xsd.entitymodel.RelationDocument.Relation[] getRelationArray();
        
        /**
         * Gets ith "relation" element
         */
        com.kyt.xsd.entitymodel.RelationDocument.Relation getRelationArray(int i);
        
        /**
         * Returns number of "relation" element
         */
        int sizeOfRelationArray();
        
        /**
         * Sets array of all "relation" element
         */
        void setRelationArray(com.kyt.xsd.entitymodel.RelationDocument.Relation[] relationArray);
        
        /**
         * Sets ith "relation" element
         */
        void setRelationArray(int i, com.kyt.xsd.entitymodel.RelationDocument.Relation relation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "relation" element
         */
        com.kyt.xsd.entitymodel.RelationDocument.Relation insertNewRelation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "relation" element
         */
        com.kyt.xsd.entitymodel.RelationDocument.Relation addNewRelation();
        
        /**
         * Removes the ith "relation" element
         */
        void removeRelation(int i);
        
        /**
         * Gets array of all "index" elements
         */
        com.kyt.xsd.entitymodel.IndexDocument.Index[] getIndexArray();
        
        /**
         * Gets ith "index" element
         */
        com.kyt.xsd.entitymodel.IndexDocument.Index getIndexArray(int i);
        
        /**
         * Returns number of "index" element
         */
        int sizeOfIndexArray();
        
        /**
         * Sets array of all "index" element
         */
        void setIndexArray(com.kyt.xsd.entitymodel.IndexDocument.Index[] indexArray);
        
        /**
         * Sets ith "index" element
         */
        void setIndexArray(int i, com.kyt.xsd.entitymodel.IndexDocument.Index index);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "index" element
         */
        com.kyt.xsd.entitymodel.IndexDocument.Index insertNewIndex(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "index" element
         */
        com.kyt.xsd.entitymodel.IndexDocument.Index addNewIndex();
        
        /**
         * Removes the ith "index" element
         */
        void removeIndex(int i);
        
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
         * Gets the "table-name" attribute
         */
        java.lang.String getTableName();
        
        /**
         * Gets (as xml) the "table-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetTableName();
        
        /**
         * True if has "table-name" attribute
         */
        boolean isSetTableName();
        
        /**
         * Sets the "table-name" attribute
         */
        void setTableName(java.lang.String tableName);
        
        /**
         * Sets (as xml) the "table-name" attribute
         */
        void xsetTableName(org.apache.xmlbeans.XmlString tableName);
        
        /**
         * Unsets the "table-name" attribute
         */
        void unsetTableName();
        
        /**
         * Gets the "package-name" attribute
         */
        java.lang.String getPackageName();
        
        /**
         * Gets (as xml) the "package-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetPackageName();
        
        /**
         * Sets the "package-name" attribute
         */
        void setPackageName(java.lang.String packageName);
        
        /**
         * Sets (as xml) the "package-name" attribute
         */
        void xsetPackageName(org.apache.xmlbeans.XmlString packageName);
        
        /**
         * Gets the "default-resource-name" attribute
         */
        java.lang.String getDefaultResourceName();
        
        /**
         * Gets (as xml) the "default-resource-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultResourceName();
        
        /**
         * True if has "default-resource-name" attribute
         */
        boolean isSetDefaultResourceName();
        
        /**
         * Sets the "default-resource-name" attribute
         */
        void setDefaultResourceName(java.lang.String defaultResourceName);
        
        /**
         * Sets (as xml) the "default-resource-name" attribute
         */
        void xsetDefaultResourceName(org.apache.xmlbeans.XmlString defaultResourceName);
        
        /**
         * Unsets the "default-resource-name" attribute
         */
        void unsetDefaultResourceName();
        
        /**
         * Gets the "dependent-on" attribute
         */
        java.lang.String getDependentOn();
        
        /**
         * Gets (as xml) the "dependent-on" attribute
         */
        org.apache.xmlbeans.XmlString xgetDependentOn();
        
        /**
         * True if has "dependent-on" attribute
         */
        boolean isSetDependentOn();
        
        /**
         * Sets the "dependent-on" attribute
         */
        void setDependentOn(java.lang.String dependentOn);
        
        /**
         * Sets (as xml) the "dependent-on" attribute
         */
        void xsetDependentOn(org.apache.xmlbeans.XmlString dependentOn);
        
        /**
         * Unsets the "dependent-on" attribute
         */
        void unsetDependentOn();
        
        /**
         * Gets the "sequence-bank-size" attribute
         */
        java.lang.String getSequenceBankSize();
        
        /**
         * Gets (as xml) the "sequence-bank-size" attribute
         */
        org.apache.xmlbeans.XmlString xgetSequenceBankSize();
        
        /**
         * True if has "sequence-bank-size" attribute
         */
        boolean isSetSequenceBankSize();
        
        /**
         * Sets the "sequence-bank-size" attribute
         */
        void setSequenceBankSize(java.lang.String sequenceBankSize);
        
        /**
         * Sets (as xml) the "sequence-bank-size" attribute
         */
        void xsetSequenceBankSize(org.apache.xmlbeans.XmlString sequenceBankSize);
        
        /**
         * Unsets the "sequence-bank-size" attribute
         */
        void unsetSequenceBankSize();
        
        /**
         * Gets the "enable-lock" attribute
         */
        com.kyt.xsd.entitymodel.Boolean.Enum getEnableLock();
        
        /**
         * Gets (as xml) the "enable-lock" attribute
         */
        com.kyt.xsd.entitymodel.Boolean xgetEnableLock();
        
        /**
         * True if has "enable-lock" attribute
         */
        boolean isSetEnableLock();
        
        /**
         * Sets the "enable-lock" attribute
         */
        void setEnableLock(com.kyt.xsd.entitymodel.Boolean.Enum enableLock);
        
        /**
         * Sets (as xml) the "enable-lock" attribute
         */
        void xsetEnableLock(com.kyt.xsd.entitymodel.Boolean enableLock);
        
        /**
         * Unsets the "enable-lock" attribute
         */
        void unsetEnableLock();
        
        /**
         * Gets the "no-auto-stamp" attribute
         */
        com.kyt.xsd.entitymodel.Boolean.Enum getNoAutoStamp();
        
        /**
         * Gets (as xml) the "no-auto-stamp" attribute
         */
        com.kyt.xsd.entitymodel.Boolean xgetNoAutoStamp();
        
        /**
         * True if has "no-auto-stamp" attribute
         */
        boolean isSetNoAutoStamp();
        
        /**
         * Sets the "no-auto-stamp" attribute
         */
        void setNoAutoStamp(com.kyt.xsd.entitymodel.Boolean.Enum noAutoStamp);
        
        /**
         * Sets (as xml) the "no-auto-stamp" attribute
         */
        void xsetNoAutoStamp(com.kyt.xsd.entitymodel.Boolean noAutoStamp);
        
        /**
         * Unsets the "no-auto-stamp" attribute
         */
        void unsetNoAutoStamp();
        
        /**
         * Gets the "never-cache" attribute
         */
        com.kyt.xsd.entitymodel.Boolean.Enum getNeverCache();
        
        /**
         * Gets (as xml) the "never-cache" attribute
         */
        com.kyt.xsd.entitymodel.Boolean xgetNeverCache();
        
        /**
         * True if has "never-cache" attribute
         */
        boolean isSetNeverCache();
        
        /**
         * Sets the "never-cache" attribute
         */
        void setNeverCache(com.kyt.xsd.entitymodel.Boolean.Enum neverCache);
        
        /**
         * Sets (as xml) the "never-cache" attribute
         */
        void xsetNeverCache(com.kyt.xsd.entitymodel.Boolean neverCache);
        
        /**
         * Unsets the "never-cache" attribute
         */
        void unsetNeverCache();
        
        /**
         * Gets the "never-check" attribute
         */
        com.kyt.xsd.entitymodel.Boolean.Enum getNeverCheck();
        
        /**
         * Gets (as xml) the "never-check" attribute
         */
        com.kyt.xsd.entitymodel.Boolean xgetNeverCheck();
        
        /**
         * True if has "never-check" attribute
         */
        boolean isSetNeverCheck();
        
        /**
         * Sets the "never-check" attribute
         */
        void setNeverCheck(com.kyt.xsd.entitymodel.Boolean.Enum neverCheck);
        
        /**
         * Sets (as xml) the "never-check" attribute
         */
        void xsetNeverCheck(com.kyt.xsd.entitymodel.Boolean neverCheck);
        
        /**
         * Unsets the "never-check" attribute
         */
        void unsetNeverCheck();
        
        /**
         * Gets the "auto-clear-cache" attribute
         */
        com.kyt.xsd.entitymodel.Boolean.Enum getAutoClearCache();
        
        /**
         * Gets (as xml) the "auto-clear-cache" attribute
         */
        com.kyt.xsd.entitymodel.Boolean xgetAutoClearCache();
        
        /**
         * True if has "auto-clear-cache" attribute
         */
        boolean isSetAutoClearCache();
        
        /**
         * Sets the "auto-clear-cache" attribute
         */
        void setAutoClearCache(com.kyt.xsd.entitymodel.Boolean.Enum autoClearCache);
        
        /**
         * Sets (as xml) the "auto-clear-cache" attribute
         */
        void xsetAutoClearCache(com.kyt.xsd.entitymodel.Boolean autoClearCache);
        
        /**
         * Unsets the "auto-clear-cache" attribute
         */
        void unsetAutoClearCache();
        
        /**
         * Gets the "redefinition" attribute
         */
        com.kyt.xsd.entitymodel.Boolean.Enum getRedefinition();
        
        /**
         * Gets (as xml) the "redefinition" attribute
         */
        com.kyt.xsd.entitymodel.Boolean xgetRedefinition();
        
        /**
         * True if has "redefinition" attribute
         */
        boolean isSetRedefinition();
        
        /**
         * Sets the "redefinition" attribute
         */
        void setRedefinition(com.kyt.xsd.entitymodel.Boolean.Enum redefinition);
        
        /**
         * Sets (as xml) the "redefinition" attribute
         */
        void xsetRedefinition(com.kyt.xsd.entitymodel.Boolean redefinition);
        
        /**
         * Unsets the "redefinition" attribute
         */
        void unsetRedefinition();
        
        /**
         * Gets the "title" attribute
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" attribute
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * True if has "title" attribute
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" attribute
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" attribute
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Unsets the "title" attribute
         */
        void unsetTitle();
        
        /**
         * Gets the "copyright" attribute
         */
        java.lang.String getCopyright();
        
        /**
         * Gets (as xml) the "copyright" attribute
         */
        org.apache.xmlbeans.XmlString xgetCopyright();
        
        /**
         * True if has "copyright" attribute
         */
        boolean isSetCopyright();
        
        /**
         * Sets the "copyright" attribute
         */
        void setCopyright(java.lang.String copyright);
        
        /**
         * Sets (as xml) the "copyright" attribute
         */
        void xsetCopyright(org.apache.xmlbeans.XmlString copyright);
        
        /**
         * Unsets the "copyright" attribute
         */
        void unsetCopyright();
        
        /**
         * Gets the "author" attribute
         */
        java.lang.String getAuthor();
        
        /**
         * Gets (as xml) the "author" attribute
         */
        org.apache.xmlbeans.XmlString xgetAuthor();
        
        /**
         * True if has "author" attribute
         */
        boolean isSetAuthor();
        
        /**
         * Sets the "author" attribute
         */
        void setAuthor(java.lang.String author);
        
        /**
         * Sets (as xml) the "author" attribute
         */
        void xsetAuthor(org.apache.xmlbeans.XmlString author);
        
        /**
         * Unsets the "author" attribute
         */
        void unsetAuthor();
        
        /**
         * Gets the "version" attribute
         */
        java.lang.String getVersion();
        
        /**
         * Gets (as xml) the "version" attribute
         */
        org.apache.xmlbeans.XmlString xgetVersion();
        
        /**
         * True if has "version" attribute
         */
        boolean isSetVersion();
        
        /**
         * Sets the "version" attribute
         */
        void setVersion(java.lang.String version);
        
        /**
         * Sets (as xml) the "version" attribute
         */
        void xsetVersion(org.apache.xmlbeans.XmlString version);
        
        /**
         * Unsets the "version" attribute
         */
        void unsetVersion();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.entitymodel.EntityDocument.Entity newInstance() {
              return (com.kyt.xsd.entitymodel.EntityDocument.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.entitymodel.EntityDocument.Entity newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.entitymodel.EntityDocument.Entity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.entitymodel.EntityDocument newInstance() {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.entitymodel.EntityDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.entitymodel.EntityDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntityDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntityDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntityDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntityDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntityDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entitymodel.EntityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entitymodel.EntityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entitymodel.EntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
