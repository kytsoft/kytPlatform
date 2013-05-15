/*
 * An XML document type.
 * Localname: property
 * Namespace: 
 * Java type: com.kyt.xsd.ofbizcontainers.PropertyDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.ofbizcontainers.impl;
/**
 * A document containing one property(@) element.
 *
 * This is a complex type.
 */
public class PropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcontainers.PropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("", "property");
    
    
    /**
     * Gets the "property" element
     */
    public com.kyt.xsd.ofbizcontainers.PropertyDocument.Property getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcontainers.PropertyDocument.Property target = null;
            target = (com.kyt.xsd.ofbizcontainers.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "property" element
     */
    public void setProperty(com.kyt.xsd.ofbizcontainers.PropertyDocument.Property property)
    {
        generatedSetterHelperImpl(property, PROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "property" element
     */
    public com.kyt.xsd.ofbizcontainers.PropertyDocument.Property addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcontainers.PropertyDocument.Property target = null;
            target = (com.kyt.xsd.ofbizcontainers.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
    /**
     * An XML property(@).
     *
     * This is a complex type.
     */
    public static class PropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcontainers.PropertyDocument.Property
    {
        private static final long serialVersionUID = 1L;
        
        public PropertyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROPERTY$0 = 
            new javax.xml.namespace.QName("", "property");
        private static final javax.xml.namespace.QName PROPERTYVALUE$2 = 
            new javax.xml.namespace.QName("", "property-value");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName VALUE$6 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets array of all "property" elements
         */
        public com.kyt.xsd.ofbizcontainers.PropertyDocument.Property[] getPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PROPERTY$0, targetList);
                com.kyt.xsd.ofbizcontainers.PropertyDocument.Property[] result = new com.kyt.xsd.ofbizcontainers.PropertyDocument.Property[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "property" element
         */
        public com.kyt.xsd.ofbizcontainers.PropertyDocument.Property getPropertyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcontainers.PropertyDocument.Property target = null;
                target = (com.kyt.xsd.ofbizcontainers.PropertyDocument.Property)get_store().find_element_user(PROPERTY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "property" element
         */
        public int sizeOfPropertyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTY$0);
            }
        }
        
        /**
         * Sets array of all "property" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPropertyArray(com.kyt.xsd.ofbizcontainers.PropertyDocument.Property[] propertyArray)
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$0);
        }
        
        /**
         * Sets ith "property" element
         */
        public void setPropertyArray(int i, com.kyt.xsd.ofbizcontainers.PropertyDocument.Property property)
        {
            generatedSetterHelperImpl(property, PROPERTY$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "property" element
         */
        public com.kyt.xsd.ofbizcontainers.PropertyDocument.Property insertNewProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcontainers.PropertyDocument.Property target = null;
                target = (com.kyt.xsd.ofbizcontainers.PropertyDocument.Property)get_store().insert_element_user(PROPERTY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "property" element
         */
        public com.kyt.xsd.ofbizcontainers.PropertyDocument.Property addNewProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcontainers.PropertyDocument.Property target = null;
                target = (com.kyt.xsd.ofbizcontainers.PropertyDocument.Property)get_store().add_element_user(PROPERTY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "property" element
         */
        public void removeProperty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTY$0, i);
            }
        }
        
        /**
         * Gets the "property-value" element
         */
        public com.kyt.xsd.ofbizcontainers.Any getPropertyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcontainers.Any target = null;
                target = (com.kyt.xsd.ofbizcontainers.Any)get_store().find_element_user(PROPERTYVALUE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "property-value" element
         */
        public boolean isSetPropertyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PROPERTYVALUE$2) != 0;
            }
        }
        
        /**
         * Sets the "property-value" element
         */
        public void setPropertyValue(com.kyt.xsd.ofbizcontainers.Any propertyValue)
        {
            generatedSetterHelperImpl(propertyValue, PROPERTYVALUE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "property-value" element
         */
        public com.kyt.xsd.ofbizcontainers.Any addNewPropertyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcontainers.Any target = null;
                target = (com.kyt.xsd.ofbizcontainers.Any)get_store().add_element_user(PROPERTYVALUE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "property-value" element
         */
        public void unsetPropertyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PROPERTYVALUE$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$6);
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$6) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$6);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$6);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$6);
            }
        }
    }
}
