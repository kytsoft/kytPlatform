/*
 * An XML document type.
 * Localname: or
 * Namespace: 
 * Java type: com.kyt.xsd.widgetmenu.OrDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetmenu.impl;
/**
 * A document containing one or(@) element.
 *
 * This is a complex type.
 */
public class OrDocumentImpl extends com.kyt.xsd.widgetmenu.impl.AllConditionalsDocumentImpl implements com.kyt.xsd.widgetmenu.OrDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OR$0 = 
        new javax.xml.namespace.QName("", "or");
    
    
    /**
     * Gets the "or" element
     */
    public com.kyt.xsd.widgetmenu.OrDocument.Or getOr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetmenu.OrDocument.Or target = null;
            target = (com.kyt.xsd.widgetmenu.OrDocument.Or)get_store().find_element_user(OR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "or" element
     */
    public void setOr(com.kyt.xsd.widgetmenu.OrDocument.Or or)
    {
        generatedSetterHelperImpl(or, OR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "or" element
     */
    public com.kyt.xsd.widgetmenu.OrDocument.Or addNewOr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetmenu.OrDocument.Or target = null;
            target = (com.kyt.xsd.widgetmenu.OrDocument.Or)get_store().add_element_user(OR$0);
            return target;
        }
    }
    /**
     * An XML or(@).
     *
     * This is a complex type.
     */
    public static class OrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetmenu.OrDocument.Or
    {
        private static final long serialVersionUID = 1L;
        
        public OrImpl(org.apache.xmlbeans.SchemaType sType)
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
            new javax.xml.namespace.QName("", "if-service-permission"),
            new javax.xml.namespace.QName("", "if-compare"),
            new javax.xml.namespace.QName("", "if-empty"),
            new javax.xml.namespace.QName("", "if-regexp"),
            new javax.xml.namespace.QName("", "if-has-permission"),
        });
        
        
        /**
         * Gets array of all "AllConditionals" elements
         */
        public org.apache.xmlbeans.XmlObject[] getAllConditionalsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALLCONDITIONALS$1, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AllConditionals" element
         */
        public org.apache.xmlbeans.XmlObject getAllConditionalsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLCONDITIONALS$1, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AllConditionals" element
         */
        public int sizeOfAllConditionalsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALLCONDITIONALS$1);
            }
        }
        
        /**
         * Sets array of all "AllConditionals" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAllConditionalsArray(org.apache.xmlbeans.XmlObject[] allConditionalsArray)
        {
            check_orphaned();
            arraySetterHelper(allConditionalsArray, ALLCONDITIONALS$0, ALLCONDITIONALS$1);
        }
        
        /**
         * Sets ith "AllConditionals" element
         */
        public void setAllConditionalsArray(int i, org.apache.xmlbeans.XmlObject allConditionals)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLCONDITIONALS$1, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(allConditionals);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AllConditionals" element
         */
        public org.apache.xmlbeans.XmlObject insertNewAllConditionals(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ALLCONDITIONALS$1, ALLCONDITIONALS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AllConditionals" element
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
        
        /**
         * Removes the ith "AllConditionals" element
         */
        public void removeAllConditionals(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALLCONDITIONALS$1, i);
            }
        }
    }
}
