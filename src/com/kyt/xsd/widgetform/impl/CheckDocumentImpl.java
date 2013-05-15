/*
 * An XML document type.
 * Localname: check
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.CheckDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one check(@) element.
 *
 * This is a complex type.
 */
public class CheckDocumentImpl extends com.kyt.xsd.widgetform.impl.AllFieldsDocumentImpl implements com.kyt.xsd.widgetform.CheckDocument
{
    private static final long serialVersionUID = 1L;
    
    public CheckDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECK$0 = 
        new javax.xml.namespace.QName("", "check");
    
    
    /**
     * Gets the "check" element
     */
    public com.kyt.xsd.widgetform.CheckDocument.Check getCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.CheckDocument.Check target = null;
            target = (com.kyt.xsd.widgetform.CheckDocument.Check)get_store().find_element_user(CHECK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "check" element
     */
    public void setCheck(com.kyt.xsd.widgetform.CheckDocument.Check check)
    {
        generatedSetterHelperImpl(check, CHECK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "check" element
     */
    public com.kyt.xsd.widgetform.CheckDocument.Check addNewCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.CheckDocument.Check target = null;
            target = (com.kyt.xsd.widgetform.CheckDocument.Check)get_store().add_element_user(CHECK$0);
            return target;
        }
    }
    /**
     * An XML check(@).
     *
     * This is a complex type.
     */
    public static class CheckImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.CheckDocument.Check
    {
        private static final long serialVersionUID = 1L;
        
        public CheckImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYOPTIONS$0 = 
            new javax.xml.namespace.QName("", "entity-options");
        private static final javax.xml.namespace.QName LISTOPTIONS$2 = 
            new javax.xml.namespace.QName("", "list-options");
        private static final javax.xml.namespace.QName OPTION$4 = 
            new javax.xml.namespace.QName("", "option");
        private static final javax.xml.namespace.QName ALLCHECKED$6 = 
            new javax.xml.namespace.QName("", "all-checked");
        
        
        /**
         * Gets array of all "entity-options" elements
         */
        public com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions[] getEntityOptionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENTITYOPTIONS$0, targetList);
                com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions[] result = new com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "entity-options" element
         */
        public com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions getEntityOptionsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions target = null;
                target = (com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions)get_store().find_element_user(ENTITYOPTIONS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "entity-options" element
         */
        public int sizeOfEntityOptionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITYOPTIONS$0);
            }
        }
        
        /**
         * Sets array of all "entity-options" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEntityOptionsArray(com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions[] entityOptionsArray)
        {
            check_orphaned();
            arraySetterHelper(entityOptionsArray, ENTITYOPTIONS$0);
        }
        
        /**
         * Sets ith "entity-options" element
         */
        public void setEntityOptionsArray(int i, com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions entityOptions)
        {
            generatedSetterHelperImpl(entityOptions, ENTITYOPTIONS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-options" element
         */
        public com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions insertNewEntityOptions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions target = null;
                target = (com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions)get_store().insert_element_user(ENTITYOPTIONS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-options" element
         */
        public com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions addNewEntityOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions target = null;
                target = (com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions)get_store().add_element_user(ENTITYOPTIONS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "entity-options" element
         */
        public void removeEntityOptions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITYOPTIONS$0, i);
            }
        }
        
        /**
         * Gets array of all "list-options" elements
         */
        public com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions[] getListOptionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LISTOPTIONS$2, targetList);
                com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions[] result = new com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "list-options" element
         */
        public com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions getListOptionsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions target = null;
                target = (com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions)get_store().find_element_user(LISTOPTIONS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "list-options" element
         */
        public int sizeOfListOptionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LISTOPTIONS$2);
            }
        }
        
        /**
         * Sets array of all "list-options" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setListOptionsArray(com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions[] listOptionsArray)
        {
            check_orphaned();
            arraySetterHelper(listOptionsArray, LISTOPTIONS$2);
        }
        
        /**
         * Sets ith "list-options" element
         */
        public void setListOptionsArray(int i, com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions listOptions)
        {
            generatedSetterHelperImpl(listOptions, LISTOPTIONS$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "list-options" element
         */
        public com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions insertNewListOptions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions target = null;
                target = (com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions)get_store().insert_element_user(LISTOPTIONS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "list-options" element
         */
        public com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions addNewListOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions target = null;
                target = (com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions)get_store().add_element_user(LISTOPTIONS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "list-options" element
         */
        public void removeListOptions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LISTOPTIONS$2, i);
            }
        }
        
        /**
         * Gets array of all "option" elements
         */
        public com.kyt.xsd.widgetform.OptionDocument.Option[] getOptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OPTION$4, targetList);
                com.kyt.xsd.widgetform.OptionDocument.Option[] result = new com.kyt.xsd.widgetform.OptionDocument.Option[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "option" element
         */
        public com.kyt.xsd.widgetform.OptionDocument.Option getOptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.OptionDocument.Option target = null;
                target = (com.kyt.xsd.widgetform.OptionDocument.Option)get_store().find_element_user(OPTION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "option" element
         */
        public int sizeOfOptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPTION$4);
            }
        }
        
        /**
         * Sets array of all "option" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOptionArray(com.kyt.xsd.widgetform.OptionDocument.Option[] optionArray)
        {
            check_orphaned();
            arraySetterHelper(optionArray, OPTION$4);
        }
        
        /**
         * Sets ith "option" element
         */
        public void setOptionArray(int i, com.kyt.xsd.widgetform.OptionDocument.Option option)
        {
            generatedSetterHelperImpl(option, OPTION$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "option" element
         */
        public com.kyt.xsd.widgetform.OptionDocument.Option insertNewOption(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.OptionDocument.Option target = null;
                target = (com.kyt.xsd.widgetform.OptionDocument.Option)get_store().insert_element_user(OPTION$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "option" element
         */
        public com.kyt.xsd.widgetform.OptionDocument.Option addNewOption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.OptionDocument.Option target = null;
                target = (com.kyt.xsd.widgetform.OptionDocument.Option)get_store().add_element_user(OPTION$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "option" element
         */
        public void removeOption(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPTION$4, i);
            }
        }
        
        /**
         * Gets the "all-checked" attribute
         */
        public com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked.Enum getAllChecked()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLCHECKED$6);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "all-checked" attribute
         */
        public com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked xgetAllChecked()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked target = null;
                target = (com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked)get_store().find_attribute_user(ALLCHECKED$6);
                return target;
            }
        }
        
        /**
         * True if has "all-checked" attribute
         */
        public boolean isSetAllChecked()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ALLCHECKED$6) != null;
            }
        }
        
        /**
         * Sets the "all-checked" attribute
         */
        public void setAllChecked(com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked.Enum allChecked)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLCHECKED$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLCHECKED$6);
                }
                target.setEnumValue(allChecked);
            }
        }
        
        /**
         * Sets (as xml) the "all-checked" attribute
         */
        public void xsetAllChecked(com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked allChecked)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked target = null;
                target = (com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked)get_store().find_attribute_user(ALLCHECKED$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked)get_store().add_attribute_user(ALLCHECKED$6);
                }
                target.set(allChecked);
            }
        }
        
        /**
         * Unsets the "all-checked" attribute
         */
        public void unsetAllChecked()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ALLCHECKED$6);
            }
        }
        /**
         * An XML all-checked(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.CheckDocument$Check$AllChecked.
         */
        public static class AllCheckedImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked
        {
            private static final long serialVersionUID = 1L;
            
            public AllCheckedImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AllCheckedImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
