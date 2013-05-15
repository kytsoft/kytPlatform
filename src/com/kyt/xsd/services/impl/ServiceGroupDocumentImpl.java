/*
 * An XML document type.
 * Localname: service-group
 * Namespace: 
 * Java type: com.kyt.xsd.services.ServiceGroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.services.impl;
/**
 * A document containing one service-group(@) element.
 *
 * This is a complex type.
 */
public class ServiceGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.ServiceGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEGROUP$0 = 
        new javax.xml.namespace.QName("", "service-group");
    
    
    /**
     * Gets the "service-group" element
     */
    public com.kyt.xsd.services.ServiceGroupDocument.ServiceGroup getServiceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.ServiceGroupDocument.ServiceGroup target = null;
            target = (com.kyt.xsd.services.ServiceGroupDocument.ServiceGroup)get_store().find_element_user(SERVICEGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-group" element
     */
    public void setServiceGroup(com.kyt.xsd.services.ServiceGroupDocument.ServiceGroup serviceGroup)
    {
        generatedSetterHelperImpl(serviceGroup, SERVICEGROUP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "service-group" element
     */
    public com.kyt.xsd.services.ServiceGroupDocument.ServiceGroup addNewServiceGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.ServiceGroupDocument.ServiceGroup target = null;
            target = (com.kyt.xsd.services.ServiceGroupDocument.ServiceGroup)get_store().add_element_user(SERVICEGROUP$0);
            return target;
        }
    }
    /**
     * An XML service-group(@).
     *
     * This is a complex type.
     */
    public static class ServiceGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.ServiceGroupDocument.ServiceGroup
    {
        private static final long serialVersionUID = 1L;
        
        public ServiceGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GROUP$0 = 
            new javax.xml.namespace.QName("", "group");
        
        
        /**
         * Gets array of all "group" elements
         */
        public com.kyt.xsd.services.GroupDocument.Group[] getGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GROUP$0, targetList);
                com.kyt.xsd.services.GroupDocument.Group[] result = new com.kyt.xsd.services.GroupDocument.Group[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "group" element
         */
        public com.kyt.xsd.services.GroupDocument.Group getGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.GroupDocument.Group target = null;
                target = (com.kyt.xsd.services.GroupDocument.Group)get_store().find_element_user(GROUP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "group" element
         */
        public int sizeOfGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GROUP$0);
            }
        }
        
        /**
         * Sets array of all "group" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setGroupArray(com.kyt.xsd.services.GroupDocument.Group[] groupArray)
        {
            check_orphaned();
            arraySetterHelper(groupArray, GROUP$0);
        }
        
        /**
         * Sets ith "group" element
         */
        public void setGroupArray(int i, com.kyt.xsd.services.GroupDocument.Group group)
        {
            generatedSetterHelperImpl(group, GROUP$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "group" element
         */
        public com.kyt.xsd.services.GroupDocument.Group insertNewGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.GroupDocument.Group target = null;
                target = (com.kyt.xsd.services.GroupDocument.Group)get_store().insert_element_user(GROUP$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "group" element
         */
        public com.kyt.xsd.services.GroupDocument.Group addNewGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.GroupDocument.Group target = null;
                target = (com.kyt.xsd.services.GroupDocument.Group)get_store().add_element_user(GROUP$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "group" element
         */
        public void removeGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GROUP$0, i);
            }
        }
    }
}
