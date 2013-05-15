/*
 * An XML document type.
 * Localname: service-resource
 * Namespace: 
 * Java type: com.kyt.xsd.ofbizcomponent.ServiceResourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.ofbizcomponent.impl;
/**
 * A document containing one service-resource(@) element.
 *
 * This is a complex type.
 */
public class ServiceResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.ServiceResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICERESOURCE$0 = 
        new javax.xml.namespace.QName("", "service-resource");
    
    
    /**
     * Gets the "service-resource" element
     */
    public com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource getServiceResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource target = null;
            target = (com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource)get_store().find_element_user(SERVICERESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-resource" element
     */
    public void setServiceResource(com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource serviceResource)
    {
        generatedSetterHelperImpl(serviceResource, SERVICERESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "service-resource" element
     */
    public com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource addNewServiceResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource target = null;
            target = (com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource)get_store().add_element_user(SERVICERESOURCE$0);
            return target;
        }
    }
    /**
     * An XML service-resource(@).
     *
     * This is a complex type.
     */
    public static class ServiceResourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource
    {
        private static final long serialVersionUID = 1L;
        
        public ServiceResourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName LOADER$2 = 
            new javax.xml.namespace.QName("", "loader");
        private static final javax.xml.namespace.QName LOCATION$4 = 
            new javax.xml.namespace.QName("", "location");
        
        
        /**
         * Gets the "type" attribute
         */
        public com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource.Type.Enum getType()
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
                return (com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource.Type target = null;
                target = (com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource.Type)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource.Type.Enum type)
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
        public void xsetType(com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource.Type target = null;
                target = (com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource.Type)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource.Type)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "loader" attribute
         */
        public java.lang.String getLoader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADER$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "loader" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLoader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOADER$2);
                return target;
            }
        }
        
        /**
         * Sets the "loader" attribute
         */
        public void setLoader(java.lang.String loader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOADER$2);
                }
                target.setStringValue(loader);
            }
        }
        
        /**
         * Sets (as xml) the "loader" attribute
         */
        public void xsetLoader(org.apache.xmlbeans.XmlString loader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOADER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOADER$2);
                }
                target.set(loader);
            }
        }
        
        /**
         * Gets the "location" attribute
         */
        public java.lang.String getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "location" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$4);
                return target;
            }
        }
        
        /**
         * Sets the "location" attribute
         */
        public void setLocation(java.lang.String location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$4);
                }
                target.setStringValue(location);
            }
        }
        
        /**
         * Sets (as xml) the "location" attribute
         */
        public void xsetLocation(org.apache.xmlbeans.XmlString location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCATION$4);
                }
                target.set(location);
            }
        }
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.ofbizcomponent.ServiceResourceDocument$ServiceResource$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource.Type
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
