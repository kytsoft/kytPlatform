/*
 * An XML document type.
 * Localname: entity-config
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.EntityConfigDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig;


/**
 * A document containing one entity-config(@) element.
 *
 * This is a complex type.
 */
public interface EntityConfigDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityConfigDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("entityconfigb893doctype");
    
    /**
     * Gets the "entity-config" element
     */
    com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig getEntityConfig();
    
    /**
     * Sets the "entity-config" element
     */
    void setEntityConfig(com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig entityConfig);
    
    /**
     * Appends and returns a new empty "entity-config" element
     */
    com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig addNewEntityConfig();
    
    /**
     * An XML entity-config(@).
     *
     * This is a complex type.
     */
    public interface EntityConfig extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("entityconfigaf7belemtype");
        
        /**
         * Gets array of all "resource-loader" elements
         */
        com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader[] getResourceLoaderArray();
        
        /**
         * Gets ith "resource-loader" element
         */
        com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader getResourceLoaderArray(int i);
        
        /**
         * Returns number of "resource-loader" element
         */
        int sizeOfResourceLoaderArray();
        
        /**
         * Sets array of all "resource-loader" element
         */
        void setResourceLoaderArray(com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader[] resourceLoaderArray);
        
        /**
         * Sets ith "resource-loader" element
         */
        void setResourceLoaderArray(int i, com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader resourceLoader);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resource-loader" element
         */
        com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader insertNewResourceLoader(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resource-loader" element
         */
        com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader addNewResourceLoader();
        
        /**
         * Removes the ith "resource-loader" element
         */
        void removeResourceLoader(int i);
        
        /**
         * Gets the "transaction-factory" element
         */
        com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory getTransactionFactory();
        
        /**
         * Sets the "transaction-factory" element
         */
        void setTransactionFactory(com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory transactionFactory);
        
        /**
         * Appends and returns a new empty "transaction-factory" element
         */
        com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory addNewTransactionFactory();
        
        /**
         * Gets the "connection-factory" element
         */
        com.kyt.xsd.entityconfig.ConnectionFactoryDocument.ConnectionFactory getConnectionFactory();
        
        /**
         * Sets the "connection-factory" element
         */
        void setConnectionFactory(com.kyt.xsd.entityconfig.ConnectionFactoryDocument.ConnectionFactory connectionFactory);
        
        /**
         * Appends and returns a new empty "connection-factory" element
         */
        com.kyt.xsd.entityconfig.ConnectionFactoryDocument.ConnectionFactory addNewConnectionFactory();
        
        /**
         * Gets the "debug-xa-resources" element
         */
        com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources getDebugXaResources();
        
        /**
         * Sets the "debug-xa-resources" element
         */
        void setDebugXaResources(com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources debugXaResources);
        
        /**
         * Appends and returns a new empty "debug-xa-resources" element
         */
        com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources addNewDebugXaResources();
        
        /**
         * Gets array of all "delegator" elements
         */
        com.kyt.xsd.entityconfig.DelegatorDocument.Delegator[] getDelegatorArray();
        
        /**
         * Gets ith "delegator" element
         */
        com.kyt.xsd.entityconfig.DelegatorDocument.Delegator getDelegatorArray(int i);
        
        /**
         * Returns number of "delegator" element
         */
        int sizeOfDelegatorArray();
        
        /**
         * Sets array of all "delegator" element
         */
        void setDelegatorArray(com.kyt.xsd.entityconfig.DelegatorDocument.Delegator[] delegatorArray);
        
        /**
         * Sets ith "delegator" element
         */
        void setDelegatorArray(int i, com.kyt.xsd.entityconfig.DelegatorDocument.Delegator delegator);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "delegator" element
         */
        com.kyt.xsd.entityconfig.DelegatorDocument.Delegator insertNewDelegator(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "delegator" element
         */
        com.kyt.xsd.entityconfig.DelegatorDocument.Delegator addNewDelegator();
        
        /**
         * Removes the ith "delegator" element
         */
        void removeDelegator(int i);
        
        /**
         * Gets array of all "entity-model-reader" elements
         */
        com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader[] getEntityModelReaderArray();
        
        /**
         * Gets ith "entity-model-reader" element
         */
        com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader getEntityModelReaderArray(int i);
        
        /**
         * Returns number of "entity-model-reader" element
         */
        int sizeOfEntityModelReaderArray();
        
        /**
         * Sets array of all "entity-model-reader" element
         */
        void setEntityModelReaderArray(com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader[] entityModelReaderArray);
        
        /**
         * Sets ith "entity-model-reader" element
         */
        void setEntityModelReaderArray(int i, com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader entityModelReader);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-model-reader" element
         */
        com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader insertNewEntityModelReader(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-model-reader" element
         */
        com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader addNewEntityModelReader();
        
        /**
         * Removes the ith "entity-model-reader" element
         */
        void removeEntityModelReader(int i);
        
        /**
         * Gets array of all "entity-group-reader" elements
         */
        com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader[] getEntityGroupReaderArray();
        
        /**
         * Gets ith "entity-group-reader" element
         */
        com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader getEntityGroupReaderArray(int i);
        
        /**
         * Returns number of "entity-group-reader" element
         */
        int sizeOfEntityGroupReaderArray();
        
        /**
         * Sets array of all "entity-group-reader" element
         */
        void setEntityGroupReaderArray(com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader[] entityGroupReaderArray);
        
        /**
         * Sets ith "entity-group-reader" element
         */
        void setEntityGroupReaderArray(int i, com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader entityGroupReader);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-group-reader" element
         */
        com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader insertNewEntityGroupReader(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-group-reader" element
         */
        com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader addNewEntityGroupReader();
        
        /**
         * Removes the ith "entity-group-reader" element
         */
        void removeEntityGroupReader(int i);
        
        /**
         * Gets array of all "entity-eca-reader" elements
         */
        com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader[] getEntityEcaReaderArray();
        
        /**
         * Gets ith "entity-eca-reader" element
         */
        com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader getEntityEcaReaderArray(int i);
        
        /**
         * Returns number of "entity-eca-reader" element
         */
        int sizeOfEntityEcaReaderArray();
        
        /**
         * Sets array of all "entity-eca-reader" element
         */
        void setEntityEcaReaderArray(com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader[] entityEcaReaderArray);
        
        /**
         * Sets ith "entity-eca-reader" element
         */
        void setEntityEcaReaderArray(int i, com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader entityEcaReader);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-eca-reader" element
         */
        com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader insertNewEntityEcaReader(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-eca-reader" element
         */
        com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader addNewEntityEcaReader();
        
        /**
         * Removes the ith "entity-eca-reader" element
         */
        void removeEntityEcaReader(int i);
        
        /**
         * Gets array of all "entity-data-reader" elements
         */
        com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader[] getEntityDataReaderArray();
        
        /**
         * Gets ith "entity-data-reader" element
         */
        com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader getEntityDataReaderArray(int i);
        
        /**
         * Returns number of "entity-data-reader" element
         */
        int sizeOfEntityDataReaderArray();
        
        /**
         * Sets array of all "entity-data-reader" element
         */
        void setEntityDataReaderArray(com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader[] entityDataReaderArray);
        
        /**
         * Sets ith "entity-data-reader" element
         */
        void setEntityDataReaderArray(int i, com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader entityDataReader);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-data-reader" element
         */
        com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader insertNewEntityDataReader(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-data-reader" element
         */
        com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader addNewEntityDataReader();
        
        /**
         * Removes the ith "entity-data-reader" element
         */
        void removeEntityDataReader(int i);
        
        /**
         * Gets array of all "field-type" elements
         */
        com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType[] getFieldTypeArray();
        
        /**
         * Gets ith "field-type" element
         */
        com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType getFieldTypeArray(int i);
        
        /**
         * Returns number of "field-type" element
         */
        int sizeOfFieldTypeArray();
        
        /**
         * Sets array of all "field-type" element
         */
        void setFieldTypeArray(com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType[] fieldTypeArray);
        
        /**
         * Sets ith "field-type" element
         */
        void setFieldTypeArray(int i, com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType fieldType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field-type" element
         */
        com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType insertNewFieldType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field-type" element
         */
        com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType addNewFieldType();
        
        /**
         * Removes the ith "field-type" element
         */
        void removeFieldType(int i);
        
        /**
         * Gets array of all "datasource" elements
         */
        com.kyt.xsd.entityconfig.DatasourceDocument.Datasource[] getDatasourceArray();
        
        /**
         * Gets ith "datasource" element
         */
        com.kyt.xsd.entityconfig.DatasourceDocument.Datasource getDatasourceArray(int i);
        
        /**
         * Returns number of "datasource" element
         */
        int sizeOfDatasourceArray();
        
        /**
         * Sets array of all "datasource" element
         */
        void setDatasourceArray(com.kyt.xsd.entityconfig.DatasourceDocument.Datasource[] datasourceArray);
        
        /**
         * Sets ith "datasource" element
         */
        void setDatasourceArray(int i, com.kyt.xsd.entityconfig.DatasourceDocument.Datasource datasource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "datasource" element
         */
        com.kyt.xsd.entityconfig.DatasourceDocument.Datasource insertNewDatasource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "datasource" element
         */
        com.kyt.xsd.entityconfig.DatasourceDocument.Datasource addNewDatasource();
        
        /**
         * Removes the ith "datasource" element
         */
        void removeDatasource(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig newInstance() {
              return (com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.entityconfig.EntityConfigDocument newInstance() {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.entityconfig.EntityConfigDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityconfig.EntityConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityconfig.EntityConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
