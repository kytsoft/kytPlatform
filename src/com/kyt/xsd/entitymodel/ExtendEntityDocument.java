/*
 * An XML document type.
 * Localname: extend-entity
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.ExtendEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel;


/**
 * A document containing one extend-entity(@) element.
 *
 * This is a complex type.
 */
public interface ExtendEntityDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExtendEntityDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC06412D5939EE085657300132FC0B98").resolveHandle("extendentity821ddoctype");
    
    /**
     * Gets the "extend-entity" element
     */
    com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity getExtendEntity();
    
    /**
     * Sets the "extend-entity" element
     */
    void setExtendEntity(com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity extendEntity);
    
    /**
     * Appends and returns a new empty "extend-entity" element
     */
    com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity addNewExtendEntity();
    
    /**
     * An XML extend-entity(@).
     *
     * This is a complex type.
     */
    public interface ExtendEntity extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExtendEntity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC06412D5939EE085657300132FC0B98").resolveHandle("extendentityee8felemtype");
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity newInstance() {
              return (com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument newInstance() {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entitymodel.ExtendEntityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entitymodel.ExtendEntityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
