/*
 * An XML document type.
 * Localname: link
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.LinkDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one link(@) element.
 *
 * This is a complex type.
 */
public class LinkDocumentImpl extends com.kyt.xsd.widgetscreen.impl.AllWidgetsDocumentImpl implements com.kyt.xsd.widgetscreen.LinkDocument
{
    private static final long serialVersionUID = 1L;
    
    public LinkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINK$0 = 
        new javax.xml.namespace.QName("", "link");
    
    
    /**
     * Gets the "link" element
     */
    public com.kyt.xsd.widgetscreen.LinkDocument.Link getLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.LinkDocument.Link target = null;
            target = (com.kyt.xsd.widgetscreen.LinkDocument.Link)get_store().find_element_user(LINK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "link" element
     */
    public void setLink(com.kyt.xsd.widgetscreen.LinkDocument.Link link)
    {
        generatedSetterHelperImpl(link, LINK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "link" element
     */
    public com.kyt.xsd.widgetscreen.LinkDocument.Link addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.LinkDocument.Link target = null;
            target = (com.kyt.xsd.widgetscreen.LinkDocument.Link)get_store().add_element_user(LINK$0);
            return target;
        }
    }
    /**
     * An XML link(@).
     *
     * This is a complex type.
     */
    public static class LinkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.LinkDocument.Link
    {
        private static final long serialVersionUID = 1L;
        
        public LinkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARAMETER$0 = 
            new javax.xml.namespace.QName("", "parameter");
        private static final javax.xml.namespace.QName IMAGE$2 = 
            new javax.xml.namespace.QName("", "image");
        private static final javax.xml.namespace.QName TEXT$4 = 
            new javax.xml.namespace.QName("", "text");
        private static final javax.xml.namespace.QName ID$6 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName STYLE$8 = 
            new javax.xml.namespace.QName("", "style");
        private static final javax.xml.namespace.QName TARGET$10 = 
            new javax.xml.namespace.QName("", "target");
        private static final javax.xml.namespace.QName NAME$12 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName TARGETWINDOW$14 = 
            new javax.xml.namespace.QName("", "target-window");
        private static final javax.xml.namespace.QName PREFIX$16 = 
            new javax.xml.namespace.QName("", "prefix");
        private static final javax.xml.namespace.QName WIDTH$18 = 
            new javax.xml.namespace.QName("", "width");
        private static final javax.xml.namespace.QName HEIGHT$20 = 
            new javax.xml.namespace.QName("", "height");
        private static final javax.xml.namespace.QName LINKTYPE$22 = 
            new javax.xml.namespace.QName("", "link-type");
        private static final javax.xml.namespace.QName URLMODE$24 = 
            new javax.xml.namespace.QName("", "url-mode");
        private static final javax.xml.namespace.QName FULLPATH$26 = 
            new javax.xml.namespace.QName("", "full-path");
        private static final javax.xml.namespace.QName SECURE$28 = 
            new javax.xml.namespace.QName("", "secure");
        private static final javax.xml.namespace.QName ENCODE$30 = 
            new javax.xml.namespace.QName("", "encode");
        
        
        /**
         * Gets array of all "parameter" elements
         */
        public com.kyt.xsd.widgetscreen.ParameterDocument.Parameter[] getParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PARAMETER$0, targetList);
                com.kyt.xsd.widgetscreen.ParameterDocument.Parameter[] result = new com.kyt.xsd.widgetscreen.ParameterDocument.Parameter[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "parameter" element
         */
        public com.kyt.xsd.widgetscreen.ParameterDocument.Parameter getParameterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ParameterDocument.Parameter target = null;
                target = (com.kyt.xsd.widgetscreen.ParameterDocument.Parameter)get_store().find_element_user(PARAMETER$0, i);
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
        public void setParameterArray(com.kyt.xsd.widgetscreen.ParameterDocument.Parameter[] parameterArray)
        {
            check_orphaned();
            arraySetterHelper(parameterArray, PARAMETER$0);
        }
        
        /**
         * Sets ith "parameter" element
         */
        public void setParameterArray(int i, com.kyt.xsd.widgetscreen.ParameterDocument.Parameter parameter)
        {
            generatedSetterHelperImpl(parameter, PARAMETER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "parameter" element
         */
        public com.kyt.xsd.widgetscreen.ParameterDocument.Parameter insertNewParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ParameterDocument.Parameter target = null;
                target = (com.kyt.xsd.widgetscreen.ParameterDocument.Parameter)get_store().insert_element_user(PARAMETER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "parameter" element
         */
        public com.kyt.xsd.widgetscreen.ParameterDocument.Parameter addNewParameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ParameterDocument.Parameter target = null;
                target = (com.kyt.xsd.widgetscreen.ParameterDocument.Parameter)get_store().add_element_user(PARAMETER$0);
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
         * Gets the "image" element
         */
        public com.kyt.xsd.widgetscreen.ImageDocument.Image getImage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ImageDocument.Image target = null;
                target = (com.kyt.xsd.widgetscreen.ImageDocument.Image)get_store().find_element_user(IMAGE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "image" element
         */
        public boolean isSetImage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IMAGE$2) != 0;
            }
        }
        
        /**
         * Sets the "image" element
         */
        public void setImage(com.kyt.xsd.widgetscreen.ImageDocument.Image image)
        {
            generatedSetterHelperImpl(image, IMAGE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "image" element
         */
        public com.kyt.xsd.widgetscreen.ImageDocument.Image addNewImage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ImageDocument.Image target = null;
                target = (com.kyt.xsd.widgetscreen.ImageDocument.Image)get_store().add_element_user(IMAGE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "image" element
         */
        public void unsetImage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IMAGE$2, 0);
            }
        }
        
        /**
         * Gets the "text" attribute
         */
        public java.lang.String getText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text" attribute
         */
        public org.apache.xmlbeans.XmlString xgetText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXT$4);
                return target;
            }
        }
        
