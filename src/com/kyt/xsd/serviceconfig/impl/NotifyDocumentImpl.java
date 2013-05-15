/*
 * An XML document type.
 * Localname: notify
 * Namespace: 
 * Java type: com.kyt.xsd.serviceconfig.NotifyDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceconfig.impl;
/**
 * A document containing one notify(@) element.
 *
 * This is a complex type.
 */
public class NotifyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.serviceconfig.NotifyDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotifyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFY$0 = 
        new javax.xml.namespace.QName("", "notify");
    
    
    /**
     * Gets the "notify" element
     */
    public com.kyt.xsd.serviceconfig.NotifyDocument.Notify getNotify()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.serviceconfig.NotifyDocument.Notify target = null;
            target = (com.kyt.xsd.serviceconfig.NotifyDocument.Notify)get_store().find_element_user(NOTIFY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "notify" element
     */
    public void setNotify(com.kyt.xsd.serviceconfig.NotifyDocument.Notify notify)
    {
        generatedSetterHelperImpl(notify, NOTIFY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "notify" element
     */
    public com.kyt.xsd.serviceconfig.NotifyDocument.Notify addNewNotify()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.serviceconfig.NotifyDocument.Notify target = null;
            target = (com.kyt.xsd.serviceconfig.NotifyDocument.Notify)get_store().add_element_user(NOTIFY$0);
            return target;
        }
    }
    /**
     * An XML notify(@).
     *
     * This is a complex type.
     */
    public static class NotifyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.serviceconfig.NotifyDocument.Notify
    {
        private static final long serialVersionUID = 1L;
        
        public NotifyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "type");
        
        
        /**
         * Gets the "type" attribute
         */
        public com.kyt.xsd.serviceconfig.NotifyDocument.Notify.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.serviceconfig.NotifyDocument.Notify.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.serviceconfig.NotifyDocument.Notify.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.NotifyDocument.Notify.Type target = null;
                target = (com.kyt.xsd.serviceconfig.NotifyDocument.Notify.Type)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.kyt.xsd.serviceconfig.NotifyDocument.Notify.Type.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(com.kyt.xsd.serviceconfig.NotifyDocument.Notify.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.NotifyDocument.Notify.Type target = null;
                target = (com.kyt.xsd.serviceconfig.NotifyDocument.Notify.Type)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (com.kyt.xsd.serviceconfig.NotifyDocument.Notify.Type)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.serviceconfig.NotifyDocument$Notify$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.serviceconfig.NotifyDocument.Notify.Type
        {
            private static final long serialVersionUID = 1L;
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
