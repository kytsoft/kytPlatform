/*
 * An XML document type.
 * Localname: entity-count
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.EntityCountDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one entity-count(@) element.
 *
 * This is a complex type.
 */
public class EntityCountDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityFindOperationsDocumentImpl implements com.kyt.xsd.simplemethods.EntityCountDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityCountDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYCOUNT$0 = 
        new javax.xml.namespace.QName("", "entity-count");
    
    
    /**
     * Gets the "entity-count" element
     */
    public com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount getEntityCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount target = null;
            target = (com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount)get_store().find_element_user(ENTITYCOUNT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity-count" element
     */
    public void setEntityCount(com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount entityCount)
    {
        generatedSetterHelperImpl(entityCount, ENTITYCOUNT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entity-count" element
     */
    public com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount addNewEntityCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount target = null;
            target = (com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount)get_store().add_element_user(ENTITYCOUNT$0);
            return target;
        }
    }
    /**
     * An XML entity-count(@).
     *
     * This is a complex type.
     */
    public static class EntityCountImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.EntityCountDocument.EntityCount
    {
        private static final long serialVersionUID = 1L;
        
        public EntityCountImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONDITIONEXPR$0 = 
            new javax.xml.namespace.QName("", "condition-expr");
        private static final javax.xml.namespace.QName CONDITIONLIST$2 = 
            new javax.xml.namespace.QName("", "condition-list");
        private static final javax.xml.namespace.QName CONDITIONOBJECT$4 = 
            new javax.xml.namespace.QName("", "condition-object");
        private static final javax.xml.namespace.QName HAVINGCONDITIONLIST$6 = 
            new javax.xml.namespace.QName("", "having-condition-list");
        private static final javax.xml.namespace.QName ENTITYNAME$8 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName DELEGATORNAME$10 = 
            new javax.xml.namespace.QName("", "delegator-name");
        private static final javax.xml.namespace.QName COUNTFIELD$12 = 
            new javax.xml.namespace.QName("", "count-field");
        
        
        /**
         * Gets the "condition-expr" element
         */
        public com.kyt.xsd.simplemethods.ConditionExprDocument.ConditionExpr getConditionExpr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ConditionExprDocument.ConditionExpr target = null;
                target = (com.kyt.xsd.simplemethods.ConditionExprDocument.ConditionExpr)get_store().find_element_user(CONDITIONEXPR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "condition-expr" element
         */
        public boolean isSetConditionExpr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONDITIONEXPR$0) != 0;
            }
        }
        
        /**
         * Sets the "condition-expr" element
         */
        public void setConditionExpr(com.kyt.xsd.simplemethods.ConditionExprDocument.ConditionExpr conditionExpr)
        {
            generatedSetterHelperImpl(conditionExpr, CONDITIONEXPR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "condition-expr" element
         */
        public com.kyt.xsd.simplemethods.ConditionExprDocument.ConditionExpr addNewConditionExpr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ConditionExprDocument.ConditionExpr target = null;
                target = (com.kyt.xsd.simplemethods.ConditionExprDocument.ConditionExpr)get_store().add_element_user(CONDITIONEXPR$0);
                return target;
            }
        }
        
        /**
         * Unsets the "condition-expr" element
         */
        public void unsetConditionExpr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONDITIONEXPR$0, 0);
            }
        }
        
        /**
         * Gets the "condition-list" element
         */
        public com.kyt.xsd.simplemethods.ConditionListDocument.ConditionList getConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ConditionListDocument.ConditionList target = null;
                target = (com.kyt.xsd.simplemethods.ConditionListDocument.ConditionList)get_store().find_element_user(CONDITIONLIST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "condition-list" element
         */
        public boolean isSetConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONDITIONLIST$2) != 0;
            }
        }
        
        /**
         * Sets the "condition-list" element
         */
        public void setConditionList(com.kyt.xsd.simplemethods.ConditionListDocument.ConditionList conditionList)
        {
            generatedSetterHelperImpl(conditionList, CONDITIONLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "condition-list" element
         */
        public com.kyt.xsd.simplemethods.ConditionListDocument.ConditionList addNewConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ConditionListDocument.ConditionList target = null;
                target = (com.kyt.xsd.simplemethods.ConditionListDocument.ConditionList)get_store().add_element_user(CONDITIONLIST$2);
                return target;
            }
        }
        
        /**
         * Unsets the "condition-list" element
         */
        public void unsetConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONDITIONLIST$2, 0);
            }
        }
        
        /**
         * Gets the "condition-object" element
         */
        public com.kyt.xsd.simplemethods.ConditionObjectDocument.ConditionObject getConditionObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ConditionObjectDocument.ConditionObject target = null;
                target = (com.kyt.xsd.simplemethods.ConditionObjectDocument.ConditionObject)get_store().find_element_user(CONDITIONOBJECT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "condition-object" element
         */
        public boolean isSetConditionObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONDITIONOBJECT$4) != 0;
            }
        }
        
        /**
         * Sets the "condition-object" element
         */
        public void setConditionObject(com.kyt.xsd.simplemethods.ConditionObjectDocument.ConditionObject conditionObject)
        {
            generatedSetterHelperImpl(conditionObject, CONDITIONOBJECT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "condition-object" element
         */
        public com.kyt.xsd.simplemethods.ConditionObjectDocument.ConditionObject addNewConditionObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ConditionObjectDocument.ConditionObject target = null;
                target = (com.kyt.xsd.simplemethods.ConditionObjectDocument.ConditionObject)get_store().add_element_user(CONDITIONOBJECT$4);
                return target;
            }
        }
        
        /**
         * Unsets the "condition-object" element
         */
        public void unsetConditionObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONDITIONOBJECT$4, 0);
            }
        }
        
        /**
         * Gets the "having-condition-list" element
         */
        public com.kyt.xsd.simplemethods.HavingConditionListDocument.HavingConditionList getHavingConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.HavingConditionListDocument.HavingConditionList target = null;
                target = (com.kyt.xsd.simplemethods.HavingConditionListDocument.HavingConditionList)get_store().find_element_user(HAVINGCONDITIONLIST$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "having-condition-list" element
         */
        public boolean isSetHavingConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HAVINGCONDITIONLIST$6) != 0;
            }
        }
        
        /**
         * Sets the "having-condition-list" element
         */
        public void setHavingConditionList(com.kyt.xsd.simplemethods.HavingConditionListDocument.HavingConditionList havingConditionList)
        {
            generatedSetterHelperImpl(havingConditionList, HAVINGCONDITIONLIST$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "having-condition-list" element
         */
        public com.kyt.xsd.simplemethods.HavingConditionListDocument.HavingConditionList addNewHavingConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.HavingConditionListDocument.HavingConditionList target = null;
                target = (com.kyt.xsd.simplemethods.HavingConditionListDocument.HavingConditionList)get_store().add_element_user(HAVINGCONDITIONLIST$6);
                return target;
            }
        }
        
        /**
         * Unsets the "having-condition-list" element
         */
        public void unsetHavingConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HAVINGCONDITIONLIST$6, 0);
            }
        }
        
        /**
         * Gets the "entity-name" attribute
         */
        public java.lang.String getEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entity-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$8);
                return target;
            }
        }
        
        /**
         * Sets the "entity-name" attribute
         */
        public void setEntityName(java.lang.String entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$8);
                }
                target.setStringValue(entityName);
            }
        }
        
        /**
         * Sets (as xml) the "entity-name" attribute
         */
        public void xsetEntityName(org.apache.xmlbeans.XmlString entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$8);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Gets the "delegator-name" attribute
         */
        public java.lang.String getDelegatorName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELEGATORNAME$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "delegator-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDelegatorName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELEGATORNAME$10);
                return target;
            }
        }
        
        /**
         * True if has "delegator-name" attribute
         */
        public boolean isSetDelegatorName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DELEGATORNAME$10) != null;
            }
        }
        
        /**
         * Sets the "delegator-name" attribute
         */
        public void setDelegatorName(java.lang.String delegatorName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELEGATORNAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELEGATORNAME$10);
                }
                target.setStringValue(delegatorName);
            }
        }
        
        /**
         * Sets (as xml) the "delegator-name" attribute
         */
        public void xsetDelegatorName(org.apache.xmlbeans.XmlString delegatorName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELEGATORNAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DELEGATORNAME$10);
                }
                target.set(delegatorName);
            }
        }
        
        /**
         * Unsets the "delegator-name" attribute
         */
        public void unsetDelegatorName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DELEGATORNAME$10);
            }
        }
        
        /**
         * Gets the "count-field" attribute
         */
        public java.lang.String getCountField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTFIELD$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "count-field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCountField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTFIELD$12);
                return target;
            }
        }
        
        /**
         * Sets the "count-field" attribute
         */
        public void setCountField(java.lang.String countField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTFIELD$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTFIELD$12);
                }
                target.setStringValue(countField);
            }
        }
        
        /**
         * Sets (as xml) the "count-field" attribute
         */
        public void xsetCountField(org.apache.xmlbeans.XmlString countField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTFIELD$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COUNTFIELD$12);
                }
                target.set(countField);
            }
        }
    }
}
