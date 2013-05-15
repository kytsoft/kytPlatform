/*
 * An XML document type.
 * Localname: get-related
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.GetRelatedDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one get-related(@) element.
 *
 * This is a complex type.
 */
public class GetRelatedDocumentImpl extends com.kyt.xsd.widgetscreen.impl.AllActionsDocumentImpl implements com.kyt.xsd.widgetscreen.GetRelatedDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRelatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRELATED$0 = 
        new javax.xml.namespace.QName("", "get-related");
    
    
    /**
     * Gets the "get-related" element
     */
    public com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated getGetRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated target = null;
            target = (com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated)get_store().find_element_user(GETRELATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "get-related" element
     */
    public void setGetRelated(com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated getRelated)
    {
        generatedSetterHelperImpl(getRelated, GETRELATED$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "get-related" element
     */
    public com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated addNewGetRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated target = null;
            target = (com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated)get_store().add_element_user(GETRELATED$0);
            return target;
        }
    }
    /**
     * An XML get-related(@).
     *
     * This is a complex type.
     */
    public static class GetRelatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.GetRelatedDocument.GetRelated
    {
        private static final long serialVersionUID = 1L;
        
        public GetRelatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUEFIELD$0 = 
            new javax.xml.namespace.QName("", "value-field");
        private static final javax.xml.namespace.QName RELATIONNAME$2 = 
            new javax.xml.namespace.QName("", "relation-name");
        private static final javax.xml.namespace.QName MAP$4 = 
            new javax.xml.namespace.QName("", "map");
        private static final javax.xml.namespace.QName ORDERBYLIST$6 = 
            new javax.xml.namespace.QName("", "order-by-list");
        private static final javax.xml.namespace.QName USECACHE$8 = 
            new javax.xml.namespace.QName("", "use-cache");
        private static final javax.xml.namespace.QName LIST$10 = 
            new javax.xml.namespace.QName("", "list");
        
        
        /**
         * Gets the "value-field" attribute
         */
        public java.lang.String getValueField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUEFIELD$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value-field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValueField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUEFIELD$0);
                return target;
            }
        }
        
        /**
         * Sets the "value-field" attribute
         */
        public void setValueField(java.lang.String valueField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUEFIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUEFIELD$0);
                }
                target.setStringValue(valueField);
            }
        }
        
        /**
         * Sets (as xml) the "value-field" attribute
         */
        public void xsetValueField(org.apache.xmlbeans.XmlString valueField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUEFIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUEFIELD$0);
                }
                target.set(valueField);
            }
        }
        
        /**
         * Gets the "relation-name" attribute
         */
        public java.lang.String getRelationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "relation-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRelationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATIONNAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "relation-name" attribute
         */
        public void setRelationName(java.lang.String relationName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIONNAME$2);
                }
                target.setStringValue(relationName);
            }
        }
        
        /**
         * Sets (as xml) the "relation-name" attribute
         */
        public void xsetRelationName(org.apache.xmlbeans.XmlString relationName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATIONNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELATIONNAME$2);
                }
                target.set(relationName);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAP$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAP$4);
                return target;
            }
        }
        
        /**
         * True if has "map" attribute
         */
        public boolean isSetMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MAP$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAP$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAP$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAP$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAP$4);
                }
                target.set(map);
            }
        }
        
        /**
         * Unsets the "map" attribute
         */
        public void unsetMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MAP$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDERBYLIST$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORDERBYLIST$6);
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
                return get_store().find_attribute_user(ORDERBYLIST$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDERBYLIST$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORDERBYLIST$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORDERBYLIST$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORDERBYLIST$6);
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
                get_store().remove_attribute(ORDERBYLIST$6);
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
         * Gets the "list" attribute
         */
        public java.lang.String getList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIST$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIST$10);
                }
                target.set(list);
            }
        }
    }
}
