/*
 * An XML document type.
 * Localname: ofbiz-containers
 * Namespace: 
 * Java type: com.kyt.xsd.ofbizcontainers.OfbizContainersDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.ofbizcontainers.impl;
/**
 * A document containing one ofbiz-containers(@) element.
 *
 * This is a complex type.
 */
public class OfbizContainersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcontainers.OfbizContainersDocument
{
    private static final long serialVersionUID = 1L;
    
    public OfbizContainersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OFBIZCONTAINERS$0 = 
        new javax.xml.namespace.QName("", "ofbiz-containers");
    
    
    /**
     * Gets the "ofbiz-containers" element
     */
    public com.kyt.xsd.ofbizcontainers.OfbizContainersDocument.OfbizContainers getOfbizContainers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcontainers.OfbizContainersDocument.OfbizContainers target = null;
            target = (com.kyt.xsd.ofbizcontainers.OfbizContainersDocument.OfbizContainers)get_store().find_element_user(OFBIZCONTAINERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ofbiz-containers" element
     */
    public void setOfbizContainers(com.kyt.xsd.ofbizcontainers.OfbizContainersDocument.OfbizContainers ofbizContainers)
    {
        generatedSetterHelperImpl(ofbizContainers, OFBIZCONTAINERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ofbiz-containers" element
     */
    public com.kyt.xsd.ofbizcontainers.OfbizContainersDocument.OfbizContainers addNewOfbizContainers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.ofbizcontainers.OfbizContainersDocument.OfbizContainers target = null;
            target = (com.kyt.xsd.ofbizcontainers.OfbizContainersDocument.OfbizContainers)get_store().add_element_user(OFBIZCONTAINERS$0);
            return target;
        }
    }
    /**
     * An XML ofbiz-containers(@).
     *
     * This is a complex type.
     */
    public static class OfbizContainersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.ofbizcontainers.OfbizContainersDocument.OfbizContainers
    {
        private static final long serialVersionUID = 1L;
        
        public OfbizContainersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTAINER$0 = 
            new javax.xml.namespace.QName("", "container");
        
        
        /**
         * Gets array of all "container" elements
         */
        public com.kyt.xsd.ofbizcontainers.ContainerDocument.Container[] getContainerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTAINER$0, targetList);
                com.kyt.xsd.ofbizcontainers.ContainerDocument.Container[] result = new com.kyt.xsd.ofbizcontainers.ContainerDocument.Container[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "container" element
         */
        public com.kyt.xsd.ofbizcontainers.ContainerDocument.Container getContainerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcontainers.ContainerDocument.Container target = null;
                target = (com.kyt.xsd.ofbizcontainers.ContainerDocument.Container)get_store().find_element_user(CONTAINER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "container" element
         */
        public int sizeOfContainerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTAINER$0);
            }
        }
        
        /**
         * Sets array of all "container" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setContainerArray(com.kyt.xsd.ofbizcontainers.ContainerDocument.Container[] containerArray)
        {
            check_orphaned();
            arraySetterHelper(containerArray, CONTAINER$0);
        }
        
        /**
         * Sets ith "container" element
         */
        public void setContainerArray(int i, com.kyt.xsd.ofbizcontainers.ContainerDocument.Container container)
        {
            generatedSetterHelperImpl(container, CONTAINER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "container" element
         */
        public com.kyt.xsd.ofbizcontainers.ContainerDocument.Container insertNewContainer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcontainers.ContainerDocument.Container target = null;
                target = (com.kyt.xsd.ofbizcontainers.ContainerDocument.Container)get_store().insert_element_user(CONTAINER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "container" element
         */
        public com.kyt.xsd.ofbizcontainers.ContainerDocument.Container addNewContainer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.ofbizcontainers.ContainerDocument.Container target = null;
                target = (com.kyt.xsd.ofbizcontainers.ContainerDocument.Container)get_store().add_element_user(CONTAINER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "container" element
         */
        public void removeContainer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTAINER$0, i);
            }
        }
    }
}
