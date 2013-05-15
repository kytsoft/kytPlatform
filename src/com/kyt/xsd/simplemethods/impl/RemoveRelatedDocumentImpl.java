/*
 * An XML document type.
 * Localname: remove-related
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.RemoveRelatedDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one remove-related(@) element.
 *
 * This is a complex type.
 */
public class RemoveRelatedDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityValueOperationsDocumentImpl implements com.kyt.xsd.simplemethods.RemoveRelatedDocument
{
    private static final long serialVersionUID = 1L;
    
    public RemoveRelatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOVERELATED$0 = 
        new javax.xml.namespace.QName("", "remove-related");
    
    
    /**
     * Gets the "remove-related" element
     */
    public com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated getRemoveRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated target = null;
            target = (com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated)get_store().find_element_user(REMOVERELATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "remove-related" element
     */
    public void setRemoveRelated(com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated removeRelated)
    {
        generatedSetterHelperImpl(removeRelated, REMOVERELATED$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "remove-related" element
     */
    public com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated addNewRemoveRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated target = null;
            target = (com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated)get_store().add_element_user(REMOVERELATED$0);
            return target;
        }
    }
    /**
     * An XML remove-related(@).
     *
     * This is a complex type.
     */
    public static class RemoveRelatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated
    {
        private static final long serialVersionUID = 1L;
        
        public RemoveRelatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUEFIELD$0 = 
            new javax.xml.namespace.QName("", "value-field");
        private static final javax.xml.namespace.QName RELATIONNAME$2 = 
            new javax.xml.namespace.QName("", "relation-name");
        private static final javax.xml.namespace.QName DOCACHECLEAR$4 = 
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
         * Gets the "do-cache-clear" attribute
         */
        public com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated.DoCacheClear.Enum getDoCacheClear()
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
                return (com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated.DoCacheClear.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "do-cache-clear" attribute
         */
        public com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated.DoCacheClear xgetDoCacheClear()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated.DoCacheClear target = null;
                target = (com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated.DoCacheClear)get_store().find_attribute_user(DOCACHECLEAR$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated.DoCacheClear)get_default_attribute_value(DOCACHECLEAR$4);
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
        public void setDoCacheClear(com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated.DoCacheClear.Enum doCacheClear)
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
        public void xsetDoCacheClear(com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated.DoCacheClear doCacheClear)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated.DoCacheClear target = null;
                target = (com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated.DoCacheClear)get_store().find_attribute_user(DOCACHECLEAR$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated.DoCacheClear)get_store().add_attribute_user(DOCACHECLEAR$4);
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
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.RemoveRelatedDocument$RemoveRelated$DoCacheClear.
         */
        public static class DoCacheClearImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.RemoveRelatedDocument.RemoveRelated.DoCacheClear
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
