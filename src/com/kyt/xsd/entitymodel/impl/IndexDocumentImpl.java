/*
 * An XML document type.
 * Localname: index
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.IndexDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel.impl;
/**
 * A document containing one index(@) element.
 *
 * This is a complex type.
 */
public class IndexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.IndexDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEX$0 = 
        new javax.xml.namespace.QName("", "index");
    
    
    /**
     * Gets the "index" element
     */
    public com.kyt.xsd.entitymodel.IndexDocument.Index getIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.IndexDocument.Index target = null;
            target = (com.kyt.xsd.entitymodel.IndexDocument.Index)get_store().find_element_user(INDEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "index" element
     */
    public void setIndex(com.kyt.xsd.entitymodel.IndexDocument.Index index)
    {
        generatedSetterHelperImpl(index, INDEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "index" element
     */
    public com.kyt.xsd.entitymodel.IndexDocument.Index addNewIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.IndexDocument.Index target = null;
            target = (com.kyt.xsd.entitymodel.IndexDocument.Index)get_store().add_element_user(INDEX$0);
            return target;
        }
    }
    /**
     * An XML index(@).
     *
     * This is a complex type.
     */
    public static class IndexImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.IndexDocument.Index
    {
        private static final long serialVersionUID = 1L;
        
        public IndexImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName INDEXFIELD$2 = 
            new javax.xml.namespace.QName("", "index-field");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName UNIQUE$6 = 
            new javax.xml.namespace.QName("", "unique");
        
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "description" element
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$0) != 0;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
                }
                target.set(description);
            }
        }
        
        /**
         * Unsets the "description" element
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$0, 0);
            }
        }
        
        /**
         * Gets array of all "index-field" elements
         */
        public com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField[] getIndexFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INDEXFIELD$2, targetList);
                com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField[] result = new com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "index-field" element
         */
        public com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField getIndexFieldArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField target = null;
                target = (com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField)get_store().find_element_user(INDEXFIELD$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "index-field" element
         */
        public int sizeOfIndexFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXFIELD$2);
            }
        }
        
        /**
         * Sets array of all "index-field" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIndexFieldArray(com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField[] indexFieldArray)
        {
            check_orphaned();
            arraySetterHelper(indexFieldArray, INDEXFIELD$2);
        }
        
        /**
         * Sets ith "index-field" element
         */
        public void setIndexFieldArray(int i, com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField indexField)
        {
            generatedSetterHelperImpl(indexField, INDEXFIELD$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "index-field" element
         */
        public com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField insertNewIndexField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField target = null;
                target = (com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField)get_store().insert_element_user(INDEXFIELD$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "index-field" element
         */
        public com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField addNewIndexField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField target = null;
                target = (com.kyt.xsd.entitymodel.IndexFieldDocument.IndexField)get_store().add_element_user(INDEXFIELD$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "index-field" element
         */
        public void removeIndexField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXFIELD$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "unique" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean.Enum getUnique()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNIQUE$6);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entitymodel.Boolean.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "unique" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean xgetUnique()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(UNIQUE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_default_attribute_value(UNIQUE$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "unique" attribute
         */
        public boolean isSetUnique()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(UNIQUE$6) != null;
            }
        }
        
        /**
         * Sets the "unique" attribute
         */
        public void setUnique(com.kyt.xsd.entitymodel.Boolean.Enum unique)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIQUE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIQUE$6);
                }
                target.setEnumValue(unique);
            }
        }
        
        /**
         * Sets (as xml) the "unique" attribute
         */
        public void xsetUnique(com.kyt.xsd.entitymodel.Boolean unique)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(UNIQUE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_store().add_attribute_user(UNIQUE$6);
                }
                target.set(unique);
            }
        }
        
        /**
         * Unsets the "unique" attribute
         */
        public void unsetUnique()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(UNIQUE$6);
            }
        }
    }
}
