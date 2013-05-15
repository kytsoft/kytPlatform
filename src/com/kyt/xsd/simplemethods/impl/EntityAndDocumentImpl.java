/*
 * An XML document type.
 * Localname: entity-and
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.EntityAndDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one entity-and(@) element.
 *
 * This is a complex type.
 */
public class EntityAndDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityFindOperationsDocumentImpl implements com.kyt.xsd.simplemethods.EntityAndDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityAndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYAND$0 = 
        new javax.xml.namespace.QName("", "entity-and");
    
    
    /**
     * Gets the "entity-and" element
     */
    public com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd getEntityAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd target = null;
            target = (com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd)get_store().find_element_user(ENTITYAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity-and" element
     */
    public void setEntityAnd(com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd entityAnd)
    {
        generatedSetterHelperImpl(entityAnd, ENTITYAND$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entity-and" element
     */
    public com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd addNewEntityAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd target = null;
            target = (com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd)get_store().add_element_user(ENTITYAND$0);
            return target;
        }
    }
    /**
     * An XML entity-and(@).
     *
     * This is a complex type.
     */
    public static class EntityAndImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd
    {
        private static final long serialVersionUID = 1L;
        
        public EntityAndImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELDMAP$0 = 
            new javax.xml.namespace.QName("", "field-map");
        private static final javax.xml.namespace.QName SELECTFIELD$2 = 
            new javax.xml.namespace.QName("", "select-field");
        private static final javax.xml.namespace.QName ORDERBY$4 = 
            new javax.xml.namespace.QName("", "order-by");
        private static final javax.xml.namespace.QName LIMITRANGE$6 = 
            new javax.xml.namespace.QName("", "limit-range");
        private static final javax.xml.namespace.QName LIMITVIEW$8 = 
            new javax.xml.namespace.QName("", "limit-view");
        private static final javax.xml.namespace.QName USEITERATOR$10 = 
            new javax.xml.namespace.QName("", "use-iterator");
        private static final javax.xml.namespace.QName ENTITYNAME$12 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName USECACHE$14 = 
            new javax.xml.namespace.QName("", "use-cache");
        private static final javax.xml.namespace.QName FILTERBYDATE$16 = 
            new javax.xml.namespace.QName("", "filter-by-date");
        private static final javax.xml.namespace.QName LIST$18 = 
            new javax.xml.namespace.QName("", "list");
        
        
        /**
         * Gets array of all "field-map" elements
         */
        public com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap[] getFieldMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELDMAP$0, targetList);
                com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap[] result = new com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "field-map" element
         */
        public com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap getFieldMapArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap target = null;
                target = (com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap)get_store().find_element_user(FIELDMAP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "field-map" element
         */
        public int sizeOfFieldMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDMAP$0);
            }
        }
        
        /**
         * Sets array of all "field-map" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFieldMapArray(com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap[] fieldMapArray)
        {
            check_orphaned();
            arraySetterHelper(fieldMapArray, FIELDMAP$0);
        }
        
        /**
         * Sets ith "field-map" element
         */
        public void setFieldMapArray(int i, com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap fieldMap)
        {
            generatedSetterHelperImpl(fieldMap, FIELDMAP$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field-map" element
         */
        public com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap insertNewFieldMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap target = null;
                target = (com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap)get_store().insert_element_user(FIELDMAP$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field-map" element
         */
        public com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap addNewFieldMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap target = null;
                target = (com.kyt.xsd.simplemethods.FieldMapDocument.FieldMap)get_store().add_element_user(FIELDMAP$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "field-map" element
         */
        public void removeFieldMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDMAP$0, i);
            }
        }
        
        /**
         * Gets array of all "select-field" elements
         */
        public com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField[] getSelectFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SELECTFIELD$2, targetList);
                com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField[] result = new com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "select-field" element
         */
        public com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField getSelectFieldArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField target = null;
                target = (com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField)get_store().find_element_user(SELECTFIELD$2, i);
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
                return get_store().count_elements(SELECTFIELD$2);
            }
        }
        
        /**
         * Sets array of all "select-field" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSelectFieldArray(com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField[] selectFieldArray)
        {
            check_orphaned();
            arraySetterHelper(selectFieldArray, SELECTFIELD$2);
        }
        
        /**
         * Sets ith "select-field" element
         */
        public void setSelectFieldArray(int i, com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField selectField)
        {
            generatedSetterHelperImpl(selectField, SELECTFIELD$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "select-field" element
         */
        public com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField insertNewSelectField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField target = null;
                target = (com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField)get_store().insert_element_user(SELECTFIELD$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "select-field" element
         */
        public com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField addNewSelectField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField target = null;
                target = (com.kyt.xsd.simplemethods.SelectFieldDocument.SelectField)get_store().add_element_user(SELECTFIELD$2);
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
                get_store().remove_element(SELECTFIELD$2, i);
            }
        }
        
        /**
         * Gets array of all "order-by" elements
         */
        public com.kyt.xsd.simplemethods.OrderByDocument.OrderBy[] getOrderByArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORDERBY$4, targetList);
                com.kyt.xsd.simplemethods.OrderByDocument.OrderBy[] result = new com.kyt.xsd.simplemethods.OrderByDocument.OrderBy[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "order-by" element
         */
        public com.kyt.xsd.simplemethods.OrderByDocument.OrderBy getOrderByArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.OrderByDocument.OrderBy target = null;
                target = (com.kyt.xsd.simplemethods.OrderByDocument.OrderBy)get_store().find_element_user(ORDERBY$4, i);
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
                return get_store().count_elements(ORDERBY$4);
            }
        }
        
        /**
         * Sets array of all "order-by" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOrderByArray(com.kyt.xsd.simplemethods.OrderByDocument.OrderBy[] orderByArray)
        {
            check_orphaned();
            arraySetterHelper(orderByArray, ORDERBY$4);
        }
        
        /**
         * Sets ith "order-by" element
         */
        public void setOrderByArray(int i, com.kyt.xsd.simplemethods.OrderByDocument.OrderBy orderBy)
        {
            generatedSetterHelperImpl(orderBy, ORDERBY$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "order-by" element
         */
        public com.kyt.xsd.simplemethods.OrderByDocument.OrderBy insertNewOrderBy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.OrderByDocument.OrderBy target = null;
                target = (com.kyt.xsd.simplemethods.OrderByDocument.OrderBy)get_store().insert_element_user(ORDERBY$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "order-by" element
         */
        public com.kyt.xsd.simplemethods.OrderByDocument.OrderBy addNewOrderBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.OrderByDocument.OrderBy target = null;
                target = (com.kyt.xsd.simplemethods.OrderByDocument.OrderBy)get_store().add_element_user(ORDERBY$4);
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
                get_store().remove_element(ORDERBY$4, i);
            }
        }
        
        /**
         * Gets the "limit-range" element
         */
        public com.kyt.xsd.simplemethods.LimitRangeDocument.LimitRange getLimitRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.LimitRangeDocument.LimitRange target = null;
                target = (com.kyt.xsd.simplemethods.LimitRangeDocument.LimitRange)get_store().find_element_user(LIMITRANGE$6, 0);
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
                return get_store().count_elements(LIMITRANGE$6) != 0;
            }
        }
        
        /**
         * Sets the "limit-range" element
         */
        public void setLimitRange(com.kyt.xsd.simplemethods.LimitRangeDocument.LimitRange limitRange)
        {
            generatedSetterHelperImpl(limitRange, LIMITRANGE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "limit-range" element
         */
        public com.kyt.xsd.simplemethods.LimitRangeDocument.LimitRange addNewLimitRange()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.LimitRangeDocument.LimitRange target = null;
                target = (com.kyt.xsd.simplemethods.LimitRangeDocument.LimitRange)get_store().add_element_user(LIMITRANGE$6);
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
                get_store().remove_element(LIMITRANGE$6, 0);
            }
        }
        
        /**
         * Gets the "limit-view" element
         */
        public com.kyt.xsd.simplemethods.LimitViewDocument.LimitView getLimitView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.LimitViewDocument.LimitView target = null;
                target = (com.kyt.xsd.simplemethods.LimitViewDocument.LimitView)get_store().find_element_user(LIMITVIEW$8, 0);
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
                return get_store().count_elements(LIMITVIEW$8) != 0;
            }
        }
        
        /**
         * Sets the "limit-view" element
         */
        public void setLimitView(com.kyt.xsd.simplemethods.LimitViewDocument.LimitView limitView)
        {
            generatedSetterHelperImpl(limitView, LIMITVIEW$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "limit-view" element
         */
        public com.kyt.xsd.simplemethods.LimitViewDocument.LimitView addNewLimitView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.LimitViewDocument.LimitView target = null;
                target = (com.kyt.xsd.simplemethods.LimitViewDocument.LimitView)get_store().add_element_user(LIMITVIEW$8);
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
                get_store().remove_element(LIMITVIEW$8, 0);
            }
        }
        
        /**
         * Gets the "use-iterator" element
         */
        public com.kyt.xsd.simplemethods.UseIteratorDocument.UseIterator getUseIterator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.UseIteratorDocument.UseIterator target = null;
                target = (com.kyt.xsd.simplemethods.UseIteratorDocument.UseIterator)get_store().find_element_user(USEITERATOR$10, 0);
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
                return get_store().count_elements(USEITERATOR$10) != 0;
            }
        }
        
        /**
         * Sets the "use-iterator" element
         */
        public void setUseIterator(com.kyt.xsd.simplemethods.UseIteratorDocument.UseIterator useIterator)
        {
            generatedSetterHelperImpl(useIterator, USEITERATOR$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "use-iterator" element
         */
        public com.kyt.xsd.simplemethods.UseIteratorDocument.UseIterator addNewUseIterator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.UseIteratorDocument.UseIterator target = null;
                target = (com.kyt.xsd.simplemethods.UseIteratorDocument.UseIterator)get_store().add_element_user(USEITERATOR$10);
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
                get_store().remove_element(USEITERATOR$10, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$12);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Gets the "use-cache" attribute
         */
        public java.lang.String getUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USECACHE$14);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "use-cache" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USECACHE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(USECACHE$14);
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
                return get_store().find_attribute_user(USECACHE$14) != null;
            }
        }
        
        /**
         * Sets the "use-cache" attribute
         */
        public void setUseCache(java.lang.String useCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USECACHE$14);
                }
                target.setStringValue(useCache);
            }
        }
        
        /**
         * Sets (as xml) the "use-cache" attribute
         */
        public void xsetUseCache(org.apache.xmlbeans.XmlString useCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USECACHE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USECACHE$14);
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
                get_store().remove_attribute(USECACHE$14);
            }
        }
        
        /**
         * Gets the "filter-by-date" attribute
         */
        public com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd.FilterByDate.Enum getFilterByDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERBYDATE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FILTERBYDATE$16);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd.FilterByDate.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "filter-by-date" attribute
         */
        public com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd.FilterByDate xgetFilterByDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd.FilterByDate target = null;
                target = (com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd.FilterByDate)get_store().find_attribute_user(FILTERBYDATE$16);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd.FilterByDate)get_default_attribute_value(FILTERBYDATE$16);
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
                return get_store().find_attribute_user(FILTERBYDATE$16) != null;
            }
        }
        
        /**
         * Sets the "filter-by-date" attribute
         */
        public void setFilterByDate(com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd.FilterByDate.Enum filterByDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILTERBYDATE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILTERBYDATE$16);
                }
                target.setEnumValue(filterByDate);
            }
        }
        
        /**
         * Sets (as xml) the "filter-by-date" attribute
         */
        public void xsetFilterByDate(com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd.FilterByDate filterByDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd.FilterByDate target = null;
                target = (com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd.FilterByDate)get_store().find_attribute_user(FILTERBYDATE$16);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd.FilterByDate)get_store().add_attribute_user(FILTERBYDATE$16);
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
                get_store().remove_attribute(FILTERBYDATE$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$18);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIST$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIST$18);
                }
                target.set(list);
            }
        }
        /**
         * An XML filter-by-date(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.EntityAndDocument$EntityAnd$FilterByDate.
         */
        public static class FilterByDateImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.EntityAndDocument.EntityAnd.FilterByDate
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
