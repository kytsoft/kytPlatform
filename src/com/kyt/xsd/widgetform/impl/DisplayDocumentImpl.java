/*
 * An XML document type.
 * Localname: display
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.DisplayDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one display(@) element.
 *
 * This is a complex type.
 */
public class DisplayDocumentImpl extends com.kyt.xsd.widgetform.impl.AllFieldsDocumentImpl implements com.kyt.xsd.widgetform.DisplayDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisplayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAY$0 = 
        new javax.xml.namespace.QName("", "display");
    
    
    /**
     * Gets the "display" element
     */
    public com.kyt.xsd.widgetform.DisplayDocument.Display getDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.DisplayDocument.Display target = null;
            target = (com.kyt.xsd.widgetform.DisplayDocument.Display)get_store().find_element_user(DISPLAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "display" element
     */
    public void setDisplay(com.kyt.xsd.widgetform.DisplayDocument.Display display)
    {
        generatedSetterHelperImpl(display, DISPLAY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "display" element
     */
    public com.kyt.xsd.widgetform.DisplayDocument.Display addNewDisplay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.DisplayDocument.Display target = null;
            target = (com.kyt.xsd.widgetform.DisplayDocument.Display)get_store().add_element_user(DISPLAY$0);
            return target;
        }
    }
    /**
     * An XML display(@).
     *
     * This is a complex type.
     */
    public static class DisplayImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.DisplayDocument.Display
    {
        private static final long serialVersionUID = 1L;
        
        public DisplayImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INPLACEEDITOR$0 = 
            new javax.xml.namespace.QName("", "in-place-editor");
        private static final javax.xml.namespace.QName ALSOHIDDEN$2 = 
            new javax.xml.namespace.QName("", "also-hidden");
        private static final javax.xml.namespace.QName DESCRIPTION$4 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName SIZE$6 = 
            new javax.xml.namespace.QName("", "size");
        private static final javax.xml.namespace.QName TYPE$8 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName CURRENCY$10 = 
            new javax.xml.namespace.QName("", "currency");
        private static final javax.xml.namespace.QName IMAGELOCATION$12 = 
            new javax.xml.namespace.QName("", "image-location");
        private static final javax.xml.namespace.QName DEFAULTVALUE$14 = 
            new javax.xml.namespace.QName("", "default-value");
        
        
        /**
         * Gets the "in-place-editor" element
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor getInPlaceEditor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor)get_store().find_element_user(INPLACEEDITOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "in-place-editor" element
         */
        public boolean isSetInPlaceEditor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INPLACEEDITOR$0) != 0;
            }
        }
        
        /**
         * Sets the "in-place-editor" element
         */
        public void setInPlaceEditor(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor inPlaceEditor)
        {
            generatedSetterHelperImpl(inPlaceEditor, INPLACEEDITOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "in-place-editor" element
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor addNewInPlaceEditor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor)get_store().add_element_user(INPLACEEDITOR$0);
                return target;
            }
        }
        
        /**
         * Unsets the "in-place-editor" element
         */
        public void unsetInPlaceEditor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INPLACEEDITOR$0, 0);
            }
        }
        
        /**
         * Gets the "also-hidden" attribute
         */
        public com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden.Enum getAlsoHidden()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALSOHIDDEN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALSOHIDDEN$2);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "also-hidden" attribute
         */
        public com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden xgetAlsoHidden()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden target = null;
                target = (com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden)get_store().find_attribute_user(ALSOHIDDEN$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden)get_default_attribute_value(ALSOHIDDEN$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "also-hidden" attribute
         */
        public boolean isSetAlsoHidden()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ALSOHIDDEN$2) != null;
            }
        }
        
        /**
         * Sets the "also-hidden" attribute
         */
        public void setAlsoHidden(com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden.Enum alsoHidden)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALSOHIDDEN$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALSOHIDDEN$2);
                }
                target.setEnumValue(alsoHidden);
            }
        }
        
        /**
         * Sets (as xml) the "also-hidden" attribute
         */
        public void xsetAlsoHidden(com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden alsoHidden)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden target = null;
                target = (com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden)get_store().find_attribute_user(ALSOHIDDEN$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden)get_store().add_attribute_user(ALSOHIDDEN$2);
                }
                target.set(alsoHidden);
            }
        }
        
        /**
         * Unsets the "also-hidden" attribute
         */
        public void unsetAlsoHidden()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ALSOHIDDEN$2);
            }
        }
        
        /**
         * Gets the "description" attribute
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$4);
                return target;
            }
        }
        
        /**
         * True if has "description" attribute
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DESCRIPTION$4) != null;
            }
        }
        
        /**
         * Sets the "description" attribute
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$4);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" attribute
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$4);
                }
                target.set(description);
            }
        }
        
        /**
         * Unsets the "description" attribute
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DESCRIPTION$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$6);
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
        public org.apache.xmlbeans.XmlInteger xgetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SIZE$6);
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
                return get_store().find_attribute_user(SIZE$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$6);
                }
                target.setBigIntegerValue(size);
            }
        }
        
        /**
         * Sets (as xml) the "size" attribute
         */
        public void xsetSize(org.apache.xmlbeans.XmlInteger size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SIZE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SIZE$6);
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
                get_store().remove_attribute(SIZE$6);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public com.kyt.xsd.widgetform.DisplayDocument.Display.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.DisplayDocument.Display.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.widgetform.DisplayDocument.Display.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.DisplayDocument.Display.Type target = null;
                target = (com.kyt.xsd.widgetform.DisplayDocument.Display.Type)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.DisplayDocument.Display.Type)get_default_attribute_value(TYPE$8);
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
                return get_store().find_attribute_user(TYPE$8) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.kyt.xsd.widgetform.DisplayDocument.Display.Type.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(com.kyt.xsd.widgetform.DisplayDocument.Display.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.DisplayDocument.Display.Type target = null;
                target = (com.kyt.xsd.widgetform.DisplayDocument.Display.Type)get_store().find_attribute_user(TYPE$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.DisplayDocument.Display.Type)get_store().add_attribute_user(TYPE$8);
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
                get_store().remove_attribute(TYPE$8);
            }
        }
        
        /**
         * Gets the "currency" attribute
         */
        public java.lang.String getCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCY$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "currency" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CURRENCY$10);
                return target;
            }
        }
        
        /**
         * True if has "currency" attribute
         */
        public boolean isSetCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CURRENCY$10) != null;
            }
        }
        
        /**
         * Sets the "currency" attribute
         */
        public void setCurrency(java.lang.String currency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCY$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENCY$10);
                }
                target.setStringValue(currency);
            }
        }
        
        /**
         * Sets (as xml) the "currency" attribute
         */
        public void xsetCurrency(org.apache.xmlbeans.XmlString currency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CURRENCY$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CURRENCY$10);
                }
                target.set(currency);
            }
        }
        
        /**
         * Unsets the "currency" attribute
         */
        public void unsetCurrency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CURRENCY$10);
            }
        }
        
        /**
         * Gets the "image-location" attribute
         */
        public java.lang.String getImageLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMAGELOCATION$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "image-location" attribute
         */
        public org.apache.xmlbeans.XmlString xgetImageLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IMAGELOCATION$12);
                return target;
            }
        }
        
        /**
         * True if has "image-location" attribute
         */
        public boolean isSetImageLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IMAGELOCATION$12) != null;
            }
        }
        
        /**
         * Sets the "image-location" attribute
         */
        public void setImageLocation(java.lang.String imageLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMAGELOCATION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMAGELOCATION$12);
                }
                target.setStringValue(imageLocation);
            }
        }
        
        /**
         * Sets (as xml) the "image-location" attribute
         */
        public void xsetImageLocation(org.apache.xmlbeans.XmlString imageLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IMAGELOCATION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IMAGELOCATION$12);
                }
                target.set(imageLocation);
            }
        }
        
        /**
         * Unsets the "image-location" attribute
         */
        public void unsetImageLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IMAGELOCATION$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTVALUE$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTVALUE$14);
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
                return get_store().find_attribute_user(DEFAULTVALUE$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTVALUE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTVALUE$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTVALUE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTVALUE$14);
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
                get_store().remove_attribute(DEFAULTVALUE$14);
            }
        }
        /**
         * An XML also-hidden(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DisplayDocument$Display$AlsoHidden.
         */
        public static class AlsoHiddenImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.DisplayDocument.Display.AlsoHidden
        {
            private static final long serialVersionUID = 1L;
            
            public AlsoHiddenImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AlsoHiddenImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DisplayDocument$Display$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.DisplayDocument.Display.Type
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
