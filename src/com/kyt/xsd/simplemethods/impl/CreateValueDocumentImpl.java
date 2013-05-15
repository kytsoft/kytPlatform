/*
 * An XML document type.
 * Localname: create-value
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.CreateValueDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one create-value(@) element.
 *
 * This is a complex type.
 */
public class CreateValueDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityValueOperationsDocumentImpl implements com.kyt.xsd.simplemethods.CreateValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEVALUE$0 = 
        new javax.xml.namespace.QName("", "create-value");
    
    
    /**
     * Gets the "create-value" element
     */
    public com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue getCreateValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue target = null;
            target = (com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue)get_store().find_element_user(CREATEVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "create-value" element
     */
    public void setCreateValue(com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue createValue)
    {
        generatedSetterHelperImpl(createValue, CREATEVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "create-value" element
     */
    public com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue addNewCreateValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue target = null;
            target = (com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue)get_store().add_element_user(CREATEVALUE$0);
            return target;
        }
    }
    /**
     * An XML create-value(@).
     *
     * This is a complex type.
     */
    public static class CreateValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue
    {
        private static final long serialVersionUID = 1L;
        
        public CreateValueImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUEFIELD$0 = 
            new javax.xml.namespace.QName("", "value-field");
        private static final javax.xml.namespace.QName DOCACHECLEAR$2 = 
            new javax.xml.namespace.QName("", "do-cache-clear");
        private static final javax.xml.namespace.QName ORSTORE$4 = 
            new javax.xml.namespace.QName("", "or-store");
        
        
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
        public com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.DoCacheClear.Enum getDoCacheClear()
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
                return (com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.DoCacheClear.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "do-cache-clear" attribute
         */
        public com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.DoCacheClear xgetDoCacheClear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.DoCacheClear target = null;
                target = (com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.DoCacheClear)get_store().find_attribute_user(DOCACHECLEAR$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.DoCacheClear)get_default_attribute_value(DOCACHECLEAR$2);
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
        public void setDoCacheClear(com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.DoCacheClear.Enum doCacheClear)
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
        public void xsetDoCacheClear(com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.DoCacheClear doCacheClear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.DoCacheClear target = null;
                target = (com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.DoCacheClear)get_store().find_attribute_user(DOCACHECLEAR$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.DoCacheClear)get_store().add_attribute_user(DOCACHECLEAR$2);
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
         * Gets the "or-store" attribute
         */
        public com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.OrStore.Enum getOrStore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORSTORE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ORSTORE$4);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.OrStore.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "or-store" attribute
         */
        public com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.OrStore xgetOrStore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.OrStore target = null;
                target = (com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.OrStore)get_store().find_attribute_user(ORSTORE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.OrStore)get_default_attribute_value(ORSTORE$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "or-store" attribute
         */
        public boolean isSetOrStore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ORSTORE$4) != null;
            }
        }
        
        /**
         * Sets the "or-store" attribute
         */
        public void setOrStore(com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.OrStore.Enum orStore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORSTORE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORSTORE$4);
                }
                target.setEnumValue(orStore);
            }
        }
        
        /**
         * Sets (as xml) the "or-store" attribute
         */
        public void xsetOrStore(com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.OrStore orStore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.OrStore target = null;
                target = (com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.OrStore)get_store().find_attribute_user(ORSTORE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.OrStore)get_store().add_attribute_user(ORSTORE$4);
                }
                target.set(orStore);
            }
        }
        
        /**
         * Unsets the "or-store" attribute
         */
        public void unsetOrStore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ORSTORE$4);
            }
        }
        /**
         * An XML do-cache-clear(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.CreateValueDocument$CreateValue$DoCacheClear.
         */
        public static class DoCacheClearImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.DoCacheClear
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
        /**
         * An XML or-store(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.CreateValueDocument$CreateValue$OrStore.
         */
        public static class OrStoreImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.CreateValueDocument.CreateValue.OrStore
        {
            private static final long serialVersionUID = 1L;
            
            public OrStoreImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected OrStoreImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
