/*
 * An XML document type.
 * Localname: AllWidgets
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.AllWidgetsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one AllWidgets(@) element.
 *
 * This is a complex type.
 */
public class AllWidgetsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.AllWidgetsDocument
{
    private static final long serialVersionUID = 1L;
    
    public AllWidgetsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLWIDGETS$0 = 
        new javax.xml.namespace.QName("", "AllWidgets");
    private static final org.apache.xmlbeans.QNameSet ALLWIDGETS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("", "decorator-section-include"),
        new javax.xml.namespace.QName("", "include-menu"),
        new javax.xml.namespace.QName("", "link"),
        new javax.xml.namespace.QName("", "AllWidgets"),
        new javax.xml.namespace.QName("", "image"),
        new javax.xml.namespace.QName("", "label"),
        new javax.xml.namespace.QName("", "decorator-screen"),
        new javax.xml.namespace.QName("", "section"),
        new javax.xml.namespace.QName("", "content"),
        new javax.xml.namespace.QName("", "horizontal-separator"),
        new javax.xml.namespace.QName("", "include-form"),
        new javax.xml.namespace.QName("", "include-screen"),
        new javax.xml.namespace.QName("", "sub-content"),
        new javax.xml.namespace.QName("", "platform-specific"),
        new javax.xml.namespace.QName("", "include-tree"),
        new javax.xml.namespace.QName("", "container"),
        new javax.xml.namespace.QName("", "iterate-section"),
        new javax.xml.namespace.QName("", "screenlet"),
        new javax.xml.namespace.QName("", "include-portal-page"),
    });
    
    
    /**
     * Gets the "AllWidgets" element
     */
    public org.apache.xmlbeans.XmlObject getAllWidgets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLWIDGETS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AllWidgets" element
     */
    public void setAllWidgets(org.apache.xmlbeans.XmlObject allWidgets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLWIDGETS$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLWIDGETS$0);
            }
            target.set(allWidgets);
        }
    }
    
    /**
     * Appends and returns a new empty "AllWidgets" element
     */
    public org.apache.xmlbeans.XmlObject addNewAllWidgets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLWIDGETS$0);
            return target;
        }
    }
}
