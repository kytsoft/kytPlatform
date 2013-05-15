/*
 * An XML document type.
 * Localname: simple-methods
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.SimpleMethodsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one simple-methods(@) element.
 *
 * This is a complex type.
 */
public class SimpleMethodsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.SimpleMethodsDocument
{
    private static final long serialVersionUID = 1L;
    
    public SimpleMethodsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLEMETHODS$0 = 
        new javax.xml.namespace.QName("", "simple-methods");
    
    
    /**
     * Gets the "simple-methods" element
     */
    public com.kyt.xsd.simplemethods.SimpleMethodsDocument.SimpleMethods getSimpleMethods()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.SimpleMethodsDocument.SimpleMethods target = null;
            target = (com.kyt.xsd.simplemethods.SimpleMethodsDocument.SimpleMethods)get_store().find_element_user(SIMPLEMETHODS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "simple-methods" element
     */
    public void setSimpleMethods(com.kyt.xsd.simplemethods.SimpleMethodsDocument.SimpleMethods simpleMethods)
    {
        generatedSetterHelperImpl(simpleMethods, SIMPLEMETHODS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "simple-methods" element
     */
    public com.kyt.xsd.simplemethods.SimpleMethodsDocument.SimpleMethods addNewSimpleMethods()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.SimpleMethodsDocument.SimpleMethods target = null;
            target = (com.kyt.xsd.simplemethods.SimpleMethodsDocument.SimpleMethods)get_store().add_element_user(SIMPLEMETHODS$0);
            return target;
        }
    }
    /**
     * An XML simple-methods(@).
     *
     * This is a complex type.
     */
    public static class SimpleMethodsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.SimpleMethodsDocument.SimpleMethods
    {
        private static final long serialVersionUID = 1L;
        
        public SimpleMethodsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SIMPLEMETHOD$0 = 
            new javax.xml.namespace.QName("", "simple-method");
        
        
        /**
         * Gets array of all "simple-method" elements
         */
        public com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod[] getSimpleMethodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SIMPLEMETHOD$0, targetList);
                com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod[] result = new com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "simple-method" element
         */
        public com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod getSimpleMethodArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod target = null;
                target = (com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod)get_store().find_element_user(SIMPLEMETHOD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "simple-method" element
         */
        public int sizeOfSimpleMethodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SIMPLEMETHOD$0);
            }
        }
        
        /**
         * Sets array of all "simple-method" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSimpleMethodArray(com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod[] simpleMethodArray)
        {
            check_orphaned();
            arraySetterHelper(simpleMethodArray, SIMPLEMETHOD$0);
        }
        
        /**
         * Sets ith "simple-method" element
         */
        public void setSimpleMethodArray(int i, com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod simpleMethod)
        {
            generatedSetterHelperImpl(simpleMethod, SIMPLEMETHOD$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "simple-method" element
         */
        public com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod insertNewSimpleMethod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod target = null;
                target = (com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod)get_store().insert_element_user(SIMPLEMETHOD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "simple-method" element
         */
        public com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod addNewSimpleMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod target = null;
                target = (com.kyt.xsd.simplemethods.SimpleMethodDocument.SimpleMethod)get_store().add_element_user(SIMPLEMETHOD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "simple-method" element
         */
        public void removeSimpleMethod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SIMPLEMETHOD$0, i);
            }
        }
    }
}
