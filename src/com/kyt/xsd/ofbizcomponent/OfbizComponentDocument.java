/*
 * An XML document type.
 * Localname: ofbiz-component
 * Namespace: 
 * Java type: com.kyt.xsd.ofbizcomponent.OfbizComponentDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.ofbizcomponent;


/**
 * A document containing one ofbiz-component(@) element.
 *
 * This is a complex type.
 */
public interface OfbizComponentDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfbizComponentDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s687A08F778A9610EDD21673788D906F2").resolveHandle("ofbizcomponentbeb3doctype");
    
    /**
     * Gets the "ofbiz-component" element
     */
    com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent getOfbizComponent();
    
    /**
     * Sets the "ofbiz-component" element
     */
    void setOfbizComponent(com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent ofbizComponent);
    
    /**
     * Appends and returns a new empty "ofbiz-component" element
     */
    com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent addNewOfbizComponent();
    
    /**
     * An XML ofbiz-component(@).
     *
     * This is a complex type.
     */
    public interface OfbizComponent extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OfbizComponent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s687A08F778A9610EDD21673788D906F2").resolveHandle("ofbizcomponent997belemtype");
        
        /**
         * Gets array of all "depends-on" elements
         */
        com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn[] getDependsOnArray();
        
        /**
         * Gets ith "depends-on" element
         */
        com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn getDependsOnArray(int i);
        
        /**
         * Returns number of "depends-on" element
         */
        int sizeOfDependsOnArray();
        
        /**
         * Sets array of all "depends-on" element
         */
        void setDependsOnArray(com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn[] dependsOnArray);
        
        /**
         * Sets ith "depends-on" element
         */
        void setDependsOnArray(int i, com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn dependsOn);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "depends-on" element
         */
        com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn insertNewDependsOn(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "depends-on" element
         */
        com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn addNewDependsOn();
        
        /**
         * Removes the ith "depends-on" element
         */
        void removeDependsOn(int i);
        
        /**
         * Gets array of all "resource-loader" elements
         */
        com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader[] getResourceLoaderArray();
        
        /**
         * Gets ith "resource-loader" element
         */
        com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader getResourceLoaderArray(int i);
        
        /**
         * Returns number of "resource-loader" element
         */
        int sizeOfResourceLoaderArray();
        
        /**
         * Sets array of all "resource-loader" element
         */
        void setResourceLoaderArray(com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader[] resourceLoaderArray);
        
        /**
         * Sets ith "resource-loader" element
         */
        void setResourceLoaderArray(int i, com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader resourceLoader);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resource-loader" element
         */
        com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader insertNewResourceLoader(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resource-loader" element
         */
        com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader addNewResourceLoader();
        
        /**
         * Removes the ith "resource-loader" element
         */
        void removeResourceLoader(int i);
        
        /**
         * Gets array of all "classpath" elements
         */
        com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath[] getClasspathArray();
        
        /**
         * Gets ith "classpath" element
         */
        com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath getClasspathArray(int i);
        
        /**
         * Returns number of "classpath" element
         */
        int sizeOfClasspathArray();
        
        /**
         * Sets array of all "classpath" element
         */
        void setClasspathArray(com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath[] classpathArray);
        
        /**
         * Sets ith "classpath" element
         */
        void setClasspathArray(int i, com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath classpath);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "classpath" element
         */
        com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath insertNewClasspath(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "classpath" element
         */
        com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath addNewClasspath();
        
        /**
         * Removes the ith "classpath" element
         */
        void removeClasspath(int i);
        
        /**
         * Gets array of all "entity-resource" elements
         */
        com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource[] getEntityResourceArray();
        
        /**
         * Gets ith "entity-resource" element
         */
        com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource getEntityResourceArray(int i);
        
        /**
         * Returns number of "entity-resource" element
         */
        int sizeOfEntityResourceArray();
        
        /**
         * Sets array of all "entity-resource" element
         */
        void setEntityResourceArray(com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource[] entityResourceArray);
        
        /**
         * Sets ith "entity-resource" element
         */
        void setEntityResourceArray(int i, com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource entityResource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-resource" element
         */
        com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource insertNewEntityResource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-resource" element
         */
        com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource addNewEntityResource();
        
        /**
         * Removes the ith "entity-resource" element
         */
        void removeEntityResource(int i);
        
        /**
         * Gets array of all "service-resource" elements
         */
        com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource[] getServiceResourceArray();
        
        /**
         * Gets ith "service-resource" element
         */
        com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource getServiceResourceArray(int i);
        
        /**
         * Returns number of "service-resource" element
         */
        int sizeOfServiceResourceArray();
        
        /**
         * Sets array of all "service-resource" element
         */
        void setServiceResourceArray(com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource[] serviceResourceArray);
        
        /**
         * Sets ith "service-resource" element
         */
        void setServiceResourceArray(int i, com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource serviceResource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "service-resource" element
         */
        com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource insertNewServiceResource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "service-resource" element
         */
        com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource addNewServiceResource();
        
        /**
         * Removes the ith "service-resource" element
         */
        void removeServiceResource(int i);
        
        /**
         * Gets array of all "test-suite" elements
         */
        com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite[] getTestSuiteArray();
        
        /**
         * Gets ith "test-suite" element
         */
        com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite getTestSuiteArray(int i);
        
        /**
         * Returns number of "test-suite" element
         */
        int sizeOfTestSuiteArray();
        
        /**
         * Sets array of all "test-suite" element
         */
        void setTestSuiteArray(com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite[] testSuiteArray);
        
        /**
         * Sets ith "test-suite" element
         */
        void setTestSuiteArray(int i, com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite testSuite);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "test-suite" element
         */
        com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite insertNewTestSuite(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "test-suite" element
         */
        com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite addNewTestSuite();
        
        /**
         * Removes the ith "test-suite" element
         */
        void removeTestSuite(int i);
        
        /**
         * Gets array of all "keystore" elements
         */
        com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore[] getKeystoreArray();
        
        /**
         * Gets ith "keystore" element
         */
        com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore getKeystoreArray(int i);
        
        /**
         * Returns number of "keystore" element
         */
        int sizeOfKeystoreArray();
        
        /**
         * Sets array of all "keystore" element
         */
        void setKeystoreArray(com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore[] keystoreArray);
        
        /**
         * Sets ith "keystore" element
         */
        void setKeystoreArray(int i, com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore keystore);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "keystore" element
         */
        com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore insertNewKeystore(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "keystore" element
         */
        com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore addNewKeystore();
        
        /**
         * Removes the ith "keystore" element
         */
        void removeKeystore(int i);
        
        /**
         * Gets array of all "webapp" elements
         */
        com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp[] getWebappArray();
        
        /**
         * Gets ith "webapp" element
         */
        com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp getWebappArray(int i);
        
        /**
         * Returns number of "webapp" element
         */
        int sizeOfWebappArray();
        
        /**
         * Sets array of all "webapp" element
         */
        void setWebappArray(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp[] webappArray);
        
        /**
         * Sets ith "webapp" element
         */
        void setWebappArray(int i, com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp webapp);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "webapp" element
         */
        com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp insertNewWebapp(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "webapp" element
         */
        com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp addNewWebapp();
        
        /**
         * Removes the ith "webapp" element
         */
        void removeWebapp(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "enabled" attribute
         */
        java.lang.String getEnabled();
        
        /**
         * Gets (as xml) the "enabled" attribute
         */
        org.apache.xmlbeans.XmlString xgetEnabled();
        
        /**
         * True if has "enabled" attribute
         */
        boolean isSetEnabled();
        
        /**
         * Sets the "enabled" attribute
         */
        void setEnabled(java.lang.String enabled);
        
        /**
         * Sets (as xml) the "enabled" attribute
         */
        void xsetEnabled(org.apache.xmlbeans.XmlString enabled);
        
        /**
         * Unsets the "enabled" attribute
         */
        void unsetEnabled();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent newInstance() {
              return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument newInstance() {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.ofbizcomponent.OfbizComponentDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
