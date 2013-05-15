/*
 * An XML document type.
 * Localname: if-entity-permission
 * Namespace: 
 * Java type: com.kyt.xsd.widgettree.IfEntityPermissionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgettree.impl;
/**
 * A document containing one if-entity-permission(@) element.
 *
 * This is a complex type.
 */
public class IfEntityPermissionDocumentImpl extends com.kyt.xsd.widgettree.impl.AllConditionalsDocumentImpl implements com.kyt.xsd.widgettree.IfEntityPermissionDocument
{
    private static final long serialVersionUID = 1L;
    
    public IfEntityPermissionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IFENTITYPERMISSION$0 = 
        new javax.xml.namespace.QName("", "if-entity-permission");
    
    
    /**
     * Gets the "if-entity-permission" element
     */
    public com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission getIfEntityPermission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission target = null;
            target = (com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission)get_store().find_element_user(IFENTITYPERMISSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "if-entity-permission" element
     */
    public void setIfEntityPermission(com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission ifEntityPermission)
    {
        generatedSetterHelperImpl(ifEntityPermission, IFENTITYPERMISSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "if-entity-permission" element
     */
    public com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission addNewIfEntityPermission()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission target = null;
            target = (com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission)get_store().add_element_user(IFENTITYPERMISSION$0);
            return target;
        }
    }
    /**
     * An XML if-entity-permission(@).
     *
     * This is a complex type.
     */
    public static class IfEntityPermissionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission
    {
        private static final long serialVersionUID = 1L;
        
        public IfEntityPermissionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PERMISSIONCONDITIONGETTER$0 = 
            new javax.xml.namespace.QName("", "permission-condition-getter");
        private static final javax.xml.namespace.QName RELATEDROLEGETTER$2 = 
            new javax.xml.namespace.QName("", "related-role-getter");
        private static final javax.xml.namespace.QName AUXILIARYVALUEGETTER$4 = 
            new javax.xml.namespace.QName("", "auxiliary-value-getter");
        private static final javax.xml.namespace.QName ENTITYNAME$6 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName ENTITYID$8 = 
            new javax.xml.namespace.QName("", "entity-id");
        private static final javax.xml.namespace.QName TARGETOPERATION$10 = 
            new javax.xml.namespace.QName("", "target-operation");
        private static final javax.xml.namespace.QName DISPLAYFAILCOND$12 = 
            new javax.xml.namespace.QName("", "display-fail-cond");
        
        
        /**
         * Gets the "permission-condition-getter" element
         */
        public com.kyt.xsd.widgettree.PermissionConditionGetterDocument.PermissionConditionGetter getPermissionConditionGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.PermissionConditionGetterDocument.PermissionConditionGetter target = null;
                target = (com.kyt.xsd.widgettree.PermissionConditionGetterDocument.PermissionConditionGetter)get_store().find_element_user(PERMISSIONCONDITIONGETTER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "permission-condition-getter" element
         */
        public boolean isSetPermissionConditionGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERMISSIONCONDITIONGETTER$0) != 0;
            }
        }
        
        /**
         * Sets the "permission-condition-getter" element
         */
        public void setPermissionConditionGetter(com.kyt.xsd.widgettree.PermissionConditionGetterDocument.PermissionConditionGetter permissionConditionGetter)
        {
            generatedSetterHelperImpl(permissionConditionGetter, PERMISSIONCONDITIONGETTER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "permission-condition-getter" element
         */
        public com.kyt.xsd.widgettree.PermissionConditionGetterDocument.PermissionConditionGetter addNewPermissionConditionGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.PermissionConditionGetterDocument.PermissionConditionGetter target = null;
                target = (com.kyt.xsd.widgettree.PermissionConditionGetterDocument.PermissionConditionGetter)get_store().add_element_user(PERMISSIONCONDITIONGETTER$0);
                return target;
            }
        }
        
