/*
 * An XML document type.
 * Localname: not
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.NotDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one not(@) element.
 *
 * This is a complex type.
 */
public class NotDocumentImpl extends com.kyt.xsd.widgetscreen.impl.AllConditionalsDocumentImpl implements com.kyt.xsd.widgetscreen.NotDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOT$0 = 
        new javax.xml.namespace.QName("", "not");
    
    
    /**
     * Gets the "not" element
     */
    public com.kyt.xsd.widgetscreen.NotDocument.Not getNot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.NotDocument.Not target = null;
            target = (com.kyt.xsd.widgetscreen.NotDocument.Not)get_store().find_element_user(NOT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "not" element
     */
    public void setNot(com.kyt.xsd.widgetscreen.NotDocument.Not not)
    {
        generatedSetterHelperImpl(not, NOT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "not" element
     */
    public com.kyt.xsd.widgetscreen.NotDocument.Not addNewNot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.NotDocument.Not target = null;
            target = (com.kyt.xsd.widgetscreen.NotDocument.Not)get_store().add_element_user(NOT$0);
            return target;
        }
    }
    /**
     * An XML not(@).
     *
     * This is a complex type.
     */
    public static class NotImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.NotDocument.Not
    {
        private static final long serialVersionUID = 1L;
        
        public NotImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALLCONDITIONALS$0 = 
            new javax.xml.namespace.QName("", "AllConditionals");
        private static final org.apache.xmlbeans.QNameSet ALLCONDITIONALS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("", "xor"),
            new javax.xml.namespace.QName("", "if-validate-method"),
            new javax.xml.namespace.QName("", "or"),
            new javax.xml.namespace.QName("", "AllConditionals"),
            new javax.xml.namespace.QName("", "if-compare-field"),
            new javax.xml.namespace.QName("", "if-empty-section"),
            new javax.xml.namespace.QName("", "and"),
            new javax.xml.namespace.QName("", "not"),
            new javax.xml.namespace.QName("", "if-entity-permission"),
            new javax.xml.namespace.QName("", "if-service-permission"),
            new javax.xml.namespace.QName("", "if-compare"),
            new javax.xml.namespace.QName("", "if-empty"),
            new javax.xml.namespace.QName("", "if-regexp"),
            new javax.xml.namespace.QName("", "if-has-permission"),
        });
        
        
        /**
         * Gets the "AllConditionals" element
         */
        public org.apache.xmlbeans.XmlObject getAllConditionals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLCONDITIONALS$1, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "AllConditionals" element
         */
        public void setAllConditionals(org.apache.xmlbeans.XmlObject allConditionals)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLCONDITIONALS$1, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLCONDITIONALS$0);
                }
                target.set(allConditionals);
            }
        }
        
        /**
         * Appends and returns a new empty "AllConditionals" element
         */
        public org.apache.xmlbeans.XmlObject addNewAllConditionals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLCONDITIONALS$0);
                return target;
            }
        }
    }
}
