/*
 * An XML document type.
 * Localname: if-compare
 * Namespace: 
 * Java type: com.kyt.xsd.widgettree.IfCompareDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgettree.impl;
/**
 * A document containing one if-compare(@) element.
 *
 * This is a complex type.
 */
public class IfCompareDocumentImpl extends com.kyt.xsd.widgettree.impl.AllConditionalsDocumentImpl implements com.kyt.xsd.widgettree.IfCompareDocument
{
    private static final long serialVersionUID = 1L;
    
    public IfCompareDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IFCOMPARE$0 = 
        new javax.xml.namespace.QName("", "if-compare");
    
    
    /**
     * Gets the "if-compare" element
     */
    public com.kyt.xsd.widgettree.IfCompareDocument.IfCompare getIfCompare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.IfCompareDocument.IfCompare target = null;
            target = (com.kyt.xsd.widgettree.IfCompareDocument.IfCompare)get_store().find_element_user(IFCOMPARE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "if-compare" element
     */
    public void setIfCompare(com.kyt.xsd.widgettree.IfCompareDocument.IfCompare ifCompare)
    {
        generatedSetterHelperImpl(ifCompare, IFCOMPARE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "if-compare" element
     */
    public com.kyt.xsd.widgettree.IfCompareDocument.IfCompare addNewIfCompare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.IfCompareDocument.IfCompare target = null;
            target = (com.kyt.xsd.widgettree.IfCompareDocument.IfCompare)get_store().add_element_user(IFCOMPARE$0);
            return target;
        }
    }
    /**
     * An XML if-compare(@).
     *
     * This is a complex type.
     */
    public static class IfCompareImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.IfCompareDocument.IfCompare
    {
        private static final long serialVersionUID = 1L;
        
        public IfCompareImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELD$0 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName OPERATOR$2 = 
            new javax.xml.namespace.QName("", "operator");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName FORMAT$8 = 
            new javax.xml.namespace.QName("", "format");
        
        
        /**
         * Gets the "field" attribute
         */
        public java.lang.String getField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELD$0);
                }
                target.set(field);
            }
        }
        
        /**
         * Gets the "operator" attribute
         */
        public com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Operator.Enum getOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$2);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Operator.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "operator" attribute
         */
        public com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Operator xgetOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Operator target = null;
                target = (com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Operator)get_store().find_attribute_user(OPERATOR$2);
                return target;
            }
        }
        
        /**
         * Sets the "operator" attribute
         */
        public void setOperator(com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Operator.Enum operator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$2);
                }
                target.setEnumValue(operator);
            }
        }
        
        /**
         * Sets (as xml) the "operator" attribute
         */
        public void xsetOperator(com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Operator operator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Operator target = null;
                target = (com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Operator)get_store().find_attribute_user(OPERATOR$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Operator)get_store().add_attribute_user(OPERATOR$2);
                }
                target.set(operator);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$4);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$4);
                }
                target.set(value);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$6);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Type target = null;
                target = (com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Type)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Type)get_default_attribute_value(TYPE$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$6) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Type.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Type target = null;
                target = (com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Type)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Type)get_store().add_attribute_user(TYPE$6);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$6);
            }
        }
        
        /**
         * Gets the "format" attribute
         */
        public java.lang.String getFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "format" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$8);
                return target;
            }
        }
        
        /**
         * True if has "format" attribute
         */
        public boolean isSetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FORMAT$8) != null;
            }
        }
        
        /**
         * Sets the "format" attribute
         */
        public void setFormat(java.lang.String format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$8);
                }
                target.setStringValue(format);
            }
        }
        
        /**
         * Sets (as xml) the "format" attribute
         */
        public void xsetFormat(org.apache.xmlbeans.XmlString format)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMAT$8);
                }
                target.set(format);
            }
        }
        
        /**
         * Unsets the "format" attribute
         */
        public void unsetFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FORMAT$8);
            }
        }
        /**
         * An XML operator(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.IfCompareDocument$IfCompare$Operator.
         */
        public static class OperatorImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Operator
        {
            private static final long serialVersionUID = 1L;
            
            public OperatorImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected OperatorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.IfCompareDocument$IfCompare$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgettree.IfCompareDocument.IfCompare.Type
        {
            private static final long serialVersionUID = 1L;
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
