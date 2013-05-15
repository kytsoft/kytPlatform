/*
 * An XML document type.
 * Localname: simple-map-processors
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.SimpleMapProcessorsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one simple-map-processors(@) element.
 *
 * This is a complex type.
 */
public class SimpleMapProcessorsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.SimpleMapProcessorsDocument
{
    private static final long serialVersionUID = 1L;
    
    public SimpleMapProcessorsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLEMAPPROCESSORS$0 = 
        new javax.xml.namespace.QName("", "simple-map-processors");
    
    
    /**
     * Gets the "simple-map-processors" element
     */
    public com.kyt.xsd.simplemethods.SimpleMapProcessorsDocument.SimpleMapProcessors getSimpleMapProcessors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.SimpleMapProcessorsDocument.SimpleMapProcessors target = null;
            target = (com.kyt.xsd.simplemethods.SimpleMapProcessorsDocument.SimpleMapProcessors)get_store().find_element_user(SIMPLEMAPPROCESSORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "simple-map-processors" element
     */
    public void setSimpleMapProcessors(com.kyt.xsd.simplemethods.SimpleMapProcessorsDocument.SimpleMapProcessors simpleMapProcessors)
    {
        generatedSetterHelperImpl(simpleMapProcessors, SIMPLEMAPPROCESSORS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "simple-map-processors" element
     */
    public com.kyt.xsd.simplemethods.SimpleMapProcessorsDocument.SimpleMapProcessors addNewSimpleMapProcessors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.SimpleMapProcessorsDocument.SimpleMapProcessors target = null;
            target = (com.kyt.xsd.simplemethods.SimpleMapProcessorsDocument.SimpleMapProcessors)get_store().add_element_user(SIMPLEMAPPROCESSORS$0);
            return target;
        }
    }
    /**
     * An XML simple-map-processors(@).
     *
     * This is a complex type.
     */
    public static class SimpleMapProcessorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.SimpleMapProcessorsDocument.SimpleMapProcessors
    {
        private static final long serialVersionUID = 1L;
        
        public SimpleMapProcessorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SIMPLEMAPPROCESSOR$0 = 
            new javax.xml.namespace.QName("", "simple-map-processor");
        
        
        /**
         * Gets array of all "simple-map-processor" elements
         */
        public com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor[] getSimpleMapProcessorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SIMPLEMAPPROCESSOR$0, targetList);
                com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor[] result = new com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "simple-map-processor" element
         */
        public com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor getSimpleMapProcessorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor target = null;
                target = (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor)get_store().find_element_user(SIMPLEMAPPROCESSOR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "simple-map-processor" element
         */
        public int sizeOfSimpleMapProcessorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SIMPLEMAPPROCESSOR$0);
            }
        }
        
        /**
         * Sets array of all "simple-map-processor" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSimpleMapProcessorArray(com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor[] simpleMapProcessorArray)
        {
            check_orphaned();
            arraySetterHelper(simpleMapProcessorArray, SIMPLEMAPPROCESSOR$0);
        }
        
        /**
         * Sets ith "simple-map-processor" element
         */
        public void setSimpleMapProcessorArray(int i, com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor simpleMapProcessor)
        {
            generatedSetterHelperImpl(simpleMapProcessor, SIMPLEMAPPROCESSOR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "simple-map-processor" element
         */
        public com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor insertNewSimpleMapProcessor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor target = null;
                target = (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor)get_store().insert_element_user(SIMPLEMAPPROCESSOR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "simple-map-processor" element
         */
        public com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor addNewSimpleMapProcessor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor target = null;
                target = (com.kyt.xsd.simplemethods.SimpleMapProcessorDocument.SimpleMapProcessor)get_store().add_element_user(SIMPLEMAPPROCESSOR$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "simple-map-processor" element
         */
        public void removeSimpleMapProcessor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SIMPLEMAPPROCESSOR$0, i);
            }
        }
    }
}
