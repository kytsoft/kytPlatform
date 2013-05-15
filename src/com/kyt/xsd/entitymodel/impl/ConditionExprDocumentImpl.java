/*
 * An XML document type.
 * Localname: condition-expr
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.ConditionExprDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel.impl;
/**
 * A document containing one condition-expr(@) element.
 *
 * This is a complex type.
 */
public class ConditionExprDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.ConditionExprDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConditionExprDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONEXPR$0 = 
        new javax.xml.namespace.QName("", "condition-expr");
    
    
    /**
     * Gets the "condition-expr" element
     */
    public com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr getConditionExpr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr target = null;
            target = (com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr)get_store().find_element_user(CONDITIONEXPR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "condition-expr" element
     */
    public void setConditionExpr(com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr conditionExpr)
    {
        generatedSetterHelperImpl(conditionExpr, CONDITIONEXPR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "condition-expr" element
     */
    public com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr addNewConditionExpr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr target = null;
            target = (com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr)get_store().add_element_user(CONDITIONEXPR$0);
            return target;
        }
    }
    /**
     * An XML condition-expr(@).
     *
     * This is a complex type.
     */
    public static class ConditionExprImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr
    {
        private static final long serialVersionUID = 1L;
        
        public ConditionExprImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYALIAS$0 = 
            new javax.xml.namespace.QName("", "entity-alias");
        private static final javax.xml.namespace.QName FIELDNAME$2 = 
            new javax.xml.namespace.QName("", "field-name");
        private static final javax.xml.namespace.QName OPERATOR$4 = 
            new javax.xml.namespace.QName("", "operator");
        private static final javax.xml.namespace.QName RELENTITYALIAS$6 = 
            new javax.xml.namespace.QName("", "rel-entity-alias");
        private static final javax.xml.namespace.QName RELFIELDNAME$8 = 
            new javax.xml.namespace.QName("", "rel-field-name");
        private static final javax.xml.namespace.QName VALUE$10 = 
            new javax.xml.namespace.QName("", "value");
        private static final javax.xml.namespace.QName IGNORECASE$12 = 
            new javax.xml.namespace.QName("", "ignore-case");
        
        
        /**
         * Gets the "entity-alias" attribute
         */
        public java.lang.String getEntityAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYALIAS$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entity-alias" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEntityAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYALIAS$0);
                return target;
            }
        }
        
        /**
         * True if has "entity-alias" attribute
         */
        public boolean isSetEntityAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENTITYALIAS$0) != null;
            }
        }
        
        /**
         * Sets the "entity-alias" attribute
         */
        public void setEntityAlias(java.lang.String entityAlias)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYALIAS$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYALIAS$0);
                }
                target.setStringValue(entityAlias);
            }
        }
        
        /**
         * Sets (as xml) the "entity-alias" attribute
         */
        public void xsetEntityAlias(org.apache.xmlbeans.XmlString entityAlias)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYALIAS$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYALIAS$0);
                }
                target.set(entityAlias);
            }
        }
        
        /**
         * Unsets the "entity-alias" attribute
         */
        public void unsetEntityAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENTITYALIAS$0);
            }
        }
        
        /**
         * Gets the "field-name" attribute
         */
        public java.lang.String getFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDNAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDNAME$2);
                }
                target.set(fieldName);
            }
        }
        
        /**
         * Gets the "operator" attribute
         */
        public com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr.Operator.Enum getOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OPERATOR$4);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr.Operator.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "operator" attribute
         */
        public com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr.Operator xgetOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr.Operator target = null;
                target = (com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr.Operator)get_store().find_attribute_user(OPERATOR$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr.Operator)get_default_attribute_value(OPERATOR$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "operator" attribute
         */
        public boolean isSetOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OPERATOR$4) != null;
            }
        }
        
        /**
         * Sets the "operator" attribute
         */
        public void setOperator(com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr.Operator.Enum operator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$4);
                }
                target.setEnumValue(operator);
            }
        }
        
        /**
         * Sets (as xml) the "operator" attribute
         */
        public void xsetOperator(com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr.Operator operator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr.Operator target = null;
                target = (com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr.Operator)get_store().find_attribute_user(OPERATOR$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr.Operator)get_store().add_attribute_user(OPERATOR$4);
                }
                target.set(operator);
            }
        }
        
        /**
         * Unsets the "operator" attribute
         */
        public void unsetOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OPERATOR$4);
            }
        }
        
        /**
         * Gets the "rel-entity-alias" attribute
         */
        public java.lang.String getRelEntityAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELENTITYALIAS$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rel-entity-alias" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRelEntityAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELENTITYALIAS$6);
                return target;
            }
        }
        
        /**
         * True if has "rel-entity-alias" attribute
         */
        public boolean isSetRelEntityAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RELENTITYALIAS$6) != null;
            }
        }
        
        /**
         * Sets the "rel-entity-alias" attribute
         */
        public void setRelEntityAlias(java.lang.String relEntityAlias)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELENTITYALIAS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELENTITYALIAS$6);
                }
                target.setStringValue(relEntityAlias);
            }
        }
        
        /**
         * Sets (as xml) the "rel-entity-alias" attribute
         */
        public void xsetRelEntityAlias(org.apache.xmlbeans.XmlString relEntityAlias)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELENTITYALIAS$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELENTITYALIAS$6);
                }
                target.set(relEntityAlias);
            }
        }
        
        /**
         * Unsets the "rel-entity-alias" attribute
         */
        public void unsetRelEntityAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RELENTITYALIAS$6);
            }
        }
        
        /**
         * Gets the "rel-field-name" attribute
         */
        public java.lang.String getRelFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELFIELDNAME$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rel-field-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRelFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELFIELDNAME$8);
                return target;
            }
        }
        
        /**
         * True if has "rel-field-name" attribute
         */
        public boolean isSetRelFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RELFIELDNAME$8) != null;
            }
        }
        
        /**
         * Sets the "rel-field-name" attribute
         */
        public void setRelFieldName(java.lang.String relFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELFIELDNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELFIELDNAME$8);
                }
                target.setStringValue(relFieldName);
            }
        }
        
        /**
         * Sets (as xml) the "rel-field-name" attribute
         */
        public void xsetRelFieldName(org.apache.xmlbeans.XmlString relFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELFIELDNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELFIELDNAME$8);
                }
                target.set(relFieldName);
            }
        }
        
        /**
         * Unsets the "rel-field-name" attribute
         */
        public void unsetRelFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RELFIELDNAME$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$10);
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
                return get_store().find_attribute_user(VALUE$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$10);
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
                get_store().remove_attribute(VALUE$10);
            }
        }
        
        /**
         * Gets the "ignore-case" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean.Enum getIgnoreCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNORECASE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IGNORECASE$12);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entitymodel.Boolean.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ignore-case" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean xgetIgnoreCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(IGNORECASE$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_default_attribute_value(IGNORECASE$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "ignore-case" attribute
         */
        public boolean isSetIgnoreCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IGNORECASE$12) != null;
            }
        }
        
        /**
         * Sets the "ignore-case" attribute
         */
        public void setIgnoreCase(com.kyt.xsd.entitymodel.Boolean.Enum ignoreCase)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNORECASE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IGNORECASE$12);
                }
                target.setEnumValue(ignoreCase);
            }
        }
        
        /**
         * Sets (as xml) the "ignore-case" attribute
         */
        public void xsetIgnoreCase(com.kyt.xsd.entitymodel.Boolean ignoreCase)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(IGNORECASE$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_store().add_attribute_user(IGNORECASE$12);
                }
                target.set(ignoreCase);
            }
        }
        
        /**
         * Unsets the "ignore-case" attribute
         */
        public void unsetIgnoreCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IGNORECASE$12);
            }
        }
        /**
         * An XML operator(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entitymodel.ConditionExprDocument$ConditionExpr$Operator.
         */
        public static class OperatorImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr.Operator
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
    }
}
