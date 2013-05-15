/*
 * An XML document type.
 * Localname: condition-service
 * Namespace: 
 * Java type: com.kyt.xsd.serviceeca.ConditionServiceDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceeca.impl;
/**
 * A document containing one condition-service(@) element.
 *
 * This is a complex type.
 */
public class ConditionServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.serviceeca.ConditionServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConditionServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONSERVICE$0 = 
        new javax.xml.namespace.QName("", "condition-service");
    
    
    /**
     * Gets the "condition-service" element
     */
    public com.kyt.xsd.serviceeca.ConditionServiceDocument.ConditionService getConditionService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.serviceeca.ConditionServiceDocument.ConditionService target = null;
            target = (com.kyt.xsd.serviceeca.ConditionServiceDocument.ConditionService)get_store().find_element_user(CONDITIONSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "condition-service" element
     */
    public void setConditionService(com.kyt.xsd.serviceeca.ConditionServiceDocument.ConditionService conditionService)
    {
        generatedSetterHelperImpl(conditionService, CONDITIONSERVICE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "condition-service" element
     */
    public com.kyt.xsd.serviceeca.ConditionServiceDocument.ConditionService addNewConditionService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.serviceeca.ConditionServiceDocument.ConditionService target = null;
            target = (com.kyt.xsd.serviceeca.ConditionServiceDocument.ConditionService)get_store().add_element_user(CONDITIONSERVICE$0);
            return target;
        }
    }
    /**
     * An XML condition-service(@).
     *
     * This is a complex type.
     */
    public static class ConditionServiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.serviceeca.ConditionServiceDocument.ConditionService
    {
        private static final long serialVersionUID = 1L;
        
        public ConditionServiceImpl(org.apache.xmlbeans.SchemaType sType)
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
         * True if has "service-name" attribute
         */
        public boolean isSetServiceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SERVICENAME$0) != null;
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
        
        /**
         * Unsets the "service-name" attribute
         */
        public void unsetServiceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SERVICENAME$0);
            }
        }
    }
}
