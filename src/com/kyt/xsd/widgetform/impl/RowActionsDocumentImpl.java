/*
 * An XML document type.
 * Localname: row-actions
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.RowActionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one row-actions(@) element.
 *
 * This is a complex type.
 */
public class RowActionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.RowActionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public RowActionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROWACTIONS$0 = 
        new javax.xml.namespace.QName("", "row-actions");
    
    
    /**
     * Gets the "row-actions" element
     */
    public com.kyt.xsd.widgetform.RowActionsDocument.RowActions getRowActions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.RowActionsDocument.RowActions target = null;
            target = (com.kyt.xsd.widgetform.RowActionsDocument.RowActions)get_store().find_element_user(ROWACTIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "row-actions" element
     */
    public void setRowActions(com.kyt.xsd.widgetform.RowActionsDocument.RowActions rowActions)
    {
        generatedSetterHelperImpl(rowActions, ROWACTIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "row-actions" element
     */
    public com.kyt.xsd.widgetform.RowActionsDocument.RowActions addNewRowActions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.RowActionsDocument.RowActions target = null;
            target = (com.kyt.xsd.widgetform.RowActionsDocument.RowActions)get_store().add_element_user(ROWACTIONS$0);
            return target;
        }
    }
    /**
     * An XML row-actions(@).
     *
     * This is a complex type.
     */
    public static class RowActionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.RowActionsDocument.RowActions
    {
        private static final long serialVersionUID = 1L;
        
        public RowActionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALLACTIONS$0 = 
            new javax.xml.namespace.QName("", "AllActions");
        private static final org.apache.xmlbeans.QNameSet ALLACTIONS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("", "property-map"),
            new javax.xml.namespace.QName("", "entity-condition"),
            new javax.xml.namespace.QName("", "AllActions"),
            new javax.xml.namespace.QName("", "entity-and"),
            new javax.xml.namespace.QName("", "property-to-field"),
            new javax.xml.namespace.QName("", "set"),
            new javax.xml.namespace.QName("", "entity-one"),
            new javax.xml.namespace.QName("", "service"),
            new javax.xml.namespace.QName("", "script"),
            new javax.xml.namespace.QName("", "call-parent-actions"),
        });
        
        
        /**
         * Gets array of all "AllActions" elements
         */
        public org.apache.xmlbeans.XmlObject[] getAllActionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALLACTIONS$1, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AllActions" element
         */
        public org.apache.xmlbeans.XmlObject getAllActionsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLACTIONS$1, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AllActions" element
         */
        public int sizeOfAllActionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALLACTIONS$1);
            }
        }
        
        /**
         * Sets array of all "AllActions" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAllActionsArray(org.apache.xmlbeans.XmlObject[] allActionsArray)
        {
            check_orphaned();
            arraySetterHelper(allActionsArray, ALLACTIONS$0, ALLACTIONS$1);
        }
        
        /**
         * Sets ith "AllActions" element
         */
        public void setAllActionsArray(int i, org.apache.xmlbeans.XmlObject allActions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLACTIONS$1, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(allActions);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AllActions" element
         */
        public org.apache.xmlbeans.XmlObject insertNewAllActions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ALLACTIONS$1, ALLACTIONS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AllActions" element
         */
        public org.apache.xmlbeans.XmlObject addNewAllActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLACTIONS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "AllActions" element
         */
        public void removeAllActions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALLACTIONS$1, i);
            }
        }
    }
}
