/*
 * An XML document type.
 * Localname: compare
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.CompareDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one compare(@) element.
 *
 * This is a complex type.
 */
public class CompareDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.CompareDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompareDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPARE$0 = 
        new javax.xml.namespace.QName("", "compare");
    
    
    /**
     * Gets the "compare" element
     */
    public com.kyt.xsd.simplemethods.CompareDocument.Compare getCompare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.CompareDocument.Compare target = null;
            target = (com.kyt.xsd.simplemethods.CompareDocument.Compare)get_store().find_element_user(COMPARE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "compare" element
     */
    public void setCompare(com.kyt.xsd.simplemethods.CompareDocument.Compare compare)
    {
        generatedSetterHelperImpl(compare, COMPARE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "compare" element
     */
    public com.kyt.xsd.simplemethods.CompareDocument.Compare addNewCompare()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.CompareDocument.Compare target = null;
            target = (com.kyt.xsd.simplemethods.CompareDocument.Compare)get_store().add_element_user(COMPARE$0);
            return target;
        }
    }
    /**
     * An XML compare(@).
     *
     * This is a complex type.
     */
    public static class CompareImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.CompareDocument.Compare
    {
        private static final long serialVersionUID = 1L;
        
        public CompareImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FAILMESSAGE$0 = 
            new javax.xml.namespace.QName("", "fail-message");
        private static final javax.xml.namespace.QName FAILPROPERTY$2 = 
            new javax.xml.namespace.QName("", "fail-property");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
        private static final javax.xml.namespace.QName FORMAT$6 = 
            new javax.xml.namespace.QName("", "format");
        private static final javax.xml.namespace.QName OPERATOR$8 = 
            new javax.xml.namespace.QName("", "operator");
        private static final javax.xml.namespace.QName TYPE$10 = 
            new javax.xml.namespace.QName("", "type");
        
        
        /**
         * Gets the "fail-message" element
         */
        public com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage getFailMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage target = null;
                target = (com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage)get_store().find_element_user(FAILMESSAGE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fail-message" element
         */
        public boolean isSetFailMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FAILMESSAGE$0) != 0;
            }
        }
        
        /**
         * Sets the "fail-message" element
         */
        public void setFailMessage(com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage failMessage)
        {
            generatedSetterHelperImpl(failMessage, FAILMESSAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fail-message" element
         */
        public com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage addNewFailMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage target = null;
                target = (com.kyt.xsd.simplemethods.FailMessageDocument.FailMessage)get_store().add_element_user(FAILMESSAGE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "fail-message" element
         */
        public void unsetFailMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FAILMESSAGE$0, 0);
            }
        }
        
        /**
         * Gets the "fail-property" element
         */
        public com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty getFailProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty target = null;
                target = (com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty)get_store().find_element_user(FAILPROPERTY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "fail-property" element
         */
        public boolean isSetFailProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FAILPROPERTY$2) != 0;
            }
        }
        
        /**
         * Sets the "fail-property" element
         */
        public void setFailProperty(com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty failProperty)
        {
            generatedSetterHelperImpl(failProperty, FAILPROPERTY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "fail-property" element
         */
        public com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty addNewFailProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty target = null;
                target = (com.kyt.xsd.simplemethods.FailPropertyDocument.FailProperty)get_store().add_element_user(FAILPROPERTY$2);
                return target;
            }
        }
        
        /**
         * Unsets the "fail-property" element
         */
        public void unsetFailProperty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FAILPROPERTY$2, 0);
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
         * Gets the "format" attribute
         */
        public java.lang.String getFormat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$6);
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
                return get_store().find_attribute_user(FORMAT$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMAT$6);
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
                get_store().remove_attribute(FORMAT$6);
            }
        }
        
        /**
         * Gets the "operator" attribute
         */
        public com.kyt.xsd.simplemethods.CompareDocument.Compare.Operator.Enum getOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$8);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.simplemethods.CompareDocument.Compare.Operator.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "operator" attribute
         */
        public com.kyt.xsd.simplemethods.CompareDocument.Compare.Operator xgetOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CompareDocument.Compare.Operator target = null;
                target = (com.kyt.xsd.simplemethods.CompareDocument.Compare.Operator)get_store().find_attribute_user(OPERATOR$8);
                return target;
            }
        }
        
        /**
         * Sets the "operator" attribute
         */
        public void setOperator(com.kyt.xsd.simplemethods.CompareDocument.Compare.Operator.Enum operator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$8);
                }
                target.setEnumValue(operator);
            }
        }
        
        /**
         * Sets (as xml) the "operator" attribute
         */
        public void xsetOperator(com.kyt.xsd.simplemethods.CompareDocument.Compare.Operator operator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CompareDocument.Compare.Operator target = null;
                target = (com.kyt.xsd.simplemethods.CompareDocument.Compare.Operator)get_store().find_attribute_user(OPERATOR$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.CompareDocument.Compare.Operator)get_store().add_attribute_user(OPERATOR$8);
                }
                target.set(operator);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public com.kyt.xsd.simplemethods.CompareDocument.Compare.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.simplemethods.CompareDocument.Compare.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.simplemethods.CompareDocument.Compare.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CompareDocument.Compare.Type target = null;
                target = (com.kyt.xsd.simplemethods.CompareDocument.Compare.Type)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.CompareDocument.Compare.Type)get_default_attribute_value(TYPE$10);
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
                return get_store().find_attribute_user(TYPE$10) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.kyt.xsd.simplemethods.CompareDocument.Compare.Type.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$10);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(com.kyt.xsd.simplemethods.CompareDocument.Compare.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CompareDocument.Compare.Type target = null;
                target = (com.kyt.xsd.simplemethods.CompareDocument.Compare.Type)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.CompareDocument.Compare.Type)get_store().add_attribute_user(TYPE$10);
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
                get_store().remove_attribute(TYPE$10);
            }
        }
        /**
         * An XML operator(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.CompareDocument$Compare$Operator.
         */
        public static class OperatorImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.CompareDocument.Compare.Operator
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
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.CompareDocument$Compare$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.CompareDocument.Compare.Type
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
