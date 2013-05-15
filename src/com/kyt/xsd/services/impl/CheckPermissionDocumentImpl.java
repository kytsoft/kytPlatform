/*
 * An XML document type.
 * Localname: check-permission
 * Namespace: 
 * Java type: com.kyt.xsd.services.CheckPermissionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.services.impl;
/**
 * A document containing one check-permission(@) element.
 *
 * This is a complex type.
 */
public class CheckPermissionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.CheckPermissionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CheckPermissionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKPERMISSION$0 = 
        new javax.xml.namespace.QName("", "check-permission");
    
    
    /**
     * Gets the "check-permission" element
     */
    public com.kyt.xsd.services.CheckPermissionDocument.CheckPermission getCheckPermission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.CheckPermissionDocument.CheckPermission target = null;
            target = (com.kyt.xsd.services.CheckPermissionDocument.CheckPermission)get_store().find_element_user(CHECKPERMISSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "check-permission" element
     */
    public void setCheckPermission(com.kyt.xsd.services.CheckPermissionDocument.CheckPermission checkPermission)
    {
        generatedSetterHelperImpl(checkPermission, CHECKPERMISSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "check-permission" element
     */
    public com.kyt.xsd.services.CheckPermissionDocument.CheckPermission addNewCheckPermission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.CheckPermissionDocument.CheckPermission target = null;
            target = (com.kyt.xsd.services.CheckPermissionDocument.CheckPermission)get_store().add_element_user(CHECKPERMISSION$0);
            return target;
        }
    }
    /**
     * An XML check-permission(@).
     *
     * This is a complex type.
     */
    public static class CheckPermissionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.CheckPermissionDocument.CheckPermission
    {
        private static final long serialVersionUID = 1L;
        
        public CheckPermissionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PERMISSION$0 = 
            new javax.xml.namespace.QName("", "permission");
        private static final javax.xml.namespace.QName ACTION$2 = 
            new javax.xml.namespace.QName("", "action");
        
        
        /**
         * Gets the "permission" attribute
         */
        public java.lang.String getPermission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERMISSION$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "permission" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPermission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERMISSION$0);
                return target;
            }
        }
        
        /**
         * Sets the "permission" attribute
         */
        public void setPermission(java.lang.String permission)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERMISSION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERMISSION$0);
                }
                target.setStringValue(permission);
            }
        }
        
        /**
         * Sets (as xml) the "permission" attribute
         */
        public void xsetPermission(org.apache.xmlbeans.XmlString permission)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERMISSION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PERMISSION$0);
                }
                target.set(permission);
            }
        }
        
        /**
         * Gets the "action" attribute
         */
        public java.lang.String getAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "action" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$2);
                return target;
            }
        }
        
        /**
         * True if has "action" attribute
         */
        public boolean isSetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ACTION$2) != null;
            }
        }
        
        /**
         * Sets the "action" attribute
         */
        public void setAction(java.lang.String action)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$2);
                }
                target.setStringValue(action);
            }
        }
        
        /**
         * Sets (as xml) the "action" attribute
         */
        public void xsetAction(org.apache.xmlbeans.XmlString action)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACTION$2);
                }
                target.set(action);
            }
        }
        
        /**
         * Unsets the "action" attribute
         */
        public void unsetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ACTION$2);
            }
        }
    }
}
