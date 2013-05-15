/*
 * An XML document type.
 * Localname: sequenced-id
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.SequencedIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one sequenced-id(@) element.
 *
 * This is a complex type.
 */
public class SequencedIdDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityMiscOperationsDocumentImpl implements com.kyt.xsd.simplemethods.SequencedIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public SequencedIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQUENCEDID$0 = 
        new javax.xml.namespace.QName("", "sequenced-id");
    
    
    /**
     * Gets the "sequenced-id" element
     */
    public com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId getSequencedId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId target = null;
            target = (com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId)get_store().find_element_user(SEQUENCEDID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sequenced-id" element
     */
    public void setSequencedId(com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId sequencedId)
    {
        generatedSetterHelperImpl(sequencedId, SEQUENCEDID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sequenced-id" element
     */
    public com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId addNewSequencedId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId target = null;
            target = (com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId)get_store().add_element_user(SEQUENCEDID$0);
            return target;
        }
    }
    /**
     * An XML sequenced-id(@).
     *
     * This is a complex type.
     */
    public static class SequencedIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId
    {
        private static final long serialVersionUID = 1L;
        
        public SequencedIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEQUENCENAME$0 = 
            new javax.xml.namespace.QName("", "sequence-name");
        private static final javax.xml.namespace.QName FIELD$2 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName GETLONGONLY$4 = 
            new javax.xml.namespace.QName("", "get-long-only");
        private static final javax.xml.namespace.QName STAGGERMAX$6 = 
            new javax.xml.namespace.QName("", "stagger-max");
        
        
        /**
         * Gets the "sequence-name" attribute
         */
        public java.lang.String getSequenceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEQUENCENAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sequence-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSequenceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEQUENCENAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "sequence-name" attribute
         */
        public void setSequenceName(java.lang.String sequenceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEQUENCENAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEQUENCENAME$0);
                }
                target.setStringValue(sequenceName);
            }
        }
        
        /**
         * Sets (as xml) the "sequence-name" attribute
         */
        public void xsetSequenceName(org.apache.xmlbeans.XmlString sequenceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEQUENCENAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SEQUENCENAME$0);
                }
                target.set(sequenceName);
            }
        }
        
        /**
         * Gets the "field" attribute
         */
        public java.lang.String getField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$2);
                return target;
            }
        }
        
        /**
         * Sets the "field" attribute
         */
        public void setField(java.lang.String field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD$2);
                }
                target.setStringValue(field);
            }
        }
        
        /**
         * Sets (as xml) the "field" attribute
         */
        public void xsetField(org.apache.xmlbeans.XmlString field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELD$2);
                }
                target.set(field);
            }
        }
        
        /**
         * Gets the "get-long-only" attribute
         */
        public com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId.GetLongOnly.Enum getGetLongOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETLONGONLY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GETLONGONLY$4);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId.GetLongOnly.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "get-long-only" attribute
         */
        public com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId.GetLongOnly xgetGetLongOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId.GetLongOnly target = null;
                target = (com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId.GetLongOnly)get_store().find_attribute_user(GETLONGONLY$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId.GetLongOnly)get_default_attribute_value(GETLONGONLY$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "get-long-only" attribute
         */
        public boolean isSetGetLongOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GETLONGONLY$4) != null;
            }
        }
        
        /**
         * Sets the "get-long-only" attribute
         */
        public void setGetLongOnly(com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId.GetLongOnly.Enum getLongOnly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GETLONGONLY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GETLONGONLY$4);
                }
                target.setEnumValue(getLongOnly);
            }
        }
        
        /**
         * Sets (as xml) the "get-long-only" attribute
         */
        public void xsetGetLongOnly(com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId.GetLongOnly getLongOnly)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId.GetLongOnly target = null;
                target = (com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId.GetLongOnly)get_store().find_attribute_user(GETLONGONLY$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId.GetLongOnly)get_store().add_attribute_user(GETLONGONLY$4);
                }
                target.set(getLongOnly);
            }
        }
        
        /**
         * Unsets the "get-long-only" attribute
         */
        public void unsetGetLongOnly()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GETLONGONLY$4);
            }
        }
        
        /**
         * Gets the "stagger-max" attribute
         */
        public java.lang.String getStaggerMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STAGGERMAX$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "stagger-max" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStaggerMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STAGGERMAX$6);
                return target;
            }
        }
        
        /**
         * True if has "stagger-max" attribute
         */
        public boolean isSetStaggerMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STAGGERMAX$6) != null;
            }
        }
        
        /**
         * Sets the "stagger-max" attribute
         */
        public void setStaggerMax(java.lang.String staggerMax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STAGGERMAX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STAGGERMAX$6);
                }
                target.setStringValue(staggerMax);
            }
        }
        
        /**
         * Sets (as xml) the "stagger-max" attribute
         */
        public void xsetStaggerMax(org.apache.xmlbeans.XmlString staggerMax)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STAGGERMAX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STAGGERMAX$6);
                }
                target.set(staggerMax);
            }
        }
        
        /**
         * Unsets the "stagger-max" attribute
         */
        public void unsetStaggerMax()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STAGGERMAX$6);
            }
        }
        /**
         * An XML get-long-only(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.SequencedIdDocument$SequencedId$GetLongOnly.
         */
        public static class GetLongOnlyImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.SequencedIdDocument.SequencedId.GetLongOnly
        {
            private static final long serialVersionUID = 1L;
            
            public GetLongOnlyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected GetLongOnlyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
