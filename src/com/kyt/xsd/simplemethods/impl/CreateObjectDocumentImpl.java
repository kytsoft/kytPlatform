/*
 * An XML document type.
 * Localname: create-object
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.CreateObjectDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one create-object(@) element.
 *
 * This is a complex type.
 */
public class CreateObjectDocumentImpl extends com.kyt.xsd.simplemethods.impl.CallOperationsDocumentImpl implements com.kyt.xsd.simplemethods.CreateObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEOBJECT$0 = 
        new javax.xml.namespace.QName("", "create-object");
    
    
    /**
     * Gets the "create-object" element
     */
    public com.kyt.xsd.simplemethods.CreateObjectDocument.CreateObject getCreateObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.CreateObjectDocument.CreateObject target = null;
            target = (com.kyt.xsd.simplemethods.CreateObjectDocument.CreateObject)get_store().find_element_user(CREATEOBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "create-object" element
     */
    public void setCreateObject(com.kyt.xsd.simplemethods.CreateObjectDocument.CreateObject createObject)
    {
        generatedSetterHelperImpl(createObject, CREATEOBJECT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "create-object" element
     */
    public com.kyt.xsd.simplemethods.CreateObjectDocument.CreateObject addNewCreateObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.CreateObjectDocument.CreateObject target = null;
            target = (com.kyt.xsd.simplemethods.CreateObjectDocument.CreateObject)get_store().add_element_user(CREATEOBJECT$0);
            return target;
        }
    }
    /**
     * An XML create-object(@).
     *
     * This is a complex type.
     */
    public static class CreateObjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.CreateObjectDocument.CreateObject
    {
        private static final long serialVersionUID = 1L;
        
        public CreateObjectImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELD$0 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName STRING$2 = 
            new javax.xml.namespace.QName("", "string");
        private static final javax.xml.namespace.QName CLASSNAME$4 = 
            new javax.xml.namespace.QName("", "class-name");
        private static final javax.xml.namespace.QName FIELD2$6 = 
            new javax.xml.namespace.QName("", "field");
        
        
        /**
         * Gets array of all "field" elements
         */
        public com.kyt.xsd.simplemethods.FieldDocument.Field[] getFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELD2$6, targetList);
                com.kyt.xsd.simplemethods.FieldDocument.Field[] result = new com.kyt.xsd.simplemethods.FieldDocument.Field[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "field" element
         */
        public com.kyt.xsd.simplemethods.FieldDocument.Field getFieldArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FieldDocument.Field target = null;
                target = (com.kyt.xsd.simplemethods.FieldDocument.Field)get_store().find_element_user(FIELD2$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "field" element
         */
        public int sizeOfFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELD2$6);
            }
        }
        
        /**
         * Sets array of all "field" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFieldArray(com.kyt.xsd.simplemethods.FieldDocument.Field[] fieldArray)
        {
            check_orphaned();
            arraySetterHelper(fieldArray, FIELD2$6);
        }
        
        /**
         * Sets ith "field" element
         */
        public void setFieldArray(int i, com.kyt.xsd.simplemethods.FieldDocument.Field field)
        {
            generatedSetterHelperImpl(field, FIELD2$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field" element
         */
        public com.kyt.xsd.simplemethods.FieldDocument.Field insertNewField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FieldDocument.Field target = null;
                target = (com.kyt.xsd.simplemethods.FieldDocument.Field)get_store().insert_element_user(FIELD2$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field" element
         */
        public com.kyt.xsd.simplemethods.FieldDocument.Field addNewField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FieldDocument.Field target = null;
                target = (com.kyt.xsd.simplemethods.FieldDocument.Field)get_store().add_element_user(FIELD2$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "field" element
         */
        public void removeField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELD2$6, i);
            }
        }
        
        /**
         * Gets array of all "string" elements
         */
        public com.kyt.xsd.simplemethods.StringDocument.String[] getStringArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STRING$2, targetList);
                com.kyt.xsd.simplemethods.StringDocument.String[] result = new com.kyt.xsd.simplemethods.StringDocument.String[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "string" element
         */
        public com.kyt.xsd.simplemethods.StringDocument.String getStringArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.StringDocument.String target = null;
                target = (com.kyt.xsd.simplemethods.StringDocument.String)get_store().find_element_user(STRING$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "string" element
         */
        public int sizeOfStringArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRING$2);
            }
        }
        
        /**
         * Sets array of all "string" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setStringArray(com.kyt.xsd.simplemethods.StringDocument.String[] stringArray)
        {
            check_orphaned();
            arraySetterHelper(stringArray, STRING$2);
        }
        
        /**
         * Sets ith "string" element
         */
        public void setStringArray(int i, com.kyt.xsd.simplemethods.StringDocument.String string)
        {
            generatedSetterHelperImpl(string, STRING$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "string" element
         */
        public com.kyt.xsd.simplemethods.StringDocument.String insertNewString(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.StringDocument.String target = null;
                target = (com.kyt.xsd.simplemethods.StringDocument.String)get_store().insert_element_user(STRING$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "string" element
         */
        public com.kyt.xsd.simplemethods.StringDocument.String addNewString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.StringDocument.String target = null;
                target = (com.kyt.xsd.simplemethods.StringDocument.String)get_store().add_element_user(STRING$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "string" element
         */
        public void removeString(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRING$2, i);
            }
        }
        
        /**
         * Gets the "class-name" attribute
         */
        public java.lang.String getClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "class-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSNAME$4);
                return target;
            }
        }
        
        /**
         * Sets the "class-name" attribute
         */
        public void setClassName(java.lang.String className)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSNAME$4);
                }
                target.setStringValue(className);
            }
        }
        
        /**
         * Sets (as xml) the "class-name" attribute
         */
        public void xsetClassName(org.apache.xmlbeans.XmlString className)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASSNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASSNAME$4);
                }
                target.set(className);
            }
        }
        
        /**
         * Gets the "field" attribute
         */
        public java.lang.String getField2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD2$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetField2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD2$6);
                return target;
            }
        }
        
        /**
         * True if has "field" attribute
         */
        public boolean isSetField2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FIELD2$6) != null;
            }
        }
        
        /**
         * Sets the "field" attribute
         */
        public void setField2(java.lang.String field2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD2$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD2$6);
                }
                target.setStringValue(field2);
            }
        }
        
        /**
         * Sets (as xml) the "field" attribute
         */
        public void xsetField2(org.apache.xmlbeans.XmlString field2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD2$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELD2$6);
                }
                target.set(field2);
            }
        }
        
        /**
         * Unsets the "field" attribute
         */
        public void unsetField2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FIELD2$6);
            }
        }
    }
}
