/*
 * An XML document type.
 * Localname: add-error
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.AddErrorDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one add-error(@) element.
 *
 * This is a complex type.
 */
public class AddErrorDocumentImpl extends com.kyt.xsd.simplemethods.impl.ControlOperationsDocumentImpl implements com.kyt.xsd.simplemethods.AddErrorDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddErrorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDERROR$0 = 
        new javax.xml.namespace.QName("", "add-error");
    
    
    /**
     * Gets the "add-error" element
     */
    public com.kyt.xsd.simplemethods.AddErrorDocument.AddError getAddError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.AddErrorDocument.AddError target = null;
            target = (com.kyt.xsd.simplemethods.AddErrorDocument.AddError)get_store().find_element_user(ADDERROR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "add-error" element
     */
    public void setAddError(com.kyt.xsd.simplemethods.AddErrorDocument.AddError addError)
    {
        generatedSetterHelperImpl(addError, ADDERROR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "add-error" element
     */
    public com.kyt.xsd.simplemethods.AddErrorDocument.AddError addNewAddError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.AddErrorDocument.AddError target = null;
            target = (com.kyt.xsd.simplemethods.AddErrorDocument.AddError)get_store().add_element_user(ADDERROR$0);
            return target;
        }
    }
    /**
     * An XML add-error(@).
     *
     * This is a complex type.
     */
    public static class AddErrorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.AddErrorDocument.AddError
    {
        private static final long serialVersionUID = 1L;
        
        public AddErrorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FAILMESSAGE$0 = 
            new javax.xml.namespace.QName("", "fail-message");
        private static final javax.xml.namespace.QName FAILPROPERTY$2 = 
            new javax.xml.namespace.QName("", "fail-property");
        private static final javax.xml.namespace.QName ERRORLISTNAME$4 = 
            new javax.xml.namespace.QName("", "error-list-name");
        
        
        /**
         * Gets the "fail-message" element
         */
        public com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage getFailMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage target = null;
                target = (com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage)get_store().find_element_user(FAILMESSAGE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fail-message" element
         */
        public boolean isSetFailMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FAILMESSAGE$0) != 0;
            }
        }
        
        /**
         * Sets the "fail-message" element
         */
        public void setFailMessage(com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage failMessage)
        {
            generatedSetterHelperImpl(failMessage, FAILMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fail-message" element
         */
        public com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage addNewFailMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage target = null;
                target = (com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage)get_store().add_element_user(FAILMESSAGE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "fail-message" element
         */
        public void unsetFailMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FAILMESSAGE$0, 0);
            }
        }
        
        /**
         * Gets the "fail-property" element
         */
        public com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty getFailProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty target = null;
                target = (com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty)get_store().find_element_user(FAILPROPERTY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fail-property" element
         */
        public boolean isSetFailProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FAILPROPERTY$2) != 0;
            }
        }
        
        /**
         * Sets the "fail-property" element
         */
        public void setFailProperty(com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty failProperty)
        {
            generatedSetterHelperImpl(failProperty, FAILPROPERTY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fail-property" element
         */
        public com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty addNewFailProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty target = null;
                target = (com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty)get_store().add_element_user(FAILPROPERTY$2);
                return target;
            }
        }
        
        /**
         * Unsets the "fail-property" element
         */
        public void unsetFailProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FAILPROPERTY$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORLISTNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ERRORLISTNAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORLISTNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(ERRORLISTNAME$4);
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
                return get_store().find_attribute_user(ERRORLISTNAME$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORLISTNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORLISTNAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORLISTNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORLISTNAME$4);
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
                get_store().remove_attribute(ERRORLISTNAME$4);
            }
        }
    }
}
