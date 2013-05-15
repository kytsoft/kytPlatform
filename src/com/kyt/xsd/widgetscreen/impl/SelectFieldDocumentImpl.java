/*
 * An XML document type.
 * Localname: select-field
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.SelectFieldDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one select-field(@) element.
 *
 * This is a complex type.
 */
public class SelectFieldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.SelectFieldDocument
{
    private static final long serialVersionUID = 1L;
    
    public SelectFieldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SELECTFIELD$0 = 
        new javax.xml.namespace.QName("", "select-field");
    
    
    /**
     * Gets the "select-field" element
     */
    public com.kyt.xsd.widgetscreen.SelectFieldDocument.SelectField getSelectField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.SelectFieldDocument.SelectField target = null;
            target = (com.kyt.xsd.widgetscreen.SelectFieldDocument.SelectField)get_store().find_element_user(SELECTFIELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "select-field" element
     */
    public void setSelectField(com.kyt.xsd.widgetscreen.SelectFieldDocument.SelectField selectField)
    {
        generatedSetterHelperImpl(selectField, SELECTFIELD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "select-field" element
     */
    public com.kyt.xsd.widgetscreen.SelectFieldDocument.SelectField addNewSelectField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.SelectFieldDocument.SelectField target = null;
            target = (com.kyt.xsd.widgetscreen.SelectFieldDocument.SelectField)get_store().add_element_user(SELECTFIELD$0);
            return target;
        }
    }
    /**
     * An XML select-field(@).
     *
     * This is a complex type.
     */
    public static class SelectFieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.SelectFieldDocument.SelectField
    {
        private static final long serialVersionUID = 1L;
        
        public SelectFieldImpl(org.apache.xmlbeans.SchemaType sType)
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
