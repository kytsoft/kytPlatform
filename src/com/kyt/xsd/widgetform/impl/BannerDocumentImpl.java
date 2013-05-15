/*
 * An XML document type.
 * Localname: banner
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.BannerDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one banner(@) element.
 *
 * This is a complex type.
 */
public class BannerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.BannerDocument
{
    private static final long serialVersionUID = 1L;
    
    public BannerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BANNER$0 = 
        new javax.xml.namespace.QName("", "banner");
    
    
    /**
     * Gets the "banner" element
     */
    public com.kyt.xsd.widgetform.BannerDocument.Banner getBanner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.BannerDocument.Banner target = null;
            target = (com.kyt.xsd.widgetform.BannerDocument.Banner)get_store().find_element_user(BANNER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "banner" element
     */
    public void setBanner(com.kyt.xsd.widgetform.BannerDocument.Banner banner)
    {
        generatedSetterHelperImpl(banner, BANNER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "banner" element
     */
    public com.kyt.xsd.widgetform.BannerDocument.Banner addNewBanner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.BannerDocument.Banner target = null;
            target = (com.kyt.xsd.widgetform.BannerDocument.Banner)get_store().add_element_user(BANNER$0);
            return target;
        }
    }
    /**
     * An XML banner(@).
     *
     * This is a complex type.
     */
    public static class BannerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.BannerDocument.Banner
    {
        private static final long serialVersionUID = 1L;
        
        public BannerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STYLE$0 = 
            new javax.xml.namespace.QName("", "style");
        private static final javax.xml.namespace.QName TEXT$2 = 
            new javax.xml.namespace.QName("", "text");
        private static final javax.xml.namespace.QName TEXTSTYLE$4 = 
            new javax.xml.namespace.QName("", "text-style");
        private static final javax.xml.namespace.QName LEFTTEXT$6 = 
            new javax.xml.namespace.QName("", "left-text");
        private static final javax.xml.namespace.QName LEFTTEXTSTYLE$8 = 
            new javax.xml.namespace.QName("", "left-text-style");
        private static final javax.xml.namespace.QName RIGHTTEXT$10 = 
            new javax.xml.namespace.QName("", "right-text");
        private static final javax.xml.namespace.QName RIGHTTEXTSTYLE$12 = 
            new javax.xml.namespace.QName("", "right-text-style");
        
        
        /**
         * Gets the "style" attribute
         */
        public java.lang.String getStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$0);
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
                return get_store().find_attribute_user(STYLE$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STYLE$0);
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
                get_store().remove_attribute(STYLE$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXT$2);
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
                return get_store().find_attribute_user(TEXT$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXT$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXT$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXT$2);
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
                get_store().remove_attribute(TEXT$2);
            }
        }
        
        /**
         * Gets the "text-style" attribute
         */
        public java.lang.String getTextStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTSTYLE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTextStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTSTYLE$4);
                return target;
            }
        }
        
        /**
         * True if has "text-style" attribute
         */
        public boolean isSetTextStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEXTSTYLE$4) != null;
            }
        }
        
        /**
         * Sets the "text-style" attribute
         */
        public void setTextStyle(java.lang.String textStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTSTYLE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTSTYLE$4);
                }
                target.setStringValue(textStyle);
            }
        }
        
        /**
         * Sets (as xml) the "text-style" attribute
         */
        public void xsetTextStyle(org.apache.xmlbeans.XmlString textStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTSTYLE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTSTYLE$4);
                }
                target.set(textStyle);
            }
        }
        
        /**
         * Unsets the "text-style" attribute
         */
        public void unsetTextStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEXTSTYLE$4);
            }
        }
        
        /**
         * Gets the "left-text" attribute
         */
        public java.lang.String getLeftText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFTTEXT$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "left-text" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLeftText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEFTTEXT$6);
                return target;
            }
        }
        
        /**
         * True if has "left-text" attribute
         */
        public boolean isSetLeftText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LEFTTEXT$6) != null;
            }
        }
        
        /**
         * Sets the "left-text" attribute
         */
        public void setLeftText(java.lang.String leftText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFTTEXT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEFTTEXT$6);
                }
                target.setStringValue(leftText);
            }
        }
        
        /**
         * Sets (as xml) the "left-text" attribute
         */
        public void xsetLeftText(org.apache.xmlbeans.XmlString leftText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEFTTEXT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LEFTTEXT$6);
                }
                target.set(leftText);
            }
        }
        
        /**
         * Unsets the "left-text" attribute
         */
        public void unsetLeftText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LEFTTEXT$6);
            }
        }
        
        /**
         * Gets the "left-text-style" attribute
         */
        public java.lang.String getLeftTextStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFTTEXTSTYLE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "left-text-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLeftTextStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEFTTEXTSTYLE$8);
                return target;
            }
        }
        
        /**
         * True if has "left-text-style" attribute
         */
        public boolean isSetLeftTextStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LEFTTEXTSTYLE$8) != null;
            }
        }
        
        /**
         * Sets the "left-text-style" attribute
         */
        public void setLeftTextStyle(java.lang.String leftTextStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEFTTEXTSTYLE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEFTTEXTSTYLE$8);
                }
                target.setStringValue(leftTextStyle);
            }
        }
        
        /**
         * Sets (as xml) the "left-text-style" attribute
         */
        public void xsetLeftTextStyle(org.apache.xmlbeans.XmlString leftTextStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEFTTEXTSTYLE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LEFTTEXTSTYLE$8);
                }
                target.set(leftTextStyle);
            }
        }
        
        /**
         * Unsets the "left-text-style" attribute
         */
        public void unsetLeftTextStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LEFTTEXTSTYLE$8);
            }
        }
        
        /**
         * Gets the "right-text" attribute
         */
        public java.lang.String getRightText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHTTEXT$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "right-text" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRightText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RIGHTTEXT$10);
                return target;
            }
        }
        
        /**
         * True if has "right-text" attribute
         */
        public boolean isSetRightText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RIGHTTEXT$10) != null;
            }
        }
        
        /**
         * Sets the "right-text" attribute
         */
        public void setRightText(java.lang.String rightText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHTTEXT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RIGHTTEXT$10);
                }
                target.setStringValue(rightText);
            }
        }
        
        /**
         * Sets (as xml) the "right-text" attribute
         */
        public void xsetRightText(org.apache.xmlbeans.XmlString rightText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RIGHTTEXT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RIGHTTEXT$10);
                }
                target.set(rightText);
            }
        }
        
        /**
         * Unsets the "right-text" attribute
         */
        public void unsetRightText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RIGHTTEXT$10);
            }
        }
        
        /**
         * Gets the "right-text-style" attribute
         */
        public java.lang.String getRightTextStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHTTEXTSTYLE$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "right-text-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRightTextStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RIGHTTEXTSTYLE$12);
                return target;
            }
        }
        
        /**
         * True if has "right-text-style" attribute
         */
        public boolean isSetRightTextStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RIGHTTEXTSTYLE$12) != null;
            }
        }
        
        /**
         * Sets the "right-text-style" attribute
         */
        public void setRightTextStyle(java.lang.String rightTextStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RIGHTTEXTSTYLE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RIGHTTEXTSTYLE$12);
                }
                target.setStringValue(rightTextStyle);
            }
        }
        
        /**
         * Sets (as xml) the "right-text-style" attribute
         */
        public void xsetRightTextStyle(org.apache.xmlbeans.XmlString rightTextStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RIGHTTEXTSTYLE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RIGHTTEXTSTYLE$12);
                }
                target.set(rightTextStyle);
            }
        }
        
        /**
         * Unsets the "right-text-style" attribute
         */
        public void unsetRightTextStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RIGHTTEXTSTYLE$12);
            }
        }
    }
}
