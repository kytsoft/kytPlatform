/*
 * An XML document type.
 * Localname: user-transaction-jndi
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.UserTransactionJndiDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig.impl;
/**
 * A document containing one user-transaction-jndi(@) element.
 *
 * This is a complex type.
 */
public class UserTransactionJndiDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.UserTransactionJndiDocument
{
    private static final long serialVersionUID = 1L;
    
    public UserTransactionJndiDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERTRANSACTIONJNDI$0 = 
        new javax.xml.namespace.QName("", "user-transaction-jndi");
    
    
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
     * An XML user-transaction-jndi(@).
     *
     * This is a complex type.
     */
    public static class UserTransactionJndiImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.UserTransactionJndiDocument.UserTransactionJndi
    {
        private static final long serialVersionUID = 1L;
        
        public UserTransactionJndiImpl(org.apache.xmlbeans.SchemaType sType)
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
