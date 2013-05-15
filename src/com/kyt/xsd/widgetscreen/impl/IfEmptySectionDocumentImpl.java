/*
 * An XML document type.
 * Localname: if-empty-section
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.IfEmptySectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one if-empty-section(@) element.
 *
 * This is a complex type.
 */
public class IfEmptySectionDocumentImpl extends com.kyt.xsd.widgetscreen.impl.AllConditionalsDocumentImpl implements com.kyt.xsd.widgetscreen.IfEmptySectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public IfEmptySectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IFEMPTYSECTION$0 = 
        new javax.xml.namespace.QName("", "if-empty-section");
    
    
    /**
     * Gets the "if-empty-section" element
     */
    public com.kyt.xsd.widgetscreen.IfEmptySectionDocument.IfEmptySection getIfEmptySection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.IfEmptySectionDocument.IfEmptySection target = null;
            target = (com.kyt.xsd.widgetscreen.IfEmptySectionDocument.IfEmptySection)get_store().find_element_user(IFEMPTYSECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "if-empty-section" element
     */
    public void setIfEmptySection(com.kyt.xsd.widgetscreen.IfEmptySectionDocument.IfEmptySection ifEmptySection)
    {
        generatedSetterHelperImpl(ifEmptySection, IFEMPTYSECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "if-empty-section" element
     */
    public com.kyt.xsd.widgetscreen.IfEmptySectionDocument.IfEmptySection addNewIfEmptySection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.IfEmptySectionDocument.IfEmptySection target = null;
            target = (com.kyt.xsd.widgetscreen.IfEmptySectionDocument.IfEmptySection)get_store().add_element_user(IFEMPTYSECTION$0);
            return target;
        }
    }
    /**
     * An XML if-empty-section(@).
     *
     * This is a complex type.
     */
    public static class IfEmptySectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.IfEmptySectionDocument.IfEmptySection
    {
        private static final long serialVersionUID = 1L;
        
        public IfEmptySectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECTIONNAME$0 = 
            new javax.xml.namespace.QName("", "section-name");
        
        
        /**
         * Gets the "section-name" attribute
         */
        public java.lang.String getSectionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECTIONNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "section-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSectionName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECTIONNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "section-name" attribute
         */
        public void setSectionName(java.lang.String sectionName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SECTIONNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SECTIONNAME$0);
                }
                target.setStringValue(sectionName);
            }
        }
        
        /**
         * Sets (as xml) the "section-name" attribute
         */
        public void xsetSectionName(org.apache.xmlbeans.XmlString sectionName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SECTIONNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SECTIONNAME$0);
                }
                target.set(sectionName);
            }
        }
    }
}
