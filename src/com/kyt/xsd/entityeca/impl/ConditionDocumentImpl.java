/*
 * An XML document type.
 * Localname: condition
 * Namespace: 
 * Java type: com.kyt.xsd.entityeca.ConditionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityeca.impl;
/**
 * A document containing one condition(@) element.
 *
 * This is a complex type.
 */
public class ConditionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityeca.ConditionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConditionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITION$0 = 
        new javax.xml.namespace.QName("", "condition");
    
    
    /**
     * Gets the "condition" element
     */
    public com.kyt.xsd.entityeca.ConditionDocument.Condition getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityeca.ConditionDocument.Condition target = null;
            target = (com.kyt.xsd.entityeca.ConditionDocument.Condition)get_store().find_element_user(CONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "condition" element
     */
    public void setCondition(com.kyt.xsd.entityeca.ConditionDocument.Condition condition)
    {
        generatedSetterHelperImpl(condition, CONDITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "condition" element
     */
    public com.kyt.xsd.entityeca.ConditionDocument.Condition addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityeca.ConditionDocument.Condition target = null;
            target = (com.kyt.xsd.entityeca.ConditionDocument.Condition)get_store().add_element_user(CONDITION$0);
            return target;
        }
    }
    /**
     * An XML condition(@).
     *
     * This is a complex type.
     */
    public static class ConditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityeca.ConditionDocument.Condition
    {
        private static final long serialVersionUID = 1L;
        
        public ConditionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELDNAME$0 = 
            new javax.xml.namespace.QName("", "field-name");
        private static final javax.xml.namespace.QName OPERATOR$2 = 
            new javax.xml.namespace.QName("", "operator");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
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
        public com.kyt.xsd.entityeca.ConditionDocument.Condition.Operator.Enum getOperator()
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
                return (com.kyt.xsd.entityeca.ConditionDocument.Condition.Operator.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "operator" attribute
         */
        public com.kyt.xsd.entityeca.ConditionDocument.Condition.Operator xgetOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ConditionDocument.Condition.Operator target = null;
                target = (com.kyt.xsd.entityeca.ConditionDocument.Condition.Operator)get_store().find_attribute_user(OPERATOR$2);
                return target;
            }
        }
        
        /**
         * Sets the "operator" attribute
         */
        public void setOperator(com.kyt.xsd.entityeca.ConditionDocument.Condition.Operator.Enum operator)
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
        public void xsetOperator(com.kyt.xsd.entityeca.ConditionDocument.Condition.Operator operator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ConditionDocument.Condition.Operator target = null;
                target = (com.kyt.xsd.entityeca.ConditionDocument.Condition.Operator)get_store().find_attribute_user(OPERATOR$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ConditionDocument.Condition.Operator)get_store().add_attribute_user(OPERATOR$2);
                }
                target.set(operator);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$4) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$4);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$4);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$4);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public com.kyt.xsd.entityeca.ConditionDocument.Condition.Type.Enum getType()
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
                return (com.kyt.xsd.entityeca.ConditionDocument.Condition.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.entityeca.ConditionDocument.Condition.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ConditionDocument.Condition.Type target = null;
                target = (com.kyt.xsd.entityeca.ConditionDocument.Condition.Type)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ConditionDocument.Condition.Type)get_default_attribute_value(TYPE$6);
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
        public void setType(com.kyt.xsd.entityeca.ConditionDocument.Condition.Type.Enum type)
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
        public void xsetType(com.kyt.xsd.entityeca.ConditionDocument.Condition.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ConditionDocument.Condition.Type target = null;
                target = (com.kyt.xsd.entityeca.ConditionDocument.Condition.Type)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ConditionDocument.Condition.Type)get_store().add_attribute_user(TYPE$6);
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
         * This is an atomic type that is a restriction of com.kyt.xsd.entityeca.ConditionDocument$Condition$Operator.
         */
        public static class OperatorImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entityeca.ConditionDocument.Condition.Operator
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
         * This is an atomic type that is a restriction of com.kyt.xsd.entityeca.ConditionDocument$Condition$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entityeca.ConditionDocument.Condition.Type
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
