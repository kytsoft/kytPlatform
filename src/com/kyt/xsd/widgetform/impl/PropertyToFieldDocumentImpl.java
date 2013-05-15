/*
 * An XML document type.
 * Localname: property-to-field
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.PropertyToFieldDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one property-to-field(@) element.
 *
 * This is a complex type.
 */
public class PropertyToFieldDocumentImpl extends com.kyt.xsd.widgetform.impl.AllActionsDocumentImpl implements com.kyt.xsd.widgetform.PropertyToFieldDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyToFieldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYTOFIELD$0 = 
        new javax.xml.namespace.QName("", "property-to-field");
    
    
    /**
     * Gets the "property-to-field" element
     */
    public com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField getPropertyToField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField target = null;
            target = (com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField)get_store().find_element_user(PROPERTYTOFIELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "property-to-field" element
     */
    public void setPropertyToField(com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField propertyToField)
    {
        generatedSetterHelperImpl(propertyToField, PROPERTYTOFIELD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "property-to-field" element
     */
    public com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField addNewPropertyToField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField target = null;
            target = (com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField)get_store().add_element_user(PROPERTYTOFIELD$0);
            return target;
        }
    }
    /**
     * An XML property-to-field(@).
     *
     * This is a complex type.
     */
    public static class PropertyToFieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField
    {
        private static final long serialVersionUID = 1L;
        
        public PropertyToFieldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCE$0 = 
            new javax.xml.namespace.QName("", "resource");
        private static final javax.xml.namespace.QName PROPERTY$2 = 
            new javax.xml.namespace.QName("", "property");
        private static final javax.xml.namespace.QName FIELD$4 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName DEFAULT$6 = 
            new javax.xml.namespace.QName("", "default");
        private static final javax.xml.namespace.QName NOLOCALE$8 = 
            new javax.xml.namespace.QName("", "no-locale");
        private static final javax.xml.namespace.QName ARGLISTNAME$10 = 
            new javax.xml.namespace.QName("", "arg-list-name");
        
        
        /**
         * Gets the "resource" attribute
         */
        public java.lang.String getResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "resource" attribute
         */
        public org.apache.xmlbeans.XmlString xgetResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOURCE$0);
                return target;
            }
        }
        
        /**
         * Sets the "resource" attribute
         */
        public void setResource(java.lang.String resource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOURCE$0);
                }
                target.setStringValue(resource);
            }
        }
        
        /**
         * Sets (as xml) the "resource" attribute
         */
        public void xsetResource(org.apache.xmlbeans.XmlString resource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESOURCE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESOURCE$0);
                }
                target.set(resource);
            }
        }
        
        /**
         * Gets the "property" attribute
         */
        public java.lang.String getProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "property" attribute
         */
        public org.apache.xmlbeans.XmlString xgetProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY$2);
                return target;
            }
        }
        
        /**
         * Sets the "property" attribute
         */
        public void setProperty(java.lang.String property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROPERTY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROPERTY$2);
                }
                target.setStringValue(property);
            }
        }
        
        /**
         * Sets (as xml) the "property" attribute
         */
        public void xsetProperty(org.apache.xmlbeans.XmlString property)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROPERTY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROPERTY$2);
                }
                target.set(property);
            }
        }
        
        /**
         * Gets the "field" attribute
         */
        public java.lang.String getField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELD$4);
                }
                target.set(field);
            }
        }
        
        /**
         * Gets the "default" attribute
         */
        public java.lang.String getDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$6);
                return target;
            }
        }
        
        /**
         * True if has "default" attribute
         */
        public boolean isSetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULT$6) != null;
            }
        }
        
        /**
         * Sets the "default" attribute
         */
        public void setDefault(java.lang.String xdefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$6);
                }
                target.setStringValue(xdefault);
            }
        }
        
        /**
         * Sets (as xml) the "default" attribute
         */
        public void xsetDefault(org.apache.xmlbeans.XmlString xdefault)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULT$6);
                }
                target.set(xdefault);
            }
        }
        
        /**
         * Unsets the "default" attribute
         */
        public void unsetDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULT$6);
            }
        }
        
        /**
         * Gets the "no-locale" attribute
         */
        public com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField.NoLocale.Enum getNoLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOLOCALE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOLOCALE$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField.NoLocale.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "no-locale" attribute
         */
        public com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField.NoLocale xgetNoLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField.NoLocale target = null;
                target = (com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField.NoLocale)get_store().find_attribute_user(NOLOCALE$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField.NoLocale)get_default_attribute_value(NOLOCALE$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "no-locale" attribute
         */
        public boolean isSetNoLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NOLOCALE$8) != null;
            }
        }
        
        /**
         * Sets the "no-locale" attribute
         */
        public void setNoLocale(com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField.NoLocale.Enum noLocale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOLOCALE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOLOCALE$8);
                }
                target.setEnumValue(noLocale);
            }
        }
        
        /**
         * Sets (as xml) the "no-locale" attribute
         */
        public void xsetNoLocale(com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField.NoLocale noLocale)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField.NoLocale target = null;
                target = (com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField.NoLocale)get_store().find_attribute_user(NOLOCALE$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField.NoLocale)get_store().add_attribute_user(NOLOCALE$8);
                }
                target.set(noLocale);
            }
        }
        
        /**
         * Unsets the "no-locale" attribute
         */
        public void unsetNoLocale()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NOLOCALE$8);
            }
        }
        
        /**
         * Gets the "arg-list-name" attribute
         */
        public java.lang.String getArgListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARGLISTNAME$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg-list-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetArgListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ARGLISTNAME$10);
                return target;
            }
        }
        
        /**
         * True if has "arg-list-name" attribute
         */
        public boolean isSetArgListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ARGLISTNAME$10) != null;
            }
        }
        
        /**
         * Sets the "arg-list-name" attribute
         */
        public void setArgListName(java.lang.String argListName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARGLISTNAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARGLISTNAME$10);
                }
                target.setStringValue(argListName);
            }
        }
        
        /**
         * Sets (as xml) the "arg-list-name" attribute
         */
        public void xsetArgListName(org.apache.xmlbeans.XmlString argListName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ARGLISTNAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ARGLISTNAME$10);
                }
                target.set(argListName);
            }
        }
        
        /**
         * Unsets the "arg-list-name" attribute
         */
        public void unsetArgListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ARGLISTNAME$10);
            }
        }
        /**
         * An XML no-locale(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.PropertyToFieldDocument$PropertyToField$NoLocale.
         */
        public static class NoLocaleImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.PropertyToFieldDocument.PropertyToField.NoLocale
        {
            private static final long serialVersionUID = 1L;
            
            public NoLocaleImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected NoLocaleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
