/*
 * An XML document type.
 * Localname: filter-list-by-date
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.FilterListByDateDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one filter-list-by-date(@) element.
 *
 * This is a complex type.
 */
public class FilterListByDateDocumentImpl extends com.kyt.xsd.simplemethods.impl.EntityFindOperationsDocumentImpl implements com.kyt.xsd.simplemethods.FilterListByDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public FilterListByDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTERLISTBYDATE$0 = 
        new javax.xml.namespace.QName("", "filter-list-by-date");
    
    
    /**
     * Gets the "filter-list-by-date" element
     */
    public com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate getFilterListByDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate target = null;
            target = (com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate)get_store().find_element_user(FILTERLISTBYDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "filter-list-by-date" element
     */
    public void setFilterListByDate(com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate filterListByDate)
    {
        generatedSetterHelperImpl(filterListByDate, FILTERLISTBYDATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "filter-list-by-date" element
     */
    public com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate addNewFilterListByDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate target = null;
            target = (com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate)get_store().add_element_user(FILTERLISTBYDATE$0);
            return target;
        }
    }
    /**
     * An XML filter-list-by-date(@).
     *
     * This is a complex type.
     */
    public static class FilterListByDateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate
    {
        private static final long serialVersionUID = 1L;
        
        public FilterListByDateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LIST$0 = 
            new javax.xml.namespace.QName("", "list");
        private static final javax.xml.namespace.QName TOLIST$2 = 
            new javax.xml.namespace.QName("", "to-list");
        private static final javax.xml.namespace.QName VALIDDATE$4 = 
            new javax.xml.namespace.QName("", "valid-date");
        private static final javax.xml.namespace.QName FROMFIELDNAME$6 = 
            new javax.xml.namespace.QName("", "from-field-name");
        private static final javax.xml.namespace.QName THRUFIELDNAME$8 = 
            new javax.xml.namespace.QName("", "thru-field-name");
        private static final javax.xml.namespace.QName ALLSAME$10 = 
            new javax.xml.namespace.QName("", "all-same");
        
        
        /**
         * Gets the "list" attribute
         */
        public java.lang.String getList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LIST$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LIST$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LIST$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LIST$0);
                }
                target.set(list);
            }
        }
        
        /**
         * Gets the "to-list" attribute
         */
        public java.lang.String getToList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOLIST$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "to-list" attribute
         */
        public org.apache.xmlbeans.XmlString xgetToList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOLIST$2);
                return target;
            }
        }
        
        /**
         * True if has "to-list" attribute
         */
        public boolean isSetToList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TOLIST$2) != null;
            }
        }
        
        /**
         * Sets the "to-list" attribute
         */
        public void setToList(java.lang.String toList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOLIST$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOLIST$2);
                }
                target.setStringValue(toList);
            }
        }
        
        /**
         * Sets (as xml) the "to-list" attribute
         */
        public void xsetToList(org.apache.xmlbeans.XmlString toList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOLIST$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOLIST$2);
                }
                target.set(toList);
            }
        }
        
        /**
         * Unsets the "to-list" attribute
         */
        public void unsetToList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TOLIST$2);
            }
        }
        
        /**
         * Gets the "valid-date" attribute
         */
        public java.lang.String getValidDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDDATE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "valid-date" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValidDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALIDDATE$4);
                return target;
            }
        }
        
        /**
         * True if has "valid-date" attribute
         */
        public boolean isSetValidDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALIDDATE$4) != null;
            }
        }
        
        /**
         * Sets the "valid-date" attribute
         */
        public void setValidDate(java.lang.String validDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDDATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDDATE$4);
                }
                target.setStringValue(validDate);
            }
        }
        
        /**
         * Sets (as xml) the "valid-date" attribute
         */
        public void xsetValidDate(org.apache.xmlbeans.XmlString validDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALIDDATE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALIDDATE$4);
                }
                target.set(validDate);
            }
        }
        
        /**
         * Unsets the "valid-date" attribute
         */
        public void unsetValidDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALIDDATE$4);
            }
        }
        
        /**
         * Gets the "from-field-name" attribute
         */
        public java.lang.String getFromFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROMFIELDNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FROMFIELDNAME$6);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "from-field-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFromFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROMFIELDNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(FROMFIELDNAME$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "from-field-name" attribute
         */
        public boolean isSetFromFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FROMFIELDNAME$6) != null;
            }
        }
        
        /**
         * Sets the "from-field-name" attribute
         */
        public void setFromFieldName(java.lang.String fromFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FROMFIELDNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FROMFIELDNAME$6);
                }
                target.setStringValue(fromFieldName);
            }
        }
        
        /**
         * Sets (as xml) the "from-field-name" attribute
         */
        public void xsetFromFieldName(org.apache.xmlbeans.XmlString fromFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FROMFIELDNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FROMFIELDNAME$6);
                }
                target.set(fromFieldName);
            }
        }
        
        /**
         * Unsets the "from-field-name" attribute
         */
        public void unsetFromFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FROMFIELDNAME$6);
            }
        }
        
        /**
         * Gets the "thru-field-name" attribute
         */
        public java.lang.String getThruFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THRUFIELDNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(THRUFIELDNAME$8);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "thru-field-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetThruFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THRUFIELDNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(THRUFIELDNAME$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "thru-field-name" attribute
         */
        public boolean isSetThruFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(THRUFIELDNAME$8) != null;
            }
        }
        
        /**
         * Sets the "thru-field-name" attribute
         */
        public void setThruFieldName(java.lang.String thruFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(THRUFIELDNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(THRUFIELDNAME$8);
                }
                target.setStringValue(thruFieldName);
            }
        }
        
        /**
         * Sets (as xml) the "thru-field-name" attribute
         */
        public void xsetThruFieldName(org.apache.xmlbeans.XmlString thruFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(THRUFIELDNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(THRUFIELDNAME$8);
                }
                target.set(thruFieldName);
            }
        }
        
        /**
         * Unsets the "thru-field-name" attribute
         */
        public void unsetThruFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(THRUFIELDNAME$8);
            }
        }
        
        /**
         * Gets the "all-same" attribute
         */
        public com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate.AllSame.Enum getAllSame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLSAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALLSAME$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate.AllSame.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "all-same" attribute
         */
        public com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate.AllSame xgetAllSame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate.AllSame target = null;
                target = (com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate.AllSame)get_store().find_attribute_user(ALLSAME$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate.AllSame)get_default_attribute_value(ALLSAME$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "all-same" attribute
         */
        public boolean isSetAllSame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ALLSAME$10) != null;
            }
        }
        
        /**
         * Sets the "all-same" attribute
         */
        public void setAllSame(com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate.AllSame.Enum allSame)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLSAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLSAME$10);
                }
                target.setEnumValue(allSame);
            }
        }
        
        /**
         * Sets (as xml) the "all-same" attribute
         */
        public void xsetAllSame(com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate.AllSame allSame)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate.AllSame target = null;
                target = (com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate.AllSame)get_store().find_attribute_user(ALLSAME$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate.AllSame)get_store().add_attribute_user(ALLSAME$10);
                }
                target.set(allSame);
            }
        }
        
        /**
         * Unsets the "all-same" attribute
         */
        public void unsetAllSame()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ALLSAME$10);
            }
        }
        /**
         * An XML all-same(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.FilterListByDateDocument$FilterListByDate$AllSame.
         */
        public static class AllSameImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.FilterListByDateDocument.FilterListByDate.AllSame
        {
            private static final long serialVersionUID = 1L;
            
            public AllSameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AllSameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
