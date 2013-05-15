/*
 * An XML document type.
 * Localname: webapp-property-to-field
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.WebappPropertyToFieldDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one webapp-property-to-field(@) element.
 *
 * This is a complex type.
 */
public class WebappPropertyToFieldDocumentImpl extends com.kyt.xsd.simplemethods.impl.EventOperationsDocumentImpl implements com.kyt.xsd.simplemethods.WebappPropertyToFieldDocument
{
    private static final long serialVersionUID = 1L;
    
    public WebappPropertyToFieldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WEBAPPPROPERTYTOFIELD$0 = 
        new javax.xml.namespace.QName("", "webapp-property-to-field");
    
    
    /**
     * Gets the "webapp-property-to-field" element
     */
    public com.kyt.xsd.simplemethods.WebappPropertyToFieldDocument.WebappPropertyToField getWebappPropertyToField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.WebappPropertyToFieldDocument.WebappPropertyToField target = null;
            target = (com.kyt.xsd.simplemethods.WebappPropertyToFieldDocument.WebappPropertyToField)get_store().find_element_user(WEBAPPPROPERTYTOFIELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "webapp-property-to-field" element
     */
    public void setWebappPropertyToField(com.kyt.xsd.simplemethods.WebappPropertyToFieldDocument.WebappPropertyToField webappPropertyToField)
    {
        generatedSetterHelperImpl(webappPropertyToField, WEBAPPPROPERTYTOFIELD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "webapp-property-to-field" element
     */
    public com.kyt.xsd.simplemethods.WebappPropertyToFieldDocument.WebappPropertyToField addNewWebappPropertyToField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.WebappPropertyToFieldDocument.WebappPropertyToField target = null;
            target = (com.kyt.xsd.simplemethods.WebappPropertyToFieldDocument.WebappPropertyToField)get_store().add_element_user(WEBAPPPROPERTYTOFIELD$0);
            return target;
        }
    }
    /**
     * An XML webapp-property-to-field(@).
     *
     * This is a complex type.
     */
    public static class WebappPropertyToFieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.WebappPropertyToFieldDocument.WebappPropertyToField
    {
        private static final long serialVersionUID = 1L;
        
        public WebappPropertyToFieldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCE$0 = 
            new javax.xml.namespace.QName("", "resource");
        private static final javax.xml.namespace.QName PROPERTY$2 = 
            new javax.xml.namespace.QName("", "property");
        private static final javax.xml.namespace.QName DEFAULT$4 = 
            new javax.xml.namespace.QName("", "default");
        private static final javax.xml.namespace.QName FIELD$6 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName SESSIONNAME$8 = 
            new javax.xml.namespace.QName("", "session-name");
        
        
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
         * Gets the "default" attribute
         */
        public java.lang.String getDefault()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$4);
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
                return get_store().find_attribute_user(DEFAULT$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULT$4);
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
                get_store().remove_attribute(DEFAULT$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELD$6);
                }
                target.set(field);
            }
        }
        
        /**
         * Gets the "session-name" attribute
         */
        public java.lang.String getSessionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSIONNAME$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "session-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSessionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSIONNAME$8);
                return target;
            }
        }
        
        /**
         * True if has "session-name" attribute
         */
        public boolean isSetSessionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SESSIONNAME$8) != null;
            }
        }
        
        /**
         * Sets the "session-name" attribute
         */
        public void setSessionName(java.lang.String sessionName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SESSIONNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SESSIONNAME$8);
                }
                target.setStringValue(sessionName);
            }
        }
        
        /**
         * Sets (as xml) the "session-name" attribute
         */
        public void xsetSessionName(org.apache.xmlbeans.XmlString sessionName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SESSIONNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SESSIONNAME$8);
                }
                target.set(sessionName);
            }
        }
        
        /**
         * Unsets the "session-name" attribute
         */
        public void unsetSessionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SESSIONNAME$8);
            }
        }
    }
}
