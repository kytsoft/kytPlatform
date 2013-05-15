/*
 * An XML document type.
 * Localname: order-value-list
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.OrderValueListDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one order-value-list(@) element.
 *
 * This is a complex type.
 */
public class OrderValueListDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityFindOperationsDocumentImpl implements com.kyt.xsd.simplemethods.OrderValueListDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrderValueListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDERVALUELIST$0 = 
        new javax.xml.namespace.QName("", "order-value-list");
    
    
    /**
     * Gets the "order-value-list" element
     */
    public com.kyt.xsd.simplemethods.OrderValueListDocument.OrderValueList getOrderValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.OrderValueListDocument.OrderValueList target = null;
            target = (com.kyt.xsd.simplemethods.OrderValueListDocument.OrderValueList)get_store().find_element_user(ORDERVALUELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "order-value-list" element
     */
    public void setOrderValueList(com.kyt.xsd.simplemethods.OrderValueListDocument.OrderValueList orderValueList)
    {
        generatedSetterHelperImpl(orderValueList, ORDERVALUELIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "order-value-list" element
     */
    public com.kyt.xsd.simplemethods.OrderValueListDocument.OrderValueList addNewOrderValueList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.OrderValueListDocument.OrderValueList target = null;
            target = (com.kyt.xsd.simplemethods.OrderValueListDocument.OrderValueList)get_store().add_element_user(ORDERVALUELIST$0);
            return target;
        }
    }
    /**
     * An XML order-value-list(@).
     *
     * This is a complex type.
     */
    public static class OrderValueListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.OrderValueListDocument.OrderValueList
    {
        private static final long serialVersionUID = 1L;
        
        public OrderValueListImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LIST$0 = 
            new javax.xml.namespace.QName("", "list");
        private static final javax.xml.namespace.QName TOLIST$2 = 
            new javax.xml.namespace.QName("", "to-list");
        private static final javax.xml.namespace.QName ORDERBYLIST$4 = 
            new javax.xml.namespace.QName("", "order-by-list");
        
        
        /**
         * Gets the "list" attribute
         */
        public java.lang.String getList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "list" attribute
         */
        public org.apache.xmlbeans.XmlString xgetList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$0);
                return target;
            }
        }
        
        /**
         * Sets the "list" attribute
         */
        public void setList(java.lang.String list)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIST$0);
                }
                target.setStringValue(list);
            }
        }
        
        /**
         * Sets (as xml) the "list" attribute
         */
        public void xsetList(org.apache.xmlbeans.XmlString list)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIST$0);
                }
                target.set(list);
            }
        }
        
        /**
         * Gets the "to-list" attribute
         */
        public java.lang.String getToList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOLIST$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "to-list" attribute
         */
        public org.apache.xmlbeans.XmlString xgetToList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOLIST$2);
                return target;
            }
        }
        
        /**
         * True if has "to-list" attribute
         */
        public boolean isSetToList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TOLIST$2) != null;
            }
        }
        
        /**
         * Sets the "to-list" attribute
         */
        public void setToList(java.lang.String toList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOLIST$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOLIST$2);
                }
                target.setStringValue(toList);
            }
        }
        
        /**
         * Sets (as xml) the "to-list" attribute
         */
        public void xsetToList(org.apache.xmlbeans.XmlString toList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOLIST$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOLIST$2);
                }
                target.set(toList);
            }
        }
        
        /**
         * Unsets the "to-list" attribute
         */
        public void unsetToList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TOLIST$2);
            }
        }
        
        /**
         * Gets the "order-by-list" attribute
         */
        public java.lang.String getOrderByList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDERBYLIST$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "order-by-list" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOrderByList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORDERBYLIST$4);
                return target;
            }
        }
        
        /**
         * Sets the "order-by-list" attribute
         */
        public void setOrderByList(java.lang.String orderByList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDERBYLIST$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORDERBYLIST$4);
                }
                target.setStringValue(orderByList);
            }
        }
        
        /**
         * Sets (as xml) the "order-by-list" attribute
         */
        public void xsetOrderByList(org.apache.xmlbeans.XmlString orderByList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORDERBYLIST$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORDERBYLIST$4);
                }
                target.set(orderByList);
            }
        }
    }
}
