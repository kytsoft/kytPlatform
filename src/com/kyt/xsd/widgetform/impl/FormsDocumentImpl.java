/*
 * An XML document type.
 * Localname: forms
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.FormsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one forms(@) element.
 *
 * This is a complex type.
 */
public class FormsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.FormsDocument
{
    private static final long serialVersionUID = 1L;
    
    public FormsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMS$0 = 
        new javax.xml.namespace.QName("", "forms");
    
    
    /**
     * Gets the "forms" element
     */
    public com.kyt.xsd.widgetform.FormsDocument.Forms getForms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.FormsDocument.Forms target = null;
            target = (com.kyt.xsd.widgetform.FormsDocument.Forms)get_store().find_element_user(FORMS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "forms" element
     */
    public void setForms(com.kyt.xsd.widgetform.FormsDocument.Forms forms)
    {
        generatedSetterHelperImpl(forms, FORMS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "forms" element
     */
    public com.kyt.xsd.widgetform.FormsDocument.Forms addNewForms()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.FormsDocument.Forms target = null;
            target = (com.kyt.xsd.widgetform.FormsDocument.Forms)get_store().add_element_user(FORMS$0);
            return target;
        }
    }
    /**
     * An XML forms(@).
     *
     * This is a complex type.
     */
    public static class FormsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.FormsDocument.Forms
    {
        private static final long serialVersionUID = 1L;
        
        public FormsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FORM$0 = 
            new javax.xml.namespace.QName("", "form");
        
        
        /**
         * Gets array of all "form" elements
         */
        public com.kyt.xsd.widgetform.FormDocument.Form[] getFormArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FORM$0, targetList);
                com.kyt.xsd.widgetform.FormDocument.Form[] result = new com.kyt.xsd.widgetform.FormDocument.Form[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "form" element
         */
        public com.kyt.xsd.widgetform.FormDocument.Form getFormArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form)get_store().find_element_user(FORM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "form" element
         */
        public int sizeOfFormArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FORM$0);
            }
        }
        
        /**
         * Sets array of all "form" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFormArray(com.kyt.xsd.widgetform.FormDocument.Form[] formArray)
        {
            check_orphaned();
            arraySetterHelper(formArray, FORM$0);
        }
        
        /**
         * Sets ith "form" element
         */
        public void setFormArray(int i, com.kyt.xsd.widgetform.FormDocument.Form form)
        {
            generatedSetterHelperImpl(form, FORM$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "form" element
         */
        public com.kyt.xsd.widgetform.FormDocument.Form insertNewForm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form)get_store().insert_element_user(FORM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "form" element
         */
        public com.kyt.xsd.widgetform.FormDocument.Form addNewForm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form)get_store().add_element_user(FORM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "form" element
         */
        public void removeForm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FORM$0, i);
            }
        }
    }
}
