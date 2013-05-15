/*
 * An XML document type.
 * Localname: tyrex-dataSource
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.TyrexDataSourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig.impl;
/**
 * A document containing one tyrex-dataSource(@) element.
 *
 * This is a complex type.
 */
public class TyrexDataSourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.TyrexDataSourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public TyrexDataSourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYREXDATASOURCE$0 = 
        new javax.xml.namespace.QName("", "tyrex-dataSource");
    
    
    /**
     * Gets the "tyrex-dataSource" element
     */
    public com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource getTyrexDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource target = null;
            target = (com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource)get_store().find_element_user(TYREXDATASOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tyrex-dataSource" element
     */
    public void setTyrexDataSource(com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource tyrexDataSource)
    {
        generatedSetterHelperImpl(tyrexDataSource, TYREXDATASOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "tyrex-dataSource" element
     */
    public com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource addNewTyrexDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource target = null;
            target = (com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource)get_store().add_element_user(TYREXDATASOURCE$0);
            return target;
        }
    }
    /**
     * An XML tyrex-dataSource(@).
     *
     * This is a complex type.
     */
    public static class TyrexDataSourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource
    {
        private static final long serialVersionUID = 1L;
        
        public TyrexDataSourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATASOURCENAME$0 = 
            new javax.xml.namespace.QName("", "dataSource-name");
        private static final javax.xml.namespace.QName ISOLATIONLEVEL$2 = 
            new javax.xml.namespace.QName("", "isolation-level");
        
        
        /**
         * Gets the "dataSource-name" attribute
         */
        public java.lang.String getDataSourceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASOURCENAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dataSource-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDataSourceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATASOURCENAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "dataSource-name" attribute
         */
        public void setDataSourceName(java.lang.String dataSourceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASOURCENAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATASOURCENAME$0);
                }
                target.setStringValue(dataSourceName);
            }
        }
        
        /**
         * Sets (as xml) the "dataSource-name" attribute
         */
        public void xsetDataSourceName(org.apache.xmlbeans.XmlString dataSourceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATASOURCENAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DATASOURCENAME$0);
                }
                target.set(dataSourceName);
            }
        }
        
        /**
         * Gets the "isolation-level" attribute
         */
        public com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource.IsolationLevel.Enum getIsolationLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISOLATIONLEVEL$2);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource.IsolationLevel.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "isolation-level" attribute
         */
        public com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource.IsolationLevel xgetIsolationLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource.IsolationLevel target = null;
                target = (com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource.IsolationLevel)get_store().find_attribute_user(ISOLATIONLEVEL$2);
                return target;
            }
        }
        
        /**
         * True if has "isolation-level" attribute
         */
        public boolean isSetIsolationLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ISOLATIONLEVEL$2) != null;
            }
        }
        
        /**
         * Sets the "isolation-level" attribute
         */
        public void setIsolationLevel(com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource.IsolationLevel.Enum isolationLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISOLATIONLEVEL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISOLATIONLEVEL$2);
                }
                target.setEnumValue(isolationLevel);
            }
        }
        
        /**
         * Sets (as xml) the "isolation-level" attribute
         */
        public void xsetIsolationLevel(com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource.IsolationLevel isolationLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource.IsolationLevel target = null;
                target = (com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource.IsolationLevel)get_store().find_attribute_user(ISOLATIONLEVEL$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource.IsolationLevel)get_store().add_attribute_user(ISOLATIONLEVEL$2);
                }
                target.set(isolationLevel);
            }
        }
        
        /**
         * Unsets the "isolation-level" attribute
         */
        public void unsetIsolationLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ISOLATIONLEVEL$2);
            }
        }
        /**
         * An XML isolation-level(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityconfig.TyrexDataSourceDocument$TyrexDataSource$IsolationLevel.
         */
        public static class IsolationLevelImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entityconfig.TyrexDataSourceDocument.TyrexDataSource.IsolationLevel
        {
            private static final long serialVersionUID = 1L;
            
            public IsolationLevelImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected IsolationLevelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
