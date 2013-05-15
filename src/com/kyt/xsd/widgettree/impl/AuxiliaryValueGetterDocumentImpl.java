/*
 * An XML document type.
 * Localname: auxiliary-value-getter
 * Namespace: 
 * Java type: com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgettree.impl;
/**
 * A document containing one auxiliary-value-getter(@) element.
 *
 * This is a complex type.
 */
public class AuxiliaryValueGetterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuxiliaryValueGetterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUXILIARYVALUEGETTER$0 = 
        new javax.xml.namespace.QName("", "auxiliary-value-getter");
    
    
    /**
     * Gets the "auxiliary-value-getter" element
     */
    public com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument.AuxiliaryValueGetter getAuxiliaryValueGetter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument.AuxiliaryValueGetter target = null;
            target = (com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument.AuxiliaryValueGetter)get_store().find_element_user(AUXILIARYVALUEGETTER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "auxiliary-value-getter" element
     */
    public void setAuxiliaryValueGetter(com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument.AuxiliaryValueGetter auxiliaryValueGetter)
    {
        generatedSetterHelperImpl(auxiliaryValueGetter, AUXILIARYVALUEGETTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "auxiliary-value-getter" element
     */
    public com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument.AuxiliaryValueGetter addNewAuxiliaryValueGetter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument.AuxiliaryValueGetter target = null;
            target = (com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument.AuxiliaryValueGetter)get_store().add_element_user(AUXILIARYVALUEGETTER$0);
            return target;
        }
    }
    /**
     * An XML auxiliary-value-getter(@).
     *
     * This is a complex type.
     */
    public static class AuxiliaryValueGetterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument.AuxiliaryValueGetter
    {
        private static final long serialVersionUID = 1L;
        
        public AuxiliaryValueGetterImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYNAME$0 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName AUXILIARYFIELDNAME$2 = 
            new javax.xml.namespace.QName("", "auxiliary-field-name");
        private static final javax.xml.namespace.QName ENTITYIDNAME$4 = 
            new javax.xml.namespace.QName("", "entity-id-name");
        
        
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
         * True if has "entity-name" attribute
         */
        public boolean isSetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENTITYNAME$0) != null;
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
         * Unsets the "entity-name" attribute
         */
        public void unsetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENTITYNAME$0);
            }
        }
        
        /**
         * Gets the "auxiliary-field-name" attribute
         */
        public java.lang.String getAuxiliaryFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUXILIARYFIELDNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "auxiliary-field-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAuxiliaryFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AUXILIARYFIELDNAME$2);
                return target;
            }
        }
        
        /**
         * True if has "auxiliary-field-name" attribute
         */
        public boolean isSetAuxiliaryFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AUXILIARYFIELDNAME$2) != null;
            }
        }
        
        /**
         * Sets the "auxiliary-field-name" attribute
         */
        public void setAuxiliaryFieldName(java.lang.String auxiliaryFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUXILIARYFIELDNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUXILIARYFIELDNAME$2);
                }
                target.setStringValue(auxiliaryFieldName);
            }
        }
        
        /**
         * Sets (as xml) the "auxiliary-field-name" attribute
         */
        public void xsetAuxiliaryFieldName(org.apache.xmlbeans.XmlString auxiliaryFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AUXILIARYFIELDNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AUXILIARYFIELDNAME$2);
                }
                target.set(auxiliaryFieldName);
            }
        }
        
        /**
         * Unsets the "auxiliary-field-name" attribute
         */
        public void unsetAuxiliaryFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AUXILIARYFIELDNAME$2);
            }
        }
        
        /**
         * Gets the "entity-id-name" attribute
         */
        public java.lang.String getEntityIdName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYIDNAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entity-id-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEntityIdName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYIDNAME$4);
                return target;
            }
        }
        
        /**
         * True if has "entity-id-name" attribute
         */
        public boolean isSetEntityIdName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENTITYIDNAME$4) != null;
            }
        }
        
        /**
         * Sets the "entity-id-name" attribute
         */
        public void setEntityIdName(java.lang.String entityIdName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYIDNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYIDNAME$4);
                }
                target.setStringValue(entityIdName);
            }
        }
        
        /**
         * Sets (as xml) the "entity-id-name" attribute
         */
        public void xsetEntityIdName(org.apache.xmlbeans.XmlString entityIdName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYIDNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYIDNAME$4);
                }
                target.set(entityIdName);
            }
        }
        
        /**
         * Unsets the "entity-id-name" attribute
         */
        public void unsetEntityIdName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENTITYIDNAME$4);
            }
        }
    }
}
