/*
 * An XML document type.
 * Localname: entity-config
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.EntityConfigDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig.impl;
/**
 * A document containing one entity-config(@) element.
 *
 * This is a complex type.
 */
public class EntityConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.EntityConfigDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYCONFIG$0 = 
        new javax.xml.namespace.QName("", "entity-config");
    
    
    /**
     * Gets the "entity-config" element
     */
    public com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig getEntityConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig target = null;
            target = (com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig)get_store().find_element_user(ENTITYCONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity-config" element
     */
    public void setEntityConfig(com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig entityConfig)
    {
        generatedSetterHelperImpl(entityConfig, ENTITYCONFIG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entity-config" element
     */
    public com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig addNewEntityConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig target = null;
            target = (com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig)get_store().add_element_user(ENTITYCONFIG$0);
            return target;
        }
    }
    /**
     * An XML entity-config(@).
     *
     * This is a complex type.
     */
    public static class EntityConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.EntityConfigDocument.EntityConfig
    {
        private static final long serialVersionUID = 1L;
        
        public EntityConfigImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCELOADER$0 = 
            new javax.xml.namespace.QName("", "resource-loader");
        private static final javax.xml.namespace.QName TRANSACTIONFACTORY$2 = 
            new javax.xml.namespace.QName("", "transaction-factory");
        private static final javax.xml.namespace.QName CONNECTIONFACTORY$4 = 
            new javax.xml.namespace.QName("", "connection-factory");
        private static final javax.xml.namespace.QName DEBUGXARESOURCES$6 = 
            new javax.xml.namespace.QName("", "debug-xa-resources");
        private static final javax.xml.namespace.QName DELEGATOR$8 = 
            new javax.xml.namespace.QName("", "delegator");
        private static final javax.xml.namespace.QName ENTITYMODELREADER$10 = 
            new javax.xml.namespace.QName("", "entity-model-reader");
        private static final javax.xml.namespace.QName ENTITYGROUPREADER$12 = 
            new javax.xml.namespace.QName("", "entity-group-reader");
        private static final javax.xml.namespace.QName ENTITYECAREADER$14 = 
            new javax.xml.namespace.QName("", "entity-eca-reader");
        private static final javax.xml.namespace.QName ENTITYDATAREADER$16 = 
            new javax.xml.namespace.QName("", "entity-data-reader");
        private static final javax.xml.namespace.QName FIELDTYPE$18 = 
            new javax.xml.namespace.QName("", "field-type");
        private static final javax.xml.namespace.QName DATASOURCE$20 = 
            new javax.xml.namespace.QName("", "datasource");
        
        
        /**
         * Gets array of all "resource-loader" elements
         */
        public com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader[] getResourceLoaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESOURCELOADER$0, targetList);
                com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader[] result = new com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resource-loader" element
         */
        public com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader getResourceLoaderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader target = null;
                target = (com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader)get_store().find_element_user(RESOURCELOADER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resource-loader" element
         */
        public int sizeOfResourceLoaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCELOADER$0);
            }
        }
        
        /**
         * Sets array of all "resource-loader" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setResourceLoaderArray(com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader[] resourceLoaderArray)
        {
            check_orphaned();
            arraySetterHelper(resourceLoaderArray, RESOURCELOADER$0);
        }
        
        /**
         * Sets ith "resource-loader" element
         */
        public void setResourceLoaderArray(int i, com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader resourceLoader)
        {
            generatedSetterHelperImpl(resourceLoader, RESOURCELOADER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resource-loader" element
         */
        public com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader insertNewResourceLoader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader target = null;
                target = (com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader)get_store().insert_element_user(RESOURCELOADER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resource-loader" element
         */
        public com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader addNewResourceLoader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader target = null;
                target = (com.kyt.xsd.entityconfig.ResourceLoaderDocument.ResourceLoader)get_store().add_element_user(RESOURCELOADER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "resource-loader" element
         */
        public void removeResourceLoader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCELOADER$0, i);
            }
        }
        
        /**
         * Gets the "transaction-factory" element
         */
        public com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory getTransactionFactory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory target = null;
                target = (com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory)get_store().find_element_user(TRANSACTIONFACTORY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "transaction-factory" element
         */
        public void setTransactionFactory(com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory transactionFactory)
        {
            generatedSetterHelperImpl(transactionFactory, TRANSACTIONFACTORY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "transaction-factory" element
         */
        public com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory addNewTransactionFactory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory target = null;
                target = (com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory)get_store().add_element_user(TRANSACTIONFACTORY$2);
                return target;
            }
        }
        
        /**
         * Gets the "connection-factory" element
         */
        public com.kyt.xsd.entityconfig.ConnectionFactoryDocument.ConnectionFactory getConnectionFactory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.ConnectionFactoryDocument.ConnectionFactory target = null;
                target = (com.kyt.xsd.entityconfig.ConnectionFactoryDocument.ConnectionFactory)get_store().find_element_user(CONNECTIONFACTORY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "connection-factory" element
         */
        public void setConnectionFactory(com.kyt.xsd.entityconfig.ConnectionFactoryDocument.ConnectionFactory connectionFactory)
        {
            generatedSetterHelperImpl(connectionFactory, CONNECTIONFACTORY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "connection-factory" element
         */
        public com.kyt.xsd.entityconfig.ConnectionFactoryDocument.ConnectionFactory addNewConnectionFactory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.ConnectionFactoryDocument.ConnectionFactory target = null;
                target = (com.kyt.xsd.entityconfig.ConnectionFactoryDocument.ConnectionFactory)get_store().add_element_user(CONNECTIONFACTORY$4);
                return target;
            }
        }
        
        /**
         * Gets the "debug-xa-resources" element
         */
        public com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources getDebugXaResources()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources target = null;
                target = (com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources)get_store().find_element_user(DEBUGXARESOURCES$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "debug-xa-resources" element
         */
        public void setDebugXaResources(com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources debugXaResources)
        {
            generatedSetterHelperImpl(debugXaResources, DEBUGXARESOURCES$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "debug-xa-resources" element
         */
        public com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources addNewDebugXaResources()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources target = null;
                target = (com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources)get_store().add_element_user(DEBUGXARESOURCES$6);
                return target;
            }
        }
        
        /**
         * Gets array of all "delegator" elements
         */
        public com.kyt.xsd.entityconfig.DelegatorDocument.Delegator[] getDelegatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DELEGATOR$8, targetList);
                com.kyt.xsd.entityconfig.DelegatorDocument.Delegator[] result = new com.kyt.xsd.entityconfig.DelegatorDocument.Delegator[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "delegator" element
         */
        public com.kyt.xsd.entityconfig.DelegatorDocument.Delegator getDelegatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.DelegatorDocument.Delegator target = null;
                target = (com.kyt.xsd.entityconfig.DelegatorDocument.Delegator)get_store().find_element_user(DELEGATOR$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "delegator" element
         */
        public int sizeOfDelegatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DELEGATOR$8);
            }
        }
        
        /**
         * Sets array of all "delegator" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDelegatorArray(com.kyt.xsd.entityconfig.DelegatorDocument.Delegator[] delegatorArray)
        {
            check_orphaned();
            arraySetterHelper(delegatorArray, DELEGATOR$8);
        }
        
        /**
         * Sets ith "delegator" element
         */
        public void setDelegatorArray(int i, com.kyt.xsd.entityconfig.DelegatorDocument.Delegator delegator)
        {
            generatedSetterHelperImpl(delegator, DELEGATOR$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "delegator" element
         */
        public com.kyt.xsd.entityconfig.DelegatorDocument.Delegator insertNewDelegator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.DelegatorDocument.Delegator target = null;
                target = (com.kyt.xsd.entityconfig.DelegatorDocument.Delegator)get_store().insert_element_user(DELEGATOR$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "delegator" element
         */
        public com.kyt.xsd.entityconfig.DelegatorDocument.Delegator addNewDelegator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.DelegatorDocument.Delegator target = null;
                target = (com.kyt.xsd.entityconfig.DelegatorDocument.Delegator)get_store().add_element_user(DELEGATOR$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "delegator" element
         */
        public void removeDelegator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DELEGATOR$8, i);
            }
        }
        
        /**
         * Gets array of all "entity-model-reader" elements
         */
        public com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader[] getEntityModelReaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENTITYMODELREADER$10, targetList);
                com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader[] result = new com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "entity-model-reader" element
         */
        public com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader getEntityModelReaderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader target = null;
                target = (com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader)get_store().find_element_user(ENTITYMODELREADER$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "entity-model-reader" element
         */
        public int sizeOfEntityModelReaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITYMODELREADER$10);
            }
        }
        
        /**
         * Sets array of all "entity-model-reader" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEntityModelReaderArray(com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader[] entityModelReaderArray)
        {
            check_orphaned();
            arraySetterHelper(entityModelReaderArray, ENTITYMODELREADER$10);
        }
        
        /**
         * Sets ith "entity-model-reader" element
         */
        public void setEntityModelReaderArray(int i, com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader entityModelReader)
        {
            generatedSetterHelperImpl(entityModelReader, ENTITYMODELREADER$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-model-reader" element
         */
        public com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader insertNewEntityModelReader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader target = null;
                target = (com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader)get_store().insert_element_user(ENTITYMODELREADER$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-model-reader" element
         */
        public com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader addNewEntityModelReader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader target = null;
                target = (com.kyt.xsd.entityconfig.EntityModelReaderDocument.EntityModelReader)get_store().add_element_user(ENTITYMODELREADER$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "entity-model-reader" element
         */
        public void removeEntityModelReader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITYMODELREADER$10, i);
            }
        }
        
        /**
         * Gets array of all "entity-group-reader" elements
         */
        public com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader[] getEntityGroupReaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENTITYGROUPREADER$12, targetList);
                com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader[] result = new com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "entity-group-reader" element
         */
        public com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader getEntityGroupReaderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader target = null;
                target = (com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader)get_store().find_element_user(ENTITYGROUPREADER$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "entity-group-reader" element
         */
        public int sizeOfEntityGroupReaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITYGROUPREADER$12);
            }
        }
        
        /**
         * Sets array of all "entity-group-reader" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEntityGroupReaderArray(com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader[] entityGroupReaderArray)
        {
            check_orphaned();
            arraySetterHelper(entityGroupReaderArray, ENTITYGROUPREADER$12);
        }
        
        /**
         * Sets ith "entity-group-reader" element
         */
        public void setEntityGroupReaderArray(int i, com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader entityGroupReader)
        {
            generatedSetterHelperImpl(entityGroupReader, ENTITYGROUPREADER$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-group-reader" element
         */
        public com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader insertNewEntityGroupReader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader target = null;
                target = (com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader)get_store().insert_element_user(ENTITYGROUPREADER$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-group-reader" element
         */
        public com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader addNewEntityGroupReader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader target = null;
                target = (com.kyt.xsd.entityconfig.EntityGroupReaderDocument.EntityGroupReader)get_store().add_element_user(ENTITYGROUPREADER$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "entity-group-reader" element
         */
        public void removeEntityGroupReader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITYGROUPREADER$12, i);
            }
        }
        
        /**
         * Gets array of all "entity-eca-reader" elements
         */
        public com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader[] getEntityEcaReaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENTITYECAREADER$14, targetList);
                com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader[] result = new com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "entity-eca-reader" element
         */
        public com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader getEntityEcaReaderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader target = null;
                target = (com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader)get_store().find_element_user(ENTITYECAREADER$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "entity-eca-reader" element
         */
        public int sizeOfEntityEcaReaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITYECAREADER$14);
            }
        }
        
        /**
         * Sets array of all "entity-eca-reader" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEntityEcaReaderArray(com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader[] entityEcaReaderArray)
        {
            check_orphaned();
            arraySetterHelper(entityEcaReaderArray, ENTITYECAREADER$14);
        }
        
        /**
         * Sets ith "entity-eca-reader" element
         */
        public void setEntityEcaReaderArray(int i, com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader entityEcaReader)
        {
            generatedSetterHelperImpl(entityEcaReader, ENTITYECAREADER$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-eca-reader" element
         */
        public com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader insertNewEntityEcaReader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader target = null;
                target = (com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader)get_store().insert_element_user(ENTITYECAREADER$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-eca-reader" element
         */
        public com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader addNewEntityEcaReader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader target = null;
                target = (com.kyt.xsd.entityconfig.EntityEcaReaderDocument.EntityEcaReader)get_store().add_element_user(ENTITYECAREADER$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "entity-eca-reader" element
         */
        public void removeEntityEcaReader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITYECAREADER$14, i);
            }
        }
        
        /**
         * Gets array of all "entity-data-reader" elements
         */
        public com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader[] getEntityDataReaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENTITYDATAREADER$16, targetList);
                com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader[] result = new com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "entity-data-reader" element
         */
        public com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader getEntityDataReaderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader target = null;
                target = (com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader)get_store().find_element_user(ENTITYDATAREADER$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "entity-data-reader" element
         */
        public int sizeOfEntityDataReaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITYDATAREADER$16);
            }
        }
        
        /**
         * Sets array of all "entity-data-reader" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEntityDataReaderArray(com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader[] entityDataReaderArray)
        {
            check_orphaned();
            arraySetterHelper(entityDataReaderArray, ENTITYDATAREADER$16);
        }
        
        /**
         * Sets ith "entity-data-reader" element
         */
        public void setEntityDataReaderArray(int i, com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader entityDataReader)
        {
            generatedSetterHelperImpl(entityDataReader, ENTITYDATAREADER$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-data-reader" element
         */
        public com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader insertNewEntityDataReader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader target = null;
                target = (com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader)get_store().insert_element_user(ENTITYDATAREADER$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-data-reader" element
         */
        public com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader addNewEntityDataReader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader target = null;
                target = (com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader)get_store().add_element_user(ENTITYDATAREADER$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "entity-data-reader" element
         */
        public void removeEntityDataReader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITYDATAREADER$16, i);
            }
        }
        
        /**
         * Gets array of all "field-type" elements
         */
        public com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType[] getFieldTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELDTYPE$18, targetList);
                com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType[] result = new com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "field-type" element
         */
        public com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType getFieldTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType target = null;
                target = (com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType)get_store().find_element_user(FIELDTYPE$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "field-type" element
         */
        public int sizeOfFieldTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDTYPE$18);
            }
        }
        
        /**
         * Sets array of all "field-type" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFieldTypeArray(com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType[] fieldTypeArray)
        {
            check_orphaned();
            arraySetterHelper(fieldTypeArray, FIELDTYPE$18);
        }
        
        /**
         * Sets ith "field-type" element
         */
        public void setFieldTypeArray(int i, com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType fieldType)
        {
            generatedSetterHelperImpl(fieldType, FIELDTYPE$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field-type" element
         */
        public com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType insertNewFieldType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType target = null;
                target = (com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType)get_store().insert_element_user(FIELDTYPE$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field-type" element
         */
        public com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType addNewFieldType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType target = null;
                target = (com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType)get_store().add_element_user(FIELDTYPE$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "field-type" element
         */
        public void removeFieldType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDTYPE$18, i);
            }
        }
        
        /**
         * Gets array of all "datasource" elements
         */
        public com.kyt.xsd.entityconfig.DatasourceDocument.Datasource[] getDatasourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DATASOURCE$20, targetList);
                com.kyt.xsd.entityconfig.DatasourceDocument.Datasource[] result = new com.kyt.xsd.entityconfig.DatasourceDocument.Datasource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "datasource" element
         */
        public com.kyt.xsd.entityconfig.DatasourceDocument.Datasource getDatasourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.DatasourceDocument.Datasource target = null;
                target = (com.kyt.xsd.entityconfig.DatasourceDocument.Datasource)get_store().find_element_user(DATASOURCE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "datasource" element
         */
        public int sizeOfDatasourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATASOURCE$20);
            }
        }
        
        /**
         * Sets array of all "datasource" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDatasourceArray(com.kyt.xsd.entityconfig.DatasourceDocument.Datasource[] datasourceArray)
        {
            check_orphaned();
            arraySetterHelper(datasourceArray, DATASOURCE$20);
        }
        
        /**
         * Sets ith "datasource" element
         */
        public void setDatasourceArray(int i, com.kyt.xsd.entityconfig.DatasourceDocument.Datasource datasource)
        {
            generatedSetterHelperImpl(datasource, DATASOURCE$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "datasource" element
         */
        public com.kyt.xsd.entityconfig.DatasourceDocument.Datasource insertNewDatasource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.DatasourceDocument.Datasource target = null;
                target = (com.kyt.xsd.entityconfig.DatasourceDocument.Datasource)get_store().insert_element_user(DATASOURCE$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "datasource" element
         */
        public com.kyt.xsd.entityconfig.DatasourceDocument.Datasource addNewDatasource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.DatasourceDocument.Datasource target = null;
                target = (com.kyt.xsd.entityconfig.DatasourceDocument.Datasource)get_store().add_element_user(DATASOURCE$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "datasource" element
         */
        public void removeDatasource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATASOURCE$20, i);
            }
        }
    }
}
