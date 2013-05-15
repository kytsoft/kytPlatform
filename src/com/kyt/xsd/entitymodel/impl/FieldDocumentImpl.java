/*
 * An XML document type.
 * Localname: field
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.FieldDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel.impl;
/**
 * A document containing one field(@) element.
 *
 * This is a complex type.
 */
public class FieldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.FieldDocument
{
    private static final long serialVersionUID = 1L;
    
    public FieldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELD$0 = 
        new javax.xml.namespace.QName("", "field");
    
    
    /**
     * Gets the "field" element
     */
    public com.kyt.xsd.entitymodel.FieldDocument.Field getField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.FieldDocument.Field target = null;
            target = (com.kyt.xsd.entitymodel.FieldDocument.Field)get_store().find_element_user(FIELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "field" element
     */
    public void setField(com.kyt.xsd.entitymodel.FieldDocument.Field field)
    {
        generatedSetterHelperImpl(field, FIELD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "field" element
     */
    public com.kyt.xsd.entitymodel.FieldDocument.Field addNewField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.FieldDocument.Field target = null;
            target = (com.kyt.xsd.entitymodel.FieldDocument.Field)get_store().add_element_user(FIELD$0);
            return target;
        }
    }
    /**
     * An XML field(@).
     *
     * This is a complex type.
     */
    public static class FieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.FieldDocument.Field
    {
        private static final long serialVersionUID = 1L;
        
        public FieldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName VALIDATE$2 = 
            new javax.xml.namespace.QName("", "validate");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName COLNAME$6 = 
            new javax.xml.namespace.QName("", "col-name");
        private static final javax.xml.namespace.QName TYPE$8 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName ENCRYPT$10 = 
            new javax.xml.namespace.QName("", "encrypt");
        private static final javax.xml.namespace.QName ENABLEAUDITLOG$12 = 
            new javax.xml.namespace.QName("", "enable-audit-log");
        private static final javax.xml.namespace.QName NOTNULL$14 = 
            new javax.xml.namespace.QName("", "not-null");
        private static final javax.xml.namespace.QName FIELDSET$16 = 
            new javax.xml.namespace.QName("", "field-set");
        
        
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
         * Gets array of all "validate" elements
         */
        public com.kyt.xsd.entitymodel.ValidateDocument.Validate[] getValidateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALIDATE$2, targetList);
                com.kyt.xsd.entitymodel.ValidateDocument.Validate[] result = new com.kyt.xsd.entitymodel.ValidateDocument.Validate[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "validate" element
         */
        public com.kyt.xsd.entitymodel.ValidateDocument.Validate getValidateArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ValidateDocument.Validate target = null;
                target = (com.kyt.xsd.entitymodel.ValidateDocument.Validate)get_store().find_element_user(VALIDATE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "validate" element
         */
        public int sizeOfValidateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALIDATE$2);
            }
        }
        
