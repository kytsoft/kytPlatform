/*
 * An XML document type.
 * Localname: errorpage
 * Namespace: 
 * Java type: com.kyt.xsd.siteconf.ErrorpageDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.siteconf.impl;
/**
 * A document containing one errorpage(@) element.
 *
 * This is a complex type.
 */
public class ErrorpageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.ErrorpageDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorpageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORPAGE$0 = 
        new javax.xml.namespace.QName("", "errorpage");
    
    
    /**
     * Gets the "errorpage" element
     */
    public java.lang.String getErrorpage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORPAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorpage" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorpage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORPAGE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "errorpage" element
     */
    public void setErrorpage(java.lang.String errorpage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORPAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORPAGE$0);
            }
            target.setStringValue(errorpage);
        }
    }
    
    /**
     * Sets (as xml) the "errorpage" element
     */
    public void xsetErrorpage(org.apache.xmlbeans.XmlString errorpage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORPAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORPAGE$0);
            }
            target.set(errorpage);
        }
    }
}
