/*
 * An XML document type.
 * Localname: container
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.ContainerDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one container(@) element.
 *
 * This is a complex type.
 */
public class ContainerDocumentImpl extends com.kyt.xsd.widgetform.impl.AllFieldsDocumentImpl implements com.kyt.xsd.widgetform.ContainerDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContainerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTAINER$0 = 
        new javax.xml.namespace.QName("", "container");
    
    
    /**
     * Gets the "container" element
     */
    public com.kyt.xsd.widgetform.ContainerDocument.Container getContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.ContainerDocument.Container target = null;
            target = (com.kyt.xsd.widgetform.ContainerDocument.Container)get_store().find_element_user(CONTAINER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "container" element
     */
    public void setContainer(com.kyt.xsd.widgetform.ContainerDocument.Container container)
    {
        generatedSetterHelperImpl(container, CONTAINER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "container" element
     */
    public com.kyt.xsd.widgetform.ContainerDocument.Container addNewContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.ContainerDocument.Container target = null;
            target = (com.kyt.xsd.widgetform.ContainerDocument.Container)get_store().add_element_user(CONTAINER$0);
            return target;
        }
    }
    /**
     * An XML container(@).
     *
     * This is a complex type.
     */
    public static class ContainerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.ContainerDocument.Container
    {
        private static final long serialVersionUID = 1L;
        
        public ContainerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
