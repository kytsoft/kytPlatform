/*
 * An XML document type.
 * Localname: string-to-list
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.StringToListDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one string-to-list(@) element.
 *
 * This is a complex type.
 */
public class StringToListDocumentImpl extends com.kyt.xsd.simplemethods.impl.EnvOperationsDocumentImpl implements com.kyt.xsd.simplemethods.StringToListDocument
{
    private static final long serialVersionUID = 1L;
    
    public StringToListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRINGTOLIST$0 = 
        new javax.xml.namespace.QName("", "string-to-list");
    
    
    /**
     * Gets the "string-to-list" element
     */
    public com.kyt.xsd.simplemethods.StringToListDocument.StringToList getStringToList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.StringToListDocument.StringToList target = null;
            target = (com.kyt.xsd.simplemethods.StringToListDocument.StringToList)get_store().find_element_user(STRINGTOLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "string-to-list" element
     */
    public void setStringToList(com.kyt.xsd.simplemethods.StringToListDocument.StringToList stringToList)
    {
        generatedSetterHelperImpl(stringToList, STRINGTOLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "string-to-list" element
     */
    public com.kyt.xsd.simplemethods.StringToListDocument.StringToList addNewStringToList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.StringToListDocument.StringToList target = null;
            target = (com.kyt.xsd.simplemethods.StringToListDocument.StringToList)get_store().add_element_user(STRINGTOLIST$0);
            return target;
        }
    }
    /**
     * An XML string-to-list(@).
     *
     * This is a complex type.
     */
    public static class StringToListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.StringToListDocument.StringToList
    {
        private static final long serialVersionUID = 1L;
        
        public StringToListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STRING$0 = 
            new javax.xml.namespace.QName("", "string");
        private static final javax.xml.namespace.QName LIST$2 = 
            new javax.xml.namespace.QName("", "list");
        private static final javax.xml.namespace.QName ARGLIST$4 = 
            new javax.xml.namespace.QName("", "arg-list");
        private static final javax.xml.namespace.QName MESSAGEFIELD$6 = 
            new javax.xml.namespace.QName("", "message-field");
        
        
        /**
         * Gets the "string" attribute
         */
        public java.lang.String getString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRING$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRING$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STRING$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STRING$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STRING$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STRING$0);
                }
                target.set(string);
            }
        }
        
        /**
         * Gets the "list" attribute
         */
        public java.lang.String getList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "list" attribute
         */
        public org.apache.xmlbeans.XmlString xgetList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$2);
                return target;
            }
        }
        
        /**
         * Sets the "list" attribute
         */
        public void setList(java.lang.String list)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIST$2);
                }
                target.setStringValue(list);
            }
        }
        
        /**
         * Sets (as xml) the "list" attribute
         */
        public void xsetList(org.apache.xmlbeans.XmlString list)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIST$2);
                }
                target.set(list);
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
         * Gets the "message-field" attribute
         */
        public java.lang.String getMessageField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEFIELD$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "message-field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMessageField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGEFIELD$6);
                return target;
            }
        }
        
        /**
         * True if has "message-field" attribute
         */
        public boolean isSetMessageField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MESSAGEFIELD$6) != null;
            }
        }
        
        /**
         * Sets the "message-field" attribute
         */
        public void setMessageField(java.lang.String messageField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGEFIELD$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGEFIELD$6);
                }
                target.setStringValue(messageField);
            }
        }
        
        /**
         * Sets (as xml) the "message-field" attribute
         */
        public void xsetMessageField(org.apache.xmlbeans.XmlString messageField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGEFIELD$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MESSAGEFIELD$6);
                }
                target.set(messageField);
            }
        }
        
        /**
         * Unsets the "message-field" attribute
         */
        public void unsetMessageField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MESSAGEFIELD$6);
            }
        }
    }
}
