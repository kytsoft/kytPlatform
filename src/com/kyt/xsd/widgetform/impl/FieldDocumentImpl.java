/*
 * An XML document type.
 * Localname: field
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.FieldDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one field(@) element.
 *
 * This is a complex type.
 */
public class FieldDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.FieldDocument
{
    private static final long serialVersionUID = 1L;
    
    public FieldDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELD$0 = 
        new javax.xml.namespace.QName("", "field");
    
    
    /**
     * Gets the "field" element
     */
    public com.kyt.xsd.widgetform.FieldDocument.Field getField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.FieldDocument.Field target = null;
            target = (com.kyt.xsd.widgetform.FieldDocument.Field)get_store().find_element_user(FIELD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "field" element
     */
    public void setField(com.kyt.xsd.widgetform.FieldDocument.Field field)
    {
        generatedSetterHelperImpl(field, FIELD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "field" element
     */
    public com.kyt.xsd.widgetform.FieldDocument.Field addNewField()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.FieldDocument.Field target = null;
            target = (com.kyt.xsd.widgetform.FieldDocument.Field)get_store().add_element_user(FIELD$0);
            return target;
        }
    }
    /**
     * An XML field(@).
     *
     * This is a complex type.
     */
    public static class FieldImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.FieldDocument.Field
    {
        private static final long serialVersionUID = 1L;
        
        public FieldImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALLFIELDS$0 = 
            new javax.xml.namespace.QName("", "AllFields");
        private static final org.apache.xmlbeans.QNameSet ALLFIELDS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("", "display-entity"),
            new javax.xml.namespace.QName("", "text"),
            new javax.xml.namespace.QName("", "ignored"),
            new javax.xml.namespace.QName("", "submit"),
            new javax.xml.namespace.QName("", "check"),
            new javax.xml.namespace.QName("", "date-time"),
            new javax.xml.namespace.QName("", "image"),
            new javax.xml.namespace.QName("", "display"),
            new javax.xml.namespace.QName("", "password"),
            new javax.xml.namespace.QName("", "lookup"),
            new javax.xml.namespace.QName("", "date-find"),
            new javax.xml.namespace.QName("", "AllFields"),
            new javax.xml.namespace.QName("", "text-find"),
            new javax.xml.namespace.QName("", "hidden"),
            new javax.xml.namespace.QName("", "file"),
            new javax.xml.namespace.QName("", "drop-down"),
            new javax.xml.namespace.QName("", "container"),
            new javax.xml.namespace.QName("", "textarea"),
            new javax.xml.namespace.QName("", "hyperlink"),
            new javax.xml.namespace.QName("", "radio"),
            new javax.xml.namespace.QName("", "reset"),
            new javax.xml.namespace.QName("", "range-find"),
        });
        private static final javax.xml.namespace.QName ONFIELDEVENTUPDATEAREA$2 = 
            new javax.xml.namespace.QName("", "on-field-event-update-area");
        private static final javax.xml.namespace.QName NAME$4 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName MAPNAME$6 = 
            new javax.xml.namespace.QName("", "map-name");
        private static final javax.xml.namespace.QName ENTITYNAME$8 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName FIELDNAME$10 = 
            new javax.xml.namespace.QName("", "field-name");
        private static final javax.xml.namespace.QName SERVICENAME$12 = 
            new javax.xml.namespace.QName("", "service-name");
        private static final javax.xml.namespace.QName ATTRIBUTENAME$14 = 
            new javax.xml.namespace.QName("", "attribute-name");
        private static final javax.xml.namespace.QName ENTRYNAME$16 = 
            new javax.xml.namespace.QName("", "entry-name");
        private static final javax.xml.namespace.QName PARAMETERNAME$18 = 
            new javax.xml.namespace.QName("", "parameter-name");
        private static final javax.xml.namespace.QName TITLE$20 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName HEADERLINK$22 = 
            new javax.xml.namespace.QName("", "header-link");
        private static final javax.xml.namespace.QName HEADERLINKSTYLE$24 = 
            new javax.xml.namespace.QName("", "header-link-style");
        private static final javax.xml.namespace.QName TOOLTIP$26 = 
            new javax.xml.namespace.QName("", "tooltip");
        private static final javax.xml.namespace.QName TITLEAREASTYLE$28 = 
            new javax.xml.namespace.QName("", "title-area-style");
        private static final javax.xml.namespace.QName WIDGETAREASTYLE$30 = 
            new javax.xml.namespace.QName("", "widget-area-style");
        private static final javax.xml.namespace.QName TITLESTYLE$32 = 
            new javax.xml.namespace.QName("", "title-style");
        private static final javax.xml.namespace.QName WIDGETSTYLE$34 = 
            new javax.xml.namespace.QName("", "widget-style");
        private static final javax.xml.namespace.QName TOOLTIPSTYLE$36 = 
            new javax.xml.namespace.QName("", "tooltip-style");
        private static final javax.xml.namespace.QName POSITION$38 = 
            new javax.xml.namespace.QName("", "position");
        private static final javax.xml.namespace.QName REDWHEN$40 = 
            new javax.xml.namespace.QName("", "red-when");
        private static final javax.xml.namespace.QName USEWHEN$42 = 
            new javax.xml.namespace.QName("", "use-when");
        private static final javax.xml.namespace.QName ENCODEOUTPUT$44 = 
            new javax.xml.namespace.QName("", "encode-output");
        private static final javax.xml.namespace.QName EVENT$46 = 
            new javax.xml.namespace.QName("", "event");
        private static final javax.xml.namespace.QName ACTION$48 = 
            new javax.xml.namespace.QName("", "action");
        private static final javax.xml.namespace.QName IDNAME$50 = 
            new javax.xml.namespace.QName("", "id-name");
        private static final javax.xml.namespace.QName SEPARATECOLUMN$52 = 
            new javax.xml.namespace.QName("", "separate-column");
        private static final javax.xml.namespace.QName REQUIREDFIELD$54 = 
            new javax.xml.namespace.QName("", "required-field");
        private static final javax.xml.namespace.QName REQUIREDFIELDSTYLE$56 = 
            new javax.xml.namespace.QName("", "required-field-style");
        private static final javax.xml.namespace.QName SORTFIELD$58 = 
            new javax.xml.namespace.QName("", "sort-field");
        private static final javax.xml.namespace.QName SORTFIELDSTYLE$60 = 
            new javax.xml.namespace.QName("", "sort-field-style");
        private static final javax.xml.namespace.QName SORTFIELDASCSTYLE$62 = 
            new javax.xml.namespace.QName("", "sort-field-asc-style");
        private static final javax.xml.namespace.QName SORTFIELDDESCSTYLE$64 = 
            new javax.xml.namespace.QName("", "sort-field-desc-style");
        
        
        /**
         * Gets the "AllFields" element
         */
        public org.apache.xmlbeans.XmlObject getAllFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLFIELDS$1, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AllFields" element
         */
        public boolean isSetAllFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALLFIELDS$1) != 0;
            }
        }
        
        /**
         * Sets the "AllFields" element
         */
        public void setAllFields(org.apache.xmlbeans.XmlObject allFields)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ALLFIELDS$1, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLFIELDS$0);
                }
                target.set(allFields);
            }
        }
        
        /**
         * Appends and returns a new empty "AllFields" element
         */
        public org.apache.xmlbeans.XmlObject addNewAllFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ALLFIELDS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "AllFields" element
         */
        public void unsetAllFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALLFIELDS$1, 0);
            }
        }
        
        /**
         * Gets array of all "on-field-event-update-area" elements
         */
        public com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea[] getOnFieldEventUpdateAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ONFIELDEVENTUPDATEAREA$2, targetList);
                com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea[] result = new com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "on-field-event-update-area" element
         */
        public com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea getOnFieldEventUpdateAreaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea target = null;
                target = (com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea)get_store().find_element_user(ONFIELDEVENTUPDATEAREA$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "on-field-event-update-area" element
         */
        public int sizeOfOnFieldEventUpdateAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ONFIELDEVENTUPDATEAREA$2);
            }
        }
        
        /**
         * Sets array of all "on-field-event-update-area" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOnFieldEventUpdateAreaArray(com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea[] onFieldEventUpdateAreaArray)
        {
            check_orphaned();
            arraySetterHelper(onFieldEventUpdateAreaArray, ONFIELDEVENTUPDATEAREA$2);
        }
        
        /**
         * Sets ith "on-field-event-update-area" element
         */
        public void setOnFieldEventUpdateAreaArray(int i, com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea onFieldEventUpdateArea)
        {
            generatedSetterHelperImpl(onFieldEventUpdateArea, ONFIELDEVENTUPDATEAREA$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "on-field-event-update-area" element
         */
        public com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea insertNewOnFieldEventUpdateArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea target = null;
                target = (com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea)get_store().insert_element_user(ONFIELDEVENTUPDATEAREA$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "on-field-event-update-area" element
         */
        public com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea addNewOnFieldEventUpdateArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea target = null;
                target = (com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea)get_store().add_element_user(ONFIELDEVENTUPDATEAREA$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "on-field-event-update-area" element
         */
        public void removeOnFieldEventUpdateArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ONFIELDEVENTUPDATEAREA$2, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "map-name" attribute
         */
        public java.lang.String getMapName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPNAME$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "map-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMapName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAPNAME$6);
                return target;
            }
        }
        
        /**
         * True if has "map-name" attribute
         */
        public boolean isSetMapName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MAPNAME$6) != null;
            }
        }
        
        /**
         * Sets the "map-name" attribute
         */
        public void setMapName(java.lang.String mapName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAPNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAPNAME$6);
                }
                target.setStringValue(mapName);
            }
        }
        
        /**
         * Sets (as xml) the "map-name" attribute
         */
        public void xsetMapName(org.apache.xmlbeans.XmlString mapName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAPNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAPNAME$6);
                }
                target.set(mapName);
            }
        }
        
        /**
         * Unsets the "map-name" attribute
         */
        public void unsetMapName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MAPNAME$6);
            }
        }
        
        /**
         * Gets the "entity-name" attribute
         */
        public java.lang.String getEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entity-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$8);
                return target;
            }
        }
        
        /**
         * True if has "entity-name" attribute
         */
        public boolean isSetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENTITYNAME$8) != null;
            }
        }
        
        /**
         * Sets the "entity-name" attribute
         */
        public void setEntityName(java.lang.String entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$8);
                }
                target.setStringValue(entityName);
            }
        }
        
        /**
         * Sets (as xml) the "entity-name" attribute
         */
        public void xsetEntityName(org.apache.xmlbeans.XmlString entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$8);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Unsets the "entity-name" attribute
         */
        public void unsetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENTITYNAME$8);
            }
        }
        
        /**
         * Gets the "field-name" attribute
         */
        public java.lang.String getFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$10);
                return target;
            }
        }
        
        /**
         * True if has "field-name" attribute
         */
        public boolean isSetFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FIELDNAME$10) != null;
            }
        }
        
        /**
         * Sets the "field-name" attribute
         */
        public void setFieldName(java.lang.String fieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDNAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDNAME$10);
                }
                target.setStringValue(fieldName);
            }
        }
        
        /**
         * Sets (as xml) the "field-name" attribute
         */
        public void xsetFieldName(org.apache.xmlbeans.XmlString fieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDNAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDNAME$10);
                }
                target.set(fieldName);
            }
        }
        
        /**
         * Unsets the "field-name" attribute
         */
        public void unsetFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FIELDNAME$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICENAME$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICENAME$12);
                return target;
            }
        }
        
        /**
         * True if has "service-name" attribute
         */
        public boolean isSetServiceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SERVICENAME$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICENAME$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICENAME$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICENAME$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERVICENAME$12);
                }
                target.set(serviceName);
            }
        }
        
        /**
         * Unsets the "service-name" attribute
         */
        public void unsetServiceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SERVICENAME$12);
            }
        }
        
        /**
         * Gets the "attribute-name" attribute
         */
        public java.lang.String getAttributeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTRIBUTENAME$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "attribute-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAttributeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ATTRIBUTENAME$14);
                return target;
            }
        }
        
        /**
         * True if has "attribute-name" attribute
         */
        public boolean isSetAttributeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ATTRIBUTENAME$14) != null;
            }
        }
        
        /**
         * Sets the "attribute-name" attribute
         */
        public void setAttributeName(java.lang.String attributeName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ATTRIBUTENAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ATTRIBUTENAME$14);
                }
                target.setStringValue(attributeName);
            }
        }
        
        /**
         * Sets (as xml) the "attribute-name" attribute
         */
        public void xsetAttributeName(org.apache.xmlbeans.XmlString attributeName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ATTRIBUTENAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ATTRIBUTENAME$14);
                }
                target.set(attributeName);
            }
        }
        
        /**
         * Unsets the "attribute-name" attribute
         */
        public void unsetAttributeName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ATTRIBUTENAME$14);
            }
        }
        
        /**
         * Gets the "entry-name" attribute
         */
        public java.lang.String getEntryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTRYNAME$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entry-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEntryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTRYNAME$16);
                return target;
            }
        }
        
        /**
         * True if has "entry-name" attribute
         */
        public boolean isSetEntryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENTRYNAME$16) != null;
            }
        }
        
        /**
         * Sets the "entry-name" attribute
         */
        public void setEntryName(java.lang.String entryName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTRYNAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTRYNAME$16);
                }
                target.setStringValue(entryName);
            }
        }
        
        /**
         * Sets (as xml) the "entry-name" attribute
         */
        public void xsetEntryName(org.apache.xmlbeans.XmlString entryName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTRYNAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTRYNAME$16);
                }
                target.set(entryName);
            }
        }
        
        /**
         * Unsets the "entry-name" attribute
         */
        public void unsetEntryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENTRYNAME$16);
            }
        }
        
        /**
         * Gets the "parameter-name" attribute
         */
        public java.lang.String getParameterName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERNAME$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parameter-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetParameterName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAMETERNAME$18);
                return target;
            }
        }
        
        /**
         * True if has "parameter-name" attribute
         */
        public boolean isSetParameterName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARAMETERNAME$18) != null;
            }
        }
        
        /**
         * Sets the "parameter-name" attribute
         */
        public void setParameterName(java.lang.String parameterName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERNAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARAMETERNAME$18);
                }
                target.setStringValue(parameterName);
            }
        }
        
        /**
         * Sets (as xml) the "parameter-name" attribute
         */
        public void xsetParameterName(org.apache.xmlbeans.XmlString parameterName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAMETERNAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARAMETERNAME$18);
                }
                target.set(parameterName);
            }
        }
        
        /**
         * Unsets the "parameter-name" attribute
         */
        public void unsetParameterName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARAMETERNAME$18);
            }
        }
        
        /**
         * Gets the "title" attribute
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$20);
                return target;
            }
        }
        
        /**
         * True if has "title" attribute
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TITLE$20) != null;
            }
        }
        
        /**
         * Sets the "title" attribute
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$20);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" attribute
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$20);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "title" attribute
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TITLE$20);
            }
        }
        
        /**
         * Gets the "header-link" attribute
         */
        public java.lang.String getHeaderLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERLINK$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "header-link" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHeaderLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADERLINK$22);
                return target;
            }
        }
        
        /**
         * True if has "header-link" attribute
         */
        public boolean isSetHeaderLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEADERLINK$22) != null;
            }
        }
        
        /**
         * Sets the "header-link" attribute
         */
        public void setHeaderLink(java.lang.String headerLink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERLINK$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERLINK$22);
                }
                target.setStringValue(headerLink);
            }
        }
        
        /**
         * Sets (as xml) the "header-link" attribute
         */
        public void xsetHeaderLink(org.apache.xmlbeans.XmlString headerLink)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADERLINK$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEADERLINK$22);
                }
                target.set(headerLink);
            }
        }
        
        /**
         * Unsets the "header-link" attribute
         */
        public void unsetHeaderLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEADERLINK$22);
            }
        }
        
        /**
         * Gets the "header-link-style" attribute
         */
        public java.lang.String getHeaderLinkStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERLINKSTYLE$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "header-link-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHeaderLinkStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADERLINKSTYLE$24);
                return target;
            }
        }
        
        /**
         * True if has "header-link-style" attribute
         */
        public boolean isSetHeaderLinkStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEADERLINKSTYLE$24) != null;
            }
        }
        
        /**
         * Sets the "header-link-style" attribute
         */
        public void setHeaderLinkStyle(java.lang.String headerLinkStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERLINKSTYLE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERLINKSTYLE$24);
                }
                target.setStringValue(headerLinkStyle);
            }
        }
        
        /**
         * Sets (as xml) the "header-link-style" attribute
         */
        public void xsetHeaderLinkStyle(org.apache.xmlbeans.XmlString headerLinkStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADERLINKSTYLE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEADERLINKSTYLE$24);
                }
                target.set(headerLinkStyle);
            }
        }
        
        /**
         * Unsets the "header-link-style" attribute
         */
        public void unsetHeaderLinkStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEADERLINKSTYLE$24);
            }
        }
        
        /**
         * Gets the "tooltip" attribute
         */
        public java.lang.String getTooltip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOOLTIP$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tooltip" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTooltip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOOLTIP$26);
                return target;
            }
        }
        
        /**
         * True if has "tooltip" attribute
         */
        public boolean isSetTooltip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TOOLTIP$26) != null;
            }
        }
        
        /**
         * Sets the "tooltip" attribute
         */
        public void setTooltip(java.lang.String tooltip)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOOLTIP$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOOLTIP$26);
                }
                target.setStringValue(tooltip);
            }
        }
        
        /**
         * Sets (as xml) the "tooltip" attribute
         */
        public void xsetTooltip(org.apache.xmlbeans.XmlString tooltip)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOOLTIP$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOOLTIP$26);
                }
                target.set(tooltip);
            }
        }
        
        /**
         * Unsets the "tooltip" attribute
         */
        public void unsetTooltip()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TOOLTIP$26);
            }
        }
        
        /**
         * Gets the "title-area-style" attribute
         */
        public java.lang.String getTitleAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLEAREASTYLE$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title-area-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTitleAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLEAREASTYLE$28);
                return target;
            }
        }
        
        /**
         * True if has "title-area-style" attribute
         */
        public boolean isSetTitleAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TITLEAREASTYLE$28) != null;
            }
        }
        
        /**
         * Sets the "title-area-style" attribute
         */
        public void setTitleAreaStyle(java.lang.String titleAreaStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLEAREASTYLE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLEAREASTYLE$28);
                }
                target.setStringValue(titleAreaStyle);
            }
        }
        
        /**
         * Sets (as xml) the "title-area-style" attribute
         */
        public void xsetTitleAreaStyle(org.apache.xmlbeans.XmlString titleAreaStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLEAREASTYLE$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLEAREASTYLE$28);
                }
                target.set(titleAreaStyle);
            }
        }
        
        /**
         * Unsets the "title-area-style" attribute
         */
        public void unsetTitleAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TITLEAREASTYLE$28);
            }
        }
        
        /**
         * Gets the "widget-area-style" attribute
         */
        public java.lang.String getWidgetAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDGETAREASTYLE$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "widget-area-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetWidgetAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WIDGETAREASTYLE$30);
                return target;
            }
        }
        
        /**
         * True if has "widget-area-style" attribute
         */
        public boolean isSetWidgetAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WIDGETAREASTYLE$30) != null;
            }
        }
        
        /**
         * Sets the "widget-area-style" attribute
         */
        public void setWidgetAreaStyle(java.lang.String widgetAreaStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDGETAREASTYLE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDGETAREASTYLE$30);
                }
                target.setStringValue(widgetAreaStyle);
            }
        }
        
        /**
         * Sets (as xml) the "widget-area-style" attribute
         */
        public void xsetWidgetAreaStyle(org.apache.xmlbeans.XmlString widgetAreaStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WIDGETAREASTYLE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WIDGETAREASTYLE$30);
                }
                target.set(widgetAreaStyle);
            }
        }
        
        /**
         * Unsets the "widget-area-style" attribute
         */
        public void unsetWidgetAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WIDGETAREASTYLE$30);
            }
        }
        
        /**
         * Gets the "title-style" attribute
         */
        public java.lang.String getTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLESTYLE$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLESTYLE$32);
                return target;
            }
        }
        
        /**
         * True if has "title-style" attribute
         */
        public boolean isSetTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TITLESTYLE$32) != null;
            }
        }
        
        /**
         * Sets the "title-style" attribute
         */
        public void setTitleStyle(java.lang.String titleStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLESTYLE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLESTYLE$32);
                }
                target.setStringValue(titleStyle);
            }
        }
        
        /**
         * Sets (as xml) the "title-style" attribute
         */
        public void xsetTitleStyle(org.apache.xmlbeans.XmlString titleStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLESTYLE$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLESTYLE$32);
                }
                target.set(titleStyle);
            }
        }
        
        /**
         * Unsets the "title-style" attribute
         */
        public void unsetTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TITLESTYLE$32);
            }
        }
        
        /**
         * Gets the "widget-style" attribute
         */
        public java.lang.String getWidgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDGETSTYLE$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "widget-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetWidgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WIDGETSTYLE$34);
                return target;
            }
        }
        
        /**
         * True if has "widget-style" attribute
         */
        public boolean isSetWidgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(WIDGETSTYLE$34) != null;
            }
        }
        
        /**
         * Sets the "widget-style" attribute
         */
        public void setWidgetStyle(java.lang.String widgetStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDGETSTYLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDGETSTYLE$34);
                }
                target.setStringValue(widgetStyle);
            }
        }
        
        /**
         * Sets (as xml) the "widget-style" attribute
         */
        public void xsetWidgetStyle(org.apache.xmlbeans.XmlString widgetStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WIDGETSTYLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WIDGETSTYLE$34);
                }
                target.set(widgetStyle);
            }
        }
        
        /**
         * Unsets the "widget-style" attribute
         */
        public void unsetWidgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(WIDGETSTYLE$34);
            }
        }
        
        /**
         * Gets the "tooltip-style" attribute
         */
        public java.lang.String getTooltipStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOOLTIPSTYLE$36);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "tooltip-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTooltipStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOOLTIPSTYLE$36);
                return target;
            }
        }
        
        /**
         * True if has "tooltip-style" attribute
         */
        public boolean isSetTooltipStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TOOLTIPSTYLE$36) != null;
            }
        }
        
        /**
         * Sets the "tooltip-style" attribute
         */
        public void setTooltipStyle(java.lang.String tooltipStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOOLTIPSTYLE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOOLTIPSTYLE$36);
                }
                target.setStringValue(tooltipStyle);
            }
        }
        
        /**
         * Sets (as xml) the "tooltip-style" attribute
         */
        public void xsetTooltipStyle(org.apache.xmlbeans.XmlString tooltipStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOOLTIPSTYLE$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOOLTIPSTYLE$36);
                }
                target.set(tooltipStyle);
            }
        }
        
        /**
         * Unsets the "tooltip-style" attribute
         */
        public void unsetTooltipStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TOOLTIPSTYLE$36);
            }
        }
        
        /**
         * Gets the "position" attribute
         */
        public java.math.BigInteger getPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(POSITION$38);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "position" attribute
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(POSITION$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_default_attribute_value(POSITION$38);
                }
                return target;
            }
        }
        
        /**
         * True if has "position" attribute
         */
        public boolean isSetPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POSITION$38) != null;
            }
        }
        
        /**
         * Sets the "position" attribute
         */
        public void setPosition(java.math.BigInteger position)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITION$38);
                }
                target.setBigIntegerValue(position);
            }
        }
        
        /**
         * Sets (as xml) the "position" attribute
         */
        public void xsetPosition(org.apache.xmlbeans.XmlPositiveInteger position)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(POSITION$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(POSITION$38);
                }
                target.set(position);
            }
        }
        
        /**
         * Unsets the "position" attribute
         */
        public void unsetPosition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POSITION$38);
            }
        }
        
        /**
         * Gets the "red-when" attribute
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen.Enum getRedWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REDWHEN$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REDWHEN$40);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "red-when" attribute
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen xgetRedWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen target = null;
                target = (com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen)get_store().find_attribute_user(REDWHEN$40);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen)get_default_attribute_value(REDWHEN$40);
                }
                return target;
            }
        }
        
        /**
         * True if has "red-when" attribute
         */
        public boolean isSetRedWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REDWHEN$40) != null;
            }
        }
        
        /**
         * Sets the "red-when" attribute
         */
        public void setRedWhen(com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen.Enum redWhen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REDWHEN$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REDWHEN$40);
                }
                target.setEnumValue(redWhen);
            }
        }
        
        /**
         * Sets (as xml) the "red-when" attribute
         */
        public void xsetRedWhen(com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen redWhen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen target = null;
                target = (com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen)get_store().find_attribute_user(REDWHEN$40);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen)get_store().add_attribute_user(REDWHEN$40);
                }
                target.set(redWhen);
            }
        }
        
        /**
         * Unsets the "red-when" attribute
         */
        public void unsetRedWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REDWHEN$40);
            }
        }
        
        /**
         * Gets the "use-when" attribute
         */
        public java.lang.String getUseWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWHEN$42);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "use-when" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUseWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEWHEN$42);
                return target;
            }
        }
        
        /**
         * True if has "use-when" attribute
         */
        public boolean isSetUseWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USEWHEN$42) != null;
            }
        }
        
        /**
         * Sets the "use-when" attribute
         */
        public void setUseWhen(java.lang.String useWhen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWHEN$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEWHEN$42);
                }
                target.setStringValue(useWhen);
            }
        }
        
        /**
         * Sets (as xml) the "use-when" attribute
         */
        public void xsetUseWhen(org.apache.xmlbeans.XmlString useWhen)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USEWHEN$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USEWHEN$42);
                }
                target.set(useWhen);
            }
        }
        
        /**
         * Unsets the "use-when" attribute
         */
        public void unsetUseWhen()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USEWHEN$42);
            }
        }
        
        /**
         * Gets the "encode-output" attribute
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput.Enum getEncodeOutput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODEOUTPUT$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENCODEOUTPUT$44);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "encode-output" attribute
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput xgetEncodeOutput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput target = null;
                target = (com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput)get_store().find_attribute_user(ENCODEOUTPUT$44);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput)get_default_attribute_value(ENCODEOUTPUT$44);
                }
                return target;
            }
        }
        
        /**
         * True if has "encode-output" attribute
         */
        public boolean isSetEncodeOutput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCODEOUTPUT$44) != null;
            }
        }
        
        /**
         * Sets the "encode-output" attribute
         */
        public void setEncodeOutput(com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput.Enum encodeOutput)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODEOUTPUT$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODEOUTPUT$44);
                }
                target.setEnumValue(encodeOutput);
            }
        }
        
        /**
         * Sets (as xml) the "encode-output" attribute
         */
        public void xsetEncodeOutput(com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput encodeOutput)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput target = null;
                target = (com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput)get_store().find_attribute_user(ENCODEOUTPUT$44);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput)get_store().add_attribute_user(ENCODEOUTPUT$44);
                }
                target.set(encodeOutput);
            }
        }
        
        /**
         * Unsets the "encode-output" attribute
         */
        public void unsetEncodeOutput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCODEOUTPUT$44);
            }
        }
        
        /**
         * Gets the "event" attribute
         */
        public java.lang.String getEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENT$46);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "event" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVENT$46);
                return target;
            }
        }
        
        /**
         * True if has "event" attribute
         */
        public boolean isSetEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EVENT$46) != null;
            }
        }
        
        /**
         * Sets the "event" attribute
         */
        public void setEvent(java.lang.String event)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENT$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVENT$46);
                }
                target.setStringValue(event);
            }
        }
        
        /**
         * Sets (as xml) the "event" attribute
         */
        public void xsetEvent(org.apache.xmlbeans.XmlString event)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVENT$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EVENT$46);
                }
                target.set(event);
            }
        }
        
        /**
         * Unsets the "event" attribute
         */
        public void unsetEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EVENT$46);
            }
        }
        
        /**
         * Gets the "action" attribute
         */
        public java.lang.String getAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$48);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "action" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$48);
                return target;
            }
        }
        
        /**
         * True if has "action" attribute
         */
        public boolean isSetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ACTION$48) != null;
            }
        }
        
        /**
         * Sets the "action" attribute
         */
        public void setAction(java.lang.String action)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTION$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTION$48);
                }
                target.setStringValue(action);
            }
        }
        
        /**
         * Sets (as xml) the "action" attribute
         */
        public void xsetAction(org.apache.xmlbeans.XmlString action)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ACTION$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ACTION$48);
                }
                target.set(action);
            }
        }
        
        /**
         * Unsets the "action" attribute
         */
        public void unsetAction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ACTION$48);
            }
        }
        
        /**
         * Gets the "id-name" attribute
         */
        public java.lang.String getIdName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDNAME$50);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetIdName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDNAME$50);
                return target;
            }
        }
        
        /**
         * True if has "id-name" attribute
         */
        public boolean isSetIdName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IDNAME$50) != null;
            }
        }
        
        /**
         * Sets the "id-name" attribute
         */
        public void setIdName(java.lang.String idName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IDNAME$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IDNAME$50);
                }
                target.setStringValue(idName);
            }
        }
        
        /**
         * Sets (as xml) the "id-name" attribute
         */
        public void xsetIdName(org.apache.xmlbeans.XmlString idName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(IDNAME$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(IDNAME$50);
                }
                target.set(idName);
            }
        }
        
        /**
         * Unsets the "id-name" attribute
         */
        public void unsetIdName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IDNAME$50);
            }
        }
        
        /**
         * Gets the "separate-column" attribute
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn.Enum getSeparateColumn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEPARATECOLUMN$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SEPARATECOLUMN$52);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "separate-column" attribute
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn xgetSeparateColumn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn target = null;
                target = (com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn)get_store().find_attribute_user(SEPARATECOLUMN$52);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn)get_default_attribute_value(SEPARATECOLUMN$52);
                }
                return target;
            }
        }
        
        /**
         * True if has "separate-column" attribute
         */
        public boolean isSetSeparateColumn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SEPARATECOLUMN$52) != null;
            }
        }
        
        /**
         * Sets the "separate-column" attribute
         */
        public void setSeparateColumn(com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn.Enum separateColumn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEPARATECOLUMN$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEPARATECOLUMN$52);
                }
                target.setEnumValue(separateColumn);
            }
        }
        
        /**
         * Sets (as xml) the "separate-column" attribute
         */
        public void xsetSeparateColumn(com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn separateColumn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn target = null;
                target = (com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn)get_store().find_attribute_user(SEPARATECOLUMN$52);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn)get_store().add_attribute_user(SEPARATECOLUMN$52);
                }
                target.set(separateColumn);
            }
        }
        
        /**
         * Unsets the "separate-column" attribute
         */
        public void unsetSeparateColumn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SEPARATECOLUMN$52);
            }
        }
        
        /**
         * Gets the "required-field" attribute
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField.Enum getRequiredField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIREDFIELD$54);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "required-field" attribute
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField xgetRequiredField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField target = null;
                target = (com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField)get_store().find_attribute_user(REQUIREDFIELD$54);
                return target;
            }
        }
        
        /**
         * True if has "required-field" attribute
         */
        public boolean isSetRequiredField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUIREDFIELD$54) != null;
            }
        }
        
        /**
         * Sets the "required-field" attribute
         */
        public void setRequiredField(com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField.Enum requiredField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIREDFIELD$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUIREDFIELD$54);
                }
                target.setEnumValue(requiredField);
            }
        }
        
        /**
         * Sets (as xml) the "required-field" attribute
         */
        public void xsetRequiredField(com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField requiredField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField target = null;
                target = (com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField)get_store().find_attribute_user(REQUIREDFIELD$54);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField)get_store().add_attribute_user(REQUIREDFIELD$54);
                }
                target.set(requiredField);
            }
        }
        
        /**
         * Unsets the "required-field" attribute
         */
        public void unsetRequiredField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUIREDFIELD$54);
            }
        }
        
        /**
         * Gets the "required-field-style" attribute
         */
        public java.lang.String getRequiredFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIREDFIELDSTYLE$56);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "required-field-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRequiredFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUIREDFIELDSTYLE$56);
                return target;
            }
        }
        
        /**
         * True if has "required-field-style" attribute
         */
        public boolean isSetRequiredFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(REQUIREDFIELDSTYLE$56) != null;
            }
        }
        
        /**
         * Sets the "required-field-style" attribute
         */
        public void setRequiredFieldStyle(java.lang.String requiredFieldStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REQUIREDFIELDSTYLE$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REQUIREDFIELDSTYLE$56);
                }
                target.setStringValue(requiredFieldStyle);
            }
        }
        
        /**
         * Sets (as xml) the "required-field-style" attribute
         */
        public void xsetRequiredFieldStyle(org.apache.xmlbeans.XmlString requiredFieldStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REQUIREDFIELDSTYLE$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REQUIREDFIELDSTYLE$56);
                }
                target.set(requiredFieldStyle);
            }
        }
        
        /**
         * Unsets the "required-field-style" attribute
         */
        public void unsetRequiredFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(REQUIREDFIELDSTYLE$56);
            }
        }
        
        /**
         * Gets the "sort-field" attribute
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field.SortField.Enum getSortField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTFIELD$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SORTFIELD$58);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FieldDocument.Field.SortField.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "sort-field" attribute
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field.SortField xgetSortField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldDocument.Field.SortField target = null;
                target = (com.kyt.xsd.widgetform.FieldDocument.Field.SortField)get_store().find_attribute_user(SORTFIELD$58);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FieldDocument.Field.SortField)get_default_attribute_value(SORTFIELD$58);
                }
                return target;
            }
        }
        
        /**
         * True if has "sort-field" attribute
         */
        public boolean isSetSortField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTFIELD$58) != null;
            }
        }
        
        /**
         * Sets the "sort-field" attribute
         */
        public void setSortField(com.kyt.xsd.widgetform.FieldDocument.Field.SortField.Enum sortField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTFIELD$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTFIELD$58);
                }
                target.setEnumValue(sortField);
            }
        }
        
        /**
         * Sets (as xml) the "sort-field" attribute
         */
        public void xsetSortField(com.kyt.xsd.widgetform.FieldDocument.Field.SortField sortField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldDocument.Field.SortField target = null;
                target = (com.kyt.xsd.widgetform.FieldDocument.Field.SortField)get_store().find_attribute_user(SORTFIELD$58);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FieldDocument.Field.SortField)get_store().add_attribute_user(SORTFIELD$58);
                }
                target.set(sortField);
            }
        }
        
        /**
         * Unsets the "sort-field" attribute
         */
        public void unsetSortField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTFIELD$58);
            }
        }
        
        /**
         * Gets the "sort-field-style" attribute
         */
        public java.lang.String getSortFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTFIELDSTYLE$60);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sort-field-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSortFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SORTFIELDSTYLE$60);
                return target;
            }
        }
        
        /**
         * True if has "sort-field-style" attribute
         */
        public boolean isSetSortFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTFIELDSTYLE$60) != null;
            }
        }
        
        /**
         * Sets the "sort-field-style" attribute
         */
        public void setSortFieldStyle(java.lang.String sortFieldStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTFIELDSTYLE$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTFIELDSTYLE$60);
                }
                target.setStringValue(sortFieldStyle);
            }
        }
        
        /**
         * Sets (as xml) the "sort-field-style" attribute
         */
        public void xsetSortFieldStyle(org.apache.xmlbeans.XmlString sortFieldStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SORTFIELDSTYLE$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SORTFIELDSTYLE$60);
                }
                target.set(sortFieldStyle);
            }
        }
        
        /**
         * Unsets the "sort-field-style" attribute
         */
        public void unsetSortFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTFIELDSTYLE$60);
            }
        }
        
        /**
         * Gets the "sort-field-asc-style" attribute
         */
        public java.lang.String getSortFieldAscStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTFIELDASCSTYLE$62);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sort-field-asc-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSortFieldAscStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SORTFIELDASCSTYLE$62);
                return target;
            }
        }
        
        /**
         * True if has "sort-field-asc-style" attribute
         */
        public boolean isSetSortFieldAscStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTFIELDASCSTYLE$62) != null;
            }
        }
        
        /**
         * Sets the "sort-field-asc-style" attribute
         */
        public void setSortFieldAscStyle(java.lang.String sortFieldAscStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTFIELDASCSTYLE$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTFIELDASCSTYLE$62);
                }
                target.setStringValue(sortFieldAscStyle);
            }
        }
        
        /**
         * Sets (as xml) the "sort-field-asc-style" attribute
         */
        public void xsetSortFieldAscStyle(org.apache.xmlbeans.XmlString sortFieldAscStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SORTFIELDASCSTYLE$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SORTFIELDASCSTYLE$62);
                }
                target.set(sortFieldAscStyle);
            }
        }
        
        /**
         * Unsets the "sort-field-asc-style" attribute
         */
        public void unsetSortFieldAscStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTFIELDASCSTYLE$62);
            }
        }
        
        /**
         * Gets the "sort-field-desc-style" attribute
         */
        public java.lang.String getSortFieldDescStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTFIELDDESCSTYLE$64);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sort-field-desc-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSortFieldDescStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SORTFIELDDESCSTYLE$64);
                return target;
            }
        }
        
        /**
         * True if has "sort-field-desc-style" attribute
         */
        public boolean isSetSortFieldDescStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SORTFIELDDESCSTYLE$64) != null;
            }
        }
        
        /**
         * Sets the "sort-field-desc-style" attribute
         */
        public void setSortFieldDescStyle(java.lang.String sortFieldDescStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTFIELDDESCSTYLE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTFIELDDESCSTYLE$64);
                }
                target.setStringValue(sortFieldDescStyle);
            }
        }
        
        /**
         * Sets (as xml) the "sort-field-desc-style" attribute
         */
        public void xsetSortFieldDescStyle(org.apache.xmlbeans.XmlString sortFieldDescStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SORTFIELDDESCSTYLE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SORTFIELDDESCSTYLE$64);
                }
                target.set(sortFieldDescStyle);
            }
        }
        
        /**
         * Unsets the "sort-field-desc-style" attribute
         */
        public void unsetSortFieldDescStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SORTFIELDDESCSTYLE$64);
            }
        }
        /**
         * An XML red-when(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FieldDocument$Field$RedWhen.
         */
        public static class RedWhenImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen
        {
            private static final long serialVersionUID = 1L;
            
            public RedWhenImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RedWhenImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML encode-output(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FieldDocument$Field$EncodeOutput.
         */
        public static class EncodeOutputImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput
        {
            private static final long serialVersionUID = 1L;
            
            public EncodeOutputImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected EncodeOutputImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML separate-column(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FieldDocument$Field$SeparateColumn.
         */
        public static class SeparateColumnImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn
        {
            private static final long serialVersionUID = 1L;
            
            public SeparateColumnImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SeparateColumnImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML required-field(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FieldDocument$Field$RequiredField.
         */
        public static class RequiredFieldImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField
        {
            private static final long serialVersionUID = 1L;
            
            public RequiredFieldImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RequiredFieldImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML sort-field(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FieldDocument$Field$SortField.
         */
        public static class SortFieldImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FieldDocument.Field.SortField
        {
            private static final long serialVersionUID = 1L;
            
            public SortFieldImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SortFieldImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
