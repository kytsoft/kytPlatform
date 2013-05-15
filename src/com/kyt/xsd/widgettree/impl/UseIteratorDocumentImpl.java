/*
 * An XML document type.
 * Localname: use-iterator
 * Namespace: 
 * Java type: com.kyt.xsd.widgettree.UseIteratorDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgettree.impl;
/**
 * A document containing one use-iterator(@) element.
 *
 * This is a complex type.
 */
public class UseIteratorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.UseIteratorDocument
{
    private static final long serialVersionUID = 1L;
    
    public UseIteratorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USEITERATOR$0 = 
        new javax.xml.namespace.QName("", "use-iterator");
    
    
    /**
     * Gets the "use-iterator" element
     */
    public com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator getUseIterator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator target = null;
            target = (com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator)get_store().find_element_user(USEITERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "use-iterator" element
     */
    public void setUseIterator(com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator useIterator)
    {
        generatedSetterHelperImpl(useIterator, USEITERATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "use-iterator" element
     */
    public com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator addNewUseIterator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator target = null;
            target = (com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator)get_store().add_element_user(USEITERATOR$0);
            return target;
        }
    }
    /**
     * An XML use-iterator(@).
     *
     * This is a complex type.
     */
    public static class UseIteratorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator
    {
        private static final long serialVersionUID = 1L;
        
        public UseIteratorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
