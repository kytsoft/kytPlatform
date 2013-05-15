/*
 * An XML document type.
 * Localname: entity-condition
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.EntityConditionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel.impl;
/**
 * A document containing one entity-condition(@) element.
 *
 * This is a complex type.
 */
public class EntityConditionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.EntityConditionDocument
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
    public com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition getEntityCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition target = null;
            target = (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition)get_store().find_element_user(ENTITYCONDITION$0, 0);
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
    public void setEntityCondition(com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition entityCondition)
    {
        generatedSetterHelperImpl(entityCondition, ENTITYCONDITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entity-condition" element
     */
    public com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition addNewEntityCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition target = null;
            target = (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition)get_store().add_element_user(ENTITYCONDITION$0);
            return target;
        }
    }
    /**
     * An XML entity-condition(@).
     *
     * This is a complex type.
     */
    public static class EntityConditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition
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
        private static final javax.xml.namespace.QName ORDERBY$6 = 
            new javax.xml.namespace.QName("", "order-by");
        private static final javax.xml.namespace.QName FILTERBYDATE$8 = 
            new javax.xml.namespace.QName("", "filter-by-date");
        private static final javax.xml.namespace.QName DISTINCT$10 = 
            new javax.xml.namespace.QName("", "distinct");
        
        
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
        public com.kyt.xsd.entitymodel.ConditionListDocument.ConditionList getConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ConditionListDocument.ConditionList target = null;
                target = (com.kyt.xsd.entitymodel.ConditionListDocument.ConditionList)get_store().find_element_user(CONDITIONLIST$2, 0);
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
        public void setConditionList(com.kyt.xsd.entitymodel.ConditionListDocument.ConditionList conditionList)
        {
            generatedSetterHelperImpl(conditionList, CONDITIONLIST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "condition-list" element
         */
        public com.kyt.xsd.entitymodel.ConditionListDocument.ConditionList addNewConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ConditionListDocument.ConditionList target = null;
                target = (com.kyt.xsd.entitymodel.ConditionListDocument.ConditionList)get_store().add_element_user(CONDITIONLIST$2);
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
        public com.kyt.xsd.entitymodel.HavingConditionListDocument.HavingConditionList getHavingConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.HavingConditionListDocument.HavingConditionList target = null;
                target = (com.kyt.xsd.entitymodel.HavingConditionListDocument.HavingConditionList)get_store().find_element_user(HAVINGCONDITIONLIST$4, 0);
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
        public void setHavingConditionList(com.kyt.xsd.entitymodel.HavingConditionListDocument.HavingConditionList havingConditionList)
        {
            generatedSetterHelperImpl(havingConditionList, HAVINGCONDITIONLIST$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "having-condition-list" element
         */
        public com.kyt.xsd.entitymodel.HavingConditionListDocument.HavingConditionList addNewHavingConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.HavingConditionListDocument.HavingConditionList target = null;
                target = (com.kyt.xsd.entitymodel.HavingConditionListDocument.HavingConditionList)get_store().add_element_user(HAVINGCONDITIONLIST$4);
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
         * Gets array of all "order-by" elements
         */
        public com.kyt.xsd.entitymodel.OrderByDocument.OrderBy[] getOrderByArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORDERBY$6, targetList);
                com.kyt.xsd.entitymodel.OrderByDocument.OrderBy[] result = new com.kyt.xsd.entitymodel.OrderByDocument.OrderBy[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "order-by" element
         */
        public com.kyt.xsd.entitymodel.OrderByDocument.OrderBy getOrderByArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.OrderByDocument.OrderBy target = null;
                target = (com.kyt.xsd.entitymodel.OrderByDocument.OrderBy)get_store().find_element_user(ORDERBY$6, i);
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
                return get_store().count_elements(ORDERBY$6);
            }
        }
        
        /**
         * Sets array of all "order-by" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOrderByArray(com.kyt.xsd.entitymodel.OrderByDocument.OrderBy[] orderByArray)
        {
            check_orphaned();
            arraySetterHelper(orderByArray, ORDERBY$6);
        }
        
        /**
         * Sets ith "order-by" element
         */
        public void setOrderByArray(int i, com.kyt.xsd.entitymodel.OrderByDocument.OrderBy orderBy)
        {
            generatedSetterHelperImpl(orderBy, ORDERBY$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "order-by" element
         */
        public com.kyt.xsd.entitymodel.OrderByDocument.OrderBy insertNewOrderBy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.OrderByDocument.OrderBy target = null;
                target = (com.kyt.xsd.entitymodel.OrderByDocument.OrderBy)get_store().insert_element_user(ORDERBY$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "order-by" element
         */
        public com.kyt.xsd.entitymodel.OrderByDocument.OrderBy addNewOrderBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.OrderByDocument.OrderBy target = null;
                target = (com.kyt.xsd.entitymodel.OrderByDocument.OrderBy)get_store().add_element_user(ORDERBY$6);
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
                get_store().remove_element(ORDERBY$6, i);
            }
        }
        
        /**
         * Gets the "filter-by-date" attribute
         */
        public com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate.Enum getFilterByDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERBYDATE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILTERBYDATE$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "filter-by-date" attribute
         */
        public com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate xgetFilterByDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate target = null;
                target = (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate)get_store().find_attribute_user(FILTERBYDATE$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate)get_default_attribute_value(FILTERBYDATE$8);
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
                return get_store().find_attribute_user(FILTERBYDATE$8) != null;
            }
        }
        
        /**
         * Sets the "filter-by-date" attribute
         */
        public void setFilterByDate(com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate.Enum filterByDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERBYDATE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILTERBYDATE$8);
                }
                target.setEnumValue(filterByDate);
            }
        }
        
        /**
         * Sets (as xml) the "filter-by-date" attribute
         */
        public void xsetFilterByDate(com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate filterByDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate target = null;
                target = (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate)get_store().find_attribute_user(FILTERBYDATE$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate)get_store().add_attribute_user(FILTERBYDATE$8);
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
                get_store().remove_attribute(FILTERBYDATE$8);
            }
        }
        
        /**
         * Gets the "distinct" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean.Enum getDistinct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTINCT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DISTINCT$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entitymodel.Boolean.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "distinct" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean xgetDistinct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(DISTINCT$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_default_attribute_value(DISTINCT$10);
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
                return get_store().find_attribute_user(DISTINCT$10) != null;
            }
        }
        
        /**
         * Sets the "distinct" attribute
         */
        public void setDistinct(com.kyt.xsd.entitymodel.Boolean.Enum distinct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTINCT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTINCT$10);
                }
                target.setEnumValue(distinct);
            }
        }
        
        /**
         * Sets (as xml) the "distinct" attribute
         */
        public void xsetDistinct(com.kyt.xsd.entitymodel.Boolean distinct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(DISTINCT$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_store().add_attribute_user(DISTINCT$10);
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
                get_store().remove_attribute(DISTINCT$10);
            }
        }
        /**
         * An XML filter-by-date(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entitymodel.EntityConditionDocument$EntityCondition$FilterByDate.
         */
        public static class FilterByDateImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate
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
    }
}
