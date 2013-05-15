/*
 * An XML document type.
 * Localname: section
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.SectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one section(@) element.
 *
 * This is a complex type.
 */
public class SectionDocumentImpl extends com.kyt.xsd.widgetscreen.impl.AllWidgetsDocumentImpl implements com.kyt.xsd.widgetscreen.SectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECTION$0 = 
        new javax.xml.namespace.QName("", "section");
    
    
    /**
     * Gets the "section" element
     */
    public com.kyt.xsd.widgetscreen.SectionDocument.Section getSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.SectionDocument.Section target = null;
            target = (com.kyt.xsd.widgetscreen.SectionDocument.Section)get_store().find_element_user(SECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "section" element
     */
    public void setSection(com.kyt.xsd.widgetscreen.SectionDocument.Section section)
    {
        generatedSetterHelperImpl(section, SECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "section" element
     */
    public com.kyt.xsd.widgetscreen.SectionDocument.Section addNewSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.SectionDocument.Section target = null;
            target = (com.kyt.xsd.widgetscreen.SectionDocument.Section)get_store().add_element_user(SECTION$0);
            return target;
        }
    }
    /**
     * An XML section(@).
     *
     * This is a complex type.
     */
    public static class SectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.SectionDocument.Section
    {
        private static final long serialVersionUID = 1L;
        
        public SectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONDITION$0 = 
            new javax.xml.namespace.QName("", "condition");
        private static final javax.xml.namespace.QName ACTIONS$2 = 
            new javax.xml.namespace.QName("", "actions");
        private static final javax.xml.namespace.QName WIDGETS$4 = 
            new javax.xml.namespace.QName("", "widgets");
        private static final javax.xml.namespace.QName FAILWIDGETS$6 = 
            new javax.xml.namespace.QName("", "fail-widgets");
        private static final javax.xml.namespace.QName NAME$8 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "condition" element
         */
        public com.kyt.xsd.widgetscreen.ConditionDocument.Condition getCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ConditionDocument.Condition target = null;
                target = (com.kyt.xsd.widgetscreen.ConditionDocument.Condition)get_store().find_element_user(CONDITION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "condition" element
         */
        public boolean isSetCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONDITION$0) != 0;
            }
        }
        
        /**
         * Sets the "condition" element
         */
        public void setCondition(com.kyt.xsd.widgetscreen.ConditionDocument.Condition condition)
        {
            generatedSetterHelperImpl(condition, CONDITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "condition" element
         */
        public com.kyt.xsd.widgetscreen.ConditionDocument.Condition addNewCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ConditionDocument.Condition target = null;
                target = (com.kyt.xsd.widgetscreen.ConditionDocument.Condition)get_store().add_element_user(CONDITION$0);
                return target;
            }
        }
        
        /**
         * Unsets the "condition" element
         */
        public void unsetCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONDITION$0, 0);
            }
        }
        
        /**
         * Gets the "actions" element
         */
        public com.kyt.xsd.widgetscreen.ActionsDocument.Actions getActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ActionsDocument.Actions target = null;
                target = (com.kyt.xsd.widgetscreen.ActionsDocument.Actions)get_store().find_element_user(ACTIONS$2, 0);
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
                return get_store().count_elements(ACTIONS$2) != 0;
            }
        }
        
        /**
         * Sets the "actions" element
         */
        public void setActions(com.kyt.xsd.widgetscreen.ActionsDocument.Actions actions)
        {
            generatedSetterHelperImpl(actions, ACTIONS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "actions" element
         */
        public com.kyt.xsd.widgetscreen.ActionsDocument.Actions addNewActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ActionsDocument.Actions target = null;
                target = (com.kyt.xsd.widgetscreen.ActionsDocument.Actions)get_store().add_element_user(ACTIONS$2);
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
                get_store().remove_element(ACTIONS$2, 0);
            }
        }
        
        /**
         * Gets the "widgets" element
         */
        public com.kyt.xsd.widgetscreen.WidgetsDocument.Widgets getWidgets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.WidgetsDocument.Widgets target = null;
                target = (com.kyt.xsd.widgetscreen.WidgetsDocument.Widgets)get_store().find_element_user(WIDGETS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "widgets" element
         */
        public void setWidgets(com.kyt.xsd.widgetscreen.WidgetsDocument.Widgets widgets)
        {
            generatedSetterHelperImpl(widgets, WIDGETS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "widgets" element
         */
        public com.kyt.xsd.widgetscreen.WidgetsDocument.Widgets addNewWidgets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.WidgetsDocument.Widgets target = null;
                target = (com.kyt.xsd.widgetscreen.WidgetsDocument.Widgets)get_store().add_element_user(WIDGETS$4);
                return target;
            }
        }
        
        /**
         * Gets the "fail-widgets" element
         */
        public com.kyt.xsd.widgetscreen.FailWidgetsDocument.FailWidgets getFailWidgets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.FailWidgetsDocument.FailWidgets target = null;
                target = (com.kyt.xsd.widgetscreen.FailWidgetsDocument.FailWidgets)get_store().find_element_user(FAILWIDGETS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fail-widgets" element
         */
        public boolean isSetFailWidgets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FAILWIDGETS$6) != 0;
            }
        }
        
        /**
         * Sets the "fail-widgets" element
         */
        public void setFailWidgets(com.kyt.xsd.widgetscreen.FailWidgetsDocument.FailWidgets failWidgets)
        {
            generatedSetterHelperImpl(failWidgets, FAILWIDGETS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fail-widgets" element
         */
        public com.kyt.xsd.widgetscreen.FailWidgetsDocument.FailWidgets addNewFailWidgets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.FailWidgetsDocument.FailWidgets target = null;
                target = (com.kyt.xsd.widgetscreen.FailWidgetsDocument.FailWidgets)get_store().add_element_user(FAILWIDGETS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "fail-widgets" element
         */
        public void unsetFailWidgets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FAILWIDGETS$6, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
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
                return get_store().find_attribute_user(NAME$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
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
                get_store().remove_attribute(NAME$8);
            }
        }
    }
}
