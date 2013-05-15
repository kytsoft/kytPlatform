/*
 * An XML document type.
 * Localname: fieldtypemodel
 * Namespace: 
 * Java type: com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.fieldtypemodel.impl;
/**
 * A document containing one fieldtypemodel(@) element.
 *
 * This is a complex type.
 */
public class FieldtypemodelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument
{
    private static final long serialVersionUID = 1L;
    
    public FieldtypemodelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDTYPEMODEL$0 = 
        new javax.xml.namespace.QName("", "fieldtypemodel");
    
    
    /**
     * Gets the "fieldtypemodel" element
     */
    public com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel getFieldtypemodel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel target = null;
            target = (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel)get_store().find_element_user(FIELDTYPEMODEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fieldtypemodel" element
     */
    public void setFieldtypemodel(com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel fieldtypemodel)
    {
        generatedSetterHelperImpl(fieldtypemodel, FIELDTYPEMODEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fieldtypemodel" element
     */
    public com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel addNewFieldtypemodel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel target = null;
            target = (com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel)get_store().add_element_user(FIELDTYPEMODEL$0);
            return target;
        }
    }
    /**
     * An XML fieldtypemodel(@).
     *
     * This is a complex type.
     */
    public static class FieldtypemodelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.fieldtypemodel.FieldtypemodelDocument.Fieldtypemodel
    {
        private static final long serialVersionUID = 1L;
        
        public FieldtypemodelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELDTYPEDEF$0 = 
            new javax.xml.namespace.QName("", "field-type-def");
        
        
        /**
         * Gets array of all "field-type-def" elements
         */
        public com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef[] getFieldTypeDefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELDTYPEDEF$0, targetList);
                com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef[] result = new com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "field-type-def" element
         */
        public com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef getFieldTypeDefArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef target = null;
                target = (com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef)get_store().find_element_user(FIELDTYPEDEF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "field-type-def" element
         */
        public int sizeOfFieldTypeDefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDTYPEDEF$0);
            }
        }
        
        /**
         * Sets array of all "field-type-def" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFieldTypeDefArray(com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef[] fieldTypeDefArray)
        {
            check_orphaned();
            arraySetterHelper(fieldTypeDefArray, FIELDTYPEDEF$0);
        }
        
        /**
         * Sets ith "field-type-def" element
         */
        public void setFieldTypeDefArray(int i, com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef fieldTypeDef)
        {
            generatedSetterHelperImpl(fieldTypeDef, FIELDTYPEDEF$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field-type-def" element
         */
        public com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef insertNewFieldTypeDef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef target = null;
                target = (com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef)get_store().insert_element_user(FIELDTYPEDEF$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field-type-def" element
         */
        public com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef addNewFieldTypeDef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef target = null;
                target = (com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef)get_store().add_element_user(FIELDTYPEDEF$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "field-type-def" element
         */
        public void removeFieldTypeDef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDTYPEDEF$0, i);
            }
        }
    }
}
