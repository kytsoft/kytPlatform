/*
 * An XML document type.
 * Localname: entity-resource
 * Namespace: 
 * Java type: com.kyt.xsd.ofbizcomponent.EntityResourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.ofbizcomponent.impl;
/**
 * A document containing one entity-resource(@) element.
 *
 * This is a complex type.
 */
public class EntityResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.EntityResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYRESOURCE$0 = 
        new javax.xml.namespace.QName("", "entity-resource");
    
    
    /**
     * Gets the "entity-resource" element
     */
    public com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource getEntityResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource target = null;
            target = (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource)get_store().find_element_user(ENTITYRESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entity-resource" element
     */
    public void setEntityResource(com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource entityResource)
    {
        generatedSetterHelperImpl(entityResource, ENTITYRESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entity-resource" element
     */
    public com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource addNewEntityResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource target = null;
            target = (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource)get_store().add_element_user(ENTITYRESOURCE$0);
            return target;
        }
    }
    /**
     * An XML entity-resource(@).
     *
     * This is a complex type.
     */
    public static class EntityResourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource
    {
        private static final long serialVersionUID = 1L;
        
        public EntityResourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName READERNAME$2 = 
            new javax.xml.namespace.QName("", "reader-name");
        private static final javax.xml.namespace.QName LOADER$4 = 
            new javax.xml.namespace.QName("", "loader");
        private static final javax.xml.namespace.QName LOCATION$6 = 
            new javax.xml.namespace.QName("", "location");
        
        
        /**
         * Gets the "type" attribute
         */
        public com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type.Enum getType()
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
                return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type target = null;
                target = (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type.Enum type)
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
        public void xsetType(com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type target = null;
                target = (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "reader-name" attribute
         */
        public java.lang.String getReaderName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READERNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "reader-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetReaderName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(READERNAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "reader-name" attribute
         */
        public void setReaderName(java.lang.String readerName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(READERNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(READERNAME$2);
                }
                target.setStringValue(readerName);
            }
        }
        
        /**
         * Sets (as xml) the "reader-name" attribute
         */
        public void xsetReaderName(org.apache.xmlbeans.XmlString readerName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(READERNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(READERNAME$2);
                }
                target.set(readerName);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADER$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOADER$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOADER$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOADER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOADER$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCATION$6);
                }
                target.set(location);
            }
        }
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.ofbizcomponent.EntityResourceDocument$EntityResource$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type
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
