/*
 * An XML document type.
 * Localname: set
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.SetDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one set(@) element.
 *
 * This is a complex type.
 */
public class SetDocumentImpl extends com.kyt.xsd.widgetform.impl.AllActionsDocumentImpl implements com.kyt.xsd.widgetform.SetDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SET$0 = 
        new javax.xml.namespace.QName("", "set");
    
    
    /**
     * Gets the "set" element
     */
    public com.kyt.xsd.widgetform.SetDocument.Set getSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.SetDocument.Set target = null;
            target = (com.kyt.xsd.widgetform.SetDocument.Set)get_store().find_element_user(SET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "set" element
     */
    public void setSet(com.kyt.xsd.widgetform.SetDocument.Set set)
    {
        generatedSetterHelperImpl(set, SET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "set" element
     */
    public com.kyt.xsd.widgetform.SetDocument.Set addNewSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.SetDocument.Set target = null;
            target = (com.kyt.xsd.widgetform.SetDocument.Set)get_store().add_element_user(SET$0);
            return target;
        }
    }
    /**
     * An XML set(@).
     *
     * This is a complex type.
     */
    public static class SetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.SetDocument.Set
    {
        private static final long serialVersionUID = 1L;
        
        public SetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELD$0 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName FROMFIELD$2 = 
            new javax.xml.namespace.QName("", "from-field");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
        private static final javax.xml.namespace.QName DEFAULTVALUE$6 = 
            new javax.xml.namespace.QName("", "default-value");
        private static final javax.xml.namespace.QName GLOBAL$8 = 
            new javax.xml.namespace.QName("", "global");
        private static final javax.xml.namespace.QName TYPE$10 = 
            new javax.xml.namespace.QName("", "type");
        
        
        /**
         * Gets the "field" attribute
         */
        public java.lang.String getField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$0);
                return target;
            }
        }
        
        /**
         * Sets the "field" attribute
         */
        public void setField(java.lang.String field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD$0);
                }
                target.setStringValue(field);
            }
        }
        
        /**
         * Sets (as xml) the "field" attribute
         */
        public void xsetField(org.apache.xmlbeans.XmlString field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELD$0);
                }
                target.set(field);
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
        
        /**
         * Gets the "default-value" attribute
         */
        public java.lang.String getDefaultValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTVALUE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTVALUE$6);
                return target;
            }
        }
        
        /**
         * True if has "default-value" attribute
         */
        public boolean isSetDefaultValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTVALUE$6) != null;
            }
        }
        
        /**
         * Sets the "default-value" attribute
         */
        public void setDefaultValue(java.lang.String defaultValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTVALUE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTVALUE$6);
                }
                target.setStringValue(defaultValue);
            }
        }
        
        /**
         * Sets (as xml) the "default-value" attribute
         */
        public void xsetDefaultValue(org.apache.xmlbeans.XmlString defaultValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTVALUE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTVALUE$6);
                }
                target.set(defaultValue);
            }
        }
        
        /**
         * Unsets the "default-value" attribute
         */
        public void unsetDefaultValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTVALUE$6);
            }
        }
        
        /**
         * Gets the "global" attribute
         */
        public com.kyt.xsd.widgetform.SetDocument.Set.Global.Enum getGlobal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GLOBAL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GLOBAL$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.SetDocument.Set.Global.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "global" attribute
         */
        public com.kyt.xsd.widgetform.SetDocument.Set.Global xgetGlobal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SetDocument.Set.Global target = null;
                target = (com.kyt.xsd.widgetform.SetDocument.Set.Global)get_store().find_attribute_user(GLOBAL$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.SetDocument.Set.Global)get_default_attribute_value(GLOBAL$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "global" attribute
         */
        public boolean isSetGlobal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GLOBAL$8) != null;
            }
        }
        
        /**
         * Sets the "global" attribute
         */
        public void setGlobal(com.kyt.xsd.widgetform.SetDocument.Set.Global.Enum global)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GLOBAL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GLOBAL$8);
                }
                target.setEnumValue(global);
            }
        }
        
        /**
         * Sets (as xml) the "global" attribute
         */
        public void xsetGlobal(com.kyt.xsd.widgetform.SetDocument.Set.Global global)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SetDocument.Set.Global target = null;
                target = (com.kyt.xsd.widgetform.SetDocument.Set.Global)get_store().find_attribute_user(GLOBAL$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.SetDocument.Set.Global)get_store().add_attribute_user(GLOBAL$8);
                }
                target.set(global);
            }
        }
        
        /**
         * Unsets the "global" attribute
         */
        public void unsetGlobal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GLOBAL$8);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public com.kyt.xsd.widgetform.SetDocument.Set.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.SetDocument.Set.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.widgetform.SetDocument.Set.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SetDocument.Set.Type target = null;
                target = (com.kyt.xsd.widgetform.SetDocument.Set.Type)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.SetDocument.Set.Type)get_default_attribute_value(TYPE$10);
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
                return get_store().find_attribute_user(TYPE$10) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.kyt.xsd.widgetform.SetDocument.Set.Type.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$10);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(com.kyt.xsd.widgetform.SetDocument.Set.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SetDocument.Set.Type target = null;
                target = (com.kyt.xsd.widgetform.SetDocument.Set.Type)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.SetDocument.Set.Type)get_store().add_attribute_user(TYPE$10);
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
                get_store().remove_attribute(TYPE$10);
            }
        }
        /**
         * An XML global(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.SetDocument$Set$Global.
         */
        public static class GlobalImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.SetDocument.Set.Global
        {
            private static final long serialVersionUID = 1L;
            
            public GlobalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected GlobalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.SetDocument$Set$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.SetDocument.Set.Type
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
    }
}
