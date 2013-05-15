/*
 * An XML document type.
 * Localname: jndi-config
 * Namespace: 
 * Java type: com.kyt.xsd.jndiconfig.JndiConfigDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.jndiconfig.impl;
/**
 * A document containing one jndi-config(@) element.
 *
 * This is a complex type.
 */
public class JndiConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.jndiconfig.JndiConfigDocument
{
    private static final long serialVersionUID = 1L;
    
    public JndiConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName JNDICONFIG$0 = 
        new javax.xml.namespace.QName("", "jndi-config");
    
    
    /**
     * Gets the "jndi-config" element
     */
    public com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig getJndiConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig target = null;
            target = (com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig)get_store().find_element_user(JNDICONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "jndi-config" element
     */
    public void setJndiConfig(com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig jndiConfig)
    {
        generatedSetterHelperImpl(jndiConfig, JNDICONFIG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "jndi-config" element
     */
    public com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig addNewJndiConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig target = null;
            target = (com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig)get_store().add_element_user(JNDICONFIG$0);
            return target;
        }
    }
    /**
     * An XML jndi-config(@).
     *
     * This is a complex type.
     */
    public static class JndiConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.jndiconfig.JndiConfigDocument.JndiConfig
    {
        private static final long serialVersionUID = 1L;
        
        public JndiConfigImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName JNDISERVER$0 = 
            new javax.xml.namespace.QName("", "jndi-server");
        
        
        /**
         * Gets array of all "jndi-server" elements
         */
        public com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer[] getJndiServerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(JNDISERVER$0, targetList);
                com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer[] result = new com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "jndi-server" element
         */
        public com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer getJndiServerArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer target = null;
                target = (com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer)get_store().find_element_user(JNDISERVER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "jndi-server" element
         */
        public int sizeOfJndiServerArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JNDISERVER$0);
            }
        }
        
        /**
         * Sets array of all "jndi-server" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setJndiServerArray(com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer[] jndiServerArray)
        {
            check_orphaned();
            arraySetterHelper(jndiServerArray, JNDISERVER$0);
        }
        
        /**
         * Sets ith "jndi-server" element
         */
        public void setJndiServerArray(int i, com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer jndiServer)
        {
            generatedSetterHelperImpl(jndiServer, JNDISERVER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "jndi-server" element
         */
        public com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer insertNewJndiServer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer target = null;
                target = (com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer)get_store().insert_element_user(JNDISERVER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "jndi-server" element
         */
        public com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer addNewJndiServer()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer target = null;
                target = (com.kyt.xsd.jndiconfig.JndiServerDocument.JndiServer)get_store().add_element_user(JNDISERVER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "jndi-server" element
         */
        public void removeJndiServer(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JNDISERVER$0, i);
            }
        }
    }
}
