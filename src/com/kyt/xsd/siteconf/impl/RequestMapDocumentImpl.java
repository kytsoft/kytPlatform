/*
 * An XML document type.
 * Localname: request-map
 * Namespace: 
 * Java type: com.kyt.xsd.siteconf.RequestMapDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.siteconf.impl;
/**
 * A document containing one request-map(@) element.
 *
 * This is a complex type.
 */
public class RequestMapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.RequestMapDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestMapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTMAP$0 = 
        new javax.xml.namespace.QName("", "request-map");
    
    
    /**
     * Gets the "request-map" element
     */
    public com.kyt.xsd.siteconf.RequestMapDocument.RequestMap getRequestMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.RequestMapDocument.RequestMap target = null;
            target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap)get_store().find_element_user(REQUESTMAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "request-map" element
     */
    public void setRequestMap(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap requestMap)
    {
        generatedSetterHelperImpl(requestMap, REQUESTMAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "request-map" element
     */
    public com.kyt.xsd.siteconf.RequestMapDocument.RequestMap addNewRequestMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.RequestMapDocument.RequestMap target = null;
            target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap)get_store().add_element_user(REQUESTMAP$0);
            return target;
        }
    }
    /**
     * An XML request-map(@).
     *
     * This is a complex type.
     */
    public static class RequestMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.RequestMapDocument.RequestMap
    {
        private static final long serialVersionUID = 1L;
        
        public RequestMapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName SECURITY$2 = 
            new javax.xml.namespace.QName("", "security");
        private static final javax.xml.namespace.QName METRIC$4 = 
            new javax.xml.namespace.QName("", "metric");
        private static final javax.xml.namespace.QName EVENT$6 = 
            new javax.xml.namespace.QName("", "event");
        private static final javax.xml.namespace.QName RESPONSE$8 = 
            new javax.xml.namespace.QName("", "response");
        private static final javax.xml.namespace.QName URI$10 = 
            new javax.xml.namespace.QName("", "uri");
        private static final javax.xml.namespace.QName EDIT$12 = 
            new javax.xml.namespace.QName("", "edit");
        private static final javax.xml.namespace.QName TRACKVISIT$14 = 
            new javax.xml.namespace.QName("", "track-visit");
        private static final javax.xml.namespace.QName TRACKSERVERHIT$16 = 
            new javax.xml.namespace.QName("", "track-serverhit");
        
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "description" element
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$0) != 0;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
                }
                target.set(description);
            }
        }
        
        /**
         * Unsets the "description" element
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$0, 0);
            }
        }
        
        /**
         * Gets the "security" element
         */
        public com.kyt.xsd.siteconf.SecurityDocument.Security getSecurity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.SecurityDocument.Security target = null;
                target = (com.kyt.xsd.siteconf.SecurityDocument.Security)get_store().find_element_user(SECURITY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "security" element
         */
        public boolean isSetSecurity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SECURITY$2) != 0;
            }
        }
        
        /**
         * Sets the "security" element
         */
        public void setSecurity(com.kyt.xsd.siteconf.SecurityDocument.Security security)
        {
            generatedSetterHelperImpl(security, SECURITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "security" element
         */
        public com.kyt.xsd.siteconf.SecurityDocument.Security addNewSecurity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.SecurityDocument.Security target = null;
                target = (com.kyt.xsd.siteconf.SecurityDocument.Security)get_store().add_element_user(SECURITY$2);
                return target;
            }
        }
        
        /**
         * Unsets the "security" element
         */
        public void unsetSecurity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SECURITY$2, 0);
            }
        }
        
        /**
         * Gets the "metric" element
         */
        public com.kyt.xsd.siteconf.MetricDocument.Metric getMetric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.MetricDocument.Metric target = null;
                target = (com.kyt.xsd.siteconf.MetricDocument.Metric)get_store().find_element_user(METRIC$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "metric" element
         */
        public boolean isSetMetric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(METRIC$4) != 0;
            }
        }
        
        /**
         * Sets the "metric" element
         */
        public void setMetric(com.kyt.xsd.siteconf.MetricDocument.Metric metric)
        {
            generatedSetterHelperImpl(metric, METRIC$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "metric" element
         */
        public com.kyt.xsd.siteconf.MetricDocument.Metric addNewMetric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.MetricDocument.Metric target = null;
                target = (com.kyt.xsd.siteconf.MetricDocument.Metric)get_store().add_element_user(METRIC$4);
                return target;
            }
        }
        
        /**
         * Unsets the "metric" element
         */
        public void unsetMetric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(METRIC$4, 0);
            }
        }
        
        /**
         * Gets the "event" element
         */
        public com.kyt.xsd.siteconf.EventDocument.Event getEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.EventDocument.Event target = null;
                target = (com.kyt.xsd.siteconf.EventDocument.Event)get_store().find_element_user(EVENT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "event" element
         */
        public boolean isSetEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVENT$6) != 0;
            }
        }
        
        /**
         * Sets the "event" element
         */
        public void setEvent(com.kyt.xsd.siteconf.EventDocument.Event event)
        {
            generatedSetterHelperImpl(event, EVENT$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "event" element
         */
        public com.kyt.xsd.siteconf.EventDocument.Event addNewEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.EventDocument.Event target = null;
                target = (com.kyt.xsd.siteconf.EventDocument.Event)get_store().add_element_user(EVENT$6);
                return target;
            }
        }
        
        /**
         * Unsets the "event" element
         */
        public void unsetEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVENT$6, 0);
            }
        }
        
        /**
         * Gets array of all "response" elements
         */
        public com.kyt.xsd.siteconf.ResponseDocument.Response[] getResponseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESPONSE$8, targetList);
                com.kyt.xsd.siteconf.ResponseDocument.Response[] result = new com.kyt.xsd.siteconf.ResponseDocument.Response[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "response" element
         */
        public com.kyt.xsd.siteconf.ResponseDocument.Response getResponseArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.ResponseDocument.Response target = null;
                target = (com.kyt.xsd.siteconf.ResponseDocument.Response)get_store().find_element_user(RESPONSE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "response" element
         */
        public int sizeOfResponseArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESPONSE$8);
            }
        }
        
        /**
         * Sets array of all "response" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setResponseArray(com.kyt.xsd.siteconf.ResponseDocument.Response[] responseArray)
        {
            check_orphaned();
            arraySetterHelper(responseArray, RESPONSE$8);
        }
        
        /**
         * Sets ith "response" element
         */
        public void setResponseArray(int i, com.kyt.xsd.siteconf.ResponseDocument.Response response)
        {
            generatedSetterHelperImpl(response, RESPONSE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "response" element
         */
        public com.kyt.xsd.siteconf.ResponseDocument.Response insertNewResponse(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.ResponseDocument.Response target = null;
                target = (com.kyt.xsd.siteconf.ResponseDocument.Response)get_store().insert_element_user(RESPONSE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "response" element
         */
        public com.kyt.xsd.siteconf.ResponseDocument.Response addNewResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.ResponseDocument.Response target = null;
                target = (com.kyt.xsd.siteconf.ResponseDocument.Response)get_store().add_element_user(RESPONSE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "response" element
         */
        public void removeResponse(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESPONSE$8, i);
            }
        }
        
        /**
         * Gets the "uri" attribute
         */
        public java.lang.String getUri()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "uri" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUri()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URI$10);
                return target;
            }
        }
        
        /**
         * Sets the "uri" attribute
         */
        public void setUri(java.lang.String uri)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$10);
                }
                target.setStringValue(uri);
            }
        }
        
        /**
         * Sets (as xml) the "uri" attribute
         */
        public void xsetUri(org.apache.xmlbeans.XmlString uri)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URI$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URI$10);
                }
                target.set(uri);
            }
        }
        
        /**
         * Gets the "edit" attribute
         */
        public com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit.Enum getEdit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDIT$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EDIT$12);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "edit" attribute
         */
        public com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit xgetEdit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit target = null;
                target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit)get_store().find_attribute_user(EDIT$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit)get_default_attribute_value(EDIT$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "edit" attribute
         */
        public boolean isSetEdit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EDIT$12) != null;
            }
        }
        
        /**
         * Sets the "edit" attribute
         */
        public void setEdit(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit.Enum edit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EDIT$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EDIT$12);
                }
                target.setEnumValue(edit);
            }
        }
        
        /**
         * Sets (as xml) the "edit" attribute
         */
        public void xsetEdit(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit edit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit target = null;
                target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit)get_store().find_attribute_user(EDIT$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit)get_store().add_attribute_user(EDIT$12);
                }
                target.set(edit);
            }
        }
        
        /**
         * Unsets the "edit" attribute
         */
        public void unsetEdit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EDIT$12);
            }
        }
        
        /**
         * Gets the "track-visit" attribute
         */
        public com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit.Enum getTrackVisit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACKVISIT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRACKVISIT$14);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "track-visit" attribute
         */
        public com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit xgetTrackVisit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit target = null;
                target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit)get_store().find_attribute_user(TRACKVISIT$14);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit)get_default_attribute_value(TRACKVISIT$14);
                }
                return target;
            }
        }
        
        /**
         * True if has "track-visit" attribute
         */
        public boolean isSetTrackVisit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TRACKVISIT$14) != null;
            }
        }
        
        /**
         * Sets the "track-visit" attribute
         */
        public void setTrackVisit(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit.Enum trackVisit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACKVISIT$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRACKVISIT$14);
                }
                target.setEnumValue(trackVisit);
            }
        }
        
        /**
         * Sets (as xml) the "track-visit" attribute
         */
        public void xsetTrackVisit(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit trackVisit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit target = null;
                target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit)get_store().find_attribute_user(TRACKVISIT$14);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit)get_store().add_attribute_user(TRACKVISIT$14);
                }
                target.set(trackVisit);
            }
        }
        
        /**
         * Unsets the "track-visit" attribute
         */
        public void unsetTrackVisit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TRACKVISIT$14);
            }
        }
        
        /**
         * Gets the "track-serverhit" attribute
         */
        public com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit.Enum getTrackServerhit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACKSERVERHIT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TRACKSERVERHIT$16);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "track-serverhit" attribute
         */
        public com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit xgetTrackServerhit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit target = null;
                target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit)get_store().find_attribute_user(TRACKSERVERHIT$16);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit)get_default_attribute_value(TRACKSERVERHIT$16);
                }
                return target;
            }
        }
        
        /**
         * True if has "track-serverhit" attribute
         */
        public boolean isSetTrackServerhit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TRACKSERVERHIT$16) != null;
            }
        }
        
        /**
         * Sets the "track-serverhit" attribute
         */
        public void setTrackServerhit(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit.Enum trackServerhit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACKSERVERHIT$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRACKSERVERHIT$16);
                }
                target.setEnumValue(trackServerhit);
            }
        }
        
        /**
         * Sets (as xml) the "track-serverhit" attribute
         */
        public void xsetTrackServerhit(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit trackServerhit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit target = null;
                target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit)get_store().find_attribute_user(TRACKSERVERHIT$16);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit)get_store().add_attribute_user(TRACKSERVERHIT$16);
                }
                target.set(trackServerhit);
            }
        }
        
        /**
         * Unsets the "track-serverhit" attribute
         */
        public void unsetTrackServerhit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TRACKSERVERHIT$16);
            }
        }
        /**
         * An XML edit(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.RequestMapDocument$RequestMap$Edit.
         */
        public static class EditImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit
        {
            private static final long serialVersionUID = 1L;
            
            public EditImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected EditImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML track-visit(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.RequestMapDocument$RequestMap$TrackVisit.
         */
        public static class TrackVisitImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit
        {
            private static final long serialVersionUID = 1L;
            
            public TrackVisitImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TrackVisitImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML track-serverhit(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.RequestMapDocument$RequestMap$TrackServerhit.
         */
        public static class TrackServerhitImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit
        {
            private static final long serialVersionUID = 1L;
            
            public TrackServerhitImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TrackServerhitImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
