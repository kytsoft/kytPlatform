/*
 * An XML document type.
 * Localname: ofbiz-component
 * Namespace: 
 * Java type: com.kyt.xsd.ofbizcomponent.OfbizComponentDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.ofbizcomponent.impl;
/**
 * A document containing one ofbiz-component(@) element.
 *
 * This is a complex type.
 */
public class OfbizComponentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.OfbizComponentDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfbizComponentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFBIZCOMPONENT$0 = 
        new javax.xml.namespace.QName("", "ofbiz-component");
    
    
    /**
     * Gets the "ofbiz-component" element
     */
    public com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent getOfbizComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent target = null;
            target = (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent)get_store().find_element_user(OFBIZCOMPONENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ofbiz-component" element
     */
    public void setOfbizComponent(com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent ofbizComponent)
    {
        generatedSetterHelperImpl(ofbizComponent, OFBIZCOMPONENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ofbiz-component" element
     */
    public com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent addNewOfbizComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent target = null;
            target = (com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent)get_store().add_element_user(OFBIZCOMPONENT$0);
            return target;
        }
    }
    /**
     * An XML ofbiz-component(@).
     *
     * This is a complex type.
     */
    public static class OfbizComponentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.OfbizComponentDocument.OfbizComponent
    {
        private static final long serialVersionUID = 1L;
        
        public OfbizComponentImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DEPENDSON$0 = 
            new javax.xml.namespace.QName("", "depends-on");
        private static final javax.xml.namespace.QName RESOURCELOADER$2 = 
            new javax.xml.namespace.QName("", "resource-loader");
        private static final javax.xml.namespace.QName CLASSPATH$4 = 
            new javax.xml.namespace.QName("", "classpath");
        private static final javax.xml.namespace.QName ENTITYRESOURCE$6 = 
            new javax.xml.namespace.QName("", "entity-resource");
        private static final javax.xml.namespace.QName SERVICERESOURCE$8 = 
            new javax.xml.namespace.QName("", "service-resource");
        private static final javax.xml.namespace.QName TESTSUITE$10 = 
            new javax.xml.namespace.QName("", "test-suite");
        private static final javax.xml.namespace.QName KEYSTORE$12 = 
            new javax.xml.namespace.QName("", "keystore");
        private static final javax.xml.namespace.QName WEBAPP$14 = 
            new javax.xml.namespace.QName("", "webapp");
        private static final javax.xml.namespace.QName NAME$16 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName ENABLED$18 = 
            new javax.xml.namespace.QName("", "enabled");
        
        
        /**
         * Gets array of all "depends-on" elements
         */
        public com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn[] getDependsOnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DEPENDSON$0, targetList);
                com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn[] result = new com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "depends-on" element
         */
        public com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn getDependsOnArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn target = null;
                target = (com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn)get_store().find_element_user(DEPENDSON$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "depends-on" element
         */
        public int sizeOfDependsOnArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEPENDSON$0);
            }
        }
        
        /**
         * Sets array of all "depends-on" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDependsOnArray(com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn[] dependsOnArray)
        {
            check_orphaned();
            arraySetterHelper(dependsOnArray, DEPENDSON$0);
        }
        
        /**
         * Sets ith "depends-on" element
         */
        public void setDependsOnArray(int i, com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn dependsOn)
        {
            generatedSetterHelperImpl(dependsOn, DEPENDSON$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "depends-on" element
         */
        public com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn insertNewDependsOn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn target = null;
                target = (com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn)get_store().insert_element_user(DEPENDSON$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "depends-on" element
         */
        public com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn addNewDependsOn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn target = null;
                target = (com.kyt.xsd.ofbizcomponent.DependsOnDocument.DependsOn)get_store().add_element_user(DEPENDSON$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "depends-on" element
         */
        public void removeDependsOn(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEPENDSON$0, i);
            }
        }
        
        /**
         * Gets array of all "resource-loader" elements
         */
        public com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader[] getResourceLoaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESOURCELOADER$2, targetList);
                com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader[] result = new com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resource-loader" element
         */
        public com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader getResourceLoaderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader target = null;
                target = (com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader)get_store().find_element_user(RESOURCELOADER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resource-loader" element
         */
        public int sizeOfResourceLoaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCELOADER$2);
            }
        }
        
        /**
         * Sets array of all "resource-loader" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setResourceLoaderArray(com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader[] resourceLoaderArray)
        {
            check_orphaned();
            arraySetterHelper(resourceLoaderArray, RESOURCELOADER$2);
        }
        
        /**
         * Sets ith "resource-loader" element
         */
        public void setResourceLoaderArray(int i, com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader resourceLoader)
        {
            generatedSetterHelperImpl(resourceLoader, RESOURCELOADER$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resource-loader" element
         */
        public com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader insertNewResourceLoader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader target = null;
                target = (com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader)get_store().insert_element_user(RESOURCELOADER$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resource-loader" element
         */
        public com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader addNewResourceLoader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader target = null;
                target = (com.kyt.xsd.ofbizcomponent.ResourceLoaderDocument.ResourceLoader)get_store().add_element_user(RESOURCELOADER$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "resource-loader" element
         */
        public void removeResourceLoader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCELOADER$2, i);
            }
        }
        
        /**
         * Gets array of all "classpath" elements
         */
        public com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath[] getClasspathArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CLASSPATH$4, targetList);
                com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath[] result = new com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "classpath" element
         */
        public com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath getClasspathArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath target = null;
                target = (com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath)get_store().find_element_user(CLASSPATH$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "classpath" element
         */
        public int sizeOfClasspathArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASSPATH$4);
            }
        }
        
        /**
         * Sets array of all "classpath" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setClasspathArray(com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath[] classpathArray)
        {
            check_orphaned();
            arraySetterHelper(classpathArray, CLASSPATH$4);
        }
        
        /**
         * Sets ith "classpath" element
         */
        public void setClasspathArray(int i, com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath classpath)
        {
            generatedSetterHelperImpl(classpath, CLASSPATH$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "classpath" element
         */
        public com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath insertNewClasspath(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath target = null;
                target = (com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath)get_store().insert_element_user(CLASSPATH$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "classpath" element
         */
        public com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath addNewClasspath()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath target = null;
                target = (com.kyt.xsd.ofbizcomponent.ClasspathDocument.Classpath)get_store().add_element_user(CLASSPATH$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "classpath" element
         */
        public void removeClasspath(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASSPATH$4, i);
            }
        }
        
        /**
         * Gets array of all "entity-resource" elements
         */
        public com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource[] getEntityResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENTITYRESOURCE$6, targetList);
                com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource[] result = new com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "entity-resource" element
         */
        public com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource getEntityResourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource target = null;
                target = (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource)get_store().find_element_user(ENTITYRESOURCE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "entity-resource" element
         */
        public int sizeOfEntityResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITYRESOURCE$6);
            }
        }
        
        /**
         * Sets array of all "entity-resource" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEntityResourceArray(com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource[] entityResourceArray)
        {
            check_orphaned();
            arraySetterHelper(entityResourceArray, ENTITYRESOURCE$6);
        }
        
        /**
         * Sets ith "entity-resource" element
         */
        public void setEntityResourceArray(int i, com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource entityResource)
        {
            generatedSetterHelperImpl(entityResource, ENTITYRESOURCE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-resource" element
         */
        public com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource insertNewEntityResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource target = null;
                target = (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource)get_store().insert_element_user(ENTITYRESOURCE$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-resource" element
         */
        public com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource addNewEntityResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource target = null;
                target = (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource)get_store().add_element_user(ENTITYRESOURCE$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "entity-resource" element
         */
        public void removeEntityResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITYRESOURCE$6, i);
            }
        }
        
        /**
         * Gets array of all "service-resource" elements
         */
        public com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource[] getServiceResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SERVICERESOURCE$8, targetList);
                com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource[] result = new com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "service-resource" element
         */
        public com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource getServiceResourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource target = null;
                target = (com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource)get_store().find_element_user(SERVICERESOURCE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "service-resource" element
         */
        public int sizeOfServiceResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICERESOURCE$8);
            }
        }
        
        /**
         * Sets array of all "service-resource" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setServiceResourceArray(com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource[] serviceResourceArray)
        {
            check_orphaned();
            arraySetterHelper(serviceResourceArray, SERVICERESOURCE$8);
        }
        
        /**
         * Sets ith "service-resource" element
         */
        public void setServiceResourceArray(int i, com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource serviceResource)
        {
            generatedSetterHelperImpl(serviceResource, SERVICERESOURCE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "service-resource" element
         */
        public com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource insertNewServiceResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource target = null;
                target = (com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource)get_store().insert_element_user(SERVICERESOURCE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "service-resource" element
         */
        public com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource addNewServiceResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource target = null;
                target = (com.kyt.xsd.ofbizcomponent.ServiceResourceDocument.ServiceResource)get_store().add_element_user(SERVICERESOURCE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "service-resource" element
         */
        public void removeServiceResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICERESOURCE$8, i);
            }
        }
        
        /**
         * Gets array of all "test-suite" elements
         */
        public com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite[] getTestSuiteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TESTSUITE$10, targetList);
                com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite[] result = new com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "test-suite" element
         */
        public com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite getTestSuiteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite target = null;
                target = (com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite)get_store().find_element_user(TESTSUITE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "test-suite" element
         */
        public int sizeOfTestSuiteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TESTSUITE$10);
            }
        }
        
        /**
         * Sets array of all "test-suite" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTestSuiteArray(com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite[] testSuiteArray)
        {
            check_orphaned();
            arraySetterHelper(testSuiteArray, TESTSUITE$10);
        }
        
        /**
         * Sets ith "test-suite" element
         */
        public void setTestSuiteArray(int i, com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite testSuite)
        {
            generatedSetterHelperImpl(testSuite, TESTSUITE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "test-suite" element
         */
        public com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite insertNewTestSuite(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite target = null;
                target = (com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite)get_store().insert_element_user(TESTSUITE$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "test-suite" element
         */
        public com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite addNewTestSuite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite target = null;
                target = (com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite)get_store().add_element_user(TESTSUITE$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "test-suite" element
         */
        public void removeTestSuite(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TESTSUITE$10, i);
            }
        }
        
        /**
         * Gets array of all "keystore" elements
         */
        public com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore[] getKeystoreArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYSTORE$12, targetList);
                com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore[] result = new com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "keystore" element
         */
        public com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore getKeystoreArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore target = null;
                target = (com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore)get_store().find_element_user(KEYSTORE$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "keystore" element
         */
        public int sizeOfKeystoreArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYSTORE$12);
            }
        }
        
        /**
         * Sets array of all "keystore" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setKeystoreArray(com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore[] keystoreArray)
        {
            check_orphaned();
            arraySetterHelper(keystoreArray, KEYSTORE$12);
        }
        
        /**
         * Sets ith "keystore" element
         */
        public void setKeystoreArray(int i, com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore keystore)
        {
            generatedSetterHelperImpl(keystore, KEYSTORE$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "keystore" element
         */
        public com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore insertNewKeystore(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore target = null;
                target = (com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore)get_store().insert_element_user(KEYSTORE$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "keystore" element
         */
        public com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore addNewKeystore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore target = null;
                target = (com.kyt.xsd.ofbizcomponent.KeystoreDocument.Keystore)get_store().add_element_user(KEYSTORE$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "keystore" element
         */
        public void removeKeystore(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYSTORE$12, i);
            }
        }
        
        /**
         * Gets array of all "webapp" elements
         */
        public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp[] getWebappArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(WEBAPP$14, targetList);
                com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp[] result = new com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "webapp" element
         */
        public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp getWebappArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp target = null;
                target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp)get_store().find_element_user(WEBAPP$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "webapp" element
         */
        public int sizeOfWebappArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WEBAPP$14);
            }
        }
        
        /**
         * Sets array of all "webapp" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setWebappArray(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp[] webappArray)
        {
            check_orphaned();
            arraySetterHelper(webappArray, WEBAPP$14);
        }
        
        /**
         * Sets ith "webapp" element
         */
        public void setWebappArray(int i, com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp webapp)
        {
            generatedSetterHelperImpl(webapp, WEBAPP$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "webapp" element
         */
        public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp insertNewWebapp(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp target = null;
                target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp)get_store().insert_element_user(WEBAPP$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "webapp" element
         */
        public com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp addNewWebapp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp target = null;
                target = (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp)get_store().add_element_user(WEBAPP$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "webapp" element
         */
        public void removeWebapp(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WEBAPP$14, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$16);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$16);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "enabled" attribute
         */
        public java.lang.String getEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLED$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENABLED$18);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "enabled" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENABLED$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(ENABLED$18);
                }
                return target;
            }
        }
        
        /**
         * True if has "enabled" attribute
         */
        public boolean isSetEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENABLED$18) != null;
            }
        }
        
        /**
         * Sets the "enabled" attribute
         */
        public void setEnabled(java.lang.String enabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLED$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLED$18);
                }
                target.setStringValue(enabled);
            }
        }
        
        /**
         * Sets (as xml) the "enabled" attribute
         */
        public void xsetEnabled(org.apache.xmlbeans.XmlString enabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENABLED$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENABLED$18);
                }
                target.set(enabled);
            }
        }
        
        /**
         * Unsets the "enabled" attribute
         */
        public void unsetEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENABLED$18);
            }
        }
    }
}
