/*
 * An XML document type.
 * Localname: html
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.HtmlDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one html(@) element.
 *
 * This is a complex type.
 */
public class HtmlDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.HtmlDocument
{
    private static final long serialVersionUID = 1L;
    
    public HtmlDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HTML$0 = 
        new javax.xml.namespace.QName("", "html");
    
    
    /**
     * Gets the "html" element
     */
    public com.kyt.xsd.widgetscreen.HtmlDocument.Html getHtml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.HtmlDocument.Html target = null;
            target = (com.kyt.xsd.widgetscreen.HtmlDocument.Html)get_store().find_element_user(HTML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "html" element
     */
    public void setHtml(com.kyt.xsd.widgetscreen.HtmlDocument.Html html)
    {
        generatedSetterHelperImpl(html, HTML$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "html" element
     */
    public com.kyt.xsd.widgetscreen.HtmlDocument.Html addNewHtml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.HtmlDocument.Html target = null;
            target = (com.kyt.xsd.widgetscreen.HtmlDocument.Html)get_store().add_element_user(HTML$0);
            return target;
        }
    }
    /**
     * An XML html(@).
     *
     * This is a complex type.
     */
    public static class HtmlImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.HtmlDocument.Html
    {
        private static final long serialVersionUID = 1L;
        
        public HtmlImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HTMLWIDGETS$0 = 
            new javax.xml.namespace.QName("", "HtmlWidgets");
        private static final org.apache.xmlbeans.QNameSet HTMLWIDGETS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("", "HtmlWidgets"),
            new javax.xml.namespace.QName("", "html-template-decorator"),
            new javax.xml.namespace.QName("", "html-template"),
        });
        
        
        /**
         * Gets array of all "HtmlWidgets" elements
         */
        public org.apache.xmlbeans.XmlObject[] getHtmlWidgetsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HTMLWIDGETS$1, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "HtmlWidgets" element
         */
        public org.apache.xmlbeans.XmlObject getHtmlWidgetsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(HTMLWIDGETS$1, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "HtmlWidgets" element
         */
        public int sizeOfHtmlWidgetsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HTMLWIDGETS$1);
            }
        }
        
        /**
         * Sets array of all "HtmlWidgets" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setHtmlWidgetsArray(org.apache.xmlbeans.XmlObject[] htmlWidgetsArray)
        {
            check_orphaned();
            arraySetterHelper(htmlWidgetsArray, HTMLWIDGETS$0, HTMLWIDGETS$1);
        }
        
        /**
         * Sets ith "HtmlWidgets" element
         */
        public void setHtmlWidgetsArray(int i, org.apache.xmlbeans.XmlObject htmlWidgets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(HTMLWIDGETS$1, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(htmlWidgets);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "HtmlWidgets" element
         */
        public org.apache.xmlbeans.XmlObject insertNewHtmlWidgets(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(HTMLWIDGETS$1, HTMLWIDGETS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "HtmlWidgets" element
         */
        public org.apache.xmlbeans.XmlObject addNewHtmlWidgets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(HTMLWIDGETS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "HtmlWidgets" element
         */
        public void removeHtmlWidgets(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HTMLWIDGETS$1, i);
            }
        }
    }
}
