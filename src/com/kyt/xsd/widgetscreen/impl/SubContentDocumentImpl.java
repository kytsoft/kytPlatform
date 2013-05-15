/*
 * An XML document type.
 * Localname: sub-content
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.SubContentDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one sub-content(@) element.
 *
 * This is a complex type.
 */
public class SubContentDocumentImpl extends com.kyt.xsd.widgetscreen.impl.AllWidgetsDocumentImpl implements com.kyt.xsd.widgetscreen.SubContentDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBCONTENT$0 = 
        new javax.xml.namespace.QName("", "sub-content");
    
    
    /**
     * Gets the "sub-content" element
     */
    public com.kyt.xsd.widgetscreen.SubContentDocument.SubContent getSubContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.SubContentDocument.SubContent target = null;
            target = (com.kyt.xsd.widgetscreen.SubContentDocument.SubContent)get_store().find_element_user(SUBCONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sub-content" element
     */
    public void setSubContent(com.kyt.xsd.widgetscreen.SubContentDocument.SubContent subContent)
    {
        generatedSetterHelperImpl(subContent, SUBCONTENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sub-content" element
     */
    public com.kyt.xsd.widgetscreen.SubContentDocument.SubContent addNewSubContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.SubContentDocument.SubContent target = null;
            target = (com.kyt.xsd.widgetscreen.SubContentDocument.SubContent)get_store().add_element_user(SUBCONTENT$0);
            return target;
        }
    }
    /**
     * An XML sub-content(@).
     *
     * This is a complex type.
     */
    public static class SubContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.SubContentDocument.SubContent
    {
        private static final long serialVersionUID = 1L;
        
        public SubContentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTENTID$0 = 
            new javax.xml.namespace.QName("", "content-id");
        private static final javax.xml.namespace.QName MAPKEY$2 = 
            new javax.xml.namespace.QName("", "map-key");
        private static final javax.xml.namespace.QName EDITREQUEST$4 = 
            new javax.xml.namespace.QName("", "edit-request");
        private static final javax.xml.namespace.QName EDITCONTAINERSTYLE$6 = 
            new javax.xml.namespace.QName("", "edit-container-style");
        private static final javax.xml.namespace.QName ENABLEEDITNAME$8 = 
            new javax.xml.namespace.QName("", "enable-edit-name");
        private static final javax.xml.namespace.QName XMLESCAPE$10 = 
            new javax.xml.namespace.QName("", "xml-escape");
        
        
        /**
         * Gets the "content-id" attribute
         */
        public java.lang.String getContentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENTID$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "content-id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetContentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTENTID$0);
                return target;
            }
        }
        
        /**
         * Sets the "content-id" attribute
         */
        public void setContentId(java.lang.String contentId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENTID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTENTID$0);
                }
                target.setStringValue(contentId);
            }
        }
        
        /**
         * Sets (as xml) the "content-id" attribute
         */
        public void xsetContentId(org.apache.xmlbeans.XmlString contentId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTENTID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONTENTID$0);
                }
                target.set(contentId);
            }
        }
        
        /**
         * Gets the "map-key" attribute
         */
        public java.lang.String getMapKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPKEY$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "map-key" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMapKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAPKEY$2);
                return target;
            }
        }
        
        /**
         * Sets the "map-key" attribute
         */
        public void setMapKey(java.lang.String mapKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPKEY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAPKEY$2);
                }
                target.setStringValue(mapKey);
            }
        }
        
        /**
         * Sets (as xml) the "map-key" attribute
         */
        public void xsetMapKey(org.apache.xmlbeans.XmlString mapKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAPKEY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAPKEY$2);
                }
                target.set(mapKey);
            }
        }
        
        /**
         * Gets the "edit-request" attribute
         */
        public java.lang.String getEditRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDITREQUEST$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "edit-request" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEditRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EDITREQUEST$4);
                return target;
            }
        }
        
        /**
         * True if has "edit-request" attribute
         */
        public boolean isSetEditRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EDITREQUEST$4) != null;
            }
        }
        
        /**
         * Sets the "edit-request" attribute
         */
        public void setEditRequest(java.lang.String editRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDITREQUEST$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDITREQUEST$4);
                }
                target.setStringValue(editRequest);
            }
        }
        
        /**
         * Sets (as xml) the "edit-request" attribute
         */
        public void xsetEditRequest(org.apache.xmlbeans.XmlString editRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EDITREQUEST$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EDITREQUEST$4);
                }
                target.set(editRequest);
            }
        }
        
        /**
         * Unsets the "edit-request" attribute
         */
        public void unsetEditRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EDITREQUEST$4);
            }
        }
        
        /**
         * Gets the "edit-container-style" attribute
         */
        public java.lang.String getEditContainerStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDITCONTAINERSTYLE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EDITCONTAINERSTYLE$6);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "edit-container-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEditContainerStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EDITCONTAINERSTYLE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(EDITCONTAINERSTYLE$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "edit-container-style" attribute
         */
        public boolean isSetEditContainerStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EDITCONTAINERSTYLE$6) != null;
            }
        }
        
        /**
         * Sets the "edit-container-style" attribute
         */
        public void setEditContainerStyle(java.lang.String editContainerStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDITCONTAINERSTYLE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDITCONTAINERSTYLE$6);
                }
                target.setStringValue(editContainerStyle);
            }
        }
        
        /**
         * Sets (as xml) the "edit-container-style" attribute
         */
        public void xsetEditContainerStyle(org.apache.xmlbeans.XmlString editContainerStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EDITCONTAINERSTYLE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EDITCONTAINERSTYLE$6);
                }
                target.set(editContainerStyle);
            }
        }
        
        /**
         * Unsets the "edit-container-style" attribute
         */
        public void unsetEditContainerStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EDITCONTAINERSTYLE$6);
            }
        }
        
        /**
         * Gets the "enable-edit-name" attribute
         */
        public java.lang.String getEnableEditName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEEDITNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENABLEEDITNAME$8);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "enable-edit-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEnableEditName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENABLEEDITNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(ENABLEEDITNAME$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "enable-edit-name" attribute
         */
        public boolean isSetEnableEditName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENABLEEDITNAME$8) != null;
            }
        }
        
        /**
         * Sets the "enable-edit-name" attribute
         */
        public void setEnableEditName(java.lang.String enableEditName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLEEDITNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLEEDITNAME$8);
                }
                target.setStringValue(enableEditName);
            }
        }
        
        /**
         * Sets (as xml) the "enable-edit-name" attribute
         */
        public void xsetEnableEditName(org.apache.xmlbeans.XmlString enableEditName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENABLEEDITNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENABLEEDITNAME$8);
                }
                target.set(enableEditName);
            }
        }
        
        /**
         * Unsets the "enable-edit-name" attribute
         */
        public void unsetEnableEditName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENABLEEDITNAME$8);
            }
        }
        
        /**
         * Gets the "xml-escape" attribute
         */
        public com.kyt.xsd.widgetscreen.SubContentDocument.SubContent.XmlEscape.Enum getXmlEscape()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLESCAPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(XMLESCAPE$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.SubContentDocument.SubContent.XmlEscape.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "xml-escape" attribute
         */
        public com.kyt.xsd.widgetscreen.SubContentDocument.SubContent.XmlEscape xgetXmlEscape()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SubContentDocument.SubContent.XmlEscape target = null;
                target = (com.kyt.xsd.widgetscreen.SubContentDocument.SubContent.XmlEscape)get_store().find_attribute_user(XMLESCAPE$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.SubContentDocument.SubContent.XmlEscape)get_default_attribute_value(XMLESCAPE$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "xml-escape" attribute
         */
        public boolean isSetXmlEscape()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(XMLESCAPE$10) != null;
            }
        }
        
        /**
         * Sets the "xml-escape" attribute
         */
        public void setXmlEscape(com.kyt.xsd.widgetscreen.SubContentDocument.SubContent.XmlEscape.Enum xmlEscape)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLESCAPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLESCAPE$10);
                }
                target.setEnumValue(xmlEscape);
            }
        }
        
        /**
         * Sets (as xml) the "xml-escape" attribute
         */
        public void xsetXmlEscape(com.kyt.xsd.widgetscreen.SubContentDocument.SubContent.XmlEscape xmlEscape)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SubContentDocument.SubContent.XmlEscape target = null;
                target = (com.kyt.xsd.widgetscreen.SubContentDocument.SubContent.XmlEscape)get_store().find_attribute_user(XMLESCAPE$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.SubContentDocument.SubContent.XmlEscape)get_store().add_attribute_user(XMLESCAPE$10);
                }
                target.set(xmlEscape);
            }
        }
        
        /**
         * Unsets the "xml-escape" attribute
         */
        public void unsetXmlEscape()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(XMLESCAPE$10);
            }
        }
        /**
         * An XML xml-escape(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.SubContentDocument$SubContent$XmlEscape.
         */
        public static class XmlEscapeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.SubContentDocument.SubContent.XmlEscape
        {
            private static final long serialVersionUID = 1L;
            
            public XmlEscapeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected XmlEscapeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
