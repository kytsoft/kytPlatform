/*
 * An XML document type.
 * Localname: component-loader
 * Namespace: 
 * Java type: com.kyt.xsd.componentloader.ComponentLoaderDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.componentloader.impl;
/**
 * A document containing one component-loader(@) element.
 *
 * This is a complex type.
 */
public class ComponentLoaderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.componentloader.ComponentLoaderDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComponentLoaderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTLOADER$0 = 
        new javax.xml.namespace.QName("", "component-loader");
    
    
    /**
     * Gets the "component-loader" element
     */
    public com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader getComponentLoader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader target = null;
            target = (com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader)get_store().find_element_user(COMPONENTLOADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "component-loader" element
     */
    public void setComponentLoader(com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader componentLoader)
    {
        generatedSetterHelperImpl(componentLoader, COMPONENTLOADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "component-loader" element
     */
    public com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader addNewComponentLoader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader target = null;
            target = (com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader)get_store().add_element_user(COMPONENTLOADER$0);
            return target;
        }
    }
    /**
     * An XML component-loader(@).
     *
     * This is a complex type.
     */
    public static class ComponentLoaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.componentloader.ComponentLoaderDocument.ComponentLoader
    {
        private static final long serialVersionUID = 1L;
        
        public ComponentLoaderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOADCOMPONENT$0 = 
            new javax.xml.namespace.QName("", "load-component");
        private static final javax.xml.namespace.QName LOADCOMPONENTS$2 = 
            new javax.xml.namespace.QName("", "load-components");
        
        
        /**
         * Gets array of all "load-component" elements
         */
        public com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent[] getLoadComponentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LOADCOMPONENT$0, targetList);
                com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent[] result = new com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "load-component" element
         */
        public com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent getLoadComponentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent target = null;
                target = (com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent)get_store().find_element_user(LOADCOMPONENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "load-component" element
         */
        public int sizeOfLoadComponentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOADCOMPONENT$0);
            }
        }
        
        /**
         * Sets array of all "load-component" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLoadComponentArray(com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent[] loadComponentArray)
        {
            check_orphaned();
            arraySetterHelper(loadComponentArray, LOADCOMPONENT$0);
        }
        
        /**
         * Sets ith "load-component" element
         */
        public void setLoadComponentArray(int i, com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent loadComponent)
        {
            generatedSetterHelperImpl(loadComponent, LOADCOMPONENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "load-component" element
         */
        public com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent insertNewLoadComponent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent target = null;
                target = (com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent)get_store().insert_element_user(LOADCOMPONENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "load-component" element
         */
        public com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent addNewLoadComponent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent target = null;
                target = (com.kyt.xsd.componentloader.LoadComponentDocument.LoadComponent)get_store().add_element_user(LOADCOMPONENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "load-component" element
         */
        public void removeLoadComponent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOADCOMPONENT$0, i);
            }
        }
        
        /**
         * Gets array of all "load-components" elements
         */
        public com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents[] getLoadComponentsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LOADCOMPONENTS$2, targetList);
                com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents[] result = new com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "load-components" element
         */
        public com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents getLoadComponentsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents target = null;
                target = (com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents)get_store().find_element_user(LOADCOMPONENTS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "load-components" element
         */
        public int sizeOfLoadComponentsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOADCOMPONENTS$2);
            }
        }
        
        /**
         * Sets array of all "load-components" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLoadComponentsArray(com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents[] loadComponentsArray)
        {
            check_orphaned();
            arraySetterHelper(loadComponentsArray, LOADCOMPONENTS$2);
        }
        
        /**
         * Sets ith "load-components" element
         */
        public void setLoadComponentsArray(int i, com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents loadComponents)
        {
            generatedSetterHelperImpl(loadComponents, LOADCOMPONENTS$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "load-components" element
         */
        public com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents insertNewLoadComponents(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents target = null;
                target = (com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents)get_store().insert_element_user(LOADCOMPONENTS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "load-components" element
         */
        public com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents addNewLoadComponents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents target = null;
                target = (com.kyt.xsd.componentloader.LoadComponentsDocument.LoadComponents)get_store().add_element_user(LOADCOMPONENTS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "load-components" element
         */
        public void removeLoadComponents(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOADCOMPONENTS$2, i);
            }
        }
    }
}
