/*
 * An XML document type.
 * Localname: AllActions
 * Namespace: 
 * Java type: com.kyt.xsd.widgetmenu.AllActionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetmenu.impl;
/**
 * A document containing one AllActions(@) element.
 *
 * This is a complex type.
 */
public class AllActionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetmenu.AllActionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public AllActionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLACTIONS$0 = 
        new javax.xml.namespace.QName("", "AllActions");
    private static final org.apache.xmlbeans.QNameSet ALLACTIONS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("", "property-map"),
        new javax.xml.namespace.QName("", "AllActions"),
        new javax.xml.namespace.QName("", "property-to-field"),
        new javax.xml.namespace.QName("", "set"),
        new javax.xml.namespace.QName("", "script"),
    });
    
    
    /**
     * Gets the "AllActions" element
     */
    public org.apache.xmlbeans.XmlObject getAllActions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLACTIONS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AllActions" element
     */
    public void setAllActions(org.apache.xmlbeans.XmlObject allActions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLACTIONS$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLACTIONS$0);
            }
            target.set(allActions);
        }
    }
    
    /**
     * Appends and returns a new empty "AllActions" element
     */
    public org.apache.xmlbeans.XmlObject addNewAllActions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLACTIONS$0);
            return target;
        }
    }
}
