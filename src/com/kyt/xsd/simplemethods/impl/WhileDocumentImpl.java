/*
 * An XML document type.
 * Localname: while
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.WhileDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one while(@) element.
 *
 * This is a complex type.
 */
public class WhileDocumentImpl extends com.kyt.xsd.simplemethods.impl.IfOtherOperationsDocumentImpl implements com.kyt.xsd.simplemethods.WhileDocument
{
    private static final long serialVersionUID = 1L;
    
    public WhileDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WHILE$0 = 
        new javax.xml.namespace.QName("", "while");
    
    
    /**
     * Gets the "while" element
     */
    public com.kyt.xsd.simplemethods.WhileDocument.While getWhile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.WhileDocument.While target = null;
            target = (com.kyt.xsd.simplemethods.WhileDocument.While)get_store().find_element_user(WHILE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "while" element
     */
    public void setWhile(com.kyt.xsd.simplemethods.WhileDocument.While xwhile)
    {
        generatedSetterHelperImpl(xwhile, WHILE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "while" element
     */
    public com.kyt.xsd.simplemethods.WhileDocument.While addNewWhile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.WhileDocument.While target = null;
            target = (com.kyt.xsd.simplemethods.WhileDocument.While)get_store().add_element_user(WHILE$0);
            return target;
        }
    }
    /**
     * An XML while(@).
     *
     * This is a complex type.
     */
    public static class WhileImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.WhileDocument.While
    {
        private static final long serialVersionUID = 1L;
        
        public WhileImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONDITION$0 = 
            new javax.xml.namespace.QName("", "condition");
        private static final javax.xml.namespace.QName THEN$2 = 
            new javax.xml.namespace.QName("", "then");
        
        
        /**
         * Gets the "condition" element
         */
        public com.kyt.xsd.simplemethods.ConditionDocument.Condition getCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ConditionDocument.Condition target = null;
                target = (com.kyt.xsd.simplemethods.ConditionDocument.Condition)get_store().find_element_user(CONDITION$0, 0);
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
        public void setCondition(com.kyt.xsd.simplemethods.ConditionDocument.Condition condition)
        {
            generatedSetterHelperImpl(condition, CONDITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "condition" element
         */
        public com.kyt.xsd.simplemethods.ConditionDocument.Condition addNewCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ConditionDocument.Condition target = null;
                target = (com.kyt.xsd.simplemethods.ConditionDocument.Condition)get_store().add_element_user(CONDITION$0);
                return target;
            }
        }
        
        /**
         * Gets the "then" element
         */
        public com.kyt.xsd.simplemethods.ThenDocument.Then getThen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ThenDocument.Then target = null;
                target = (com.kyt.xsd.simplemethods.ThenDocument.Then)get_store().find_element_user(THEN$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "then" element
         */
        public void setThen(com.kyt.xsd.simplemethods.ThenDocument.Then then)
        {
            generatedSetterHelperImpl(then, THEN$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "then" element
         */
        public com.kyt.xsd.simplemethods.ThenDocument.Then addNewThen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ThenDocument.Then target = null;
                target = (com.kyt.xsd.simplemethods.ThenDocument.Then)get_store().add_element_user(THEN$2);
                return target;
            }
        }
    }
}
