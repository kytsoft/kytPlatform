/*
 * An XML document type.
 * Localname: result-to-result
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.ResultToResultDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one result-to-result(@) element.
 *
 * This is a complex type.
 */
public class ResultToResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.ResultToResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResultToResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESULTTORESULT$0 = 
        new javax.xml.namespace.QName("", "result-to-result");
    
    
    /**
     * Gets the "result-to-result" element
     */
    public com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult getResultToResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult target = null;
            target = (com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult)get_store().find_element_user(RESULTTORESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "result-to-result" element
     */
    public void setResultToResult(com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult resultToResult)
    {
        generatedSetterHelperImpl(resultToResult, RESULTTORESULT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "result-to-result" element
     */
    public com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult addNewResultToResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult target = null;
            target = (com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult)get_store().add_element_user(RESULTTORESULT$0);
            return target;
        }
    }
    /**
     * An XML result-to-result(@).
     *
     * This is a complex type.
     */
    public static class ResultToResultImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.ResultToResultDocument.ResultToResult
    {
        private static final long serialVersionUID = 1L;
        
        public ResultToResultImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESULTNAME$0 = 
            new javax.xml.namespace.QName("", "result-name");
        private static final javax.xml.namespace.QName SERVICERESULTNAME$2 = 
            new javax.xml.namespace.QName("", "service-result-name");
        
        
        /**
         * Gets the "result-name" attribute
         */
        public java.lang.String getResultName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "result-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetResultName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESULTNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "result-name" attribute
         */
        public void setResultName(java.lang.String resultName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESULTNAME$0);
                }
                target.setStringValue(resultName);
            }
        }
        
        /**
         * Sets (as xml) the "result-name" attribute
         */
        public void xsetResultName(org.apache.xmlbeans.XmlString resultName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESULTNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESULTNAME$0);
                }
                target.set(resultName);
            }
        }
        
        /**
         * Gets the "service-result-name" attribute
         */
        public java.lang.String getServiceResultName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICERESULTNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "service-result-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetServiceResultName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICERESULTNAME$2);
                return target;
            }
        }
        
        /**
         * True if has "service-result-name" attribute
         */
        public boolean isSetServiceResultName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SERVICERESULTNAME$2) != null;
            }
        }
        
        /**
         * Sets the "service-result-name" attribute
         */
        public void setServiceResultName(java.lang.String serviceResultName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICERESULTNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICERESULTNAME$2);
                }
                target.setStringValue(serviceResultName);
            }
        }
        
        /**
         * Sets (as xml) the "service-result-name" attribute
         */
        public void xsetServiceResultName(org.apache.xmlbeans.XmlString serviceResultName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICERESULTNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERVICERESULTNAME$2);
                }
                target.set(serviceResultName);
            }
        }
        
        /**
         * Unsets the "service-result-name" attribute
         */
        public void unsetServiceResultName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SERVICERESULTNAME$2);
            }
        }
    }
}
