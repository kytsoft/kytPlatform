/*
 * An XML document type.
 * Localname: condition-field
 * Namespace: 
 * Java type: com.kyt.xsd.entityeca.ConditionFieldDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityeca.impl;
/**
 * A document containing one condition-field(@) element.
 *
 * This is a complex type.
 */
public class ConditionFieldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityeca.ConditionFieldDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConditionFieldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONFIELD$0 = 
        new javax.xml.namespace.QName("", "condition-field");
    
    
    /**
     * Gets the "condition-field" element
     */
    public com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField getConditionField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField target = null;
            target = (com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField)get_store().find_element_user(CONDITIONFIELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "condition-field" element
     */
    public void setConditionField(com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField conditionField)
    {
        generatedSetterHelperImpl(conditionField, CONDITIONFIELD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "condition-field" element
     */
    public com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField addNewConditionField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField target = null;
            target = (com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField)get_store().add_element_user(CONDITIONFIELD$0);
            return target;
        }
    }
    /**
     * An XML condition-field(@).
     *
     * This is a complex type.
     */
    public static class ConditionFieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField
    {
        private static final long serialVersionUID = 1L;
        
        public ConditionFieldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELDNAME$0 = 
            new javax.xml.namespace.QName("", "field-name");
        private static final javax.xml.namespace.QName OPERATOR$2 = 
            new javax.xml.namespace.QName("", "operator");
        private static final javax.xml.namespace.QName TOFIELDNAME$4 = 
            new javax.xml.namespace.QName("", "to-field-name");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName FORMAT$8 = 
            new javax.xml.namespace.QName("", "format");
        
        
        /**
         * Gets the "field-name" attribute
         */
        public java.lang.String getFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "field-name" attribute
         */
        public void setFieldName(java.lang.String fieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDNAME$0);
                }
                target.setStringValue(fieldName);
            }
        }
        
        /**
         * Sets (as xml) the "field-name" attribute
         */
        public void xsetFieldName(org.apache.xmlbeans.XmlString fieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDNAME$0);
                }
                target.set(fieldName);
            }
        }
        
        /**
         * Gets the "operator" attribute
         */
        public com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Operator.Enum getOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$2);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Operator.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "operator" attribute
         */
        public com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Operator xgetOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Operator target = null;
                target = (com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Operator)get_store().find_attribute_user(OPERATOR$2);
                return target;
            }
        }
        
        /**
         * Sets the "operator" attribute
         */
        public void setOperator(com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Operator.Enum operator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$2);
                }
                target.setEnumValue(operator);
            }
        }
        
        /**
         * Sets (as xml) the "operator" attribute
         */
        public void xsetOperator(com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Operator operator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Operator target = null;
                target = (com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Operator)get_store().find_attribute_user(OPERATOR$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Operator)get_store().add_attribute_user(OPERATOR$2);
                }
                target.set(operator);
            }
        }
        
        /**
         * Gets the "to-field-name" attribute
         */
        public java.lang.String getToFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOFIELDNAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "to-field-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetToFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOFIELDNAME$4);
                return target;
            }
        }
        
        /**
         * True if has "to-field-name" attribute
         */
        public boolean isSetToFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TOFIELDNAME$4) != null;
            }
        }
        
        /**
         * Sets the "to-field-name" attribute
         */
        public void setToFieldName(java.lang.String toFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOFIELDNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOFIELDNAME$4);
                }
                target.setStringValue(toFieldName);
            }
        }
        
        /**
         * Sets (as xml) the "to-field-name" attribute
         */
        public void xsetToFieldName(org.apache.xmlbeans.XmlString toFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOFIELDNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOFIELDNAME$4);
                }
                target.set(toFieldName);
            }
        }
        
        /**
         * Unsets the "to-field-name" attribute
         */
        public void unsetToFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TOFIELDNAME$4);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$6);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Type target = null;
                target = (com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Type)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Type)get_default_attribute_value(TYPE$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$6) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Type.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Type target = null;
                target = (com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Type)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Type)get_store().add_attribute_user(TYPE$6);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$6);
            }
        }
        
        /**
         * Gets the "format" attribute
         */
        public java.lang.String getFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "format" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$8);
                return target;
            }
        }
        
        /**
         * True if has "format" attribute
         */
        public boolean isSetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FORMAT$8) != null;
            }
        }
        
        /**
         * Sets the "format" attribute
         */
        public void setFormat(java.lang.String format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$8);
                }
                target.setStringValue(format);
            }
        }
        
        /**
         * Sets (as xml) the "format" attribute
         */
        public void xsetFormat(org.apache.xmlbeans.XmlString format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMAT$8);
                }
                target.set(format);
            }
        }
        
        /**
         * Unsets the "format" attribute
         */
        public void unsetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FORMAT$8);
            }
        }
        /**
         * An XML operator(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityeca.ConditionFieldDocument$ConditionField$Operator.
         */
        public static class OperatorImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Operator
        {
            private static final long serialVersionUID = 1L;
            
            public OperatorImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected OperatorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityeca.ConditionFieldDocument$ConditionField$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entityeca.ConditionFieldDocument.ConditionField.Type
        {
            private static final long serialVersionUID = 1L;
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
