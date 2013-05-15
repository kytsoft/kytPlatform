/*
 * An XML document type.
 * Localname: notification
 * Namespace: 
 * Java type: com.kyt.xsd.services.NotificationDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.services.impl;
/**
 * A document containing one notification(@) element.
 *
 * This is a complex type.
 */
public class NotificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.NotificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFICATION$0 = 
        new javax.xml.namespace.QName("", "notification");
    
    
    /**
     * Gets the "notification" element
     */
    public com.kyt.xsd.services.NotificationDocument.Notification getNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.NotificationDocument.Notification target = null;
            target = (com.kyt.xsd.services.NotificationDocument.Notification)get_store().find_element_user(NOTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "notification" element
     */
    public void setNotification(com.kyt.xsd.services.NotificationDocument.Notification notification)
    {
        generatedSetterHelperImpl(notification, NOTIFICATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "notification" element
     */
    public com.kyt.xsd.services.NotificationDocument.Notification addNewNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.NotificationDocument.Notification target = null;
            target = (com.kyt.xsd.services.NotificationDocument.Notification)get_store().add_element_user(NOTIFICATION$0);
            return target;
        }
    }
    /**
     * An XML notification(@).
     *
     * This is a complex type.
     */
    public static class NotificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.NotificationDocument.Notification
    {
        private static final long serialVersionUID = 1L;
        
        public NotificationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENT$0 = 
            new javax.xml.namespace.QName("", "event");
        private static final javax.xml.namespace.QName GROUP$2 = 
            new javax.xml.namespace.QName("", "group");
        
        
        /**
         * Gets the "event" attribute
         */
        public com.kyt.xsd.services.NotificationDocument.Notification.Event.Enum getEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENT$0);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.services.NotificationDocument.Notification.Event.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "event" attribute
         */
        public com.kyt.xsd.services.NotificationDocument.Notification.Event xgetEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.NotificationDocument.Notification.Event target = null;
                target = (com.kyt.xsd.services.NotificationDocument.Notification.Event)get_store().find_attribute_user(EVENT$0);
                return target;
            }
        }
        
        /**
         * Sets the "event" attribute
         */
        public void setEvent(com.kyt.xsd.services.NotificationDocument.Notification.Event.Enum event)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVENT$0);
                }
                target.setEnumValue(event);
            }
        }
        
        /**
         * Sets (as xml) the "event" attribute
         */
        public void xsetEvent(com.kyt.xsd.services.NotificationDocument.Notification.Event event)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.NotificationDocument.Notification.Event target = null;
                target = (com.kyt.xsd.services.NotificationDocument.Notification.Event)get_store().find_attribute_user(EVENT$0);
                if (target == null)
                {
                    target = (com.kyt.xsd.services.NotificationDocument.Notification.Event)get_store().add_attribute_user(EVENT$0);
                }
                target.set(event);
            }
        }
        
        /**
         * Gets the "group" attribute
         */
        public java.lang.String getGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "group" attribute
         */
        public org.apache.xmlbeans.XmlString xgetGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$2);
                return target;
            }
        }
        
        /**
         * Sets the "group" attribute
         */
        public void setGroup(java.lang.String group)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUP$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUP$2);
                }
                target.setStringValue(group);
            }
        }
        
        /**
         * Sets (as xml) the "group" attribute
         */
        public void xsetGroup(org.apache.xmlbeans.XmlString group)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUP$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GROUP$2);
                }
                target.set(group);
            }
        }
        /**
         * An XML event(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.NotificationDocument$Notification$Event.
         */
        public static class EventImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.services.NotificationDocument.Notification.Event
        {
            private static final long serialVersionUID = 1L;
            
            public EventImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected EventImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
