/*
 * An XML document type.
 * Localname: depends-on
 * Namespace: 
 * Java type: com.kyt.xsd.ofbizcomponent.DependsOnDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.ofbizcomponent.impl;
/**
 * A document containing one depends-on(@) element.
 *
 * This is a complex type.
 */
public class DependsOnDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.DependsOnDocument
{
    private static final long serialVersionUID = 1L;
    
    public DependsOnDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPENDSON$0 = 
        new javax.xml.namespace.QName("", "depends-on");
    
    
    /**
     * Gets the "depends-on" element
     */
    public com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn getDependsOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn target = null;
            target = (com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn)get_store().find_element_user(DEPENDSON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "depends-on" element
     */
    public void setDependsOn(com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn dependsOn)
    {
        generatedSetterHelperImpl(dependsOn, DEPENDSON$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "depends-on" element
     */
    public com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn addNewDependsOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn target = null;
            target = (com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn)get_store().add_element_user(DEPENDSON$0);
            return target;
        }
    }
    /**
     * An XML depends-on(@).
     *
     * This is a complex type.
     */
    public static class DependsOnImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn
    {
        private static final long serialVersionUID = 1L;
        
        public DependsOnImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMPONENTNAME$0 = 
            new javax.xml.namespace.QName("", "component-name");
        
        
        /**
         * Gets the "component-name" attribute
         */
        public java.lang.String getComponentName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPONENTNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "component-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetComponentName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPONENTNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "component-name" attribute
         */
        public void setComponentName(java.lang.String componentName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPONENTNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPONENTNAME$0);
                }
                target.setStringValue(componentName);
            }
        }
        
        /**
         * Sets (as xml) the "component-name" attribute
         */
        public void xsetComponentName(org.apache.xmlbeans.XmlString componentName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COMPONENTNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COMPONENTNAME$0);
                }
                target.set(componentName);
            }
        }
    }
}
