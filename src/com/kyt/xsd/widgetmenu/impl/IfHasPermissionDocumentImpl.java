/*
 * An XML document type.
 * Localname: if-has-permission
 * Namespace: 
 * Java type: com.kyt.xsd.widgetmenu.IfHasPermissionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetmenu.impl;
/**
 * A document containing one if-has-permission(@) element.
 *
 * This is a complex type.
 */
public class IfHasPermissionDocumentImpl extends com.kyt.xsd.widgetmenu.impl.AllConditionalsDocumentImpl implements com.kyt.xsd.widgetmenu.IfHasPermissionDocument
{
    private static final long serialVersionUID = 1L;
    
    public IfHasPermissionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IFHASPERMISSION$0 = 
        new javax.xml.namespace.QName("", "if-has-permission");
    
    
    /**
     * Gets the "if-has-permission" element
     */
    public com.kyt.xsd.widgetmenu.IfHasPermissionDocument.IfHasPermission getIfHasPermission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetmenu.IfHasPermissionDocument.IfHasPermission target = null;
            target = (com.kyt.xsd.widgetmenu.IfHasPermissionDocument.IfHasPermission)get_store().find_element_user(IFHASPERMISSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "if-has-permission" element
     */
    public void setIfHasPermission(com.kyt.xsd.widgetmenu.IfHasPermissionDocument.IfHasPermission ifHasPermission)
    {
        generatedSetterHelperImpl(ifHasPermission, IFHASPERMISSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "if-has-permission" element
     */
    public com.kyt.xsd.widgetmenu.IfHasPermissionDocument.IfHasPermission addNewIfHasPermission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetmenu.IfHasPermissionDocument.IfHasPermission target = null;
            target = (com.kyt.xsd.widgetmenu.IfHasPermissionDocument.IfHasPermission)get_store().add_element_user(IFHASPERMISSION$0);
            return target;
        }
    }
    /**
     * An XML if-has-permission(@).
     *
     * This is a complex type.
     */
    public static class IfHasPermissionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetmenu.IfHasPermissionDocument.IfHasPermission
    {
        private static final long serialVersionUID = 1L;
        
        public IfHasPermissionImpl(org.apache.xmlbeans.SchemaType sType)
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
