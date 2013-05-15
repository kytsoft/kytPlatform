/*
 * An XML document type.
 * Localname: exclude
 * Namespace: 
 * Java type: com.kyt.xsd.services.ExcludeDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.services.impl;
/**
 * A document containing one exclude(@) element.
 *
 * This is a complex type.
 */
public class ExcludeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.ExcludeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExcludeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCLUDE$0 = 
        new javax.xml.namespace.QName("", "exclude");
    
    
    /**
     * Gets the "exclude" element
     */
    public com.kyt.xsd.services.ExcludeDocument.Exclude getExclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.ExcludeDocument.Exclude target = null;
            target = (com.kyt.xsd.services.ExcludeDocument.Exclude)get_store().find_element_user(EXCLUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "exclude" element
     */
    public void setExclude(com.kyt.xsd.services.ExcludeDocument.Exclude exclude)
    {
        generatedSetterHelperImpl(exclude, EXCLUDE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "exclude" element
     */
    public com.kyt.xsd.services.ExcludeDocument.Exclude addNewExclude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.ExcludeDocument.Exclude target = null;
            target = (com.kyt.xsd.services.ExcludeDocument.Exclude)get_store().add_element_user(EXCLUDE$0);
            return target;
        }
    }
    /**
     * An XML exclude(@).
     *
     * This is a complex type.
     */
    public static class ExcludeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.ExcludeDocument.Exclude
    {
        private static final long serialVersionUID = 1L;
        
        public ExcludeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELDNAME$0 = 
            new javax.xml.namespace.QName("", "field-name");
        
        
        /**
         * Gets the "field-name" attribute
         */
        public java.lang.String getFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "field-name" attribute
         */
        public void setFieldName(java.lang.String fieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDNAME$0);
                }
                target.setStringValue(fieldName);
            }
        }
        
        /**
         * Sets (as xml) the "field-name" attribute
         */
        public void xsetFieldName(org.apache.xmlbeans.XmlString fieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDNAME$0);
                }
                target.set(fieldName);
            }
        }
    }
}
