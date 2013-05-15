/*
 * An XML document type.
 * Localname: now-date-to-env
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.NowDateToEnvDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one now-date-to-env(@) element.
 *
 * This is a complex type.
 */
public class NowDateToEnvDocumentImpl extends com.kyt.xsd.simplemethods.impl.OtherOperationsDocumentImpl implements com.kyt.xsd.simplemethods.NowDateToEnvDocument
{
    private static final long serialVersionUID = 1L;
    
    public NowDateToEnvDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOWDATETOENV$0 = 
        new javax.xml.namespace.QName("", "now-date-to-env");
    
    
    /**
     * Gets the "now-date-to-env" element
     */
    public com.kyt.xsd.simplemethods.NowDateToEnvDocument.NowDateToEnv getNowDateToEnv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.NowDateToEnvDocument.NowDateToEnv target = null;
            target = (com.kyt.xsd.simplemethods.NowDateToEnvDocument.NowDateToEnv)get_store().find_element_user(NOWDATETOENV$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "now-date-to-env" element
     */
    public void setNowDateToEnv(com.kyt.xsd.simplemethods.NowDateToEnvDocument.NowDateToEnv nowDateToEnv)
    {
        generatedSetterHelperImpl(nowDateToEnv, NOWDATETOENV$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "now-date-to-env" element
     */
    public com.kyt.xsd.simplemethods.NowDateToEnvDocument.NowDateToEnv addNewNowDateToEnv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.NowDateToEnvDocument.NowDateToEnv target = null;
            target = (com.kyt.xsd.simplemethods.NowDateToEnvDocument.NowDateToEnv)get_store().add_element_user(NOWDATETOENV$0);
            return target;
        }
    }
    /**
     * An XML now-date-to-env(@).
     *
     * This is a complex type.
     */
    public static class NowDateToEnvImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.NowDateToEnvDocument.NowDateToEnv
    {
        private static final long serialVersionUID = 1L;
        
        public NowDateToEnvImpl(org.apache.xmlbeans.SchemaType sType)
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
