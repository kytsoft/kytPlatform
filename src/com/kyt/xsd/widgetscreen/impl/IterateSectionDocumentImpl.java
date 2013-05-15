/*
 * An XML document type.
 * Localname: iterate-section
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.IterateSectionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one iterate-section(@) element.
 *
 * This is a complex type.
 */
public class IterateSectionDocumentImpl extends com.kyt.xsd.widgetscreen.impl.AllWidgetsDocumentImpl implements com.kyt.xsd.widgetscreen.IterateSectionDocument
{
    private static final long serialVersionUID = 1L;
    
    public IterateSectionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITERATESECTION$0 = 
        new javax.xml.namespace.QName("", "iterate-section");
    
    
    /**
     * Gets the "iterate-section" element
     */
    public com.kyt.xsd.widgetscreen.IterateSectionDocument.IterateSection getIterateSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.IterateSectionDocument.IterateSection target = null;
            target = (com.kyt.xsd.widgetscreen.IterateSectionDocument.IterateSection)get_store().find_element_user(ITERATESECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "iterate-section" element
     */
    public void setIterateSection(com.kyt.xsd.widgetscreen.IterateSectionDocument.IterateSection iterateSection)
    {
        generatedSetterHelperImpl(iterateSection, ITERATESECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "iterate-section" element
     */
    public com.kyt.xsd.widgetscreen.IterateSectionDocument.IterateSection addNewIterateSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.IterateSectionDocument.IterateSection target = null;
            target = (com.kyt.xsd.widgetscreen.IterateSectionDocument.IterateSection)get_store().add_element_user(ITERATESECTION$0);
            return target;
        }
    }
    /**
     * An XML iterate-section(@).
     *
     * This is a complex type.
     */
    public static class IterateSectionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.IterateSectionDocument.IterateSection
    {
        private static final long serialVersionUID = 1L;
        
        public IterateSectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECTION$0 = 
            new javax.xml.namespace.QName("", "section");
        private static final javax.xml.namespace.QName ENTRY$2 = 
            new javax.xml.namespace.QName("", "entry");
        private static final javax.xml.namespace.QName LIST$4 = 
            new javax.xml.namespace.QName("", "list");
        private static final javax.xml.namespace.QName KEY$6 = 
            new javax.xml.namespace.QName("", "key");
        private static final javax.xml.namespace.QName VIEWSIZE$8 = 
            new javax.xml.namespace.QName("", "view-size");
        private static final javax.xml.namespace.QName PAGINATETARGET$10 = 
            new javax.xml.namespace.QName("", "paginate-target");
        private static final javax.xml.namespace.QName PAGINATE$12 = 
            new javax.xml.namespace.QName("", "paginate");
        
        
        /**
         * Gets array of all "section" elements
         */
        public com.kyt.xsd.widgetscreen.SectionDocument.Section[] getSectionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SECTION$0, targetList);
                com.kyt.xsd.widgetscreen.SectionDocument.Section[] result = new com.kyt.xsd.widgetscreen.SectionDocument.Section[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "section" element
         */
        public com.kyt.xsd.widgetscreen.SectionDocument.Section getSectionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SectionDocument.Section target = null;
                target = (com.kyt.xsd.widgetscreen.SectionDocument.Section)get_store().find_element_user(SECTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "section" element
         */
        public int sizeOfSectionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SECTION$0);
            }
        }
        
