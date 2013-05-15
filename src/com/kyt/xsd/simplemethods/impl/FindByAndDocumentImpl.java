/*
 * An XML document type.
 * Localname: find-by-and
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.FindByAndDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one find-by-and(@) element.
 *
 * This is a complex type.
 */
public class FindByAndDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityFindOperationsDocumentImpl implements com.kyt.xsd.simplemethods.FindByAndDocument
{
    private static final long serialVersionUID = 1L;
    
    public FindByAndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINDBYAND$0 = 
        new javax.xml.namespace.QName("", "find-by-and");
    
    
    /**
     * Gets the "find-by-and" element
     */
    public com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd getFindByAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd target = null;
            target = (com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd)get_store().find_element_user(FINDBYAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "find-by-and" element
     */
    public void setFindByAnd(com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd findByAnd)
    {
        generatedSetterHelperImpl(findByAnd, FINDBYAND$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "find-by-and" element
     */
    public com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd addNewFindByAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd target = null;
            target = (com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd)get_store().add_element_user(FINDBYAND$0);
            return target;
        }
    }
    /**
     * An XML find-by-and(@).
     *
     * This is a complex type.
     */
    public static class FindByAndImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd
    {
        private static final long serialVersionUID = 1L;
        
        public FindByAndImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYNAME$0 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName MAP$2 = 
            new javax.xml.namespace.QName("", "map");
        private static final javax.xml.namespace.QName ORDERBYLIST$4 = 
            new javax.xml.namespace.QName("", "order-by-list");
        private static final javax.xml.namespace.QName DELEGATORNAME$6 = 
            new javax.xml.namespace.QName("", "delegator-name");
        private static final javax.xml.namespace.QName USECACHE$8 = 
            new javax.xml.namespace.QName("", "use-cache");
        private static final javax.xml.namespace.QName USEITERATOR$10 = 
            new javax.xml.namespace.QName("", "use-iterator");
        private static final javax.xml.namespace.QName LIST$12 = 
            new javax.xml.namespace.QName("", "list");
        
        
        /**
         * Gets the "entity-name" attribute
         */
        public java.lang.String getEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$0);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Gets the "map" attribute
         */
        public java.lang.String getMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAP$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "map" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAP$2);
                return target;
            }
        }
        
        /**
         * Sets the "map" attribute
         */
        public void setMap(java.lang.String map)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAP$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAP$2);
                }
                target.setStringValue(map);
            }
        }
        
        /**
         * Sets (as xml) the "map" attribute
         */
        public void xsetMap(org.apache.xmlbeans.XmlString map)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAP$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAP$2);
                }
                target.set(map);
            }
        }
        
        /**
         * Gets the "order-by-list" attribute
         */
        public java.lang.String getOrderByList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDERBYLIST$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "order-by-list" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOrderByList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORDERBYLIST$4);
                return target;
            }
        }
        
        /**
         * True if has "order-by-list" attribute
         */
        public boolean isSetOrderByList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ORDERBYLIST$4) != null;
            }
        }
        
        /**
         * Sets the "order-by-list" attribute
         */
        public void setOrderByList(java.lang.String orderByList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDERBYLIST$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORDERBYLIST$4);
                }
                target.setStringValue(orderByList);
            }
        }
        
        /**
         * Sets (as xml) the "order-by-list" attribute
         */
        public void xsetOrderByList(org.apache.xmlbeans.XmlString orderByList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORDERBYLIST$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORDERBYLIST$4);
                }
                target.set(orderByList);
            }
        }
        
        /**
         * Unsets the "order-by-list" attribute
         */
        public void unsetOrderByList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ORDERBYLIST$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELEGATORNAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELEGATORNAME$6);
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
                return get_store().find_attribute_user(DELEGATORNAME$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DELEGATORNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DELEGATORNAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DELEGATORNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DELEGATORNAME$6);
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
                get_store().remove_attribute(DELEGATORNAME$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USECACHE$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USECACHE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(USECACHE$8);
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
                return get_store().find_attribute_user(USECACHE$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USECACHE$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USECACHE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USECACHE$8);
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
                get_store().remove_attribute(USECACHE$8);
            }
        }
        
        /**
         * Gets the "use-iterator" attribute
         */
        public com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator.Enum getUseIterator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEITERATOR$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEITERATOR$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "use-iterator" attribute
         */
        public com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator xgetUseIterator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator target = null;
                target = (com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator)get_store().find_attribute_user(USEITERATOR$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator)get_default_attribute_value(USEITERATOR$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "use-iterator" attribute
         */
        public boolean isSetUseIterator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USEITERATOR$10) != null;
            }
        }
        
        /**
         * Sets the "use-iterator" attribute
         */
        public void setUseIterator(com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator.Enum useIterator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEITERATOR$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEITERATOR$10);
                }
                target.setEnumValue(useIterator);
            }
        }
        
        /**
         * Sets (as xml) the "use-iterator" attribute
         */
        public void xsetUseIterator(com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator useIterator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator target = null;
                target = (com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator)get_store().find_attribute_user(USEITERATOR$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator)get_store().add_attribute_user(USEITERATOR$10);
                }
                target.set(useIterator);
            }
        }
        
        /**
         * Unsets the "use-iterator" attribute
         */
        public void unsetUseIterator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USEITERATOR$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIST$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIST$12);
                }
                target.set(list);
            }
        }
        /**
         * An XML use-iterator(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.FindByAndDocument$FindByAnd$UseIterator.
         */
        public static class UseIteratorImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator
        {
            private static final long serialVersionUID = 1L;
            
            public UseIteratorImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UseIteratorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
