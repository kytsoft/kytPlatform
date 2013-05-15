/*
 * An XML document type.
 * Localname: refresh-value
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.RefreshValueDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one refresh-value(@) element.
 *
 * This is a complex type.
 */
public class RefreshValueDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityValueOperationsDocumentImpl implements com.kyt.xsd.simplemethods.RefreshValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public RefreshValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFRESHVALUE$0 = 
        new javax.xml.namespace.QName("", "refresh-value");
    
    
    /**
     * Gets the "refresh-value" element
     */
    public com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue getRefreshValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue target = null;
            target = (com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue)get_store().find_element_user(REFRESHVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "refresh-value" element
     */
    public void setRefreshValue(com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue refreshValue)
    {
        generatedSetterHelperImpl(refreshValue, REFRESHVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "refresh-value" element
     */
    public com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue addNewRefreshValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue target = null;
            target = (com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue)get_store().add_element_user(REFRESHVALUE$0);
            return target;
        }
    }
    /**
     * An XML refresh-value(@).
     *
     * This is a complex type.
     */
    public static class RefreshValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue
    {
        private static final long serialVersionUID = 1L;
        
        public RefreshValueImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUEFIELD$0 = 
            new javax.xml.namespace.QName("", "value-field");
        private static final javax.xml.namespace.QName DOCACHECLEAR$2 = 
            new javax.xml.namespace.QName("", "do-cache-clear");
        
        
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
         * Gets the "do-cache-clear" attribute
         */
        public com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue.DoCacheClear.Enum getDoCacheClear()
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
                return (com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue.DoCacheClear.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "do-cache-clear" attribute
         */
        public com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue.DoCacheClear xgetDoCacheClear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue.DoCacheClear target = null;
                target = (com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue.DoCacheClear)get_store().find_attribute_user(DOCACHECLEAR$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue.DoCacheClear)get_default_attribute_value(DOCACHECLEAR$2);
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
        public void setDoCacheClear(com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue.DoCacheClear.Enum doCacheClear)
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
        public void xsetDoCacheClear(com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue.DoCacheClear doCacheClear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue.DoCacheClear target = null;
                target = (com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue.DoCacheClear)get_store().find_attribute_user(DOCACHECLEAR$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue.DoCacheClear)get_store().add_attribute_user(DOCACHECLEAR$2);
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
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.RefreshValueDocument$RefreshValue$DoCacheClear.
         */
        public static class DoCacheClearImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.RefreshValueDocument.RefreshValue.DoCacheClear
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
