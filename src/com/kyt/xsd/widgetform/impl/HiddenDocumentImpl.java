/*
 * An XML document type.
 * Localname: hidden
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.HiddenDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one hidden(@) element.
 *
 * This is a complex type.
 */
public class HiddenDocumentImpl extends com.kyt.xsd.widgetform.impl.AllFieldsDocumentImpl implements com.kyt.xsd.widgetform.HiddenDocument
{
    private static final long serialVersionUID = 1L;
    
    public HiddenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HIDDEN$0 = 
        new javax.xml.namespace.QName("", "hidden");
    
    
    /**
     * Gets the "hidden" element
     */
    public com.kyt.xsd.widgetform.HiddenDocument.Hidden getHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.HiddenDocument.Hidden target = null;
            target = (com.kyt.xsd.widgetform.HiddenDocument.Hidden)get_store().find_element_user(HIDDEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hidden" element
     */
    public void setHidden(com.kyt.xsd.widgetform.HiddenDocument.Hidden hidden)
    {
        generatedSetterHelperImpl(hidden, HIDDEN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "hidden" element
     */
    public com.kyt.xsd.widgetform.HiddenDocument.Hidden addNewHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.HiddenDocument.Hidden target = null;
            target = (com.kyt.xsd.widgetform.HiddenDocument.Hidden)get_store().add_element_user(HIDDEN$0);
            return target;
        }
    }
    /**
     * An XML hidden(@).
     *
     * This is a complex type.
     */
    public static class HiddenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.HiddenDocument.Hidden
    {
        private static final long serialVersionUID = 1L;
        
        public HiddenImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$0);
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
                return get_store().find_attribute_user(VALUE$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$0);
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
                get_store().remove_attribute(VALUE$0);
            }
        }
    }
}
