/*
 * An XML document type.
 * Localname: fail-property
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.FailPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one fail-property(@) element.
 *
 * This is a complex type.
 */
public class FailPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.FailPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public FailPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FAILPROPERTY$0 = 
        new javax.xml.namespace.QName("", "fail-property");
    
    
    /**
     * Gets the "fail-property" element
     */
    public com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty getFailProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty target = null;
            target = (com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty)get_store().find_element_user(FAILPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "fail-property" element
     */
    public void setFailProperty(com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty failProperty)
    {
        generatedSetterHelperImpl(failProperty, FAILPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "fail-property" element
     */
    public com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty addNewFailProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty target = null;
            target = (com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty)get_store().add_element_user(FAILPROPERTY$0);
            return target;
        }
    }
    /**
     * An XML fail-property(@).
     *
     * This is a complex type.
     */
    public static class FailPropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty
    {
        private static final long serialVersionUID = 1L;
        
        public FailPropertyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCE$0 = 
            new javax.xml.namespace.QName("", "resource");
        private static final javax.xml.namespace.QName PROPERTY$2 = 
            new javax.xml.namespace.QName("", "property");
        
        
        /**
         * Gets the "resource" attribute
         */
        public java.lang.String getResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "resource" attribute
         */
        public org.apache.xmlbeans.XmlString xgetResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOURCE$0);
                return target;
            }
        }
        
        /**
         * Sets the "resource" attribute
         */
        public void setResource(java.lang.String resource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOURCE$0);
                }
                target.setStringValue(resource);
            }
        }
        
        /**
         * Sets (as xml) the "resource" attribute
         */
        public void xsetResource(org.apache.xmlbeans.XmlString resource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOURCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESOURCE$0);
                }
                target.set(resource);
            }
        }
        
        /**
         * Gets the "property" attribute
         */
        public java.lang.String getProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "property" attribute
         */
        public org.apache.xmlbeans.XmlString xgetProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY$2);
                return target;
            }
        }
        
        /**
         * Sets the "property" attribute
         */
        public void setProperty(java.lang.String property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY$2);
                }
                target.setStringValue(property);
            }
        }
        
        /**
         * Sets (as xml) the "property" attribute
         */
        public void xsetProperty(org.apache.xmlbeans.XmlString property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY$2);
                }
                target.set(property);
            }
        }
    }
}
