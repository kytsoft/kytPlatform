/*
 * An XML document type.
 * Localname: security
 * Namespace: 
 * Java type: com.kyt.xsd.siteconf.SecurityDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.siteconf.impl;
/**
 * A document containing one security(@) element.
 *
 * This is a complex type.
 */
public class SecurityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.SecurityDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecurityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECURITY$0 = 
        new javax.xml.namespace.QName("", "security");
    
    
    /**
     * Gets the "security" element
     */
    public com.kyt.xsd.siteconf.SecurityDocument.Security getSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.SecurityDocument.Security target = null;
            target = (com.kyt.xsd.siteconf.SecurityDocument.Security)get_store().find_element_user(SECURITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "security" element
     */
    public void setSecurity(com.kyt.xsd.siteconf.SecurityDocument.Security security)
    {
        generatedSetterHelperImpl(security, SECURITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "security" element
     */
    public com.kyt.xsd.siteconf.SecurityDocument.Security addNewSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.SecurityDocument.Security target = null;
            target = (com.kyt.xsd.siteconf.SecurityDocument.Security)get_store().add_element_user(SECURITY$0);
            return target;
        }
    }
    /**
     * An XML security(@).
     *
     * This is a complex type.
     */
    public static class SecurityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.SecurityDocument.Security
    {
        private static final long serialVersionUID = 1L;
        
        public SecurityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HTTPS$0 = 
            new javax.xml.namespace.QName("", "https");
        private static final javax.xml.namespace.QName AUTH$2 = 
            new javax.xml.namespace.QName("", "auth");
        private static final javax.xml.namespace.QName CERT$4 = 
            new javax.xml.namespace.QName("", "cert");
        private static final javax.xml.namespace.QName EXTERNALVIEW$6 = 
            new javax.xml.namespace.QName("", "external-view");
        private static final javax.xml.namespace.QName DIRECTREQUEST$8 = 
            new javax.xml.namespace.QName("", "direct-request");
        
        
        /**
         * Gets the "https" attribute
         */
        public com.kyt.xsd.siteconf.SecurityDocument.Security.Https.Enum getHttps()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTTPS$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HTTPS$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.SecurityDocument.Security.Https.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "https" attribute
         */
        public com.kyt.xsd.siteconf.SecurityDocument.Security.Https xgetHttps()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.SecurityDocument.Security.Https target = null;
                target = (com.kyt.xsd.siteconf.SecurityDocument.Security.Https)get_store().find_attribute_user(HTTPS$0);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.SecurityDocument.Security.Https)get_default_attribute_value(HTTPS$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "https" attribute
         */
        public boolean isSetHttps()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HTTPS$0) != null;
            }
        }
        
        /**
         * Sets the "https" attribute
         */
        public void setHttps(com.kyt.xsd.siteconf.SecurityDocument.Security.Https.Enum https)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTTPS$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HTTPS$0);
                }
                target.setEnumValue(https);
            }
        }
        
        /**
         * Sets (as xml) the "https" attribute
         */
        public void xsetHttps(com.kyt.xsd.siteconf.SecurityDocument.Security.Https https)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.SecurityDocument.Security.Https target = null;
                target = (com.kyt.xsd.siteconf.SecurityDocument.Security.Https)get_store().find_attribute_user(HTTPS$0);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.SecurityDocument.Security.Https)get_store().add_attribute_user(HTTPS$0);
                }
                target.set(https);
            }
        }
        
        /**
         * Unsets the "https" attribute
         */
        public void unsetHttps()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HTTPS$0);
            }
        }
        
        /**
         * Gets the "auth" attribute
         */
        public com.kyt.xsd.siteconf.SecurityDocument.Security.Auth.Enum getAuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTH$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTH$2);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.SecurityDocument.Security.Auth.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "auth" attribute
         */
        public com.kyt.xsd.siteconf.SecurityDocument.Security.Auth xgetAuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.SecurityDocument.Security.Auth target = null;
                target = (com.kyt.xsd.siteconf.SecurityDocument.Security.Auth)get_store().find_attribute_user(AUTH$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.SecurityDocument.Security.Auth)get_default_attribute_value(AUTH$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "auth" attribute
         */
        public boolean isSetAuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AUTH$2) != null;
            }
        }
        
        /**
         * Sets the "auth" attribute
         */
        public void setAuth(com.kyt.xsd.siteconf.SecurityDocument.Security.Auth.Enum auth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTH$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTH$2);
                }
                target.setEnumValue(auth);
            }
        }
        
        /**
         * Sets (as xml) the "auth" attribute
         */
        public void xsetAuth(com.kyt.xsd.siteconf.SecurityDocument.Security.Auth auth)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.SecurityDocument.Security.Auth target = null;
                target = (com.kyt.xsd.siteconf.SecurityDocument.Security.Auth)get_store().find_attribute_user(AUTH$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.SecurityDocument.Security.Auth)get_store().add_attribute_user(AUTH$2);
                }
                target.set(auth);
            }
        }
        
        /**
         * Unsets the "auth" attribute
         */
        public void unsetAuth()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AUTH$2);
            }
        }
        
        /**
         * Gets the "cert" attribute
         */
        public com.kyt.xsd.siteconf.SecurityDocument.Security.Cert.Enum getCert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CERT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CERT$4);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.SecurityDocument.Security.Cert.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "cert" attribute
         */
        public com.kyt.xsd.siteconf.SecurityDocument.Security.Cert xgetCert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.SecurityDocument.Security.Cert target = null;
                target = (com.kyt.xsd.siteconf.SecurityDocument.Security.Cert)get_store().find_attribute_user(CERT$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.SecurityDocument.Security.Cert)get_default_attribute_value(CERT$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "cert" attribute
         */
        public boolean isSetCert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CERT$4) != null;
            }
        }
        
        /**
         * Sets the "cert" attribute
         */
        public void setCert(com.kyt.xsd.siteconf.SecurityDocument.Security.Cert.Enum cert)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CERT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CERT$4);
                }
                target.setEnumValue(cert);
            }
        }
        
        /**
         * Sets (as xml) the "cert" attribute
         */
        public void xsetCert(com.kyt.xsd.siteconf.SecurityDocument.Security.Cert cert)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.SecurityDocument.Security.Cert target = null;
                target = (com.kyt.xsd.siteconf.SecurityDocument.Security.Cert)get_store().find_attribute_user(CERT$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.SecurityDocument.Security.Cert)get_store().add_attribute_user(CERT$4);
                }
                target.set(cert);
            }
        }
        
        /**
         * Unsets the "cert" attribute
         */
        public void unsetCert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CERT$4);
            }
        }
        
        /**
         * Gets the "external-view" attribute
         */
        public com.kyt.xsd.siteconf.SecurityDocument.Security.ExternalView.Enum getExternalView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTERNALVIEW$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXTERNALVIEW$6);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.SecurityDocument.Security.ExternalView.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "external-view" attribute
         */
        public com.kyt.xsd.siteconf.SecurityDocument.Security.ExternalView xgetExternalView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.SecurityDocument.Security.ExternalView target = null;
                target = (com.kyt.xsd.siteconf.SecurityDocument.Security.ExternalView)get_store().find_attribute_user(EXTERNALVIEW$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.SecurityDocument.Security.ExternalView)get_default_attribute_value(EXTERNALVIEW$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "external-view" attribute
         */
        public boolean isSetExternalView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXTERNALVIEW$6) != null;
            }
        }
        
        /**
         * Sets the "external-view" attribute
         */
        public void setExternalView(com.kyt.xsd.siteconf.SecurityDocument.Security.ExternalView.Enum externalView)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTERNALVIEW$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTERNALVIEW$6);
                }
                target.setEnumValue(externalView);
            }
        }
        
        /**
         * Sets (as xml) the "external-view" attribute
         */
        public void xsetExternalView(com.kyt.xsd.siteconf.SecurityDocument.Security.ExternalView externalView)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.SecurityDocument.Security.ExternalView target = null;
                target = (com.kyt.xsd.siteconf.SecurityDocument.Security.ExternalView)get_store().find_attribute_user(EXTERNALVIEW$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.SecurityDocument.Security.ExternalView)get_store().add_attribute_user(EXTERNALVIEW$6);
                }
                target.set(externalView);
            }
        }
        
        /**
         * Unsets the "external-view" attribute
         */
        public void unsetExternalView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXTERNALVIEW$6);
            }
        }
        
        /**
         * Gets the "direct-request" attribute
         */
        public com.kyt.xsd.siteconf.SecurityDocument.Security.DirectRequest.Enum getDirectRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTREQUEST$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIRECTREQUEST$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.SecurityDocument.Security.DirectRequest.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "direct-request" attribute
         */
        public com.kyt.xsd.siteconf.SecurityDocument.Security.DirectRequest xgetDirectRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.SecurityDocument.Security.DirectRequest target = null;
                target = (com.kyt.xsd.siteconf.SecurityDocument.Security.DirectRequest)get_store().find_attribute_user(DIRECTREQUEST$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.SecurityDocument.Security.DirectRequest)get_default_attribute_value(DIRECTREQUEST$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "direct-request" attribute
         */
        public boolean isSetDirectRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DIRECTREQUEST$8) != null;
            }
        }
        
        /**
         * Sets the "direct-request" attribute
         */
        public void setDirectRequest(com.kyt.xsd.siteconf.SecurityDocument.Security.DirectRequest.Enum directRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTREQUEST$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTREQUEST$8);
                }
                target.setEnumValue(directRequest);
            }
        }
        
        /**
         * Sets (as xml) the "direct-request" attribute
         */
        public void xsetDirectRequest(com.kyt.xsd.siteconf.SecurityDocument.Security.DirectRequest directRequest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.SecurityDocument.Security.DirectRequest target = null;
                target = (com.kyt.xsd.siteconf.SecurityDocument.Security.DirectRequest)get_store().find_attribute_user(DIRECTREQUEST$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.SecurityDocument.Security.DirectRequest)get_store().add_attribute_user(DIRECTREQUEST$8);
                }
                target.set(directRequest);
            }
        }
        
        /**
         * Unsets the "direct-request" attribute
         */
        public void unsetDirectRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DIRECTREQUEST$8);
            }
        }
        /**
         * An XML https(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.SecurityDocument$Security$Https.
         */
        public static class HttpsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.SecurityDocument.Security.Https
        {
            private static final long serialVersionUID = 1L;
            
            public HttpsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected HttpsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML auth(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.SecurityDocument$Security$Auth.
         */
        public static class AuthImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.SecurityDocument.Security.Auth
        {
            private static final long serialVersionUID = 1L;
            
            public AuthImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AuthImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML cert(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.SecurityDocument$Security$Cert.
         */
        public static class CertImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.SecurityDocument.Security.Cert
        {
            private static final long serialVersionUID = 1L;
            
            public CertImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected CertImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML external-view(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.SecurityDocument$Security$ExternalView.
         */
        public static class ExternalViewImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.SecurityDocument.Security.ExternalView
        {
            private static final long serialVersionUID = 1L;
            
            public ExternalViewImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ExternalViewImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML direct-request(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.SecurityDocument$Security$DirectRequest.
         */
        public static class DirectRequestImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.SecurityDocument.Security.DirectRequest
        {
            private static final long serialVersionUID = 1L;
            
            public DirectRequestImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DirectRequestImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
