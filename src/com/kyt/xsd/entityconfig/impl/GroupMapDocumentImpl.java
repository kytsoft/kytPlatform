/*
 * An XML document type.
 * Localname: group-map
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.GroupMapDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig.impl;
/**
 * A document containing one group-map(@) element.
 *
 * This is a complex type.
 */
public class GroupMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.GroupMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPMAP$0 = 
        new javax.xml.namespace.QName("", "group-map");
    
    
    /**
     * Gets the "group-map" element
     */
    public com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap getGroupMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap target = null;
            target = (com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap)get_store().find_element_user(GROUPMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "group-map" element
     */
    public void setGroupMap(com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap groupMap)
    {
        generatedSetterHelperImpl(groupMap, GROUPMAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "group-map" element
     */
    public com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap addNewGroupMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap target = null;
            target = (com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap)get_store().add_element_user(GROUPMAP$0);
            return target;
        }
    }
    /**
     * An XML group-map(@).
     *
     * This is a complex type.
     */
    public static class GroupMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap
    {
        private static final long serialVersionUID = 1L;
        
        public GroupMapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GROUPNAME$0 = 
            new javax.xml.namespace.QName("", "group-name");
        private static final javax.xml.namespace.QName DATASOURCENAME$2 = 
            new javax.xml.namespace.QName("", "datasource-name");
        
        
        /**
         * Gets the "group-name" attribute
         */
        public java.lang.String getGroupName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "group-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetGroupName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUPNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "group-name" attribute
         */
        public void setGroupName(java.lang.String groupName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUPNAME$0);
                }
                target.setStringValue(groupName);
            }
        }
        
        /**
         * Sets (as xml) the "group-name" attribute
         */
        public void xsetGroupName(org.apache.xmlbeans.XmlString groupName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUPNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GROUPNAME$0);
                }
                target.set(groupName);
            }
        }
        
        /**
         * Gets the "datasource-name" attribute
         */
        public java.lang.String getDatasourceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASOURCENAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "datasource-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDatasourceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATASOURCENAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "datasource-name" attribute
         */
        public void setDatasourceName(java.lang.String datasourceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASOURCENAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATASOURCENAME$2);
                }
                target.setStringValue(datasourceName);
            }
        }
        
        /**
         * Sets (as xml) the "datasource-name" attribute
         */
        public void xsetDatasourceName(org.apache.xmlbeans.XmlString datasourceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DATASOURCENAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DATASOURCENAME$2);
                }
                target.set(datasourceName);
            }
        }
    }
}
