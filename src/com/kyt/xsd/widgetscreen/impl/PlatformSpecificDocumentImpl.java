/*
 * An XML document type.
 * Localname: platform-specific
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.PlatformSpecificDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one platform-specific(@) element.
 *
 * This is a complex type.
 */
public class PlatformSpecificDocumentImpl extends com.kyt.xsd.widgetscreen.impl.AllWidgetsDocumentImpl implements com.kyt.xsd.widgetscreen.PlatformSpecificDocument
{
    private static final long serialVersionUID = 1L;
    
    public PlatformSpecificDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PLATFORMSPECIFIC$0 = 
        new javax.xml.namespace.QName("", "platform-specific");
    
    
    /**
     * Gets the "platform-specific" element
     */
    public com.kyt.xsd.widgetscreen.PlatformSpecificDocument.PlatformSpecific getPlatformSpecific()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.PlatformSpecificDocument.PlatformSpecific target = null;
            target = (com.kyt.xsd.widgetscreen.PlatformSpecificDocument.PlatformSpecific)get_store().find_element_user(PLATFORMSPECIFIC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "platform-specific" element
     */
    public void setPlatformSpecific(com.kyt.xsd.widgetscreen.PlatformSpecificDocument.PlatformSpecific platformSpecific)
    {
        generatedSetterHelperImpl(platformSpecific, PLATFORMSPECIFIC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "platform-specific" element
     */
    public com.kyt.xsd.widgetscreen.PlatformSpecificDocument.PlatformSpecific addNewPlatformSpecific()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.PlatformSpecificDocument.PlatformSpecific target = null;
            target = (com.kyt.xsd.widgetscreen.PlatformSpecificDocument.PlatformSpecific)get_store().add_element_user(PLATFORMSPECIFIC$0);
            return target;
        }
    }
    /**
     * An XML platform-specific(@).
     *
     * This is a complex type.
     */
    public static class PlatformSpecificImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.PlatformSpecificDocument.PlatformSpecific
    {
        private static final long serialVersionUID = 1L;
        
        public PlatformSpecificImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HTML$0 = 
            new javax.xml.namespace.QName("", "html");
        private static final javax.xml.namespace.QName SWING$2 = 
            new javax.xml.namespace.QName("", "swing");
        private static final javax.xml.namespace.QName XSLFO$4 = 
            new javax.xml.namespace.QName("", "xsl-fo");
        private static final javax.xml.namespace.QName XML$6 = 
            new javax.xml.namespace.QName("", "xml");
        
        
        /**
         * Gets the "html" element
         */
        public com.kyt.xsd.widgetscreen.HtmlDocument.Html getHtml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.HtmlDocument.Html target = null;
                target = (com.kyt.xsd.widgetscreen.HtmlDocument.Html)get_store().find_element_user(HTML$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "html" element
         */
        public boolean isSetHtml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HTML$0) != 0;
            }
        }
        
        /**
         * Sets the "html" element
         */
        public void setHtml(com.kyt.xsd.widgetscreen.HtmlDocument.Html html)
        {
            generatedSetterHelperImpl(html, HTML$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "html" element
         */
        public com.kyt.xsd.widgetscreen.HtmlDocument.Html addNewHtml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.HtmlDocument.Html target = null;
                target = (com.kyt.xsd.widgetscreen.HtmlDocument.Html)get_store().add_element_user(HTML$0);
                return target;
            }
        }
        
        /**
         * Unsets the "html" element
         */
        public void unsetHtml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HTML$0, 0);
            }
        }
        
        /**
         * Gets the "swing" element
         */
        public com.kyt.xsd.widgetscreen.SwingDocument.Swing getSwing()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SwingDocument.Swing target = null;
                target = (com.kyt.xsd.widgetscreen.SwingDocument.Swing)get_store().find_element_user(SWING$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "swing" element
         */
        public boolean isSetSwing()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SWING$2) != 0;
            }
        }
        
        /**
         * Sets the "swing" element
         */
        public void setSwing(com.kyt.xsd.widgetscreen.SwingDocument.Swing swing)
        {
            generatedSetterHelperImpl(swing, SWING$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "swing" element
         */
        public com.kyt.xsd.widgetscreen.SwingDocument.Swing addNewSwing()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SwingDocument.Swing target = null;
                target = (com.kyt.xsd.widgetscreen.SwingDocument.Swing)get_store().add_element_user(SWING$2);
                return target;
            }
        }
        
        /**
         * Unsets the "swing" element
         */
        public void unsetSwing()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SWING$2, 0);
            }
        }
        
        /**
         * Gets the "xsl-fo" element
         */
        public com.kyt.xsd.widgetscreen.XslFoDocument.XslFo getXslFo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.XslFoDocument.XslFo target = null;
                target = (com.kyt.xsd.widgetscreen.XslFoDocument.XslFo)get_store().find_element_user(XSLFO$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "xsl-fo" element
         */
        public boolean isSetXslFo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(XSLFO$4) != 0;
            }
        }
        
        /**
         * Sets the "xsl-fo" element
         */
        public void setXslFo(com.kyt.xsd.widgetscreen.XslFoDocument.XslFo xslFo)
        {
            generatedSetterHelperImpl(xslFo, XSLFO$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "xsl-fo" element
         */
        public com.kyt.xsd.widgetscreen.XslFoDocument.XslFo addNewXslFo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.XslFoDocument.XslFo target = null;
                target = (com.kyt.xsd.widgetscreen.XslFoDocument.XslFo)get_store().add_element_user(XSLFO$4);
                return target;
            }
        }
        
        /**
         * Unsets the "xsl-fo" element
         */
        public void unsetXslFo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(XSLFO$4, 0);
            }
        }
        
        /**
         * Gets the "xml" element
         */
        public com.kyt.xsd.widgetscreen.XmlDocument.Xml getXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.XmlDocument.Xml target = null;
                target = (com.kyt.xsd.widgetscreen.XmlDocument.Xml)get_store().find_element_user(XML$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "xml" element
         */
        public boolean isSetXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(XML$6) != 0;
            }
        }
        
        /**
         * Sets the "xml" element
         */
        public void setXml(com.kyt.xsd.widgetscreen.XmlDocument.Xml xml)
        {
            generatedSetterHelperImpl(xml, XML$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "xml" element
         */
        public com.kyt.xsd.widgetscreen.XmlDocument.Xml addNewXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.XmlDocument.Xml target = null;
                target = (com.kyt.xsd.widgetscreen.XmlDocument.Xml)get_store().add_element_user(XML$6);
                return target;
            }
        }
        
        /**
         * Unsets the "xml" element
         */
        public void unsetXml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(XML$6, 0);
            }
        }
    }
}
