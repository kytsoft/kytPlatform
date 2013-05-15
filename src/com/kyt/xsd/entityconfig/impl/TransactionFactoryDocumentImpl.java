/*
 * An XML document type.
 * Localname: transaction-factory
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.TransactionFactoryDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig.impl;
/**
 * A document containing one transaction-factory(@) element.
 *
 * This is a complex type.
 */
public class TransactionFactoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.TransactionFactoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransactionFactoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONFACTORY$0 = 
        new javax.xml.namespace.QName("", "transaction-factory");
    
    
    /**
     * Gets the "transaction-factory" element
     */
    public com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory getTransactionFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory target = null;
            target = (com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory)get_store().find_element_user(TRANSACTIONFACTORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "transaction-factory" element
     */
    public void setTransactionFactory(com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory transactionFactory)
    {
        generatedSetterHelperImpl(transactionFactory, TRANSACTIONFACTORY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "transaction-factory" element
     */
    public com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory addNewTransactionFactory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory target = null;
            target = (com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory)get_store().add_element_user(TRANSACTIONFACTORY$0);
            return target;
        }
    }
    /**
     * An XML transaction-factory(@).
     *
     * This is a complex type.
     */
    public static class TransactionFactoryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.TransactionFactoryDocument.TransactionFactory
    {
        private static final long serialVersionUID = 1L;
        
        public TransactionFactoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USERTRANSACTIONJNDI$0 = 
            new javax.xml.namespace.QName("", "user-transaction-jndi");
        private static final javax.xml.namespace.QName TRANSACTIONMANAGERJNDI$2 = 
            new javax.xml.namespace.QName("", "transaction-manager-jndi");
        private static final javax.xml.namespace.QName CLASS1$4 = 
            new javax.xml.namespace.QName("", "class");
        
        
        /**
         * Gets the "user-transaction-jndi" element
         */
        public com.kyt.xsd.entityconfig.UserTransactionJndiDocument.UserTransactionJndi getUserTransactionJndi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.UserTransactionJndiDocument.UserTransactionJndi target = null;
                target = (com.kyt.xsd.entityconfig.UserTransactionJndiDocument.UserTransactionJndi)get_store().find_element_user(USERTRANSACTIONJNDI$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "user-transaction-jndi" element
         */
        public boolean isSetUserTransactionJndi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(USERTRANSACTIONJNDI$0) != 0;
            }
        }
        
        /**
         * Sets the "user-transaction-jndi" element
         */
        public void setUserTransactionJndi(com.kyt.xsd.entityconfig.UserTransactionJndiDocument.UserTransactionJndi userTransactionJndi)
        {
            generatedSetterHelperImpl(userTransactionJndi, USERTRANSACTIONJNDI$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "user-transaction-jndi" element
         */
        public com.kyt.xsd.entityconfig.UserTransactionJndiDocument.UserTransactionJndi addNewUserTransactionJndi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.UserTransactionJndiDocument.UserTransactionJndi target = null;
                target = (com.kyt.xsd.entityconfig.UserTransactionJndiDocument.UserTransactionJndi)get_store().add_element_user(USERTRANSACTIONJNDI$0);
                return target;
            }
        }
        
        /**
         * Unsets the "user-transaction-jndi" element
         */
        public void unsetUserTransactionJndi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(USERTRANSACTIONJNDI$0, 0);
            }
        }
        
        /**
         * Gets the "transaction-manager-jndi" element
         */
        public com.kyt.xsd.entityconfig.TransactionManagerJndiDocument.TransactionManagerJndi getTransactionManagerJndi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.TransactionManagerJndiDocument.TransactionManagerJndi target = null;
                target = (com.kyt.xsd.entityconfig.TransactionManagerJndiDocument.TransactionManagerJndi)get_store().find_element_user(TRANSACTIONMANAGERJNDI$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "transaction-manager-jndi" element
         */
        public boolean isSetTransactionManagerJndi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANSACTIONMANAGERJNDI$2) != 0;
            }
        }
        
        /**
         * Sets the "transaction-manager-jndi" element
         */
        public void setTransactionManagerJndi(com.kyt.xsd.entityconfig.TransactionManagerJndiDocument.TransactionManagerJndi transactionManagerJndi)
        {
            generatedSetterHelperImpl(transactionManagerJndi, TRANSACTIONMANAGERJNDI$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "transaction-manager-jndi" element
         */
        public com.kyt.xsd.entityconfig.TransactionManagerJndiDocument.TransactionManagerJndi addNewTransactionManagerJndi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.TransactionManagerJndiDocument.TransactionManagerJndi target = null;
                target = (com.kyt.xsd.entityconfig.TransactionManagerJndiDocument.TransactionManagerJndi)get_store().add_element_user(TRANSACTIONMANAGERJNDI$2);
                return target;
            }
        }
        
        /**
         * Unsets the "transaction-manager-jndi" element
         */
        public void unsetTransactionManagerJndi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANSACTIONMANAGERJNDI$2, 0);
            }
        }
        
        /**
         * Gets the "class" attribute
         */
        public java.lang.String getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "class" attribute
         */
        public org.apache.xmlbeans.XmlString xgetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$4);
                return target;
            }
        }
        
        /**
         * Sets the "class" attribute
         */
        public void setClass1(java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$4);
                }
                target.setStringValue(class1);
            }
        }
        
        /**
         * Sets (as xml) the "class" attribute
         */
        public void xsetClass1(org.apache.xmlbeans.XmlString class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLASS1$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLASS1$4);
                }
                target.set(class1);
            }
        }
    }
}
