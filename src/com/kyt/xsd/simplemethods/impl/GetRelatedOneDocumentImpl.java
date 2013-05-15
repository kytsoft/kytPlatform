/*
 * An XML document type.
 * Localname: get-related-one
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.GetRelatedOneDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one get-related-one(@) element.
 *
 * This is a complex type.
 */
public class GetRelatedOneDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityFindOperationsDocumentImpl implements com.kyt.xsd.simplemethods.GetRelatedOneDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRelatedOneDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRELATEDONE$0 = 
        new javax.xml.namespace.QName("", "get-related-one");
    
    
    /**
     * Gets the "get-related-one" element
     */
    public com.kyt.xsd.simplemethods.GetRelatedOneDocument.GetRelatedOne getGetRelatedOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.GetRelatedOneDocument.GetRelatedOne target = null;
            target = (com.kyt.xsd.simplemethods.GetRelatedOneDocument.GetRelatedOne)get_store().find_element_user(GETRELATEDONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "get-related-one" element
     */
    public void setGetRelatedOne(com.kyt.xsd.simplemethods.GetRelatedOneDocument.GetRelatedOne getRelatedOne)
    {
        generatedSetterHelperImpl(getRelatedOne, GETRELATEDONE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "get-related-one" element
     */
    public com.kyt.xsd.simplemethods.GetRelatedOneDocument.GetRelatedOne addNewGetRelatedOne()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.GetRelatedOneDocument.GetRelatedOne target = null;
            target = (com.kyt.xsd.simplemethods.GetRelatedOneDocument.GetRelatedOne)get_store().add_element_user(GETRELATEDONE$0);
            return target;
        }
    }
    /**
     * An XML get-related-one(@).
     *
     * This is a complex type.
     */
    public static class GetRelatedOneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.GetRelatedOneDocument.GetRelatedOne
    {
        private static final long serialVersionUID = 1L;
        
        public GetRelatedOneImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUEFIELD$0 = 
            new javax.xml.namespace.QName("", "value-field");
        private static final javax.xml.namespace.QName RELATIONNAME$2 = 
            new javax.xml.namespace.QName("", "relation-name");
        private static final javax.xml.namespace.QName USECACHE$4 = 
            new javax.xml.namespace.QName("", "use-cache");
        private static final javax.xml.namespace.QName TOVALUEFIELD$6 = 
            new javax.xml.namespace.QName("", "to-value-field");
        
        
        /**
         * Gets the "value-field" attribute
         */
        public java.lang.String getValueField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUEFIELD$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value-field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValueField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUEFIELD$0);
                return target;
            }
        }
        
        /**
         * Sets the "value-field" attribute
         */
        public void setValueField(java.lang.String valueField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUEFIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUEFIELD$0);
                }
                target.setStringValue(valueField);
            }
        }
        
        /**
         * Sets (as xml) the "value-field" attribute
         */
        public void xsetValueField(org.apache.xmlbeans.XmlString valueField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUEFIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUEFIELD$0);
                }
                target.set(valueField);
            }
        }
        
        /**
         * Gets the "relation-name" attribute
         */
        public java.lang.String getRelationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "relation-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRelationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATIONNAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "relation-name" attribute
         */
        public void setRelationName(java.lang.String relationName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIONNAME$2);
                }
                target.setStringValue(relationName);
            }
        }
        
        /**
         * Sets (as xml) the "relation-name" attribute
         */
        public void xsetRelationName(org.apache.xmlbeans.XmlString relationName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATIONNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELATIONNAME$2);
                }
                target.set(relationName);
            }
        }
        
        /**
         * Gets the "use-cache" attribute
         */
        public java.lang.String getUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USECACHE$4);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "use-cache" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USECACHE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(USECACHE$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "use-cache" attribute
         */
        public boolean isSetUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USECACHE$4) != null;
            }
        }
        
        /**
         * Sets the "use-cache" attribute
         */
        public void setUseCache(java.lang.String useCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USECACHE$4);
                }
                target.setStringValue(useCache);
            }
        }
        
        /**
         * Sets (as xml) the "use-cache" attribute
         */
        public void xsetUseCache(org.apache.xmlbeans.XmlString useCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USECACHE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USECACHE$4);
                }
                target.set(useCache);
            }
        }
        
        /**
         * Unsets the "use-cache" attribute
         */
        public void unsetUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USECACHE$4);
            }
        }
        
        /**
         * Gets the "to-value-field" attribute
         */
        public java.lang.String getToValueField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOVALUEFIELD$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "to-value-field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetToValueField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOVALUEFIELD$6);
                return target;
            }
        }
        
        /**
         * Sets the "to-value-field" attribute
         */
        public void setToValueField(java.lang.String toValueField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOVALUEFIELD$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOVALUEFIELD$6);
                }
                target.setStringValue(toValueField);
            }
        }
        
        /**
         * Sets (as xml) the "to-value-field" attribute
         */
        public void xsetToValueField(org.apache.xmlbeans.XmlString toValueField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOVALUEFIELD$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOVALUEFIELD$6);
                }
                target.set(toValueField);
            }
        }
    }
}
