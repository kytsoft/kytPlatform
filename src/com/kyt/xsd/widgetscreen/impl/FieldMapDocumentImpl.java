/*
 * An XML document type.
 * Localname: field-map
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.FieldMapDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one field-map(@) element.
 *
 * This is a complex type.
 */
public class FieldMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.FieldMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public FieldMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDMAP$0 = 
        new javax.xml.namespace.QName("", "field-map");
    
    
    /**
     * Gets the "field-map" element
     */
    public com.kyt.xsd.widgetscreen.FieldMapDocument.FieldMap getFieldMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.FieldMapDocument.FieldMap target = null;
            target = (com.kyt.xsd.widgetscreen.FieldMapDocument.FieldMap)get_store().find_element_user(FIELDMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "field-map" element
     */
    public void setFieldMap(com.kyt.xsd.widgetscreen.FieldMapDocument.FieldMap fieldMap)
    {
        generatedSetterHelperImpl(fieldMap, FIELDMAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "field-map" element
     */
    public com.kyt.xsd.widgetscreen.FieldMapDocument.FieldMap addNewFieldMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.FieldMapDocument.FieldMap target = null;
            target = (com.kyt.xsd.widgetscreen.FieldMapDocument.FieldMap)get_store().add_element_user(FIELDMAP$0);
            return target;
        }
    }
    /**
     * An XML field-map(@).
     *
     * This is a complex type.
     */
    public static class FieldMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.FieldMapDocument.FieldMap
    {
        private static final long serialVersionUID = 1L;
        
        public FieldMapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELDNAME$0 = 
            new javax.xml.namespace.QName("", "field-name");
        private static final javax.xml.namespace.QName FROMFIELD$2 = 
            new javax.xml.namespace.QName("", "from-field");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "field-name" attribute
         */
        public java.lang.String getFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "field-name" attribute
         */
        public void setFieldName(java.lang.String fieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDNAME$0);
                }
                target.setStringValue(fieldName);
            }
        }
        
        /**
         * Sets (as xml) the "field-name" attribute
         */
        public void xsetFieldName(org.apache.xmlbeans.XmlString fieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDNAME$0);
                }
                target.set(fieldName);
            }
        }
        
        /**
         * Gets the "from-field" attribute
         */
        public java.lang.String getFromField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROMFIELD$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "from-field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFromField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROMFIELD$2);
                return target;
            }
        }
        
        /**
         * True if has "from-field" attribute
         */
        public boolean isSetFromField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FROMFIELD$2) != null;
            }
        }
        
        /**
         * Sets the "from-field" attribute
         */
        public void setFromField(java.lang.String fromField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROMFIELD$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FROMFIELD$2);
                }
                target.setStringValue(fromField);
            }
        }
        
        /**
         * Sets (as xml) the "from-field" attribute
         */
        public void xsetFromField(org.apache.xmlbeans.XmlString fromField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROMFIELD$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FROMFIELD$2);
                }
                target.set(fromField);
            }
        }
        
        /**
         * Unsets the "from-field" attribute
         */
        public void unsetFromField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FROMFIELD$2);
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
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$4) != null;
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
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$4);
            }
        }
    }
}
