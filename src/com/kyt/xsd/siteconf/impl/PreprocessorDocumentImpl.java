/*
 * An XML document type.
 * Localname: preprocessor
 * Namespace: 
 * Java type: com.kyt.xsd.siteconf.PreprocessorDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.siteconf.impl;
/**
 * A document containing one preprocessor(@) element.
 *
 * This is a complex type.
 */
public class PreprocessorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.PreprocessorDocument
{
    private static final long serialVersionUID = 1L;
    
    public PreprocessorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREPROCESSOR$0 = 
        new javax.xml.namespace.QName("", "preprocessor");
    
    
    /**
     * Gets the "preprocessor" element
     */
    public com.kyt.xsd.siteconf.PreprocessorDocument.Preprocessor getPreprocessor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.PreprocessorDocument.Preprocessor target = null;
            target = (com.kyt.xsd.siteconf.PreprocessorDocument.Preprocessor)get_store().find_element_user(PREPROCESSOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "preprocessor" element
     */
    public void setPreprocessor(com.kyt.xsd.siteconf.PreprocessorDocument.Preprocessor preprocessor)
    {
        generatedSetterHelperImpl(preprocessor, PREPROCESSOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "preprocessor" element
     */
    public com.kyt.xsd.siteconf.PreprocessorDocument.Preprocessor addNewPreprocessor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.PreprocessorDocument.Preprocessor target = null;
            target = (com.kyt.xsd.siteconf.PreprocessorDocument.Preprocessor)get_store().add_element_user(PREPROCESSOR$0);
            return target;
        }
    }
    /**
     * An XML preprocessor(@).
     *
     * This is a complex type.
     */
    public static class PreprocessorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.PreprocessorDocument.Preprocessor
    {
        private static final long serialVersionUID = 1L;
        
        public PreprocessorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENT$0 = 
            new javax.xml.namespace.QName("", "event");
        
        
        /**
         * Gets array of all "event" elements
         */
        public com.kyt.xsd.siteconf.EventDocument.Event[] getEventArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EVENT$0, targetList);
                com.kyt.xsd.siteconf.EventDocument.Event[] result = new com.kyt.xsd.siteconf.EventDocument.Event[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "event" element
         */
        public com.kyt.xsd.siteconf.EventDocument.Event getEventArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.EventDocument.Event target = null;
                target = (com.kyt.xsd.siteconf.EventDocument.Event)get_store().find_element_user(EVENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "event" element
         */
        public int sizeOfEventArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVENT$0);
            }
        }
        
        /**
         * Sets array of all "event" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEventArray(com.kyt.xsd.siteconf.EventDocument.Event[] eventArray)
        {
            check_orphaned();
            arraySetterHelper(eventArray, EVENT$0);
        }
        
        /**
         * Sets ith "event" element
         */
        public void setEventArray(int i, com.kyt.xsd.siteconf.EventDocument.Event event)
        {
            generatedSetterHelperImpl(event, EVENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "event" element
         */
        public com.kyt.xsd.siteconf.EventDocument.Event insertNewEvent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.EventDocument.Event target = null;
                target = (com.kyt.xsd.siteconf.EventDocument.Event)get_store().insert_element_user(EVENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "event" element
         */
        public com.kyt.xsd.siteconf.EventDocument.Event addNewEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.EventDocument.Event target = null;
                target = (com.kyt.xsd.siteconf.EventDocument.Event)get_store().add_element_user(EVENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "event" element
         */
        public void removeEvent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVENT$0, i);
            }
        }
    }
}
