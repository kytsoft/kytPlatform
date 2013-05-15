/*
 * An XML document type.
 * Localname: condition
 * Namespace: 
 * Java type: com.kyt.xsd.widgetmenu.ConditionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetmenu.impl;
/**
 * A document containing one condition(@) element.
 *
 * This is a complex type.
 */
public class ConditionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetmenu.ConditionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConditionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITION$0 = 
        new javax.xml.namespace.QName("", "condition");
    
    
    /**
     * Gets the "condition" element
     */
    public com.kyt.xsd.widgetmenu.ConditionDocument.Condition getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetmenu.ConditionDocument.Condition target = null;
            target = (com.kyt.xsd.widgetmenu.ConditionDocument.Condition)get_store().find_element_user(CONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "condition" element
     */
    public void setCondition(com.kyt.xsd.widgetmenu.ConditionDocument.Condition condition)
    {
        generatedSetterHelperImpl(condition, CONDITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "condition" element
     */
    public com.kyt.xsd.widgetmenu.ConditionDocument.Condition addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetmenu.ConditionDocument.Condition target = null;
            target = (com.kyt.xsd.widgetmenu.ConditionDocument.Condition)get_store().add_element_user(CONDITION$0);
            return target;
        }
    }
    /**
     * An XML condition(@).
     *
     * This is a complex type.
     */
    public static class ConditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetmenu.ConditionDocument.Condition
    {
        private static final long serialVersionUID = 1L;
        
        public ConditionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALLCONDITIONALS$0 = 
            new javax.xml.namespace.QName("", "AllConditionals");
        private static final org.apache.xmlbeans.QNameSet ALLCONDITIONALS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("", "xor"),
            new javax.xml.namespace.QName("", "if-validate-method"),
            new javax.xml.namespace.QName("", "or"),
            new javax.xml.namespace.QName("", "AllConditionals"),
            new javax.xml.namespace.QName("", "if-compare-field"),
            new javax.xml.namespace.QName("", "and"),
            new javax.xml.namespace.QName("", "not"),
            new javax.xml.namespace.QName("", "if-entity-permission"),
            new javax.xml.namespace.QName("", "if-service-permission"),
            new javax.xml.namespace.QName("", "if-compare"),
            new javax.xml.namespace.QName("", "if-empty"),
            new javax.xml.namespace.QName("", "if-regexp"),
            new javax.xml.namespace.QName("", "if-has-permission"),
        });
        private static final javax.xml.namespace.QName PASSSTYLE$2 = 
            new javax.xml.namespace.QName("", "pass-style");
        private static final javax.xml.namespace.QName DISABLEDSTYLE$4 = 
            new javax.xml.namespace.QName("", "disabled-style");
        
        
        /**
         * Gets the "AllConditionals" element
         */
        public org.apache.xmlbeans.XmlObject getAllConditionals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLCONDITIONALS$1, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "AllConditionals" element
         */
        public void setAllConditionals(org.apache.xmlbeans.XmlObject allConditionals)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLCONDITIONALS$1, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLCONDITIONALS$0);
                }
                target.set(allConditionals);
            }
        }
        
        /**
         * Appends and returns a new empty "AllConditionals" element
         */
        public org.apache.xmlbeans.XmlObject addNewAllConditionals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLCONDITIONALS$0);
                return target;
            }
        }
        
        /**
         * Gets the "pass-style" attribute
         */
        public java.lang.String getPassStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSSTYLE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pass-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPassStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PASSSTYLE$2);
                return target;
            }
        }
        
        /**
         * True if has "pass-style" attribute
         */
        public boolean isSetPassStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PASSSTYLE$2) != null;
            }
        }
        
        /**
         * Sets the "pass-style" attribute
         */
        public void setPassStyle(java.lang.String passStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSSTYLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASSSTYLE$2);
                }
                target.setStringValue(passStyle);
            }
        }
        
        /**
         * Sets (as xml) the "pass-style" attribute
         */
        public void xsetPassStyle(org.apache.xmlbeans.XmlString passStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PASSSTYLE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PASSSTYLE$2);
                }
                target.set(passStyle);
            }
        }
        
        /**
         * Unsets the "pass-style" attribute
         */
        public void unsetPassStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PASSSTYLE$2);
            }
        }
        
        /**
         * Gets the "disabled-style" attribute
         */
        public java.lang.String getDisabledStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLEDSTYLE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "disabled-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDisabledStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISABLEDSTYLE$4);
                return target;
            }
        }
        
        /**
         * True if has "disabled-style" attribute
         */
        public boolean isSetDisabledStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISABLEDSTYLE$4) != null;
            }
        }
        
        /**
         * Sets the "disabled-style" attribute
         */
        public void setDisabledStyle(java.lang.String disabledStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISABLEDSTYLE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISABLEDSTYLE$4);
                }
                target.setStringValue(disabledStyle);
            }
        }
        
        /**
         * Sets (as xml) the "disabled-style" attribute
         */
        public void xsetDisabledStyle(org.apache.xmlbeans.XmlString disabledStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DISABLEDSTYLE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DISABLEDSTYLE$4);
                }
                target.set(disabledStyle);
            }
        }
        
        /**
         * Unsets the "disabled-style" attribute
         */
        public void unsetDisabledStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISABLEDSTYLE$4);
            }
        }
    }
}
