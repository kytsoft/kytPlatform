/*
 * An XML document type.
 * Localname: virtual-host
 * Namespace: 
 * Java type: com.kyt.xsd.ofbizcomponent.VirtualHostDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.ofbizcomponent.impl;
/**
 * A document containing one virtual-host(@) element.
 *
 * This is a complex type.
 */
public class VirtualHostDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.VirtualHostDocument
{
    private static final long serialVersionUID = 1L;
    
    public VirtualHostDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIRTUALHOST$0 = 
        new javax.xml.namespace.QName("", "virtual-host");
    
    
    /**
     * Gets the "virtual-host" element
     */
    public com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost getVirtualHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost target = null;
            target = (com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost)get_store().find_element_user(VIRTUALHOST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "virtual-host" element
     */
    public void setVirtualHost(com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost virtualHost)
    {
        generatedSetterHelperImpl(virtualHost, VIRTUALHOST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "virtual-host" element
     */
    public com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost addNewVirtualHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost target = null;
            target = (com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost)get_store().add_element_user(VIRTUALHOST$0);
            return target;
        }
    }
    /**
     * An XML virtual-host(@).
     *
     * This is a complex type.
     */
    public static class VirtualHostImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost
    {
        private static final long serialVersionUID = 1L;
        
        public VirtualHostImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HOSTNAME$0 = 
            new javax.xml.namespace.QName("", "host-name");
        
        
        /**
         * Gets the "host-name" attribute
         */
        public java.lang.String getHostName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "host-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHostName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "host-name" attribute
         */
        public void setHostName(java.lang.String hostName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOSTNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOSTNAME$0);
                }
                target.setStringValue(hostName);
            }
        }
        
        /**
         * Sets (as xml) the "host-name" attribute
         */
        public void xsetHostName(org.apache.xmlbeans.XmlString hostName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOSTNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOSTNAME$0);
                }
                target.set(hostName);
            }
        }
    }
}
