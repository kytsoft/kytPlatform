/*
 * An XML document type.
 * Localname: service
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.ServiceDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one service(@) element.
 *
 * This is a complex type.
 */
public class ServiceDocumentImpl extends com.kyt.xsd.widgetform.impl.AllActionsDocumentImpl implements com.kyt.xsd.widgetform.ServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("", "service");
    
    
    /**
     * Gets the "service" element
     */
    public com.kyt.xsd.widgetform.ServiceDocument.Service getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.ServiceDocument.Service target = null;
            target = (com.kyt.xsd.widgetform.ServiceDocument.Service)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service" element
     */
    public void setService(com.kyt.xsd.widgetform.ServiceDocument.Service service)
    {
        generatedSetterHelperImpl(service, SERVICE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "service" element
     */
    public com.kyt.xsd.widgetform.ServiceDocument.Service addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.ServiceDocument.Service target = null;
            target = (com.kyt.xsd.widgetform.ServiceDocument.Service)get_store().add_element_user(SERVICE$0);
            return target;
        }
    }
    /**
     * An XML service(@).
     *
     * This is a complex type.
     */
    public static class ServiceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.ServiceDocument.Service
    {
        private static final long serialVersionUID = 1L;
        
        public ServiceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELDMAP$0 = 
            new javax.xml.namespace.QName("", "field-map");
        private static final javax.xml.namespace.QName SERVICENAME$2 = 
            new javax.xml.namespace.QName("", "service-name");
        private static final javax.xml.namespace.QName RESULTMAP$4 = 
            new javax.xml.namespace.QName("", "result-map");
        private static final javax.xml.namespace.QName AUTOFIELDMAP$6 = 
            new javax.xml.namespace.QName("", "auto-field-map");
        private static final javax.xml.namespace.QName RESULTMAPLIST$8 = 
            new javax.xml.namespace.QName("", "result-map-list");
        private static final javax.xml.namespace.QName IGNOREERROR$10 = 
            new javax.xml.namespace.QName("", "ignore-error");
        
        
        /**
         * Gets array of all "field-map" elements
         */
        public com.kyt.xsd.widgetform.FieldMapDocument.FieldMap[] getFieldMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELDMAP$0, targetList);
                com.kyt.xsd.widgetform.FieldMapDocument.FieldMap[] result = new com.kyt.xsd.widgetform.FieldMapDocument.FieldMap[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "field-map" element
         */
        public com.kyt.xsd.widgetform.FieldMapDocument.FieldMap getFieldMapArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldMapDocument.FieldMap target = null;
                target = (com.kyt.xsd.widgetform.FieldMapDocument.FieldMap)get_store().find_element_user(FIELDMAP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "field-map" element
         */
        public int sizeOfFieldMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDMAP$0);
            }
        }
        
        /**
         * Sets array of all "field-map" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFieldMapArray(com.kyt.xsd.widgetform.FieldMapDocument.FieldMap[] fieldMapArray)
        {
            check_orphaned();
            arraySetterHelper(fieldMapArray, FIELDMAP$0);
        }
        
        /**
         * Sets ith "field-map" element
         */
        public void setFieldMapArray(int i, com.kyt.xsd.widgetform.FieldMapDocument.FieldMap fieldMap)
        {
            generatedSetterHelperImpl(fieldMap, FIELDMAP$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field-map" element
         */
        public com.kyt.xsd.widgetform.FieldMapDocument.FieldMap insertNewFieldMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldMapDocument.FieldMap target = null;
                target = (com.kyt.xsd.widgetform.FieldMapDocument.FieldMap)get_store().insert_element_user(FIELDMAP$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field-map" element
         */
        public com.kyt.xsd.widgetform.FieldMapDocument.FieldMap addNewFieldMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldMapDocument.FieldMap target = null;
                target = (com.kyt.xsd.widgetform.FieldMapDocument.FieldMap)get_store().add_element_user(FIELDMAP$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "field-map" element
         */
        public void removeFieldMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDMAP$0, i);
            }
        }
        
        /**
         * Gets the "service-name" attribute
         */
        public java.lang.String getServiceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICENAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "service-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetServiceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICENAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "service-name" attribute
         */
        public void setServiceName(java.lang.String serviceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICENAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICENAME$2);
                }
                target.setStringValue(serviceName);
            }
        }
        
        /**
         * Sets (as xml) the "service-name" attribute
         */
        public void xsetServiceName(org.apache.xmlbeans.XmlString serviceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICENAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERVICENAME$2);
                }
                target.set(serviceName);
            }
        }
        
        /**
         * Gets the "result-map" attribute
         */
        public java.lang.String getResultMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTMAP$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "result-map" attribute
         */
        public org.apache.xmlbeans.XmlString xgetResultMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESULTMAP$4);
                return target;
            }
        }
        
        /**
         * True if has "result-map" attribute
         */
        public boolean isSetResultMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESULTMAP$4) != null;
            }
        }
        
        /**
         * Sets the "result-map" attribute
         */
        public void setResultMap(java.lang.String resultMap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTMAP$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESULTMAP$4);
                }
                target.setStringValue(resultMap);
            }
        }
        
        /**
         * Sets (as xml) the "result-map" attribute
         */
        public void xsetResultMap(org.apache.xmlbeans.XmlString resultMap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESULTMAP$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESULTMAP$4);
                }
                target.set(resultMap);
            }
        }
        
        /**
         * Unsets the "result-map" attribute
         */
        public void unsetResultMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESULTMAP$4);
            }
        }
        
        /**
         * Gets the "auto-field-map" attribute
         */
        public java.lang.String getAutoFieldMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFIELDMAP$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOFIELDMAP$6);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "auto-field-map" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAutoFieldMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AUTOFIELDMAP$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(AUTOFIELDMAP$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "auto-field-map" attribute
         */
        public boolean isSetAutoFieldMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AUTOFIELDMAP$6) != null;
            }
        }
        
        /**
         * Sets the "auto-field-map" attribute
         */
        public void setAutoFieldMap(java.lang.String autoFieldMap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOFIELDMAP$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOFIELDMAP$6);
                }
                target.setStringValue(autoFieldMap);
            }
        }
        
        /**
         * Sets (as xml) the "auto-field-map" attribute
         */
        public void xsetAutoFieldMap(org.apache.xmlbeans.XmlString autoFieldMap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AUTOFIELDMAP$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AUTOFIELDMAP$6);
                }
                target.set(autoFieldMap);
            }
        }
        
        /**
         * Unsets the "auto-field-map" attribute
         */
        public void unsetAutoFieldMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AUTOFIELDMAP$6);
            }
        }
        
        /**
         * Gets the "result-map-list" attribute
         */
        public java.lang.String getResultMapList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTMAPLIST$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "result-map-list" attribute
         */
        public org.apache.xmlbeans.XmlString xgetResultMapList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESULTMAPLIST$8);
                return target;
            }
        }
        
        /**
         * True if has "result-map-list" attribute
         */
        public boolean isSetResultMapList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESULTMAPLIST$8) != null;
            }
        }
        
        /**
         * Sets the "result-map-list" attribute
         */
        public void setResultMapList(java.lang.String resultMapList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTMAPLIST$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESULTMAPLIST$8);
                }
                target.setStringValue(resultMapList);
            }
        }
        
        /**
         * Sets (as xml) the "result-map-list" attribute
         */
        public void xsetResultMapList(org.apache.xmlbeans.XmlString resultMapList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RESULTMAPLIST$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RESULTMAPLIST$8);
                }
                target.set(resultMapList);
            }
        }
        
        /**
         * Unsets the "result-map-list" attribute
         */
        public void unsetResultMapList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESULTMAPLIST$8);
            }
        }
        
        /**
         * Gets the "ignore-error" attribute
         */
        public com.kyt.xsd.widgetform.ServiceDocument.Service.IgnoreError.Enum getIgnoreError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREERROR$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IGNOREERROR$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.ServiceDocument.Service.IgnoreError.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ignore-error" attribute
         */
        public com.kyt.xsd.widgetform.ServiceDocument.Service.IgnoreError xgetIgnoreError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ServiceDocument.Service.IgnoreError target = null;
                target = (com.kyt.xsd.widgetform.ServiceDocument.Service.IgnoreError)get_store().find_attribute_user(IGNOREERROR$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.ServiceDocument.Service.IgnoreError)get_default_attribute_value(IGNOREERROR$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "ignore-error" attribute
         */
        public boolean isSetIgnoreError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IGNOREERROR$10) != null;
            }
        }
        
        /**
         * Sets the "ignore-error" attribute
         */
        public void setIgnoreError(com.kyt.xsd.widgetform.ServiceDocument.Service.IgnoreError.Enum ignoreError)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IGNOREERROR$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IGNOREERROR$10);
                }
                target.setEnumValue(ignoreError);
            }
        }
        
        /**
         * Sets (as xml) the "ignore-error" attribute
         */
        public void xsetIgnoreError(com.kyt.xsd.widgetform.ServiceDocument.Service.IgnoreError ignoreError)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ServiceDocument.Service.IgnoreError target = null;
                target = (com.kyt.xsd.widgetform.ServiceDocument.Service.IgnoreError)get_store().find_attribute_user(IGNOREERROR$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.ServiceDocument.Service.IgnoreError)get_store().add_attribute_user(IGNOREERROR$10);
                }
                target.set(ignoreError);
            }
        }
        
        /**
         * Unsets the "ignore-error" attribute
         */
        public void unsetIgnoreError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IGNOREERROR$10);
            }
        }
        /**
         * An XML ignore-error(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.ServiceDocument$Service$IgnoreError.
         */
        public static class IgnoreErrorImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.ServiceDocument.Service.IgnoreError
        {
            private static final long serialVersionUID = 1L;
            
            public IgnoreErrorImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected IgnoreErrorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
