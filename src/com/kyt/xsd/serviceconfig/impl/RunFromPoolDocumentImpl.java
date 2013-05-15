/*
 * An XML document type.
 * Localname: run-from-pool
 * Namespace: 
 * Java type: com.kyt.xsd.serviceconfig.RunFromPoolDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceconfig.impl;
/**
 * A document containing one run-from-pool(@) element.
 *
 * This is a complex type.
 */
public class RunFromPoolDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.serviceconfig.RunFromPoolDocument
{
    private static final long serialVersionUID = 1L;
    
    public RunFromPoolDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RUNFROMPOOL$0 = 
        new javax.xml.namespace.QName("", "run-from-pool");
    
    
    /**
     * Gets the "run-from-pool" element
     */
    public com.kyt.xsd.serviceconfig.RunFromPoolDocument.RunFromPool getRunFromPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.serviceconfig.RunFromPoolDocument.RunFromPool target = null;
            target = (com.kyt.xsd.serviceconfig.RunFromPoolDocument.RunFromPool)get_store().find_element_user(RUNFROMPOOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "run-from-pool" element
     */
    public void setRunFromPool(com.kyt.xsd.serviceconfig.RunFromPoolDocument.RunFromPool runFromPool)
    {
        generatedSetterHelperImpl(runFromPool, RUNFROMPOOL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "run-from-pool" element
     */
    public com.kyt.xsd.serviceconfig.RunFromPoolDocument.RunFromPool addNewRunFromPool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.serviceconfig.RunFromPoolDocument.RunFromPool target = null;
            target = (com.kyt.xsd.serviceconfig.RunFromPoolDocument.RunFromPool)get_store().add_element_user(RUNFROMPOOL$0);
            return target;
        }
    }
    /**
     * An XML run-from-pool(@).
     *
     * This is a complex type.
     */
    public static class RunFromPoolImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.serviceconfig.RunFromPoolDocument.RunFromPool
    {
        private static final long serialVersionUID = 1L;
        
        public RunFromPoolImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
    }
}
