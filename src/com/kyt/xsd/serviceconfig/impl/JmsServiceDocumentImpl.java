/*
 * An XML document type.
 * Localname: jms-service
 * Namespace: 
 * Java type: com.kyt.xsd.serviceconfig.JmsServiceDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceconfig.impl;
/**
 * A document containing one jms-service(@) element.
 *
 * This is a complex type.
 */
public class JmsServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.serviceconfig.JmsServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public JmsServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JMSSERVICE$0 = 
        new javax.xml.namespace.QName("", "jms-service");
    
    
    /**
     * Gets the "jms-service" element
     */
    public com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService getJmsService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService target = null;
            target = (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService)get_store().find_element_user(JMSSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "jms-service" element
     */
    public void setJmsService(com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService jmsService)
    {
        generatedSetterHelperImpl(jmsService, JMSSERVICE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "jms-service" element
     */
    public com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService addNewJmsService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService target = null;
            target = (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService)get_store().add_element_user(JMSSERVICE$0);
            return target;
        }
    }
    /**
     * An XML jms-service(@).
     *
     * This is a complex type.
     */
    public static class JmsServiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService
    {
        private static final long serialVersionUID = 1L;
        
        public JmsServiceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVER$0 = 
            new javax.xml.namespace.QName("", "server");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName SENDMODE$4 = 
            new javax.xml.namespace.QName("", "send-mode");
        
        
        /**
         * Gets array of all "server" elements
         */
        public com.kyt.xsd.serviceconfig.ServerDocument.Server[] getServerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SERVER$0, targetList);
                com.kyt.xsd.serviceconfig.ServerDocument.Server[] result = new com.kyt.xsd.serviceconfig.ServerDocument.Server[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "server" element
         */
        public com.kyt.xsd.serviceconfig.ServerDocument.Server getServerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ServerDocument.Server target = null;
                target = (com.kyt.xsd.serviceconfig.ServerDocument.Server)get_store().find_element_user(SERVER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "server" element
         */
        public int sizeOfServerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVER$0);
            }
        }
        
        /**
         * Sets array of all "server" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setServerArray(com.kyt.xsd.serviceconfig.ServerDocument.Server[] serverArray)
        {
            check_orphaned();
            arraySetterHelper(serverArray, SERVER$0);
        }
        
        /**
         * Sets ith "server" element
         */
        public void setServerArray(int i, com.kyt.xsd.serviceconfig.ServerDocument.Server server)
        {
            generatedSetterHelperImpl(server, SERVER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "server" element
         */
        public com.kyt.xsd.serviceconfig.ServerDocument.Server insertNewServer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ServerDocument.Server target = null;
                target = (com.kyt.xsd.serviceconfig.ServerDocument.Server)get_store().insert_element_user(SERVER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "server" element
         */
        public com.kyt.xsd.serviceconfig.ServerDocument.Server addNewServer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ServerDocument.Server target = null;
                target = (com.kyt.xsd.serviceconfig.ServerDocument.Server)get_store().add_element_user(SERVER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "server" element
         */
        public void removeServer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVER$0, i);
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
         * Gets the "send-mode" attribute
         */
        public com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode.Enum getSendMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENDMODE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SENDMODE$4);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "send-mode" attribute
         */
        public com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode xgetSendMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode target = null;
                target = (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode)get_store().find_attribute_user(SENDMODE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode)get_default_attribute_value(SENDMODE$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "send-mode" attribute
         */
        public boolean isSetSendMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SENDMODE$4) != null;
            }
        }
        
        /**
         * Sets the "send-mode" attribute
         */
        public void setSendMode(com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode.Enum sendMode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SENDMODE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SENDMODE$4);
                }
                target.setEnumValue(sendMode);
            }
        }
        
        /**
         * Sets (as xml) the "send-mode" attribute
         */
        public void xsetSendMode(com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode sendMode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode target = null;
                target = (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode)get_store().find_attribute_user(SENDMODE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode)get_store().add_attribute_user(SENDMODE$4);
                }
                target.set(sendMode);
            }
        }
        
        /**
         * Unsets the "send-mode" attribute
         */
        public void unsetSendMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SENDMODE$4);
            }
        }
        /**
         * An XML send-mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.serviceconfig.JmsServiceDocument$JmsService$SendMode.
         */
        public static class SendModeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode
        {
            private static final long serialVersionUID = 1L;
            
            public SendModeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SendModeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