        /**
         * Sets array of all "validate" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setValidateArray(com.kyt.xsd.entitymodel.ValidateDocument.Validate[] validateArray)
        {
            check_orphaned();
            arraySetterHelper(validateArray, VALIDATE$2);
        }
        
        /**
         * Sets ith "validate" element
         */
        public void setValidateArray(int i, com.kyt.xsd.entitymodel.ValidateDocument.Validate validate)
        {
            generatedSetterHelperImpl(validate, VALIDATE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "validate" element
         */
        public com.kyt.xsd.entitymodel.ValidateDocument.Validate insertNewValidate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ValidateDocument.Validate target = null;
                target = (com.kyt.xsd.entitymodel.ValidateDocument.Validate)get_store().insert_element_user(VALIDATE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "validate" element
         */
        public com.kyt.xsd.entitymodel.ValidateDocument.Validate addNewValidate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ValidateDocument.Validate target = null;
                target = (com.kyt.xsd.entitymodel.ValidateDocument.Validate)get_store().add_element_user(VALIDATE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "validate" element
         */
        public void removeValidate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALIDATE$2, i);
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
         * Gets the "col-name" attribute
         */
        public java.lang.String getColName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLNAME$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "col-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetColName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLNAME$6);
                return target;
            }
        }
        
        /**
         * True if has "col-name" attribute
         */
        public boolean isSetColName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COLNAME$6) != null;
            }
        }
        
        /**
         * Sets the "col-name" attribute
         */
        public void setColName(java.lang.String colName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLNAME$6);
                }
                target.setStringValue(colName);
            }
        }
        
        /**
         * Sets (as xml) the "col-name" attribute
         */
        public void xsetColName(org.apache.xmlbeans.XmlString colName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLNAME$6);
                }
                target.set(colName);
            }
        }
        
        /**
         * Unsets the "col-name" attribute
         */
        public void unsetColName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COLNAME$6);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$8);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$8);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "encrypt" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean.Enum getEncrypt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCRYPT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENCRYPT$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entitymodel.Boolean.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "encrypt" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean xgetEncrypt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(ENCRYPT$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_default_attribute_value(ENCRYPT$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "encrypt" attribute
         */
        public boolean isSetEncrypt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCRYPT$10) != null;
            }
        }
        
        /**
         * Sets the "encrypt" attribute
         */
        public void setEncrypt(com.kyt.xsd.entitymodel.Boolean.Enum encrypt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCRYPT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCRYPT$10);
                }
                target.setEnumValue(encrypt);
            }
        }
        
        /**
         * Sets (as xml) the "encrypt" attribute
         */
        public void xsetEncrypt(com.kyt.xsd.entitymodel.Boolean encrypt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(ENCRYPT$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_store().add_attribute_user(ENCRYPT$10);
                }
                target.set(encrypt);
            }
        }
        
        /**
         * Unsets the "encrypt" attribute
         */
        public void unsetEncrypt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCRYPT$10);
            }
        }
        
        /**
         * Gets the "enable-audit-log" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean.Enum getEnableAuditLog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEAUDITLOG$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENABLEAUDITLOG$12);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entitymodel.Boolean.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "enable-audit-log" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean xgetEnableAuditLog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(ENABLEAUDITLOG$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_default_attribute_value(ENABLEAUDITLOG$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "enable-audit-log" attribute
         */
        public boolean isSetEnableAuditLog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENABLEAUDITLOG$12) != null;
            }
        }
        
        /**
         * Sets the "enable-audit-log" attribute
         */
        public void setEnableAuditLog(com.kyt.xsd.entitymodel.Boolean.Enum enableAuditLog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEAUDITLOG$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLEAUDITLOG$12);
                }
                target.setEnumValue(enableAuditLog);
            }
        }
        
        /**
         * Sets (as xml) the "enable-audit-log" attribute
         */
        public void xsetEnableAuditLog(com.kyt.xsd.entitymodel.Boolean enableAuditLog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(ENABLEAUDITLOG$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_store().add_attribute_user(ENABLEAUDITLOG$12);
                }
                target.set(enableAuditLog);
            }
        }
        
        /**
         * Unsets the "enable-audit-log" attribute
         */
        public void unsetEnableAuditLog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENABLEAUDITLOG$12);
            }
        }
        
        /**
         * Gets the "not-null" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean.Enum getNotNull()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOTNULL$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOTNULL$14);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entitymodel.Boolean.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "not-null" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean xgetNotNull()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(NOTNULL$14);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_default_attribute_value(NOTNULL$14);
                }
                return target;
            }
        }
        
        /**
         * True if has "not-null" attribute
         */
        public boolean isSetNotNull()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NOTNULL$14) != null;
            }
        }
        
        /**
         * Sets the "not-null" attribute
         */
        public void setNotNull(com.kyt.xsd.entitymodel.Boolean.Enum notNull)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOTNULL$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOTNULL$14);
                }
                target.setEnumValue(notNull);
            }
        }
        
        /**
         * Sets (as xml) the "not-null" attribute
         */
        public void xsetNotNull(com.kyt.xsd.entitymodel.Boolean notNull)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(NOTNULL$14);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_store().add_attribute_user(NOTNULL$14);
                }
                target.set(notNull);
            }
        }
        
        /**
         * Unsets the "not-null" attribute
         */
        public void unsetNotNull()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NOTNULL$14);
            }
        }
        
        /**
         * Gets the "field-set" attribute
         */
        public java.lang.String getFieldSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDSET$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIELDSET$16);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field-set" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFieldSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDSET$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(FIELDSET$16);
                }
                return target;
            }
        }
        
        /**
         * True if has "field-set" attribute
         */
        public boolean isSetFieldSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FIELDSET$16) != null;
            }
        }
        
        /**
         * Sets the "field-set" attribute
         */
        public void setFieldSet(java.lang.String fieldSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDSET$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDSET$16);
                }
                target.setStringValue(fieldSet);
            }
        }
        
        /**
         * Sets (as xml) the "field-set" attribute
         */
        public void xsetFieldSet(org.apache.xmlbeans.XmlString fieldSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDSET$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDSET$16);
                }
                target.set(fieldSet);
            }
        }
        
        /**
         * Unsets the "field-set" attribute
         */
        public void unsetFieldSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FIELDSET$16);
            }
        }
    }
}
