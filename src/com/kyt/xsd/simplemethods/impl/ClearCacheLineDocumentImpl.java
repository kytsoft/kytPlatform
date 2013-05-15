/*
 * An XML document type.
 * Localname: clear-cache-line
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.ClearCacheLineDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one clear-cache-line(@) element.
 *
 * This is a complex type.
 */
public class ClearCacheLineDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityValueOperationsDocumentImpl implements com.kyt.xsd.simplemethods.ClearCacheLineDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClearCacheLineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLEARCACHELINE$0 = 
        new javax.xml.namespace.QName("", "clear-cache-line");
    
    
    /**
     * Gets the "clear-cache-line" element
     */
    public com.kyt.xsd.simplemethods.ClearCacheLineDocument.ClearCacheLine getClearCacheLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ClearCacheLineDocument.ClearCacheLine target = null;
            target = (com.kyt.xsd.simplemethods.ClearCacheLineDocument.ClearCacheLine)get_store().find_element_user(CLEARCACHELINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clear-cache-line" element
     */
    public void setClearCacheLine(com.kyt.xsd.simplemethods.ClearCacheLineDocument.ClearCacheLine clearCacheLine)
    {
        generatedSetterHelperImpl(clearCacheLine, CLEARCACHELINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "clear-cache-line" element
     */
    public com.kyt.xsd.simplemethods.ClearCacheLineDocument.ClearCacheLine addNewClearCacheLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ClearCacheLineDocument.ClearCacheLine target = null;
            target = (com.kyt.xsd.simplemethods.ClearCacheLineDocument.ClearCacheLine)get_store().add_element_user(CLEARCACHELINE$0);
            return target;
        }
    }
    /**
     * An XML clear-cache-line(@).
     *
     * This is a complex type.
     */
    public static class ClearCacheLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.ClearCacheLineDocument.ClearCacheLine
    {
        private static final long serialVersionUID = 1L;
        
        public ClearCacheLineImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYNAME$0 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName MAP$2 = 
            new javax.xml.namespace.QName("", "map");
        
        
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
         * True if has "map" attribute
         */
        public boolean isSetMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MAP$2) != null;
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
         * Unsets the "map" attribute
         */
        public void unsetMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MAP$2);
            }
        }
    }
}
