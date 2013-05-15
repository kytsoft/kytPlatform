/*
 * An XML document type.
 * Localname: auto-fields-entity
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.AutoFieldsEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one auto-fields-entity(@) element.
 *
 * This is a complex type.
 */
public class AutoFieldsEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.AutoFieldsEntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public AutoFieldsEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTOFIELDSENTITY$0 = 
        new javax.xml.namespace.QName("", "auto-fields-entity");
    
    
    /**
     * Gets the "auto-fields-entity" element
     */
    public com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity getAutoFieldsEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity target = null;
            target = (com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity)get_store().find_element_user(AUTOFIELDSENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "auto-fields-entity" element
     */
    public void setAutoFieldsEntity(com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity autoFieldsEntity)
    {
        generatedSetterHelperImpl(autoFieldsEntity, AUTOFIELDSENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "auto-fields-entity" element
     */
    public com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity addNewAutoFieldsEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity target = null;
            target = (com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity)get_store().add_element_user(AUTOFIELDSENTITY$0);
            return target;
        }
    }
    /**
     * An XML auto-fields-entity(@).
     *
     * This is a complex type.
     */
    public static class AutoFieldsEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity
    {
        private static final long serialVersionUID = 1L;
        
        public AutoFieldsEntityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYNAME$0 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName MAPNAME$2 = 
            new javax.xml.namespace.QName("", "map-name");
        private static final javax.xml.namespace.QName DEFAULTFIELDTYPE$4 = 
            new javax.xml.namespace.QName("", "default-field-type");
        private static final javax.xml.namespace.QName DEFAULTPOSITION$6 = 
            new javax.xml.namespace.QName("", "default-position");
        
        
        /**
         * Gets the "entity-name" attribute
         */
        public java.lang.String getEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entity-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "entity-name" attribute
         */
        public void setEntityName(java.lang.String entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$0);
                }
                target.setStringValue(entityName);
            }
        }
        
        /**
         * Sets (as xml) the "entity-name" attribute
         */
        public void xsetEntityName(org.apache.xmlbeans.XmlString entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$0);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Gets the "map-name" attribute
         */
        public java.lang.String getMapName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "map-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMapName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAPNAME$2);
                return target;
            }
        }
        
        /**
         * True if has "map-name" attribute
         */
        public boolean isSetMapName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MAPNAME$2) != null;
            }
        }
        
        /**
         * Sets the "map-name" attribute
         */
        public void setMapName(java.lang.String mapName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAPNAME$2);
                }
                target.setStringValue(mapName);
            }
        }
        
        /**
         * Sets (as xml) the "map-name" attribute
         */
        public void xsetMapName(org.apache.xmlbeans.XmlString mapName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAPNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAPNAME$2);
                }
                target.set(mapName);
            }
        }
        
        /**
         * Unsets the "map-name" attribute
         */
        public void unsetMapName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MAPNAME$2);
            }
        }
        
        /**
         * Gets the "default-field-type" attribute
         */
        public com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity.DefaultFieldType.Enum getDefaultFieldType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTFIELDTYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEFAULTFIELDTYPE$4);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity.DefaultFieldType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-field-type" attribute
         */
        public com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity.DefaultFieldType xgetDefaultFieldType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity.DefaultFieldType target = null;
                target = (com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity.DefaultFieldType)get_store().find_attribute_user(DEFAULTFIELDTYPE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity.DefaultFieldType)get_default_attribute_value(DEFAULTFIELDTYPE$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "default-field-type" attribute
         */
        public boolean isSetDefaultFieldType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTFIELDTYPE$4) != null;
            }
        }
        
        /**
         * Sets the "default-field-type" attribute
         */
        public void setDefaultFieldType(com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity.DefaultFieldType.Enum defaultFieldType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTFIELDTYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTFIELDTYPE$4);
                }
                target.setEnumValue(defaultFieldType);
            }
        }
        
        /**
         * Sets (as xml) the "default-field-type" attribute
         */
        public void xsetDefaultFieldType(com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity.DefaultFieldType defaultFieldType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity.DefaultFieldType target = null;
                target = (com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity.DefaultFieldType)get_store().find_attribute_user(DEFAULTFIELDTYPE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity.DefaultFieldType)get_store().add_attribute_user(DEFAULTFIELDTYPE$4);
                }
                target.set(defaultFieldType);
            }
        }
        
        /**
         * Unsets the "default-field-type" attribute
         */
        public void unsetDefaultFieldType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTFIELDTYPE$4);
            }
        }
        
        /**
         * Gets the "default-position" attribute
         */
        public java.math.BigInteger getDefaultPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTPOSITION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEFAULTPOSITION$6);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-position" attribute
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetDefaultPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(DEFAULTPOSITION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_default_attribute_value(DEFAULTPOSITION$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "default-position" attribute
         */
        public boolean isSetDefaultPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTPOSITION$6) != null;
            }
        }
        
        /**
         * Sets the "default-position" attribute
         */
        public void setDefaultPosition(java.math.BigInteger defaultPosition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTPOSITION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTPOSITION$6);
                }
                target.setBigIntegerValue(defaultPosition);
            }
        }
        
        /**
         * Sets (as xml) the "default-position" attribute
         */
        public void xsetDefaultPosition(org.apache.xmlbeans.XmlPositiveInteger defaultPosition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(DEFAULTPOSITION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(DEFAULTPOSITION$6);
                }
                target.set(defaultPosition);
            }
        }
        
        /**
         * Unsets the "default-position" attribute
         */
        public void unsetDefaultPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTPOSITION$6);
            }
        }
        /**
         * An XML default-field-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.AutoFieldsEntityDocument$AutoFieldsEntity$DefaultFieldType.
         */
        public static class DefaultFieldTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity.DefaultFieldType
        {
            private static final long serialVersionUID = 1L;
            
            public DefaultFieldTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DefaultFieldTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
