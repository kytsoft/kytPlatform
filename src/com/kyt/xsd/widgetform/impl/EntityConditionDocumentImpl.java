/*
 * An XML document type.
 * Localname: entity-condition
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.EntityConditionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one entity-condition(@) element.
 *
 * This is a complex type.
 */
public class EntityConditionDocumentImpl extends com.kyt.xsd.widgetform.impl.AllActionsDocumentImpl implements com.kyt.xsd.widgetform.EntityConditionDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityConditionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYCONDITION$0 = 
        new javax.xml.namespace.QName("", "entity-condition");
    
    
    /**
     * Gets the "entity-condition" element
     */
    public com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition getEntityCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition target = null;
            target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition)get_store().find_element_user(ENTITYCONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity-condition" element
     */
    public void setEntityCondition(com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition entityCondition)
    {
        generatedSetterHelperImpl(entityCondition, ENTITYCONDITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entity-condition" element
     */
    public com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition addNewEntityCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition target = null;
            target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition)get_store().add_element_user(ENTITYCONDITION$0);
            return target;
        }
    }
    /**
     * An XML entity-condition(@).
     *
     * This is a complex type.
     */
    public static class EntityConditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition
    {
        private static final long serialVersionUID = 1L;
        
        public EntityConditionImpl(org.apache.xmlbeans.SchemaType sType)
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
        private static final javax.xml.namespace.QName SELECTFIELD$8 = 
            new javax.xml.namespace.QName("", "select-field");
        private static final javax.xml.namespace.QName ORDERBY$10 = 
            new javax.xml.namespace.QName("", "order-by");
        private static final javax.xml.namespace.QName LIMITRANGE$12 = 
            new javax.xml.namespace.QName("", "limit-range");
        private static final javax.xml.namespace.QName LIMITVIEW$14 = 
            new javax.xml.namespace.QName("", "limit-view");
        private static final javax.xml.namespace.QName USEITERATOR$16 = 
            new javax.xml.namespace.QName("", "use-iterator");
        private static final javax.xml.namespace.QName ENTITYNAME$18 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName LIST$20 = 
            new javax.xml.namespace.QName("", "list");
        private static final javax.xml.namespace.QName USECACHE$22 = 
            new javax.xml.namespace.QName("", "use-cache");
        private static final javax.xml.namespace.QName FILTERBYDATE$24 = 
            new javax.xml.namespace.QName("", "filter-by-date");
        private static final javax.xml.namespace.QName DISTINCT$26 = 
            new javax.xml.namespace.QName("", "distinct");
        private static final javax.xml.namespace.QName DELEGATORNAME$28 = 
            new javax.xml.namespace.QName("", "delegator-name");
        private static final javax.xml.namespace.QName RESULTSETTYPE$30 = 
            new javax.xml.namespace.QName("", "result-set-type");
        
        
        /**
         * Gets the "condition-expr" element
         */
        public com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr getConditionExpr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr target = null;
                target = (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr)get_store().find_element_user(CONDITIONEXPR$0, 0);
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
        public void setConditionExpr(com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr conditionExpr)
        {
            generatedSetterHelperImpl(conditionExpr, CONDITIONEXPR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "condition-expr" element
         */
        public com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr addNewConditionExpr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr target = null;
                target = (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr)get_store().add_element_user(CONDITIONEXPR$0);
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
        public com.kyt.xsd.widgetform.ConditionListDocument.ConditionList getConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionListDocument.ConditionList target = null;
                target = (com.kyt.xsd.widgetform.ConditionListDocument.ConditionList)get_store().find_element_user(CONDITIONLIST$2, 0);
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
        public void setConditionList(com.kyt.xsd.widgetform.ConditionListDocument.ConditionList conditionList)
        {
            generatedSetterHelperImpl(conditionList, CONDITIONLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "condition-list" element
         */
        public com.kyt.xsd.widgetform.ConditionListDocument.ConditionList addNewConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionListDocument.ConditionList target = null;
                target = (com.kyt.xsd.widgetform.ConditionListDocument.ConditionList)get_store().add_element_user(CONDITIONLIST$2);
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
        public com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject getConditionObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject target = null;
                target = (com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject)get_store().find_element_user(CONDITIONOBJECT$4, 0);
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
        public void setConditionObject(com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject conditionObject)
        {
            generatedSetterHelperImpl(conditionObject, CONDITIONOBJECT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "condition-object" element
         */
        public com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject addNewConditionObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject target = null;
                target = (com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject)get_store().add_element_user(CONDITIONOBJECT$4);
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
        public com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList getHavingConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList target = null;
                target = (com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList)get_store().find_element_user(HAVINGCONDITIONLIST$6, 0);
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
        public void setHavingConditionList(com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList havingConditionList)
        {
            generatedSetterHelperImpl(havingConditionList, HAVINGCONDITIONLIST$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "having-condition-list" element
         */
        public com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList addNewHavingConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList target = null;
                target = (com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList)get_store().add_element_user(HAVINGCONDITIONLIST$6);
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
         * Gets array of all "select-field" elements
         */
        public com.kyt.xsd.widgetform.SelectFieldDocument.SelectField[] getSelectFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SELECTFIELD$8, targetList);
                com.kyt.xsd.widgetform.SelectFieldDocument.SelectField[] result = new com.kyt.xsd.widgetform.SelectFieldDocument.SelectField[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "select-field" element
         */
        public com.kyt.xsd.widgetform.SelectFieldDocument.SelectField getSelectFieldArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SelectFieldDocument.SelectField target = null;
                target = (com.kyt.xsd.widgetform.SelectFieldDocument.SelectField)get_store().find_element_user(SELECTFIELD$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "select-field" element
         */
        public int sizeOfSelectFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SELECTFIELD$8);
            }
        }
        
        /**
         * Sets array of all "select-field" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSelectFieldArray(com.kyt.xsd.widgetform.SelectFieldDocument.SelectField[] selectFieldArray)
        {
            check_orphaned();
            arraySetterHelper(selectFieldArray, SELECTFIELD$8);
        }
        
        /**
         * Sets ith "select-field" element
         */
        public void setSelectFieldArray(int i, com.kyt.xsd.widgetform.SelectFieldDocument.SelectField selectField)
        {
            generatedSetterHelperImpl(selectField, SELECTFIELD$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "select-field" element
         */
        public com.kyt.xsd.widgetform.SelectFieldDocument.SelectField insertNewSelectField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SelectFieldDocument.SelectField target = null;
                target = (com.kyt.xsd.widgetform.SelectFieldDocument.SelectField)get_store().insert_element_user(SELECTFIELD$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "select-field" element
         */
        public com.kyt.xsd.widgetform.SelectFieldDocument.SelectField addNewSelectField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SelectFieldDocument.SelectField target = null;
                target = (com.kyt.xsd.widgetform.SelectFieldDocument.SelectField)get_store().add_element_user(SELECTFIELD$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "select-field" element
         */
        public void removeSelectField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SELECTFIELD$8, i);
            }
        }
        
        /**
         * Gets array of all "order-by" elements
         */
        public com.kyt.xsd.widgetform.OrderByDocument.OrderBy[] getOrderByArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORDERBY$10, targetList);
                com.kyt.xsd.widgetform.OrderByDocument.OrderBy[] result = new com.kyt.xsd.widgetform.OrderByDocument.OrderBy[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "order-by" element
         */
        public com.kyt.xsd.widgetform.OrderByDocument.OrderBy getOrderByArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.OrderByDocument.OrderBy target = null;
                target = (com.kyt.xsd.widgetform.OrderByDocument.OrderBy)get_store().find_element_user(ORDERBY$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "order-by" element
         */
        public int sizeOfOrderByArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDERBY$10);
            }
        }
        
        /**
         * Sets array of all "order-by" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOrderByArray(com.kyt.xsd.widgetform.OrderByDocument.OrderBy[] orderByArray)
        {
            check_orphaned();
            arraySetterHelper(orderByArray, ORDERBY$10);
        }
        
        /**
         * Sets ith "order-by" element
         */
        public void setOrderByArray(int i, com.kyt.xsd.widgetform.OrderByDocument.OrderBy orderBy)
        {
            generatedSetterHelperImpl(orderBy, ORDERBY$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "order-by" element
         */
        public com.kyt.xsd.widgetform.OrderByDocument.OrderBy insertNewOrderBy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.OrderByDocument.OrderBy target = null;
                target = (com.kyt.xsd.widgetform.OrderByDocument.OrderBy)get_store().insert_element_user(ORDERBY$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "order-by" element
         */
        public com.kyt.xsd.widgetform.OrderByDocument.OrderBy addNewOrderBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.OrderByDocument.OrderBy target = null;
                target = (com.kyt.xsd.widgetform.OrderByDocument.OrderBy)get_store().add_element_user(ORDERBY$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "order-by" element
         */
        public void removeOrderBy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDERBY$10, i);
            }
        }
        
        /**
         * Gets the "limit-range" element
         */
        public com.kyt.xsd.widgetform.LimitRangeDocument.LimitRange getLimitRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.LimitRangeDocument.LimitRange target = null;
                target = (com.kyt.xsd.widgetform.LimitRangeDocument.LimitRange)get_store().find_element_user(LIMITRANGE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "limit-range" element
         */
        public boolean isSetLimitRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LIMITRANGE$12) != 0;
            }
        }
        
        /**
         * Sets the "limit-range" element
         */
        public void setLimitRange(com.kyt.xsd.widgetform.LimitRangeDocument.LimitRange limitRange)
        {
            generatedSetterHelperImpl(limitRange, LIMITRANGE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "limit-range" element
         */
        public com.kyt.xsd.widgetform.LimitRangeDocument.LimitRange addNewLimitRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.LimitRangeDocument.LimitRange target = null;
                target = (com.kyt.xsd.widgetform.LimitRangeDocument.LimitRange)get_store().add_element_user(LIMITRANGE$12);
                return target;
            }
        }
        
        /**
         * Unsets the "limit-range" element
         */
        public void unsetLimitRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LIMITRANGE$12, 0);
            }
        }
        
        /**
         * Gets the "limit-view" element
         */
        public com.kyt.xsd.widgetform.LimitViewDocument.LimitView getLimitView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.LimitViewDocument.LimitView target = null;
                target = (com.kyt.xsd.widgetform.LimitViewDocument.LimitView)get_store().find_element_user(LIMITVIEW$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "limit-view" element
         */
        public boolean isSetLimitView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LIMITVIEW$14) != 0;
            }
        }
        
        /**
         * Sets the "limit-view" element
         */
        public void setLimitView(com.kyt.xsd.widgetform.LimitViewDocument.LimitView limitView)
        {
            generatedSetterHelperImpl(limitView, LIMITVIEW$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "limit-view" element
         */
        public com.kyt.xsd.widgetform.LimitViewDocument.LimitView addNewLimitView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.LimitViewDocument.LimitView target = null;
                target = (com.kyt.xsd.widgetform.LimitViewDocument.LimitView)get_store().add_element_user(LIMITVIEW$14);
                return target;
            }
        }
        
        /**
         * Unsets the "limit-view" element
         */
        public void unsetLimitView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LIMITVIEW$14, 0);
            }
        }
        
        /**
         * Gets the "use-iterator" element
         */
        public com.kyt.xsd.widgetform.UseIteratorDocument.UseIterator getUseIterator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.UseIteratorDocument.UseIterator target = null;
                target = (com.kyt.xsd.widgetform.UseIteratorDocument.UseIterator)get_store().find_element_user(USEITERATOR$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "use-iterator" element
         */
        public boolean isSetUseIterator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USEITERATOR$16) != 0;
            }
        }
        
        /**
         * Sets the "use-iterator" element
         */
        public void setUseIterator(com.kyt.xsd.widgetform.UseIteratorDocument.UseIterator useIterator)
        {
            generatedSetterHelperImpl(useIterator, USEITERATOR$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "use-iterator" element
         */
        public com.kyt.xsd.widgetform.UseIteratorDocument.UseIterator addNewUseIterator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.UseIteratorDocument.UseIterator target = null;
                target = (com.kyt.xsd.widgetform.UseIteratorDocument.UseIterator)get_store().add_element_user(USEITERATOR$16);
                return target;
            }
        }
        
        /**
         * Unsets the "use-iterator" element
         */
        public void unsetUseIterator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USEITERATOR$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$18);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Gets the "list" attribute
         */
        public java.lang.String getList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "list" attribute
         */
        public org.apache.xmlbeans.XmlString xgetList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$20);
                return target;
            }
        }
        
        /**
         * True if has "list" attribute
         */
        public boolean isSetList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LIST$20) != null;
            }
        }
        
        /**
         * Sets the "list" attribute
         */
        public void setList(java.lang.String list)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIST$20);
                }
                target.setStringValue(list);
            }
        }
        
        /**
         * Sets (as xml) the "list" attribute
         */
        public void xsetList(org.apache.xmlbeans.XmlString list)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIST$20);
                }
                target.set(list);
            }
        }
        
        /**
         * Unsets the "list" attribute
         */
        public void unsetList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LIST$20);
            }
        }
        
        /**
         * Gets the "use-cache" attribute
         */
        public com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.UseCache.Enum getUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USECACHE$22);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.UseCache.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "use-cache" attribute
         */
        public com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.UseCache xgetUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.UseCache target = null;
                target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.UseCache)get_store().find_attribute_user(USECACHE$22);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.UseCache)get_default_attribute_value(USECACHE$22);
                }
                return target;
            }
        }
        
        /**
         * True if has "use-cache" attribute
         */
        public boolean isSetUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USECACHE$22) != null;
            }
        }
        
        /**
         * Sets the "use-cache" attribute
         */
        public void setUseCache(com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.UseCache.Enum useCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USECACHE$22);
                }
                target.setEnumValue(useCache);
            }
        }
        
        /**
         * Sets (as xml) the "use-cache" attribute
         */
        public void xsetUseCache(com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.UseCache useCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.UseCache target = null;
                target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.UseCache)get_store().find_attribute_user(USECACHE$22);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.UseCache)get_store().add_attribute_user(USECACHE$22);
                }
                target.set(useCache);
            }
        }
        
        /**
         * Unsets the "use-cache" attribute
         */
        public void unsetUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USECACHE$22);
            }
        }
        
        /**
         * Gets the "filter-by-date" attribute
         */
        public com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.FilterByDate.Enum getFilterByDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERBYDATE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILTERBYDATE$24);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.FilterByDate.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "filter-by-date" attribute
         */
        public com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.FilterByDate xgetFilterByDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.FilterByDate target = null;
                target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.FilterByDate)get_store().find_attribute_user(FILTERBYDATE$24);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.FilterByDate)get_default_attribute_value(FILTERBYDATE$24);
                }
                return target;
            }
        }
        
        /**
         * True if has "filter-by-date" attribute
         */
        public boolean isSetFilterByDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FILTERBYDATE$24) != null;
            }
        }
        
        /**
         * Sets the "filter-by-date" attribute
         */
        public void setFilterByDate(com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.FilterByDate.Enum filterByDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERBYDATE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILTERBYDATE$24);
                }
                target.setEnumValue(filterByDate);
            }
        }
        
        /**
         * Sets (as xml) the "filter-by-date" attribute
         */
        public void xsetFilterByDate(com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.FilterByDate filterByDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.FilterByDate target = null;
                target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.FilterByDate)get_store().find_attribute_user(FILTERBYDATE$24);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.FilterByDate)get_store().add_attribute_user(FILTERBYDATE$24);
                }
                target.set(filterByDate);
            }
        }
        
        /**
         * Unsets the "filter-by-date" attribute
         */
        public void unsetFilterByDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FILTERBYDATE$24);
            }
        }
        
        /**
         * Gets the "distinct" attribute
         */
        public com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.Distinct.Enum getDistinct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTINCT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DISTINCT$26);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.Distinct.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "distinct" attribute
         */
        public com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.Distinct xgetDistinct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.Distinct target = null;
                target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.Distinct)get_store().find_attribute_user(DISTINCT$26);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.Distinct)get_default_attribute_value(DISTINCT$26);
                }
                return target;
            }
        }
        
        /**
         * True if has "distinct" attribute
         */
        public boolean isSetDistinct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISTINCT$26) != null;
            }
        }
        
        /**
         * Sets the "distinct" attribute
         */
        public void setDistinct(com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.Distinct.Enum distinct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTINCT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTINCT$26);
                }
                target.setEnumValue(distinct);
            }
        }
        
        /**
         * Sets (as xml) the "distinct" attribute
         */
        public void xsetDistinct(com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.Distinct distinct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.Distinct target = null;
                target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.Distinct)get_store().find_attribute_user(DISTINCT$26);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.Distinct)get_store().add_attribute_user(DISTINCT$26);
                }
                target.set(distinct);
            }
        }
        
        /**
         * Unsets the "distinct" attribute
         */
        public void unsetDistinct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISTINCT$26);
            }
        }
        
        /**
         * Gets the "delegator-name" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getDelegatorName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(DELEGATORNAME$28);
                if (target == null)
                {
                    return null;
                }
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
                return get_store().find_attribute_user(DELEGATORNAME$28) != null;
            }
        }
        
        /**
         * Sets the "delegator-name" attribute
         */
        public void setDelegatorName(org.apache.xmlbeans.XmlAnySimpleType delegatorName)
        {
            generatedSetterHelperImpl(delegatorName, DELEGATORNAME$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "delegator-name" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewDelegatorName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(DELEGATORNAME$28);
                return target;
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
                get_store().remove_attribute(DELEGATORNAME$28);
            }
        }
        
        /**
         * Gets the "result-set-type" attribute
         */
        public com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.ResultSetType.Enum getResultSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTSETTYPE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RESULTSETTYPE$30);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.ResultSetType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "result-set-type" attribute
         */
        public com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.ResultSetType xgetResultSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.ResultSetType target = null;
                target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.ResultSetType)get_store().find_attribute_user(RESULTSETTYPE$30);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.ResultSetType)get_default_attribute_value(RESULTSETTYPE$30);
                }
                return target;
            }
        }
        
        /**
         * True if has "result-set-type" attribute
         */
        public boolean isSetResultSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESULTSETTYPE$30) != null;
            }
        }
        
        /**
         * Sets the "result-set-type" attribute
         */
        public void setResultSetType(com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.ResultSetType.Enum resultSetType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTSETTYPE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESULTSETTYPE$30);
                }
                target.setEnumValue(resultSetType);
            }
        }
        
        /**
         * Sets (as xml) the "result-set-type" attribute
         */
        public void xsetResultSetType(com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.ResultSetType resultSetType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.ResultSetType target = null;
                target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.ResultSetType)get_store().find_attribute_user(RESULTSETTYPE$30);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.ResultSetType)get_store().add_attribute_user(RESULTSETTYPE$30);
                }
                target.set(resultSetType);
            }
        }
        
        /**
         * Unsets the "result-set-type" attribute
         */
        public void unsetResultSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESULTSETTYPE$30);
            }
        }
        /**
         * An XML use-cache(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.EntityConditionDocument$EntityCondition$UseCache.
         */
        public static class UseCacheImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.UseCache
        {
            private static final long serialVersionUID = 1L;
            
            public UseCacheImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UseCacheImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML filter-by-date(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.EntityConditionDocument$EntityCondition$FilterByDate.
         */
        public static class FilterByDateImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.FilterByDate
        {
            private static final long serialVersionUID = 1L;
            
            public FilterByDateImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected FilterByDateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML distinct(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.EntityConditionDocument$EntityCondition$Distinct.
         */
        public static class DistinctImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.Distinct
        {
            private static final long serialVersionUID = 1L;
            
            public DistinctImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DistinctImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML result-set-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.EntityConditionDocument$EntityCondition$ResultSetType.
         */
        public static class ResultSetTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.EntityConditionDocument.EntityCondition.ResultSetType
        {
            private static final long serialVersionUID = 1L;
            
            public ResultSetTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ResultSetTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
