/*
 * An XML document type.
 * Localname: property-value
 * Namespace: 
 * Java type: com.kyt.xsd.ofbizcontainers.PropertyValueDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.ofbizcontainers.impl;
/**
 * A document containing one property-value(@) element.
 *
 * This is a complex type.
 */
public class PropertyValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcontainers.PropertyValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTYVALUE$0 = 
        new javax.xml.namespace.QName("", "property-value");
    
    
    /**
     * Gets the "property-value" element
     */
    public com.kyt.xsd.ofbizcontainers.Any getPropertyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcontainers.Any target = null;
            target = (com.kyt.xsd.ofbizcontainers.Any)get_store().find_element_user(PROPERTYVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "property-value" element
     */
    public void setPropertyValue(com.kyt.xsd.ofbizcontainers.Any propertyValue)
    {
        generatedSetterHelperImpl(propertyValue, PROPERTYVALUE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "property-value" element
     */
    public com.kyt.xsd.ofbizcontainers.Any addNewPropertyValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcontainers.Any target = null;
            target = (com.kyt.xsd.ofbizcontainers.Any)get_store().add_element_user(PROPERTYVALUE$0);
            return target;
        }
    }
}
