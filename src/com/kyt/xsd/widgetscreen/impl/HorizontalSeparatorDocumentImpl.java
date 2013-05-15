/*
 * An XML document type.
 * Localname: horizontal-separator
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.HorizontalSeparatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one horizontal-separator(@) element.
 *
 * This is a complex type.
 */
public class HorizontalSeparatorDocumentImpl extends com.kyt.xsd.widgetscreen.impl.AllWidgetsDocumentImpl implements com.kyt.xsd.widgetscreen.HorizontalSeparatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public HorizontalSeparatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HORIZONTALSEPARATOR$0 = 
        new javax.xml.namespace.QName("", "horizontal-separator");
    
    
    /**
     * Gets the "horizontal-separator" element
     */
    public com.kyt.xsd.widgetscreen.HorizontalSeparatorDocument.HorizontalSeparator getHorizontalSeparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.HorizontalSeparatorDocument.HorizontalSeparator target = null;
            target = (com.kyt.xsd.widgetscreen.HorizontalSeparatorDocument.HorizontalSeparator)get_store().find_element_user(HORIZONTALSEPARATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "horizontal-separator" element
     */
    public void setHorizontalSeparator(com.kyt.xsd.widgetscreen.HorizontalSeparatorDocument.HorizontalSeparator horizontalSeparator)
    {
        generatedSetterHelperImpl(horizontalSeparator, HORIZONTALSEPARATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "horizontal-separator" element
     */
    public com.kyt.xsd.widgetscreen.HorizontalSeparatorDocument.HorizontalSeparator addNewHorizontalSeparator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.HorizontalSeparatorDocument.HorizontalSeparator target = null;
            target = (com.kyt.xsd.widgetscreen.HorizontalSeparatorDocument.HorizontalSeparator)get_store().add_element_user(HORIZONTALSEPARATOR$0);
            return target;
        }
    }
    /**
     * An XML horizontal-separator(@).
     *
     * This is a complex type.
     */
    public static class HorizontalSeparatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.HorizontalSeparatorDocument.HorizontalSeparator
    {
        private static final long serialVersionUID = 1L;
        
        public HorizontalSeparatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName STYLE$4 = 
            new javax.xml.namespace.QName("", "style");
        
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
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
                return get_store().find_attribute_user(ID$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$0);
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
                get_store().remove_attribute(ID$0);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                return target;
            }
        }
        
        /**
         * True if has "name" attribute
         */
        public boolean isSetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NAME$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Unsets the "name" attribute
         */
        public void unsetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NAME$2);
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
