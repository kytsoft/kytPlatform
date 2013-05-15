/*
 * An XML document type.
 * Localname: AllFields
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.AllFieldsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one AllFields(@) element.
 *
 * This is a complex type.
 */
public class AllFieldsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.AllFieldsDocument
{
    private static final long serialVersionUID = 1L;
    
    public AllFieldsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALLFIELDS$0 = 
        new javax.xml.namespace.QName("", "AllFields");
    private static final org.apache.xmlbeans.QNameSet ALLFIELDS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("", "display-entity"),
        new javax.xml.namespace.QName("", "ignored"),
        new javax.xml.namespace.QName("", "text"),
        new javax.xml.namespace.QName("", "check"),
        new javax.xml.namespace.QName("", "submit"),
        new javax.xml.namespace.QName("", "date-time"),
        new javax.xml.namespace.QName("", "image"),
        new javax.xml.namespace.QName("", "display"),
        new javax.xml.namespace.QName("", "lookup"),
        new javax.xml.namespace.QName("", "password"),
        new javax.xml.namespace.QName("", "date-find"),
        new javax.xml.namespace.QName("", "AllFields"),
        new javax.xml.namespace.QName("", "text-find"),
        new javax.xml.namespace.QName("", "hidden"),
        new javax.xml.namespace.QName("", "file"),
        new javax.xml.namespace.QName("", "drop-down"),
        new javax.xml.namespace.QName("", "container"),
        new javax.xml.namespace.QName("", "textarea"),
        new javax.xml.namespace.QName("", "hyperlink"),
        new javax.xml.namespace.QName("", "radio"),
        new javax.xml.namespace.QName("", "reset"),
        new javax.xml.namespace.QName("", "range-find"),
    });
    
    
    /**
     * Gets the "AllFields" element
     */
    public org.apache.xmlbeans.XmlObject getAllFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLFIELDS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AllFields" element
     */
    public void setAllFields(org.apache.xmlbeans.XmlObject allFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLFIELDS$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLFIELDS$0);
            }
            target.set(allFields);
        }
    }
    
    /**
     * Appends and returns a new empty "AllFields" element
     */
    public org.apache.xmlbeans.XmlObject addNewAllFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLFIELDS$0);
            return target;
        }
    }
}
