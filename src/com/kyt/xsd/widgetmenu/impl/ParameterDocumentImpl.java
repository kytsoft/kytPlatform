/*
 * An XML document type.
 * Localname: parameter
 * Namespace: 
 * Java type: com.kyt.xsd.widgetmenu.ParameterDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetmenu.impl;
/**
 * A document containing one parameter(@) element.
 *
 * This is a complex type.
 */
public class ParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetmenu.ParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETER$0 = 
        new javax.xml.namespace.QName("", "parameter");
    
    
    /**
     * Gets the "parameter" element
     */
    public com.kyt.xsd.widgetmenu.ParameterDocument.Parameter getParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetmenu.ParameterDocument.Parameter target = null;
            target = (com.kyt.xsd.widgetmenu.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parameter" element
     */
    public void setParameter(com.kyt.xsd.widgetmenu.ParameterDocument.Parameter parameter)
    {
        generatedSetterHelperImpl(parameter, PARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "parameter" element
     */
    public com.kyt.xsd.widgetmenu.ParameterDocument.Parameter addNewParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetmenu.ParameterDocument.Parameter target = null;
            target = (com.kyt.xsd.widgetmenu.ParameterDocument.Parameter)get_store().add_element_user(PARAMETER$0);
            return target;
        }
    }
    /**
     * An XML parameter(@).
     *
     * This is a complex type.
     */
    public static class ParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetmenu.ParameterDocument.Parameter
    {
        private static final long serialVersionUID = 1L;
        
        public ParameterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARAMNAME$0 = 
            new javax.xml.namespace.QName("", "param-name");
        private static final javax.xml.namespace.QName FROMFIELD$2 = 
            new javax.xml.namespace.QName("", "from-field");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "param-name" attribute
         */
        public java.lang.String getParamName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "param-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetParamName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAMNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "param-name" attribute
         */
        public void setParamName(java.lang.String paramName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARAMNAME$0);
                }
                target.setStringValue(paramName);
            }
        }
        
        /**
         * Sets (as xml) the "param-name" attribute
         */
        public void xsetParamName(org.apache.xmlbeans.XmlString paramName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAMNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARAMNAME$0);
                }
                target.set(paramName);
            }
        }
        
        /**
         * Gets the "from-field" attribute
         */
        public java.lang.String getFromField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROMFIELD$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "from-field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFromField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROMFIELD$2);
                return target;
            }
        }
        
        /**
         * True if has "from-field" attribute
         */
        public boolean isSetFromField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FROMFIELD$2) != null;
            }
        }
        
        /**
         * Sets the "from-field" attribute
         */
        public void setFromField(java.lang.String fromField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROMFIELD$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FROMFIELD$2);
                }
                target.setStringValue(fromField);
            }
        }
        
        /**
         * Sets (as xml) the "from-field" attribute
         */
        public void xsetFromField(org.apache.xmlbeans.XmlString fromField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROMFIELD$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FROMFIELD$2);
                }
                target.set(fromField);
            }
        }
        
        /**
         * Unsets the "from-field" attribute
         */
        public void unsetFromField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FROMFIELD$2);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$4) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$4);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$4);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$4);
            }
        }
    }
}
