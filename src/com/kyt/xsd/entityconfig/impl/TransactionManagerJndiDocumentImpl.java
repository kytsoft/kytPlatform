/*
 * An XML document type.
 * Localname: transaction-manager-jndi
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.TransactionManagerJndiDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig.impl;
/**
 * A document containing one transaction-manager-jndi(@) element.
 *
 * This is a complex type.
 */
public class TransactionManagerJndiDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.TransactionManagerJndiDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransactionManagerJndiDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSACTIONMANAGERJNDI$0 = 
        new javax.xml.namespace.QName("", "transaction-manager-jndi");
    
    
    /**
     * Gets the "transaction-manager-jndi" element
     */
    public com.kyt.xsd.entityconfig.TransactionManagerJndiDocument.TransactionManagerJndi getTransactionManagerJndi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.TransactionManagerJndiDocument.TransactionManagerJndi target = null;
            target = (com.kyt.xsd.entityconfig.TransactionManagerJndiDocument.TransactionManagerJndi)get_store().find_element_user(TRANSACTIONMANAGERJNDI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "transaction-manager-jndi" element
     */
    public void setTransactionManagerJndi(com.kyt.xsd.entityconfig.TransactionManagerJndiDocument.TransactionManagerJndi transactionManagerJndi)
    {
        generatedSetterHelperImpl(transactionManagerJndi, TRANSACTIONMANAGERJNDI$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (com.kyt.xsd.entityconfig.TransactionManagerJndiDocument.TransactionManagerJndi)get_store().add_element_user(TRANSACTIONMANAGERJNDI$0);
            return target;
        }
    }
    /**
     * An XML transaction-manager-jndi(@).
     *
     * This is a complex type.
     */
    public static class TransactionManagerJndiImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.TransactionManagerJndiDocument.TransactionManagerJndi
    {
        private static final long serialVersionUID = 1L;
        
        public TransactionManagerJndiImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName JNDISERVERNAME$0 = 
            new javax.xml.namespace.QName("", "jndi-server-name");
        private static final javax.xml.namespace.QName JNDINAME$2 = 
            new javax.xml.namespace.QName("", "jndi-name");
        
        
        /**
         * Gets the "jndi-server-name" attribute
         */
        public java.lang.String getJndiServerName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JNDISERVERNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jndi-server-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetJndiServerName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JNDISERVERNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "jndi-server-name" attribute
         */
        public void setJndiServerName(java.lang.String jndiServerName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JNDISERVERNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JNDISERVERNAME$0);
                }
                target.setStringValue(jndiServerName);
            }
        }
        
        /**
         * Sets (as xml) the "jndi-server-name" attribute
         */
        public void xsetJndiServerName(org.apache.xmlbeans.XmlString jndiServerName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JNDISERVERNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JNDISERVERNAME$0);
                }
                target.set(jndiServerName);
            }
        }
        
        /**
         * Gets the "jndi-name" attribute
         */
        public java.lang.String getJndiName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JNDINAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jndi-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetJndiName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JNDINAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "jndi-name" attribute
         */
        public void setJndiName(java.lang.String jndiName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JNDINAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JNDINAME$2);
                }
                target.setStringValue(jndiName);
            }
        }
        
        /**
         * Sets (as xml) the "jndi-name" attribute
         */
        public void xsetJndiName(org.apache.xmlbeans.XmlString jndiName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JNDINAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JNDINAME$2);
                }
                target.set(jndiName);
            }
        }
    }
}
