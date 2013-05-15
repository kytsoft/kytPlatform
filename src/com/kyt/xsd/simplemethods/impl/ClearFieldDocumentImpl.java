/*
 * An XML document type.
 * Localname: clear-field
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.ClearFieldDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one clear-field(@) element.
 *
 * This is a complex type.
 */
public class ClearFieldDocumentImpl extends com.kyt.xsd.simplemethods.impl.EnvOperationsDocumentImpl implements com.kyt.xsd.simplemethods.ClearFieldDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClearFieldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLEARFIELD$0 = 
        new javax.xml.namespace.QName("", "clear-field");
    
    
    /**
     * Gets the "clear-field" element
     */
    public com.kyt.xsd.simplemethods.ClearFieldDocument.ClearField getClearField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ClearFieldDocument.ClearField target = null;
            target = (com.kyt.xsd.simplemethods.ClearFieldDocument.ClearField)get_store().find_element_user(CLEARFIELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clear-field" element
     */
    public void setClearField(com.kyt.xsd.simplemethods.ClearFieldDocument.ClearField clearField)
    {
        generatedSetterHelperImpl(clearField, CLEARFIELD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "clear-field" element
     */
    public com.kyt.xsd.simplemethods.ClearFieldDocument.ClearField addNewClearField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ClearFieldDocument.ClearField target = null;
            target = (com.kyt.xsd.simplemethods.ClearFieldDocument.ClearField)get_store().add_element_user(CLEARFIELD$0);
            return target;
        }
    }
    /**
     * An XML clear-field(@).
     *
     * This is a complex type.
     */
    public static class ClearFieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.ClearFieldDocument.ClearField
    {
        private static final long serialVersionUID = 1L;
        
        public ClearFieldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELD$0 = 
            new javax.xml.namespace.QName("", "field");
        
        
        /**
         * Gets the "field" attribute
         */
        public java.lang.String getField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$0);
                return target;
            }
        }
        
        /**
         * Sets the "field" attribute
         */
        public void setField(java.lang.String field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD$0);
                }
                target.setStringValue(field);
            }
        }
        
        /**
         * Sets (as xml) the "field" attribute
         */
        public void xsetField(org.apache.xmlbeans.XmlString field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELD$0);
                }
                target.set(field);
            }
        }
    }
}
