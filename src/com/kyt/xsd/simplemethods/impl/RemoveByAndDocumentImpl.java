/*
 * An XML document type.
 * Localname: remove-by-and
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.RemoveByAndDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one remove-by-and(@) element.
 *
 * This is a complex type.
 */
public class RemoveByAndDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityValueOperationsDocumentImpl implements com.kyt.xsd.simplemethods.RemoveByAndDocument
{
    private static final long serialVersionUID = 1L;
    
    public RemoveByAndDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOVEBYAND$0 = 
        new javax.xml.namespace.QName("", "remove-by-and");
    
    
    /**
     * Gets the "remove-by-and" element
     */
    public com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd getRemoveByAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd target = null;
            target = (com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd)get_store().find_element_user(REMOVEBYAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "remove-by-and" element
     */
    public void setRemoveByAnd(com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd removeByAnd)
    {
        generatedSetterHelperImpl(removeByAnd, REMOVEBYAND$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "remove-by-and" element
     */
    public com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd addNewRemoveByAnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd target = null;
            target = (com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd)get_store().add_element_user(REMOVEBYAND$0);
            return target;
        }
    }
    /**
     * An XML remove-by-and(@).
     *
     * This is a complex type.
     */
    public static class RemoveByAndImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd
    {
        private static final long serialVersionUID = 1L;
        
        public RemoveByAndImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYNAME$0 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName MAP$2 = 
            new javax.xml.namespace.QName("", "map");
        private static final javax.xml.namespace.QName DOCACHECLEAR$4 = 
            new javax.xml.namespace.QName("", "do-cache-clear");
        
        
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
         * Gets the "do-cache-clear" attribute
         */
        public com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd.DoCacheClear.Enum getDoCacheClear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCACHECLEAR$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DOCACHECLEAR$4);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd.DoCacheClear.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "do-cache-clear" attribute
         */
        public com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd.DoCacheClear xgetDoCacheClear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd.DoCacheClear target = null;
                target = (com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd.DoCacheClear)get_store().find_attribute_user(DOCACHECLEAR$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd.DoCacheClear)get_default_attribute_value(DOCACHECLEAR$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "do-cache-clear" attribute
         */
        public boolean isSetDoCacheClear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DOCACHECLEAR$4) != null;
            }
        }
        
        /**
         * Sets the "do-cache-clear" attribute
         */
        public void setDoCacheClear(com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd.DoCacheClear.Enum doCacheClear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCACHECLEAR$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOCACHECLEAR$4);
                }
                target.setEnumValue(doCacheClear);
            }
        }
        
        /**
         * Sets (as xml) the "do-cache-clear" attribute
         */
        public void xsetDoCacheClear(com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd.DoCacheClear doCacheClear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd.DoCacheClear target = null;
                target = (com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd.DoCacheClear)get_store().find_attribute_user(DOCACHECLEAR$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd.DoCacheClear)get_store().add_attribute_user(DOCACHECLEAR$4);
                }
                target.set(doCacheClear);
            }
        }
        
        /**
         * Unsets the "do-cache-clear" attribute
         */
        public void unsetDoCacheClear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DOCACHECLEAR$4);
            }
        }
        /**
         * An XML do-cache-clear(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.RemoveByAndDocument$RemoveByAnd$DoCacheClear.
         */
        public static class DoCacheClearImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.RemoveByAndDocument.RemoveByAnd.DoCacheClear
        {
            private static final long serialVersionUID = 1L;
            
            public DoCacheClearImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DoCacheClearImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
