/*
 * An XML document type.
 * Localname: IfOtherOperations
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.IfOtherOperationsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one IfOtherOperations(@) element.
 *
 * This is a complex type.
 */
public class IfOtherOperationsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.IfOtherOperationsDocument
{
    private static final long serialVersionUID = 1L;
    
    public IfOtherOperationsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IFOTHEROPERATIONS$0 = 
        new javax.xml.namespace.QName("", "IfOtherOperations");
    private static final org.apache.xmlbeans.QNameSet IFOTHEROPERATIONS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("", "if"),
        new javax.xml.namespace.QName("", "if-not-empty"),
        new javax.xml.namespace.QName("", "assert"),
        new javax.xml.namespace.QName("", "IfOtherOperations"),
        new javax.xml.namespace.QName("", "check-permission"),
        new javax.xml.namespace.QName("", "check-id"),
        new javax.xml.namespace.QName("", "while"),
    });
    
    
    /**
     * Gets the "IfOtherOperations" element
     */
    public org.apache.xmlbeans.XmlObject getIfOtherOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFOTHEROPERATIONS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IfOtherOperations" element
     */
    public void setIfOtherOperations(org.apache.xmlbeans.XmlObject ifOtherOperations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFOTHEROPERATIONS$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IFOTHEROPERATIONS$0);
            }
            target.set(ifOtherOperations);
        }
    }
    
    /**
     * Appends and returns a new empty "IfOtherOperations" element
     */
    public org.apache.xmlbeans.XmlObject addNewIfOtherOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IFOTHEROPERATIONS$0);
            return target;
        }
    }
}
