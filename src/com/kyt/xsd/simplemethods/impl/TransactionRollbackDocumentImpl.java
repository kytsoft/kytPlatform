/*
 * An XML document type.
 * Localname: transaction-rollback
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.TransactionRollbackDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one transaction-rollback(@) element.
 *
 * This is a complex type.
 */
public class TransactionRollbackDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityTxOperationsDocumentImpl implements com.kyt.xsd.simplemethods.TransactionRollbackDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransactionRollbackDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONROLLBACK$0 = 
        new javax.xml.namespace.QName("", "transaction-rollback");
    
    
    /**
     * Gets the "transaction-rollback" element
     */
    public com.kyt.xsd.simplemethods.TransactionRollbackDocument.TransactionRollback getTransactionRollback()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.TransactionRollbackDocument.TransactionRollback target = null;
            target = (com.kyt.xsd.simplemethods.TransactionRollbackDocument.TransactionRollback)get_store().find_element_user(TRANSACTIONROLLBACK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "transaction-rollback" element
     */
    public void setTransactionRollback(com.kyt.xsd.simplemethods.TransactionRollbackDocument.TransactionRollback transactionRollback)
    {
        generatedSetterHelperImpl(transactionRollback, TRANSACTIONROLLBACK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "transaction-rollback" element
     */
    public com.kyt.xsd.simplemethods.TransactionRollbackDocument.TransactionRollback addNewTransactionRollback()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.TransactionRollbackDocument.TransactionRollback target = null;
            target = (com.kyt.xsd.simplemethods.TransactionRollbackDocument.TransactionRollback)get_store().add_element_user(TRANSACTIONROLLBACK$0);
            return target;
        }
    }
    /**
     * An XML transaction-rollback(@).
     *
     * This is a complex type.
     */
    public static class TransactionRollbackImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.TransactionRollbackDocument.TransactionRollback
    {
        private static final long serialVersionUID = 1L;
        
        public TransactionRollbackImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BEGANTRANSACTIONNAME$0 = 
            new javax.xml.namespace.QName("", "began-transaction-name");
        
        
        /**
         * Gets the "began-transaction-name" attribute
         */
        public java.lang.String getBeganTransactionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEGANTRANSACTIONNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BEGANTRANSACTIONNAME$0);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "began-transaction-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetBeganTransactionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BEGANTRANSACTIONNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(BEGANTRANSACTIONNAME$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "began-transaction-name" attribute
         */
        public boolean isSetBeganTransactionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BEGANTRANSACTIONNAME$0) != null;
            }
        }
        
        /**
         * Sets the "began-transaction-name" attribute
         */
        public void setBeganTransactionName(java.lang.String beganTransactionName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BEGANTRANSACTIONNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BEGANTRANSACTIONNAME$0);
                }
                target.setStringValue(beganTransactionName);
            }
        }
        
        /**
         * Sets (as xml) the "began-transaction-name" attribute
         */
        public void xsetBeganTransactionName(org.apache.xmlbeans.XmlString beganTransactionName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BEGANTRANSACTIONNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BEGANTRANSACTIONNAME$0);
                }
                target.set(beganTransactionName);
            }
        }
        
        /**
         * Unsets the "began-transaction-name" attribute
         */
        public void unsetBeganTransactionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BEGANTRANSACTIONNAME$0);
            }
        }
    }
}
