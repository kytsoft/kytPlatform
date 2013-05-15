/*
 * An XML document type.
 * Localname: find-by-primary-key
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.FindByPrimaryKeyDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one find-by-primary-key(@) element.
 *
 * This is a complex type.
 */
public class FindByPrimaryKeyDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityFindOperationsDocumentImpl implements com.kyt.xsd.simplemethods.FindByPrimaryKeyDocument
{
    private static final long serialVersionUID = 1L;
    
    public FindByPrimaryKeyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FINDBYPRIMARYKEY$0 = 
        new javax.xml.namespace.QName("", "find-by-primary-key");
    
    
    /**
     * Gets the "find-by-primary-key" element
     */
    public com.kyt.xsd.simplemethods.FindByPrimaryKeyDocument.FindByPrimaryKey getFindByPrimaryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.FindByPrimaryKeyDocument.FindByPrimaryKey target = null;
            target = (com.kyt.xsd.simplemethods.FindByPrimaryKeyDocument.FindByPrimaryKey)get_store().find_element_user(FINDBYPRIMARYKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "find-by-primary-key" element
     */
    public void setFindByPrimaryKey(com.kyt.xsd.simplemethods.FindByPrimaryKeyDocument.FindByPrimaryKey findByPrimaryKey)
    {
        generatedSetterHelperImpl(findByPrimaryKey, FINDBYPRIMARYKEY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "find-by-primary-key" element
     */
    public com.kyt.xsd.simplemethods.FindByPrimaryKeyDocument.FindByPrimaryKey addNewFindByPrimaryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.FindByPrimaryKeyDocument.FindByPrimaryKey target = null;
            target = (com.kyt.xsd.simplemethods.FindByPrimaryKeyDocument.FindByPrimaryKey)get_store().add_element_user(FINDBYPRIMARYKEY$0);
            return target;
        }
    }
    /**
     * An XML find-by-primary-key(@).
     *
     * This is a complex type.
     */
    public static class FindByPrimaryKeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.FindByPrimaryKeyDocument.FindByPrimaryKey
    {
        private static final long serialVersionUID = 1L;
        
        public FindByPrimaryKeyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYNAME$0 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName MAP$2 = 
            new javax.xml.namespace.QName("", "map");
        private static final javax.xml.namespace.QName VALUEFIELD$4 = 
            new javax.xml.namespace.QName("", "value-field");
        private static final javax.xml.namespace.QName USECACHE$6 = 
            new javax.xml.namespace.QName("", "use-cache");
        private static final javax.xml.namespace.QName FIELDSTOSELECTLIST$8 = 
            new javax.xml.namespace.QName("", "fields-to-select-list");
        private static final javax.xml.namespace.QName DELEGATORNAME$10 = 
            new javax.xml.namespace.QName("", "delegator-name");
        
        
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
         * True if has "entity-name" attribute
         */
        public boolean isSetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENTITYNAME$0) != null;
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
         * Unsets the "entity-name" attribute
         */
        public void unsetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENTITYNAME$0);
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
         * Gets the "value-field" attribute
         */
        public java.lang.String getValueField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUEFIELD$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUEFIELD$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUEFIELD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUEFIELD$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUEFIELD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUEFIELD$4);
                }
                target.set(valueField);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USECACHE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USECACHE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(USECACHE$6);
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
                return get_store().find_attribute_user(USECACHE$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USECACHE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USECACHE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USECACHE$6);
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
                get_store().remove_attribute(USECACHE$6);
            }
        }
        
        /**
         * Gets the "fields-to-select-list" attribute
         */
        public java.lang.String getFieldsToSelectList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDSTOSELECTLIST$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fields-to-select-list" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFieldsToSelectList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDSTOSELECTLIST$8);
                return target;
            }
        }
        
        /**
         * True if has "fields-to-select-list" attribute
         */
        public boolean isSetFieldsToSelectList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FIELDSTOSELECTLIST$8) != null;
            }
        }
        
        /**
         * Sets the "fields-to-select-list" attribute
         */
        public void setFieldsToSelectList(java.lang.String fieldsToSelectList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDSTOSELECTLIST$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDSTOSELECTLIST$8);
                }
                target.setStringValue(fieldsToSelectList);
            }
        }
        
        /**
         * Sets (as xml) the "fields-to-select-list" attribute
         */
        public void xsetFieldsToSelectList(org.apache.xmlbeans.XmlString fieldsToSelectList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDSTOSELECTLIST$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDSTOSELECTLIST$8);
                }
                target.set(fieldsToSelectList);
            }
        }
        
        /**
         * Unsets the "fields-to-select-list" attribute
         */
        public void unsetFieldsToSelectList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FIELDSTOSELECTLIST$8);
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
    }
}
