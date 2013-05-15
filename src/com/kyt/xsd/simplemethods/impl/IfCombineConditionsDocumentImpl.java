/*
 * An XML document type.
 * Localname: IfCombineConditions
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.IfCombineConditionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one IfCombineConditions(@) element.
 *
 * This is a complex type.
 */
public class IfCombineConditionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.IfCombineConditionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public IfCombineConditionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IFCOMBINECONDITIONS$0 = 
        new javax.xml.namespace.QName("", "IfCombineConditions");
    private static final org.apache.xmlbeans.QNameSet IFCOMBINECONDITIONS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("", "not"),
        new javax.xml.namespace.QName("", "xor"),
        new javax.xml.namespace.QName("", "or"),
        new javax.xml.namespace.QName("", "IfCombineConditions"),
        new javax.xml.namespace.QName("", "and"),
    });
    
    
    /**
     * Gets the "IfCombineConditions" element
     */
    public org.apache.xmlbeans.XmlObject getIfCombineConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFCOMBINECONDITIONS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IfCombineConditions" element
     */
    public void setIfCombineConditions(org.apache.xmlbeans.XmlObject ifCombineConditions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFCOMBINECONDITIONS$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IFCOMBINECONDITIONS$0);
            }
            target.set(ifCombineConditions);
        }
    }
    
    /**
     * Appends and returns a new empty "IfCombineConditions" element
     */
    public org.apache.xmlbeans.XmlObject addNewIfCombineConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IFCOMBINECONDITIONS$0);
            return target;
        }
    }
}
