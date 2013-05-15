/*
 * An XML document type.
 * Localname: auto-complete
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.AutoCompleteDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one auto-complete(@) element.
 *
 * This is a complex type.
 */
public class AutoCompleteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.AutoCompleteDocument
{
    private static final long serialVersionUID = 1L;
    
    public AutoCompleteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTOCOMPLETE$0 = 
        new javax.xml.namespace.QName("", "auto-complete");
    
    
    /**
     * Gets the "auto-complete" element
     */
    public com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete getAutoComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete target = null;
            target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete)get_store().find_element_user(AUTOCOMPLETE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "auto-complete" element
     */
    public void setAutoComplete(com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete autoComplete)
    {
        generatedSetterHelperImpl(autoComplete, AUTOCOMPLETE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "auto-complete" element
     */
    public com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete addNewAutoComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete target = null;
            target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete)get_store().add_element_user(AUTOCOMPLETE$0);
            return target;
        }
    }
    /**
     * An XML auto-complete(@).
     *
     * This is a complex type.
     */
    public static class AutoCompleteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete
    {
        private static final long serialVersionUID = 1L;
        
        public AutoCompleteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AUTOSELECT$0 = 
            new javax.xml.namespace.QName("", "auto-select");
        private static final javax.xml.namespace.QName FREQUENCY$2 = 
            new javax.xml.namespace.QName("", "frequency");
        private static final javax.xml.namespace.QName MINCHARS$4 = 
            new javax.xml.namespace.QName("", "min-chars");
        private static final javax.xml.namespace.QName CHOICES$6 = 
            new javax.xml.namespace.QName("", "choices");
        private static final javax.xml.namespace.QName PARTIALSEARCH$8 = 
            new javax.xml.namespace.QName("", "partial-search");
        private static final javax.xml.namespace.QName PARTIALCHARS$10 = 
            new javax.xml.namespace.QName("", "partial-chars");
        private static final javax.xml.namespace.QName IGNORECASE$12 = 
            new javax.xml.namespace.QName("", "ignore-case");
        private static final javax.xml.namespace.QName FULLSEARCH$14 = 
            new javax.xml.namespace.QName("", "full-search");
        
        
        /**
         * Gets the "auto-select" attribute
         */
        public com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.AutoSelect.Enum getAutoSelect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOSELECT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOSELECT$0);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.AutoSelect.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "auto-select" attribute
         */
        public com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.AutoSelect xgetAutoSelect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.AutoSelect target = null;
                target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.AutoSelect)get_store().find_attribute_user(AUTOSELECT$0);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.AutoSelect)get_default_attribute_value(AUTOSELECT$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "auto-select" attribute
         */
        public boolean isSetAutoSelect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AUTOSELECT$0) != null;
            }
        }
        
        /**
         * Sets the "auto-select" attribute
         */
        public void setAutoSelect(com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.AutoSelect.Enum autoSelect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOSELECT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOSELECT$0);
                }
                target.setEnumValue(autoSelect);
            }
        }
        
        /**
         * Sets (as xml) the "auto-select" attribute
         */
        public void xsetAutoSelect(com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.AutoSelect autoSelect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.AutoSelect target = null;
                target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.AutoSelect)get_store().find_attribute_user(AUTOSELECT$0);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.AutoSelect)get_store().add_attribute_user(AUTOSELECT$0);
                }
                target.set(autoSelect);
            }
        }
        
        /**
         * Unsets the "auto-select" attribute
         */
        public void unsetAutoSelect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AUTOSELECT$0);
            }
        }
        
        /**
         * Gets the "frequency" attribute
         */
        public double getFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FREQUENCY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FREQUENCY$2);
                }
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "frequency" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FREQUENCY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_default_attribute_value(FREQUENCY$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "frequency" attribute
         */
        public boolean isSetFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FREQUENCY$2) != null;
            }
        }
        
        /**
         * Sets the "frequency" attribute
         */
        public void setFrequency(double frequency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FREQUENCY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FREQUENCY$2);
                }
                target.setDoubleValue(frequency);
            }
        }
        
        /**
         * Sets (as xml) the "frequency" attribute
         */
        public void xsetFrequency(org.apache.xmlbeans.XmlDouble frequency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FREQUENCY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(FREQUENCY$2);
                }
                target.set(frequency);
            }
        }
        
        /**
         * Unsets the "frequency" attribute
         */
        public void unsetFrequency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FREQUENCY$2);
            }
        }
        
        /**
         * Gets the "min-chars" attribute
         */
        public java.math.BigInteger getMinChars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINCHARS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MINCHARS$4);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "min-chars" attribute
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetMinChars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(MINCHARS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_default_attribute_value(MINCHARS$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "min-chars" attribute
         */
        public boolean isSetMinChars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MINCHARS$4) != null;
            }
        }
        
        /**
         * Sets the "min-chars" attribute
         */
        public void setMinChars(java.math.BigInteger minChars)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINCHARS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINCHARS$4);
                }
                target.setBigIntegerValue(minChars);
            }
        }
        
        /**
         * Sets (as xml) the "min-chars" attribute
         */
        public void xsetMinChars(org.apache.xmlbeans.XmlPositiveInteger minChars)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(MINCHARS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(MINCHARS$4);
                }
                target.set(minChars);
            }
        }
        
        /**
         * Unsets the "min-chars" attribute
         */
        public void unsetMinChars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MINCHARS$4);
            }
        }
        
        /**
         * Gets the "choices" attribute
         */
        public java.math.BigInteger getChoices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHOICES$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CHOICES$6);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "choices" attribute
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetChoices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(CHOICES$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_default_attribute_value(CHOICES$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "choices" attribute
         */
        public boolean isSetChoices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CHOICES$6) != null;
            }
        }
        
        /**
         * Sets the "choices" attribute
         */
        public void setChoices(java.math.BigInteger choices)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHOICES$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHOICES$6);
                }
                target.setBigIntegerValue(choices);
            }
        }
        
        /**
         * Sets (as xml) the "choices" attribute
         */
        public void xsetChoices(org.apache.xmlbeans.XmlPositiveInteger choices)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(CHOICES$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(CHOICES$6);
                }
                target.set(choices);
            }
        }
        
        /**
         * Unsets the "choices" attribute
         */
        public void unsetChoices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CHOICES$6);
            }
        }
        
        /**
         * Gets the "partial-search" attribute
         */
        public com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.PartialSearch.Enum getPartialSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTIALSEARCH$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTIALSEARCH$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.PartialSearch.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "partial-search" attribute
         */
        public com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.PartialSearch xgetPartialSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.PartialSearch target = null;
                target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.PartialSearch)get_store().find_attribute_user(PARTIALSEARCH$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.PartialSearch)get_default_attribute_value(PARTIALSEARCH$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "partial-search" attribute
         */
        public boolean isSetPartialSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTIALSEARCH$8) != null;
            }
        }
        
        /**
         * Sets the "partial-search" attribute
         */
        public void setPartialSearch(com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.PartialSearch.Enum partialSearch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTIALSEARCH$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTIALSEARCH$8);
                }
                target.setEnumValue(partialSearch);
            }
        }
        
        /**
         * Sets (as xml) the "partial-search" attribute
         */
        public void xsetPartialSearch(com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.PartialSearch partialSearch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.PartialSearch target = null;
                target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.PartialSearch)get_store().find_attribute_user(PARTIALSEARCH$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.PartialSearch)get_store().add_attribute_user(PARTIALSEARCH$8);
                }
                target.set(partialSearch);
            }
        }
        
        /**
         * Unsets the "partial-search" attribute
         */
        public void unsetPartialSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTIALSEARCH$8);
            }
        }
        
        /**
         * Gets the "partial-chars" attribute
         */
        public java.math.BigInteger getPartialChars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTIALCHARS$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTIALCHARS$10);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "partial-chars" attribute
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetPartialChars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(PARTIALCHARS$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_default_attribute_value(PARTIALCHARS$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "partial-chars" attribute
         */
        public boolean isSetPartialChars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARTIALCHARS$10) != null;
            }
        }
        
        /**
         * Sets the "partial-chars" attribute
         */
        public void setPartialChars(java.math.BigInteger partialChars)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTIALCHARS$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTIALCHARS$10);
                }
                target.setBigIntegerValue(partialChars);
            }
        }
        
        /**
         * Sets (as xml) the "partial-chars" attribute
         */
        public void xsetPartialChars(org.apache.xmlbeans.XmlPositiveInteger partialChars)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(PARTIALCHARS$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(PARTIALCHARS$10);
                }
                target.set(partialChars);
            }
        }
        
        /**
         * Unsets the "partial-chars" attribute
         */
        public void unsetPartialChars()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARTIALCHARS$10);
            }
        }
        
        /**
         * Gets the "ignore-case" attribute
         */
        public com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.IgnoreCase.Enum getIgnoreCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNORECASE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IGNORECASE$12);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.IgnoreCase.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ignore-case" attribute
         */
        public com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.IgnoreCase xgetIgnoreCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.IgnoreCase target = null;
                target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.IgnoreCase)get_store().find_attribute_user(IGNORECASE$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.IgnoreCase)get_default_attribute_value(IGNORECASE$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "ignore-case" attribute
         */
        public boolean isSetIgnoreCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IGNORECASE$12) != null;
            }
        }
        
        /**
         * Sets the "ignore-case" attribute
         */
        public void setIgnoreCase(com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.IgnoreCase.Enum ignoreCase)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNORECASE$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IGNORECASE$12);
                }
                target.setEnumValue(ignoreCase);
            }
        }
        
        /**
         * Sets (as xml) the "ignore-case" attribute
         */
        public void xsetIgnoreCase(com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.IgnoreCase ignoreCase)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.IgnoreCase target = null;
                target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.IgnoreCase)get_store().find_attribute_user(IGNORECASE$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.IgnoreCase)get_store().add_attribute_user(IGNORECASE$12);
                }
                target.set(ignoreCase);
            }
        }
        
        /**
         * Unsets the "ignore-case" attribute
         */
        public void unsetIgnoreCase()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IGNORECASE$12);
            }
        }
        
        /**
         * Gets the "full-search" attribute
         */
        public com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.FullSearch.Enum getFullSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLSEARCH$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FULLSEARCH$14);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.FullSearch.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "full-search" attribute
         */
        public com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.FullSearch xgetFullSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.FullSearch target = null;
                target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.FullSearch)get_store().find_attribute_user(FULLSEARCH$14);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.FullSearch)get_default_attribute_value(FULLSEARCH$14);
                }
                return target;
            }
        }
        
        /**
         * True if has "full-search" attribute
         */
        public boolean isSetFullSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FULLSEARCH$14) != null;
            }
        }
        
        /**
         * Sets the "full-search" attribute
         */
        public void setFullSearch(com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.FullSearch.Enum fullSearch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FULLSEARCH$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FULLSEARCH$14);
                }
                target.setEnumValue(fullSearch);
            }
        }
        
        /**
         * Sets (as xml) the "full-search" attribute
         */
        public void xsetFullSearch(com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.FullSearch fullSearch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.FullSearch target = null;
                target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.FullSearch)get_store().find_attribute_user(FULLSEARCH$14);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.FullSearch)get_store().add_attribute_user(FULLSEARCH$14);
                }
                target.set(fullSearch);
            }
        }
        
        /**
         * Unsets the "full-search" attribute
         */
        public void unsetFullSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FULLSEARCH$14);
            }
        }
        /**
         * An XML auto-select(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.AutoCompleteDocument$AutoComplete$AutoSelect.
         */
        public static class AutoSelectImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.AutoSelect
        {
            private static final long serialVersionUID = 1L;
            
            public AutoSelectImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AutoSelectImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML partial-search(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.AutoCompleteDocument$AutoComplete$PartialSearch.
         */
        public static class PartialSearchImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.PartialSearch
        {
            private static final long serialVersionUID = 1L;
            
            public PartialSearchImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PartialSearchImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML ignore-case(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.AutoCompleteDocument$AutoComplete$IgnoreCase.
         */
        public static class IgnoreCaseImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.IgnoreCase
        {
            private static final long serialVersionUID = 1L;
            
            public IgnoreCaseImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected IgnoreCaseImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML full-search(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.AutoCompleteDocument$AutoComplete$FullSearch.
         */
        public static class FullSearchImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete.FullSearch
        {
            private static final long serialVersionUID = 1L;
            
            public FullSearchImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected FullSearchImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
