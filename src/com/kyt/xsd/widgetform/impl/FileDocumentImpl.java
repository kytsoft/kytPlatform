/*
 * An XML document type.
 * Localname: file
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.FileDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one file(@) element.
 *
 * This is a complex type.
 */
public class FileDocumentImpl extends com.kyt.xsd.widgetform.impl.AllFieldsDocumentImpl implements com.kyt.xsd.widgetform.FileDocument
{
    private static final long serialVersionUID = 1L;
    
    public FileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILE$0 = 
        new javax.xml.namespace.QName("", "file");
    
    
    /**
     * Gets the "file" element
     */
    public com.kyt.xsd.widgetform.FileDocument.File getFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.FileDocument.File target = null;
            target = (com.kyt.xsd.widgetform.FileDocument.File)get_store().find_element_user(FILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "file" element
     */
    public void setFile(com.kyt.xsd.widgetform.FileDocument.File file)
    {
        generatedSetterHelperImpl(file, FILE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "file" element
     */
    public com.kyt.xsd.widgetform.FileDocument.File addNewFile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.FileDocument.File target = null;
            target = (com.kyt.xsd.widgetform.FileDocument.File)get_store().add_element_user(FILE$0);
            return target;
        }
    }
    /**
     * An XML file(@).
     *
     * This is a complex type.
     */
    public static class FileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.FileDocument.File
    {
        private static final long serialVersionUID = 1L;
        
        public FileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBHYPERLINK$0 = 
            new javax.xml.namespace.QName("", "sub-hyperlink");
        private static final javax.xml.namespace.QName SIZE$2 = 
            new javax.xml.namespace.QName("", "size");
        private static final javax.xml.namespace.QName MAXLENGTH$4 = 
            new javax.xml.namespace.QName("", "maxlength");
        private static final javax.xml.namespace.QName DEFAULTVALUE$6 = 
            new javax.xml.namespace.QName("", "default-value");
        private static final javax.xml.namespace.QName CLIENTAUTOCOMPLETEFIELD$8 = 
            new javax.xml.namespace.QName("", "client-autocomplete-field");
        
        
        /**
         * Gets the "sub-hyperlink" element
         */
        public com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink getSubHyperlink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink target = null;
                target = (com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink)get_store().find_element_user(SUBHYPERLINK$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "sub-hyperlink" element
         */
        public boolean isSetSubHyperlink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBHYPERLINK$0) != 0;
            }
        }
        
        /**
         * Sets the "sub-hyperlink" element
         */
        public void setSubHyperlink(com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink subHyperlink)
        {
            generatedSetterHelperImpl(subHyperlink, SUBHYPERLINK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "sub-hyperlink" element
         */
        public com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink addNewSubHyperlink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink target = null;
                target = (com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink)get_store().add_element_user(SUBHYPERLINK$0);
                return target;
            }
        }
        
        /**
         * Unsets the "sub-hyperlink" element
         */
        public void unsetSubHyperlink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBHYPERLINK$0, 0);
            }
        }
        
        /**
         * Gets the "size" attribute
         */
        public java.math.BigInteger getSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SIZE$2);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "size" attribute
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(SIZE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_default_attribute_value(SIZE$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "size" attribute
         */
        public boolean isSetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SIZE$2) != null;
            }
        }
        
        /**
         * Sets the "size" attribute
         */
        public void setSize(java.math.BigInteger size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$2);
                }
                target.setBigIntegerValue(size);
            }
        }
        
        /**
         * Sets (as xml) the "size" attribute
         */
        public void xsetSize(org.apache.xmlbeans.XmlPositiveInteger size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(SIZE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(SIZE$2);
                }
                target.set(size);
            }
        }
        
        /**
         * Unsets the "size" attribute
         */
        public void unsetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SIZE$2);
            }
        }
        
        /**
         * Gets the "maxlength" attribute
         */
        public java.math.BigInteger getMaxlength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXLENGTH$4);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "maxlength" attribute
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetMaxlength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(MAXLENGTH$4);
                return target;
            }
        }
        
        /**
         * True if has "maxlength" attribute
         */
        public boolean isSetMaxlength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MAXLENGTH$4) != null;
            }
        }
        
        /**
         * Sets the "maxlength" attribute
         */
        public void setMaxlength(java.math.BigInteger maxlength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXLENGTH$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXLENGTH$4);
                }
                target.setBigIntegerValue(maxlength);
            }
        }
        
        /**
         * Sets (as xml) the "maxlength" attribute
         */
        public void xsetMaxlength(org.apache.xmlbeans.XmlPositiveInteger maxlength)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(MAXLENGTH$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(MAXLENGTH$4);
                }
                target.set(maxlength);
            }
        }
        
        /**
         * Unsets the "maxlength" attribute
         */
        public void unsetMaxlength()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MAXLENGTH$4);
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
         * Gets the "client-autocomplete-field" attribute
         */
        public com.kyt.xsd.widgetform.FileDocument.File.ClientAutocompleteField.Enum getClientAutocompleteField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTAUTOCOMPLETEFIELD$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLIENTAUTOCOMPLETEFIELD$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FileDocument.File.ClientAutocompleteField.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "client-autocomplete-field" attribute
         */
        public com.kyt.xsd.widgetform.FileDocument.File.ClientAutocompleteField xgetClientAutocompleteField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FileDocument.File.ClientAutocompleteField target = null;
                target = (com.kyt.xsd.widgetform.FileDocument.File.ClientAutocompleteField)get_store().find_attribute_user(CLIENTAUTOCOMPLETEFIELD$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FileDocument.File.ClientAutocompleteField)get_default_attribute_value(CLIENTAUTOCOMPLETEFIELD$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "client-autocomplete-field" attribute
         */
        public boolean isSetClientAutocompleteField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLIENTAUTOCOMPLETEFIELD$8) != null;
            }
        }
        
        /**
         * Sets the "client-autocomplete-field" attribute
         */
        public void setClientAutocompleteField(com.kyt.xsd.widgetform.FileDocument.File.ClientAutocompleteField.Enum clientAutocompleteField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTAUTOCOMPLETEFIELD$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTAUTOCOMPLETEFIELD$8);
                }
                target.setEnumValue(clientAutocompleteField);
            }
        }
        
        /**
         * Sets (as xml) the "client-autocomplete-field" attribute
         */
        public void xsetClientAutocompleteField(com.kyt.xsd.widgetform.FileDocument.File.ClientAutocompleteField clientAutocompleteField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FileDocument.File.ClientAutocompleteField target = null;
                target = (com.kyt.xsd.widgetform.FileDocument.File.ClientAutocompleteField)get_store().find_attribute_user(CLIENTAUTOCOMPLETEFIELD$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FileDocument.File.ClientAutocompleteField)get_store().add_attribute_user(CLIENTAUTOCOMPLETEFIELD$8);
                }
                target.set(clientAutocompleteField);
            }
        }
        
        /**
         * Unsets the "client-autocomplete-field" attribute
         */
        public void unsetClientAutocompleteField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLIENTAUTOCOMPLETEFIELD$8);
            }
        }
        /**
         * An XML client-autocomplete-field(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FileDocument$File$ClientAutocompleteField.
         */
        public static class ClientAutocompleteFieldImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FileDocument.File.ClientAutocompleteField
        {
            private static final long serialVersionUID = 1L;
            
            public ClientAutocompleteFieldImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ClientAutocompleteFieldImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