        /**
         * Unsets the "permission-condition-getter" element
         */
        public void unsetPermissionConditionGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERMISSIONCONDITIONGETTER$0, 0);
            }
        }
        
        /**
         * Gets the "related-role-getter" element
         */
        public com.kyt.xsd.widgettree.RelatedRoleGetterDocument.RelatedRoleGetter getRelatedRoleGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.RelatedRoleGetterDocument.RelatedRoleGetter target = null;
                target = (com.kyt.xsd.widgettree.RelatedRoleGetterDocument.RelatedRoleGetter)get_store().find_element_user(RELATEDROLEGETTER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "related-role-getter" element
         */
        public boolean isSetRelatedRoleGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATEDROLEGETTER$2) != 0;
            }
        }
        
        /**
         * Sets the "related-role-getter" element
         */
        public void setRelatedRoleGetter(com.kyt.xsd.widgettree.RelatedRoleGetterDocument.RelatedRoleGetter relatedRoleGetter)
        {
            generatedSetterHelperImpl(relatedRoleGetter, RELATEDROLEGETTER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "related-role-getter" element
         */
        public com.kyt.xsd.widgettree.RelatedRoleGetterDocument.RelatedRoleGetter addNewRelatedRoleGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.RelatedRoleGetterDocument.RelatedRoleGetter target = null;
                target = (com.kyt.xsd.widgettree.RelatedRoleGetterDocument.RelatedRoleGetter)get_store().add_element_user(RELATEDROLEGETTER$2);
                return target;
            }
        }
        
        /**
         * Unsets the "related-role-getter" element
         */
        public void unsetRelatedRoleGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATEDROLEGETTER$2, 0);
            }
        }
        
        /**
         * Gets the "auxiliary-value-getter" element
         */
        public com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument.AuxiliaryValueGetter getAuxiliaryValueGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument.AuxiliaryValueGetter target = null;
                target = (com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument.AuxiliaryValueGetter)get_store().find_element_user(AUXILIARYVALUEGETTER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "auxiliary-value-getter" element
         */
        public boolean isSetAuxiliaryValueGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AUXILIARYVALUEGETTER$4) != 0;
            }
        }
        
        /**
         * Sets the "auxiliary-value-getter" element
         */
        public void setAuxiliaryValueGetter(com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument.AuxiliaryValueGetter auxiliaryValueGetter)
        {
            generatedSetterHelperImpl(auxiliaryValueGetter, AUXILIARYVALUEGETTER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (com.kyt.xsd.widgettree.AuxiliaryValueGetterDocument.AuxiliaryValueGetter)get_store().add_element_user(AUXILIARYVALUEGETTER$4);
                return target;
            }
        }
        
        /**
         * Unsets the "auxiliary-value-getter" element
         */
        public void unsetAuxiliaryValueGetter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AUXILIARYVALUEGETTER$4, 0);
            }
        }
        
        /**
         * Gets the "entity-name" attribute
         */
        public java.lang.String getEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$6);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Gets the "entity-id" attribute
         */
        public java.lang.String getEntityId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYID$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entity-id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEntityId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYID$8);
                return target;
            }
        }
        
        /**
         * Sets the "entity-id" attribute
         */
        public void setEntityId(java.lang.String entityId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYID$8);
                }
                target.setStringValue(entityId);
            }
        }
        
        /**
         * Sets (as xml) the "entity-id" attribute
         */
        public void xsetEntityId(org.apache.xmlbeans.XmlString entityId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYID$8);
                }
                target.set(entityId);
            }
        }
        
        /**
         * Gets the "target-operation" attribute
         */
        public java.lang.String getTargetOperation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETOPERATION$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "target-operation" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTargetOperation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGETOPERATION$10);
                return target;
            }
        }
        
        /**
         * Sets the "target-operation" attribute
         */
        public void setTargetOperation(java.lang.String targetOperation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETOPERATION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETOPERATION$10);
                }
                target.setStringValue(targetOperation);
            }
        }
        
        /**
         * Sets (as xml) the "target-operation" attribute
         */
        public void xsetTargetOperation(org.apache.xmlbeans.XmlString targetOperation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGETOPERATION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGETOPERATION$10);
                }
                target.set(targetOperation);
            }
        }
        
        /**
         * Gets the "display-fail-cond" attribute
         */
        public com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission.DisplayFailCond.Enum getDisplayFailCond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYFAILCOND$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DISPLAYFAILCOND$12);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission.DisplayFailCond.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "display-fail-cond" attribute
         */
        public com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission.DisplayFailCond xgetDisplayFailCond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission.DisplayFailCond target = null;
                target = (com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission.DisplayFailCond)get_store().find_attribute_user(DISPLAYFAILCOND$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission.DisplayFailCond)get_default_attribute_value(DISPLAYFAILCOND$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "display-fail-cond" attribute
         */
        public boolean isSetDisplayFailCond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISPLAYFAILCOND$12) != null;
            }
        }
        
        /**
         * Sets the "display-fail-cond" attribute
         */
        public void setDisplayFailCond(com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission.DisplayFailCond.Enum displayFailCond)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYFAILCOND$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYFAILCOND$12);
                }
                target.setEnumValue(displayFailCond);
            }
        }
        
        /**
         * Sets (as xml) the "display-fail-cond" attribute
         */
        public void xsetDisplayFailCond(com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission.DisplayFailCond displayFailCond)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission.DisplayFailCond target = null;
                target = (com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission.DisplayFailCond)get_store().find_attribute_user(DISPLAYFAILCOND$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission.DisplayFailCond)get_store().add_attribute_user(DISPLAYFAILCOND$12);
                }
                target.set(displayFailCond);
            }
        }
        
        /**
         * Unsets the "display-fail-cond" attribute
         */
        public void unsetDisplayFailCond()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISPLAYFAILCOND$12);
            }
        }
        /**
         * An XML display-fail-cond(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.IfEntityPermissionDocument$IfEntityPermission$DisplayFailCond.
         */
        public static class DisplayFailCondImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgettree.IfEntityPermissionDocument.IfEntityPermission.DisplayFailCond
        {
            private static final long serialVersionUID = 1L;
            
            public DisplayFailCondImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DisplayFailCondImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
