/*
 * An XML document type.
 * Localname: clear-entity-caches
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.ClearEntityCachesDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one clear-entity-caches(@) element.
 *
 * This is a complex type.
 */
public class ClearEntityCachesDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityValueOperationsDocumentImpl implements com.kyt.xsd.simplemethods.ClearEntityCachesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClearEntityCachesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLEARENTITYCACHES$0 = 
        new javax.xml.namespace.QName("", "clear-entity-caches");
    
    
    /**
     * Gets the "clear-entity-caches" element
     */
    public com.kyt.xsd.simplemethods.ClearEntityCachesDocument.ClearEntityCaches getClearEntityCaches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ClearEntityCachesDocument.ClearEntityCaches target = null;
            target = (com.kyt.xsd.simplemethods.ClearEntityCachesDocument.ClearEntityCaches)get_store().find_element_user(CLEARENTITYCACHES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "clear-entity-caches" element
     */
    public void setClearEntityCaches(com.kyt.xsd.simplemethods.ClearEntityCachesDocument.ClearEntityCaches clearEntityCaches)
    {
        generatedSetterHelperImpl(clearEntityCaches, CLEARENTITYCACHES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "clear-entity-caches" element
     */
    public com.kyt.xsd.simplemethods.ClearEntityCachesDocument.ClearEntityCaches addNewClearEntityCaches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ClearEntityCachesDocument.ClearEntityCaches target = null;
            target = (com.kyt.xsd.simplemethods.ClearEntityCachesDocument.ClearEntityCaches)get_store().add_element_user(CLEARENTITYCACHES$0);
            return target;
        }
    }
    /**
     * An XML clear-entity-caches(@).
     *
     * This is a complex type.
     */
    public static class ClearEntityCachesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.ClearEntityCachesDocument.ClearEntityCaches
    {
        private static final long serialVersionUID = 1L;
        
        public ClearEntityCachesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
