/*
 * An XML document type.
 * Localname: sort-field
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.SortFieldDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one sort-field(@) element.
 *
 * This is a complex type.
 */
public class SortFieldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.SortFieldDocument
{
    private static final long serialVersionUID = 1L;
    
    public SortFieldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SORTFIELD$0 = 
        new javax.xml.namespace.QName("", "sort-field");
    
    
    /**
     * Gets the "sort-field" element
     */
    public com.kyt.xsd.widgetform.SortFieldDocument.SortField getSortField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.SortFieldDocument.SortField target = null;
            target = (com.kyt.xsd.widgetform.SortFieldDocument.SortField)get_store().find_element_user(SORTFIELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sort-field" element
     */
    public void setSortField(com.kyt.xsd.widgetform.SortFieldDocument.SortField sortField)
    {
        generatedSetterHelperImpl(sortField, SORTFIELD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sort-field" element
     */
    public com.kyt.xsd.widgetform.SortFieldDocument.SortField addNewSortField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.SortFieldDocument.SortField target = null;
            target = (com.kyt.xsd.widgetform.SortFieldDocument.SortField)get_store().add_element_user(SORTFIELD$0);
            return target;
        }
    }
    /**
     * An XML sort-field(@).
     *
     * This is a complex type.
     */
    public static class SortFieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.SortFieldDocument.SortField
    {
        private static final long serialVersionUID = 1L;
        
        public SortFieldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName POSITION$2 = 
            new javax.xml.namespace.QName("", "position");
        
        
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
         * Gets the "position" attribute
         */
        public java.math.BigInteger getPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$2);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "position" attribute
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(POSITION$2);
                return target;
            }
        }
        
        /**
         * True if has "position" attribute
         */
        public boolean isSetPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POSITION$2) != null;
            }
        }
        
        /**
         * Sets the "position" attribute
         */
        public void setPosition(java.math.BigInteger position)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITION$2);
                }
                target.setBigIntegerValue(position);
            }
        }
        
        /**
         * Sets (as xml) the "position" attribute
         */
        public void xsetPosition(org.apache.xmlbeans.XmlPositiveInteger position)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(POSITION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(POSITION$2);
                }
                target.set(position);
            }
        }
        
        /**
         * Unsets the "position" attribute
         */
        public void unsetPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POSITION$2);
            }
        }
    }
}
