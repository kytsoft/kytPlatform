/*
 * An XML document type.
 * Localname: jndi-jdbc
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.JndiJdbcDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig.impl;
/**
 * A document containing one jndi-jdbc(@) element.
 *
 * This is a complex type.
 */
public class JndiJdbcDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.JndiJdbcDocument
{
    private static final long serialVersionUID = 1L;
    
    public JndiJdbcDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JNDIJDBC$0 = 
        new javax.xml.namespace.QName("", "jndi-jdbc");
    
    
    /**
     * Gets the "jndi-jdbc" element
     */
    public com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc getJndiJdbc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc target = null;
            target = (com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc)get_store().find_element_user(JNDIJDBC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "jndi-jdbc" element
     */
    public void setJndiJdbc(com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc jndiJdbc)
    {
        generatedSetterHelperImpl(jndiJdbc, JNDIJDBC$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "jndi-jdbc" element
     */
    public com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc addNewJndiJdbc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc target = null;
            target = (com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc)get_store().add_element_user(JNDIJDBC$0);
            return target;
        }
    }
    /**
     * An XML jndi-jdbc(@).
     *
     * This is a complex type.
     */
    public static class JndiJdbcImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc
    {
        private static final long serialVersionUID = 1L;
        
        public JndiJdbcImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName JNDISERVERNAME$0 = 
            new javax.xml.namespace.QName("", "jndi-server-name");
        private static final javax.xml.namespace.QName JNDINAME$2 = 
            new javax.xml.namespace.QName("", "jndi-name");
        private static final javax.xml.namespace.QName ISOLATIONLEVEL$4 = 
            new javax.xml.namespace.QName("", "isolation-level");
        
        
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
        
        /**
         * Gets the "isolation-level" attribute
         */
        public com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel.Enum getIsolationLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISOLATIONLEVEL$4);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "isolation-level" attribute
         */
        public com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel xgetIsolationLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel target = null;
                target = (com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel)get_store().find_attribute_user(ISOLATIONLEVEL$4);
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
                return get_store().find_attribute_user(ISOLATIONLEVEL$4) != null;
            }
        }
        
        /**
         * Sets the "isolation-level" attribute
         */
        public void setIsolationLevel(com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel.Enum isolationLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISOLATIONLEVEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISOLATIONLEVEL$4);
                }
                target.setEnumValue(isolationLevel);
            }
        }
        
        /**
         * Sets (as xml) the "isolation-level" attribute
         */
        public void xsetIsolationLevel(com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel isolationLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel target = null;
                target = (com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel)get_store().find_attribute_user(ISOLATIONLEVEL$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel)get_store().add_attribute_user(ISOLATIONLEVEL$4);
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
                get_store().remove_attribute(ISOLATIONLEVEL$4);
            }
        }
        /**
         * An XML isolation-level(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityconfig.JndiJdbcDocument$JndiJdbc$IsolationLevel.
         */
        public static class IsolationLevelImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel
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
