/*
 * An XML document type.
 * Localname: make-next-seq-id
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.MakeNextSeqIdDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one make-next-seq-id(@) element.
 *
 * This is a complex type.
 */
public class MakeNextSeqIdDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityMiscOperationsDocumentImpl implements com.kyt.xsd.simplemethods.MakeNextSeqIdDocument
{
    private static final long serialVersionUID = 1L;
    
    public MakeNextSeqIdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAKENEXTSEQID$0 = 
        new javax.xml.namespace.QName("", "make-next-seq-id");
    
    
    /**
     * Gets the "make-next-seq-id" element
     */
    public com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId getMakeNextSeqId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId target = null;
            target = (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId)get_store().find_element_user(MAKENEXTSEQID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "make-next-seq-id" element
     */
    public void setMakeNextSeqId(com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId makeNextSeqId)
    {
        generatedSetterHelperImpl(makeNextSeqId, MAKENEXTSEQID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "make-next-seq-id" element
     */
    public com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId addNewMakeNextSeqId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId target = null;
            target = (com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId)get_store().add_element_user(MAKENEXTSEQID$0);
            return target;
        }
    }
    /**
     * An XML make-next-seq-id(@).
     *
     * This is a complex type.
     */
    public static class MakeNextSeqIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.MakeNextSeqIdDocument.MakeNextSeqId
    {
        private static final long serialVersionUID = 1L;
        
        public MakeNextSeqIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUEFIELD$0 = 
            new javax.xml.namespace.QName("", "value-field");
        private static final javax.xml.namespace.QName SEQFIELDNAME$2 = 
            new javax.xml.namespace.QName("", "seq-field-name");
        private static final javax.xml.namespace.QName NUMERICPADDING$4 = 
            new javax.xml.namespace.QName("", "numeric-padding");
        private static final javax.xml.namespace.QName INCREMENTBY$6 = 
            new javax.xml.namespace.QName("", "increment-by");
        
        
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
         * Gets the "seq-field-name" attribute
         */
        public java.lang.String getSeqFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEQFIELDNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "seq-field-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSeqFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEQFIELDNAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "seq-field-name" attribute
         */
        public void setSeqFieldName(java.lang.String seqFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEQFIELDNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEQFIELDNAME$2);
                }
                target.setStringValue(seqFieldName);
            }
        }
        
        /**
         * Sets (as xml) the "seq-field-name" attribute
         */
        public void xsetSeqFieldName(org.apache.xmlbeans.XmlString seqFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEQFIELDNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SEQFIELDNAME$2);
                }
                target.set(seqFieldName);
            }
        }
        
        /**
         * Gets the "numeric-padding" attribute
         */
        public java.lang.String getNumericPadding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMERICPADDING$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NUMERICPADDING$4);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "numeric-padding" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNumericPadding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMERICPADDING$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(NUMERICPADDING$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "numeric-padding" attribute
         */
        public boolean isSetNumericPadding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NUMERICPADDING$4) != null;
            }
        }
        
        /**
         * Sets the "numeric-padding" attribute
         */
        public void setNumericPadding(java.lang.String numericPadding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMERICPADDING$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMERICPADDING$4);
                }
                target.setStringValue(numericPadding);
            }
        }
        
        /**
         * Sets (as xml) the "numeric-padding" attribute
         */
        public void xsetNumericPadding(org.apache.xmlbeans.XmlString numericPadding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NUMERICPADDING$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NUMERICPADDING$4);
                }
                target.set(numericPadding);
            }
        }
        
        /**
         * Unsets the "numeric-padding" attribute
         */
        public void unsetNumericPadding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NUMERICPADDING$4);
            }
        }
        
        /**
         * Gets the "increment-by" attribute
         */
        public java.lang.String getIncrementBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCREMENTBY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCREMENTBY$6);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "increment-by" attribute
         */
        public org.apache.xmlbeans.XmlString xgetIncrementBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INCREMENTBY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(INCREMENTBY$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "increment-by" attribute
         */
        public boolean isSetIncrementBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INCREMENTBY$6) != null;
            }
        }
        
        /**
         * Sets the "increment-by" attribute
         */
        public void setIncrementBy(java.lang.String incrementBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCREMENTBY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCREMENTBY$6);
                }
                target.setStringValue(incrementBy);
            }
        }
        
        /**
         * Sets (as xml) the "increment-by" attribute
         */
        public void xsetIncrementBy(org.apache.xmlbeans.XmlString incrementBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INCREMENTBY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INCREMENTBY$6);
                }
                target.set(incrementBy);
            }
        }
        
        /**
         * Unsets the "increment-by" attribute
         */
        public void unsetIncrementBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INCREMENTBY$6);
            }
        }
    }
}
