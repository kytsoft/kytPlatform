/*
 * An XML document type.
 * Localname: entity-condition
 * Namespace: 
 * Java type: com.kyt.xsd.widgettree.EntityConditionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgettree.impl;
/**
 * A document containing one entity-condition(@) element.
 *
 * This is a complex type.
 */
public class EntityConditionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.EntityConditionDocument
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
    public com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition getEntityCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition target = null;
            target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition)get_store().find_element_user(ENTITYCONDITION$0, 0);
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
    public void setEntityCondition(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition entityCondition)
    {
        generatedSetterHelperImpl(entityCondition, ENTITYCONDITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entity-condition" element
     */
    public com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition addNewEntityCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition target = null;
            target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition)get_store().add_element_user(ENTITYCONDITION$0);
            return target;
        }
    }
    /**
     * An XML entity-condition(@).
     *
     * This is a complex type.
     */
    public static class EntityConditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition
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
        private static final javax.xml.namespace.QName HAVINGCONDITIONLIST$4 = 
            new javax.xml.namespace.QName("", "having-condition-list");
        private static final javax.xml.namespace.QName SELECTFIELD$6 = 
            new javax.xml.namespace.QName("", "select-field");
        private static final javax.xml.namespace.QName ORDERBY$8 = 
            new javax.xml.namespace.QName("", "order-by");
        private static final javax.xml.namespace.QName LIMITRANGE$10 = 
            new javax.xml.namespace.QName("", "limit-range");
        private static final javax.xml.namespace.QName LIMITVIEW$12 = 
            new javax.xml.namespace.QName("", "limit-view");
        private static final javax.xml.namespace.QName USEITERATOR$14 = 
            new javax.xml.namespace.QName("", "use-iterator");
        private static final javax.xml.namespace.QName ENTITYNAME$16 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName USECACHE$18 = 
            new javax.xml.namespace.QName("", "use-cache");
        private static final javax.xml.namespace.QName FILTERBYDATE$20 = 
            new javax.xml.namespace.QName("", "filter-by-date");
        private static final javax.xml.namespace.QName DISTINCT$22 = 
            new javax.xml.namespace.QName("", "distinct");
        private static final javax.xml.namespace.QName DELEGATORNAME$24 = 
            new javax.xml.namespace.QName("", "delegator-name");
        private static final javax.xml.namespace.QName LIST$26 = 
            new javax.xml.namespace.QName("", "list");
        private static final javax.xml.namespace.QName RESULTSETTYPE$28 = 
            new javax.xml.namespace.QName("", "result-set-type");
        
        
        /**
         * Gets the "condition-expr" element
         */
        public com.kyt.xsd.widgettree.ConditionExprDocument.ConditionExpr getConditionExpr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.ConditionExprDocument.ConditionExpr target = null;
                target = (com.kyt.xsd.widgettree.ConditionExprDocument.ConditionExpr)get_store().find_element_user(CONDITIONEXPR$0, 0);
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
        public void setConditionExpr(com.kyt.xsd.widgettree.ConditionExprDocument.ConditionExpr conditionExpr)
        {
            generatedSetterHelperImpl(conditionExpr, CONDITIONEXPR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "condition-expr" element
         */
        public com.kyt.xsd.widgettree.ConditionExprDocument.ConditionExpr addNewConditionExpr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.ConditionExprDocument.ConditionExpr target = null;
                target = (com.kyt.xsd.widgettree.ConditionExprDocument.ConditionExpr)get_store().add_element_user(CONDITIONEXPR$0);
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
        public com.kyt.xsd.widgettree.ConditionListDocument.ConditionList getConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.ConditionListDocument.ConditionList target = null;
                target = (com.kyt.xsd.widgettree.ConditionListDocument.ConditionList)get_store().find_element_user(CONDITIONLIST$2, 0);
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
        public void setConditionList(com.kyt.xsd.widgettree.ConditionListDocument.ConditionList conditionList)
        {
            generatedSetterHelperImpl(conditionList, CONDITIONLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "condition-list" element
         */
        public com.kyt.xsd.widgettree.ConditionListDocument.ConditionList addNewConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.ConditionListDocument.ConditionList target = null;
                target = (com.kyt.xsd.widgettree.ConditionListDocument.ConditionList)get_store().add_element_user(CONDITIONLIST$2);
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
         * Gets the "having-condition-list" element
         */
        public com.kyt.xsd.widgettree.HavingConditionListDocument.HavingConditionList getHavingConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.HavingConditionListDocument.HavingConditionList target = null;
                target = (com.kyt.xsd.widgettree.HavingConditionListDocument.HavingConditionList)get_store().find_element_user(HAVINGCONDITIONLIST$4, 0);
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
                return get_store().count_elements(HAVINGCONDITIONLIST$4) != 0;
            }
        }
        
        /**
         * Sets the "having-condition-list" element
         */
        public void setHavingConditionList(com.kyt.xsd.widgettree.HavingConditionListDocument.HavingConditionList havingConditionList)
        {
            generatedSetterHelperImpl(havingConditionList, HAVINGCONDITIONLIST$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "having-condition-list" element
         */
        public com.kyt.xsd.widgettree.HavingConditionListDocument.HavingConditionList addNewHavingConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.HavingConditionListDocument.HavingConditionList target = null;
                target = (com.kyt.xsd.widgettree.HavingConditionListDocument.HavingConditionList)get_store().add_element_user(HAVINGCONDITIONLIST$4);
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
                get_store().remove_element(HAVINGCONDITIONLIST$4, 0);
            }
        }
        
        /**
         * Gets array of all "select-field" elements
         */
        public com.kyt.xsd.widgettree.SelectFieldDocument.SelectField[] getSelectFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SELECTFIELD$6, targetList);
                com.kyt.xsd.widgettree.SelectFieldDocument.SelectField[] result = new com.kyt.xsd.widgettree.SelectFieldDocument.SelectField[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "select-field" element
         */
        public com.kyt.xsd.widgettree.SelectFieldDocument.SelectField getSelectFieldArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.SelectFieldDocument.SelectField target = null;
                target = (com.kyt.xsd.widgettree.SelectFieldDocument.SelectField)get_store().find_element_user(SELECTFIELD$6, i);
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
                return get_store().count_elements(SELECTFIELD$6);
            }
        }
        
        /**
         * Sets array of all "select-field" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSelectFieldArray(com.kyt.xsd.widgettree.SelectFieldDocument.SelectField[] selectFieldArray)
        {
            check_orphaned();
            arraySetterHelper(selectFieldArray, SELECTFIELD$6);
        }
        
        /**
         * Sets ith "select-field" element
         */
        public void setSelectFieldArray(int i, com.kyt.xsd.widgettree.SelectFieldDocument.SelectField selectField)
        {
            generatedSetterHelperImpl(selectField, SELECTFIELD$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "select-field" element
         */
        public com.kyt.xsd.widgettree.SelectFieldDocument.SelectField insertNewSelectField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.SelectFieldDocument.SelectField target = null;
                target = (com.kyt.xsd.widgettree.SelectFieldDocument.SelectField)get_store().insert_element_user(SELECTFIELD$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "select-field" element
         */
        public com.kyt.xsd.widgettree.SelectFieldDocument.SelectField addNewSelectField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.SelectFieldDocument.SelectField target = null;
                target = (com.kyt.xsd.widgettree.SelectFieldDocument.SelectField)get_store().add_element_user(SELECTFIELD$6);
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
                get_store().remove_element(SELECTFIELD$6, i);
            }
        }
        
        /**
         * Gets array of all "order-by" elements
         */
        public com.kyt.xsd.widgettree.OrderByDocument.OrderBy[] getOrderByArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORDERBY$8, targetList);
                com.kyt.xsd.widgettree.OrderByDocument.OrderBy[] result = new com.kyt.xsd.widgettree.OrderByDocument.OrderBy[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "order-by" element
         */
        public com.kyt.xsd.widgettree.OrderByDocument.OrderBy getOrderByArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.OrderByDocument.OrderBy target = null;
                target = (com.kyt.xsd.widgettree.OrderByDocument.OrderBy)get_store().find_element_user(ORDERBY$8, i);
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
                return get_store().count_elements(ORDERBY$8);
            }
        }
        
        /**
         * Sets array of all "order-by" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOrderByArray(com.kyt.xsd.widgettree.OrderByDocument.OrderBy[] orderByArray)
        {
            check_orphaned();
            arraySetterHelper(orderByArray, ORDERBY$8);
        }
        
        /**
         * Sets ith "order-by" element
         */
        public void setOrderByArray(int i, com.kyt.xsd.widgettree.OrderByDocument.OrderBy orderBy)
        {
            generatedSetterHelperImpl(orderBy, ORDERBY$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "order-by" element
         */
        public com.kyt.xsd.widgettree.OrderByDocument.OrderBy insertNewOrderBy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.OrderByDocument.OrderBy target = null;
                target = (com.kyt.xsd.widgettree.OrderByDocument.OrderBy)get_store().insert_element_user(ORDERBY$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "order-by" element
         */
        public com.kyt.xsd.widgettree.OrderByDocument.OrderBy addNewOrderBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.OrderByDocument.OrderBy target = null;
                target = (com.kyt.xsd.widgettree.OrderByDocument.OrderBy)get_store().add_element_user(ORDERBY$8);
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
                get_store().remove_element(ORDERBY$8, i);
            }
        }
        
        /**
         * Gets the "limit-range" element
         */
        public com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange getLimitRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange target = null;
                target = (com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange)get_store().find_element_user(LIMITRANGE$10, 0);
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
                return get_store().count_elements(LIMITRANGE$10) != 0;
            }
        }
        
        /**
         * Sets the "limit-range" element
         */
        public void setLimitRange(com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange limitRange)
        {
            generatedSetterHelperImpl(limitRange, LIMITRANGE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "limit-range" element
         */
        public com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange addNewLimitRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange target = null;
                target = (com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange)get_store().add_element_user(LIMITRANGE$10);
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
                get_store().remove_element(LIMITRANGE$10, 0);
            }
        }
        
        /**
         * Gets the "limit-view" element
         */
        public com.kyt.xsd.widgettree.LimitViewDocument.LimitView getLimitView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.LimitViewDocument.LimitView target = null;
                target = (com.kyt.xsd.widgettree.LimitViewDocument.LimitView)get_store().find_element_user(LIMITVIEW$12, 0);
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
                return get_store().count_elements(LIMITVIEW$12) != 0;
            }
        }
        
        /**
         * Sets the "limit-view" element
         */
        public void setLimitView(com.kyt.xsd.widgettree.LimitViewDocument.LimitView limitView)
        {
            generatedSetterHelperImpl(limitView, LIMITVIEW$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "limit-view" element
         */
        public com.kyt.xsd.widgettree.LimitViewDocument.LimitView addNewLimitView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.LimitViewDocument.LimitView target = null;
                target = (com.kyt.xsd.widgettree.LimitViewDocument.LimitView)get_store().add_element_user(LIMITVIEW$12);
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
                get_store().remove_element(LIMITVIEW$12, 0);
            }
        }
        
        /**
         * Gets the "use-iterator" element
         */
        public com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator getUseIterator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator target = null;
                target = (com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator)get_store().find_element_user(USEITERATOR$14, 0);
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
                return get_store().count_elements(USEITERATOR$14) != 0;
            }
        }
        
        /**
         * Sets the "use-iterator" element
         */
        public void setUseIterator(com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator useIterator)
        {
            generatedSetterHelperImpl(useIterator, USEITERATOR$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "use-iterator" element
         */
        public com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator addNewUseIterator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator target = null;
                target = (com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator)get_store().add_element_user(USEITERATOR$14);
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
                get_store().remove_element(USEITERATOR$14, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$16);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Gets the "use-cache" attribute
         */
        public com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache.Enum getUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USECACHE$18);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "use-cache" attribute
         */
        public com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache xgetUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache target = null;
                target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache)get_store().find_attribute_user(USECACHE$18);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache)get_default_attribute_value(USECACHE$18);
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
                return get_store().find_attribute_user(USECACHE$18) != null;
            }
        }
        
        /**
         * Sets the "use-cache" attribute
         */
        public void setUseCache(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache.Enum useCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USECACHE$18);
                }
                target.setEnumValue(useCache);
            }
        }
        
        /**
         * Sets (as xml) the "use-cache" attribute
         */
        public void xsetUseCache(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache useCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache target = null;
                target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache)get_store().find_attribute_user(USECACHE$18);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache)get_store().add_attribute_user(USECACHE$18);
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
                get_store().remove_attribute(USECACHE$18);
            }
        }
        
        /**
         * Gets the "filter-by-date" attribute
         */
        public com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate.Enum getFilterByDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERBYDATE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILTERBYDATE$20);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "filter-by-date" attribute
         */
        public com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate xgetFilterByDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate target = null;
                target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate)get_store().find_attribute_user(FILTERBYDATE$20);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate)get_default_attribute_value(FILTERBYDATE$20);
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
                return get_store().find_attribute_user(FILTERBYDATE$20) != null;
            }
        }
        
        /**
         * Sets the "filter-by-date" attribute
         */
        public void setFilterByDate(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate.Enum filterByDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERBYDATE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILTERBYDATE$20);
                }
                target.setEnumValue(filterByDate);
            }
        }
        
        /**
         * Sets (as xml) the "filter-by-date" attribute
         */
        public void xsetFilterByDate(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate filterByDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate target = null;
                target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate)get_store().find_attribute_user(FILTERBYDATE$20);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate)get_store().add_attribute_user(FILTERBYDATE$20);
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
                get_store().remove_attribute(FILTERBYDATE$20);
            }
        }
        
        /**
         * Gets the "distinct" attribute
         */
        public com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct.Enum getDistinct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTINCT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DISTINCT$22);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "distinct" attribute
         */
        public com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct xgetDistinct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct target = null;
                target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct)get_store().find_attribute_user(DISTINCT$22);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct)get_default_attribute_value(DISTINCT$22);
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
                return get_store().find_attribute_user(DISTINCT$22) != null;
            }
        }
        
        /**
         * Sets the "distinct" attribute
         */
        public void setDistinct(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct.Enum distinct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTINCT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTINCT$22);
                }
                target.setEnumValue(distinct);
            }
        }
        
        /**
         * Sets (as xml) the "distinct" attribute
         */
        public void xsetDistinct(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct distinct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct target = null;
                target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct)get_store().find_attribute_user(DISTINCT$22);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct)get_store().add_attribute_user(DISTINCT$22);
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
                get_store().remove_attribute(DISTINCT$22);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELEGATORNAME$24);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELEGATORNAME$24);
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
                return get_store().find_attribute_user(DELEGATORNAME$24) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELEGATORNAME$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELEGATORNAME$24);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELEGATORNAME$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DELEGATORNAME$24);
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
                get_store().remove_attribute(DELEGATORNAME$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$26);
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
                return get_store().find_attribute_user(LIST$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIST$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIST$26);
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
                get_store().remove_attribute(LIST$26);
            }
        }
        
        /**
         * Gets the "result-set-type" attribute
         */
        public com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType.Enum getResultSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTSETTYPE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RESULTSETTYPE$28);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "result-set-type" attribute
         */
        public com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType xgetResultSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType target = null;
                target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType)get_store().find_attribute_user(RESULTSETTYPE$28);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType)get_default_attribute_value(RESULTSETTYPE$28);
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
                return get_store().find_attribute_user(RESULTSETTYPE$28) != null;
            }
        }
        
        /**
         * Sets the "result-set-type" attribute
         */
        public void setResultSetType(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType.Enum resultSetType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTSETTYPE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESULTSETTYPE$28);
                }
                target.setEnumValue(resultSetType);
            }
        }
        
        /**
         * Sets (as xml) the "result-set-type" attribute
         */
        public void xsetResultSetType(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType resultSetType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType target = null;
                target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType)get_store().find_attribute_user(RESULTSETTYPE$28);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType)get_store().add_attribute_user(RESULTSETTYPE$28);
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
                get_store().remove_attribute(RESULTSETTYPE$28);
            }
        }
        /**
         * An XML use-cache(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.EntityConditionDocument$EntityCondition$UseCache.
         */
        public static class UseCacheImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache
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
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.EntityConditionDocument$EntityCondition$FilterByDate.
         */
        public static class FilterByDateImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate
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
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.EntityConditionDocument$EntityCondition$Distinct.
         */
        public static class DistinctImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct
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
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.EntityConditionDocument$EntityCondition$ResultSetType.
         */
        public static class ResultSetTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType
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
