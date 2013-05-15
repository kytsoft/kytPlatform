/*
 * An XML document type.
 * Localname: limit-view
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.LimitViewDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one limit-view(@) element.
 *
 * This is a complex type.
 */
public class LimitViewDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.LimitViewDocument
{
    private static final long serialVersionUID = 1L;
    
    public LimitViewDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIMITVIEW$0 = 
        new javax.xml.namespace.QName("", "limit-view");
    
    
    /**
     * Gets the "limit-view" element
     */
    public com.kyt.xsd.widgetscreen.LimitViewDocument.LimitView getLimitView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.LimitViewDocument.LimitView target = null;
            target = (com.kyt.xsd.widgetscreen.LimitViewDocument.LimitView)get_store().find_element_user(LIMITVIEW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "limit-view" element
     */
    public void setLimitView(com.kyt.xsd.widgetscreen.LimitViewDocument.LimitView limitView)
    {
        generatedSetterHelperImpl(limitView, LIMITVIEW$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "limit-view" element
     */
    public com.kyt.xsd.widgetscreen.LimitViewDocument.LimitView addNewLimitView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.LimitViewDocument.LimitView target = null;
            target = (com.kyt.xsd.widgetscreen.LimitViewDocument.LimitView)get_store().add_element_user(LIMITVIEW$0);
            return target;
        }
    }
    /**
     * An XML limit-view(@).
     *
     * This is a complex type.
     */
    public static class LimitViewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.LimitViewDocument.LimitView
    {
        private static final long serialVersionUID = 1L;
        
        public LimitViewImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VIEWINDEX$0 = 
            new javax.xml.namespace.QName("", "view-index");
        private static final javax.xml.namespace.QName VIEWSIZE$2 = 
            new javax.xml.namespace.QName("", "view-size");
        
        
        /**
         * Gets the "view-index" attribute
         */
        public java.lang.String getViewIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWINDEX$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "view-index" attribute
         */
        public org.apache.xmlbeans.XmlString xgetViewIndex()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIEWINDEX$0);
                return target;
            }
        }
        
        /**
         * Sets the "view-index" attribute
         */
        public void setViewIndex(java.lang.String viewIndex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWINDEX$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIEWINDEX$0);
                }
                target.setStringValue(viewIndex);
            }
        }
        
        /**
         * Sets (as xml) the "view-index" attribute
         */
        public void xsetViewIndex(org.apache.xmlbeans.XmlString viewIndex)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIEWINDEX$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VIEWINDEX$0);
                }
                target.set(viewIndex);
            }
        }
        
        /**
         * Gets the "view-size" attribute
         */
        public java.lang.String getViewSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWSIZE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "view-size" attribute
         */
        public org.apache.xmlbeans.XmlString xgetViewSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIEWSIZE$2);
                return target;
            }
        }
        
        /**
         * Sets the "view-size" attribute
         */
        public void setViewSize(java.lang.String viewSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWSIZE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIEWSIZE$2);
                }
                target.setStringValue(viewSize);
            }
        }
        
        /**
         * Sets (as xml) the "view-size" attribute
         */
        public void xsetViewSize(org.apache.xmlbeans.XmlString viewSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIEWSIZE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VIEWSIZE$2);
                }
                target.set(viewSize);
            }
        }
    }
}
