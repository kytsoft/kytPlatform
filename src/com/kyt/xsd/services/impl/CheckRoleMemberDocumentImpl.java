/*
 * An XML document type.
 * Localname: check-role-member
 * Namespace: 
 * Java type: com.kyt.xsd.services.CheckRoleMemberDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.services.impl;
/**
 * A document containing one check-role-member(@) element.
 *
 * This is a complex type.
 */
public class CheckRoleMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.CheckRoleMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public CheckRoleMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKROLEMEMBER$0 = 
        new javax.xml.namespace.QName("", "check-role-member");
    
    
    /**
     * Gets the "check-role-member" element
     */
    public com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember getCheckRoleMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember target = null;
            target = (com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember)get_store().find_element_user(CHECKROLEMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "check-role-member" element
     */
    public void setCheckRoleMember(com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember checkRoleMember)
    {
        generatedSetterHelperImpl(checkRoleMember, CHECKROLEMEMBER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "check-role-member" element
     */
    public com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember addNewCheckRoleMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember target = null;
            target = (com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember)get_store().add_element_user(CHECKROLEMEMBER$0);
            return target;
        }
    }
    /**
     * An XML check-role-member(@).
     *
     * This is a complex type.
     */
    public static class CheckRoleMemberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember
    {
        private static final long serialVersionUID = 1L;
        
        public CheckRoleMemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROLETYPE$0 = 
            new javax.xml.namespace.QName("", "role-type");
        
        
        /**
         * Gets the "role-type" attribute
         */
        public java.lang.String getRoleType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLETYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "role-type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRoleType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROLETYPE$0);
                return target;
            }
        }
        
        /**
         * Sets the "role-type" attribute
         */
        public void setRoleType(java.lang.String roleType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLETYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLETYPE$0);
                }
                target.setStringValue(roleType);
            }
        }
        
        /**
         * Sets (as xml) the "role-type" attribute
         */
        public void xsetRoleType(org.apache.xmlbeans.XmlString roleType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROLETYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROLETYPE$0);
                }
                target.set(roleType);
            }
        }
    }
}
