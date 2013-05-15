/*
 * An XML document type.
 * Localname: validate
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.ValidateDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel.impl;
/**
 * A document containing one validate(@) element.
 *
 * This is a complex type.
 */
public class ValidateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.ValidateDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDATE$0 = 
        new javax.xml.namespace.QName("", "validate");
    
    
    /**
     * Gets the "validate" element
     */
    public com.kyt.xsd.entitymodel.ValidateDocument.Validate getValidate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.ValidateDocument.Validate target = null;
            target = (com.kyt.xsd.entitymodel.ValidateDocument.Validate)get_store().find_element_user(VALIDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validate" element
     */
    public void setValidate(com.kyt.xsd.entitymodel.ValidateDocument.Validate validate)
    {
        generatedSetterHelperImpl(validate, VALIDATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "validate" element
     */
    public com.kyt.xsd.entitymodel.ValidateDocument.Validate addNewValidate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.ValidateDocument.Validate target = null;
            target = (com.kyt.xsd.entitymodel.ValidateDocument.Validate)get_store().add_element_user(VALIDATE$0);
            return target;
        }
    }
    /**
     * An XML validate(@).
     *
     * This is a complex type.
     */
    public static class ValidateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.ValidateDocument.Validate
    {
        private static final long serialVersionUID = 1L;
        
        public ValidateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        
        
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
    }
}
