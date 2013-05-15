/*
 * An XML document type.
 * Localname: webapp
 * Namespace: 
 * Java type: com.kyt.xsd.ofbizcomponent.WebappDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.ofbizcomponent.impl;
/**
 * A document containing one webapp(@) element.
 *
 * This is a complex type.
 */
public class WebappDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.WebappDocument
{
    private static final long serialVersionUID = 1L;
    
    public WebappDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBAPP$0 = 
        new javax.xml.namespace.QName("", "webapp");
    
    
    /**
     * Gets the "webapp" element
     */
    public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp getWebapp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp target = null;
            target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp)get_store().find_element_user(WEBAPP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "webapp" element
     */
    public void setWebapp(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp webapp)
    {
        generatedSetterHelperImpl(webapp, WEBAPP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "webapp" element
     */
    public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp addNewWebapp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp target = null;
            target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp)get_store().add_element_user(WEBAPP$0);
            return target;
        }
    }
    /**
     * An XML webapp(@).
     *
     * This is a complex type.
     */
    public static class WebappImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp
    {
        private static final long serialVersionUID = 1L;
        
        public WebappImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VIRTUALHOST$0 = 
            new javax.xml.namespace.QName("", "virtual-host");
        private static final javax.xml.namespace.QName INITPARAM$2 = 
            new javax.xml.namespace.QName("", "init-param");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName TITLE$6 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName DESCRIPTION$8 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName MENUNAME$10 = 
            new javax.xml.namespace.QName("", "menu-name");
        private static final javax.xml.namespace.QName POSITION$12 = 
            new javax.xml.namespace.QName("", "position");
        private static final javax.xml.namespace.QName SERVER$14 = 
            new javax.xml.namespace.QName("", "server");
        private static final javax.xml.namespace.QName LOCATION$16 = 
            new javax.xml.namespace.QName("", "location");
        private static final javax.xml.namespace.QName MOUNTPOINT$18 = 
            new javax.xml.namespace.QName("", "mount-point");
        private static final javax.xml.namespace.QName BASEPERMISSION$20 = 
            new javax.xml.namespace.QName("", "base-permission");
        private static final javax.xml.namespace.QName PRIVILEGED$22 = 
            new javax.xml.namespace.QName("", "privileged");
        private static final javax.xml.namespace.QName APPBARDISPLAY$24 = 
            new javax.xml.namespace.QName("", "app-bar-display");
        private static final javax.xml.namespace.QName SESSIONCOOKIEACCEPTED$26 = 
            new javax.xml.namespace.QName("", "session-cookie-accepted");
        
        
        /**
         * Gets array of all "virtual-host" elements
         */
        public com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost[] getVirtualHostArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VIRTUALHOST$0, targetList);
                com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost[] result = new com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "virtual-host" element
         */
        public com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost getVirtualHostArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost target = null;
                target = (com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost)get_store().find_element_user(VIRTUALHOST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "virtual-host" element
         */
        public int sizeOfVirtualHostArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIRTUALHOST$0);
            }
        }
        
        /**
         * Sets array of all "virtual-host" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setVirtualHostArray(com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost[] virtualHostArray)
        {
            check_orphaned();
            arraySetterHelper(virtualHostArray, VIRTUALHOST$0);
        }
        
        /**
         * Sets ith "virtual-host" element
         */
        public void setVirtualHostArray(int i, com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost virtualHost)
        {
            generatedSetterHelperImpl(virtualHost, VIRTUALHOST$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "virtual-host" element
         */
        public com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost insertNewVirtualHost(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost target = null;
                target = (com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost)get_store().insert_element_user(VIRTUALHOST$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "virtual-host" element
         */
        public com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost addNewVirtualHost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost target = null;
                target = (com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost)get_store().add_element_user(VIRTUALHOST$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "virtual-host" element
         */
        public void removeVirtualHost(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIRTUALHOST$0, i);
            }
        }
        
        /**
         * Gets array of all "init-param" elements
         */
        public com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam[] getInitParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INITPARAM$2, targetList);
                com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam[] result = new com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "init-param" element
         */
        public com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam getInitParamArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam target = null;
                target = (com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam)get_store().find_element_user(INITPARAM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "init-param" element
         */
        public int sizeOfInitParamArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INITPARAM$2);
            }
        }
        
        /**
         * Sets array of all "init-param" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setInitParamArray(com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam[] initParamArray)
        {
            check_orphaned();
            arraySetterHelper(initParamArray, INITPARAM$2);
        }
        
        /**
         * Sets ith "init-param" element
         */
        public void setInitParamArray(int i, com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam initParam)
        {
            generatedSetterHelperImpl(initParam, INITPARAM$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "init-param" element
         */
        public com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam insertNewInitParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam target = null;
                target = (com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam)get_store().insert_element_user(INITPARAM$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "init-param" element
         */
        public com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam addNewInitParam()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam target = null;
                target = (com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam)get_store().add_element_user(INITPARAM$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "init-param" element
         */
        public void removeInitParam(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INITPARAM$2, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "title" attribute
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$6);
                return target;
            }
        }
        
        /**
         * True if has "title" attribute
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TITLE$6) != null;
            }
        }
        
        /**
         * Sets the "title" attribute
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$6);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" attribute
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$6);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "title" attribute
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TITLE$6);
            }
        }
        
        /**
         * Gets the "description" attribute
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$8);
                return target;
            }
        }
        
        /**
         * True if has "description" attribute
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESCRIPTION$8) != null;
            }
        }
        
        /**
         * Sets the "description" attribute
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$8);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" attribute
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$8);
                }
                target.set(description);
            }
        }
        
        /**
         * Unsets the "description" attribute
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESCRIPTION$8);
            }
        }
        
        /**
         * Gets the "menu-name" attribute
         */
        public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName.Enum getMenuName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MENUNAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MENUNAME$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "menu-name" attribute
         */
        public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName xgetMenuName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName target = null;
                target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName)get_store().find_attribute_user(MENUNAME$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName)get_default_attribute_value(MENUNAME$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "menu-name" attribute
         */
        public boolean isSetMenuName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MENUNAME$10) != null;
            }
        }
        
        /**
         * Sets the "menu-name" attribute
         */
        public void setMenuName(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName.Enum menuName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MENUNAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MENUNAME$10);
                }
                target.setEnumValue(menuName);
            }
        }
        
        /**
         * Sets (as xml) the "menu-name" attribute
         */
        public void xsetMenuName(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName menuName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName target = null;
                target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName)get_store().find_attribute_user(MENUNAME$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName)get_store().add_attribute_user(MENUNAME$10);
                }
                target.set(menuName);
            }
        }
        
        /**
         * Unsets the "menu-name" attribute
         */
        public void unsetMenuName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MENUNAME$10);
            }
        }
        
        /**
         * Gets the "position" attribute
         */
        public java.lang.String getPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "position" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSITION$12);
                return target;
            }
        }
        
        /**
         * True if has "position" attribute
         */
        public boolean isSetPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POSITION$12) != null;
            }
        }
        
        /**
         * Sets the "position" attribute
         */
        public void setPosition(java.lang.String position)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITION$12);
                }
                target.setStringValue(position);
            }
        }
        
        /**
         * Sets (as xml) the "position" attribute
         */
        public void xsetPosition(org.apache.xmlbeans.XmlString position)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POSITION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POSITION$12);
                }
                target.set(position);
            }
        }
        
        /**
         * Unsets the "position" attribute
         */
        public void unsetPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POSITION$12);
            }
        }
        
        /**
         * Gets the "server" attribute
         */
        public java.lang.String getServer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVER$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "server" attribute
         */
        public org.apache.xmlbeans.XmlString xgetServer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVER$14);
                return target;
            }
        }
        
        /**
         * Sets the "server" attribute
         */
        public void setServer(java.lang.String server)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVER$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVER$14);
                }
                target.setStringValue(server);
            }
        }
        
        /**
         * Sets (as xml) the "server" attribute
         */
        public void xsetServer(org.apache.xmlbeans.XmlString server)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVER$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERVER$14);
                }
                target.set(server);
            }
        }
        
        /**
         * Gets the "location" attribute
         */
        public java.lang.String getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "location" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$16);
                return target;
            }
        }
        
        /**
         * Sets the "location" attribute
         */
        public void setLocation(java.lang.String location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$16);
                }
                target.setStringValue(location);
            }
        }
        
        /**
         * Sets (as xml) the "location" attribute
         */
        public void xsetLocation(org.apache.xmlbeans.XmlString location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCATION$16);
                }
                target.set(location);
            }
        }
        
        /**
         * Gets the "mount-point" attribute
         */
        public java.lang.String getMountPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOUNTPOINT$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "mount-point" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMountPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MOUNTPOINT$18);
                return target;
            }
        }
        
        /**
         * True if has "mount-point" attribute
         */
        public boolean isSetMountPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MOUNTPOINT$18) != null;
            }
        }
        
        /**
         * Sets the "mount-point" attribute
         */
        public void setMountPoint(java.lang.String mountPoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOUNTPOINT$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOUNTPOINT$18);
                }
                target.setStringValue(mountPoint);
            }
        }
        
        /**
         * Sets (as xml) the "mount-point" attribute
         */
        public void xsetMountPoint(org.apache.xmlbeans.XmlString mountPoint)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MOUNTPOINT$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MOUNTPOINT$18);
                }
                target.set(mountPoint);
            }
        }
        
        /**
         * Unsets the "mount-point" attribute
         */
        public void unsetMountPoint()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MOUNTPOINT$18);
            }
        }
        
        /**
         * Gets the "base-permission" attribute
         */
        public java.lang.String getBasePermission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASEPERMISSION$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "base-permission" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBasePermission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BASEPERMISSION$20);
                return target;
            }
        }
        
        /**
         * True if has "base-permission" attribute
         */
        public boolean isSetBasePermission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BASEPERMISSION$20) != null;
            }
        }
        
        /**
         * Sets the "base-permission" attribute
         */
        public void setBasePermission(java.lang.String basePermission)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASEPERMISSION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASEPERMISSION$20);
                }
                target.setStringValue(basePermission);
            }
        }
        
        /**
         * Sets (as xml) the "base-permission" attribute
         */
        public void xsetBasePermission(org.apache.xmlbeans.XmlString basePermission)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BASEPERMISSION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BASEPERMISSION$20);
                }
                target.set(basePermission);
            }
        }
        
        /**
         * Unsets the "base-permission" attribute
         */
        public void unsetBasePermission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BASEPERMISSION$20);
            }
        }
        
        /**
         * Gets the "privileged" attribute
         */
        public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged.Enum getPrivileged()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIVILEGED$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRIVILEGED$22);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "privileged" attribute
         */
        public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged xgetPrivileged()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged target = null;
                target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged)get_store().find_attribute_user(PRIVILEGED$22);
                if (target == null)
                {
                    target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged)get_default_attribute_value(PRIVILEGED$22);
                }
                return target;
            }
        }
        
        /**
         * True if has "privileged" attribute
         */
        public boolean isSetPrivileged()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PRIVILEGED$22) != null;
            }
        }
        
        /**
         * Sets the "privileged" attribute
         */
        public void setPrivileged(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged.Enum privileged)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIVILEGED$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIVILEGED$22);
                }
                target.setEnumValue(privileged);
            }
        }
        
        /**
         * Sets (as xml) the "privileged" attribute
         */
        public void xsetPrivileged(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged privileged)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged target = null;
                target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged)get_store().find_attribute_user(PRIVILEGED$22);
                if (target == null)
                {
                    target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged)get_store().add_attribute_user(PRIVILEGED$22);
                }
                target.set(privileged);
            }
        }
        
        /**
         * Unsets the "privileged" attribute
         */
        public void unsetPrivileged()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PRIVILEGED$22);
            }
        }
        
        /**
         * Gets the "app-bar-display" attribute
         */
        public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay.Enum getAppBarDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPBARDISPLAY$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(APPBARDISPLAY$24);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "app-bar-display" attribute
         */
        public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay xgetAppBarDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay target = null;
                target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay)get_store().find_attribute_user(APPBARDISPLAY$24);
                if (target == null)
                {
                    target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay)get_default_attribute_value(APPBARDISPLAY$24);
                }
                return target;
            }
        }
        
        /**
         * True if has "app-bar-display" attribute
         */
        public boolean isSetAppBarDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(APPBARDISPLAY$24) != null;
            }
        }
        
        /**
         * Sets the "app-bar-display" attribute
         */
        public void setAppBarDisplay(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay.Enum appBarDisplay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(APPBARDISPLAY$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(APPBARDISPLAY$24);
                }
                target.setEnumValue(appBarDisplay);
            }
        }
        
        /**
         * Sets (as xml) the "app-bar-display" attribute
         */
        public void xsetAppBarDisplay(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay appBarDisplay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay target = null;
                target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay)get_store().find_attribute_user(APPBARDISPLAY$24);
                if (target == null)
                {
                    target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay)get_store().add_attribute_user(APPBARDISPLAY$24);
                }
                target.set(appBarDisplay);
            }
        }
        
        /**
         * Unsets the "app-bar-display" attribute
         */
        public void unsetAppBarDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(APPBARDISPLAY$24);
            }
        }
        
        /**
         * Gets the "session-cookie-accepted" attribute
         */
        public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted.Enum getSessionCookieAccepted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSIONCOOKIEACCEPTED$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SESSIONCOOKIEACCEPTED$26);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "session-cookie-accepted" attribute
         */
        public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted xgetSessionCookieAccepted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted target = null;
                target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted)get_store().find_attribute_user(SESSIONCOOKIEACCEPTED$26);
                if (target == null)
                {
                    target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted)get_default_attribute_value(SESSIONCOOKIEACCEPTED$26);
                }
                return target;
            }
        }
        
        /**
         * True if has "session-cookie-accepted" attribute
         */
        public boolean isSetSessionCookieAccepted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SESSIONCOOKIEACCEPTED$26) != null;
            }
        }
        
        /**
         * Sets the "session-cookie-accepted" attribute
         */
        public void setSessionCookieAccepted(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted.Enum sessionCookieAccepted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSIONCOOKIEACCEPTED$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SESSIONCOOKIEACCEPTED$26);
                }
                target.setEnumValue(sessionCookieAccepted);
            }
        }
        
        /**
         * Sets (as xml) the "session-cookie-accepted" attribute
         */
        public void xsetSessionCookieAccepted(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted sessionCookieAccepted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted target = null;
                target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted)get_store().find_attribute_user(SESSIONCOOKIEACCEPTED$26);
                if (target == null)
                {
                    target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted)get_store().add_attribute_user(SESSIONCOOKIEACCEPTED$26);
                }
                target.set(sessionCookieAccepted);
            }
        }
        
        /**
         * Unsets the "session-cookie-accepted" attribute
         */
        public void unsetSessionCookieAccepted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SESSIONCOOKIEACCEPTED$26);
            }
        }
        /**
         * An XML menu-name(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.ofbizcomponent.WebappDocument$Webapp$MenuName.
         */
        public static class MenuNameImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName
        {
            private static final long serialVersionUID = 1L;
            
            public MenuNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MenuNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML privileged(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.ofbizcomponent.WebappDocument$Webapp$Privileged.
         */
        public static class PrivilegedImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged
        {
            private static final long serialVersionUID = 1L;
            
            public PrivilegedImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PrivilegedImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML app-bar-display(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.ofbizcomponent.WebappDocument$Webapp$AppBarDisplay.
         */
        public static class AppBarDisplayImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay
        {
            private static final long serialVersionUID = 1L;
            
            public AppBarDisplayImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AppBarDisplayImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML session-cookie-accepted(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.ofbizcomponent.WebappDocument$Webapp$SessionCookieAccepted.
         */
        public static class SessionCookieAcceptedImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted
        {
            private static final long serialVersionUID = 1L;
            
            public SessionCookieAcceptedImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SessionCookieAcceptedImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
