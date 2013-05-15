/*
 * An XML document type.
 * Localname: if
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.IfDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one if(@) element.
 *
 * This is a complex type.
 */
public class IfDocumentImpl extends com.kyt.xsd.simplemethods.impl.IfOtherOperationsDocumentImpl implements com.kyt.xsd.simplemethods.IfDocument
{
    private static final long serialVersionUID = 1L;
    
    public IfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IF$0 = 
        new javax.xml.namespace.QName("", "if");
    
    
    /**
     * Gets the "if" element
     */
    public com.kyt.xsd.simplemethods.IfDocument.If getIf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.IfDocument.If target = null;
            target = (com.kyt.xsd.simplemethods.IfDocument.If)get_store().find_element_user(IF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "if" element
     */
    public void setIf(com.kyt.xsd.simplemethods.IfDocument.If xif)
    {
        generatedSetterHelperImpl(xif, IF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "if" element
     */
    public com.kyt.xsd.simplemethods.IfDocument.If addNewIf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.IfDocument.If target = null;
            target = (com.kyt.xsd.simplemethods.IfDocument.If)get_store().add_element_user(IF$0);
            return target;
        }
    }
    /**
     * An XML if(@).
     *
     * This is a complex type.
     */
    public static class IfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.IfDocument.If
    {
        private static final long serialVersionUID = 1L;
        
        public IfImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONDITION$0 = 
            new javax.xml.namespace.QName("", "condition");
        private static final javax.xml.namespace.QName THEN$2 = 
            new javax.xml.namespace.QName("", "then");
        private static final javax.xml.namespace.QName ELSEIF$4 = 
            new javax.xml.namespace.QName("", "else-if");
        private static final javax.xml.namespace.QName ELSE$6 = 
            new javax.xml.namespace.QName("", "else");
        
        
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
        
        /**
         * Gets array of all "else-if" elements
         */
        public com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf[] getElseIfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ELSEIF$4, targetList);
                com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf[] result = new com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "else-if" element
         */
        public com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf getElseIfArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf target = null;
                target = (com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf)get_store().find_element_user(ELSEIF$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "else-if" element
         */
        public int sizeOfElseIfArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ELSEIF$4);
            }
        }
        
        /**
         * Sets array of all "else-if" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setElseIfArray(com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf[] elseIfArray)
        {
            check_orphaned();
            arraySetterHelper(elseIfArray, ELSEIF$4);
        }
        
        /**
         * Sets ith "else-if" element
         */
        public void setElseIfArray(int i, com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf elseIf)
        {
            generatedSetterHelperImpl(elseIf, ELSEIF$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "else-if" element
         */
        public com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf insertNewElseIf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf target = null;
                target = (com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf)get_store().insert_element_user(ELSEIF$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "else-if" element
         */
        public com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf addNewElseIf()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf target = null;
                target = (com.kyt.xsd.simplemethods.ElseIfDocument.ElseIf)get_store().add_element_user(ELSEIF$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "else-if" element
         */
        public void removeElseIf(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ELSEIF$4, i);
            }
        }
        
        /**
         * Gets the "else" element
         */
        public com.kyt.xsd.simplemethods.ElseDocument.Else getElse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ElseDocument.Else target = null;
                target = (com.kyt.xsd.simplemethods.ElseDocument.Else)get_store().find_element_user(ELSE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "else" element
         */
        public boolean isSetElse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ELSE$6) != 0;
            }
        }
        
        /**
         * Sets the "else" element
         */
        public void setElse(com.kyt.xsd.simplemethods.ElseDocument.Else xelse)
        {
            generatedSetterHelperImpl(xelse, ELSE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "else" element
         */
        public com.kyt.xsd.simplemethods.ElseDocument.Else addNewElse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ElseDocument.Else target = null;
                target = (com.kyt.xsd.simplemethods.ElseDocument.Else)get_store().add_element_user(ELSE$6);
                return target;
            }
        }
        
        /**
         * Unsets the "else" element
         */
        public void unsetElse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ELSE$6, 0);
            }
        }
    }
}
