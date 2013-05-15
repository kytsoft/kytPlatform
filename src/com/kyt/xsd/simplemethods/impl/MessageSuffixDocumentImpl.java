/*
 * An XML document type.
 * Localname: message-suffix
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.MessageSuffixDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one message-suffix(@) element.
 *
 * This is a complex type.
 */
public class MessageSuffixDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.MessageSuffixDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageSuffixDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGESUFFIX$0 = 
        new javax.xml.namespace.QName("", "message-suffix");
    
    
    /**
     * Gets the "message-suffix" element
     */
    public com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix getMessageSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix target = null;
            target = (com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix)get_store().find_element_user(MESSAGESUFFIX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "message-suffix" element
     */
    public void setMessageSuffix(com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix messageSuffix)
    {
        generatedSetterHelperImpl(messageSuffix, MESSAGESUFFIX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "message-suffix" element
     */
    public com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix addNewMessageSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix target = null;
            target = (com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix)get_store().add_element_user(MESSAGESUFFIX$0);
            return target;
        }
    }
    /**
     * An XML message-suffix(@).
     *
     * This is a complex type.
     */
    public static class MessageSuffixImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.MessageSuffixDocument.MessageSuffix
    {
        private static final long serialVersionUID = 1L;
        
        public MessageSuffixImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCE$0 = 
            new javax.xml.namespace.QName("", "resource");
        private static final javax.xml.namespace.QName PROPERTY$2 = 
            new javax.xml.namespace.QName("", "property");
        
        
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
         * True if has "resource" attribute
         */
        public boolean isSetResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESOURCE$0) != null;
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
         * Unsets the "resource" attribute
         */
        public void unsetResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESOURCE$0);
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
         * True if has "property" attribute
         */
        public boolean isSetProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PROPERTY$2) != null;
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
         * Unsets the "property" attribute
         */
        public void unsetProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PROPERTY$2);
            }
        }
    }
}
