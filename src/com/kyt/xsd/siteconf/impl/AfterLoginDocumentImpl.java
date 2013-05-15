/*
 * An XML document type.
 * Localname: after-login
 * Namespace: 
 * Java type: com.kyt.xsd.siteconf.AfterLoginDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.siteconf.impl;
/**
 * A document containing one after-login(@) element.
 *
 * This is a complex type.
 */
public class AfterLoginDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.AfterLoginDocument
{
    private static final long serialVersionUID = 1L;
    
    public AfterLoginDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AFTERLOGIN$0 = 
        new javax.xml.namespace.QName("", "after-login");
    
    
    /**
     * Gets the "after-login" element
     */
    public com.kyt.xsd.siteconf.AfterLoginDocument.AfterLogin getAfterLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.AfterLoginDocument.AfterLogin target = null;
            target = (com.kyt.xsd.siteconf.AfterLoginDocument.AfterLogin)get_store().find_element_user(AFTERLOGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "after-login" element
     */
    public void setAfterLogin(com.kyt.xsd.siteconf.AfterLoginDocument.AfterLogin afterLogin)
    {
        generatedSetterHelperImpl(afterLogin, AFTERLOGIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "after-login" element
     */
    public com.kyt.xsd.siteconf.AfterLoginDocument.AfterLogin addNewAfterLogin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.AfterLoginDocument.AfterLogin target = null;
            target = (com.kyt.xsd.siteconf.AfterLoginDocument.AfterLogin)get_store().add_element_user(AFTERLOGIN$0);
            return target;
        }
    }
    /**
     * An XML after-login(@).
     *
     * This is a complex type.
     */
    public static class AfterLoginImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.AfterLoginDocument.AfterLogin
    {
        private static final long serialVersionUID = 1L;
        
        public AfterLoginImpl(org.apache.xmlbeans.SchemaType sType)
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
