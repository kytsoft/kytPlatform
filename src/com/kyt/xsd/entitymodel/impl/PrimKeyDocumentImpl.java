/*
 * An XML document type.
 * Localname: prim-key
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.PrimKeyDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel.impl;
/**
 * A document containing one prim-key(@) element.
 *
 * This is a complex type.
 */
public class PrimKeyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.PrimKeyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrimKeyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMKEY$0 = 
        new javax.xml.namespace.QName("", "prim-key");
    
    
    /**
     * Gets the "prim-key" element
     */
    public com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey getPrimKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey target = null;
            target = (com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey)get_store().find_element_user(PRIMKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "prim-key" element
     */
    public void setPrimKey(com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey primKey)
    {
        generatedSetterHelperImpl(primKey, PRIMKEY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "prim-key" element
     */
    public com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey addNewPrimKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey target = null;
            target = (com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey)get_store().add_element_user(PRIMKEY$0);
            return target;
        }
    }
    /**
     * An XML prim-key(@).
     *
     * This is a complex type.
     */
    public static class PrimKeyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.PrimKeyDocument.PrimKey
    {
        private static final long serialVersionUID = 1L;
        
        public PrimKeyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELD$0 = 
            new javax.xml.namespace.QName("", "field");
        
        
        /**
         * Gets the "field" attribute
         */
        public java.lang.String getField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$0);
                return target;
            }
        }
        
        /**
         * Sets the "field" attribute
         */
        public void setField(java.lang.String field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD$0);
                }
                target.setStringValue(field);
            }
        }
        
        /**
         * Sets (as xml) the "field" attribute
         */
        public void xsetField(org.apache.xmlbeans.XmlString field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELD$0);
                }
                target.set(field);
            }
        }
    }
}
