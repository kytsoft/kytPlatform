/*
 * An XML document type.
 * Localname: load-components
 * Namespace: 
 * Java type: com.kyt.xsd.componentloader.LoadComponentsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.componentloader.impl;
/**
 * A document containing one load-components(@) element.
 *
 * This is a complex type.
 */
public class LoadComponentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.componentloader.LoadComponentsDocument
{
    private static final long serialVersionUID = 1L;
    
    public LoadComponentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOADCOMPONENTS$0 = 
        new javax.xml.namespace.QName("", "load-components");
    
    
    /**
     * Gets the "load-components" element
     */
    public com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents getLoadComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents target = null;
            target = (com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents)get_store().find_element_user(LOADCOMPONENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "load-components" element
     */
    public void setLoadComponents(com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents loadComponents)
    {
        generatedSetterHelperImpl(loadComponents, LOADCOMPONENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "load-components" element
     */
    public com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents addNewLoadComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents target = null;
            target = (com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents)get_store().add_element_user(LOADCOMPONENTS$0);
            return target;
        }
    }
    /**
     * An XML load-components(@).
     *
     * This is a complex type.
     */
    public static class LoadComponentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents
    {
        private static final long serialVersionUID = 1L;
        
        public LoadComponentsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARENTDIRECTORY$0 = 
            new javax.xml.namespace.QName("", "parent-directory");
        
        
        /**
         * Gets the "parent-directory" attribute
         */
        public java.lang.String getParentDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENTDIRECTORY$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parent-directory" attribute
         */
        public org.apache.xmlbeans.XmlString xgetParentDirectory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARENTDIRECTORY$0);
                return target;
            }
        }
        
        /**
         * Sets the "parent-directory" attribute
         */
        public void setParentDirectory(java.lang.String parentDirectory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENTDIRECTORY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARENTDIRECTORY$0);
                }
                target.setStringValue(parentDirectory);
            }
        }
        
        /**
         * Sets (as xml) the "parent-directory" attribute
         */
        public void xsetParentDirectory(org.apache.xmlbeans.XmlString parentDirectory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARENTDIRECTORY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARENTDIRECTORY$0);
                }
                target.set(parentDirectory);
            }
        }
    }
}
