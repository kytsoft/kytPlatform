/*
 * An XML document type.
 * Localname: services
 * Namespace: 
 * Java type: com.kyt.xsd.services.ServicesDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.services.impl;
/**
 * A document containing one services(@) element.
 *
 * This is a complex type.
 */
public class ServicesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.ServicesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServicesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICES$0 = 
        new javax.xml.namespace.QName("", "services");
    
    
    /**
     * Gets the "services" element
     */
    public com.kyt.xsd.services.ServicesDocument.Services getServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.ServicesDocument.Services target = null;
            target = (com.kyt.xsd.services.ServicesDocument.Services)get_store().find_element_user(SERVICES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "services" element
     */
    public void setServices(com.kyt.xsd.services.ServicesDocument.Services services)
    {
        generatedSetterHelperImpl(services, SERVICES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "services" element
     */
    public com.kyt.xsd.services.ServicesDocument.Services addNewServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.ServicesDocument.Services target = null;
            target = (com.kyt.xsd.services.ServicesDocument.Services)get_store().add_element_user(SERVICES$0);
            return target;
        }
    }
    /**
     * An XML services(@).
     *
     * This is a complex type.
     */
    public static class ServicesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.ServicesDocument.Services
    {
        private static final long serialVersionUID = 1L;
        
        public ServicesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName VENDOR$2 = 
            new javax.xml.namespace.QName("", "vendor");
        private static final javax.xml.namespace.QName VERSION$4 = 
            new javax.xml.namespace.QName("", "version");
        private static final javax.xml.namespace.QName CREATED$6 = 
            new javax.xml.namespace.QName("", "created");
        private static final javax.xml.namespace.QName SERVICE$8 = 
            new javax.xml.namespace.QName("", "service");
        
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "description" element
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$0) != 0;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
                }
                target.set(description);
            }
        }
        
        /**
         * Unsets the "description" element
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$0, 0);
            }
        }
        
        /**
         * Gets the "vendor" element
         */
        public java.lang.String getVendor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENDOR$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "vendor" element
         */
        public org.apache.xmlbeans.XmlString xgetVendor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VENDOR$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "vendor" element
         */
        public boolean isSetVendor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VENDOR$2) != 0;
            }
        }
        
        /**
         * Sets the "vendor" element
         */
        public void setVendor(java.lang.String vendor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VENDOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VENDOR$2);
                }
                target.setStringValue(vendor);
            }
        }
        
        /**
         * Sets (as xml) the "vendor" element
         */
        public void xsetVendor(org.apache.xmlbeans.XmlString vendor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VENDOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VENDOR$2);
                }
                target.set(vendor);
            }
        }
        
        /**
         * Unsets the "vendor" element
         */
        public void unsetVendor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VENDOR$2, 0);
            }
        }
        
        /**
         * Gets the "version" element
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" element
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "version" element
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VERSION$4) != 0;
            }
        }
        
        /**
         * Sets the "version" element
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$4);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" element
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$4);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "version" element
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VERSION$4, 0);
            }
        }
        
        /**
         * Gets the "created" element
         */
        public java.lang.String getCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "created" element
         */
        public org.apache.xmlbeans.XmlString xgetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATED$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "created" element
         */
        public boolean isSetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATED$6) != 0;
            }
        }
        
        /**
         * Sets the "created" element
         */
        public void setCreated(java.lang.String created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$6);
                }
                target.setStringValue(created);
            }
        }
        
        /**
         * Sets (as xml) the "created" element
         */
        public void xsetCreated(org.apache.xmlbeans.XmlString created)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATED$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREATED$6);
                }
                target.set(created);
            }
        }
        
        /**
         * Unsets the "created" element
         */
        public void unsetCreated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATED$6, 0);
            }
        }
        
        /**
         * Gets array of all "service" elements
         */
        public com.kyt.xsd.services.ServiceDocument.Service[] getServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SERVICE$8, targetList);
                com.kyt.xsd.services.ServiceDocument.Service[] result = new com.kyt.xsd.services.ServiceDocument.Service[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "service" element
         */
        public com.kyt.xsd.services.ServiceDocument.Service getServiceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.ServiceDocument.Service target = null;
                target = (com.kyt.xsd.services.ServiceDocument.Service)get_store().find_element_user(SERVICE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "service" element
         */
        public int sizeOfServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICE$8);
            }
        }
        
        /**
         * Sets array of all "service" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setServiceArray(com.kyt.xsd.services.ServiceDocument.Service[] serviceArray)
        {
            check_orphaned();
            arraySetterHelper(serviceArray, SERVICE$8);
        }
        
        /**
         * Sets ith "service" element
         */
        public void setServiceArray(int i, com.kyt.xsd.services.ServiceDocument.Service service)
        {
            generatedSetterHelperImpl(service, SERVICE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "service" element
         */
        public com.kyt.xsd.services.ServiceDocument.Service insertNewService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.ServiceDocument.Service target = null;
                target = (com.kyt.xsd.services.ServiceDocument.Service)get_store().insert_element_user(SERVICE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "service" element
         */
        public com.kyt.xsd.services.ServiceDocument.Service addNewService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.ServiceDocument.Service target = null;
                target = (com.kyt.xsd.services.ServiceDocument.Service)get_store().add_element_user(SERVICE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "service" element
         */
        public void removeService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICE$8, i);
            }
        }
    }
}
