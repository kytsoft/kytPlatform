/*
 * An XML document type.
 * Localname: else-if
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.ElseIfDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one else-if(@) element.
 *
 * This is a complex type.
 */
public class ElseIfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.ElseIfDocument
{
    private static final long serialVersionUID = 1L;
    
    public ElseIfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELSEIF$0 = 
        new javax.xml.namespace.QName("", "else-if");
    
    
    /**
     * Gets the "else-if" element
     */
    public com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf getElseIf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf target = null;
            target = (com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf)get_store().find_element_user(ELSEIF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "else-if" element
     */
    public void setElseIf(com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf elseIf)
    {
        generatedSetterHelperImpl(elseIf, ELSEIF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "else-if" element
     */
    public com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf addNewElseIf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf target = null;
            target = (com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf)get_store().add_element_user(ELSEIF$0);
            return target;
        }
    }
    /**
     * An XML else-if(@).
     *
     * This is a complex type.
     */
    public static class ElseIfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf
    {
        private static final long serialVersionUID = 1L;
        
        public ElseIfImpl(org.apache.xmlbeans.SchemaType sType)
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
