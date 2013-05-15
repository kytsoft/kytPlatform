/*
 * An XML document type.
 * Localname: display-entity
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.DisplayEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one display-entity(@) element.
 *
 * This is a complex type.
 */
public class DisplayEntityDocumentImpl extends com.kyt.xsd.widgetform.impl.AllFieldsDocumentImpl implements com.kyt.xsd.widgetform.DisplayEntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisplayEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYENTITY$0 = 
        new javax.xml.namespace.QName("", "display-entity");
    
    
    /**
     * Gets the "display-entity" element
     */
    public com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity getDisplayEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity target = null;
            target = (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity)get_store().find_element_user(DISPLAYENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "display-entity" element
     */
    public void setDisplayEntity(com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity displayEntity)
    {
        generatedSetterHelperImpl(displayEntity, DISPLAYENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "display-entity" element
     */
    public com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity addNewDisplayEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity target = null;
            target = (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity)get_store().add_element_user(DISPLAYENTITY$0);
            return target;
        }
    }
    /**
     * An XML display-entity(@).
     *
     * This is a complex type.
     */
    public static class DisplayEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity
    {
        private static final long serialVersionUID = 1L;
        
        public DisplayEntityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBHYPERLINK$0 = 
            new javax.xml.namespace.QName("", "sub-hyperlink");
        private static final javax.xml.namespace.QName ENTITYNAME$2 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName KEYFIELDNAME$4 = 
            new javax.xml.namespace.QName("", "key-field-name");
        private static final javax.xml.namespace.QName DESCRIPTION$6 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName SIZE$8 = 
            new javax.xml.namespace.QName("", "size");
        private static final javax.xml.namespace.QName CACHE$10 = 
            new javax.xml.namespace.QName("", "cache");
        private static final javax.xml.namespace.QName ALSOHIDDEN$12 = 
            new javax.xml.namespace.QName("", "also-hidden");
        
        
        /**
         * Gets the "sub-hyperlink" element
         */
        public com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink getSubHyperlink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink target = null;
                target = (com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink)get_store().find_element_user(SUBHYPERLINK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "sub-hyperlink" element
         */
        public boolean isSetSubHyperlink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBHYPERLINK$0) != 0;
            }
        }
        
        /**
         * Sets the "sub-hyperlink" element
         */
        public void setSubHyperlink(com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink subHyperlink)
        {
            generatedSetterHelperImpl(subHyperlink, SUBHYPERLINK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "sub-hyperlink" element
         */
        public com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink addNewSubHyperlink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink target = null;
                target = (com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink)get_store().add_element_user(SUBHYPERLINK$0);
                return target;
            }
        }
        
        /**
         * Unsets the "sub-hyperlink" element
         */
        public void unsetSubHyperlink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBHYPERLINK$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$2);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Gets the "key-field-name" attribute
         */
        public java.lang.String getKeyFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYFIELDNAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "key-field-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetKeyFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEYFIELDNAME$4);
                return target;
            }
        }
        
        /**
         * True if has "key-field-name" attribute
         */
        public boolean isSetKeyFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(KEYFIELDNAME$4) != null;
            }
        }
        
        /**
         * Sets the "key-field-name" attribute
         */
        public void setKeyFieldName(java.lang.String keyFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYFIELDNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEYFIELDNAME$4);
                }
                target.setStringValue(keyFieldName);
            }
        }
        
        /**
         * Sets (as xml) the "key-field-name" attribute
         */
        public void xsetKeyFieldName(org.apache.xmlbeans.XmlString keyFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEYFIELDNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEYFIELDNAME$4);
                }
                target.set(keyFieldName);
            }
        }
        
        /**
         * Unsets the "key-field-name" attribute
         */
        public void unsetKeyFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(KEYFIELDNAME$4);
            }
        }
        
        /**
         * Gets the "description" attribute
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DESCRIPTION$6);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(DESCRIPTION$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "description" attribute
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESCRIPTION$6) != null;
            }
        }
        
        /**
         * Sets the "description" attribute
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$6);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" attribute
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$6);
                }
                target.set(description);
            }
        }
        
        /**
         * Unsets the "description" attribute
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESCRIPTION$6);
            }
        }
        
        /**
         * Gets the "size" attribute
         */
        public java.math.BigInteger getSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "size" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SIZE$8);
                return target;
            }
        }
        
        /**
         * True if has "size" attribute
         */
        public boolean isSetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SIZE$8) != null;
            }
        }
        
        /**
         * Sets the "size" attribute
         */
        public void setSize(java.math.BigInteger size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$8);
                }
                target.setBigIntegerValue(size);
            }
        }
        
        /**
         * Sets (as xml) the "size" attribute
         */
        public void xsetSize(org.apache.xmlbeans.XmlInteger size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SIZE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SIZE$8);
                }
                target.set(size);
            }
        }
        
        /**
         * Unsets the "size" attribute
         */
        public void unsetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SIZE$8);
            }
        }
        
        /**
         * Gets the "cache" attribute
         */
        public com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache.Enum getCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CACHE$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "cache" attribute
         */
        public com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache xgetCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache target = null;
                target = (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache)get_store().find_attribute_user(CACHE$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache)get_default_attribute_value(CACHE$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "cache" attribute
         */
        public boolean isSetCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CACHE$10) != null;
            }
        }
        
        /**
         * Sets the "cache" attribute
         */
        public void setCache(com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache.Enum cache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CACHE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CACHE$10);
                }
                target.setEnumValue(cache);
            }
        }
        
        /**
         * Sets (as xml) the "cache" attribute
         */
        public void xsetCache(com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache cache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache target = null;
                target = (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache)get_store().find_attribute_user(CACHE$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache)get_store().add_attribute_user(CACHE$10);
                }
                target.set(cache);
            }
        }
        
        /**
         * Unsets the "cache" attribute
         */
        public void unsetCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CACHE$10);
            }
        }
        
        /**
         * Gets the "also-hidden" attribute
         */
        public com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden.Enum getAlsoHidden()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALSOHIDDEN$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALSOHIDDEN$12);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "also-hidden" attribute
         */
        public com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden xgetAlsoHidden()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden target = null;
                target = (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden)get_store().find_attribute_user(ALSOHIDDEN$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden)get_default_attribute_value(ALSOHIDDEN$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "also-hidden" attribute
         */
        public boolean isSetAlsoHidden()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ALSOHIDDEN$12) != null;
            }
        }
        
        /**
         * Sets the "also-hidden" attribute
         */
        public void setAlsoHidden(com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden.Enum alsoHidden)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALSOHIDDEN$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALSOHIDDEN$12);
                }
                target.setEnumValue(alsoHidden);
            }
        }
        
        /**
         * Sets (as xml) the "also-hidden" attribute
         */
        public void xsetAlsoHidden(com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden alsoHidden)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden target = null;
                target = (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden)get_store().find_attribute_user(ALSOHIDDEN$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden)get_store().add_attribute_user(ALSOHIDDEN$12);
                }
                target.set(alsoHidden);
            }
        }
        
        /**
         * Unsets the "also-hidden" attribute
         */
        public void unsetAlsoHidden()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ALSOHIDDEN$12);
            }
        }
        /**
         * An XML cache(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DisplayEntityDocument$DisplayEntity$Cache.
         */
        public static class CacheImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.Cache
        {
            private static final long serialVersionUID = 1L;
            
            public CacheImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected CacheImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML also-hidden(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DisplayEntityDocument$DisplayEntity$AlsoHidden.
         */
        public static class AlsoHiddenImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.DisplayEntityDocument.DisplayEntity.AlsoHidden
        {
            private static final long serialVersionUID = 1L;
            
            public AlsoHiddenImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AlsoHiddenImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
