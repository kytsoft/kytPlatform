/*
 * An XML document type.
 * Localname: jndi-server
 * Namespace: 
 * Java type: com.kyt.xsd.jndiconfig.JndiServerDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.jndiconfig.impl;
/**
 * A document containing one jndi-server(@) element.
 *
 * This is a complex type.
 */
public class JndiServerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.jndiconfig.JndiServerDocument
{
    private static final long serialVersionUID = 1L;
    
    public JndiServerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JNDISERVER$0 = 
        new javax.xml.namespace.QName("", "jndi-server");
    
    
    /**
     * Gets the "jndi-server" element
     */
    public com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer getJndiServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer target = null;
            target = (com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer)get_store().find_element_user(JNDISERVER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "jndi-server" element
     */
    public void setJndiServer(com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer jndiServer)
    {
        generatedSetterHelperImpl(jndiServer, JNDISERVER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "jndi-server" element
     */
    public com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer addNewJndiServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer target = null;
            target = (com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer)get_store().add_element_user(JNDISERVER$0);
            return target;
        }
    }
    /**
     * An XML jndi-server(@).
     *
     * This is a complex type.
     */
    public static class JndiServerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer
    {
        private static final long serialVersionUID = 1L;
        
        public JndiServerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName CONTEXTPROVIDERURL$2 = 
            new javax.xml.namespace.QName("", "context-provider-url");
        private static final javax.xml.namespace.QName INITIALCONTEXTFACTORY$4 = 
            new javax.xml.namespace.QName("", "initial-context-factory");
        private static final javax.xml.namespace.QName URLPKGPREFIXES$6 = 
            new javax.xml.namespace.QName("", "url-pkg-prefixes");
        private static final javax.xml.namespace.QName SECURITYPRINCIPAL$8 = 
            new javax.xml.namespace.QName("", "security-principal");
        private static final javax.xml.namespace.QName SECURITYCREDENTIALS$10 = 
            new javax.xml.namespace.QName("", "security-credentials");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "context-provider-url" attribute
         */
        public java.lang.String getContextProviderUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTPROVIDERURL$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "context-provider-url" attribute
         */
        public org.apache.xmlbeans.XmlString xgetContextProviderUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTEXTPROVIDERURL$2);
                return target;
            }
        }
        
        /**
         * True if has "context-provider-url" attribute
         */
        public boolean isSetContextProviderUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONTEXTPROVIDERURL$2) != null;
            }
        }
        
        /**
         * Sets the "context-provider-url" attribute
         */
        public void setContextProviderUrl(java.lang.String contextProviderUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTPROVIDERURL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTEXTPROVIDERURL$2);
                }
                target.setStringValue(contextProviderUrl);
            }
        }
        
        /**
         * Sets (as xml) the "context-provider-url" attribute
         */
        public void xsetContextProviderUrl(org.apache.xmlbeans.XmlString contextProviderUrl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTEXTPROVIDERURL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONTEXTPROVIDERURL$2);
                }
                target.set(contextProviderUrl);
            }
        }
        
        /**
         * Unsets the "context-provider-url" attribute
         */
        public void unsetContextProviderUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONTEXTPROVIDERURL$2);
            }
        }
        
        /**
         * Gets the "initial-context-factory" attribute
         */
        public java.lang.String getInitialContextFactory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITIALCONTEXTFACTORY$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "initial-context-factory" attribute
         */
        public org.apache.xmlbeans.XmlString xgetInitialContextFactory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INITIALCONTEXTFACTORY$4);
                return target;
            }
        }
        
        /**
         * True if has "initial-context-factory" attribute
         */
        public boolean isSetInitialContextFactory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INITIALCONTEXTFACTORY$4) != null;
            }
        }
        
        /**
         * Sets the "initial-context-factory" attribute
         */
        public void setInitialContextFactory(java.lang.String initialContextFactory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INITIALCONTEXTFACTORY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INITIALCONTEXTFACTORY$4);
                }
                target.setStringValue(initialContextFactory);
            }
        }
        
        /**
         * Sets (as xml) the "initial-context-factory" attribute
         */
        public void xsetInitialContextFactory(org.apache.xmlbeans.XmlString initialContextFactory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INITIALCONTEXTFACTORY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INITIALCONTEXTFACTORY$4);
                }
                target.set(initialContextFactory);
            }
        }
        
        /**
         * Unsets the "initial-context-factory" attribute
         */
        public void unsetInitialContextFactory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INITIALCONTEXTFACTORY$4);
            }
        }
        
        /**
         * Gets the "url-pkg-prefixes" attribute
         */
        public java.lang.String getUrlPkgPrefixes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URLPKGPREFIXES$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "url-pkg-prefixes" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUrlPkgPrefixes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URLPKGPREFIXES$6);
                return target;
            }
        }
        
        /**
         * True if has "url-pkg-prefixes" attribute
         */
        public boolean isSetUrlPkgPrefixes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(URLPKGPREFIXES$6) != null;
            }
        }
        
        /**
         * Sets the "url-pkg-prefixes" attribute
         */
        public void setUrlPkgPrefixes(java.lang.String urlPkgPrefixes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URLPKGPREFIXES$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URLPKGPREFIXES$6);
                }
                target.setStringValue(urlPkgPrefixes);
            }
        }
        
        /**
         * Sets (as xml) the "url-pkg-prefixes" attribute
         */
        public void xsetUrlPkgPrefixes(org.apache.xmlbeans.XmlString urlPkgPrefixes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URLPKGPREFIXES$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URLPKGPREFIXES$6);
                }
                target.set(urlPkgPrefixes);
            }
        }
        
        /**
         * Unsets the "url-pkg-prefixes" attribute
         */
        public void unsetUrlPkgPrefixes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(URLPKGPREFIXES$6);
            }
        }
        
        /**
         * Gets the "security-principal" attribute
         */
        public java.lang.String getSecurityPrincipal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECURITYPRINCIPAL$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "security-principal" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSecurityPrincipal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECURITYPRINCIPAL$8);
                return target;
            }
        }
        
        /**
         * True if has "security-principal" attribute
         */
        public boolean isSetSecurityPrincipal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SECURITYPRINCIPAL$8) != null;
            }
        }
        
        /**
         * Sets the "security-principal" attribute
         */
        public void setSecurityPrincipal(java.lang.String securityPrincipal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECURITYPRINCIPAL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SECURITYPRINCIPAL$8);
                }
                target.setStringValue(securityPrincipal);
            }
        }
        
        /**
         * Sets (as xml) the "security-principal" attribute
         */
        public void xsetSecurityPrincipal(org.apache.xmlbeans.XmlString securityPrincipal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECURITYPRINCIPAL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SECURITYPRINCIPAL$8);
                }
                target.set(securityPrincipal);
            }
        }
        
        /**
         * Unsets the "security-principal" attribute
         */
        public void unsetSecurityPrincipal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SECURITYPRINCIPAL$8);
            }
        }
        
        /**
         * Gets the "security-credentials" attribute
         */
        public java.lang.String getSecurityCredentials()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECURITYCREDENTIALS$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "security-credentials" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSecurityCredentials()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECURITYCREDENTIALS$10);
                return target;
            }
        }
        
        /**
         * True if has "security-credentials" attribute
         */
        public boolean isSetSecurityCredentials()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SECURITYCREDENTIALS$10) != null;
            }
        }
        
        /**
         * Sets the "security-credentials" attribute
         */
        public void setSecurityCredentials(java.lang.String securityCredentials)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECURITYCREDENTIALS$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SECURITYCREDENTIALS$10);
                }
                target.setStringValue(securityCredentials);
            }
        }
        
        /**
         * Sets (as xml) the "security-credentials" attribute
         */
        public void xsetSecurityCredentials(org.apache.xmlbeans.XmlString securityCredentials)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECURITYCREDENTIALS$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SECURITYCREDENTIALS$10);
                }
                target.set(securityCredentials);
            }
        }
        
        /**
         * Unsets the "security-credentials" attribute
         */
        public void unsetSecurityCredentials()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SECURITYCREDENTIALS$10);
            }
        }
    }
}
