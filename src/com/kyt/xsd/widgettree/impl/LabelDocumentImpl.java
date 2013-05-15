/*
 * An XML document type.
 * Localname: label
 * Namespace: 
 * Java type: com.kyt.xsd.widgettree.LabelDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgettree.impl;
/**
 * A document containing one label(@) element.
 *
 * This is a complex type.
 */
public class LabelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.LabelDocument
{
    private static final long serialVersionUID = 1L;
    
    public LabelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABEL$0 = 
        new javax.xml.namespace.QName("", "label");
    
    
    /**
     * Gets the "label" element
     */
    public com.kyt.xsd.widgettree.LabelDocument.Label getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.LabelDocument.Label target = null;
            target = (com.kyt.xsd.widgettree.LabelDocument.Label)get_store().find_element_user(LABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "label" element
     */
    public void setLabel(com.kyt.xsd.widgettree.LabelDocument.Label label)
    {
        generatedSetterHelperImpl(label, LABEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "label" element
     */
    public com.kyt.xsd.widgettree.LabelDocument.Label addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.LabelDocument.Label target = null;
            target = (com.kyt.xsd.widgettree.LabelDocument.Label)get_store().add_element_user(LABEL$0);
            return target;
        }
    }
    /**
     * An XML label(@).
     *
     * This is a complex type.
     */
    public static class LabelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.LabelDocument.Label
    {
        private static final long serialVersionUID = 1L;
        
        public LabelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TEXT$0 = 
            new javax.xml.namespace.QName("", "text");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName STYLE$4 = 
            new javax.xml.namespace.QName("", "style");
        
        
        /**
         * Gets the "text" attribute
         */
        public java.lang.String getText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text" attribute
         */
        public org.apache.xmlbeans.XmlString xgetText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXT$0);
                return target;
            }
        }
        
        /**
         * True if has "text" attribute
         */
        public boolean isSetText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEXT$0) != null;
            }
        }
        
        /**
         * Sets the "text" attribute
         */
        public void setText(java.lang.String text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXT$0);
                }
                target.setStringValue(text);
            }
        }
        
        /**
         * Sets (as xml) the "text" attribute
         */
        public void xsetText(org.apache.xmlbeans.XmlString text)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXT$0);
                }
                target.set(text);
            }
        }
        
        /**
         * Unsets the "text" attribute
         */
        public void unsetText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEXT$0);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$2) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$2);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$2);
            }
        }
        
        /**
         * Gets the "style" attribute
         */
        public java.lang.String getStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$4);
                return target;
            }
        }
        
        /**
         * True if has "style" attribute
         */
        public boolean isSetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STYLE$4) != null;
            }
        }
        
        /**
         * Sets the "style" attribute
         */
        public void setStyle(java.lang.String style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$4);
                }
                target.setStringValue(style);
            }
        }
        
        /**
         * Sets (as xml) the "style" attribute
         */
        public void xsetStyle(org.apache.xmlbeans.XmlString style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STYLE$4);
                }
                target.set(style);
            }
        }
        
        /**
         * Unsets the "style" attribute
         */
        public void unsetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STYLE$4);
            }
        }
    }
}
