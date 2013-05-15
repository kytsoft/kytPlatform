/*
 * An XML document type.
 * Localname: EventOperations
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.EventOperationsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one EventOperations(@) element.
 *
 * This is a complex type.
 */
public class EventOperationsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.EventOperationsDocument
{
    private static final long serialVersionUID = 1L;
    
    public EventOperationsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTOPERATIONS$0 = 
        new javax.xml.namespace.QName("", "EventOperations");
    private static final org.apache.xmlbeans.QNameSet EVENTOPERATIONS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("", "request-to-field"),
        new javax.xml.namespace.QName("", "session-to-field"),
        new javax.xml.namespace.QName("", "webapp-property-to-field"),
        new javax.xml.namespace.QName("", "field-to-session"),
        new javax.xml.namespace.QName("", "request-parameters-to-list"),
        new javax.xml.namespace.QName("", "field-to-request"),
        new javax.xml.namespace.QName("", "EventOperations"),
    });
    
    
    /**
     * Gets the "EventOperations" element
     */
    public org.apache.xmlbeans.XmlObject getEventOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(EVENTOPERATIONS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EventOperations" element
     */
    public void setEventOperations(org.apache.xmlbeans.XmlObject eventOperations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(EVENTOPERATIONS$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(EVENTOPERATIONS$0);
            }
            target.set(eventOperations);
        }
    }
    
    /**
     * Appends and returns a new empty "EventOperations" element
     */
    public org.apache.xmlbeans.XmlObject addNewEventOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(EVENTOPERATIONS$0);
            return target;
        }
    }
}
