/*
 * An XML document type.
 * Localname: hyperlink
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.HyperlinkDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one hyperlink(@) element.
 *
 * This is a complex type.
 */
public class HyperlinkDocumentImpl extends com.kyt.xsd.widgetform.impl.AllFieldsDocumentImpl implements com.kyt.xsd.widgetform.HyperlinkDocument
{
    private static final long serialVersionUID = 1L;
    
    public HyperlinkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HYPERLINK$0 = 
        new javax.xml.namespace.QName("", "hyperlink");
    
    
    /**
     * Gets the "hyperlink" element
     */
    public com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink getHyperlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink target = null;
            target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink)get_store().find_element_user(HYPERLINK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "hyperlink" element
     */
    public void setHyperlink(com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink hyperlink)
    {
        generatedSetterHelperImpl(hyperlink, HYPERLINK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "hyperlink" element
     */
    public com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink addNewHyperlink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink target = null;
            target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink)get_store().add_element_user(HYPERLINK$0);
            return target;
        }
    }
    /**
     * An XML hyperlink(@).
     *
     * This is a complex type.
     */
    public static class HyperlinkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink
    {
        private static final long serialVersionUID = 1L;
        
        public HyperlinkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARAMETER$0 = 
            new javax.xml.namespace.QName("", "parameter");
        private static final javax.xml.namespace.QName ALSOHIDDEN$2 = 
            new javax.xml.namespace.QName("", "also-hidden");
        private static final javax.xml.namespace.QName LINKTYPE$4 = 
            new javax.xml.namespace.QName("", "link-type");
        private static final javax.xml.namespace.QName TARGETTYPE$6 = 
            new javax.xml.namespace.QName("", "target-type");
        private static final javax.xml.namespace.QName TARGET$8 = 
            new javax.xml.namespace.QName("", "target");
        private static final javax.xml.namespace.QName DESCRIPTION$10 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName TARGETWINDOW$12 = 
            new javax.xml.namespace.QName("", "target-window");
        private static final javax.xml.namespace.QName ALTERNATE$14 = 
            new javax.xml.namespace.QName("", "alternate");
        private static final javax.xml.namespace.QName IMAGETITLE$16 = 
            new javax.xml.namespace.QName("", "image-title");
        private static final javax.xml.namespace.QName IMAGELOCATION$18 = 
            new javax.xml.namespace.QName("", "image-location");
        private static final javax.xml.namespace.QName REQUESTCONFIRMATION$20 = 
            new javax.xml.namespace.QName("", "request-confirmation");
        private static final javax.xml.namespace.QName CONFIRMATIONMESSAGE$22 = 
            new javax.xml.namespace.QName("", "confirmation-message");
        private static final javax.xml.namespace.QName PARAMETERSMAP$24 = 
            new javax.xml.namespace.QName("", "parameters-map");
        private static final javax.xml.namespace.QName SIZE$26 = 
            new javax.xml.namespace.QName("", "size");
        
        
        /**
         * Gets array of all "parameter" elements
         */
        public com.kyt.xsd.widgetform.ParameterDocument.Parameter[] getParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAMETER$0, targetList);
                com.kyt.xsd.widgetform.ParameterDocument.Parameter[] result = new com.kyt.xsd.widgetform.ParameterDocument.Parameter[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "parameter" element
         */
        public com.kyt.xsd.widgetform.ParameterDocument.Parameter getParameterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ParameterDocument.Parameter target = null;
                target = (com.kyt.xsd.widgetform.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "parameter" element
         */
        public int sizeOfParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PARAMETER$0);
            }
        }
        
        /**
         * Sets array of all "parameter" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setParameterArray(com.kyt.xsd.widgetform.ParameterDocument.Parameter[] parameterArray)
        {
            check_orphaned();
            arraySetterHelper(parameterArray, PARAMETER$0);
        }
        
        /**
         * Sets ith "parameter" element
         */
        public void setParameterArray(int i, com.kyt.xsd.widgetform.ParameterDocument.Parameter parameter)
        {
            generatedSetterHelperImpl(parameter, PARAMETER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "parameter" element
         */
        public com.kyt.xsd.widgetform.ParameterDocument.Parameter insertNewParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ParameterDocument.Parameter target = null;
                target = (com.kyt.xsd.widgetform.ParameterDocument.Parameter)get_store().insert_element_user(PARAMETER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "parameter" element
         */
        public com.kyt.xsd.widgetform.ParameterDocument.Parameter addNewParameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ParameterDocument.Parameter target = null;
                target = (com.kyt.xsd.widgetform.ParameterDocument.Parameter)get_store().add_element_user(PARAMETER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "parameter" element
         */
        public void removeParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PARAMETER$0, i);
            }
        }
        
        /**
         * Gets the "also-hidden" attribute
         */
        public com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.AlsoHidden.Enum getAlsoHidden()
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
                return (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.AlsoHidden.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "also-hidden" attribute
         */
        public com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.AlsoHidden xgetAlsoHidden()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.AlsoHidden target = null;
                target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.AlsoHidden)get_store().find_attribute_user(ALSOHIDDEN$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.AlsoHidden)get_default_attribute_value(ALSOHIDDEN$2);
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
        public void setAlsoHidden(com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.AlsoHidden.Enum alsoHidden)
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
        public void xsetAlsoHidden(com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.AlsoHidden alsoHidden)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.AlsoHidden target = null;
                target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.AlsoHidden)get_store().find_attribute_user(ALSOHIDDEN$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.AlsoHidden)get_store().add_attribute_user(ALSOHIDDEN$2);
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
         * Gets the "link-type" attribute
         */
        public com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.LinkType.Enum getLinkType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKTYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LINKTYPE$4);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.LinkType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "link-type" attribute
         */
        public com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.LinkType xgetLinkType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.LinkType target = null;
                target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.LinkType)get_store().find_attribute_user(LINKTYPE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.LinkType)get_default_attribute_value(LINKTYPE$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "link-type" attribute
         */
        public boolean isSetLinkType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LINKTYPE$4) != null;
            }
        }
        
        /**
         * Sets the "link-type" attribute
         */
        public void setLinkType(com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.LinkType.Enum linkType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKTYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINKTYPE$4);
                }
                target.setEnumValue(linkType);
            }
        }
        
        /**
         * Sets (as xml) the "link-type" attribute
         */
        public void xsetLinkType(com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.LinkType linkType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.LinkType target = null;
                target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.LinkType)get_store().find_attribute_user(LINKTYPE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.LinkType)get_store().add_attribute_user(LINKTYPE$4);
                }
                target.set(linkType);
            }
        }
        
        /**
         * Unsets the "link-type" attribute
         */
        public void unsetLinkType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LINKTYPE$4);
            }
        }
        
        /**
         * Gets the "target-type" attribute
         */
        public com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.TargetType.Enum getTargetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TARGETTYPE$6);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.TargetType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "target-type" attribute
         */
        public com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.TargetType xgetTargetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.TargetType target = null;
                target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.TargetType)get_store().find_attribute_user(TARGETTYPE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.TargetType)get_default_attribute_value(TARGETTYPE$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "target-type" attribute
         */
        public boolean isSetTargetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGETTYPE$6) != null;
            }
        }
        
        /**
         * Sets the "target-type" attribute
         */
        public void setTargetType(com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.TargetType.Enum targetType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETTYPE$6);
                }
                target.setEnumValue(targetType);
            }
        }
        
        /**
         * Sets (as xml) the "target-type" attribute
         */
        public void xsetTargetType(com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.TargetType targetType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.TargetType target = null;
                target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.TargetType)get_store().find_attribute_user(TARGETTYPE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.TargetType)get_store().add_attribute_user(TARGETTYPE$6);
                }
                target.set(targetType);
            }
        }
        
        /**
         * Unsets the "target-type" attribute
         */
        public void unsetTargetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGETTYPE$6);
            }
        }
        
        /**
         * Gets the "target" attribute
         */
        public java.lang.String getTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "target" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$8);
                return target;
            }
        }
        
        /**
         * Sets the "target" attribute
         */
        public void setTarget(java.lang.String targetValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGET$8);
                }
                target.setStringValue(targetValue);
            }
        }
        
        /**
         * Sets (as xml) the "target" attribute
         */
        public void xsetTarget(org.apache.xmlbeans.XmlString targetValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGET$8);
                }
                target.set(targetValue);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
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
                return get_store().find_attribute_user(DESCRIPTION$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$10);
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
                get_store().remove_attribute(DESCRIPTION$10);
            }
        }
        
        /**
         * Gets the "target-window" attribute
         */
        public java.lang.String getTargetWindow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETWINDOW$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "target-window" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTargetWindow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGETWINDOW$12);
                return target;
            }
        }
        
        /**
         * True if has "target-window" attribute
         */
        public boolean isSetTargetWindow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGETWINDOW$12) != null;
            }
        }
        
        /**
         * Sets the "target-window" attribute
         */
        public void setTargetWindow(java.lang.String targetWindow)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETWINDOW$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETWINDOW$12);
                }
                target.setStringValue(targetWindow);
            }
        }
        
        /**
         * Sets (as xml) the "target-window" attribute
         */
        public void xsetTargetWindow(org.apache.xmlbeans.XmlString targetWindow)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGETWINDOW$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGETWINDOW$12);
                }
                target.set(targetWindow);
            }
        }
        
        /**
         * Unsets the "target-window" attribute
         */
        public void unsetTargetWindow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGETWINDOW$12);
            }
        }
        
        /**
         * Gets the "alternate" attribute
         */
        public java.lang.String getAlternate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTERNATE$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "alternate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAlternate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALTERNATE$14);
                return target;
            }
        }
        
        /**
         * True if has "alternate" attribute
         */
        public boolean isSetAlternate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ALTERNATE$14) != null;
            }
        }
        
        /**
         * Sets the "alternate" attribute
         */
        public void setAlternate(java.lang.String alternate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALTERNATE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALTERNATE$14);
                }
                target.setStringValue(alternate);
            }
        }
        
        /**
         * Sets (as xml) the "alternate" attribute
         */
        public void xsetAlternate(org.apache.xmlbeans.XmlString alternate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ALTERNATE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ALTERNATE$14);
                }
                target.set(alternate);
            }
        }
        
        /**
         * Unsets the "alternate" attribute
         */
        public void unsetAlternate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ALTERNATE$14);
            }
        }
        
        /**
         * Gets the "image-title" attribute
         */
        public java.lang.String getImageTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMAGETITLE$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "image-title" attribute
         */
        public org.apache.xmlbeans.XmlString xgetImageTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IMAGETITLE$16);
                return target;
            }
        }
        
        /**
         * True if has "image-title" attribute
         */
        public boolean isSetImageTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IMAGETITLE$16) != null;
            }
        }
        
        /**
         * Sets the "image-title" attribute
         */
        public void setImageTitle(java.lang.String imageTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMAGETITLE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMAGETITLE$16);
                }
                target.setStringValue(imageTitle);
            }
        }
        
        /**
         * Sets (as xml) the "image-title" attribute
         */
        public void xsetImageTitle(org.apache.xmlbeans.XmlString imageTitle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IMAGETITLE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IMAGETITLE$16);
                }
                target.set(imageTitle);
            }
        }
        
        /**
         * Unsets the "image-title" attribute
         */
        public void unsetImageTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IMAGETITLE$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMAGELOCATION$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IMAGELOCATION$18);
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
                return get_store().find_attribute_user(IMAGELOCATION$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMAGELOCATION$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMAGELOCATION$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IMAGELOCATION$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IMAGELOCATION$18);
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
                get_store().remove_attribute(IMAGELOCATION$18);
            }
        }
        
        /**
         * Gets the "request-confirmation" attribute
         */
        public com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.RequestConfirmation.Enum getRequestConfirmation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTCONFIRMATION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REQUESTCONFIRMATION$20);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.RequestConfirmation.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "request-confirmation" attribute
         */
        public com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.RequestConfirmation xgetRequestConfirmation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.RequestConfirmation target = null;
                target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.RequestConfirmation)get_store().find_attribute_user(REQUESTCONFIRMATION$20);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.RequestConfirmation)get_default_attribute_value(REQUESTCONFIRMATION$20);
                }
                return target;
            }
        }
        
        /**
         * True if has "request-confirmation" attribute
         */
        public boolean isSetRequestConfirmation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUESTCONFIRMATION$20) != null;
            }
        }
        
        /**
         * Sets the "request-confirmation" attribute
         */
        public void setRequestConfirmation(com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.RequestConfirmation.Enum requestConfirmation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUESTCONFIRMATION$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUESTCONFIRMATION$20);
                }
                target.setEnumValue(requestConfirmation);
            }
        }
        
        /**
         * Sets (as xml) the "request-confirmation" attribute
         */
        public void xsetRequestConfirmation(com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.RequestConfirmation requestConfirmation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.RequestConfirmation target = null;
                target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.RequestConfirmation)get_store().find_attribute_user(REQUESTCONFIRMATION$20);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.RequestConfirmation)get_store().add_attribute_user(REQUESTCONFIRMATION$20);
                }
                target.set(requestConfirmation);
            }
        }
        
        /**
         * Unsets the "request-confirmation" attribute
         */
        public void unsetRequestConfirmation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUESTCONFIRMATION$20);
            }
        }
        
        /**
         * Gets the "confirmation-message" attribute
         */
        public java.lang.String getConfirmationMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONFIRMATIONMESSAGE$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "confirmation-message" attribute
         */
        public org.apache.xmlbeans.XmlString xgetConfirmationMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONFIRMATIONMESSAGE$22);
                return target;
            }
        }
        
        /**
         * True if has "confirmation-message" attribute
         */
        public boolean isSetConfirmationMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONFIRMATIONMESSAGE$22) != null;
            }
        }
        
        /**
         * Sets the "confirmation-message" attribute
         */
        public void setConfirmationMessage(java.lang.String confirmationMessage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONFIRMATIONMESSAGE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONFIRMATIONMESSAGE$22);
                }
                target.setStringValue(confirmationMessage);
            }
        }
        
        /**
         * Sets (as xml) the "confirmation-message" attribute
         */
        public void xsetConfirmationMessage(org.apache.xmlbeans.XmlString confirmationMessage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONFIRMATIONMESSAGE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONFIRMATIONMESSAGE$22);
                }
                target.set(confirmationMessage);
            }
        }
        
        /**
         * Unsets the "confirmation-message" attribute
         */
        public void unsetConfirmationMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONFIRMATIONMESSAGE$22);
            }
        }
        
        /**
         * Gets the "parameters-map" attribute
         */
        public java.lang.String getParametersMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERSMAP$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parameters-map" attribute
         */
        public org.apache.xmlbeans.XmlString xgetParametersMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAMETERSMAP$24);
                return target;
            }
        }
        
        /**
         * True if has "parameters-map" attribute
         */
        public boolean isSetParametersMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARAMETERSMAP$24) != null;
            }
        }
        
        /**
         * Sets the "parameters-map" attribute
         */
        public void setParametersMap(java.lang.String parametersMap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERSMAP$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARAMETERSMAP$24);
                }
                target.setStringValue(parametersMap);
            }
        }
        
        /**
         * Sets (as xml) the "parameters-map" attribute
         */
        public void xsetParametersMap(org.apache.xmlbeans.XmlString parametersMap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAMETERSMAP$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARAMETERSMAP$24);
                }
                target.set(parametersMap);
            }
        }
        
        /**
         * Unsets the "parameters-map" attribute
         */
        public void unsetParametersMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARAMETERSMAP$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$26);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SIZE$26);
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
                return get_store().find_attribute_user(SIZE$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$26);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SIZE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SIZE$26);
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
                get_store().remove_attribute(SIZE$26);
            }
        }
        /**
         * An XML also-hidden(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.HyperlinkDocument$Hyperlink$AlsoHidden.
         */
        public static class AlsoHiddenImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.AlsoHidden
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
         * An XML link-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.HyperlinkDocument$Hyperlink$LinkType.
         */
        public static class LinkTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.LinkType
        {
            private static final long serialVersionUID = 1L;
            
            public LinkTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected LinkTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML target-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.HyperlinkDocument$Hyperlink$TargetType.
         */
        public static class TargetTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.TargetType
        {
            private static final long serialVersionUID = 1L;
            
            public TargetTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TargetTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML request-confirmation(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.HyperlinkDocument$Hyperlink$RequestConfirmation.
         */
        public static class RequestConfirmationImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.HyperlinkDocument.Hyperlink.RequestConfirmation
        {
            private static final long serialVersionUID = 1L;
            
            public RequestConfirmationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RequestConfirmationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
