/*
 * An XML document type.
 * Localname: event
 * Namespace: 
 * Java type: com.kyt.xsd.siteconf.EventDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.siteconf.impl;
/**
 * A document containing one event(@) element.
 *
 * This is a complex type.
 */
public class EventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.EventDocument
{
    private static final long serialVersionUID = 1L;
    
    public EventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("", "event");
    
    
    /**
     * Gets the "event" element
     */
    public com.kyt.xsd.siteconf.EventDocument.Event getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.EventDocument.Event target = null;
            target = (com.kyt.xsd.siteconf.EventDocument.Event)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "event" element
     */
    public void setEvent(com.kyt.xsd.siteconf.EventDocument.Event event)
    {
        generatedSetterHelperImpl(event, EVENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "event" element
     */
    public com.kyt.xsd.siteconf.EventDocument.Event addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.EventDocument.Event target = null;
            target = (com.kyt.xsd.siteconf.EventDocument.Event)get_store().add_element_user(EVENT$0);
            return target;
        }
    }
    /**
     * An XML event(@).
     *
     * This is a complex type.
     */
    public static class EventImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.EventDocument.Event
    {
        private static final long serialVersionUID = 1L;
        
        public EventImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName PATH$4 = 
            new javax.xml.namespace.QName("", "path");
        private static final javax.xml.namespace.QName INVOKE$6 = 
            new javax.xml.namespace.QName("", "invoke");
        private static final javax.xml.namespace.QName GLOBALTRANSACTION$8 = 
            new javax.xml.namespace.QName("", "global-transaction");
        
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
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
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
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
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$2) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$2);
            }
        }
        
        /**
         * Gets the "path" attribute
         */
        public java.lang.String getPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "path" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$4);
                return target;
            }
        }
        
        /**
         * True if has "path" attribute
         */
        public boolean isSetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PATH$4) != null;
            }
        }
        
        /**
         * Sets the "path" attribute
         */
        public void setPath(java.lang.String path)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PATH$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PATH$4);
                }
                target.setStringValue(path);
            }
        }
        
        /**
         * Sets (as xml) the "path" attribute
         */
        public void xsetPath(org.apache.xmlbeans.XmlString path)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PATH$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PATH$4);
                }
                target.set(path);
            }
        }
        
        /**
         * Unsets the "path" attribute
         */
        public void unsetPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PATH$4);
            }
        }
        
        /**
         * Gets the "invoke" attribute
         */
        public java.lang.String getInvoke()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVOKE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "invoke" attribute
         */
        public org.apache.xmlbeans.XmlString xgetInvoke()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INVOKE$6);
                return target;
            }
        }
        
        /**
         * True if has "invoke" attribute
         */
        public boolean isSetInvoke()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INVOKE$6) != null;
            }
        }
        
        /**
         * Sets the "invoke" attribute
         */
        public void setInvoke(java.lang.String invoke)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVOKE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INVOKE$6);
                }
                target.setStringValue(invoke);
            }
        }
        
        /**
         * Sets (as xml) the "invoke" attribute
         */
        public void xsetInvoke(org.apache.xmlbeans.XmlString invoke)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INVOKE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INVOKE$6);
                }
                target.set(invoke);
            }
        }
        
        /**
         * Unsets the "invoke" attribute
         */
        public void unsetInvoke()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INVOKE$6);
            }
        }
        
        /**
         * Gets the "global-transaction" attribute
         */
        public com.kyt.xsd.siteconf.EventDocument.Event.GlobalTransaction.Enum getGlobalTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GLOBALTRANSACTION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GLOBALTRANSACTION$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.EventDocument.Event.GlobalTransaction.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "global-transaction" attribute
         */
        public com.kyt.xsd.siteconf.EventDocument.Event.GlobalTransaction xgetGlobalTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.EventDocument.Event.GlobalTransaction target = null;
                target = (com.kyt.xsd.siteconf.EventDocument.Event.GlobalTransaction)get_store().find_attribute_user(GLOBALTRANSACTION$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.EventDocument.Event.GlobalTransaction)get_default_attribute_value(GLOBALTRANSACTION$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "global-transaction" attribute
         */
        public boolean isSetGlobalTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GLOBALTRANSACTION$8) != null;
            }
        }
        
        /**
         * Sets the "global-transaction" attribute
         */
        public void setGlobalTransaction(com.kyt.xsd.siteconf.EventDocument.Event.GlobalTransaction.Enum globalTransaction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GLOBALTRANSACTION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GLOBALTRANSACTION$8);
                }
                target.setEnumValue(globalTransaction);
            }
        }
        
        /**
         * Sets (as xml) the "global-transaction" attribute
         */
        public void xsetGlobalTransaction(com.kyt.xsd.siteconf.EventDocument.Event.GlobalTransaction globalTransaction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.EventDocument.Event.GlobalTransaction target = null;
                target = (com.kyt.xsd.siteconf.EventDocument.Event.GlobalTransaction)get_store().find_attribute_user(GLOBALTRANSACTION$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.EventDocument.Event.GlobalTransaction)get_store().add_attribute_user(GLOBALTRANSACTION$8);
                }
                target.set(globalTransaction);
            }
        }
        
        /**
         * Unsets the "global-transaction" attribute
         */
        public void unsetGlobalTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GLOBALTRANSACTION$8);
            }
        }
        /**
         * An XML global-transaction(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.EventDocument$Event$GlobalTransaction.
         */
        public static class GlobalTransactionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.EventDocument.Event.GlobalTransaction
        {
            private static final long serialVersionUID = 1L;
            
            public GlobalTransactionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected GlobalTransactionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
