/*
 * An XML document type.
 * Localname: field-to-request
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.FieldToRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one field-to-request(@) element.
 *
 * This is a complex type.
 */
public class FieldToRequestDocumentImpl extends com.kyt.xsd.simplemethods.impl.EventOperationsDocumentImpl implements com.kyt.xsd.simplemethods.FieldToRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public FieldToRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDTOREQUEST$0 = 
        new javax.xml.namespace.QName("", "field-to-request");
    
    
    /**
     * Gets the "field-to-request" element
     */
    public com.kyt.xsd.simplemethods.FieldToRequestDocument.FieldToRequest getFieldToRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.FieldToRequestDocument.FieldToRequest target = null;
            target = (com.kyt.xsd.simplemethods.FieldToRequestDocument.FieldToRequest)get_store().find_element_user(FIELDTOREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "field-to-request" element
     */
    public void setFieldToRequest(com.kyt.xsd.simplemethods.FieldToRequestDocument.FieldToRequest fieldToRequest)
    {
        generatedSetterHelperImpl(fieldToRequest, FIELDTOREQUEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "field-to-request" element
     */
    public com.kyt.xsd.simplemethods.FieldToRequestDocument.FieldToRequest addNewFieldToRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.FieldToRequestDocument.FieldToRequest target = null;
            target = (com.kyt.xsd.simplemethods.FieldToRequestDocument.FieldToRequest)get_store().add_element_user(FIELDTOREQUEST$0);
            return target;
        }
    }
    /**
     * An XML field-to-request(@).
     *
     * This is a complex type.
     */
    public static class FieldToRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.FieldToRequestDocument.FieldToRequest
    {
        private static final long serialVersionUID = 1L;
        
        public FieldToRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELD$0 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName REQUESTNAME$2 = 
            new javax.xml.namespace.QName("", "request-name");
        
        
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
        
        /**
         * Gets the "request-name" attribute
         */
        public java.lang.String getRequestName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "request-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRequestName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUESTNAME$2);
                return target;
            }
        }
        
        /**
         * True if has "request-name" attribute
         */
        public boolean isSetRequestName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUESTNAME$2) != null;
            }
        }
        
        /**
         * Sets the "request-name" attribute
         */
        public void setRequestName(java.lang.String requestName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTNAME$2);
                }
                target.setStringValue(requestName);
            }
        }
        
        /**
         * Sets (as xml) the "request-name" attribute
         */
        public void xsetRequestName(org.apache.xmlbeans.XmlString requestName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUESTNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REQUESTNAME$2);
                }
                target.set(requestName);
            }
        }
        
        /**
         * Unsets the "request-name" attribute
         */
        public void unsetRequestName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUESTNAME$2);
            }
        }
    }
}
