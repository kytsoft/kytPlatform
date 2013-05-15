/*
 * An XML document type.
 * Localname: limit-range
 * Namespace: 
 * Java type: com.kyt.xsd.widgettree.LimitRangeDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgettree.impl;
/**
 * A document containing one limit-range(@) element.
 *
 * This is a complex type.
 */
public class LimitRangeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.LimitRangeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LimitRangeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LIMITRANGE$0 = 
        new javax.xml.namespace.QName("", "limit-range");
    
    
    /**
     * Gets the "limit-range" element
     */
    public com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange getLimitRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange target = null;
            target = (com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange)get_store().find_element_user(LIMITRANGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "limit-range" element
     */
    public void setLimitRange(com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange limitRange)
    {
        generatedSetterHelperImpl(limitRange, LIMITRANGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "limit-range" element
     */
    public com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange addNewLimitRange()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange target = null;
            target = (com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange)get_store().add_element_user(LIMITRANGE$0);
            return target;
        }
    }
    /**
     * An XML limit-range(@).
     *
     * This is a complex type.
     */
    public static class LimitRangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange
    {
        private static final long serialVersionUID = 1L;
        
        public LimitRangeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName START$0 = 
            new javax.xml.namespace.QName("", "start");
        private static final javax.xml.namespace.QName SIZE$2 = 
            new javax.xml.namespace.QName("", "size");
        
        
        /**
         * Gets the "start" attribute
         */
        public java.lang.String getStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "start" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(START$0);
                return target;
            }
        }
        
        /**
         * Sets the "start" attribute
         */
        public void setStart(java.lang.String start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(START$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(START$0);
                }
                target.setStringValue(start);
            }
        }
        
        /**
         * Sets (as xml) the "start" attribute
         */
        public void xsetStart(org.apache.xmlbeans.XmlString start)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(START$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(START$0);
                }
                target.set(start);
            }
        }
        
        /**
         * Gets the "size" attribute
         */
        public java.lang.String getSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "size" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIZE$2);
                return target;
            }
        }
        
        /**
         * Sets the "size" attribute
         */
        public void setSize(java.lang.String size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SIZE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SIZE$2);
                }
                target.setStringValue(size);
            }
        }
        
        /**
         * Sets (as xml) the "size" attribute
         */
        public void xsetSize(org.apache.xmlbeans.XmlString size)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SIZE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SIZE$2);
                }
                target.set(size);
            }
        }
    }
}
