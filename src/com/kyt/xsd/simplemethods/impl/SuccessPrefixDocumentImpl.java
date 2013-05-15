/*
 * An XML document type.
 * Localname: success-prefix
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.SuccessPrefixDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one success-prefix(@) element.
 *
 * This is a complex type.
 */
public class SuccessPrefixDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.SuccessPrefixDocument
{
    private static final long serialVersionUID = 1L;
    
    public SuccessPrefixDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUCCESSPREFIX$0 = 
        new javax.xml.namespace.QName("", "success-prefix");
    
    
    /**
     * Gets the "success-prefix" element
     */
    public com.kyt.xsd.simplemethods.SuccessPrefixDocument.SuccessPrefix getSuccessPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.SuccessPrefixDocument.SuccessPrefix target = null;
            target = (com.kyt.xsd.simplemethods.SuccessPrefixDocument.SuccessPrefix)get_store().find_element_user(SUCCESSPREFIX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "success-prefix" element
     */
    public void setSuccessPrefix(com.kyt.xsd.simplemethods.SuccessPrefixDocument.SuccessPrefix successPrefix)
    {
        generatedSetterHelperImpl(successPrefix, SUCCESSPREFIX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "success-prefix" element
     */
    public com.kyt.xsd.simplemethods.SuccessPrefixDocument.SuccessPrefix addNewSuccessPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.SuccessPrefixDocument.SuccessPrefix target = null;
            target = (com.kyt.xsd.simplemethods.SuccessPrefixDocument.SuccessPrefix)get_store().add_element_user(SUCCESSPREFIX$0);
            return target;
        }
    }
    /**
     * An XML success-prefix(@).
     *
     * This is a complex type.
     */
    public static class SuccessPrefixImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.SuccessPrefixDocument.SuccessPrefix
    {
        private static final long serialVersionUID = 1L;
        
        public SuccessPrefixImpl(org.apache.xmlbeans.SchemaType sType)
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
         * True if has "resource" attribute
         */
        public boolean isSetResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESOURCE$0) != null;
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
         * Unsets the "resource" attribute
         */
        public void unsetResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESOURCE$0);
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
         * True if has "property" attribute
         */
        public boolean isSetProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY$2) != null;
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
        
        /**
         * Unsets the "property" attribute
         */
        public void unsetProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PROPERTY$2);
            }
        }
    }
}
