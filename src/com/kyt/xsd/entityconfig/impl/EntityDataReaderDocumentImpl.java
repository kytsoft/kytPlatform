/*
 * An XML document type.
 * Localname: entity-data-reader
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.EntityDataReaderDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig.impl;
/**
 * A document containing one entity-data-reader(@) element.
 *
 * This is a complex type.
 */
public class EntityDataReaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.EntityDataReaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityDataReaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYDATAREADER$0 = 
        new javax.xml.namespace.QName("", "entity-data-reader");
    
    
    /**
     * Gets the "entity-data-reader" element
     */
    public com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader getEntityDataReader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader target = null;
            target = (com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader)get_store().find_element_user(ENTITYDATAREADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity-data-reader" element
     */
    public void setEntityDataReader(com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader entityDataReader)
    {
        generatedSetterHelperImpl(entityDataReader, ENTITYDATAREADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entity-data-reader" element
     */
    public com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader addNewEntityDataReader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader target = null;
            target = (com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader)get_store().add_element_user(ENTITYDATAREADER$0);
            return target;
        }
    }
    /**
     * An XML entity-data-reader(@).
     *
     * This is a complex type.
     */
    public static class EntityDataReaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.EntityDataReaderDocument.EntityDataReader
    {
        private static final long serialVersionUID = 1L;
        
        public EntityDataReaderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCE$0 = 
            new javax.xml.namespace.QName("", "resource");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets array of all "resource" elements
         */
        public com.kyt.xsd.entityconfig.ResourceDocument.Resource[] getResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESOURCE$0, targetList);
                com.kyt.xsd.entityconfig.ResourceDocument.Resource[] result = new com.kyt.xsd.entityconfig.ResourceDocument.Resource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resource" element
         */
        public com.kyt.xsd.entityconfig.ResourceDocument.Resource getResourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.ResourceDocument.Resource target = null;
                target = (com.kyt.xsd.entityconfig.ResourceDocument.Resource)get_store().find_element_user(RESOURCE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resource" element
         */
        public int sizeOfResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCE$0);
            }
        }
        
        /**
         * Sets array of all "resource" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setResourceArray(com.kyt.xsd.entityconfig.ResourceDocument.Resource[] resourceArray)
        {
            check_orphaned();
            arraySetterHelper(resourceArray, RESOURCE$0);
        }
        
        /**
         * Sets ith "resource" element
         */
        public void setResourceArray(int i, com.kyt.xsd.entityconfig.ResourceDocument.Resource resource)
        {
            generatedSetterHelperImpl(resource, RESOURCE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resource" element
         */
        public com.kyt.xsd.entityconfig.ResourceDocument.Resource insertNewResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.ResourceDocument.Resource target = null;
                target = (com.kyt.xsd.entityconfig.ResourceDocument.Resource)get_store().insert_element_user(RESOURCE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resource" element
         */
        public com.kyt.xsd.entityconfig.ResourceDocument.Resource addNewResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.ResourceDocument.Resource target = null;
                target = (com.kyt.xsd.entityconfig.ResourceDocument.Resource)get_store().add_element_user(RESOURCE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "resource" element
         */
        public void removeResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCE$0, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
    }
}
