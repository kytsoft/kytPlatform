/*
 * An XML document type.
 * Localname: condition
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.ConditionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one condition(@) element.
 *
 * This is a complex type.
 */
public class ConditionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.ConditionDocument
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
     * An XML condition(@).
     *
     * This is a complex type.
     */
    public static class ConditionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.ConditionDocument.Condition
    {
        private static final long serialVersionUID = 1L;
        
        public ConditionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IFCOMBINECONDITIONS$0 = 
            new javax.xml.namespace.QName("", "IfCombineConditions");
        private static final org.apache.xmlbeans.QNameSet IFCOMBINECONDITIONS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("", "not"),
            new javax.xml.namespace.QName("", "xor"),
            new javax.xml.namespace.QName("", "or"),
            new javax.xml.namespace.QName("", "IfCombineConditions"),
            new javax.xml.namespace.QName("", "and"),
        });
        private static final javax.xml.namespace.QName IFBASICOPERATIONS$2 = 
            new javax.xml.namespace.QName("", "IfBasicOperations");
        private static final org.apache.xmlbeans.QNameSet IFBASICOPERATIONS$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("", "if-instance-of"),
            new javax.xml.namespace.QName("", "if-validate-method"),
            new javax.xml.namespace.QName("", "if-compare"),
            new javax.xml.namespace.QName("", "IfBasicOperations"),
            new javax.xml.namespace.QName("", "if-empty"),
            new javax.xml.namespace.QName("", "if-regexp"),
            new javax.xml.namespace.QName("", "if-has-permission"),
            new javax.xml.namespace.QName("", "if-compare-field"),
        });
        
        
        /**
         * Gets the "IfCombineConditions" element
         */
        public org.apache.xmlbeans.XmlObject getIfCombineConditions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFCOMBINECONDITIONS$1, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "IfCombineConditions" element
         */
        public boolean isSetIfCombineConditions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IFCOMBINECONDITIONS$1) != 0;
            }
        }
        
        /**
         * Sets the "IfCombineConditions" element
         */
        public void setIfCombineConditions(org.apache.xmlbeans.XmlObject ifCombineConditions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFCOMBINECONDITIONS$1, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IFCOMBINECONDITIONS$0);
                }
                target.set(ifCombineConditions);
            }
        }
        
        /**
         * Appends and returns a new empty "IfCombineConditions" element
         */
        public org.apache.xmlbeans.XmlObject addNewIfCombineConditions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IFCOMBINECONDITIONS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "IfCombineConditions" element
         */
        public void unsetIfCombineConditions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IFCOMBINECONDITIONS$1, 0);
            }
        }
        
        /**
         * Gets the "IfBasicOperations" element
         */
        public org.apache.xmlbeans.XmlObject getIfBasicOperations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFBASICOPERATIONS$3, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "IfBasicOperations" element
         */
        public boolean isSetIfBasicOperations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IFBASICOPERATIONS$3) != 0;
            }
        }
        
        /**
         * Sets the "IfBasicOperations" element
         */
        public void setIfBasicOperations(org.apache.xmlbeans.XmlObject ifBasicOperations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFBASICOPERATIONS$3, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IFBASICOPERATIONS$2);
                }
                target.set(ifBasicOperations);
            }
        }
        
        /**
         * Appends and returns a new empty "IfBasicOperations" element
         */
        public org.apache.xmlbeans.XmlObject addNewIfBasicOperations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IFBASICOPERATIONS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "IfBasicOperations" element
         */
        public void unsetIfBasicOperations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IFBASICOPERATIONS$3, 0);
            }
        }
    }
}
