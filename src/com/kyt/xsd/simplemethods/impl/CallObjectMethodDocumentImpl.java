/*
 * An XML document type.
 * Localname: call-object-method
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.CallObjectMethodDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one call-object-method(@) element.
 *
 * This is a complex type.
 */
public class CallObjectMethodDocumentImpl extends com.kyt.xsd.simplemethods.impl.CallOperationsDocumentImpl implements com.kyt.xsd.simplemethods.CallObjectMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public CallObjectMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLOBJECTMETHOD$0 = 
        new javax.xml.namespace.QName("", "call-object-method");
    
    
    /**
     * Gets the "call-object-method" element
     */
    public com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod getCallObjectMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod target = null;
            target = (com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod)get_store().find_element_user(CALLOBJECTMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "call-object-method" element
     */
    public void setCallObjectMethod(com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod callObjectMethod)
    {
        generatedSetterHelperImpl(callObjectMethod, CALLOBJECTMETHOD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "call-object-method" element
     */
    public com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod addNewCallObjectMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod target = null;
            target = (com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod)get_store().add_element_user(CALLOBJECTMETHOD$0);
            return target;
        }
    }
    /**
     * An XML call-object-method(@).
     *
     * This is a complex type.
     */
    public static class CallObjectMethodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.CallObjectMethodDocument.CallObjectMethod
    {
        private static final long serialVersionUID = 1L;
        
        public CallObjectMethodImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STRING$0 = 
            new javax.xml.namespace.QName("", "string");
        private static final javax.xml.namespace.QName FIELD$2 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName OBJFIELD$4 = 
            new javax.xml.namespace.QName("", "obj-field");
        private static final javax.xml.namespace.QName METHODNAME$6 = 
            new javax.xml.namespace.QName("", "method-name");
        private static final javax.xml.namespace.QName RETFIELD$8 = 
            new javax.xml.namespace.QName("", "ret-field");
        
        
        /**
         * Gets array of all "string" elements
         */
        public com.kyt.xsd.simplemethods.StringDocument.String[] getStringArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STRING$0, targetList);
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
                target = (com.kyt.xsd.simplemethods.StringDocument.String)get_store().find_element_user(STRING$0, i);
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
                return get_store().count_elements(STRING$0);
            }
        }
        
        /**
         * Sets array of all "string" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setStringArray(com.kyt.xsd.simplemethods.StringDocument.String[] stringArray)
        {
            check_orphaned();
            arraySetterHelper(stringArray, STRING$0);
        }
        
        /**
         * Sets ith "string" element
         */
        public void setStringArray(int i, com.kyt.xsd.simplemethods.StringDocument.String string)
        {
            generatedSetterHelperImpl(string, STRING$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (com.kyt.xsd.simplemethods.StringDocument.String)get_store().insert_element_user(STRING$0, i);
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
                target = (com.kyt.xsd.simplemethods.StringDocument.String)get_store().add_element_user(STRING$0);
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
                get_store().remove_element(STRING$0, i);
            }
        }
        
        /**
         * Gets array of all "field" elements
         */
        public com.kyt.xsd.simplemethods.FieldDocument.Field[] getFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELD$2, targetList);
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
                target = (com.kyt.xsd.simplemethods.FieldDocument.Field)get_store().find_element_user(FIELD$2, i);
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
                return get_store().count_elements(FIELD$2);
            }
        }
        
        /**
         * Sets array of all "field" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFieldArray(com.kyt.xsd.simplemethods.FieldDocument.Field[] fieldArray)
        {
            check_orphaned();
            arraySetterHelper(fieldArray, FIELD$2);
        }
        
        /**
         * Sets ith "field" element
         */
        public void setFieldArray(int i, com.kyt.xsd.simplemethods.FieldDocument.Field field)
        {
            generatedSetterHelperImpl(field, FIELD$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (com.kyt.xsd.simplemethods.FieldDocument.Field)get_store().insert_element_user(FIELD$2, i);
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
                target = (com.kyt.xsd.simplemethods.FieldDocument.Field)get_store().add_element_user(FIELD$2);
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
                get_store().remove_element(FIELD$2, i);
            }
        }
        
        /**
         * Gets the "obj-field" attribute
         */
        public java.lang.String getObjField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJFIELD$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "obj-field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetObjField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OBJFIELD$4);
                return target;
            }
        }
        
        /**
         * Sets the "obj-field" attribute
         */
        public void setObjField(java.lang.String objField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OBJFIELD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OBJFIELD$4);
                }
                target.setStringValue(objField);
            }
        }
        
        /**
         * Sets (as xml) the "obj-field" attribute
         */
        public void xsetObjField(org.apache.xmlbeans.XmlString objField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OBJFIELD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OBJFIELD$4);
                }
                target.set(objField);
            }
        }
        
        /**
         * Gets the "method-name" attribute
         */
        public java.lang.String getMethodName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHODNAME$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "method-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMethodName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHODNAME$6);
                return target;
            }
        }
        
        /**
         * Sets the "method-name" attribute
         */
        public void setMethodName(java.lang.String methodName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHODNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHODNAME$6);
                }
                target.setStringValue(methodName);
            }
        }
        
        /**
         * Sets (as xml) the "method-name" attribute
         */
        public void xsetMethodName(org.apache.xmlbeans.XmlString methodName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(METHODNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(METHODNAME$6);
                }
                target.set(methodName);
            }
        }
        
        /**
         * Gets the "ret-field" attribute
         */
        public java.lang.String getRetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETFIELD$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ret-field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RETFIELD$8);
                return target;
            }
        }
        
        /**
         * True if has "ret-field" attribute
         */
        public boolean isSetRetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RETFIELD$8) != null;
            }
        }
        
        /**
         * Sets the "ret-field" attribute
         */
        public void setRetField(java.lang.String retField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RETFIELD$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RETFIELD$8);
                }
                target.setStringValue(retField);
            }
        }
        
        /**
         * Sets (as xml) the "ret-field" attribute
         */
        public void xsetRetField(org.apache.xmlbeans.XmlString retField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RETFIELD$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RETFIELD$8);
                }
                target.set(retField);
            }
        }
        
        /**
         * Unsets the "ret-field" attribute
         */
        public void unsetRetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RETFIELD$8);
            }
        }
    }
}
