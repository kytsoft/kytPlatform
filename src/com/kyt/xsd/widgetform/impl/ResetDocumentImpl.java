/*
 * An XML document type.
 * Localname: reset
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.ResetDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one reset(@) element.
 *
 * This is a complex type.
 */
public class ResetDocumentImpl extends com.kyt.xsd.widgetform.impl.AllFieldsDocumentImpl implements com.kyt.xsd.widgetform.ResetDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESET$0 = 
        new javax.xml.namespace.QName("", "reset");
    
    
    /**
     * Gets the "reset" element
     */
    public com.kyt.xsd.widgetform.ResetDocument.Reset getReset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.ResetDocument.Reset target = null;
            target = (com.kyt.xsd.widgetform.ResetDocument.Reset)get_store().find_element_user(RESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reset" element
     */
    public void setReset(com.kyt.xsd.widgetform.ResetDocument.Reset reset)
    {
        generatedSetterHelperImpl(reset, RESET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reset" element
     */
    public com.kyt.xsd.widgetform.ResetDocument.Reset addNewReset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.ResetDocument.Reset target = null;
            target = (com.kyt.xsd.widgetform.ResetDocument.Reset)get_store().add_element_user(RESET$0);
            return target;
        }
    }
    /**
     * An XML reset(@).
     *
     * This is a complex type.
     */
    public static class ResetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.ResetDocument.Reset
    {
        private static final long serialVersionUID = 1L;
        
        public ResetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
