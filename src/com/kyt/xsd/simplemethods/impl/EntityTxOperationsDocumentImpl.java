/*
 * An XML document type.
 * Localname: EntityTxOperations
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.EntityTxOperationsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one EntityTxOperations(@) element.
 *
 * This is a complex type.
 */
public class EntityTxOperationsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.EntityTxOperationsDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntityTxOperationsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYTXOPERATIONS$0 = 
        new javax.xml.namespace.QName("", "EntityTxOperations");
    private static final org.apache.xmlbeans.QNameSet ENTITYTXOPERATIONS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("", "transaction-commit"),
        new javax.xml.namespace.QName("", "transaction-rollback"),
        new javax.xml.namespace.QName("", "transaction-begin"),
        new javax.xml.namespace.QName("", "EntityTxOperations"),
    });
    
    
    /**
     * Gets the "EntityTxOperations" element
     */
    public org.apache.xmlbeans.XmlObject getEntityTxOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ENTITYTXOPERATIONS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EntityTxOperations" element
     */
    public void setEntityTxOperations(org.apache.xmlbeans.XmlObject entityTxOperations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ENTITYTXOPERATIONS$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ENTITYTXOPERATIONS$0);
            }
            target.set(entityTxOperations);
        }
    }
    
    /**
     * Appends and returns a new empty "EntityTxOperations" element
     */
    public org.apache.xmlbeans.XmlObject addNewEntityTxOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ENTITYTXOPERATIONS$0);
            return target;
        }
    }
}