        /**
         * True if has "text" attribute
         */
        public boolean isSetText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEXT$4) != null;
            }
        }
        
        /**
         * Sets the "text" attribute
         */
        public void setText(java.lang.String text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXT$4);
                }
                target.setStringValue(text);
            }
        }
        
        /**
         * Sets (as xml) the "text" attribute
         */
        public void xsetText(org.apache.xmlbeans.XmlString text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXT$4);
                }
                target.set(text);
            }
        }
        
        /**
         * Unsets the "text" attribute
         */
        public void unsetText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEXT$4);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$6);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$6) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$6);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$6);
            }
        }
        
        /**
         * Gets the "style" attribute
         */
        public java.lang.String getStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$8);
                return target;
            }
        }
        
        /**
         * True if has "style" attribute
         */
        public boolean isSetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STYLE$8) != null;
            }
        }
        
        /**
         * Sets the "style" attribute
         */
        public void setStyle(java.lang.String style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$8);
                }
                target.setStringValue(style);
            }
        }
        
        /**
         * Sets (as xml) the "style" attribute
         */
        public void xsetStyle(org.apache.xmlbeans.XmlString style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STYLE$8);
                }
                target.set(style);
            }
        }
        
        /**
         * Unsets the "style" attribute
         */
        public void unsetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STYLE$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$10);
                return target;
            }
        }
        
        /**
         * True if has "target" attribute
         */
        public boolean isSetTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGET$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGET$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGET$10);
                }
                target.set(targetValue);
            }
        }
        
        /**
         * Unsets the "target" attribute
         */
        public void unsetTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGET$10);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$12) != null;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$12);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$12);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETWINDOW$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGETWINDOW$14);
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
                return get_store().find_attribute_user(TARGETWINDOW$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETWINDOW$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETWINDOW$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGETWINDOW$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGETWINDOW$14);
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
                get_store().remove_attribute(TARGETWINDOW$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFIX$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREFIX$16);
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
                return get_store().find_attribute_user(PREFIX$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFIX$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFIX$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREFIX$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PREFIX$16);
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
                get_store().remove_attribute(PREFIX$16);
            }
        }
        
        /**
         * Gets the "width" attribute
         */
        public java.lang.String getWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "width" attribute
         */
        public org.apache.xmlbeans.XmlString xgetWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WIDTH$18);
                return target;
            }
        }
        
        /**
         * True if has "width" attribute
         */
        public boolean isSetWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WIDTH$18) != null;
            }
        }
        
        /**
         * Sets the "width" attribute
         */
        public void setWidth(java.lang.String width)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$18);
                }
                target.setStringValue(width);
            }
        }
        
        /**
         * Sets (as xml) the "width" attribute
         */
        public void xsetWidth(org.apache.xmlbeans.XmlString width)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WIDTH$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WIDTH$18);
                }
                target.set(width);
            }
        }
        
        /**
         * Unsets the "width" attribute
         */
        public void unsetWidth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WIDTH$18);
            }
        }
        
        /**
         * Gets the "height" attribute
         */
        public java.lang.String getHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "height" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEIGHT$20);
                return target;
            }
        }
        
        /**
         * True if has "height" attribute
         */
        public boolean isSetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEIGHT$20) != null;
            }
        }
        
        /**
         * Sets the "height" attribute
         */
        public void setHeight(java.lang.String height)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEIGHT$20);
                }
                target.setStringValue(height);
            }
        }
        
        /**
         * Sets (as xml) the "height" attribute
         */
        public void xsetHeight(org.apache.xmlbeans.XmlString height)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEIGHT$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEIGHT$20);
                }
                target.set(height);
            }
        }
        
        /**
         * Unsets the "height" attribute
         */
        public void unsetHeight()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEIGHT$20);
            }
        }
        
        /**
         * Gets the "link-type" attribute
         */
        public com.kyt.xsd.widgetscreen.LinkDocument.Link.LinkType.Enum getLinkType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKTYPE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LINKTYPE$22);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.LinkDocument.Link.LinkType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "link-type" attribute
         */
        public com.kyt.xsd.widgetscreen.LinkDocument.Link.LinkType xgetLinkType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.LinkDocument.Link.LinkType target = null;
                target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.LinkType)get_store().find_attribute_user(LINKTYPE$22);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.LinkType)get_default_attribute_value(LINKTYPE$22);
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
                return get_store().find_attribute_user(LINKTYPE$22) != null;
            }
        }
        
        /**
         * Sets the "link-type" attribute
         */
        public void setLinkType(com.kyt.xsd.widgetscreen.LinkDocument.Link.LinkType.Enum linkType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKTYPE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINKTYPE$22);
                }
                target.setEnumValue(linkType);
            }
        }
        
        /**
         * Sets (as xml) the "link-type" attribute
         */
        public void xsetLinkType(com.kyt.xsd.widgetscreen.LinkDocument.Link.LinkType linkType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.LinkDocument.Link.LinkType target = null;
                target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.LinkType)get_store().find_attribute_user(LINKTYPE$22);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.LinkType)get_store().add_attribute_user(LINKTYPE$22);
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
                get_store().remove_attribute(LINKTYPE$22);
            }
        }
        
        /**
         * Gets the "url-mode" attribute
         */
        public com.kyt.xsd.widgetscreen.LinkDocument.Link.UrlMode.Enum getUrlMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URLMODE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(URLMODE$24);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.LinkDocument.Link.UrlMode.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "url-mode" attribute
         */
        public com.kyt.xsd.widgetscreen.LinkDocument.Link.UrlMode xgetUrlMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.LinkDocument.Link.UrlMode target = null;
                target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.UrlMode)get_store().find_attribute_user(URLMODE$24);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.UrlMode)get_default_attribute_value(URLMODE$24);
                }
                return target;
            }
        }
        
        /**
         * True if has "url-mode" attribute
         */
        public boolean isSetUrlMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(URLMODE$24) != null;
            }
        }
        
        /**
         * Sets the "url-mode" attribute
         */
        public void setUrlMode(com.kyt.xsd.widgetscreen.LinkDocument.Link.UrlMode.Enum urlMode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URLMODE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URLMODE$24);
                }
                target.setEnumValue(urlMode);
            }
        }
        
        /**
         * Sets (as xml) the "url-mode" attribute
         */
        public void xsetUrlMode(com.kyt.xsd.widgetscreen.LinkDocument.Link.UrlMode urlMode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.LinkDocument.Link.UrlMode target = null;
                target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.UrlMode)get_store().find_attribute_user(URLMODE$24);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.UrlMode)get_store().add_attribute_user(URLMODE$24);
                }
                target.set(urlMode);
            }
        }
        
        /**
         * Unsets the "url-mode" attribute
         */
        public void unsetUrlMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(URLMODE$24);
            }
        }
        
        /**
         * Gets the "full-path" attribute
         */
        public com.kyt.xsd.widgetscreen.LinkDocument.Link.FullPath.Enum getFullPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLPATH$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FULLPATH$26);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.LinkDocument.Link.FullPath.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "full-path" attribute
         */
        public com.kyt.xsd.widgetscreen.LinkDocument.Link.FullPath xgetFullPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.LinkDocument.Link.FullPath target = null;
                target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.FullPath)get_store().find_attribute_user(FULLPATH$26);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.FullPath)get_default_attribute_value(FULLPATH$26);
                }
                return target;
            }
        }
        
        /**
         * True if has "full-path" attribute
         */
        public boolean isSetFullPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FULLPATH$26) != null;
            }
        }
        
        /**
         * Sets the "full-path" attribute
         */
        public void setFullPath(com.kyt.xsd.widgetscreen.LinkDocument.Link.FullPath.Enum fullPath)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLPATH$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLPATH$26);
                }
                target.setEnumValue(fullPath);
            }
        }
        
        /**
         * Sets (as xml) the "full-path" attribute
         */
        public void xsetFullPath(com.kyt.xsd.widgetscreen.LinkDocument.Link.FullPath fullPath)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.LinkDocument.Link.FullPath target = null;
                target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.FullPath)get_store().find_attribute_user(FULLPATH$26);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.FullPath)get_store().add_attribute_user(FULLPATH$26);
                }
                target.set(fullPath);
            }
        }
        
        /**
         * Unsets the "full-path" attribute
         */
        public void unsetFullPath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FULLPATH$26);
            }
        }
        
        /**
         * Gets the "secure" attribute
         */
        public com.kyt.xsd.widgetscreen.LinkDocument.Link.Secure.Enum getSecure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECURE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SECURE$28);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.LinkDocument.Link.Secure.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "secure" attribute
         */
        public com.kyt.xsd.widgetscreen.LinkDocument.Link.Secure xgetSecure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.LinkDocument.Link.Secure target = null;
                target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.Secure)get_store().find_attribute_user(SECURE$28);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.Secure)get_default_attribute_value(SECURE$28);
                }
                return target;
            }
        }
        
        /**
         * True if has "secure" attribute
         */
        public boolean isSetSecure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SECURE$28) != null;
            }
        }
        
        /**
         * Sets the "secure" attribute
         */
        public void setSecure(com.kyt.xsd.widgetscreen.LinkDocument.Link.Secure.Enum secure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECURE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SECURE$28);
                }
                target.setEnumValue(secure);
            }
        }
        
        /**
         * Sets (as xml) the "secure" attribute
         */
        public void xsetSecure(com.kyt.xsd.widgetscreen.LinkDocument.Link.Secure secure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.LinkDocument.Link.Secure target = null;
                target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.Secure)get_store().find_attribute_user(SECURE$28);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.Secure)get_store().add_attribute_user(SECURE$28);
                }
                target.set(secure);
            }
        }
        
        /**
         * Unsets the "secure" attribute
         */
        public void unsetSecure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SECURE$28);
            }
        }
        
        /**
         * Gets the "encode" attribute
         */
        public com.kyt.xsd.widgetscreen.LinkDocument.Link.Encode.Enum getEncode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENCODE$30);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.LinkDocument.Link.Encode.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "encode" attribute
         */
        public com.kyt.xsd.widgetscreen.LinkDocument.Link.Encode xgetEncode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.LinkDocument.Link.Encode target = null;
                target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.Encode)get_store().find_attribute_user(ENCODE$30);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.Encode)get_default_attribute_value(ENCODE$30);
                }
                return target;
            }
        }
        
        /**
         * True if has "encode" attribute
         */
        public boolean isSetEncode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCODE$30) != null;
            }
        }
        
        /**
         * Sets the "encode" attribute
         */
        public void setEncode(com.kyt.xsd.widgetscreen.LinkDocument.Link.Encode.Enum encode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODE$30);
                }
                target.setEnumValue(encode);
            }
        }
        
        /**
         * Sets (as xml) the "encode" attribute
         */
        public void xsetEncode(com.kyt.xsd.widgetscreen.LinkDocument.Link.Encode encode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.LinkDocument.Link.Encode target = null;
                target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.Encode)get_store().find_attribute_user(ENCODE$30);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.LinkDocument.Link.Encode)get_store().add_attribute_user(ENCODE$30);
                }
                target.set(encode);
            }
        }
        
        /**
         * Unsets the "encode" attribute
         */
        public void unsetEncode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCODE$30);
            }
        }
        /**
         * An XML link-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.LinkDocument$Link$LinkType.
         */
        public static class LinkTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.LinkDocument.Link.LinkType
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
         * An XML url-mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.LinkDocument$Link$UrlMode.
         */
        public static class UrlModeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.LinkDocument.Link.UrlMode
        {
            private static final long serialVersionUID = 1L;
            
            public UrlModeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UrlModeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML full-path(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.LinkDocument$Link$FullPath.
         */
        public static class FullPathImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.LinkDocument.Link.FullPath
        {
            private static final long serialVersionUID = 1L;
            
            public FullPathImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected FullPathImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML secure(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.LinkDocument$Link$Secure.
         */
        public static class SecureImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.LinkDocument.Link.Secure
        {
            private static final long serialVersionUID = 1L;
            
            public SecureImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SecureImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML encode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.LinkDocument$Link$Encode.
         */
        public static class EncodeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.LinkDocument.Link.Encode
        {
            private static final long serialVersionUID = 1L;
            
            public EncodeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected EncodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
