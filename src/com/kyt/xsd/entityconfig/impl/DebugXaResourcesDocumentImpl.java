/*
 * An XML document type.
 * Localname: debug-xa-resources
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.DebugXaResourcesDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig.impl;
/**
 * A document containing one debug-xa-resources(@) element.
 *
 * This is a complex type.
 */
public class DebugXaResourcesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.DebugXaResourcesDocument
{
    private static final long serialVersionUID = 1L;
    
    public DebugXaResourcesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEBUGXARESOURCES$0 = 
        new javax.xml.namespace.QName("", "debug-xa-resources");
    
    
    /**
     * Gets the "debug-xa-resources" element
     */
    public com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources getDebugXaResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources target = null;
            target = (com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources)get_store().find_element_user(DEBUGXARESOURCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "debug-xa-resources" element
     */
    public void setDebugXaResources(com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources debugXaResources)
    {
        generatedSetterHelperImpl(debugXaResources, DEBUGXARESOURCES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "debug-xa-resources" element
     */
    public com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources addNewDebugXaResources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources target = null;
            target = (com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources)get_store().add_element_user(DEBUGXARESOURCES$0);
            return target;
        }
    }
    /**
     * An XML debug-xa-resources(@).
     *
     * This is a complex type.
     */
    public static class DebugXaResourcesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.DebugXaResourcesDocument.DebugXaResources
    {
        private static final long serialVersionUID = 1L;
        
        public DebugXaResourcesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
    }
}
