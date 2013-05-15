/*
 * An XML document type.
 * Localname: HtmlWidgets
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.HtmlWidgetsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one HtmlWidgets(@) element.
 *
 * This is a complex type.
 */
public class HtmlWidgetsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.HtmlWidgetsDocument
{
    private static final long serialVersionUID = 1L;
    
    public HtmlWidgetsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HTMLWIDGETS$0 = 
        new javax.xml.namespace.QName("", "HtmlWidgets");
    private static final org.apache.xmlbeans.QNameSet HTMLWIDGETS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("", "HtmlWidgets"),
        new javax.xml.namespace.QName("", "html-template-decorator"),
        new javax.xml.namespace.QName("", "html-template"),
    });
    
    
    /**
     * Gets the "HtmlWidgets" element
     */
    public org.apache.xmlbeans.XmlObject getHtmlWidgets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(HTMLWIDGETS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HtmlWidgets" element
     */
    public void setHtmlWidgets(org.apache.xmlbeans.XmlObject htmlWidgets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(HTMLWIDGETS$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(HTMLWIDGETS$0);
            }
            target.set(htmlWidgets);
        }
    }
    
    /**
     * Appends and returns a new empty "HtmlWidgets" element
     */
    public org.apache.xmlbeans.XmlObject addNewHtmlWidgets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(HTMLWIDGETS$0);
            return target;
        }
    }
}
