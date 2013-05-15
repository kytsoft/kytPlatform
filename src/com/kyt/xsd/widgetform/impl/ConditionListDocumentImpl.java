/*
 * An XML document type.
 * Localname: condition-list
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.ConditionListDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one condition-list(@) element.
 *
 * This is a complex type.
 */
public class ConditionListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.ConditionListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConditionListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONLIST$0 = 
        new javax.xml.namespace.QName("", "condition-list");
    
    
    /**
     * Gets the "condition-list" element
     */
    public com.kyt.xsd.widgetform.ConditionListDocument.ConditionList getConditionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.ConditionListDocument.ConditionList target = null;
            target = (com.kyt.xsd.widgetform.ConditionListDocument.ConditionList)get_store().find_element_user(CONDITIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "condition-list" element
     */
    public void setConditionList(com.kyt.xsd.widgetform.ConditionListDocument.ConditionList conditionList)
    {
        generatedSetterHelperImpl(conditionList, CONDITIONLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "condition-list" element
     */
    public com.kyt.xsd.widgetform.ConditionListDocument.ConditionList addNewConditionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.ConditionListDocument.ConditionList target = null;
            target = (com.kyt.xsd.widgetform.ConditionListDocument.ConditionList)get_store().add_element_user(CONDITIONLIST$0);
            return target;
        }
    }
    /**
     * An XML condition-list(@).
     *
     * This is a complex type.
     */
    public static class ConditionListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.ConditionListDocument.ConditionList
    {
        private static final long serialVersionUID = 1L;
        
        public ConditionListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONDITIONEXPR$0 = 
            new javax.xml.namespace.QName("", "condition-expr");
        private static final javax.xml.namespace.QName CONDITIONLIST$2 = 
            new javax.xml.namespace.QName("", "condition-list");
        private static final javax.xml.namespace.QName CONDITIONOBJECT$4 = 
            new javax.xml.namespace.QName("", "condition-object");
        private static final javax.xml.namespace.QName COMBINE$6 = 
            new javax.xml.namespace.QName("", "combine");
        
        
        /**
         * Gets array of all "condition-expr" elements
         */
        public com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr[] getConditionExprArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONDITIONEXPR$0, targetList);
                com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr[] result = new com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "condition-expr" element
         */
        public com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr getConditionExprArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr target = null;
                target = (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr)get_store().find_element_user(CONDITIONEXPR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "condition-expr" element
         */
        public int sizeOfConditionExprArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONDITIONEXPR$0);
            }
        }
        
        /**
         * Sets array of all "condition-expr" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setConditionExprArray(com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr[] conditionExprArray)
        {
            check_orphaned();
            arraySetterHelper(conditionExprArray, CONDITIONEXPR$0);
        }
        
        /**
         * Sets ith "condition-expr" element
         */
        public void setConditionExprArray(int i, com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr conditionExpr)
        {
            generatedSetterHelperImpl(conditionExpr, CONDITIONEXPR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "condition-expr" element
         */
        public com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr insertNewConditionExpr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr target = null;
                target = (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr)get_store().insert_element_user(CONDITIONEXPR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "condition-expr" element
         */
        public com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr addNewConditionExpr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr target = null;
                target = (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr)get_store().add_element_user(CONDITIONEXPR$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "condition-expr" element
         */
        public void removeConditionExpr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONDITIONEXPR$0, i);
            }
        }
        
        /**
         * Gets array of all "condition-list" elements
         */
        public com.kyt.xsd.widgetform.ConditionListDocument.ConditionList[] getConditionListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONDITIONLIST$2, targetList);
                com.kyt.xsd.widgetform.ConditionListDocument.ConditionList[] result = new com.kyt.xsd.widgetform.ConditionListDocument.ConditionList[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "condition-list" element
         */
        public com.kyt.xsd.widgetform.ConditionListDocument.ConditionList getConditionListArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionListDocument.ConditionList target = null;
                target = (com.kyt.xsd.widgetform.ConditionListDocument.ConditionList)get_store().find_element_user(CONDITIONLIST$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "condition-list" element
         */
        public int sizeOfConditionListArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONDITIONLIST$2);
            }
        }
        
        /**
         * Sets array of all "condition-list" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setConditionListArray(com.kyt.xsd.widgetform.ConditionListDocument.ConditionList[] conditionListArray)
        {
            check_orphaned();
            arraySetterHelper(conditionListArray, CONDITIONLIST$2);
        }
        
        /**
         * Sets ith "condition-list" element
         */
        public void setConditionListArray(int i, com.kyt.xsd.widgetform.ConditionListDocument.ConditionList conditionList)
        {
            generatedSetterHelperImpl(conditionList, CONDITIONLIST$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "condition-list" element
         */
        public com.kyt.xsd.widgetform.ConditionListDocument.ConditionList insertNewConditionList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionListDocument.ConditionList target = null;
                target = (com.kyt.xsd.widgetform.ConditionListDocument.ConditionList)get_store().insert_element_user(CONDITIONLIST$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "condition-list" element
         */
        public com.kyt.xsd.widgetform.ConditionListDocument.ConditionList addNewConditionList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionListDocument.ConditionList target = null;
                target = (com.kyt.xsd.widgetform.ConditionListDocument.ConditionList)get_store().add_element_user(CONDITIONLIST$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "condition-list" element
         */
        public void removeConditionList(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONDITIONLIST$2, i);
            }
        }
        
        /**
         * Gets array of all "condition-object" elements
         */
        public com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject[] getConditionObjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONDITIONOBJECT$4, targetList);
                com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject[] result = new com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "condition-object" element
         */
        public com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject getConditionObjectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject target = null;
                target = (com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject)get_store().find_element_user(CONDITIONOBJECT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "condition-object" element
         */
        public int sizeOfConditionObjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONDITIONOBJECT$4);
            }
        }
        
        /**
         * Sets array of all "condition-object" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setConditionObjectArray(com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject[] conditionObjectArray)
        {
            check_orphaned();
            arraySetterHelper(conditionObjectArray, CONDITIONOBJECT$4);
        }
        
        /**
         * Sets ith "condition-object" element
         */
        public void setConditionObjectArray(int i, com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject conditionObject)
        {
            generatedSetterHelperImpl(conditionObject, CONDITIONOBJECT$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "condition-object" element
         */
        public com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject insertNewConditionObject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject target = null;
                target = (com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject)get_store().insert_element_user(CONDITIONOBJECT$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "condition-object" element
         */
        public com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject addNewConditionObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject target = null;
                target = (com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject)get_store().add_element_user(CONDITIONOBJECT$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "condition-object" element
         */
        public void removeConditionObject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONDITIONOBJECT$4, i);
            }
        }
        
        /**
         * Gets the "combine" attribute
         */
        public com.kyt.xsd.widgetform.ConditionListDocument.ConditionList.Combine.Enum getCombine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMBINE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COMBINE$6);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.ConditionListDocument.ConditionList.Combine.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "combine" attribute
         */
        public com.kyt.xsd.widgetform.ConditionListDocument.ConditionList.Combine xgetCombine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionListDocument.ConditionList.Combine target = null;
                target = (com.kyt.xsd.widgetform.ConditionListDocument.ConditionList.Combine)get_store().find_attribute_user(COMBINE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.ConditionListDocument.ConditionList.Combine)get_default_attribute_value(COMBINE$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "combine" attribute
         */
        public boolean isSetCombine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COMBINE$6) != null;
            }
        }
        
        /**
         * Sets the "combine" attribute
         */
        public void setCombine(com.kyt.xsd.widgetform.ConditionListDocument.ConditionList.Combine.Enum combine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMBINE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMBINE$6);
                }
                target.setEnumValue(combine);
            }
        }
        
        /**
         * Sets (as xml) the "combine" attribute
         */
        public void xsetCombine(com.kyt.xsd.widgetform.ConditionListDocument.ConditionList.Combine combine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ConditionListDocument.ConditionList.Combine target = null;
                target = (com.kyt.xsd.widgetform.ConditionListDocument.ConditionList.Combine)get_store().find_attribute_user(COMBINE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.ConditionListDocument.ConditionList.Combine)get_store().add_attribute_user(COMBINE$6);
                }
                target.set(combine);
            }
        }
        
        /**
         * Unsets the "combine" attribute
         */
        public void unsetCombine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COMBINE$6);
            }
        }
        /**
         * An XML combine(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.ConditionListDocument$ConditionList$Combine.
         */
        public static class CombineImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.ConditionListDocument.ConditionList.Combine
        {
            private static final long serialVersionUID = 1L;
            
            public CombineImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected CombineImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
