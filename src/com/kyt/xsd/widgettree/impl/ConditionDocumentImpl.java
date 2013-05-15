/*
 * An XML document type.
 * Localname: condition
 * Namespace: 
 * Java type: com.kyt.xsd.widgettree.ConditionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgettree.impl;
/**
 * A document containing one condition(@) element.
 *
 * This is a complex type.
 */
public class ConditionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.ConditionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConditionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITION$0 = 
        new javax.xml.namespace.QName("", "condition");
    
    
    /**
     * Gets the "condition" element
     */
    public com.kyt.xsd.widgettree.ConditionDocument.Condition getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.ConditionDocument.Condition target = null;
            target = (com.kyt.xsd.widgettree.ConditionDocument.Condition)get_store().find_element_user(CONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "condition" element
     */
    public void setCondition(com.kyt.xsd.widgettree.ConditionDocument.Condition condition)
    {
        generatedSetterHelperImpl(condition, CONDITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "condition" element
     */
    public com.kyt.xsd.widgettree.ConditionDocument.Condition addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.ConditionDocument.Condition target = null;
            target = (com.kyt.xsd.widgettree.ConditionDocument.Condition)get_store().add_element_user(CONDITION$0);
            return target;
        }
    }
    /**
     * An XML condition(@).
     *
     * This is a complex type.
     */
    public static class ConditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.ConditionDocument.Condition
    {
        private static final long serialVersionUID = 1L;
        
        public ConditionImpl(org.apache.xmlbeans.SchemaType sType)
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
            new javax.xml.namespace.QName("", "and"),
            new javax.xml.namespace.QName("", "not"),
            new javax.xml.namespace.QName("", "if-entity-permission"),
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
