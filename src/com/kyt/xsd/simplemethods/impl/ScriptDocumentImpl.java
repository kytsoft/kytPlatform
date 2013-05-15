/*
 * An XML document type.
 * Localname: script
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.ScriptDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one script(@) element.
 *
 * This is a complex type.
 */
public class ScriptDocumentImpl extends com.kyt.xsd.simplemethods.impl.CallOperationsDocumentImpl implements com.kyt.xsd.simplemethods.ScriptDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScriptDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCRIPT$0 = 
        new javax.xml.namespace.QName("", "script");
    
    
    /**
     * Gets the "script" element
     */
    public com.kyt.xsd.simplemethods.ScriptDocument.Script getScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ScriptDocument.Script target = null;
            target = (com.kyt.xsd.simplemethods.ScriptDocument.Script)get_store().find_element_user(SCRIPT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "script" element
     */
    public void setScript(com.kyt.xsd.simplemethods.ScriptDocument.Script script)
    {
        generatedSetterHelperImpl(script, SCRIPT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "script" element
     */
    public com.kyt.xsd.simplemethods.ScriptDocument.Script addNewScript()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ScriptDocument.Script target = null;
            target = (com.kyt.xsd.simplemethods.ScriptDocument.Script)get_store().add_element_user(SCRIPT$0);
            return target;
        }
    }
    /**
     * An XML script(@).
     *
     * This is a complex type.
     */
    public static class ScriptImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.ScriptDocument.Script
    {
        private static final long serialVersionUID = 1L;
        
        public ScriptImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCATION$0 = 
            new javax.xml.namespace.QName("", "location");
        private static final javax.xml.namespace.QName ERRORLISTNAME$2 = 
            new javax.xml.namespace.QName("", "error-list-name");
        
        
        /**
         * Gets the "location" attribute
         */
        public java.lang.String getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$0);
                return target;
            }
        }
        
        /**
         * True if has "location" attribute
         */
        public boolean isSetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCATION$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCATION$0);
                }
                target.set(location);
            }
        }
        
        /**
         * Unsets the "location" attribute
         */
        public void unsetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCATION$0);
            }
        }
        
        /**
         * Gets the "error-list-name" attribute
         */
        public java.lang.String getErrorListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORLISTNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ERRORLISTNAME$2);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "error-list-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetErrorListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORLISTNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(ERRORLISTNAME$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "error-list-name" attribute
         */
        public boolean isSetErrorListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ERRORLISTNAME$2) != null;
            }
        }
        
        /**
         * Sets the "error-list-name" attribute
         */
        public void setErrorListName(java.lang.String errorListName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORLISTNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORLISTNAME$2);
                }
                target.setStringValue(errorListName);
            }
        }
        
        /**
         * Sets (as xml) the "error-list-name" attribute
         */
        public void xsetErrorListName(org.apache.xmlbeans.XmlString errorListName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORLISTNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORLISTNAME$2);
                }
                target.set(errorListName);
            }
        }
        
        /**
         * Unsets the "error-list-name" attribute
         */
        public void unsetErrorListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ERRORLISTNAME$2);
            }
        }
    }
}
