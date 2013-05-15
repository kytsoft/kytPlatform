/*
 * An XML document type.
 * Localname: include-tree
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.IncludeTreeDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one include-tree(@) element.
 *
 * This is a complex type.
 */
public class IncludeTreeDocumentImpl extends com.kyt.xsd.widgetscreen.impl.AllWidgetsDocumentImpl implements com.kyt.xsd.widgetscreen.IncludeTreeDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncludeTreeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDETREE$0 = 
        new javax.xml.namespace.QName("", "include-tree");
    
    
    /**
     * Gets the "include-tree" element
     */
    public com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree getIncludeTree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree target = null;
            target = (com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree)get_store().find_element_user(INCLUDETREE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "include-tree" element
     */
    public void setIncludeTree(com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree includeTree)
    {
        generatedSetterHelperImpl(includeTree, INCLUDETREE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "include-tree" element
     */
    public com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree addNewIncludeTree()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree target = null;
            target = (com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree)get_store().add_element_user(INCLUDETREE$0);
            return target;
        }
    }
    /**
     * An XML include-tree(@).
     *
     * This is a complex type.
     */
    public static class IncludeTreeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree
    {
        private static final long serialVersionUID = 1L;
        
        public IncludeTreeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName LOCATION$2 = 
            new javax.xml.namespace.QName("", "location");
        private static final javax.xml.namespace.QName SHARESCOPE$4 = 
            new javax.xml.namespace.QName("", "share-scope");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "location" attribute
         */
        public java.lang.String getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "location" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$2);
                return target;
            }
        }
        
        /**
         * Sets the "location" attribute
         */
        public void setLocation(java.lang.String location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$2);
                }
                target.setStringValue(location);
            }
        }
        
        /**
         * Sets (as xml) the "location" attribute
         */
        public void xsetLocation(org.apache.xmlbeans.XmlString location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCATION$2);
                }
                target.set(location);
            }
        }
        
        /**
         * Gets the "share-scope" attribute
         */
        public com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree.ShareScope.Enum getShareScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARESCOPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SHARESCOPE$4);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree.ShareScope.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "share-scope" attribute
         */
        public com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree.ShareScope xgetShareScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree.ShareScope target = null;
                target = (com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree.ShareScope)get_store().find_attribute_user(SHARESCOPE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree.ShareScope)get_default_attribute_value(SHARESCOPE$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "share-scope" attribute
         */
        public boolean isSetShareScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SHARESCOPE$4) != null;
            }
        }
        
        /**
         * Sets the "share-scope" attribute
         */
        public void setShareScope(com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree.ShareScope.Enum shareScope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHARESCOPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHARESCOPE$4);
                }
                target.setEnumValue(shareScope);
            }
        }
        
        /**
         * Sets (as xml) the "share-scope" attribute
         */
        public void xsetShareScope(com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree.ShareScope shareScope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree.ShareScope target = null;
                target = (com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree.ShareScope)get_store().find_attribute_user(SHARESCOPE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree.ShareScope)get_store().add_attribute_user(SHARESCOPE$4);
                }
                target.set(shareScope);
            }
        }
        
        /**
         * Unsets the "share-scope" attribute
         */
        public void unsetShareScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SHARESCOPE$4);
            }
        }
        /**
         * An XML share-scope(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.IncludeTreeDocument$IncludeTree$ShareScope.
         */
        public static class ShareScopeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.IncludeTreeDocument.IncludeTree.ShareScope
        {
            private static final long serialVersionUID = 1L;
            
            public ShareScopeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ShareScopeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
