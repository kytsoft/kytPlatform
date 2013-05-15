/*
 * An XML document type.
 * Localname: field
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.FieldDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one field(@) element.
 *
 * This is a complex type.
 */
public interface FieldDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FieldDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("fieldfc21doctype");
    
    /**
     * Gets the "field" element
     */
    com.kyt.xsd.widgetform.FieldDocument.Field getField();
    
    /**
     * Sets the "field" element
     */
    void setField(com.kyt.xsd.widgetform.FieldDocument.Field field);
    
    /**
     * Appends and returns a new empty "field" element
     */
    com.kyt.xsd.widgetform.FieldDocument.Field addNewField();
    
    /**
     * An XML field(@).
     *
     * This is a complex type.
     */
    public interface Field extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Field.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("field1197elemtype");
        
        /**
         * Gets the "AllFields" element
         */
        org.apache.xmlbeans.XmlObject getAllFields();
        
        /**
         * True if has "AllFields" element
         */
        boolean isSetAllFields();
        
        /**
         * Sets the "AllFields" element
         */
        void setAllFields(org.apache.xmlbeans.XmlObject allFields);
        
        /**
         * Appends and returns a new empty "AllFields" element
         */
        org.apache.xmlbeans.XmlObject addNewAllFields();
        
        /**
         * Unsets the "AllFields" element
         */
        void unsetAllFields();
        
        /**
         * Gets array of all "on-field-event-update-area" elements
         */
        com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea[] getOnFieldEventUpdateAreaArray();
        
        /**
         * Gets ith "on-field-event-update-area" element
         */
        com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea getOnFieldEventUpdateAreaArray(int i);
        
        /**
         * Returns number of "on-field-event-update-area" element
         */
        int sizeOfOnFieldEventUpdateAreaArray();
        
        /**
         * Sets array of all "on-field-event-update-area" element
         */
        void setOnFieldEventUpdateAreaArray(com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea[] onFieldEventUpdateAreaArray);
        
        /**
         * Sets ith "on-field-event-update-area" element
         */
        void setOnFieldEventUpdateAreaArray(int i, com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea onFieldEventUpdateArea);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "on-field-event-update-area" element
         */
        com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea insertNewOnFieldEventUpdateArea(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "on-field-event-update-area" element
         */
        com.kyt.xsd.widgetform.OnFieldEventUpdateAreaDocument.OnFieldEventUpdateArea addNewOnFieldEventUpdateArea();
        
        /**
         * Removes the ith "on-field-event-update-area" element
         */
        void removeOnFieldEventUpdateArea(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "map-name" attribute
         */
        java.lang.String getMapName();
        
        /**
         * Gets (as xml) the "map-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetMapName();
        
        /**
         * True if has "map-name" attribute
         */
        boolean isSetMapName();
        
        /**
         * Sets the "map-name" attribute
         */
        void setMapName(java.lang.String mapName);
        
        /**
         * Sets (as xml) the "map-name" attribute
         */
        void xsetMapName(org.apache.xmlbeans.XmlString mapName);
        
        /**
         * Unsets the "map-name" attribute
         */
        void unsetMapName();
        
        /**
         * Gets the "entity-name" attribute
         */
        java.lang.String getEntityName();
        
        /**
         * Gets (as xml) the "entity-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityName();
        
        /**
         * True if has "entity-name" attribute
         */
        boolean isSetEntityName();
        
        /**
         * Sets the "entity-name" attribute
         */
        void setEntityName(java.lang.String entityName);
        
        /**
         * Sets (as xml) the "entity-name" attribute
         */
        void xsetEntityName(org.apache.xmlbeans.XmlString entityName);
        
        /**
         * Unsets the "entity-name" attribute
         */
        void unsetEntityName();
        
        /**
         * Gets the "field-name" attribute
         */
        java.lang.String getFieldName();
        
        /**
         * Gets (as xml) the "field-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetFieldName();
        
        /**
         * True if has "field-name" attribute
         */
        boolean isSetFieldName();
        
        /**
         * Sets the "field-name" attribute
         */
        void setFieldName(java.lang.String fieldName);
        
        /**
         * Sets (as xml) the "field-name" attribute
         */
        void xsetFieldName(org.apache.xmlbeans.XmlString fieldName);
        
        /**
         * Unsets the "field-name" attribute
         */
        void unsetFieldName();
        
        /**
         * Gets the "service-name" attribute
         */
        java.lang.String getServiceName();
        
        /**
         * Gets (as xml) the "service-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetServiceName();
        
        /**
         * True if has "service-name" attribute
         */
        boolean isSetServiceName();
        
        /**
         * Sets the "service-name" attribute
         */
        void setServiceName(java.lang.String serviceName);
        
        /**
         * Sets (as xml) the "service-name" attribute
         */
        void xsetServiceName(org.apache.xmlbeans.XmlString serviceName);
        
        /**
         * Unsets the "service-name" attribute
         */
        void unsetServiceName();
        
        /**
         * Gets the "attribute-name" attribute
         */
        java.lang.String getAttributeName();
        
        /**
         * Gets (as xml) the "attribute-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetAttributeName();
        
        /**
         * True if has "attribute-name" attribute
         */
        boolean isSetAttributeName();
        
        /**
         * Sets the "attribute-name" attribute
         */
        void setAttributeName(java.lang.String attributeName);
        
        /**
         * Sets (as xml) the "attribute-name" attribute
         */
        void xsetAttributeName(org.apache.xmlbeans.XmlString attributeName);
        
        /**
         * Unsets the "attribute-name" attribute
         */
        void unsetAttributeName();
        
        /**
         * Gets the "entry-name" attribute
         */
        java.lang.String getEntryName();
        
        /**
         * Gets (as xml) the "entry-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntryName();
        
        /**
         * True if has "entry-name" attribute
         */
        boolean isSetEntryName();
        
        /**
         * Sets the "entry-name" attribute
         */
        void setEntryName(java.lang.String entryName);
        
        /**
         * Sets (as xml) the "entry-name" attribute
         */
        void xsetEntryName(org.apache.xmlbeans.XmlString entryName);
        
        /**
         * Unsets the "entry-name" attribute
         */
        void unsetEntryName();
        
        /**
         * Gets the "parameter-name" attribute
         */
        java.lang.String getParameterName();
        
        /**
         * Gets (as xml) the "parameter-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetParameterName();
        
        /**
         * True if has "parameter-name" attribute
         */
        boolean isSetParameterName();
        
        /**
         * Sets the "parameter-name" attribute
         */
        void setParameterName(java.lang.String parameterName);
        
        /**
         * Sets (as xml) the "parameter-name" attribute
         */
        void xsetParameterName(org.apache.xmlbeans.XmlString parameterName);
        
        /**
         * Unsets the "parameter-name" attribute
         */
        void unsetParameterName();
        
        /**
         * Gets the "title" attribute
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" attribute
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * True if has "title" attribute
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" attribute
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" attribute
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Unsets the "title" attribute
         */
        void unsetTitle();
        
        /**
         * Gets the "header-link" attribute
         */
        java.lang.String getHeaderLink();
        
        /**
         * Gets (as xml) the "header-link" attribute
         */
        org.apache.xmlbeans.XmlString xgetHeaderLink();
        
        /**
         * True if has "header-link" attribute
         */
        boolean isSetHeaderLink();
        
        /**
         * Sets the "header-link" attribute
         */
        void setHeaderLink(java.lang.String headerLink);
        
        /**
         * Sets (as xml) the "header-link" attribute
         */
        void xsetHeaderLink(org.apache.xmlbeans.XmlString headerLink);
        
        /**
         * Unsets the "header-link" attribute
         */
        void unsetHeaderLink();
        
        /**
         * Gets the "header-link-style" attribute
         */
        java.lang.String getHeaderLinkStyle();
        
        /**
         * Gets (as xml) the "header-link-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetHeaderLinkStyle();
        
        /**
         * True if has "header-link-style" attribute
         */
        boolean isSetHeaderLinkStyle();
        
        /**
         * Sets the "header-link-style" attribute
         */
        void setHeaderLinkStyle(java.lang.String headerLinkStyle);
        
        /**
         * Sets (as xml) the "header-link-style" attribute
         */
        void xsetHeaderLinkStyle(org.apache.xmlbeans.XmlString headerLinkStyle);
        
        /**
         * Unsets the "header-link-style" attribute
         */
        void unsetHeaderLinkStyle();
        
        /**
         * Gets the "tooltip" attribute
         */
        java.lang.String getTooltip();
        
        /**
         * Gets (as xml) the "tooltip" attribute
         */
        org.apache.xmlbeans.XmlString xgetTooltip();
        
        /**
         * True if has "tooltip" attribute
         */
        boolean isSetTooltip();
        
        /**
         * Sets the "tooltip" attribute
         */
        void setTooltip(java.lang.String tooltip);
        
        /**
         * Sets (as xml) the "tooltip" attribute
         */
        void xsetTooltip(org.apache.xmlbeans.XmlString tooltip);
        
        /**
         * Unsets the "tooltip" attribute
         */
        void unsetTooltip();
        
        /**
         * Gets the "title-area-style" attribute
         */
        java.lang.String getTitleAreaStyle();
        
        /**
         * Gets (as xml) the "title-area-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetTitleAreaStyle();
        
        /**
         * True if has "title-area-style" attribute
         */
        boolean isSetTitleAreaStyle();
        
        /**
         * Sets the "title-area-style" attribute
         */
        void setTitleAreaStyle(java.lang.String titleAreaStyle);
        
        /**
         * Sets (as xml) the "title-area-style" attribute
         */
        void xsetTitleAreaStyle(org.apache.xmlbeans.XmlString titleAreaStyle);
        
        /**
         * Unsets the "title-area-style" attribute
         */
        void unsetTitleAreaStyle();
        
        /**
         * Gets the "widget-area-style" attribute
         */
        java.lang.String getWidgetAreaStyle();
        
        /**
         * Gets (as xml) the "widget-area-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetWidgetAreaStyle();
        
        /**
         * True if has "widget-area-style" attribute
         */
        boolean isSetWidgetAreaStyle();
        
        /**
         * Sets the "widget-area-style" attribute
         */
        void setWidgetAreaStyle(java.lang.String widgetAreaStyle);
        
        /**
         * Sets (as xml) the "widget-area-style" attribute
         */
        void xsetWidgetAreaStyle(org.apache.xmlbeans.XmlString widgetAreaStyle);
        
        /**
         * Unsets the "widget-area-style" attribute
         */
        void unsetWidgetAreaStyle();
        
        /**
         * Gets the "title-style" attribute
         */
        java.lang.String getTitleStyle();
        
        /**
         * Gets (as xml) the "title-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetTitleStyle();
        
        /**
         * True if has "title-style" attribute
         */
        boolean isSetTitleStyle();
        
        /**
         * Sets the "title-style" attribute
         */
        void setTitleStyle(java.lang.String titleStyle);
        
        /**
         * Sets (as xml) the "title-style" attribute
         */
        void xsetTitleStyle(org.apache.xmlbeans.XmlString titleStyle);
        
        /**
         * Unsets the "title-style" attribute
         */
        void unsetTitleStyle();
        
        /**
         * Gets the "widget-style" attribute
         */
        java.lang.String getWidgetStyle();
        
        /**
         * Gets (as xml) the "widget-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetWidgetStyle();
        
        /**
         * True if has "widget-style" attribute
         */
        boolean isSetWidgetStyle();
        
        /**
         * Sets the "widget-style" attribute
         */
        void setWidgetStyle(java.lang.String widgetStyle);
        
        /**
         * Sets (as xml) the "widget-style" attribute
         */
        void xsetWidgetStyle(org.apache.xmlbeans.XmlString widgetStyle);
        
        /**
         * Unsets the "widget-style" attribute
         */
        void unsetWidgetStyle();
        
        /**
         * Gets the "tooltip-style" attribute
         */
        java.lang.String getTooltipStyle();
        
        /**
         * Gets (as xml) the "tooltip-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetTooltipStyle();
        
        /**
         * True if has "tooltip-style" attribute
         */
        boolean isSetTooltipStyle();
        
        /**
         * Sets the "tooltip-style" attribute
         */
        void setTooltipStyle(java.lang.String tooltipStyle);
        
        /**
         * Sets (as xml) the "tooltip-style" attribute
         */
        void xsetTooltipStyle(org.apache.xmlbeans.XmlString tooltipStyle);
        
        /**
         * Unsets the "tooltip-style" attribute
         */
        void unsetTooltipStyle();
        
        /**
         * Gets the "position" attribute
         */
        java.math.BigInteger getPosition();
        
        /**
         * Gets (as xml) the "position" attribute
         */
        org.apache.xmlbeans.XmlPositiveInteger xgetPosition();
        
        /**
         * True if has "position" attribute
         */
        boolean isSetPosition();
        
        /**
         * Sets the "position" attribute
         */
        void setPosition(java.math.BigInteger position);
        
        /**
         * Sets (as xml) the "position" attribute
         */
        void xsetPosition(org.apache.xmlbeans.XmlPositiveInteger position);
        
        /**
         * Unsets the "position" attribute
         */
        void unsetPosition();
        
        /**
         * Gets the "red-when" attribute
         */
        com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen.Enum getRedWhen();
        
        /**
         * Gets (as xml) the "red-when" attribute
         */
        com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen xgetRedWhen();
        
        /**
         * True if has "red-when" attribute
         */
        boolean isSetRedWhen();
        
        /**
         * Sets the "red-when" attribute
         */
        void setRedWhen(com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen.Enum redWhen);
        
        /**
         * Sets (as xml) the "red-when" attribute
         */
        void xsetRedWhen(com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen redWhen);
        
        /**
         * Unsets the "red-when" attribute
         */
        void unsetRedWhen();
        
        /**
         * Gets the "use-when" attribute
         */
        java.lang.String getUseWhen();
        
        /**
         * Gets (as xml) the "use-when" attribute
         */
        org.apache.xmlbeans.XmlString xgetUseWhen();
        
        /**
         * True if has "use-when" attribute
         */
        boolean isSetUseWhen();
        
        /**
         * Sets the "use-when" attribute
         */
        void setUseWhen(java.lang.String useWhen);
        
        /**
         * Sets (as xml) the "use-when" attribute
         */
        void xsetUseWhen(org.apache.xmlbeans.XmlString useWhen);
        
        /**
         * Unsets the "use-when" attribute
         */
        void unsetUseWhen();
        
        /**
         * Gets the "encode-output" attribute
         */
        com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput.Enum getEncodeOutput();
        
        /**
         * Gets (as xml) the "encode-output" attribute
         */
        com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput xgetEncodeOutput();
        
        /**
         * True if has "encode-output" attribute
         */
        boolean isSetEncodeOutput();
        
        /**
         * Sets the "encode-output" attribute
         */
        void setEncodeOutput(com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput.Enum encodeOutput);
        
        /**
         * Sets (as xml) the "encode-output" attribute
         */
        void xsetEncodeOutput(com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput encodeOutput);
        
        /**
         * Unsets the "encode-output" attribute
         */
        void unsetEncodeOutput();
        
        /**
         * Gets the "event" attribute
         */
        java.lang.String getEvent();
        
        /**
         * Gets (as xml) the "event" attribute
         */
        org.apache.xmlbeans.XmlString xgetEvent();
        
        /**
         * True if has "event" attribute
         */
        boolean isSetEvent();
        
        /**
         * Sets the "event" attribute
         */
        void setEvent(java.lang.String event);
        
        /**
         * Sets (as xml) the "event" attribute
         */
        void xsetEvent(org.apache.xmlbeans.XmlString event);
        
        /**
         * Unsets the "event" attribute
         */
        void unsetEvent();
        
        /**
         * Gets the "action" attribute
         */
        java.lang.String getAction();
        
        /**
         * Gets (as xml) the "action" attribute
         */
        org.apache.xmlbeans.XmlString xgetAction();
        
        /**
         * True if has "action" attribute
         */
        boolean isSetAction();
        
        /**
         * Sets the "action" attribute
         */
        void setAction(java.lang.String action);
        
        /**
         * Sets (as xml) the "action" attribute
         */
        void xsetAction(org.apache.xmlbeans.XmlString action);
        
        /**
         * Unsets the "action" attribute
         */
        void unsetAction();
        
        /**
         * Gets the "id-name" attribute
         */
        java.lang.String getIdName();
        
        /**
         * Gets (as xml) the "id-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetIdName();
        
        /**
         * True if has "id-name" attribute
         */
        boolean isSetIdName();
        
        /**
         * Sets the "id-name" attribute
         */
        void setIdName(java.lang.String idName);
        
        /**
         * Sets (as xml) the "id-name" attribute
         */
        void xsetIdName(org.apache.xmlbeans.XmlString idName);
        
        /**
         * Unsets the "id-name" attribute
         */
        void unsetIdName();
        
        /**
         * Gets the "separate-column" attribute
         */
        com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn.Enum getSeparateColumn();
        
        /**
         * Gets (as xml) the "separate-column" attribute
         */
        com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn xgetSeparateColumn();
        
        /**
         * True if has "separate-column" attribute
         */
        boolean isSetSeparateColumn();
        
        /**
         * Sets the "separate-column" attribute
         */
        void setSeparateColumn(com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn.Enum separateColumn);
        
        /**
         * Sets (as xml) the "separate-column" attribute
         */
        void xsetSeparateColumn(com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn separateColumn);
        
        /**
         * Unsets the "separate-column" attribute
         */
        void unsetSeparateColumn();
        
        /**
         * Gets the "required-field" attribute
         */
        com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField.Enum getRequiredField();
        
        /**
         * Gets (as xml) the "required-field" attribute
         */
        com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField xgetRequiredField();
        
        /**
         * True if has "required-field" attribute
         */
        boolean isSetRequiredField();
        
        /**
         * Sets the "required-field" attribute
         */
        void setRequiredField(com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField.Enum requiredField);
        
        /**
         * Sets (as xml) the "required-field" attribute
         */
        void xsetRequiredField(com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField requiredField);
        
        /**
         * Unsets the "required-field" attribute
         */
        void unsetRequiredField();
        
        /**
         * Gets the "required-field-style" attribute
         */
        java.lang.String getRequiredFieldStyle();
        
        /**
         * Gets (as xml) the "required-field-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetRequiredFieldStyle();
        
        /**
         * True if has "required-field-style" attribute
         */
        boolean isSetRequiredFieldStyle();
        
        /**
         * Sets the "required-field-style" attribute
         */
        void setRequiredFieldStyle(java.lang.String requiredFieldStyle);
        
        /**
         * Sets (as xml) the "required-field-style" attribute
         */
        void xsetRequiredFieldStyle(org.apache.xmlbeans.XmlString requiredFieldStyle);
        
        /**
         * Unsets the "required-field-style" attribute
         */
        void unsetRequiredFieldStyle();
        
        /**
         * Gets the "sort-field" attribute
         */
        com.kyt.xsd.widgetform.FieldDocument.Field.SortField.Enum getSortField();
        
        /**
         * Gets (as xml) the "sort-field" attribute
         */
        com.kyt.xsd.widgetform.FieldDocument.Field.SortField xgetSortField();
        
        /**
         * True if has "sort-field" attribute
         */
        boolean isSetSortField();
        
        /**
         * Sets the "sort-field" attribute
         */
        void setSortField(com.kyt.xsd.widgetform.FieldDocument.Field.SortField.Enum sortField);
        
        /**
         * Sets (as xml) the "sort-field" attribute
         */
        void xsetSortField(com.kyt.xsd.widgetform.FieldDocument.Field.SortField sortField);
        
        /**
         * Unsets the "sort-field" attribute
         */
        void unsetSortField();
        
        /**
         * Gets the "sort-field-style" attribute
         */
        java.lang.String getSortFieldStyle();
        
        /**
         * Gets (as xml) the "sort-field-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetSortFieldStyle();
        
        /**
         * True if has "sort-field-style" attribute
         */
        boolean isSetSortFieldStyle();
        
        /**
         * Sets the "sort-field-style" attribute
         */
        void setSortFieldStyle(java.lang.String sortFieldStyle);
        
        /**
         * Sets (as xml) the "sort-field-style" attribute
         */
        void xsetSortFieldStyle(org.apache.xmlbeans.XmlString sortFieldStyle);
        
        /**
         * Unsets the "sort-field-style" attribute
         */
        void unsetSortFieldStyle();
        
        /**
         * Gets the "sort-field-asc-style" attribute
         */
        java.lang.String getSortFieldAscStyle();
        
        /**
         * Gets (as xml) the "sort-field-asc-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetSortFieldAscStyle();
        
        /**
         * True if has "sort-field-asc-style" attribute
         */
        boolean isSetSortFieldAscStyle();
        
        /**
         * Sets the "sort-field-asc-style" attribute
         */
        void setSortFieldAscStyle(java.lang.String sortFieldAscStyle);
        
        /**
         * Sets (as xml) the "sort-field-asc-style" attribute
         */
        void xsetSortFieldAscStyle(org.apache.xmlbeans.XmlString sortFieldAscStyle);
        
        /**
         * Unsets the "sort-field-asc-style" attribute
         */
        void unsetSortFieldAscStyle();
        
        /**
         * Gets the "sort-field-desc-style" attribute
         */
        java.lang.String getSortFieldDescStyle();
        
        /**
         * Gets (as xml) the "sort-field-desc-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetSortFieldDescStyle();
        
        /**
         * True if has "sort-field-desc-style" attribute
         */
        boolean isSetSortFieldDescStyle();
        
        /**
         * Sets the "sort-field-desc-style" attribute
         */
        void setSortFieldDescStyle(java.lang.String sortFieldDescStyle);
        
        /**
         * Sets (as xml) the "sort-field-desc-style" attribute
         */
        void xsetSortFieldDescStyle(org.apache.xmlbeans.XmlString sortFieldDescStyle);
        
        /**
         * Unsets the "sort-field-desc-style" attribute
         */
        void unsetSortFieldDescStyle();
        
        /**
         * An XML red-when(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FieldDocument$Field$RedWhen.
         */
        public interface RedWhen extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RedWhen.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("redwhen18adattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum NEVER = Enum.forString("never");
            static final Enum BEFORE_NOW = Enum.forString("before-now");
            static final Enum AFTER_NOW = Enum.forString("after-now");
            static final Enum BY_NAME = Enum.forString("by-name");
            
            static final int INT_NEVER = Enum.INT_NEVER;
            static final int INT_BEFORE_NOW = Enum.INT_BEFORE_NOW;
            static final int INT_AFTER_NOW = Enum.INT_AFTER_NOW;
            static final int INT_BY_NAME = Enum.INT_BY_NAME;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FieldDocument$Field$RedWhen.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_NEVER
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_NEVER = 1;
                static final int INT_BEFORE_NOW = 2;
                static final int INT_AFTER_NOW = 3;
                static final int INT_BY_NAME = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("never", INT_NEVER),
                      new Enum("before-now", INT_BEFORE_NOW),
                      new Enum("after-now", INT_AFTER_NOW),
                      new Enum("by-name", INT_BY_NAME),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen newInstance() {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.RedWhen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML encode-output(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FieldDocument$Field$EncodeOutput.
         */
        public interface EncodeOutput extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EncodeOutput.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("encodeoutput7797attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FieldDocument$Field$EncodeOutput.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TRUE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_TRUE = 1;
                static final int INT_FALSE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput newInstance() {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.EncodeOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML separate-column(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FieldDocument$Field$SeparateColumn.
         */
        public interface SeparateColumn extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeparateColumn.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("separatecolumn7b3fattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FieldDocument$Field$SeparateColumn.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TRUE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_TRUE = 1;
                static final int INT_FALSE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn newInstance() {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.SeparateColumn) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML required-field(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FieldDocument$Field$RequiredField.
         */
        public interface RequiredField extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequiredField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("requiredfieldce03attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FieldDocument$Field$RequiredField.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TRUE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_TRUE = 1;
                static final int INT_FALSE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField newInstance() {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.RequiredField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML sort-field(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FieldDocument$Field$SortField.
         */
        public interface SortField extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SortField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("sortfield6cc2attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FieldDocument$Field$SortField.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TRUE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_TRUE = 1;
                static final int INT_FALSE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.widgetform.FieldDocument.Field.SortField newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.SortField) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FieldDocument.Field.SortField newInstance() {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.SortField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FieldDocument.Field.SortField newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FieldDocument.Field.SortField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.FieldDocument.Field newInstance() {
              return (com.kyt.xsd.widgetform.FieldDocument.Field) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.FieldDocument.Field newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.FieldDocument.Field) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.FieldDocument newInstance() {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.FieldDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.FieldDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.FieldDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.FieldDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.FieldDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.FieldDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.FieldDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.FieldDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.FieldDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.FieldDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.FieldDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.FieldDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.FieldDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.FieldDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.FieldDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.FieldDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.FieldDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.FieldDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
