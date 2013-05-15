/*
 * An XML document type.
 * Localname: required-permissions
 * Namespace: 
 * Java type: com.kyt.xsd.services.RequiredPermissionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.services.impl;
/**
 * A document containing one required-permissions(@) element.
 *
 * This is a complex type.
 */
public class RequiredPermissionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.RequiredPermissionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequiredPermissionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUIREDPERMISSIONS$0 = 
        new javax.xml.namespace.QName("", "required-permissions");
    
    
    /**
     * Gets the "required-permissions" element
     */
    public com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions getRequiredPermissions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions target = null;
            target = (com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions)get_store().find_element_user(REQUIREDPERMISSIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "required-permissions" element
     */
    public void setRequiredPermissions(com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions requiredPermissions)
    {
        generatedSetterHelperImpl(requiredPermissions, REQUIREDPERMISSIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "required-permissions" element
     */
    public com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions addNewRequiredPermissions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions target = null;
            target = (com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions)get_store().add_element_user(REQUIREDPERMISSIONS$0);
            return target;
        }
    }
    /**
     * An XML required-permissions(@).
     *
     * This is a complex type.
     */
    public static class RequiredPermissionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions
    {
        private static final long serialVersionUID = 1L;
        
        public RequiredPermissionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CHECKPERMISSION$0 = 
            new javax.xml.namespace.QName("", "check-permission");
        private static final javax.xml.namespace.QName CHECKROLEMEMBER$2 = 
            new javax.xml.namespace.QName("", "check-role-member");
        private static final javax.xml.namespace.QName PERMISSIONSERVICE$4 = 
            new javax.xml.namespace.QName("", "permission-service");
        private static final javax.xml.namespace.QName JOINTYPE$6 = 
            new javax.xml.namespace.QName("", "join-type");
        
        
        /**
         * Gets array of all "check-permission" elements
         */
        public com.kyt.xsd.services.CheckPermissionDocument.CheckPermission[] getCheckPermissionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CHECKPERMISSION$0, targetList);
                com.kyt.xsd.services.CheckPermissionDocument.CheckPermission[] result = new com.kyt.xsd.services.CheckPermissionDocument.CheckPermission[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "check-permission" element
         */
        public com.kyt.xsd.services.CheckPermissionDocument.CheckPermission getCheckPermissionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.CheckPermissionDocument.CheckPermission target = null;
                target = (com.kyt.xsd.services.CheckPermissionDocument.CheckPermission)get_store().find_element_user(CHECKPERMISSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "check-permission" element
         */
        public int sizeOfCheckPermissionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHECKPERMISSION$0);
            }
        }
        
        /**
         * Sets array of all "check-permission" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCheckPermissionArray(com.kyt.xsd.services.CheckPermissionDocument.CheckPermission[] checkPermissionArray)
        {
            check_orphaned();
            arraySetterHelper(checkPermissionArray, CHECKPERMISSION$0);
        }
        
        /**
         * Sets ith "check-permission" element
         */
        public void setCheckPermissionArray(int i, com.kyt.xsd.services.CheckPermissionDocument.CheckPermission checkPermission)
        {
            generatedSetterHelperImpl(checkPermission, CHECKPERMISSION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "check-permission" element
         */
        public com.kyt.xsd.services.CheckPermissionDocument.CheckPermission insertNewCheckPermission(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.CheckPermissionDocument.CheckPermission target = null;
                target = (com.kyt.xsd.services.CheckPermissionDocument.CheckPermission)get_store().insert_element_user(CHECKPERMISSION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "check-permission" element
         */
        public com.kyt.xsd.services.CheckPermissionDocument.CheckPermission addNewCheckPermission()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.CheckPermissionDocument.CheckPermission target = null;
                target = (com.kyt.xsd.services.CheckPermissionDocument.CheckPermission)get_store().add_element_user(CHECKPERMISSION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "check-permission" element
         */
        public void removeCheckPermission(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHECKPERMISSION$0, i);
            }
        }
        
        /**
         * Gets array of all "check-role-member" elements
         */
        public com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember[] getCheckRoleMemberArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CHECKROLEMEMBER$2, targetList);
                com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember[] result = new com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "check-role-member" element
         */
        public com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember getCheckRoleMemberArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember target = null;
                target = (com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember)get_store().find_element_user(CHECKROLEMEMBER$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "check-role-member" element
         */
        public int sizeOfCheckRoleMemberArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CHECKROLEMEMBER$2);
            }
        }
        
        /**
         * Sets array of all "check-role-member" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCheckRoleMemberArray(com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember[] checkRoleMemberArray)
        {
            check_orphaned();
            arraySetterHelper(checkRoleMemberArray, CHECKROLEMEMBER$2);
        }
        
        /**
         * Sets ith "check-role-member" element
         */
        public void setCheckRoleMemberArray(int i, com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember checkRoleMember)
        {
            generatedSetterHelperImpl(checkRoleMember, CHECKROLEMEMBER$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "check-role-member" element
         */
        public com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember insertNewCheckRoleMember(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember target = null;
                target = (com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember)get_store().insert_element_user(CHECKROLEMEMBER$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "check-role-member" element
         */
        public com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember addNewCheckRoleMember()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember target = null;
                target = (com.kyt.xsd.services.CheckRoleMemberDocument.CheckRoleMember)get_store().add_element_user(CHECKROLEMEMBER$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "check-role-member" element
         */
        public void removeCheckRoleMember(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CHECKROLEMEMBER$2, i);
            }
        }
        
        /**
         * Gets array of all "permission-service" elements
         */
        public com.kyt.xsd.services.PermissionServiceDocument.PermissionService[] getPermissionServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PERMISSIONSERVICE$4, targetList);
                com.kyt.xsd.services.PermissionServiceDocument.PermissionService[] result = new com.kyt.xsd.services.PermissionServiceDocument.PermissionService[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "permission-service" element
         */
        public com.kyt.xsd.services.PermissionServiceDocument.PermissionService getPermissionServiceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.PermissionServiceDocument.PermissionService target = null;
                target = (com.kyt.xsd.services.PermissionServiceDocument.PermissionService)get_store().find_element_user(PERMISSIONSERVICE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "permission-service" element
         */
        public int sizeOfPermissionServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERMISSIONSERVICE$4);
            }
        }
        
        /**
         * Sets array of all "permission-service" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPermissionServiceArray(com.kyt.xsd.services.PermissionServiceDocument.PermissionService[] permissionServiceArray)
        {
            check_orphaned();
            arraySetterHelper(permissionServiceArray, PERMISSIONSERVICE$4);
        }
        
        /**
         * Sets ith "permission-service" element
         */
        public void setPermissionServiceArray(int i, com.kyt.xsd.services.PermissionServiceDocument.PermissionService permissionService)
        {
            generatedSetterHelperImpl(permissionService, PERMISSIONSERVICE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "permission-service" element
         */
        public com.kyt.xsd.services.PermissionServiceDocument.PermissionService insertNewPermissionService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.PermissionServiceDocument.PermissionService target = null;
                target = (com.kyt.xsd.services.PermissionServiceDocument.PermissionService)get_store().insert_element_user(PERMISSIONSERVICE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "permission-service" element
         */
        public com.kyt.xsd.services.PermissionServiceDocument.PermissionService addNewPermissionService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.PermissionServiceDocument.PermissionService target = null;
                target = (com.kyt.xsd.services.PermissionServiceDocument.PermissionService)get_store().add_element_user(PERMISSIONSERVICE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "permission-service" element
         */
        public void removePermissionService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERMISSIONSERVICE$4, i);
            }
        }
        
        /**
         * Gets the "join-type" attribute
         */
        public com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions.JoinType.Enum getJoinType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOINTYPE$6);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions.JoinType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "join-type" attribute
         */
        public com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions.JoinType xgetJoinType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions.JoinType target = null;
                target = (com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions.JoinType)get_store().find_attribute_user(JOINTYPE$6);
                return target;
            }
        }
        
        /**
         * Sets the "join-type" attribute
         */
        public void setJoinType(com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions.JoinType.Enum joinType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JOINTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JOINTYPE$6);
                }
                target.setEnumValue(joinType);
            }
        }
        
        /**
         * Sets (as xml) the "join-type" attribute
         */
        public void xsetJoinType(com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions.JoinType joinType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions.JoinType target = null;
                target = (com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions.JoinType)get_store().find_attribute_user(JOINTYPE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions.JoinType)get_store().add_attribute_user(JOINTYPE$6);
                }
                target.set(joinType);
            }
        }
        /**
         * An XML join-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.RequiredPermissionsDocument$RequiredPermissions$JoinType.
         */
        public static class JoinTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.services.RequiredPermissionsDocument.RequiredPermissions.JoinType
        {
            private static final long serialVersionUID = 1L;
            
            public JoinTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected JoinTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
