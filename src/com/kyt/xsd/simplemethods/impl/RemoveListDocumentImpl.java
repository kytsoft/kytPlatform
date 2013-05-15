/*
 * An XML document type.
 * Localname: remove-list
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.RemoveListDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one remove-list(@) element.
 *
 * This is a complex type.
 */
public class RemoveListDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityListOperationsDocumentImpl implements com.kyt.xsd.simplemethods.RemoveListDocument
{
    private static final long serialVersionUID = 1L;
    
    public RemoveListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOVELIST$0 = 
        new javax.xml.namespace.QName("", "remove-list");
    
    
    /**
     * Gets the "remove-list" element
     */
    public com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList getRemoveList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList target = null;
            target = (com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList)get_store().find_element_user(REMOVELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "remove-list" element
     */
    public void setRemoveList(com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList removeList)
    {
        generatedSetterHelperImpl(removeList, REMOVELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "remove-list" element
     */
    public com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList addNewRemoveList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList target = null;
            target = (com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList)get_store().add_element_user(REMOVELIST$0);
            return target;
        }
    }
    /**
     * An XML remove-list(@).
     *
     * This is a complex type.
     */
    public static class RemoveListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList
    {
        private static final long serialVersionUID = 1L;
        
        public RemoveListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LIST$0 = 
            new javax.xml.namespace.QName("", "list");
        private static final javax.xml.namespace.QName DOCACHECLEAR$2 = 
            new javax.xml.namespace.QName("", "do-cache-clear");
        
        
        /**
         * Gets the "list" attribute
         */
        public java.lang.String getList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIST$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIST$0);
                }
                target.set(list);
            }
        }
        
        /**
         * Gets the "do-cache-clear" attribute
         */
        public com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList.DoCacheClear.Enum getDoCacheClear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCACHECLEAR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DOCACHECLEAR$2);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList.DoCacheClear.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "do-cache-clear" attribute
         */
        public com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList.DoCacheClear xgetDoCacheClear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList.DoCacheClear target = null;
                target = (com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList.DoCacheClear)get_store().find_attribute_user(DOCACHECLEAR$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList.DoCacheClear)get_default_attribute_value(DOCACHECLEAR$2);
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
                return get_store().find_attribute_user(DOCACHECLEAR$2) != null;
            }
        }
        
        /**
         * Sets the "do-cache-clear" attribute
         */
        public void setDoCacheClear(com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList.DoCacheClear.Enum doCacheClear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOCACHECLEAR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOCACHECLEAR$2);
                }
                target.setEnumValue(doCacheClear);
            }
        }
        
        /**
         * Sets (as xml) the "do-cache-clear" attribute
         */
        public void xsetDoCacheClear(com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList.DoCacheClear doCacheClear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList.DoCacheClear target = null;
                target = (com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList.DoCacheClear)get_store().find_attribute_user(DOCACHECLEAR$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList.DoCacheClear)get_store().add_attribute_user(DOCACHECLEAR$2);
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
                get_store().remove_attribute(DOCACHECLEAR$2);
            }
        }
        /**
         * An XML do-cache-clear(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.RemoveListDocument$RemoveList$DoCacheClear.
         */
        public static class DoCacheClearImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.RemoveListDocument.RemoveList.DoCacheClear
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
