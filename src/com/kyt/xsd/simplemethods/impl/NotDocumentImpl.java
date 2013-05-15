/*
 * An XML document type.
 * Localname: not
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.NotDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one not(@) element.
 *
 * This is a complex type.
 */
public class NotDocumentImpl extends com.kyt.xsd.simplemethods.impl.IfCombineConditionsDocumentImpl implements com.kyt.xsd.simplemethods.NotDocument
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
    public com.kyt.xsd.simplemethods.NotDocument.Not getNot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.NotDocument.Not target = null;
            target = (com.kyt.xsd.simplemethods.NotDocument.Not)get_store().find_element_user(NOT$0, 0);
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
    public void setNot(com.kyt.xsd.simplemethods.NotDocument.Not not)
    {
        generatedSetterHelperImpl(not, NOT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "not" element
     */
    public com.kyt.xsd.simplemethods.NotDocument.Not addNewNot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.NotDocument.Not target = null;
            target = (com.kyt.xsd.simplemethods.NotDocument.Not)get_store().add_element_user(NOT$0);
            return target;
        }
    }
    /**
     * An XML not(@).
     *
     * This is a complex type.
     */
    public static class NotImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.NotDocument.Not
    {
        private static final long serialVersionUID = 1L;
        
        public NotImpl(org.apache.xmlbeans.SchemaType sType)
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
