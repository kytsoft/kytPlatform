/*
 * An XML document type.
 * Localname: security
 * Namespace: 
 * Java type: com.kyt.xsd.securityconfig.SecurityDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.securityconfig.impl;
/**
 * A document containing one security(@) element.
 *
 * This is a complex type.
 */
public class SecurityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.securityconfig.SecurityDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecurityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITY$0 = 
        new javax.xml.namespace.QName("", "security");
    
    
    /**
     * Gets the "security" element
     */
    public com.kyt.xsd.securityconfig.SecurityDocument.Security getSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.securityconfig.SecurityDocument.Security target = null;
            target = (com.kyt.xsd.securityconfig.SecurityDocument.Security)get_store().find_element_user(SECURITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "security" element
     */
    public void setSecurity(com.kyt.xsd.securityconfig.SecurityDocument.Security security)
    {
        generatedSetterHelperImpl(security, SECURITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "security" element
     */
    public com.kyt.xsd.securityconfig.SecurityDocument.Security addNewSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.securityconfig.SecurityDocument.Security target = null;
            target = (com.kyt.xsd.securityconfig.SecurityDocument.Security)get_store().add_element_user(SECURITY$0);
            return target;
        }
    }
    /**
     * An XML security(@).
     *
     * This is a complex type.
     */
    public static class SecurityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.securityconfig.SecurityDocument.Security
    {
        private static final long serialVersionUID = 1L;
        
        public SecurityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName CLASS1$2 = 
            new javax.xml.namespace.QName("", "class");
        
        
        /**
         * Gets the "name" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(org.apache.xmlbeans.XmlAnySimpleType name)
        {
            generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "name" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Gets the "class" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(CLASS1$2);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "class" attribute
         */
        public boolean isSetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLASS1$2) != null;
            }
        }
        
        /**
         * Sets the "class" attribute
         */
        public void setClass1(org.apache.xmlbeans.XmlAnySimpleType class1)
        {
            generatedSetterHelperImpl(class1, CLASS1$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "class" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(CLASS1$2);
                return target;
            }
        }
        
        /**
         * Unsets the "class" attribute
         */
        public void unsetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLASS1$2);
            }
        }
    }
}
