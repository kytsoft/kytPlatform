/*
 * An XML document type.
 * Localname: test-suite
 * Namespace: 
 * Java type: com.kyt.xsd.ofbizcomponent.TestSuiteDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.ofbizcomponent.impl;
/**
 * A document containing one test-suite(@) element.
 *
 * This is a complex type.
 */
public class TestSuiteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.TestSuiteDocument
{
    private static final long serialVersionUID = 1L;
    
    public TestSuiteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTSUITE$0 = 
        new javax.xml.namespace.QName("", "test-suite");
    
    
    /**
     * Gets the "test-suite" element
     */
    public com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite getTestSuite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite target = null;
            target = (com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite)get_store().find_element_user(TESTSUITE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "test-suite" element
     */
    public void setTestSuite(com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite testSuite)
    {
        generatedSetterHelperImpl(testSuite, TESTSUITE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "test-suite" element
     */
    public com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite addNewTestSuite()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite target = null;
            target = (com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite)get_store().add_element_user(TESTSUITE$0);
            return target;
        }
    }
    /**
     * An XML test-suite(@).
     *
     * This is a complex type.
     */
    public static class TestSuiteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcomponent.TestSuiteDocument.TestSuite
    {
        private static final long serialVersionUID = 1L;
        
        public TestSuiteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOADER$0 = 
            new javax.xml.namespace.QName("", "loader");
        private static final javax.xml.namespace.QName LOCATION$2 = 
            new javax.xml.namespace.QName("", "location");
        
        
        /**
         * Gets the "loader" attribute
         */
        public java.lang.String getLoader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADER$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "loader" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLoader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOADER$0);
                return target;
            }
        }
        
        /**
         * Sets the "loader" attribute
         */
        public void setLoader(java.lang.String loader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOADER$0);
                }
                target.setStringValue(loader);
            }
        }
        
        /**
         * Sets (as xml) the "loader" attribute
         */
        public void xsetLoader(org.apache.xmlbeans.XmlString loader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOADER$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOADER$0);
                }
                target.set(loader);
            }
        }
        
        /**
         * Gets the "location" attribute
         */
        public java.lang.String getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "location" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$2);
                return target;
            }
        }
        
        /**
         * Sets the "location" attribute
         */
        public void setLocation(java.lang.String location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$2);
                }
                target.setStringValue(location);
            }
        }
        
        /**
         * Sets (as xml) the "location" attribute
         */
        public void xsetLocation(org.apache.xmlbeans.XmlString location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCATION$2);
                }
                target.set(location);
            }
        }
    }
}
