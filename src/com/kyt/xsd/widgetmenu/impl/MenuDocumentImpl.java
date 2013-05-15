/*
 * An XML document type.
 * Localname: menu
 * Namespace: 
 * Java type: com.kyt.xsd.widgetmenu.MenuDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetmenu.impl;
/**
 * A document containing one menu(@) element.
 *
 * This is a complex type.
 */
public class MenuDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetmenu.MenuDocument
{
    private static final long serialVersionUID = 1L;
    
    public MenuDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MENU$0 = 
        new javax.xml.namespace.QName("", "menu");
    
    
    /**
     * Gets the "menu" element
     */
    public com.kyt.xsd.widgetmenu.MenuDocument.Menu getMenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetmenu.MenuDocument.Menu target = null;
            target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu)get_store().find_element_user(MENU$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "menu" element
     */
    public void setMenu(com.kyt.xsd.widgetmenu.MenuDocument.Menu menu)
    {
        generatedSetterHelperImpl(menu, MENU$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "menu" element
     */
    public com.kyt.xsd.widgetmenu.MenuDocument.Menu addNewMenu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetmenu.MenuDocument.Menu target = null;
            target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu)get_store().add_element_user(MENU$0);
            return target;
        }
    }
    /**
     * An XML menu(@).
     *
     * This is a complex type.
     */
    public static class MenuImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetmenu.MenuDocument.Menu
    {
        private static final long serialVersionUID = 1L;
        
        public MenuImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACTIONS$0 = 
            new javax.xml.namespace.QName("", "actions");
        private static final javax.xml.namespace.QName MENUITEM$2 = 
            new javax.xml.namespace.QName("", "menu-item");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName ID$8 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName TITLE$10 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName TOOLTIP$12 = 
            new javax.xml.namespace.QName("", "tooltip");
        private static final javax.xml.namespace.QName DEFAULTENTITYNAME$14 = 
            new javax.xml.namespace.QName("", "default-entity-name");
        private static final javax.xml.namespace.QName DEFAULTTITLESTYLE$16 = 
            new javax.xml.namespace.QName("", "default-title-style");
        private static final javax.xml.namespace.QName DEFAULTWIDGETSTYLE$18 = 
            new javax.xml.namespace.QName("", "default-widget-style");
        private static final javax.xml.namespace.QName DEFAULTTOOLTIPSTYLE$20 = 
            new javax.xml.namespace.QName("", "default-tooltip-style");
        private static final javax.xml.namespace.QName DEFAULTSELECTEDSTYLE$22 = 
            new javax.xml.namespace.QName("", "default-selected-style");
        private static final javax.xml.namespace.QName DEFAULTALIGNSTYLE$24 = 
            new javax.xml.namespace.QName("", "default-align-style");
        private static final javax.xml.namespace.QName ORIENTATION$26 = 
            new javax.xml.namespace.QName("", "orientation");
        private static final javax.xml.namespace.QName EXTENDS$28 = 
            new javax.xml.namespace.QName("", "extends");
        private static final javax.xml.namespace.QName EXTENDSRESOURCE$30 = 
            new javax.xml.namespace.QName("", "extends-resource");
        private static final javax.xml.namespace.QName DEFAULTMENUITEMNAME$32 = 
            new javax.xml.namespace.QName("", "default-menu-item-name");
        private static final javax.xml.namespace.QName DEFAULTASSOCIATEDCONTENTID$34 = 
            new javax.xml.namespace.QName("", "default-associated-content-id");
        private static final javax.xml.namespace.QName DEFAULTHIDEIFSELECTED$36 = 
            new javax.xml.namespace.QName("", "default-hide-if-selected");
        private static final javax.xml.namespace.QName MENUWIDTH$38 = 
            new javax.xml.namespace.QName("", "menu-width");
        private static final javax.xml.namespace.QName DEFAULTCELLWIDTH$40 = 
            new javax.xml.namespace.QName("", "default-cell-width");
        private static final javax.xml.namespace.QName DEFAULTDISABLEDTITLESTYLE$42 = 
            new javax.xml.namespace.QName("", "default-disabled-title-style");
        private static final javax.xml.namespace.QName SELECTEDMENUITEMCONTEXTFIELDNAME$44 = 
            new javax.xml.namespace.QName("", "selected-menuitem-context-field-name");
        private static final javax.xml.namespace.QName MENUCONTAINERSTYLE$46 = 
            new javax.xml.namespace.QName("", "menu-container-style");
        private static final javax.xml.namespace.QName DEFAULTALIGN$48 = 
            new javax.xml.namespace.QName("", "default-align");
        private static final javax.xml.namespace.QName FILLSTYLE$50 = 
            new javax.xml.namespace.QName("", "fill-style");
        private static final javax.xml.namespace.QName DEFAULTPERMISSIONOPERATION$52 = 
            new javax.xml.namespace.QName("", "default-permission-operation");
        private static final javax.xml.namespace.QName DEFAULTPERMISSIONENTITYACTION$54 = 
            new javax.xml.namespace.QName("", "default-permission-entity-action");
        
        
        /**
         * Gets the "actions" element
         */
        public com.kyt.xsd.widgetmenu.ActionsDocument.Actions getActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetmenu.ActionsDocument.Actions target = null;
                target = (com.kyt.xsd.widgetmenu.ActionsDocument.Actions)get_store().find_element_user(ACTIONS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "actions" element
         */
        public boolean isSetActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACTIONS$0) != 0;
            }
        }
        
        /**
         * Sets the "actions" element
         */
        public void setActions(com.kyt.xsd.widgetmenu.ActionsDocument.Actions actions)
        {
            generatedSetterHelperImpl(actions, ACTIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "actions" element
         */
        public com.kyt.xsd.widgetmenu.ActionsDocument.Actions addNewActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetmenu.ActionsDocument.Actions target = null;
                target = (com.kyt.xsd.widgetmenu.ActionsDocument.Actions)get_store().add_element_user(ACTIONS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "actions" element
         */
        public void unsetActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACTIONS$0, 0);
            }
        }
        
        /**
         * Gets array of all "menu-item" elements
         */
        public com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem[] getMenuItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MENUITEM$2, targetList);
                com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem[] result = new com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "menu-item" element
         */
        public com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem getMenuItemArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem target = null;
                target = (com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem)get_store().find_element_user(MENUITEM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "menu-item" element
         */
        public int sizeOfMenuItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MENUITEM$2);
            }
        }
        
        /**
         * Sets array of all "menu-item" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setMenuItemArray(com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem[] menuItemArray)
        {
            check_orphaned();
            arraySetterHelper(menuItemArray, MENUITEM$2);
        }
        
        /**
         * Sets ith "menu-item" element
         */
        public void setMenuItemArray(int i, com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem menuItem)
        {
            generatedSetterHelperImpl(menuItem, MENUITEM$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "menu-item" element
         */
        public com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem insertNewMenuItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem target = null;
                target = (com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem)get_store().insert_element_user(MENUITEM$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "menu-item" element
         */
        public com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem addNewMenuItem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem target = null;
                target = (com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem)get_store().add_element_user(MENUITEM$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "menu-item" element
         */
        public void removeMenuItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MENUITEM$2, i);
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
         * Gets the "type" attribute
         */
        public com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$6);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type target = null;
                target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type)get_default_attribute_value(TYPE$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$6) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type target = null;
                target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type)get_store().add_attribute_user(TYPE$6);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$6);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$8);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$8) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$8);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$10);
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
                return get_store().find_attribute_user(TITLE$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$10);
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
                get_store().remove_attribute(TITLE$10);
            }
        }
        
        /**
         * Gets the "tooltip" attribute
         */
        public java.lang.String getTooltip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOOLTIP$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tooltip" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTooltip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOOLTIP$12);
                return target;
            }
        }
        
        /**
         * True if has "tooltip" attribute
         */
        public boolean isSetTooltip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TOOLTIP$12) != null;
            }
        }
        
        /**
         * Sets the "tooltip" attribute
         */
        public void setTooltip(java.lang.String tooltip)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOOLTIP$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOOLTIP$12);
                }
                target.setStringValue(tooltip);
            }
        }
        
        /**
         * Sets (as xml) the "tooltip" attribute
         */
        public void xsetTooltip(org.apache.xmlbeans.XmlString tooltip)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOOLTIP$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOOLTIP$12);
                }
                target.set(tooltip);
            }
        }
        
        /**
         * Unsets the "tooltip" attribute
         */
        public void unsetTooltip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TOOLTIP$12);
            }
        }
        
        /**
         * Gets the "default-entity-name" attribute
         */
        public java.lang.String getDefaultEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTENTITYNAME$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-entity-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTENTITYNAME$14);
                return target;
            }
        }
        
        /**
         * True if has "default-entity-name" attribute
         */
        public boolean isSetDefaultEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTENTITYNAME$14) != null;
            }
        }
        
        /**
         * Sets the "default-entity-name" attribute
         */
        public void setDefaultEntityName(java.lang.String defaultEntityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTENTITYNAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTENTITYNAME$14);
                }
                target.setStringValue(defaultEntityName);
            }
        }
        
        /**
         * Sets (as xml) the "default-entity-name" attribute
         */
        public void xsetDefaultEntityName(org.apache.xmlbeans.XmlString defaultEntityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTENTITYNAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTENTITYNAME$14);
                }
                target.set(defaultEntityName);
            }
        }
        
        /**
         * Unsets the "default-entity-name" attribute
         */
        public void unsetDefaultEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTENTITYNAME$14);
            }
        }
        
        /**
         * Gets the "default-title-style" attribute
         */
        public java.lang.String getDefaultTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTITLESTYLE$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-title-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTITLESTYLE$16);
                return target;
            }
        }
        
        /**
         * True if has "default-title-style" attribute
         */
        public boolean isSetDefaultTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTTITLESTYLE$16) != null;
            }
        }
        
        /**
         * Sets the "default-title-style" attribute
         */
        public void setDefaultTitleStyle(java.lang.String defaultTitleStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTITLESTYLE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTTITLESTYLE$16);
                }
                target.setStringValue(defaultTitleStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-title-style" attribute
         */
        public void xsetDefaultTitleStyle(org.apache.xmlbeans.XmlString defaultTitleStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTITLESTYLE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTTITLESTYLE$16);
                }
                target.set(defaultTitleStyle);
            }
        }
        
        /**
         * Unsets the "default-title-style" attribute
         */
        public void unsetDefaultTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTTITLESTYLE$16);
            }
        }
        
        /**
         * Gets the "default-widget-style" attribute
         */
        public java.lang.String getDefaultWidgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTWIDGETSTYLE$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-widget-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultWidgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTWIDGETSTYLE$18);
                return target;
            }
        }
        
        /**
         * True if has "default-widget-style" attribute
         */
        public boolean isSetDefaultWidgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTWIDGETSTYLE$18) != null;
            }
        }
        
        /**
         * Sets the "default-widget-style" attribute
         */
        public void setDefaultWidgetStyle(java.lang.String defaultWidgetStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTWIDGETSTYLE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTWIDGETSTYLE$18);
                }
                target.setStringValue(defaultWidgetStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-widget-style" attribute
         */
        public void xsetDefaultWidgetStyle(org.apache.xmlbeans.XmlString defaultWidgetStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTWIDGETSTYLE$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTWIDGETSTYLE$18);
                }
                target.set(defaultWidgetStyle);
            }
        }
        
        /**
         * Unsets the "default-widget-style" attribute
         */
        public void unsetDefaultWidgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTWIDGETSTYLE$18);
            }
        }
        
        /**
         * Gets the "default-tooltip-style" attribute
         */
        public java.lang.String getDefaultTooltipStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTOOLTIPSTYLE$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-tooltip-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultTooltipStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTOOLTIPSTYLE$20);
                return target;
            }
        }
        
        /**
         * True if has "default-tooltip-style" attribute
         */
        public boolean isSetDefaultTooltipStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTTOOLTIPSTYLE$20) != null;
            }
        }
        
        /**
         * Sets the "default-tooltip-style" attribute
         */
        public void setDefaultTooltipStyle(java.lang.String defaultTooltipStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTOOLTIPSTYLE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTTOOLTIPSTYLE$20);
                }
                target.setStringValue(defaultTooltipStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-tooltip-style" attribute
         */
        public void xsetDefaultTooltipStyle(org.apache.xmlbeans.XmlString defaultTooltipStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTOOLTIPSTYLE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTTOOLTIPSTYLE$20);
                }
                target.set(defaultTooltipStyle);
            }
        }
        
        /**
         * Unsets the "default-tooltip-style" attribute
         */
        public void unsetDefaultTooltipStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTTOOLTIPSTYLE$20);
            }
        }
        
        /**
         * Gets the "default-selected-style" attribute
         */
        public java.lang.String getDefaultSelectedStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSELECTEDSTYLE$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-selected-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultSelectedStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTSELECTEDSTYLE$22);
                return target;
            }
        }
        
        /**
         * True if has "default-selected-style" attribute
         */
        public boolean isSetDefaultSelectedStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTSELECTEDSTYLE$22) != null;
            }
        }
        
        /**
         * Sets the "default-selected-style" attribute
         */
        public void setDefaultSelectedStyle(java.lang.String defaultSelectedStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSELECTEDSTYLE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTSELECTEDSTYLE$22);
                }
                target.setStringValue(defaultSelectedStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-selected-style" attribute
         */
        public void xsetDefaultSelectedStyle(org.apache.xmlbeans.XmlString defaultSelectedStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTSELECTEDSTYLE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTSELECTEDSTYLE$22);
                }
                target.set(defaultSelectedStyle);
            }
        }
        
        /**
         * Unsets the "default-selected-style" attribute
         */
        public void unsetDefaultSelectedStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTSELECTEDSTYLE$22);
            }
        }
        
        /**
         * Gets the "default-align-style" attribute
         */
        public java.lang.String getDefaultAlignStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTALIGNSTYLE$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-align-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultAlignStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTALIGNSTYLE$24);
                return target;
            }
        }
        
        /**
         * True if has "default-align-style" attribute
         */
        public boolean isSetDefaultAlignStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTALIGNSTYLE$24) != null;
            }
        }
        
        /**
         * Sets the "default-align-style" attribute
         */
        public void setDefaultAlignStyle(java.lang.String defaultAlignStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTALIGNSTYLE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTALIGNSTYLE$24);
                }
                target.setStringValue(defaultAlignStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-align-style" attribute
         */
        public void xsetDefaultAlignStyle(org.apache.xmlbeans.XmlString defaultAlignStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTALIGNSTYLE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTALIGNSTYLE$24);
                }
                target.set(defaultAlignStyle);
            }
        }
        
        /**
         * Unsets the "default-align-style" attribute
         */
        public void unsetDefaultAlignStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTALIGNSTYLE$24);
            }
        }
        
        /**
         * Gets the "orientation" attribute
         */
        public com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation.Enum getOrientation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ORIENTATION$26);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "orientation" attribute
         */
        public com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation xgetOrientation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation target = null;
                target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation)get_store().find_attribute_user(ORIENTATION$26);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation)get_default_attribute_value(ORIENTATION$26);
                }
                return target;
            }
        }
        
        /**
         * True if has "orientation" attribute
         */
        public boolean isSetOrientation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ORIENTATION$26) != null;
            }
        }
        
        /**
         * Sets the "orientation" attribute
         */
        public void setOrientation(com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation.Enum orientation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIENTATION$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIENTATION$26);
                }
                target.setEnumValue(orientation);
            }
        }
        
        /**
         * Sets (as xml) the "orientation" attribute
         */
        public void xsetOrientation(com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation orientation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation target = null;
                target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation)get_store().find_attribute_user(ORIENTATION$26);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation)get_store().add_attribute_user(ORIENTATION$26);
                }
                target.set(orientation);
            }
        }
        
        /**
         * Unsets the "orientation" attribute
         */
        public void unsetOrientation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ORIENTATION$26);
            }
        }
        
        /**
         * Gets the "extends" attribute
         */
        public java.lang.String getExtends()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDS$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "extends" attribute
         */
        public org.apache.xmlbeans.XmlString xgetExtends()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXTENDS$28);
                return target;
            }
        }
        
        /**
         * True if has "extends" attribute
         */
        public boolean isSetExtends()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXTENDS$28) != null;
            }
        }
        
        /**
         * Sets the "extends" attribute
         */
        public void setExtends(java.lang.String xextends)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENDS$28);
                }
                target.setStringValue(xextends);
            }
        }
        
        /**
         * Sets (as xml) the "extends" attribute
         */
        public void xsetExtends(org.apache.xmlbeans.XmlString xextends)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXTENDS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXTENDS$28);
                }
                target.set(xextends);
            }
        }
        
        /**
         * Unsets the "extends" attribute
         */
        public void unsetExtends()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXTENDS$28);
            }
        }
        
        /**
         * Gets the "extends-resource" attribute
         */
        public java.lang.String getExtendsResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDSRESOURCE$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "extends-resource" attribute
         */
        public org.apache.xmlbeans.XmlString xgetExtendsResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXTENDSRESOURCE$30);
                return target;
            }
        }
        
        /**
         * True if has "extends-resource" attribute
         */
        public boolean isSetExtendsResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXTENDSRESOURCE$30) != null;
            }
        }
        
        /**
         * Sets the "extends-resource" attribute
         */
        public void setExtendsResource(java.lang.String extendsResource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDSRESOURCE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENDSRESOURCE$30);
                }
                target.setStringValue(extendsResource);
            }
        }
        
        /**
         * Sets (as xml) the "extends-resource" attribute
         */
        public void xsetExtendsResource(org.apache.xmlbeans.XmlString extendsResource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXTENDSRESOURCE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXTENDSRESOURCE$30);
                }
                target.set(extendsResource);
            }
        }
        
        /**
         * Unsets the "extends-resource" attribute
         */
        public void unsetExtendsResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXTENDSRESOURCE$30);
            }
        }
        
        /**
         * Gets the "default-menu-item-name" attribute
         */
        public java.lang.String getDefaultMenuItemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTMENUITEMNAME$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-menu-item-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultMenuItemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTMENUITEMNAME$32);
                return target;
            }
        }
        
        /**
         * True if has "default-menu-item-name" attribute
         */
        public boolean isSetDefaultMenuItemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTMENUITEMNAME$32) != null;
            }
        }
        
        /**
         * Sets the "default-menu-item-name" attribute
         */
        public void setDefaultMenuItemName(java.lang.String defaultMenuItemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTMENUITEMNAME$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTMENUITEMNAME$32);
                }
                target.setStringValue(defaultMenuItemName);
            }
        }
        
        /**
         * Sets (as xml) the "default-menu-item-name" attribute
         */
        public void xsetDefaultMenuItemName(org.apache.xmlbeans.XmlString defaultMenuItemName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTMENUITEMNAME$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTMENUITEMNAME$32);
                }
                target.set(defaultMenuItemName);
            }
        }
        
        /**
         * Unsets the "default-menu-item-name" attribute
         */
        public void unsetDefaultMenuItemName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTMENUITEMNAME$32);
            }
        }
        
        /**
         * Gets the "default-associated-content-id" attribute
         */
        public java.lang.String getDefaultAssociatedContentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTASSOCIATEDCONTENTID$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-associated-content-id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultAssociatedContentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTASSOCIATEDCONTENTID$34);
                return target;
            }
        }
        
        /**
         * True if has "default-associated-content-id" attribute
         */
        public boolean isSetDefaultAssociatedContentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTASSOCIATEDCONTENTID$34) != null;
            }
        }
        
        /**
         * Sets the "default-associated-content-id" attribute
         */
        public void setDefaultAssociatedContentId(java.lang.String defaultAssociatedContentId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTASSOCIATEDCONTENTID$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTASSOCIATEDCONTENTID$34);
                }
                target.setStringValue(defaultAssociatedContentId);
            }
        }
        
        /**
         * Sets (as xml) the "default-associated-content-id" attribute
         */
        public void xsetDefaultAssociatedContentId(org.apache.xmlbeans.XmlString defaultAssociatedContentId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTASSOCIATEDCONTENTID$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTASSOCIATEDCONTENTID$34);
                }
                target.set(defaultAssociatedContentId);
            }
        }
        
        /**
         * Unsets the "default-associated-content-id" attribute
         */
        public void unsetDefaultAssociatedContentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTASSOCIATEDCONTENTID$34);
            }
        }
        
        /**
         * Gets the "default-hide-if-selected" attribute
         */
        public com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected.Enum getDefaultHideIfSelected()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTHIDEIFSELECTED$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEFAULTHIDEIFSELECTED$36);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-hide-if-selected" attribute
         */
        public com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected xgetDefaultHideIfSelected()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected target = null;
                target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected)get_store().find_attribute_user(DEFAULTHIDEIFSELECTED$36);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected)get_default_attribute_value(DEFAULTHIDEIFSELECTED$36);
                }
                return target;
            }
        }
        
        /**
         * True if has "default-hide-if-selected" attribute
         */
        public boolean isSetDefaultHideIfSelected()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTHIDEIFSELECTED$36) != null;
            }
        }
        
        /**
         * Sets the "default-hide-if-selected" attribute
         */
        public void setDefaultHideIfSelected(com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected.Enum defaultHideIfSelected)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTHIDEIFSELECTED$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTHIDEIFSELECTED$36);
                }
                target.setEnumValue(defaultHideIfSelected);
            }
        }
        
        /**
         * Sets (as xml) the "default-hide-if-selected" attribute
         */
        public void xsetDefaultHideIfSelected(com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected defaultHideIfSelected)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected target = null;
                target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected)get_store().find_attribute_user(DEFAULTHIDEIFSELECTED$36);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected)get_store().add_attribute_user(DEFAULTHIDEIFSELECTED$36);
                }
                target.set(defaultHideIfSelected);
            }
        }
        
        /**
         * Unsets the "default-hide-if-selected" attribute
         */
        public void unsetDefaultHideIfSelected()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTHIDEIFSELECTED$36);
            }
        }
        
        /**
         * Gets the "menu-width" attribute
         */
        public java.lang.String getMenuWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MENUWIDTH$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "menu-width" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMenuWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MENUWIDTH$38);
                return target;
            }
        }
        
        /**
         * True if has "menu-width" attribute
         */
        public boolean isSetMenuWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MENUWIDTH$38) != null;
            }
        }
        
        /**
         * Sets the "menu-width" attribute
         */
        public void setMenuWidth(java.lang.String menuWidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MENUWIDTH$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MENUWIDTH$38);
                }
                target.setStringValue(menuWidth);
            }
        }
        
        /**
         * Sets (as xml) the "menu-width" attribute
         */
        public void xsetMenuWidth(org.apache.xmlbeans.XmlString menuWidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MENUWIDTH$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MENUWIDTH$38);
                }
                target.set(menuWidth);
            }
        }
        
        /**
         * Unsets the "menu-width" attribute
         */
        public void unsetMenuWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MENUWIDTH$38);
            }
        }
        
        /**
         * Gets the "default-cell-width" attribute
         */
        public java.lang.String getDefaultCellWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTCELLWIDTH$40);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-cell-width" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultCellWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTCELLWIDTH$40);
                return target;
            }
        }
        
        /**
         * True if has "default-cell-width" attribute
         */
        public boolean isSetDefaultCellWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTCELLWIDTH$40) != null;
            }
        }
        
        /**
         * Sets the "default-cell-width" attribute
         */
        public void setDefaultCellWidth(java.lang.String defaultCellWidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTCELLWIDTH$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTCELLWIDTH$40);
                }
                target.setStringValue(defaultCellWidth);
            }
        }
        
        /**
         * Sets (as xml) the "default-cell-width" attribute
         */
        public void xsetDefaultCellWidth(org.apache.xmlbeans.XmlString defaultCellWidth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTCELLWIDTH$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTCELLWIDTH$40);
                }
                target.set(defaultCellWidth);
            }
        }
        
        /**
         * Unsets the "default-cell-width" attribute
         */
        public void unsetDefaultCellWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTCELLWIDTH$40);
            }
        }
        
        /**
         * Gets the "default-disabled-title-style" attribute
         */
        public java.lang.String getDefaultDisabledTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTDISABLEDTITLESTYLE$42);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-disabled-title-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultDisabledTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTDISABLEDTITLESTYLE$42);
                return target;
            }
        }
        
        /**
         * True if has "default-disabled-title-style" attribute
         */
        public boolean isSetDefaultDisabledTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTDISABLEDTITLESTYLE$42) != null;
            }
        }
        
        /**
         * Sets the "default-disabled-title-style" attribute
         */
        public void setDefaultDisabledTitleStyle(java.lang.String defaultDisabledTitleStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTDISABLEDTITLESTYLE$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTDISABLEDTITLESTYLE$42);
                }
                target.setStringValue(defaultDisabledTitleStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-disabled-title-style" attribute
         */
        public void xsetDefaultDisabledTitleStyle(org.apache.xmlbeans.XmlString defaultDisabledTitleStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTDISABLEDTITLESTYLE$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTDISABLEDTITLESTYLE$42);
                }
                target.set(defaultDisabledTitleStyle);
            }
        }
        
        /**
         * Unsets the "default-disabled-title-style" attribute
         */
        public void unsetDefaultDisabledTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTDISABLEDTITLESTYLE$42);
            }
        }
        
        /**
         * Gets the "selected-menuitem-context-field-name" attribute
         */
        public java.lang.String getSelectedMenuitemContextFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTEDMENUITEMCONTEXTFIELDNAME$44);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "selected-menuitem-context-field-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSelectedMenuitemContextFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SELECTEDMENUITEMCONTEXTFIELDNAME$44);
                return target;
            }
        }
        
        /**
         * True if has "selected-menuitem-context-field-name" attribute
         */
        public boolean isSetSelectedMenuitemContextFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SELECTEDMENUITEMCONTEXTFIELDNAME$44) != null;
            }
        }
        
        /**
         * Sets the "selected-menuitem-context-field-name" attribute
         */
        public void setSelectedMenuitemContextFieldName(java.lang.String selectedMenuitemContextFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTEDMENUITEMCONTEXTFIELDNAME$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SELECTEDMENUITEMCONTEXTFIELDNAME$44);
                }
                target.setStringValue(selectedMenuitemContextFieldName);
            }
        }
        
        /**
         * Sets (as xml) the "selected-menuitem-context-field-name" attribute
         */
        public void xsetSelectedMenuitemContextFieldName(org.apache.xmlbeans.XmlString selectedMenuitemContextFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SELECTEDMENUITEMCONTEXTFIELDNAME$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SELECTEDMENUITEMCONTEXTFIELDNAME$44);
                }
                target.set(selectedMenuitemContextFieldName);
            }
        }
        
        /**
         * Unsets the "selected-menuitem-context-field-name" attribute
         */
        public void unsetSelectedMenuitemContextFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SELECTEDMENUITEMCONTEXTFIELDNAME$44);
            }
        }
        
        /**
         * Gets the "menu-container-style" attribute
         */
        public java.lang.String getMenuContainerStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MENUCONTAINERSTYLE$46);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "menu-container-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMenuContainerStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MENUCONTAINERSTYLE$46);
                return target;
            }
        }
        
        /**
         * True if has "menu-container-style" attribute
         */
        public boolean isSetMenuContainerStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MENUCONTAINERSTYLE$46) != null;
            }
        }
        
        /**
         * Sets the "menu-container-style" attribute
         */
        public void setMenuContainerStyle(java.lang.String menuContainerStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MENUCONTAINERSTYLE$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MENUCONTAINERSTYLE$46);
                }
                target.setStringValue(menuContainerStyle);
            }
        }
        
        /**
         * Sets (as xml) the "menu-container-style" attribute
         */
        public void xsetMenuContainerStyle(org.apache.xmlbeans.XmlString menuContainerStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MENUCONTAINERSTYLE$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MENUCONTAINERSTYLE$46);
                }
                target.set(menuContainerStyle);
            }
        }
        
        /**
         * Unsets the "menu-container-style" attribute
         */
        public void unsetMenuContainerStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MENUCONTAINERSTYLE$46);
            }
        }
        
        /**
         * Gets the "default-align" attribute
         */
        public com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign.Enum getDefaultAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTALIGN$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEFAULTALIGN$48);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-align" attribute
         */
        public com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign xgetDefaultAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign target = null;
                target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign)get_store().find_attribute_user(DEFAULTALIGN$48);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign)get_default_attribute_value(DEFAULTALIGN$48);
                }
                return target;
            }
        }
        
        /**
         * True if has "default-align" attribute
         */
        public boolean isSetDefaultAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTALIGN$48) != null;
            }
        }
        
        /**
         * Sets the "default-align" attribute
         */
        public void setDefaultAlign(com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign.Enum defaultAlign)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTALIGN$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTALIGN$48);
                }
                target.setEnumValue(defaultAlign);
            }
        }
        
        /**
         * Sets (as xml) the "default-align" attribute
         */
        public void xsetDefaultAlign(com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign defaultAlign)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign target = null;
                target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign)get_store().find_attribute_user(DEFAULTALIGN$48);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign)get_store().add_attribute_user(DEFAULTALIGN$48);
                }
                target.set(defaultAlign);
            }
        }
        
        /**
         * Unsets the "default-align" attribute
         */
        public void unsetDefaultAlign()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTALIGN$48);
            }
        }
        
        /**
         * Gets the "fill-style" attribute
         */
        public java.lang.String getFillStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLSTYLE$50);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fill-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFillStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILLSTYLE$50);
                return target;
            }
        }
        
        /**
         * True if has "fill-style" attribute
         */
        public boolean isSetFillStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FILLSTYLE$50) != null;
            }
        }
        
        /**
         * Sets the "fill-style" attribute
         */
        public void setFillStyle(java.lang.String fillStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILLSTYLE$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILLSTYLE$50);
                }
                target.setStringValue(fillStyle);
            }
        }
        
        /**
         * Sets (as xml) the "fill-style" attribute
         */
        public void xsetFillStyle(org.apache.xmlbeans.XmlString fillStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FILLSTYLE$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FILLSTYLE$50);
                }
                target.set(fillStyle);
            }
        }
        
        /**
         * Unsets the "fill-style" attribute
         */
        public void unsetFillStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FILLSTYLE$50);
            }
        }
        
        /**
         * Gets the "default-permission-operation" attribute
         */
        public java.lang.String getDefaultPermissionOperation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTPERMISSIONOPERATION$52);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-permission-operation" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultPermissionOperation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTPERMISSIONOPERATION$52);
                return target;
            }
        }
        
        /**
         * True if has "default-permission-operation" attribute
         */
        public boolean isSetDefaultPermissionOperation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTPERMISSIONOPERATION$52) != null;
            }
        }
        
        /**
         * Sets the "default-permission-operation" attribute
         */
        public void setDefaultPermissionOperation(java.lang.String defaultPermissionOperation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTPERMISSIONOPERATION$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTPERMISSIONOPERATION$52);
                }
                target.setStringValue(defaultPermissionOperation);
            }
        }
        
        /**
         * Sets (as xml) the "default-permission-operation" attribute
         */
        public void xsetDefaultPermissionOperation(org.apache.xmlbeans.XmlString defaultPermissionOperation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTPERMISSIONOPERATION$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTPERMISSIONOPERATION$52);
                }
                target.set(defaultPermissionOperation);
            }
        }
        
        /**
         * Unsets the "default-permission-operation" attribute
         */
        public void unsetDefaultPermissionOperation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTPERMISSIONOPERATION$52);
            }
        }
        
        /**
         * Gets the "default-permission-entity-action" attribute
         */
        public java.lang.String getDefaultPermissionEntityAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTPERMISSIONENTITYACTION$54);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-permission-entity-action" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultPermissionEntityAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTPERMISSIONENTITYACTION$54);
                return target;
            }
        }
        
        /**
         * True if has "default-permission-entity-action" attribute
         */
        public boolean isSetDefaultPermissionEntityAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTPERMISSIONENTITYACTION$54) != null;
            }
        }
        
        /**
         * Sets the "default-permission-entity-action" attribute
         */
        public void setDefaultPermissionEntityAction(java.lang.String defaultPermissionEntityAction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTPERMISSIONENTITYACTION$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTPERMISSIONENTITYACTION$54);
                }
                target.setStringValue(defaultPermissionEntityAction);
            }
        }
        
        /**
         * Sets (as xml) the "default-permission-entity-action" attribute
         */
        public void xsetDefaultPermissionEntityAction(org.apache.xmlbeans.XmlString defaultPermissionEntityAction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTPERMISSIONENTITYACTION$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTPERMISSIONENTITYACTION$54);
                }
                target.set(defaultPermissionEntityAction);
            }
        }
        
        /**
         * Unsets the "default-permission-entity-action" attribute
         */
        public void unsetDefaultPermissionEntityAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTPERMISSIONENTITYACTION$54);
            }
        }
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.MenuDocument$Menu$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type
        {
            private static final long serialVersionUID = 1L;
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML orientation(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.MenuDocument$Menu$Orientation.
         */
        public static class OrientationImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation
        {
            private static final long serialVersionUID = 1L;
            
            public OrientationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected OrientationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML default-hide-if-selected(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.MenuDocument$Menu$DefaultHideIfSelected.
         */
        public static class DefaultHideIfSelectedImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected
        {
            private static final long serialVersionUID = 1L;
            
            public DefaultHideIfSelectedImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DefaultHideIfSelectedImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML default-align(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.MenuDocument$Menu$DefaultAlign.
         */
        public static class DefaultAlignImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign
        {
            private static final long serialVersionUID = 1L;
            
            public DefaultAlignImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DefaultAlignImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
