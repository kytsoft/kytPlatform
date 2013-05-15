/*
 * An XML document type.
 * Localname: service-security
 * Namespace: 
 * Java type: com.kyt.xsd.services.ServiceSecurityDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.services.impl;
/**
 * A document containing one service-security(@) element.
 *
 * This is a complex type.
 */
public class ServiceSecurityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.ServiceSecurityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceSecurityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICESECURITY$0 = 
        new javax.xml.namespace.QName("", "service-security");
    
    
    /**
     * Gets the "service-security" element
     */
    public com.kyt.xsd.services.ServiceSecurityDocument.ServiceSecurity getServiceSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.ServiceSecurityDocument.ServiceSecurity target = null;
            target = (com.kyt.xsd.services.ServiceSecurityDocument.ServiceSecurity)get_store().find_element_user(SERVICESECURITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-security" element
     */
    public void setServiceSecurity(com.kyt.xsd.services.ServiceSecurityDocument.ServiceSecurity serviceSecurity)
    {
        generatedSetterHelperImpl(serviceSecurity, SERVICESECURITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "service-security" element
     */
    public com.kyt.xsd.services.ServiceSecurityDocument.ServiceSecurity addNewServiceSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.ServiceSecurityDocument.ServiceSecurity target = null;
            target = (com.kyt.xsd.services.ServiceSecurityDocument.ServiceSecurity)get_store().add_element_user(SERVICESECURITY$0);
            return target;
        }
    }
    /**
     * An XML service-security(@).
     *
     * This is a complex type.
     */
    public static class ServiceSecurityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.ServiceSecurityDocument.ServiceSecurity
    {
        private static final long serialVersionUID = 1L;
        
        public ServiceSecurityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName CLASS1$2 = 
            new javax.xml.namespace.QName("", "class");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "class" attribute
         */
        public java.lang.String getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "class" attribute
         */
        public org.apache.xmlbeans.XmlString xgetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$2);
                return target;
            }
        }
        
        /**
         * Sets the "class" attribute
         */
        public void setClass1(java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$2);
                }
                target.setStringValue(class1);
            }
        }
        
        /**
         * Sets (as xml) the "class" attribute
         */
        public void xsetClass1(org.apache.xmlbeans.XmlString class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$2);
                }
                target.set(class1);
            }
        }
    }
}
