/*
 * An XML document type.
 * Localname: string-append
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.StringAppendDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one string-append(@) element.
 *
 * This is a complex type.
 */
public class StringAppendDocumentImpl extends com.kyt.xsd.simplemethods.impl.EnvOperationsDocumentImpl implements com.kyt.xsd.simplemethods.StringAppendDocument
{
    private static final long serialVersionUID = 1L;
    
    public StringAppendDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRINGAPPEND$0 = 
        new javax.xml.namespace.QName("", "string-append");
    
    
    /**
     * Gets the "string-append" element
     */
    public com.kyt.xsd.simplemethods.StringAppendDocument.StringAppend getStringAppend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.StringAppendDocument.StringAppend target = null;
            target = (com.kyt.xsd.simplemethods.StringAppendDocument.StringAppend)get_store().find_element_user(STRINGAPPEND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "string-append" element
     */
    public void setStringAppend(com.kyt.xsd.simplemethods.StringAppendDocument.StringAppend stringAppend)
    {
        generatedSetterHelperImpl(stringAppend, STRINGAPPEND$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "string-append" element
     */
    public com.kyt.xsd.simplemethods.StringAppendDocument.StringAppend addNewStringAppend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.StringAppendDocument.StringAppend target = null;
            target = (com.kyt.xsd.simplemethods.StringAppendDocument.StringAppend)get_store().add_element_user(STRINGAPPEND$0);
            return target;
        }
    }
    /**
     * An XML string-append(@).
     *
     * This is a complex type.
     */
    public static class StringAppendImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.StringAppendDocument.StringAppend
    {
        private static final long serialVersionUID = 1L;
        
        public StringAppendImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELD$0 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName STRING$2 = 
            new javax.xml.namespace.QName("", "string");
        private static final javax.xml.namespace.QName ARGLIST$4 = 
            new javax.xml.namespace.QName("", "arg-list");
        private static final javax.xml.namespace.QName PREFIX$6 = 
            new javax.xml.namespace.QName("", "prefix");
        private static final javax.xml.namespace.QName SUFFIX$8 = 
            new javax.xml.namespace.QName("", "suffix");
        
        
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
         * Gets the "string" attribute
         */
        public java.lang.String getString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRING$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "string" attribute
         */
        public org.apache.xmlbeans.XmlString xgetString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRING$2);
                return target;
            }
        }
        
        /**
         * Sets the "string" attribute
         */
        public void setString(java.lang.String string)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRING$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRING$2);
                }
                target.setStringValue(string);
            }
        }
        
        /**
         * Sets (as xml) the "string" attribute
         */
        public void xsetString(org.apache.xmlbeans.XmlString string)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRING$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STRING$2);
                }
                target.set(string);
            }
        }
        
        /**
         * Gets the "arg-list" attribute
         */
        public java.lang.String getArgList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARGLIST$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg-list" attribute
         */
        public org.apache.xmlbeans.XmlString xgetArgList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ARGLIST$4);
                return target;
            }
        }
        
        /**
         * True if has "arg-list" attribute
         */
        public boolean isSetArgList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ARGLIST$4) != null;
            }
        }
        
        /**
         * Sets the "arg-list" attribute
         */
        public void setArgList(java.lang.String argList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARGLIST$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARGLIST$4);
                }
                target.setStringValue(argList);
            }
        }
        
        /**
         * Sets (as xml) the "arg-list" attribute
         */
        public void xsetArgList(org.apache.xmlbeans.XmlString argList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ARGLIST$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ARGLIST$4);
                }
                target.set(argList);
            }
        }
        
        /**
         * Unsets the "arg-list" attribute
         */
        public void unsetArgList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ARGLIST$4);
            }
        }
        
        /**
         * Gets the "prefix" attribute
         */
        public java.lang.String getPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFIX$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "prefix" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREFIX$6);
                return target;
            }
        }
        
        /**
         * True if has "prefix" attribute
         */
        public boolean isSetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PREFIX$6) != null;
            }
        }
        
        /**
         * Sets the "prefix" attribute
         */
        public void setPrefix(java.lang.String prefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFIX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFIX$6);
                }
                target.setStringValue(prefix);
            }
        }
        
        /**
         * Sets (as xml) the "prefix" attribute
         */
        public void xsetPrefix(org.apache.xmlbeans.XmlString prefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREFIX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PREFIX$6);
                }
                target.set(prefix);
            }
        }
        
        /**
         * Unsets the "prefix" attribute
         */
        public void unsetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PREFIX$6);
            }
        }
        
        /**
         * Gets the "suffix" attribute
         */
        public java.lang.String getSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUFFIX$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "suffix" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUFFIX$8);
                return target;
            }
        }
        
        /**
         * True if has "suffix" attribute
         */
        public boolean isSetSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUFFIX$8) != null;
            }
        }
        
        /**
         * Sets the "suffix" attribute
         */
        public void setSuffix(java.lang.String suffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUFFIX$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUFFIX$8);
                }
                target.setStringValue(suffix);
            }
        }
        
        /**
         * Sets (as xml) the "suffix" attribute
         */
        public void xsetSuffix(org.apache.xmlbeans.XmlString suffix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUFFIX$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SUFFIX$8);
                }
                target.set(suffix);
            }
        }
        
        /**
         * Unsets the "suffix" attribute
         */
        public void unsetSuffix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUFFIX$8);
            }
        }
    }
}