        /**
         * Sets array of all "section" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSectionArray(com.kyt.xsd.widgetscreen.SectionDocument.Section[] sectionArray)
        {
            check_orphaned();
            arraySetterHelper(sectionArray, SECTION$0);
        }
        
        /**
         * Sets ith "section" element
         */
        public void setSectionArray(int i, com.kyt.xsd.widgetscreen.SectionDocument.Section section)
        {
            generatedSetterHelperImpl(section, SECTION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "section" element
         */
        public com.kyt.xsd.widgetscreen.SectionDocument.Section insertNewSection(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SectionDocument.Section target = null;
                target = (com.kyt.xsd.widgetscreen.SectionDocument.Section)get_store().insert_element_user(SECTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "section" element
         */
        public com.kyt.xsd.widgetscreen.SectionDocument.Section addNewSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SectionDocument.Section target = null;
                target = (com.kyt.xsd.widgetscreen.SectionDocument.Section)get_store().add_element_user(SECTION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "section" element
         */
        public void removeSection(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SECTION$0, i);
            }
        }
        
        /**
         * Gets the "entry" attribute
         */
        public java.lang.String getEntry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTRY$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entry" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEntry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTRY$2);
                return target;
            }
        }
        
        /**
         * Sets the "entry" attribute
         */
        public void setEntry(java.lang.String entry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTRY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTRY$2);
                }
                target.setStringValue(entry);
            }
        }
        
        /**
         * Sets (as xml) the "entry" attribute
         */
        public void xsetEntry(org.apache.xmlbeans.XmlString entry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTRY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTRY$2);
                }
                target.set(entry);
            }
        }
        
        /**
         * Gets the "list" attribute
         */
        public java.lang.String getList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "list" attribute
         */
        public org.apache.xmlbeans.XmlString xgetList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$4);
                return target;
            }
        }
        
        /**
         * Sets the "list" attribute
         */
        public void setList(java.lang.String list)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIST$4);
                }
                target.setStringValue(list);
            }
        }
        
        /**
         * Sets (as xml) the "list" attribute
         */
        public void xsetList(org.apache.xmlbeans.XmlString list)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIST$4);
                }
                target.set(list);
            }
        }
        
        /**
         * Gets the "key" attribute
         */
        public java.lang.String getKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "key" attribute
         */
        public org.apache.xmlbeans.XmlString xgetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$6);
                return target;
            }
        }
        
        /**
         * True if has "key" attribute
         */
        public boolean isSetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(KEY$6) != null;
            }
        }
        
        /**
         * Sets the "key" attribute
         */
        public void setKey(java.lang.String key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEY$6);
                }
                target.setStringValue(key);
            }
        }
        
        /**
         * Sets (as xml) the "key" attribute
         */
        public void xsetKey(org.apache.xmlbeans.XmlString key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEY$6);
                }
                target.set(key);
            }
        }
        
        /**
         * Unsets the "key" attribute
         */
        public void unsetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(KEY$6);
            }
        }
        
        /**
         * Gets the "view-size" attribute
         */
        public java.lang.String getViewSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWSIZE$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "view-size" attribute
         */
        public org.apache.xmlbeans.XmlString xgetViewSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIEWSIZE$8);
                return target;
            }
        }
        
        /**
         * True if has "view-size" attribute
         */
        public boolean isSetViewSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VIEWSIZE$8) != null;
            }
        }
        
        /**
         * Sets the "view-size" attribute
         */
        public void setViewSize(java.lang.String viewSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWSIZE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIEWSIZE$8);
                }
                target.setStringValue(viewSize);
            }
        }
        
        /**
         * Sets (as xml) the "view-size" attribute
         */
        public void xsetViewSize(org.apache.xmlbeans.XmlString viewSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VIEWSIZE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VIEWSIZE$8);
                }
                target.set(viewSize);
            }
        }
        
        /**
         * Unsets the "view-size" attribute
         */
        public void unsetViewSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VIEWSIZE$8);
            }
        }
        
        /**
         * Gets the "paginate-target" attribute
         */
        public java.lang.String getPaginateTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATETARGET$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paginate-target" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPaginateTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATETARGET$10);
                return target;
            }
        }
        
        /**
         * True if has "paginate-target" attribute
         */
        public boolean isSetPaginateTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGINATETARGET$10) != null;
            }
        }
        
        /**
         * Sets the "paginate-target" attribute
         */
        public void setPaginateTarget(java.lang.String paginateTarget)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATETARGET$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINATETARGET$10);
                }
                target.setStringValue(paginateTarget);
            }
        }
        
        /**
         * Sets (as xml) the "paginate-target" attribute
         */
        public void xsetPaginateTarget(org.apache.xmlbeans.XmlString paginateTarget)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATETARGET$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGINATETARGET$10);
                }
                target.set(paginateTarget);
            }
        }
        
        /**
         * Unsets the "paginate-target" attribute
         */
        public void unsetPaginateTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGINATETARGET$10);
            }
        }
        
        /**
         * Gets the "paginate" attribute
         */
        public java.lang.String getPaginate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PAGINATE$12);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paginate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPaginate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(PAGINATE$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "paginate" attribute
         */
        public boolean isSetPaginate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGINATE$12) != null;
            }
        }
        
        /**
         * Sets the "paginate" attribute
         */
        public void setPaginate(java.lang.String paginate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINATE$12);
                }
                target.setStringValue(paginate);
            }
        }
        
        /**
         * Sets (as xml) the "paginate" attribute
         */
        public void xsetPaginate(org.apache.xmlbeans.XmlString paginate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGINATE$12);
                }
                target.set(paginate);
            }
        }
        
        /**
         * Unsets the "paginate" attribute
         */
        public void unsetPaginate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGINATE$12);
            }
        }
    }
}
