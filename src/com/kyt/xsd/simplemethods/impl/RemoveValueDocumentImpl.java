/*
 * An XML document type.
 * Localname: remove-value
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.RemoveValueDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one remove-value(@) element.
 *
 * This is a complex type.
 */
public class RemoveValueDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityValueOperationsDocumentImpl implements com.kyt.xsd.simplemethods.RemoveValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public RemoveValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOVEVALUE$0 = 
        new javax.xml.namespace.QName("", "remove-value");
    
    
    /**
     * Gets the "remove-value" element
     */
    public com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue getRemoveValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue target = null;
            target = (com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue)get_store().find_element_user(REMOVEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "remove-value" element
     */
    public void setRemoveValue(com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue removeValue)
    {
        generatedSetterHelperImpl(removeValue, REMOVEVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "remove-value" element
     */
    public com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue addNewRemoveValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue target = null;
            target = (com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue)get_store().add_element_user(REMOVEVALUE$0);
            return target;
        }
    }
    /**
     * An XML remove-value(@).
     *
     * This is a complex type.
     */
    public static class RemoveValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue
    {
        private static final long serialVersionUID = 1L;
        
        public RemoveValueImpl(org.apache.xmlbeans.SchemaType sType)
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
        public com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue.DoCacheClear.Enum getDoCacheClear()
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
                return (com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue.DoCacheClear.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "do-cache-clear" attribute
         */
        public com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue.DoCacheClear xgetDoCacheClear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue.DoCacheClear target = null;
                target = (com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue.DoCacheClear)get_store().find_attribute_user(DOCACHECLEAR$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue.DoCacheClear)get_default_attribute_value(DOCACHECLEAR$2);
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
        public void setDoCacheClear(com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue.DoCacheClear.Enum doCacheClear)
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
        public void xsetDoCacheClear(com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue.DoCacheClear doCacheClear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue.DoCacheClear target = null;
                target = (com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue.DoCacheClear)get_store().find_attribute_user(DOCACHECLEAR$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue.DoCacheClear)get_store().add_attribute_user(DOCACHECLEAR$2);
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
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.RemoveValueDocument$RemoveValue$DoCacheClear.
         */
        public static class DoCacheClearImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.RemoveValueDocument.RemoveValue.DoCacheClear
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
