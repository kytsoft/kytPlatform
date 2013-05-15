/*
 * An XML document type.
 * Localname: IfBasicOperations
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.IfBasicOperationsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one IfBasicOperations(@) element.
 *
 * This is a complex type.
 */
public class IfBasicOperationsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.IfBasicOperationsDocument
{
    private static final long serialVersionUID = 1L;
    
    public IfBasicOperationsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IFBASICOPERATIONS$0 = 
        new javax.xml.namespace.QName("", "IfBasicOperations");
    private static final org.apache.xmlbeans.QNameSet IFBASICOPERATIONS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("", "if-instance-of"),
        new javax.xml.namespace.QName("", "if-validate-method"),
        new javax.xml.namespace.QName("", "if-compare"),
        new javax.xml.namespace.QName("", "IfBasicOperations"),
        new javax.xml.namespace.QName("", "if-empty"),
        new javax.xml.namespace.QName("", "if-regexp"),
        new javax.xml.namespace.QName("", "if-has-permission"),
        new javax.xml.namespace.QName("", "if-compare-field"),
    });
    
    
    /**
     * Gets the "IfBasicOperations" element
     */
    public org.apache.xmlbeans.XmlObject getIfBasicOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFBASICOPERATIONS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IfBasicOperations" element
     */
    public void setIfBasicOperations(org.apache.xmlbeans.XmlObject ifBasicOperations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFBASICOPERATIONS$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IFBASICOPERATIONS$0);
            }
            target.set(ifBasicOperations);
        }
    }
    
    /**
     * Appends and returns a new empty "IfBasicOperations" element
     */
    public org.apache.xmlbeans.XmlObject addNewIfBasicOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IFBASICOPERATIONS$0);
            return target;
        }
    }
}
