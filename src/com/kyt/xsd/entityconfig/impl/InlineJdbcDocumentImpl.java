/*
 * An XML document type.
 * Localname: inline-jdbc
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.InlineJdbcDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig.impl;
/**
 * A document containing one inline-jdbc(@) element.
 *
 * This is a complex type.
 */
public class InlineJdbcDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.InlineJdbcDocument
{
    private static final long serialVersionUID = 1L;
    
    public InlineJdbcDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INLINEJDBC$0 = 
        new javax.xml.namespace.QName("", "inline-jdbc");
    
    
    /**
     * Gets the "inline-jdbc" element
     */
    public com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc getInlineJdbc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc target = null;
            target = (com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc)get_store().find_element_user(INLINEJDBC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "inline-jdbc" element
     */
    public void setInlineJdbc(com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc inlineJdbc)
    {
        generatedSetterHelperImpl(inlineJdbc, INLINEJDBC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "inline-jdbc" element
     */
    public com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc addNewInlineJdbc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc target = null;
            target = (com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc)get_store().add_element_user(INLINEJDBC$0);
            return target;
        }
    }
    /**
     * An XML inline-jdbc(@).
     *
     * This is a complex type.
     */
    public static class InlineJdbcImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc
    {
        private static final long serialVersionUID = 1L;
        
        public InlineJdbcImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName JDBCDRIVER$0 = 
            new javax.xml.namespace.QName("", "jdbc-driver");
        private static final javax.xml.namespace.QName JDBCURI$2 = 
            new javax.xml.namespace.QName("", "jdbc-uri");
        private static final javax.xml.namespace.QName JDBCUSERNAME$4 = 
            new javax.xml.namespace.QName("", "jdbc-username");
        private static final javax.xml.namespace.QName JDBCPASSWORD$6 = 
            new javax.xml.namespace.QName("", "jdbc-password");
        private static final javax.xml.namespace.QName ISOLATIONLEVEL$8 = 
            new javax.xml.namespace.QName("", "isolation-level");
        private static final javax.xml.namespace.QName POOLMAXSIZE$10 = 
            new javax.xml.namespace.QName("", "pool-maxsize");
        private static final javax.xml.namespace.QName POOLMINSIZE$12 = 
            new javax.xml.namespace.QName("", "pool-minsize");
        private static final javax.xml.namespace.QName IDLEMAXSIZE$14 = 
            new javax.xml.namespace.QName("", "idle-maxsize");
        private static final javax.xml.namespace.QName TIMEBETWEENEVICTIONRUNSMILLIS$16 = 
            new javax.xml.namespace.QName("", "time-between-eviction-runs-millis");
        private static final javax.xml.namespace.QName POOLSLEEPTIME$18 = 
            new javax.xml.namespace.QName("", "pool-sleeptime");
        private static final javax.xml.namespace.QName POOLLIFETIME$20 = 
            new javax.xml.namespace.QName("", "pool-lifetime");
        private static final javax.xml.namespace.QName POOLDEADLOCKMAXWAIT$22 = 
            new javax.xml.namespace.QName("", "pool-deadlock-maxwait");
        private static final javax.xml.namespace.QName POOLDEADLOCKRETRYWAIT$24 = 
            new javax.xml.namespace.QName("", "pool-deadlock-retrywait");
        private static final javax.xml.namespace.QName POOLJDBCTESTSTMT$26 = 
            new javax.xml.namespace.QName("", "pool-jdbc-test-stmt");
        private static final javax.xml.namespace.QName POOLXAWRAPPERCLASS$28 = 
            new javax.xml.namespace.QName("", "pool-xa-wrapper-class");
        
        
        /**
         * Gets the "jdbc-driver" attribute
         */
        public java.lang.String getJdbcDriver()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JDBCDRIVER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jdbc-driver" attribute
         */
        public org.apache.xmlbeans.XmlString xgetJdbcDriver()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JDBCDRIVER$0);
                return target;
            }
        }
        
        /**
         * Sets the "jdbc-driver" attribute
         */
        public void setJdbcDriver(java.lang.String jdbcDriver)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JDBCDRIVER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JDBCDRIVER$0);
                }
                target.setStringValue(jdbcDriver);
            }
        }
        
        /**
         * Sets (as xml) the "jdbc-driver" attribute
         */
        public void xsetJdbcDriver(org.apache.xmlbeans.XmlString jdbcDriver)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JDBCDRIVER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JDBCDRIVER$0);
                }
                target.set(jdbcDriver);
            }
        }
        
        /**
         * Gets the "jdbc-uri" attribute
         */
        public java.lang.String getJdbcUri()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JDBCURI$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jdbc-uri" attribute
         */
        public org.apache.xmlbeans.XmlString xgetJdbcUri()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JDBCURI$2);
                return target;
            }
        }
        
        /**
         * Sets the "jdbc-uri" attribute
         */
        public void setJdbcUri(java.lang.String jdbcUri)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JDBCURI$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JDBCURI$2);
                }
                target.setStringValue(jdbcUri);
            }
        }
        
        /**
         * Sets (as xml) the "jdbc-uri" attribute
         */
        public void xsetJdbcUri(org.apache.xmlbeans.XmlString jdbcUri)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JDBCURI$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JDBCURI$2);
                }
                target.set(jdbcUri);
            }
        }
        
        /**
         * Gets the "jdbc-username" attribute
         */
        public java.lang.String getJdbcUsername()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JDBCUSERNAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jdbc-username" attribute
         */
        public org.apache.xmlbeans.XmlString xgetJdbcUsername()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JDBCUSERNAME$4);
                return target;
            }
        }
        
        /**
         * Sets the "jdbc-username" attribute
         */
        public void setJdbcUsername(java.lang.String jdbcUsername)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JDBCUSERNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JDBCUSERNAME$4);
                }
                target.setStringValue(jdbcUsername);
            }
        }
        
        /**
         * Sets (as xml) the "jdbc-username" attribute
         */
        public void xsetJdbcUsername(org.apache.xmlbeans.XmlString jdbcUsername)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JDBCUSERNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JDBCUSERNAME$4);
                }
                target.set(jdbcUsername);
            }
        }
        
        /**
         * Gets the "jdbc-password" attribute
         */
        public java.lang.String getJdbcPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JDBCPASSWORD$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "jdbc-password" attribute
         */
        public org.apache.xmlbeans.XmlString xgetJdbcPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JDBCPASSWORD$6);
                return target;
            }
        }
        
        /**
         * Sets the "jdbc-password" attribute
         */
        public void setJdbcPassword(java.lang.String jdbcPassword)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JDBCPASSWORD$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JDBCPASSWORD$6);
                }
                target.setStringValue(jdbcPassword);
            }
        }
        
        /**
         * Sets (as xml) the "jdbc-password" attribute
         */
        public void xsetJdbcPassword(org.apache.xmlbeans.XmlString jdbcPassword)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(JDBCPASSWORD$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(JDBCPASSWORD$6);
                }
                target.set(jdbcPassword);
            }
        }
        
        /**
         * Gets the "isolation-level" attribute
         */
        public com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel.Enum getIsolationLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISOLATIONLEVEL$8);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "isolation-level" attribute
         */
        public com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel xgetIsolationLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel target = null;
                target = (com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel)get_store().find_attribute_user(ISOLATIONLEVEL$8);
                return target;
            }
        }
        
        /**
         * True if has "isolation-level" attribute
         */
        public boolean isSetIsolationLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ISOLATIONLEVEL$8) != null;
            }
        }
        
        /**
         * Sets the "isolation-level" attribute
         */
        public void setIsolationLevel(com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel.Enum isolationLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISOLATIONLEVEL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISOLATIONLEVEL$8);
                }
                target.setEnumValue(isolationLevel);
            }
        }
        
        /**
         * Sets (as xml) the "isolation-level" attribute
         */
        public void xsetIsolationLevel(com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel isolationLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel target = null;
                target = (com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel)get_store().find_attribute_user(ISOLATIONLEVEL$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel)get_store().add_attribute_user(ISOLATIONLEVEL$8);
                }
                target.set(isolationLevel);
            }
        }
        
        /**
         * Unsets the "isolation-level" attribute
         */
        public void unsetIsolationLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ISOLATIONLEVEL$8);
            }
        }
        
        /**
         * Gets the "pool-maxsize" attribute
         */
        public java.math.BigInteger getPoolMaxsize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLMAXSIZE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(POOLMAXSIZE$10);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "pool-maxsize" attribute
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetPoolMaxsize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(POOLMAXSIZE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(POOLMAXSIZE$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "pool-maxsize" attribute
         */
        public boolean isSetPoolMaxsize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POOLMAXSIZE$10) != null;
            }
        }
        
        /**
         * Sets the "pool-maxsize" attribute
         */
        public void setPoolMaxsize(java.math.BigInteger poolMaxsize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLMAXSIZE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLMAXSIZE$10);
                }
                target.setBigIntegerValue(poolMaxsize);
            }
        }
        
        /**
         * Sets (as xml) the "pool-maxsize" attribute
         */
        public void xsetPoolMaxsize(org.apache.xmlbeans.XmlNonNegativeInteger poolMaxsize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(POOLMAXSIZE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(POOLMAXSIZE$10);
                }
                target.set(poolMaxsize);
            }
        }
        
        /**
         * Unsets the "pool-maxsize" attribute
         */
        public void unsetPoolMaxsize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POOLMAXSIZE$10);
            }
        }
        
        /**
         * Gets the "pool-minsize" attribute
         */
        public java.math.BigInteger getPoolMinsize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLMINSIZE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(POOLMINSIZE$12);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "pool-minsize" attribute
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetPoolMinsize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(POOLMINSIZE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(POOLMINSIZE$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "pool-minsize" attribute
         */
        public boolean isSetPoolMinsize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POOLMINSIZE$12) != null;
            }
        }
        
        /**
         * Sets the "pool-minsize" attribute
         */
        public void setPoolMinsize(java.math.BigInteger poolMinsize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLMINSIZE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLMINSIZE$12);
                }
                target.setBigIntegerValue(poolMinsize);
            }
        }
        
        /**
         * Sets (as xml) the "pool-minsize" attribute
         */
        public void xsetPoolMinsize(org.apache.xmlbeans.XmlNonNegativeInteger poolMinsize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(POOLMINSIZE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(POOLMINSIZE$12);
                }
                target.set(poolMinsize);
            }
        }
        
        /**
         * Unsets the "pool-minsize" attribute
         */
        public void unsetPoolMinsize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POOLMINSIZE$12);
            }
        }
        
        /**
         * Gets the "idle-maxsize" attribute
         */
        public java.math.BigInteger getIdleMaxsize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDLEMAXSIZE$14);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "idle-maxsize" attribute
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetIdleMaxsize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(IDLEMAXSIZE$14);
                return target;
            }
        }
        
        /**
         * True if has "idle-maxsize" attribute
         */
        public boolean isSetIdleMaxsize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IDLEMAXSIZE$14) != null;
            }
        }
        
        /**
         * Sets the "idle-maxsize" attribute
         */
        public void setIdleMaxsize(java.math.BigInteger idleMaxsize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDLEMAXSIZE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDLEMAXSIZE$14);
                }
                target.setBigIntegerValue(idleMaxsize);
            }
        }
        
        /**
         * Sets (as xml) the "idle-maxsize" attribute
         */
        public void xsetIdleMaxsize(org.apache.xmlbeans.XmlNonNegativeInteger idleMaxsize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(IDLEMAXSIZE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(IDLEMAXSIZE$14);
                }
                target.set(idleMaxsize);
            }
        }
        
        /**
         * Unsets the "idle-maxsize" attribute
         */
        public void unsetIdleMaxsize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IDLEMAXSIZE$14);
            }
        }
        
        /**
         * Gets the "time-between-eviction-runs-millis" attribute
         */
        public java.math.BigInteger getTimeBetweenEvictionRunsMillis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEBETWEENEVICTIONRUNSMILLIS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TIMEBETWEENEVICTIONRUNSMILLIS$16);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "time-between-eviction-runs-millis" attribute
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetTimeBetweenEvictionRunsMillis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(TIMEBETWEENEVICTIONRUNSMILLIS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(TIMEBETWEENEVICTIONRUNSMILLIS$16);
                }
                return target;
            }
        }
        
        /**
         * True if has "time-between-eviction-runs-millis" attribute
         */
        public boolean isSetTimeBetweenEvictionRunsMillis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMEBETWEENEVICTIONRUNSMILLIS$16) != null;
            }
        }
        
        /**
         * Sets the "time-between-eviction-runs-millis" attribute
         */
        public void setTimeBetweenEvictionRunsMillis(java.math.BigInteger timeBetweenEvictionRunsMillis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TIMEBETWEENEVICTIONRUNSMILLIS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TIMEBETWEENEVICTIONRUNSMILLIS$16);
                }
                target.setBigIntegerValue(timeBetweenEvictionRunsMillis);
            }
        }
        
        /**
         * Sets (as xml) the "time-between-eviction-runs-millis" attribute
         */
        public void xsetTimeBetweenEvictionRunsMillis(org.apache.xmlbeans.XmlNonNegativeInteger timeBetweenEvictionRunsMillis)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(TIMEBETWEENEVICTIONRUNSMILLIS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(TIMEBETWEENEVICTIONRUNSMILLIS$16);
                }
                target.set(timeBetweenEvictionRunsMillis);
            }
        }
        
        /**
         * Unsets the "time-between-eviction-runs-millis" attribute
         */
        public void unsetTimeBetweenEvictionRunsMillis()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMEBETWEENEVICTIONRUNSMILLIS$16);
            }
        }
        
        /**
         * Gets the "pool-sleeptime" attribute
         */
        public java.math.BigInteger getPoolSleeptime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLSLEEPTIME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(POOLSLEEPTIME$18);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "pool-sleeptime" attribute
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetPoolSleeptime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(POOLSLEEPTIME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(POOLSLEEPTIME$18);
                }
                return target;
            }
        }
        
        /**
         * True if has "pool-sleeptime" attribute
         */
        public boolean isSetPoolSleeptime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POOLSLEEPTIME$18) != null;
            }
        }
        
        /**
         * Sets the "pool-sleeptime" attribute
         */
        public void setPoolSleeptime(java.math.BigInteger poolSleeptime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLSLEEPTIME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLSLEEPTIME$18);
                }
                target.setBigIntegerValue(poolSleeptime);
            }
        }
        
        /**
         * Sets (as xml) the "pool-sleeptime" attribute
         */
        public void xsetPoolSleeptime(org.apache.xmlbeans.XmlNonNegativeInteger poolSleeptime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(POOLSLEEPTIME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(POOLSLEEPTIME$18);
                }
                target.set(poolSleeptime);
            }
        }
        
        /**
         * Unsets the "pool-sleeptime" attribute
         */
        public void unsetPoolSleeptime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POOLSLEEPTIME$18);
            }
        }
        
        /**
         * Gets the "pool-lifetime" attribute
         */
        public java.math.BigInteger getPoolLifetime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLLIFETIME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(POOLLIFETIME$20);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "pool-lifetime" attribute
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetPoolLifetime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(POOLLIFETIME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(POOLLIFETIME$20);
                }
                return target;
            }
        }
        
        /**
         * True if has "pool-lifetime" attribute
         */
        public boolean isSetPoolLifetime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POOLLIFETIME$20) != null;
            }
        }
        
        /**
         * Sets the "pool-lifetime" attribute
         */
        public void setPoolLifetime(java.math.BigInteger poolLifetime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLLIFETIME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLLIFETIME$20);
                }
                target.setBigIntegerValue(poolLifetime);
            }
        }
        
        /**
         * Sets (as xml) the "pool-lifetime" attribute
         */
        public void xsetPoolLifetime(org.apache.xmlbeans.XmlNonNegativeInteger poolLifetime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(POOLLIFETIME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(POOLLIFETIME$20);
                }
                target.set(poolLifetime);
            }
        }
        
        /**
         * Unsets the "pool-lifetime" attribute
         */
        public void unsetPoolLifetime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POOLLIFETIME$20);
            }
        }
        
        /**
         * Gets the "pool-deadlock-maxwait" attribute
         */
        public java.math.BigInteger getPoolDeadlockMaxwait()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLDEADLOCKMAXWAIT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(POOLDEADLOCKMAXWAIT$22);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "pool-deadlock-maxwait" attribute
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetPoolDeadlockMaxwait()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(POOLDEADLOCKMAXWAIT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(POOLDEADLOCKMAXWAIT$22);
                }
                return target;
            }
        }
        
        /**
         * True if has "pool-deadlock-maxwait" attribute
         */
        public boolean isSetPoolDeadlockMaxwait()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POOLDEADLOCKMAXWAIT$22) != null;
            }
        }
        
        /**
         * Sets the "pool-deadlock-maxwait" attribute
         */
        public void setPoolDeadlockMaxwait(java.math.BigInteger poolDeadlockMaxwait)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLDEADLOCKMAXWAIT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLDEADLOCKMAXWAIT$22);
                }
                target.setBigIntegerValue(poolDeadlockMaxwait);
            }
        }
        
        /**
         * Sets (as xml) the "pool-deadlock-maxwait" attribute
         */
        public void xsetPoolDeadlockMaxwait(org.apache.xmlbeans.XmlNonNegativeInteger poolDeadlockMaxwait)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(POOLDEADLOCKMAXWAIT$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(POOLDEADLOCKMAXWAIT$22);
                }
                target.set(poolDeadlockMaxwait);
            }
        }
        
        /**
         * Unsets the "pool-deadlock-maxwait" attribute
         */
        public void unsetPoolDeadlockMaxwait()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POOLDEADLOCKMAXWAIT$22);
            }
        }
        
        /**
         * Gets the "pool-deadlock-retrywait" attribute
         */
        public java.math.BigInteger getPoolDeadlockRetrywait()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLDEADLOCKRETRYWAIT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(POOLDEADLOCKRETRYWAIT$24);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "pool-deadlock-retrywait" attribute
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetPoolDeadlockRetrywait()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(POOLDEADLOCKRETRYWAIT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_default_attribute_value(POOLDEADLOCKRETRYWAIT$24);
                }
                return target;
            }
        }
        
        /**
         * True if has "pool-deadlock-retrywait" attribute
         */
        public boolean isSetPoolDeadlockRetrywait()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POOLDEADLOCKRETRYWAIT$24) != null;
            }
        }
        
        /**
         * Sets the "pool-deadlock-retrywait" attribute
         */
        public void setPoolDeadlockRetrywait(java.math.BigInteger poolDeadlockRetrywait)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLDEADLOCKRETRYWAIT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLDEADLOCKRETRYWAIT$24);
                }
                target.setBigIntegerValue(poolDeadlockRetrywait);
            }
        }
        
        /**
         * Sets (as xml) the "pool-deadlock-retrywait" attribute
         */
        public void xsetPoolDeadlockRetrywait(org.apache.xmlbeans.XmlNonNegativeInteger poolDeadlockRetrywait)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(POOLDEADLOCKRETRYWAIT$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(POOLDEADLOCKRETRYWAIT$24);
                }
                target.set(poolDeadlockRetrywait);
            }
        }
        
        /**
         * Unsets the "pool-deadlock-retrywait" attribute
         */
        public void unsetPoolDeadlockRetrywait()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POOLDEADLOCKRETRYWAIT$24);
            }
        }
        
        /**
         * Gets the "pool-jdbc-test-stmt" attribute
         */
        public java.lang.String getPoolJdbcTestStmt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLJDBCTESTSTMT$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pool-jdbc-test-stmt" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPoolJdbcTestStmt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLJDBCTESTSTMT$26);
                return target;
            }
        }
        
        /**
         * True if has "pool-jdbc-test-stmt" attribute
         */
        public boolean isSetPoolJdbcTestStmt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POOLJDBCTESTSTMT$26) != null;
            }
        }
        
        /**
         * Sets the "pool-jdbc-test-stmt" attribute
         */
        public void setPoolJdbcTestStmt(java.lang.String poolJdbcTestStmt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLJDBCTESTSTMT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLJDBCTESTSTMT$26);
                }
                target.setStringValue(poolJdbcTestStmt);
            }
        }
        
        /**
         * Sets (as xml) the "pool-jdbc-test-stmt" attribute
         */
        public void xsetPoolJdbcTestStmt(org.apache.xmlbeans.XmlString poolJdbcTestStmt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLJDBCTESTSTMT$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POOLJDBCTESTSTMT$26);
                }
                target.set(poolJdbcTestStmt);
            }
        }
        
        /**
         * Unsets the "pool-jdbc-test-stmt" attribute
         */
        public void unsetPoolJdbcTestStmt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POOLJDBCTESTSTMT$26);
            }
        }
        
        /**
         * Gets the "pool-xa-wrapper-class" attribute
         */
        public java.lang.String getPoolXaWrapperClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLXAWRAPPERCLASS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(POOLXAWRAPPERCLASS$28);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "pool-xa-wrapper-class" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPoolXaWrapperClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLXAWRAPPERCLASS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(POOLXAWRAPPERCLASS$28);
                }
                return target;
            }
        }
        
        /**
         * True if has "pool-xa-wrapper-class" attribute
         */
        public boolean isSetPoolXaWrapperClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POOLXAWRAPPERCLASS$28) != null;
            }
        }
        
        /**
         * Sets the "pool-xa-wrapper-class" attribute
         */
        public void setPoolXaWrapperClass(java.lang.String poolXaWrapperClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POOLXAWRAPPERCLASS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POOLXAWRAPPERCLASS$28);
                }
                target.setStringValue(poolXaWrapperClass);
            }
        }
        
        /**
         * Sets (as xml) the "pool-xa-wrapper-class" attribute
         */
        public void xsetPoolXaWrapperClass(org.apache.xmlbeans.XmlString poolXaWrapperClass)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POOLXAWRAPPERCLASS$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POOLXAWRAPPERCLASS$28);
                }
                target.set(poolXaWrapperClass);
            }
        }
        
        /**
         * Unsets the "pool-xa-wrapper-class" attribute
         */
        public void unsetPoolXaWrapperClass()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POOLXAWRAPPERCLASS$28);
            }
        }
        /**
         * An XML isolation-level(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityconfig.InlineJdbcDocument$InlineJdbc$IsolationLevel.
         */
        public static class IsolationLevelImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel
        {
            private static final long serialVersionUID = 1L;
            
            public IsolationLevelImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected IsolationLevelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
