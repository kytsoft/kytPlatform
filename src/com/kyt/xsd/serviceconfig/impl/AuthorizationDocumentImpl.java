/*
 * An XML document type.
 * Localname: authorization
 * Namespace: 
 * Java type: com.kyt.xsd.serviceconfig.AuthorizationDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceconfig.impl;
/**
 * A document containing one authorization(@) element.
 *
 * This is a complex type.
 */
public class AuthorizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.serviceconfig.AuthorizationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuthorizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHORIZATION$0 = 
        new javax.xml.namespace.QName("", "authorization");
    
    
    /**
     * Gets the "authorization" element
     */
    public com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization getAuthorization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization target = null;
            target = (com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization)get_store().find_element_user(AUTHORIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "authorization" element
     */
    public void setAuthorization(com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization authorization)
    {
        generatedSetterHelperImpl(authorization, AUTHORIZATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "authorization" element
     */
    public com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization addNewAuthorization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization target = null;
            target = (com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization)get_store().add_element_user(AUTHORIZATION$0);
            return target;
        }
    }
    /**
     * An XML authorization(@).
     *
     * This is a complex type.
     */
    public static class AuthorizationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization
    {
        private static final long serialVersionUID = 1L;
        
        public AuthorizationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVICENAME$0 = 
            new javax.xml.namespace.QName("", "service-name");
        
        
        /**
         * Gets the "service-name" attribute
         */
        public java.lang.String getServiceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICENAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "service-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetServiceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICENAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "service-name" attribute
         */
        public void setServiceName(java.lang.String serviceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICENAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICENAME$0);
                }
                target.setStringValue(serviceName);
            }
        }
        
        /**
         * Sets (as xml) the "service-name" attribute
         */
        public void xsetServiceName(org.apache.xmlbeans.XmlString serviceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICENAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERVICENAME$0);
                }
                target.set(serviceName);
            }
        }
    }
}
