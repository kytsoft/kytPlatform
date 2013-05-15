/*
 * An XML document type.
 * Localname: field-type
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.FieldTypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig.impl;
/**
 * A document containing one field-type(@) element.
 *
 * This is a complex type.
 */
public class FieldTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.FieldTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public FieldTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDTYPE$0 = 
        new javax.xml.namespace.QName("", "field-type");
    
    
    /**
     * Gets the "field-type" element
     */
    public com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType getFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType target = null;
            target = (com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType)get_store().find_element_user(FIELDTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "field-type" element
     */
    public void setFieldType(com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType fieldType)
    {
        generatedSetterHelperImpl(fieldType, FIELDTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "field-type" element
     */
    public com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType addNewFieldType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType target = null;
            target = (com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType)get_store().add_element_user(FIELDTYPE$0);
            return target;
        }
    }
    /**
     * An XML field-type(@).
     *
     * This is a complex type.
     */
    public static class FieldTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.FieldTypeDocument.FieldType
    {
        private static final long serialVersionUID = 1L;
        
        public FieldTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName LOADER$2 = 
            new javax.xml.namespace.QName("", "loader");
        private static final javax.xml.namespace.QName LOCATION$4 = 
            new javax.xml.namespace.QName("", "location");
        
        
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
    }
}
