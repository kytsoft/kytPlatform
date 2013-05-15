/*
 * An XML document type.
 * Localname: screenlet
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.ScreenletDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one screenlet(@) element.
 *
 * This is a complex type.
 */
public class ScreenletDocumentImpl extends com.kyt.xsd.widgetscreen.impl.AllWidgetsDocumentImpl implements com.kyt.xsd.widgetscreen.ScreenletDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScreenletDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCREENLET$0 = 
        new javax.xml.namespace.QName("", "screenlet");
    
    
    /**
     * Gets the "screenlet" element
     */
    public com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet getScreenlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet target = null;
            target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet)get_store().find_element_user(SCREENLET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "screenlet" element
     */
    public void setScreenlet(com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet screenlet)
    {
        generatedSetterHelperImpl(screenlet, SCREENLET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "screenlet" element
     */
    public com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet addNewScreenlet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet target = null;
            target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet)get_store().add_element_user(SCREENLET$0);
            return target;
        }
    }
    /**
     * An XML screenlet(@).
     *
     * This is a complex type.
     */
    public static class ScreenletImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet
    {
        private static final long serialVersionUID = 1L;
        
        public ScreenletImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALLWIDGETS$0 = 
            new javax.xml.namespace.QName("", "AllWidgets");
        private static final org.apache.xmlbeans.QNameSet ALLWIDGETS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("", "decorator-section-include"),
            new javax.xml.namespace.QName("", "include-menu"),
            new javax.xml.namespace.QName("", "AllWidgets"),
            new javax.xml.namespace.QName("", "link"),
            new javax.xml.namespace.QName("", "image"),
            new javax.xml.namespace.QName("", "label"),
            new javax.xml.namespace.QName("", "section"),
            new javax.xml.namespace.QName("", "decorator-screen"),
            new javax.xml.namespace.QName("", "content"),
            new javax.xml.namespace.QName("", "horizontal-separator"),
            new javax.xml.namespace.QName("", "include-form"),
            new javax.xml.namespace.QName("", "include-screen"),
            new javax.xml.namespace.QName("", "sub-content"),
            new javax.xml.namespace.QName("", "platform-specific"),
            new javax.xml.namespace.QName("", "include-tree"),
            new javax.xml.namespace.QName("", "container"),
            new javax.xml.namespace.QName("", "iterate-section"),
            new javax.xml.namespace.QName("", "screenlet"),
            new javax.xml.namespace.QName("", "include-portal-page"),
        });
        private static final javax.xml.namespace.QName TITLE$2 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName ID$4 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName NAME$6 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName COLLAPSIBLE$8 = 
            new javax.xml.namespace.QName("", "collapsible");
        private static final javax.xml.namespace.QName INITIALLYCOLLAPSED$10 = 
            new javax.xml.namespace.QName("", "initially-collapsed");
        private static final javax.xml.namespace.QName SAVECOLLAPSED$12 = 
            new javax.xml.namespace.QName("", "save-collapsed");
        private static final javax.xml.namespace.QName PADDED$14 = 
            new javax.xml.namespace.QName("", "padded");
        private static final javax.xml.namespace.QName NAVIGATIONMENUNAME$16 = 
            new javax.xml.namespace.QName("", "navigation-menu-name");
        private static final javax.xml.namespace.QName NAVIGATIONFORMNAME$18 = 
            new javax.xml.namespace.QName("", "navigation-form-name");
        private static final javax.xml.namespace.QName TABMENUNAME$20 = 
            new javax.xml.namespace.QName("", "tab-menu-name");
        
        
        /**
         * Gets array of all "AllWidgets" elements
         */
        public org.apache.xmlbeans.XmlObject[] getAllWidgetsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALLWIDGETS$1, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AllWidgets" element
         */
        public org.apache.xmlbeans.XmlObject getAllWidgetsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLWIDGETS$1, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AllWidgets" element
         */
        public int sizeOfAllWidgetsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALLWIDGETS$1);
            }
        }
        
        /**
         * Sets array of all "AllWidgets" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAllWidgetsArray(org.apache.xmlbeans.XmlObject[] allWidgetsArray)
        {
            check_orphaned();
            arraySetterHelper(allWidgetsArray, ALLWIDGETS$0, ALLWIDGETS$1);
        }
        
        /**
         * Sets ith "AllWidgets" element
         */
        public void setAllWidgetsArray(int i, org.apache.xmlbeans.XmlObject allWidgets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLWIDGETS$1, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(allWidgets);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AllWidgets" element
         */
        public org.apache.xmlbeans.XmlObject insertNewAllWidgets(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ALLWIDGETS$1, ALLWIDGETS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AllWidgets" element
         */
        public org.apache.xmlbeans.XmlObject addNewAllWidgets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLWIDGETS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "AllWidgets" element
         */
        public void removeAllWidgets(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALLWIDGETS$1, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$2);
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
                return get_store().find_attribute_user(TITLE$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$2);
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
                get_store().remove_attribute(TITLE$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
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
                return get_store().find_attribute_user(ID$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$4);
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
                get_store().remove_attribute(ID$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$6);
            }
        }
        
        /**
         * Gets the "collapsible" attribute
         */
        public com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Collapsible.Enum getCollapsible()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLAPSIBLE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COLLAPSIBLE$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Collapsible.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "collapsible" attribute
         */
        public com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Collapsible xgetCollapsible()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Collapsible target = null;
                target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Collapsible)get_store().find_attribute_user(COLLAPSIBLE$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Collapsible)get_default_attribute_value(COLLAPSIBLE$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "collapsible" attribute
         */
        public boolean isSetCollapsible()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COLLAPSIBLE$8) != null;
            }
        }
        
        /**
         * Sets the "collapsible" attribute
         */
        public void setCollapsible(com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Collapsible.Enum collapsible)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLLAPSIBLE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLLAPSIBLE$8);
                }
                target.setEnumValue(collapsible);
            }
        }
        
        /**
         * Sets (as xml) the "collapsible" attribute
         */
        public void xsetCollapsible(com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Collapsible collapsible)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Collapsible target = null;
                target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Collapsible)get_store().find_attribute_user(COLLAPSIBLE$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Collapsible)get_store().add_attribute_user(COLLAPSIBLE$8);
                }
                target.set(collapsible);
            }
        }
        
        /**
         * Unsets the "collapsible" attribute
         */
        public void unsetCollapsible()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COLLAPSIBLE$8);
            }
        }
        
        /**
         * Gets the "initially-collapsed" attribute
         */
        public java.lang.String getInitiallyCollapsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITIALLYCOLLAPSED$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INITIALLYCOLLAPSED$10);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "initially-collapsed" attribute
         */
        public org.apache.xmlbeans.XmlString xgetInitiallyCollapsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INITIALLYCOLLAPSED$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(INITIALLYCOLLAPSED$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "initially-collapsed" attribute
         */
        public boolean isSetInitiallyCollapsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INITIALLYCOLLAPSED$10) != null;
            }
        }
        
        /**
         * Sets the "initially-collapsed" attribute
         */
        public void setInitiallyCollapsed(java.lang.String initiallyCollapsed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITIALLYCOLLAPSED$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INITIALLYCOLLAPSED$10);
                }
                target.setStringValue(initiallyCollapsed);
            }
        }
        
        /**
         * Sets (as xml) the "initially-collapsed" attribute
         */
        public void xsetInitiallyCollapsed(org.apache.xmlbeans.XmlString initiallyCollapsed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INITIALLYCOLLAPSED$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INITIALLYCOLLAPSED$10);
                }
                target.set(initiallyCollapsed);
            }
        }
        
        /**
         * Unsets the "initially-collapsed" attribute
         */
        public void unsetInitiallyCollapsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INITIALLYCOLLAPSED$10);
            }
        }
        
        /**
         * Gets the "save-collapsed" attribute
         */
        public com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.SaveCollapsed.Enum getSaveCollapsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVECOLLAPSED$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SAVECOLLAPSED$12);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.SaveCollapsed.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "save-collapsed" attribute
         */
        public com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.SaveCollapsed xgetSaveCollapsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.SaveCollapsed target = null;
                target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.SaveCollapsed)get_store().find_attribute_user(SAVECOLLAPSED$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.SaveCollapsed)get_default_attribute_value(SAVECOLLAPSED$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "save-collapsed" attribute
         */
        public boolean isSetSaveCollapsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SAVECOLLAPSED$12) != null;
            }
        }
        
        /**
         * Sets the "save-collapsed" attribute
         */
        public void setSaveCollapsed(com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.SaveCollapsed.Enum saveCollapsed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVECOLLAPSED$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAVECOLLAPSED$12);
                }
                target.setEnumValue(saveCollapsed);
            }
        }
        
        /**
         * Sets (as xml) the "save-collapsed" attribute
         */
        public void xsetSaveCollapsed(com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.SaveCollapsed saveCollapsed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.SaveCollapsed target = null;
                target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.SaveCollapsed)get_store().find_attribute_user(SAVECOLLAPSED$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.SaveCollapsed)get_store().add_attribute_user(SAVECOLLAPSED$12);
                }
                target.set(saveCollapsed);
            }
        }
        
        /**
         * Unsets the "save-collapsed" attribute
         */
        public void unsetSaveCollapsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SAVECOLLAPSED$12);
            }
        }
        
        /**
         * Gets the "padded" attribute
         */
        public com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Padded.Enum getPadded()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PADDED$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PADDED$14);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Padded.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "padded" attribute
         */
        public com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Padded xgetPadded()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Padded target = null;
                target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Padded)get_store().find_attribute_user(PADDED$14);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Padded)get_default_attribute_value(PADDED$14);
                }
                return target;
            }
        }
        
        /**
         * True if has "padded" attribute
         */
        public boolean isSetPadded()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PADDED$14) != null;
            }
        }
        
        /**
         * Sets the "padded" attribute
         */
        public void setPadded(com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Padded.Enum padded)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PADDED$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PADDED$14);
                }
                target.setEnumValue(padded);
            }
        }
        
        /**
         * Sets (as xml) the "padded" attribute
         */
        public void xsetPadded(com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Padded padded)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Padded target = null;
                target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Padded)get_store().find_attribute_user(PADDED$14);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Padded)get_store().add_attribute_user(PADDED$14);
                }
                target.set(padded);
            }
        }
        
        /**
         * Unsets the "padded" attribute
         */
        public void unsetPadded()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PADDED$14);
            }
        }
        
        /**
         * Gets the "navigation-menu-name" attribute
         */
        public java.lang.String getNavigationMenuName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAVIGATIONMENUNAME$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "navigation-menu-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNavigationMenuName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAVIGATIONMENUNAME$16);
                return target;
            }
        }
        
        /**
         * True if has "navigation-menu-name" attribute
         */
        public boolean isSetNavigationMenuName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAVIGATIONMENUNAME$16) != null;
            }
        }
        
        /**
         * Sets the "navigation-menu-name" attribute
         */
        public void setNavigationMenuName(java.lang.String navigationMenuName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAVIGATIONMENUNAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAVIGATIONMENUNAME$16);
                }
                target.setStringValue(navigationMenuName);
            }
        }
        
        /**
         * Sets (as xml) the "navigation-menu-name" attribute
         */
        public void xsetNavigationMenuName(org.apache.xmlbeans.XmlString navigationMenuName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAVIGATIONMENUNAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAVIGATIONMENUNAME$16);
                }
                target.set(navigationMenuName);
            }
        }
        
        /**
         * Unsets the "navigation-menu-name" attribute
         */
        public void unsetNavigationMenuName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAVIGATIONMENUNAME$16);
            }
        }
        
        /**
         * Gets the "navigation-form-name" attribute
         */
        public java.lang.String getNavigationFormName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAVIGATIONFORMNAME$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "navigation-form-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNavigationFormName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAVIGATIONFORMNAME$18);
                return target;
            }
        }
        
        /**
         * True if has "navigation-form-name" attribute
         */
        public boolean isSetNavigationFormName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAVIGATIONFORMNAME$18) != null;
            }
        }
        
        /**
         * Sets the "navigation-form-name" attribute
         */
        public void setNavigationFormName(java.lang.String navigationFormName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAVIGATIONFORMNAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAVIGATIONFORMNAME$18);
                }
                target.setStringValue(navigationFormName);
            }
        }
        
        /**
         * Sets (as xml) the "navigation-form-name" attribute
         */
        public void xsetNavigationFormName(org.apache.xmlbeans.XmlString navigationFormName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAVIGATIONFORMNAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAVIGATIONFORMNAME$18);
                }
                target.set(navigationFormName);
            }
        }
        
        /**
         * Unsets the "navigation-form-name" attribute
         */
        public void unsetNavigationFormName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAVIGATIONFORMNAME$18);
            }
        }
        
        /**
         * Gets the "tab-menu-name" attribute
         */
        public java.lang.String getTabMenuName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABMENUNAME$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tab-menu-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTabMenuName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TABMENUNAME$20);
                return target;
            }
        }
        
        /**
         * True if has "tab-menu-name" attribute
         */
        public boolean isSetTabMenuName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TABMENUNAME$20) != null;
            }
        }
        
        /**
         * Sets the "tab-menu-name" attribute
         */
        public void setTabMenuName(java.lang.String tabMenuName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TABMENUNAME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TABMENUNAME$20);
                }
                target.setStringValue(tabMenuName);
            }
        }
        
        /**
         * Sets (as xml) the "tab-menu-name" attribute
         */
        public void xsetTabMenuName(org.apache.xmlbeans.XmlString tabMenuName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TABMENUNAME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TABMENUNAME$20);
                }
                target.set(tabMenuName);
            }
        }
        
        /**
         * Unsets the "tab-menu-name" attribute
         */
        public void unsetTabMenuName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TABMENUNAME$20);
            }
        }
        /**
         * An XML collapsible(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.ScreenletDocument$Screenlet$Collapsible.
         */
        public static class CollapsibleImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Collapsible
        {
            private static final long serialVersionUID = 1L;
            
            public CollapsibleImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected CollapsibleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML save-collapsed(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.ScreenletDocument$Screenlet$SaveCollapsed.
         */
        public static class SaveCollapsedImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.SaveCollapsed
        {
            private static final long serialVersionUID = 1L;
            
            public SaveCollapsedImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SaveCollapsedImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML padded(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.ScreenletDocument$Screenlet$Padded.
         */
        public static class PaddedImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.ScreenletDocument.Screenlet.Padded
        {
            private static final long serialVersionUID = 1L;
            
            public PaddedImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PaddedImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
