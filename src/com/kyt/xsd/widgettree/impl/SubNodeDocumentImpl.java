/*
 * An XML document type.
 * Localname: sub-node
 * Namespace: 
 * Java type: com.kyt.xsd.widgettree.SubNodeDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgettree.impl;
/**
 * A document containing one sub-node(@) element.
 *
 * This is a complex type.
 */
public class SubNodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.SubNodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubNodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBNODE$0 = 
        new javax.xml.namespace.QName("", "sub-node");
    
    
    /**
     * Gets the "sub-node" element
     */
    public com.kyt.xsd.widgettree.SubNodeDocument.SubNode getSubNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.SubNodeDocument.SubNode target = null;
            target = (com.kyt.xsd.widgettree.SubNodeDocument.SubNode)get_store().find_element_user(SUBNODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sub-node" element
     */
    public void setSubNode(com.kyt.xsd.widgettree.SubNodeDocument.SubNode subNode)
    {
        generatedSetterHelperImpl(subNode, SUBNODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sub-node" element
     */
    public com.kyt.xsd.widgettree.SubNodeDocument.SubNode addNewSubNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgettree.SubNodeDocument.SubNode target = null;
            target = (com.kyt.xsd.widgettree.SubNodeDocument.SubNode)get_store().add_element_user(SUBNODE$0);
            return target;
        }
    }
    /**
     * An XML sub-node(@).
     *
     * This is a complex type.
     */
    public static class SubNodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgettree.SubNodeDocument.SubNode
    {
        private static final long serialVersionUID = 1L;
        
        public SubNodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYAND$0 = 
            new javax.xml.namespace.QName("", "entity-and");
        private static final javax.xml.namespace.QName SERVICE$2 = 
            new javax.xml.namespace.QName("", "service");
        private static final javax.xml.namespace.QName ENTITYCONDITION$4 = 
            new javax.xml.namespace.QName("", "entity-condition");
        private static final javax.xml.namespace.QName OUTFIELDMAP$6 = 
            new javax.xml.namespace.QName("", "out-field-map");
        private static final javax.xml.namespace.QName NODENAME$8 = 
            new javax.xml.namespace.QName("", "node-name");
        
        
        /**
         * Gets the "entity-and" element
         */
        public com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd getEntityAnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd target = null;
                target = (com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd)get_store().find_element_user(ENTITYAND$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "entity-and" element
         */
        public boolean isSetEntityAnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITYAND$0) != 0;
            }
        }
        
        /**
         * Sets the "entity-and" element
         */
        public void setEntityAnd(com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd entityAnd)
        {
            generatedSetterHelperImpl(entityAnd, ENTITYAND$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "entity-and" element
         */
        public com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd addNewEntityAnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd target = null;
                target = (com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd)get_store().add_element_user(ENTITYAND$0);
                return target;
            }
        }
        
        /**
         * Unsets the "entity-and" element
         */
        public void unsetEntityAnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITYAND$0, 0);
            }
        }
        
        /**
         * Gets the "service" element
         */
        public com.kyt.xsd.widgettree.ServiceDocument.Service getService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.ServiceDocument.Service target = null;
                target = (com.kyt.xsd.widgettree.ServiceDocument.Service)get_store().find_element_user(SERVICE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "service" element
         */
        public boolean isSetService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICE$2) != 0;
            }
        }
        
        /**
         * Sets the "service" element
         */
        public void setService(com.kyt.xsd.widgettree.ServiceDocument.Service service)
        {
            generatedSetterHelperImpl(service, SERVICE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "service" element
         */
        public com.kyt.xsd.widgettree.ServiceDocument.Service addNewService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.ServiceDocument.Service target = null;
                target = (com.kyt.xsd.widgettree.ServiceDocument.Service)get_store().add_element_user(SERVICE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "service" element
         */
        public void unsetService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICE$2, 0);
            }
        }
        
        /**
         * Gets the "entity-condition" element
         */
        public com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition getEntityCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition target = null;
                target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition)get_store().find_element_user(ENTITYCONDITION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "entity-condition" element
         */
        public boolean isSetEntityCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITYCONDITION$4) != 0;
            }
        }
        
        /**
         * Sets the "entity-condition" element
         */
        public void setEntityCondition(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition entityCondition)
        {
            generatedSetterHelperImpl(entityCondition, ENTITYCONDITION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "entity-condition" element
         */
        public com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition addNewEntityCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition target = null;
                target = (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition)get_store().add_element_user(ENTITYCONDITION$4);
                return target;
            }
        }
        
        /**
         * Unsets the "entity-condition" element
         */
        public void unsetEntityCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITYCONDITION$4, 0);
            }
        }
        
        /**
         * Gets array of all "out-field-map" elements
         */
        public com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap[] getOutFieldMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OUTFIELDMAP$6, targetList);
                com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap[] result = new com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "out-field-map" element
         */
        public com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap getOutFieldMapArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap target = null;
                target = (com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap)get_store().find_element_user(OUTFIELDMAP$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "out-field-map" element
         */
        public int sizeOfOutFieldMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUTFIELDMAP$6);
            }
        }
        
        /**
         * Sets array of all "out-field-map" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOutFieldMapArray(com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap[] outFieldMapArray)
        {
            check_orphaned();
            arraySetterHelper(outFieldMapArray, OUTFIELDMAP$6);
        }
        
        /**
         * Sets ith "out-field-map" element
         */
        public void setOutFieldMapArray(int i, com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap outFieldMap)
        {
            generatedSetterHelperImpl(outFieldMap, OUTFIELDMAP$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "out-field-map" element
         */
        public com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap insertNewOutFieldMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap target = null;
                target = (com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap)get_store().insert_element_user(OUTFIELDMAP$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "out-field-map" element
         */
        public com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap addNewOutFieldMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap target = null;
                target = (com.kyt.xsd.widgettree.OutFieldMapDocument.OutFieldMap)get_store().add_element_user(OUTFIELDMAP$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "out-field-map" element
         */
        public void removeOutFieldMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUTFIELDMAP$6, i);
            }
        }
        
        /**
         * Gets the "node-name" attribute
         */
        public java.lang.String getNodeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODENAME$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "node-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetNodeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NODENAME$8);
                return target;
            }
        }
        
        /**
         * Sets the "node-name" attribute
         */
        public void setNodeName(java.lang.String nodeName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NODENAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NODENAME$8);
                }
                target.setStringValue(nodeName);
            }
        }
        
        /**
         * Sets (as xml) the "node-name" attribute
         */
        public void xsetNodeName(org.apache.xmlbeans.XmlString nodeName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NODENAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NODENAME$8);
                }
                target.set(nodeName);
            }
        }
    }
}
