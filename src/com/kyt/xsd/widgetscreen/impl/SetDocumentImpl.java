/*
 * An XML document type.
 * Localname: set
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.SetDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one set(@) element.
 *
 * This is a complex type.
 */
public class SetDocumentImpl extends com.kyt.xsd.widgetscreen.impl.AllActionsDocumentImpl implements com.kyt.xsd.widgetscreen.SetDocument
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
    public com.kyt.xsd.widgetscreen.SetDocument.Set getSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.SetDocument.Set target = null;
            target = (com.kyt.xsd.widgetscreen.SetDocument.Set)get_store().find_element_user(SET$0, 0);
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
    public void setSet(com.kyt.xsd.widgetscreen.SetDocument.Set set)
    {
        generatedSetterHelperImpl(set, SET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "set" element
     */
    public com.kyt.xsd.widgetscreen.SetDocument.Set addNewSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.SetDocument.Set target = null;
            target = (com.kyt.xsd.widgetscreen.SetDocument.Set)get_store().add_element_user(SET$0);
            return target;
        }
    }
    /**
     * An XML set(@).
     *
     * This is a complex type.
     */
    public static class SetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.SetDocument.Set
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
        private static final javax.xml.namespace.QName TOSCOPE$12 = 
            new javax.xml.namespace.QName("", "to-scope");
        private static final javax.xml.namespace.QName FROMSCOPE$14 = 
            new javax.xml.namespace.QName("", "from-scope");
        
        
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
        public com.kyt.xsd.widgetscreen.SetDocument.Set.Global.Enum getGlobal()
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
                return (com.kyt.xsd.widgetscreen.SetDocument.Set.Global.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "global" attribute
         */
        public com.kyt.xsd.widgetscreen.SetDocument.Set.Global xgetGlobal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SetDocument.Set.Global target = null;
                target = (com.kyt.xsd.widgetscreen.SetDocument.Set.Global)get_store().find_attribute_user(GLOBAL$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.SetDocument.Set.Global)get_default_attribute_value(GLOBAL$8);
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
        public void setGlobal(com.kyt.xsd.widgetscreen.SetDocument.Set.Global.Enum global)
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
        public void xsetGlobal(com.kyt.xsd.widgetscreen.SetDocument.Set.Global global)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SetDocument.Set.Global target = null;
                target = (com.kyt.xsd.widgetscreen.SetDocument.Set.Global)get_store().find_attribute_user(GLOBAL$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.SetDocument.Set.Global)get_store().add_attribute_user(GLOBAL$8);
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
        public com.kyt.xsd.widgetscreen.SetDocument.Set.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.SetDocument.Set.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.widgetscreen.SetDocument.Set.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SetDocument.Set.Type target = null;
                target = (com.kyt.xsd.widgetscreen.SetDocument.Set.Type)get_store().find_attribute_user(TYPE$10);
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
        public void setType(com.kyt.xsd.widgetscreen.SetDocument.Set.Type.Enum type)
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
        public void xsetType(com.kyt.xsd.widgetscreen.SetDocument.Set.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SetDocument.Set.Type target = null;
                target = (com.kyt.xsd.widgetscreen.SetDocument.Set.Type)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.SetDocument.Set.Type)get_store().add_attribute_user(TYPE$10);
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
         * Gets the "to-scope" attribute
         */
        public com.kyt.xsd.widgetscreen.SetDocument.Set.ToScope.Enum getToScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOSCOPE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TOSCOPE$12);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.SetDocument.Set.ToScope.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "to-scope" attribute
         */
        public com.kyt.xsd.widgetscreen.SetDocument.Set.ToScope xgetToScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SetDocument.Set.ToScope target = null;
                target = (com.kyt.xsd.widgetscreen.SetDocument.Set.ToScope)get_store().find_attribute_user(TOSCOPE$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.SetDocument.Set.ToScope)get_default_attribute_value(TOSCOPE$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "to-scope" attribute
         */
        public boolean isSetToScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TOSCOPE$12) != null;
            }
        }
        
        /**
         * Sets the "to-scope" attribute
         */
        public void setToScope(com.kyt.xsd.widgetscreen.SetDocument.Set.ToScope.Enum toScope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOSCOPE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOSCOPE$12);
                }
                target.setEnumValue(toScope);
            }
        }
        
        /**
         * Sets (as xml) the "to-scope" attribute
         */
        public void xsetToScope(com.kyt.xsd.widgetscreen.SetDocument.Set.ToScope toScope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SetDocument.Set.ToScope target = null;
                target = (com.kyt.xsd.widgetscreen.SetDocument.Set.ToScope)get_store().find_attribute_user(TOSCOPE$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.SetDocument.Set.ToScope)get_store().add_attribute_user(TOSCOPE$12);
                }
                target.set(toScope);
            }
        }
        
        /**
         * Unsets the "to-scope" attribute
         */
        public void unsetToScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TOSCOPE$12);
            }
        }
        
        /**
         * Gets the "from-scope" attribute
         */
        public com.kyt.xsd.widgetscreen.SetDocument.Set.FromScope.Enum getFromScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROMSCOPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FROMSCOPE$14);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.SetDocument.Set.FromScope.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "from-scope" attribute
         */
        public com.kyt.xsd.widgetscreen.SetDocument.Set.FromScope xgetFromScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SetDocument.Set.FromScope target = null;
                target = (com.kyt.xsd.widgetscreen.SetDocument.Set.FromScope)get_store().find_attribute_user(FROMSCOPE$14);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.SetDocument.Set.FromScope)get_default_attribute_value(FROMSCOPE$14);
                }
                return target;
            }
        }
        
        /**
         * True if has "from-scope" attribute
         */
        public boolean isSetFromScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FROMSCOPE$14) != null;
            }
        }
        
        /**
         * Sets the "from-scope" attribute
         */
        public void setFromScope(com.kyt.xsd.widgetscreen.SetDocument.Set.FromScope.Enum fromScope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROMSCOPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FROMSCOPE$14);
                }
                target.setEnumValue(fromScope);
            }
        }
        
        /**
         * Sets (as xml) the "from-scope" attribute
         */
        public void xsetFromScope(com.kyt.xsd.widgetscreen.SetDocument.Set.FromScope fromScope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SetDocument.Set.FromScope target = null;
                target = (com.kyt.xsd.widgetscreen.SetDocument.Set.FromScope)get_store().find_attribute_user(FROMSCOPE$14);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.SetDocument.Set.FromScope)get_store().add_attribute_user(FROMSCOPE$14);
                }
                target.set(fromScope);
            }
        }
        
        /**
         * Unsets the "from-scope" attribute
         */
        public void unsetFromScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FROMSCOPE$14);
            }
        }
        /**
         * An XML global(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.SetDocument$Set$Global.
         */
        public static class GlobalImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.SetDocument.Set.Global
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
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.SetDocument$Set$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.SetDocument.Set.Type
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
         * An XML to-scope(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.SetDocument$Set$ToScope.
         */
        public static class ToScopeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.SetDocument.Set.ToScope
        {
            private static final long serialVersionUID = 1L;
            
            public ToScopeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ToScopeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML from-scope(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.SetDocument$Set$FromScope.
         */
        public static class FromScopeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.SetDocument.Set.FromScope
        {
            private static final long serialVersionUID = 1L;
            
            public FromScopeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected FromScopeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
