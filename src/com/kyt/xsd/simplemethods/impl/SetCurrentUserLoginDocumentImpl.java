/*
 * An XML document type.
 * Localname: set-current-user-login
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.SetCurrentUserLoginDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one set-current-user-login(@) element.
 *
 * This is a complex type.
 */
public class SetCurrentUserLoginDocumentImpl extends com.kyt.xsd.simplemethods.impl.OtherOperationsDocumentImpl implements com.kyt.xsd.simplemethods.SetCurrentUserLoginDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetCurrentUserLoginDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETCURRENTUSERLOGIN$0 = 
        new javax.xml.namespace.QName("", "set-current-user-login");
    
    
    /**
     * Gets the "set-current-user-login" element
     */
    public com.kyt.xsd.simplemethods.SetCurrentUserLoginDocument.SetCurrentUserLogin getSetCurrentUserLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.SetCurrentUserLoginDocument.SetCurrentUserLogin target = null;
            target = (com.kyt.xsd.simplemethods.SetCurrentUserLoginDocument.SetCurrentUserLogin)get_store().find_element_user(SETCURRENTUSERLOGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "set-current-user-login" element
     */
    public void setSetCurrentUserLogin(com.kyt.xsd.simplemethods.SetCurrentUserLoginDocument.SetCurrentUserLogin setCurrentUserLogin)
    {
        generatedSetterHelperImpl(setCurrentUserLogin, SETCURRENTUSERLOGIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "set-current-user-login" element
     */
    public com.kyt.xsd.simplemethods.SetCurrentUserLoginDocument.SetCurrentUserLogin addNewSetCurrentUserLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.SetCurrentUserLoginDocument.SetCurrentUserLogin target = null;
            target = (com.kyt.xsd.simplemethods.SetCurrentUserLoginDocument.SetCurrentUserLogin)get_store().add_element_user(SETCURRENTUSERLOGIN$0);
            return target;
        }
    }
    /**
     * An XML set-current-user-login(@).
     *
     * This is a complex type.
     */
    public static class SetCurrentUserLoginImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.SetCurrentUserLoginDocument.SetCurrentUserLogin
    {
        private static final long serialVersionUID = 1L;
        
        public SetCurrentUserLoginImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUEFIELD$0 = 
            new javax.xml.namespace.QName("", "value-field");
        
        
        /**
         * Gets the "value-field" attribute
         */
        public java.lang.String getValueField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUEFIELD$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value-field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValueField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUEFIELD$0);
                return target;
            }
        }
        
        /**
         * Sets the "value-field" attribute
         */
        public void setValueField(java.lang.String valueField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUEFIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUEFIELD$0);
                }
                target.setStringValue(valueField);
            }
        }
        
        /**
         * Sets (as xml) the "value-field" attribute
         */
        public void xsetValueField(org.apache.xmlbeans.XmlString valueField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUEFIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUEFIELD$0);
                }
                target.set(valueField);
            }
        }
    }
}
