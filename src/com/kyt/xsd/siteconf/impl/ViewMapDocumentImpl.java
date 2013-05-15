/*
 * An XML document type.
 * Localname: view-map
 * Namespace: 
 * Java type: com.kyt.xsd.siteconf.ViewMapDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.siteconf.impl;
/**
 * A document containing one view-map(@) element.
 *
 * This is a complex type.
 */
public class ViewMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.ViewMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ViewMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWMAP$0 = 
        new javax.xml.namespace.QName("", "view-map");
    
    
    /**
     * Gets the "view-map" element
     */
    public com.kyt.xsd.siteconf.ViewMapDocument.ViewMap getViewMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.ViewMapDocument.ViewMap target = null;
            target = (com.kyt.xsd.siteconf.ViewMapDocument.ViewMap)get_store().find_element_user(VIEWMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "view-map" element
     */
    public void setViewMap(com.kyt.xsd.siteconf.ViewMapDocument.ViewMap viewMap)
    {
        generatedSetterHelperImpl(viewMap, VIEWMAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "view-map" element
     */
    public com.kyt.xsd.siteconf.ViewMapDocument.ViewMap addNewViewMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.ViewMapDocument.ViewMap target = null;
            target = (com.kyt.xsd.siteconf.ViewMapDocument.ViewMap)get_store().add_element_user(VIEWMAP$0);
            return target;
        }
    }
    /**
     * An XML view-map(@).
     *
     * This is a complex type.
     */
    public static class ViewMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.ViewMapDocument.ViewMap
    {
        private static final long serialVersionUID = 1L;
        
        public ViewMapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName PAGE$4 = 
            new javax.xml.namespace.QName("", "page");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName INFO$8 = 
            new javax.xml.namespace.QName("", "info");
        private static final javax.xml.namespace.QName CONTENTTYPE$10 = 
            new javax.xml.namespace.QName("", "content-type");
        private static final javax.xml.namespace.QName ENCODING$12 = 
            new javax.xml.namespace.QName("", "encoding");
        private static final javax.xml.namespace.QName NOCACHE$14 = 
            new javax.xml.namespace.QName("", "no-cache");
        
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "description" element
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$0) != 0;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
                }
                target.set(description);
            }
        }
        
        /**
         * Unsets the "description" element
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$0, 0);
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
         * Gets the "page" attribute
         */
        public java.lang.String getPage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "page" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGE$4);
                return target;
            }
        }
        
        /**
         * True if has "page" attribute
         */
        public boolean isSetPage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGE$4) != null;
            }
        }
        
        /**
         * Sets the "page" attribute
         */
        public void setPage(java.lang.String page)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGE$4);
                }
                target.setStringValue(page);
            }
        }
        
        /**
         * Sets (as xml) the "page" attribute
         */
        public void xsetPage(org.apache.xmlbeans.XmlString page)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGE$4);
                }
                target.set(page);
            }
        }
        
        /**
         * Unsets the "page" attribute
         */
        public void unsetPage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGE$4);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$6);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(TYPE$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$6) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$6);
            }
        }
        
        /**
         * Gets the "info" attribute
         */
        public java.lang.String getInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INFO$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "info" attribute
         */
        public org.apache.xmlbeans.XmlString xgetInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INFO$8);
                return target;
            }
        }
        
        /**
         * True if has "info" attribute
         */
        public boolean isSetInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INFO$8) != null;
            }
        }
        
        /**
         * Sets the "info" attribute
         */
        public void setInfo(java.lang.String info)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INFO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INFO$8);
                }
                target.setStringValue(info);
            }
        }
        
        /**
         * Sets (as xml) the "info" attribute
         */
        public void xsetInfo(org.apache.xmlbeans.XmlString info)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INFO$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INFO$8);
                }
                target.set(info);
            }
        }
        
        /**
         * Unsets the "info" attribute
         */
        public void unsetInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INFO$8);
            }
        }
        
        /**
         * Gets the "content-type" attribute
         */
        public java.lang.String getContentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENTTYPE$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "content-type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetContentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTENTTYPE$10);
                return target;
            }
        }
        
        /**
         * True if has "content-type" attribute
         */
        public boolean isSetContentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CONTENTTYPE$10) != null;
            }
        }
        
        /**
         * Sets the "content-type" attribute
         */
        public void setContentType(java.lang.String contentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTENTTYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTENTTYPE$10);
                }
                target.setStringValue(contentType);
            }
        }
        
        /**
         * Sets (as xml) the "content-type" attribute
         */
        public void xsetContentType(org.apache.xmlbeans.XmlString contentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CONTENTTYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CONTENTTYPE$10);
                }
                target.set(contentType);
            }
        }
        
        /**
         * Unsets the "content-type" attribute
         */
        public void unsetContentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CONTENTTYPE$10);
            }
        }
        
        /**
         * Gets the "encoding" attribute
         */
        public java.lang.String getEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODING$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "encoding" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODING$12);
                return target;
            }
        }
        
        /**
         * True if has "encoding" attribute
         */
        public boolean isSetEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCODING$12) != null;
            }
        }
        
        /**
         * Sets the "encoding" attribute
         */
        public void setEncoding(java.lang.String encoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODING$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODING$12);
                }
                target.setStringValue(encoding);
            }
        }
        
        /**
         * Sets (as xml) the "encoding" attribute
         */
        public void xsetEncoding(org.apache.xmlbeans.XmlString encoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODING$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODING$12);
                }
                target.set(encoding);
            }
        }
        
        /**
         * Unsets the "encoding" attribute
         */
        public void unsetEncoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCODING$12);
            }
        }
        
        /**
         * Gets the "no-cache" attribute
         */
        public com.kyt.xsd.siteconf.ViewMapDocument.ViewMap.NoCache.Enum getNoCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOCACHE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NOCACHE$14);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.ViewMapDocument.ViewMap.NoCache.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "no-cache" attribute
         */
        public com.kyt.xsd.siteconf.ViewMapDocument.ViewMap.NoCache xgetNoCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.ViewMapDocument.ViewMap.NoCache target = null;
                target = (com.kyt.xsd.siteconf.ViewMapDocument.ViewMap.NoCache)get_store().find_attribute_user(NOCACHE$14);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.ViewMapDocument.ViewMap.NoCache)get_default_attribute_value(NOCACHE$14);
                }
                return target;
            }
        }
        
        /**
         * True if has "no-cache" attribute
         */
        public boolean isSetNoCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NOCACHE$14) != null;
            }
        }
        
        /**
         * Sets the "no-cache" attribute
         */
        public void setNoCache(com.kyt.xsd.siteconf.ViewMapDocument.ViewMap.NoCache.Enum noCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NOCACHE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NOCACHE$14);
                }
                target.setEnumValue(noCache);
            }
        }
        
        /**
         * Sets (as xml) the "no-cache" attribute
         */
        public void xsetNoCache(com.kyt.xsd.siteconf.ViewMapDocument.ViewMap.NoCache noCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.ViewMapDocument.ViewMap.NoCache target = null;
                target = (com.kyt.xsd.siteconf.ViewMapDocument.ViewMap.NoCache)get_store().find_attribute_user(NOCACHE$14);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.ViewMapDocument.ViewMap.NoCache)get_store().add_attribute_user(NOCACHE$14);
                }
                target.set(noCache);
            }
        }
        
        /**
         * Unsets the "no-cache" attribute
         */
        public void unsetNoCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NOCACHE$14);
            }
        }
        /**
         * An XML no-cache(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.ViewMapDocument$ViewMap$NoCache.
         */
        public static class NoCacheImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.ViewMapDocument.ViewMap.NoCache
        {
            private static final long serialVersionUID = 1L;
            
            public NoCacheImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected NoCacheImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
