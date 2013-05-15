/*
 * An XML document type.
 * Localname: form
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.FormDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one form(@) element.
 *
 * This is a complex type.
 */
public interface FormDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("form30bddoctype");
    
    /**
     * Gets the "form" element
     */
    com.kyt.xsd.widgetform.FormDocument.Form getForm();
    
    /**
     * Sets the "form" element
     */
    void setForm(com.kyt.xsd.widgetform.FormDocument.Form form);
    
    /**
     * Appends and returns a new empty "form" element
     */
    com.kyt.xsd.widgetform.FormDocument.Form addNewForm();
    
    /**
     * An XML form(@).
     *
     * This is a complex type.
     */
    public interface Form extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Form.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("form436delemtype");
        
        /**
         * Gets the "actions" element
         */
        com.kyt.xsd.widgetform.ActionsDocument.Actions getActions();
        
        /**
         * True if has "actions" element
         */
        boolean isSetActions();
        
        /**
         * Sets the "actions" element
         */
        void setActions(com.kyt.xsd.widgetform.ActionsDocument.Actions actions);
        
        /**
         * Appends and returns a new empty "actions" element
         */
        com.kyt.xsd.widgetform.ActionsDocument.Actions addNewActions();
        
        /**
         * Unsets the "actions" element
         */
        void unsetActions();
        
        /**
         * Gets the "row-actions" element
         */
        com.kyt.xsd.widgetform.RowActionsDocument.RowActions getRowActions();
        
        /**
         * True if has "row-actions" element
         */
        boolean isSetRowActions();
        
        /**
         * Sets the "row-actions" element
         */
        void setRowActions(com.kyt.xsd.widgetform.RowActionsDocument.RowActions rowActions);
        
        /**
         * Appends and returns a new empty "row-actions" element
         */
        com.kyt.xsd.widgetform.RowActionsDocument.RowActions addNewRowActions();
        
        /**
         * Unsets the "row-actions" element
         */
        void unsetRowActions();
        
        /**
         * Gets array of all "alt-row-style" elements
         */
        com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle[] getAltRowStyleArray();
        
        /**
         * Gets ith "alt-row-style" element
         */
        com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle getAltRowStyleArray(int i);
        
        /**
         * Returns number of "alt-row-style" element
         */
        int sizeOfAltRowStyleArray();
        
        /**
         * Sets array of all "alt-row-style" element
         */
        void setAltRowStyleArray(com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle[] altRowStyleArray);
        
        /**
         * Sets ith "alt-row-style" element
         */
        void setAltRowStyleArray(int i, com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle altRowStyle);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alt-row-style" element
         */
        com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle insertNewAltRowStyle(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alt-row-style" element
         */
        com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle addNewAltRowStyle();
        
        /**
         * Removes the ith "alt-row-style" element
         */
        void removeAltRowStyle(int i);
        
        /**
         * Gets array of all "alt-target" elements
         */
        com.kyt.xsd.widgetform.AltTargetDocument.AltTarget[] getAltTargetArray();
        
        /**
         * Gets ith "alt-target" element
         */
        com.kyt.xsd.widgetform.AltTargetDocument.AltTarget getAltTargetArray(int i);
        
        /**
         * Returns number of "alt-target" element
         */
        int sizeOfAltTargetArray();
        
        /**
         * Sets array of all "alt-target" element
         */
        void setAltTargetArray(com.kyt.xsd.widgetform.AltTargetDocument.AltTarget[] altTargetArray);
        
        /**
         * Sets ith "alt-target" element
         */
        void setAltTargetArray(int i, com.kyt.xsd.widgetform.AltTargetDocument.AltTarget altTarget);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alt-target" element
         */
        com.kyt.xsd.widgetform.AltTargetDocument.AltTarget insertNewAltTarget(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alt-target" element
         */
        com.kyt.xsd.widgetform.AltTargetDocument.AltTarget addNewAltTarget();
        
        /**
         * Removes the ith "alt-target" element
         */
        void removeAltTarget(int i);
        
        /**
         * Gets array of all "auto-fields-service" elements
         */
        com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService[] getAutoFieldsServiceArray();
        
        /**
         * Gets ith "auto-fields-service" element
         */
        com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService getAutoFieldsServiceArray(int i);
        
        /**
         * Returns number of "auto-fields-service" element
         */
        int sizeOfAutoFieldsServiceArray();
        
        /**
         * Sets array of all "auto-fields-service" element
         */
        void setAutoFieldsServiceArray(com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService[] autoFieldsServiceArray);
        
        /**
         * Sets ith "auto-fields-service" element
         */
        void setAutoFieldsServiceArray(int i, com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService autoFieldsService);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "auto-fields-service" element
         */
        com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService insertNewAutoFieldsService(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "auto-fields-service" element
         */
        com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService addNewAutoFieldsService();
        
        /**
         * Removes the ith "auto-fields-service" element
         */
        void removeAutoFieldsService(int i);
        
        /**
         * Gets array of all "auto-fields-entity" elements
         */
        com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity[] getAutoFieldsEntityArray();
        
        /**
         * Gets ith "auto-fields-entity" element
         */
        com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity getAutoFieldsEntityArray(int i);
        
        /**
         * Returns number of "auto-fields-entity" element
         */
        int sizeOfAutoFieldsEntityArray();
        
        /**
         * Sets array of all "auto-fields-entity" element
         */
        void setAutoFieldsEntityArray(com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity[] autoFieldsEntityArray);
        
        /**
         * Sets ith "auto-fields-entity" element
         */
        void setAutoFieldsEntityArray(int i, com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity autoFieldsEntity);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "auto-fields-entity" element
         */
        com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity insertNewAutoFieldsEntity(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "auto-fields-entity" element
         */
        com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity addNewAutoFieldsEntity();
        
        /**
         * Removes the ith "auto-fields-entity" element
         */
        void removeAutoFieldsEntity(int i);
        
        /**
         * Gets array of all "field" elements
         */
        com.kyt.xsd.widgetform.FieldDocument.Field[] getFieldArray();
        
        /**
         * Gets ith "field" element
         */
        com.kyt.xsd.widgetform.FieldDocument.Field getFieldArray(int i);
        
        /**
         * Returns number of "field" element
         */
        int sizeOfFieldArray();
        
        /**
         * Sets array of all "field" element
         */
        void setFieldArray(com.kyt.xsd.widgetform.FieldDocument.Field[] fieldArray);
        
        /**
         * Sets ith "field" element
         */
        void setFieldArray(int i, com.kyt.xsd.widgetform.FieldDocument.Field field);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field" element
         */
        com.kyt.xsd.widgetform.FieldDocument.Field insertNewField(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field" element
         */
        com.kyt.xsd.widgetform.FieldDocument.Field addNewField();
        
        /**
         * Removes the ith "field" element
         */
        void removeField(int i);
        
        /**
         * Gets array of all "on-event-update-area" elements
         */
        com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea[] getOnEventUpdateAreaArray();
        
        /**
         * Gets ith "on-event-update-area" element
         */
        com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea getOnEventUpdateAreaArray(int i);
        
        /**
         * Returns number of "on-event-update-area" element
         */
        int sizeOfOnEventUpdateAreaArray();
        
        /**
         * Sets array of all "on-event-update-area" element
         */
        void setOnEventUpdateAreaArray(com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea[] onEventUpdateAreaArray);
        
        /**
         * Sets ith "on-event-update-area" element
         */
        void setOnEventUpdateAreaArray(int i, com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea onEventUpdateArea);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "on-event-update-area" element
         */
        com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea insertNewOnEventUpdateArea(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "on-event-update-area" element
         */
        com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea addNewOnEventUpdateArea();
        
        /**
         * Removes the ith "on-event-update-area" element
         */
        void removeOnEventUpdateArea(int i);
        
        /**
         * Gets the "sort-order" element
         */
        com.kyt.xsd.widgetform.SortOrderDocument.SortOrder getSortOrder();
        
        /**
         * True if has "sort-order" element
         */
        boolean isSetSortOrder();
        
        /**
         * Sets the "sort-order" element
         */
        void setSortOrder(com.kyt.xsd.widgetform.SortOrderDocument.SortOrder sortOrder);
        
        /**
         * Appends and returns a new empty "sort-order" element
         */
        com.kyt.xsd.widgetform.SortOrderDocument.SortOrder addNewSortOrder();
        
        /**
         * Unsets the "sort-order" element
         */
        void unsetSortOrder();
        
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
         * Gets the "type" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.Type xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(com.kyt.xsd.widgetform.FormDocument.Form.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(com.kyt.xsd.widgetform.FormDocument.Form.Type type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "target" attribute
         */
        java.lang.String getTarget();
        
        /**
         * Gets (as xml) the "target" attribute
         */
        org.apache.xmlbeans.XmlString xgetTarget();
        
        /**
         * True if has "target" attribute
         */
        boolean isSetTarget();
        
        /**
         * Sets the "target" attribute
         */
        void setTarget(java.lang.String target);
        
        /**
         * Sets (as xml) the "target" attribute
         */
        void xsetTarget(org.apache.xmlbeans.XmlString target);
        
        /**
         * Unsets the "target" attribute
         */
        void unsetTarget();
        
        /**
         * Gets the "target-window" attribute
         */
        java.lang.String getTargetWindow();
        
        /**
         * Gets (as xml) the "target-window" attribute
         */
        org.apache.xmlbeans.XmlString xgetTargetWindow();
        
        /**
         * True if has "target-window" attribute
         */
        boolean isSetTargetWindow();
        
        /**
         * Sets the "target-window" attribute
         */
        void setTargetWindow(java.lang.String targetWindow);
        
        /**
         * Sets (as xml) the "target-window" attribute
         */
        void xsetTargetWindow(org.apache.xmlbeans.XmlString targetWindow);
        
        /**
         * Unsets the "target-window" attribute
         */
        void unsetTargetWindow();
        
        /**
         * Gets the "target-type" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.TargetType.Enum getTargetType();
        
        /**
         * Gets (as xml) the "target-type" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.TargetType xgetTargetType();
        
        /**
         * True if has "target-type" attribute
         */
        boolean isSetTargetType();
        
        /**
         * Sets the "target-type" attribute
         */
        void setTargetType(com.kyt.xsd.widgetform.FormDocument.Form.TargetType.Enum targetType);
        
        /**
         * Sets (as xml) the "target-type" attribute
         */
        void xsetTargetType(com.kyt.xsd.widgetform.FormDocument.Form.TargetType targetType);
        
        /**
         * Unsets the "target-type" attribute
         */
        void unsetTargetType();
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlString xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlString id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
        /**
         * Gets the "style" attribute
         */
        java.lang.String getStyle();
        
        /**
         * Gets (as xml) the "style" attribute
         */
        org.apache.xmlbeans.XmlString xgetStyle();
        
        /**
         * True if has "style" attribute
         */
        boolean isSetStyle();
        
        /**
         * Sets the "style" attribute
         */
        void setStyle(java.lang.String style);
        
        /**
         * Sets (as xml) the "style" attribute
         */
        void xsetStyle(org.apache.xmlbeans.XmlString style);
        
        /**
         * Unsets the "style" attribute
         */
        void unsetStyle();
        
        /**
         * Gets the "focus-field-name" attribute
         */
        java.lang.String getFocusFieldName();
        
        /**
         * Gets (as xml) the "focus-field-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetFocusFieldName();
        
        /**
         * True if has "focus-field-name" attribute
         */
        boolean isSetFocusFieldName();
        
        /**
         * Sets the "focus-field-name" attribute
         */
        void setFocusFieldName(java.lang.String focusFieldName);
        
        /**
         * Sets (as xml) the "focus-field-name" attribute
         */
        void xsetFocusFieldName(org.apache.xmlbeans.XmlString focusFieldName);
        
        /**
         * Unsets the "focus-field-name" attribute
         */
        void unsetFocusFieldName();
        
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
         * Gets the "list-name" attribute
         */
        java.lang.String getListName();
        
        /**
         * Gets (as xml) the "list-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetListName();
        
        /**
         * True if has "list-name" attribute
         */
        boolean isSetListName();
        
        /**
         * Sets the "list-name" attribute
         */
        void setListName(java.lang.String listName);
        
        /**
         * Sets (as xml) the "list-name" attribute
         */
        void xsetListName(org.apache.xmlbeans.XmlString listName);
        
        /**
         * Unsets the "list-name" attribute
         */
        void unsetListName();
        
        /**
         * Gets the "list-entry-name" attribute
         */
        java.lang.String getListEntryName();
        
        /**
         * Gets (as xml) the "list-entry-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetListEntryName();
        
        /**
         * True if has "list-entry-name" attribute
         */
        boolean isSetListEntryName();
        
        /**
         * Sets the "list-entry-name" attribute
         */
        void setListEntryName(java.lang.String listEntryName);
        
        /**
         * Sets (as xml) the "list-entry-name" attribute
         */
        void xsetListEntryName(org.apache.xmlbeans.XmlString listEntryName);
        
        /**
         * Unsets the "list-entry-name" attribute
         */
        void unsetListEntryName();
        
        /**
         * Gets the "default-map-name" attribute
         */
        java.lang.String getDefaultMapName();
        
        /**
         * Gets (as xml) the "default-map-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultMapName();
        
        /**
         * True if has "default-map-name" attribute
         */
        boolean isSetDefaultMapName();
        
        /**
         * Sets the "default-map-name" attribute
         */
        void setDefaultMapName(java.lang.String defaultMapName);
        
        /**
         * Sets (as xml) the "default-map-name" attribute
         */
        void xsetDefaultMapName(org.apache.xmlbeans.XmlString defaultMapName);
        
        /**
         * Unsets the "default-map-name" attribute
         */
        void unsetDefaultMapName();
        
        /**
         * Gets the "default-entity-name" attribute
         */
        java.lang.String getDefaultEntityName();
        
        /**
         * Gets (as xml) the "default-entity-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultEntityName();
        
        /**
         * True if has "default-entity-name" attribute
         */
        boolean isSetDefaultEntityName();
        
        /**
         * Sets the "default-entity-name" attribute
         */
        void setDefaultEntityName(java.lang.String defaultEntityName);
        
        /**
         * Sets (as xml) the "default-entity-name" attribute
         */
        void xsetDefaultEntityName(org.apache.xmlbeans.XmlString defaultEntityName);
        
        /**
         * Unsets the "default-entity-name" attribute
         */
        void unsetDefaultEntityName();
        
        /**
         * Gets the "default-service-name" attribute
         */
        java.lang.String getDefaultServiceName();
        
        /**
         * Gets (as xml) the "default-service-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultServiceName();
        
        /**
         * True if has "default-service-name" attribute
         */
        boolean isSetDefaultServiceName();
        
        /**
         * Sets the "default-service-name" attribute
         */
        void setDefaultServiceName(java.lang.String defaultServiceName);
        
        /**
         * Sets (as xml) the "default-service-name" attribute
         */
        void xsetDefaultServiceName(org.apache.xmlbeans.XmlString defaultServiceName);
        
        /**
         * Unsets the "default-service-name" attribute
         */
        void unsetDefaultServiceName();
        
        /**
         * Gets the "form-title-area-style" attribute
         */
        java.lang.String getFormTitleAreaStyle();
        
        /**
         * Gets (as xml) the "form-title-area-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetFormTitleAreaStyle();
        
        /**
         * True if has "form-title-area-style" attribute
         */
        boolean isSetFormTitleAreaStyle();
        
        /**
         * Sets the "form-title-area-style" attribute
         */
        void setFormTitleAreaStyle(java.lang.String formTitleAreaStyle);
        
        /**
         * Sets (as xml) the "form-title-area-style" attribute
         */
        void xsetFormTitleAreaStyle(org.apache.xmlbeans.XmlString formTitleAreaStyle);
        
        /**
         * Unsets the "form-title-area-style" attribute
         */
        void unsetFormTitleAreaStyle();
        
        /**
         * Gets the "form-widget-area-style" attribute
         */
        java.lang.String getFormWidgetAreaStyle();
        
        /**
         * Gets (as xml) the "form-widget-area-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetFormWidgetAreaStyle();
        
        /**
         * True if has "form-widget-area-style" attribute
         */
        boolean isSetFormWidgetAreaStyle();
        
        /**
         * Sets the "form-widget-area-style" attribute
         */
        void setFormWidgetAreaStyle(java.lang.String formWidgetAreaStyle);
        
        /**
         * Sets (as xml) the "form-widget-area-style" attribute
         */
        void xsetFormWidgetAreaStyle(org.apache.xmlbeans.XmlString formWidgetAreaStyle);
        
        /**
         * Unsets the "form-widget-area-style" attribute
         */
        void unsetFormWidgetAreaStyle();
        
        /**
         * Gets the "default-title-area-style" attribute
         */
        java.lang.String getDefaultTitleAreaStyle();
        
        /**
         * Gets (as xml) the "default-title-area-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultTitleAreaStyle();
        
        /**
         * True if has "default-title-area-style" attribute
         */
        boolean isSetDefaultTitleAreaStyle();
        
        /**
         * Sets the "default-title-area-style" attribute
         */
        void setDefaultTitleAreaStyle(java.lang.String defaultTitleAreaStyle);
        
        /**
         * Sets (as xml) the "default-title-area-style" attribute
         */
        void xsetDefaultTitleAreaStyle(org.apache.xmlbeans.XmlString defaultTitleAreaStyle);
        
        /**
         * Unsets the "default-title-area-style" attribute
         */
        void unsetDefaultTitleAreaStyle();
        
        /**
         * Gets the "default-widget-area-style" attribute
         */
        java.lang.String getDefaultWidgetAreaStyle();
        
        /**
         * Gets (as xml) the "default-widget-area-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultWidgetAreaStyle();
        
        /**
         * True if has "default-widget-area-style" attribute
         */
        boolean isSetDefaultWidgetAreaStyle();
        
        /**
         * Sets the "default-widget-area-style" attribute
         */
        void setDefaultWidgetAreaStyle(java.lang.String defaultWidgetAreaStyle);
        
        /**
         * Sets (as xml) the "default-widget-area-style" attribute
         */
        void xsetDefaultWidgetAreaStyle(org.apache.xmlbeans.XmlString defaultWidgetAreaStyle);
        
        /**
         * Unsets the "default-widget-area-style" attribute
         */
        void unsetDefaultWidgetAreaStyle();
        
        /**
         * Gets the "default-title-style" attribute
         */
        java.lang.String getDefaultTitleStyle();
        
        /**
         * Gets (as xml) the "default-title-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultTitleStyle();
        
        /**
         * True if has "default-title-style" attribute
         */
        boolean isSetDefaultTitleStyle();
        
        /**
         * Sets the "default-title-style" attribute
         */
        void setDefaultTitleStyle(java.lang.String defaultTitleStyle);
        
        /**
         * Sets (as xml) the "default-title-style" attribute
         */
        void xsetDefaultTitleStyle(org.apache.xmlbeans.XmlString defaultTitleStyle);
        
        /**
         * Unsets the "default-title-style" attribute
         */
        void unsetDefaultTitleStyle();
        
        /**
         * Gets the "default-widget-style" attribute
         */
        java.lang.String getDefaultWidgetStyle();
        
        /**
         * Gets (as xml) the "default-widget-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultWidgetStyle();
        
        /**
         * True if has "default-widget-style" attribute
         */
        boolean isSetDefaultWidgetStyle();
        
        /**
         * Sets the "default-widget-style" attribute
         */
        void setDefaultWidgetStyle(java.lang.String defaultWidgetStyle);
        
        /**
         * Sets (as xml) the "default-widget-style" attribute
         */
        void xsetDefaultWidgetStyle(org.apache.xmlbeans.XmlString defaultWidgetStyle);
        
        /**
         * Unsets the "default-widget-style" attribute
         */
        void unsetDefaultWidgetStyle();
        
        /**
         * Gets the "default-tooltip-style" attribute
         */
        java.lang.String getDefaultTooltipStyle();
        
        /**
         * Gets (as xml) the "default-tooltip-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultTooltipStyle();
        
        /**
         * True if has "default-tooltip-style" attribute
         */
        boolean isSetDefaultTooltipStyle();
        
        /**
         * Sets the "default-tooltip-style" attribute
         */
        void setDefaultTooltipStyle(java.lang.String defaultTooltipStyle);
        
        /**
         * Sets (as xml) the "default-tooltip-style" attribute
         */
        void xsetDefaultTooltipStyle(org.apache.xmlbeans.XmlString defaultTooltipStyle);
        
        /**
         * Unsets the "default-tooltip-style" attribute
         */
        void unsetDefaultTooltipStyle();
        
        /**
         * Gets the "default-required-field-style" attribute
         */
        java.lang.String getDefaultRequiredFieldStyle();
        
        /**
         * Gets (as xml) the "default-required-field-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultRequiredFieldStyle();
        
        /**
         * True if has "default-required-field-style" attribute
         */
        boolean isSetDefaultRequiredFieldStyle();
        
        /**
         * Sets the "default-required-field-style" attribute
         */
        void setDefaultRequiredFieldStyle(java.lang.String defaultRequiredFieldStyle);
        
        /**
         * Sets (as xml) the "default-required-field-style" attribute
         */
        void xsetDefaultRequiredFieldStyle(org.apache.xmlbeans.XmlString defaultRequiredFieldStyle);
        
        /**
         * Unsets the "default-required-field-style" attribute
         */
        void unsetDefaultRequiredFieldStyle();
        
        /**
         * Gets the "default-sort-field-style" attribute
         */
        java.lang.String getDefaultSortFieldStyle();
        
        /**
         * Gets (as xml) the "default-sort-field-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultSortFieldStyle();
        
        /**
         * True if has "default-sort-field-style" attribute
         */
        boolean isSetDefaultSortFieldStyle();
        
        /**
         * Sets the "default-sort-field-style" attribute
         */
        void setDefaultSortFieldStyle(java.lang.String defaultSortFieldStyle);
        
        /**
         * Sets (as xml) the "default-sort-field-style" attribute
         */
        void xsetDefaultSortFieldStyle(org.apache.xmlbeans.XmlString defaultSortFieldStyle);
        
        /**
         * Unsets the "default-sort-field-style" attribute
         */
        void unsetDefaultSortFieldStyle();
        
        /**
         * Gets the "default-sort-field-asc-style" attribute
         */
        java.lang.String getDefaultSortFieldAscStyle();
        
        /**
         * Gets (as xml) the "default-sort-field-asc-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultSortFieldAscStyle();
        
        /**
         * True if has "default-sort-field-asc-style" attribute
         */
        boolean isSetDefaultSortFieldAscStyle();
        
        /**
         * Sets the "default-sort-field-asc-style" attribute
         */
        void setDefaultSortFieldAscStyle(java.lang.String defaultSortFieldAscStyle);
        
        /**
         * Sets (as xml) the "default-sort-field-asc-style" attribute
         */
        void xsetDefaultSortFieldAscStyle(org.apache.xmlbeans.XmlString defaultSortFieldAscStyle);
        
        /**
         * Unsets the "default-sort-field-asc-style" attribute
         */
        void unsetDefaultSortFieldAscStyle();
        
        /**
         * Gets the "default-sort-field-desc-style" attribute
         */
        java.lang.String getDefaultSortFieldDescStyle();
        
        /**
         * Gets (as xml) the "default-sort-field-desc-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultSortFieldDescStyle();
        
        /**
         * True if has "default-sort-field-desc-style" attribute
         */
        boolean isSetDefaultSortFieldDescStyle();
        
        /**
         * Sets the "default-sort-field-desc-style" attribute
         */
        void setDefaultSortFieldDescStyle(java.lang.String defaultSortFieldDescStyle);
        
        /**
         * Sets (as xml) the "default-sort-field-desc-style" attribute
         */
        void xsetDefaultSortFieldDescStyle(org.apache.xmlbeans.XmlString defaultSortFieldDescStyle);
        
        /**
         * Unsets the "default-sort-field-desc-style" attribute
         */
        void unsetDefaultSortFieldDescStyle();
        
        /**
         * Gets the "paginate" attribute
         */
        java.lang.String getPaginate();
        
        /**
         * Gets (as xml) the "paginate" attribute
         */
        org.apache.xmlbeans.XmlString xgetPaginate();
        
        /**
         * True if has "paginate" attribute
         */
        boolean isSetPaginate();
        
        /**
         * Sets the "paginate" attribute
         */
        void setPaginate(java.lang.String paginate);
        
        /**
         * Sets (as xml) the "paginate" attribute
         */
        void xsetPaginate(org.apache.xmlbeans.XmlString paginate);
        
        /**
         * Unsets the "paginate" attribute
         */
        void unsetPaginate();
        
        /**
         * Gets the "paginate-target" attribute
         */
        java.lang.String getPaginateTarget();
        
        /**
         * Gets (as xml) the "paginate-target" attribute
         */
        org.apache.xmlbeans.XmlString xgetPaginateTarget();
        
        /**
         * True if has "paginate-target" attribute
         */
        boolean isSetPaginateTarget();
        
        /**
         * Sets the "paginate-target" attribute
         */
        void setPaginateTarget(java.lang.String paginateTarget);
        
        /**
         * Sets (as xml) the "paginate-target" attribute
         */
        void xsetPaginateTarget(org.apache.xmlbeans.XmlString paginateTarget);
        
        /**
         * Unsets the "paginate-target" attribute
         */
        void unsetPaginateTarget();
        
        /**
         * Gets the "paginate-target-anchor" attribute
         */
        java.lang.String getPaginateTargetAnchor();
        
        /**
         * Gets (as xml) the "paginate-target-anchor" attribute
         */
        org.apache.xmlbeans.XmlString xgetPaginateTargetAnchor();
        
        /**
         * True if has "paginate-target-anchor" attribute
         */
        boolean isSetPaginateTargetAnchor();
        
        /**
         * Sets the "paginate-target-anchor" attribute
         */
        void setPaginateTargetAnchor(java.lang.String paginateTargetAnchor);
        
        /**
         * Sets (as xml) the "paginate-target-anchor" attribute
         */
        void xsetPaginateTargetAnchor(org.apache.xmlbeans.XmlString paginateTargetAnchor);
        
        /**
         * Unsets the "paginate-target-anchor" attribute
         */
        void unsetPaginateTargetAnchor();
        
        /**
         * Gets the "paginate-size-field" attribute
         */
        java.lang.String getPaginateSizeField();
        
        /**
         * Gets (as xml) the "paginate-size-field" attribute
         */
        org.apache.xmlbeans.XmlString xgetPaginateSizeField();
        
        /**
         * True if has "paginate-size-field" attribute
         */
        boolean isSetPaginateSizeField();
        
        /**
         * Sets the "paginate-size-field" attribute
         */
        void setPaginateSizeField(java.lang.String paginateSizeField);
        
        /**
         * Sets (as xml) the "paginate-size-field" attribute
         */
        void xsetPaginateSizeField(org.apache.xmlbeans.XmlString paginateSizeField);
        
        /**
         * Unsets the "paginate-size-field" attribute
         */
        void unsetPaginateSizeField();
        
        /**
         * Gets the "paginate-index-field" attribute
         */
        java.lang.String getPaginateIndexField();
        
        /**
         * Gets (as xml) the "paginate-index-field" attribute
         */
        org.apache.xmlbeans.XmlString xgetPaginateIndexField();
        
        /**
         * True if has "paginate-index-field" attribute
         */
        boolean isSetPaginateIndexField();
        
        /**
         * Sets the "paginate-index-field" attribute
         */
        void setPaginateIndexField(java.lang.String paginateIndexField);
        
        /**
         * Sets (as xml) the "paginate-index-field" attribute
         */
        void xsetPaginateIndexField(org.apache.xmlbeans.XmlString paginateIndexField);
        
        /**
         * Unsets the "paginate-index-field" attribute
         */
        void unsetPaginateIndexField();
        
        /**
         * Gets the "override-list-size" attribute
         */
        java.lang.String getOverrideListSize();
        
        /**
         * Gets (as xml) the "override-list-size" attribute
         */
        org.apache.xmlbeans.XmlString xgetOverrideListSize();
        
        /**
         * True if has "override-list-size" attribute
         */
        boolean isSetOverrideListSize();
        
        /**
         * Sets the "override-list-size" attribute
         */
        void setOverrideListSize(java.lang.String overrideListSize);
        
        /**
         * Sets (as xml) the "override-list-size" attribute
         */
        void xsetOverrideListSize(org.apache.xmlbeans.XmlString overrideListSize);
        
        /**
         * Unsets the "override-list-size" attribute
         */
        void unsetOverrideListSize();
        
        /**
         * Gets the "paginate-first-label" attribute
         */
        java.lang.String getPaginateFirstLabel();
        
        /**
         * Gets (as xml) the "paginate-first-label" attribute
         */
        org.apache.xmlbeans.XmlString xgetPaginateFirstLabel();
        
        /**
         * True if has "paginate-first-label" attribute
         */
        boolean isSetPaginateFirstLabel();
        
        /**
         * Sets the "paginate-first-label" attribute
         */
        void setPaginateFirstLabel(java.lang.String paginateFirstLabel);
        
        /**
         * Sets (as xml) the "paginate-first-label" attribute
         */
        void xsetPaginateFirstLabel(org.apache.xmlbeans.XmlString paginateFirstLabel);
        
        /**
         * Unsets the "paginate-first-label" attribute
         */
        void unsetPaginateFirstLabel();
        
        /**
         * Gets the "paginate-previous-label" attribute
         */
        java.lang.String getPaginatePreviousLabel();
        
        /**
         * Gets (as xml) the "paginate-previous-label" attribute
         */
        org.apache.xmlbeans.XmlString xgetPaginatePreviousLabel();
        
        /**
         * True if has "paginate-previous-label" attribute
         */
        boolean isSetPaginatePreviousLabel();
        
        /**
         * Sets the "paginate-previous-label" attribute
         */
        void setPaginatePreviousLabel(java.lang.String paginatePreviousLabel);
        
        /**
         * Sets (as xml) the "paginate-previous-label" attribute
         */
        void xsetPaginatePreviousLabel(org.apache.xmlbeans.XmlString paginatePreviousLabel);
        
        /**
         * Unsets the "paginate-previous-label" attribute
         */
        void unsetPaginatePreviousLabel();
        
        /**
         * Gets the "paginate-next-label" attribute
         */
        java.lang.String getPaginateNextLabel();
        
        /**
         * Gets (as xml) the "paginate-next-label" attribute
         */
        org.apache.xmlbeans.XmlString xgetPaginateNextLabel();
        
        /**
         * True if has "paginate-next-label" attribute
         */
        boolean isSetPaginateNextLabel();
        
        /**
         * Sets the "paginate-next-label" attribute
         */
        void setPaginateNextLabel(java.lang.String paginateNextLabel);
        
        /**
         * Sets (as xml) the "paginate-next-label" attribute
         */
        void xsetPaginateNextLabel(org.apache.xmlbeans.XmlString paginateNextLabel);
        
        /**
         * Unsets the "paginate-next-label" attribute
         */
        void unsetPaginateNextLabel();
        
        /**
         * Gets the "paginate-last-label" attribute
         */
        java.lang.String getPaginateLastLabel();
        
        /**
         * Gets (as xml) the "paginate-last-label" attribute
         */
        org.apache.xmlbeans.XmlString xgetPaginateLastLabel();
        
        /**
         * True if has "paginate-last-label" attribute
         */
        boolean isSetPaginateLastLabel();
        
        /**
         * Sets the "paginate-last-label" attribute
         */
        void setPaginateLastLabel(java.lang.String paginateLastLabel);
        
        /**
         * Sets (as xml) the "paginate-last-label" attribute
         */
        void xsetPaginateLastLabel(org.apache.xmlbeans.XmlString paginateLastLabel);
        
        /**
         * Unsets the "paginate-last-label" attribute
         */
        void unsetPaginateLastLabel();
        
        /**
         * Gets the "paginate-style" attribute
         */
        java.lang.String getPaginateStyle();
        
        /**
         * Gets (as xml) the "paginate-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetPaginateStyle();
        
        /**
         * True if has "paginate-style" attribute
         */
        boolean isSetPaginateStyle();
        
        /**
         * Sets the "paginate-style" attribute
         */
        void setPaginateStyle(java.lang.String paginateStyle);
        
        /**
         * Sets (as xml) the "paginate-style" attribute
         */
        void xsetPaginateStyle(org.apache.xmlbeans.XmlString paginateStyle);
        
        /**
         * Unsets the "paginate-style" attribute
         */
        void unsetPaginateStyle();
        
        /**
         * Gets the "item-index-separator" attribute
         */
        java.lang.String getItemIndexSeparator();
        
        /**
         * Gets (as xml) the "item-index-separator" attribute
         */
        org.apache.xmlbeans.XmlString xgetItemIndexSeparator();
        
        /**
         * True if has "item-index-separator" attribute
         */
        boolean isSetItemIndexSeparator();
        
        /**
         * Sets the "item-index-separator" attribute
         */
        void setItemIndexSeparator(java.lang.String itemIndexSeparator);
        
        /**
         * Sets (as xml) the "item-index-separator" attribute
         */
        void xsetItemIndexSeparator(org.apache.xmlbeans.XmlString itemIndexSeparator);
        
        /**
         * Unsets the "item-index-separator" attribute
         */
        void unsetItemIndexSeparator();
        
        /**
         * Gets the "extends" attribute
         */
        java.lang.String getExtends();
        
        /**
         * Gets (as xml) the "extends" attribute
         */
        org.apache.xmlbeans.XmlString xgetExtends();
        
        /**
         * True if has "extends" attribute
         */
        boolean isSetExtends();
        
        /**
         * Sets the "extends" attribute
         */
        void setExtends(java.lang.String xextends);
        
        /**
         * Sets (as xml) the "extends" attribute
         */
        void xsetExtends(org.apache.xmlbeans.XmlString xextends);
        
        /**
         * Unsets the "extends" attribute
         */
        void unsetExtends();
        
        /**
         * Gets the "extends-resource" attribute
         */
        java.lang.String getExtendsResource();
        
        /**
         * Gets (as xml) the "extends-resource" attribute
         */
        org.apache.xmlbeans.XmlString xgetExtendsResource();
        
        /**
         * True if has "extends-resource" attribute
         */
        boolean isSetExtendsResource();
        
        /**
         * Sets the "extends-resource" attribute
         */
        void setExtendsResource(java.lang.String extendsResource);
        
        /**
         * Sets (as xml) the "extends-resource" attribute
         */
        void xsetExtendsResource(org.apache.xmlbeans.XmlString extendsResource);
        
        /**
         * Unsets the "extends-resource" attribute
         */
        void unsetExtendsResource();
        
        /**
         * Gets the "separate-columns" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns.Enum getSeparateColumns();
        
        /**
         * Gets (as xml) the "separate-columns" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns xgetSeparateColumns();
        
        /**
         * True if has "separate-columns" attribute
         */
        boolean isSetSeparateColumns();
        
        /**
         * Sets the "separate-columns" attribute
         */
        void setSeparateColumns(com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns.Enum separateColumns);
        
        /**
         * Sets (as xml) the "separate-columns" attribute
         */
        void xsetSeparateColumns(com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns separateColumns);
        
        /**
         * Unsets the "separate-columns" attribute
         */
        void unsetSeparateColumns();
        
        /**
         * Gets the "group-columns" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns.Enum getGroupColumns();
        
        /**
         * Gets (as xml) the "group-columns" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns xgetGroupColumns();
        
        /**
         * True if has "group-columns" attribute
         */
        boolean isSetGroupColumns();
        
        /**
         * Sets the "group-columns" attribute
         */
        void setGroupColumns(com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns.Enum groupColumns);
        
        /**
         * Sets (as xml) the "group-columns" attribute
         */
        void xsetGroupColumns(com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns groupColumns);
        
        /**
         * Unsets the "group-columns" attribute
         */
        void unsetGroupColumns();
        
        /**
         * Gets the "view-size" attribute
         */
        java.math.BigInteger getViewSize();
        
        /**
         * Gets (as xml) the "view-size" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetViewSize();
        
        /**
         * True if has "view-size" attribute
         */
        boolean isSetViewSize();
        
        /**
         * Sets the "view-size" attribute
         */
        void setViewSize(java.math.BigInteger viewSize);
        
        /**
         * Sets (as xml) the "view-size" attribute
         */
        void xsetViewSize(org.apache.xmlbeans.XmlInteger viewSize);
        
        /**
         * Unsets the "view-size" attribute
         */
        void unsetViewSize();
        
        /**
         * Gets the "row-count" attribute
         */
        java.lang.String getRowCount();
        
        /**
         * Gets (as xml) the "row-count" attribute
         */
        org.apache.xmlbeans.XmlString xgetRowCount();
        
        /**
         * True if has "row-count" attribute
         */
        boolean isSetRowCount();
        
        /**
         * Sets the "row-count" attribute
         */
        void setRowCount(java.lang.String rowCount);
        
        /**
         * Sets (as xml) the "row-count" attribute
         */
        void xsetRowCount(org.apache.xmlbeans.XmlString rowCount);
        
        /**
         * Unsets the "row-count" attribute
         */
        void unsetRowCount();
        
        /**
         * Gets the "use-row-submit" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit.Enum getUseRowSubmit();
        
        /**
         * Gets (as xml) the "use-row-submit" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit xgetUseRowSubmit();
        
        /**
         * True if has "use-row-submit" attribute
         */
        boolean isSetUseRowSubmit();
        
        /**
         * Sets the "use-row-submit" attribute
         */
        void setUseRowSubmit(com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit.Enum useRowSubmit);
        
        /**
         * Sets (as xml) the "use-row-submit" attribute
         */
        void xsetUseRowSubmit(com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit useRowSubmit);
        
        /**
         * Unsets the "use-row-submit" attribute
         */
        void unsetUseRowSubmit();
        
        /**
         * Gets the "skip-start" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.SkipStart.Enum getSkipStart();
        
        /**
         * Gets (as xml) the "skip-start" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.SkipStart xgetSkipStart();
        
        /**
         * True if has "skip-start" attribute
         */
        boolean isSetSkipStart();
        
        /**
         * Sets the "skip-start" attribute
         */
        void setSkipStart(com.kyt.xsd.widgetform.FormDocument.Form.SkipStart.Enum skipStart);
        
        /**
         * Sets (as xml) the "skip-start" attribute
         */
        void xsetSkipStart(com.kyt.xsd.widgetform.FormDocument.Form.SkipStart skipStart);
        
        /**
         * Unsets the "skip-start" attribute
         */
        void unsetSkipStart();
        
        /**
         * Gets the "skip-end" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd.Enum getSkipEnd();
        
        /**
         * Gets (as xml) the "skip-end" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd xgetSkipEnd();
        
        /**
         * True if has "skip-end" attribute
         */
        boolean isSetSkipEnd();
        
        /**
         * Sets the "skip-end" attribute
         */
        void setSkipEnd(com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd.Enum skipEnd);
        
        /**
         * Sets (as xml) the "skip-end" attribute
         */
        void xsetSkipEnd(com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd skipEnd);
        
        /**
         * Unsets the "skip-end" attribute
         */
        void unsetSkipEnd();
        
        /**
         * Gets the "hide-header" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.HideHeader.Enum getHideHeader();
        
        /**
         * Gets (as xml) the "hide-header" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.HideHeader xgetHideHeader();
        
        /**
         * True if has "hide-header" attribute
         */
        boolean isSetHideHeader();
        
        /**
         * Sets the "hide-header" attribute
         */
        void setHideHeader(com.kyt.xsd.widgetform.FormDocument.Form.HideHeader.Enum hideHeader);
        
        /**
         * Sets (as xml) the "hide-header" attribute
         */
        void xsetHideHeader(com.kyt.xsd.widgetform.FormDocument.Form.HideHeader hideHeader);
        
        /**
         * Unsets the "hide-header" attribute
         */
        void unsetHideHeader();
        
        /**
         * Gets the "odd-row-style" attribute
         */
        java.lang.String getOddRowStyle();
        
        /**
         * Gets (as xml) the "odd-row-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetOddRowStyle();
        
        /**
         * True if has "odd-row-style" attribute
         */
        boolean isSetOddRowStyle();
        
        /**
         * Sets the "odd-row-style" attribute
         */
        void setOddRowStyle(java.lang.String oddRowStyle);
        
        /**
         * Sets (as xml) the "odd-row-style" attribute
         */
        void xsetOddRowStyle(org.apache.xmlbeans.XmlString oddRowStyle);
        
        /**
         * Unsets the "odd-row-style" attribute
         */
        void unsetOddRowStyle();
        
        /**
         * Gets the "even-row-style" attribute
         */
        java.lang.String getEvenRowStyle();
        
        /**
         * Gets (as xml) the "even-row-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetEvenRowStyle();
        
        /**
         * True if has "even-row-style" attribute
         */
        boolean isSetEvenRowStyle();
        
        /**
         * Sets the "even-row-style" attribute
         */
        void setEvenRowStyle(java.lang.String evenRowStyle);
        
        /**
         * Sets (as xml) the "even-row-style" attribute
         */
        void xsetEvenRowStyle(org.apache.xmlbeans.XmlString evenRowStyle);
        
        /**
         * Unsets the "even-row-style" attribute
         */
        void unsetEvenRowStyle();
        
        /**
         * Gets the "header-row-style" attribute
         */
        java.lang.String getHeaderRowStyle();
        
        /**
         * Gets (as xml) the "header-row-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetHeaderRowStyle();
        
        /**
         * True if has "header-row-style" attribute
         */
        boolean isSetHeaderRowStyle();
        
        /**
         * Sets the "header-row-style" attribute
         */
        void setHeaderRowStyle(java.lang.String headerRowStyle);
        
        /**
         * Sets (as xml) the "header-row-style" attribute
         */
        void xsetHeaderRowStyle(org.apache.xmlbeans.XmlString headerRowStyle);
        
        /**
         * Unsets the "header-row-style" attribute
         */
        void unsetHeaderRowStyle();
        
        /**
         * Gets the "default-table-style" attribute
         */
        java.lang.String getDefaultTableStyle();
        
        /**
         * Gets (as xml) the "default-table-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultTableStyle();
        
        /**
         * True if has "default-table-style" attribute
         */
        boolean isSetDefaultTableStyle();
        
        /**
         * Sets the "default-table-style" attribute
         */
        void setDefaultTableStyle(java.lang.String defaultTableStyle);
        
        /**
         * Sets (as xml) the "default-table-style" attribute
         */
        void xsetDefaultTableStyle(org.apache.xmlbeans.XmlString defaultTableStyle);
        
        /**
         * Unsets the "default-table-style" attribute
         */
        void unsetDefaultTableStyle();
        
        /**
         * Gets the "client-autocomplete-fields" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields.Enum getClientAutocompleteFields();
        
        /**
         * Gets (as xml) the "client-autocomplete-fields" attribute
         */
        com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields xgetClientAutocompleteFields();
        
        /**
         * True if has "client-autocomplete-fields" attribute
         */
        boolean isSetClientAutocompleteFields();
        
        /**
         * Sets the "client-autocomplete-fields" attribute
         */
        void setClientAutocompleteFields(com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields.Enum clientAutocompleteFields);
        
        /**
         * Sets (as xml) the "client-autocomplete-fields" attribute
         */
        void xsetClientAutocompleteFields(com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields clientAutocompleteFields);
        
        /**
         * Unsets the "client-autocomplete-fields" attribute
         */
        void unsetClientAutocompleteFields();
        
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("type0747attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum SINGLE = Enum.forString("single");
            static final Enum LIST = Enum.forString("list");
            static final Enum MULTI = Enum.forString("multi");
            static final Enum UPLOAD = Enum.forString("upload");
            
            static final int INT_SINGLE = Enum.INT_SINGLE;
            static final int INT_LIST = Enum.INT_LIST;
            static final int INT_MULTI = Enum.INT_MULTI;
            static final int INT_UPLOAD = Enum.INT_UPLOAD;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FormDocument$Form$Type.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SINGLE
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
                
                static final int INT_SINGLE = 1;
                static final int INT_LIST = 2;
                static final int INT_MULTI = 3;
                static final int INT_UPLOAD = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("single", INT_SINGLE),
                      new Enum("list", INT_LIST),
                      new Enum("multi", INT_MULTI),
                      new Enum("upload", INT_UPLOAD),
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
                public static com.kyt.xsd.widgetform.FormDocument.Form.Type newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.Type) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.Type newInstance() {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML target-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$TargetType.
         */
        public interface TargetType extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TargetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("targettypee74battrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum INTRA_APP = Enum.forString("intra-app");
            static final Enum INTER_APP = Enum.forString("inter-app");
            static final Enum CONTENT = Enum.forString("content");
            static final Enum PLAIN = Enum.forString("plain");
            
            static final int INT_INTRA_APP = Enum.INT_INTRA_APP;
            static final int INT_INTER_APP = Enum.INT_INTER_APP;
            static final int INT_CONTENT = Enum.INT_CONTENT;
            static final int INT_PLAIN = Enum.INT_PLAIN;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FormDocument$Form$TargetType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_INTRA_APP
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
                
                static final int INT_INTRA_APP = 1;
                static final int INT_INTER_APP = 2;
                static final int INT_CONTENT = 3;
                static final int INT_PLAIN = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("intra-app", INT_INTRA_APP),
                      new Enum("inter-app", INT_INTER_APP),
                      new Enum("content", INT_CONTENT),
                      new Enum("plain", INT_PLAIN),
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
                public static com.kyt.xsd.widgetform.FormDocument.Form.TargetType newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.TargetType) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.TargetType newInstance() {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.TargetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.TargetType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.TargetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML separate-columns(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$SeparateColumns.
         */
        public interface SeparateColumns extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SeparateColumns.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("separatecolumnsf180attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FormDocument$Form$SeparateColumns.
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
                public static com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns newInstance() {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML group-columns(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$GroupColumns.
         */
        public interface GroupColumns extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GroupColumns.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("groupcolumns0f24attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FormDocument$Form$GroupColumns.
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
                public static com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns newInstance() {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML use-row-submit(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$UseRowSubmit.
         */
        public interface UseRowSubmit extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UseRowSubmit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("userowsubmit5c3eattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FormDocument$Form$UseRowSubmit.
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
                public static com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit newInstance() {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML skip-start(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$SkipStart.
         */
        public interface SkipStart extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SkipStart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("skipstartb021attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FormDocument$Form$SkipStart.
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
                public static com.kyt.xsd.widgetform.FormDocument.Form.SkipStart newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.SkipStart) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.SkipStart newInstance() {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.SkipStart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.SkipStart newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.SkipStart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML skip-end(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$SkipEnd.
         */
        public interface SkipEnd extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SkipEnd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("skipend085aattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FormDocument$Form$SkipEnd.
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
                public static com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd newInstance() {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML hide-header(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$HideHeader.
         */
        public interface HideHeader extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HideHeader.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("hideheader6b4dattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FormDocument$Form$HideHeader.
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
                public static com.kyt.xsd.widgetform.FormDocument.Form.HideHeader newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.HideHeader) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.HideHeader newInstance() {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.HideHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.HideHeader newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.HideHeader) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML client-autocomplete-fields(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$ClientAutocompleteFields.
         */
        public interface ClientAutocompleteFields extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClientAutocompleteFields.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("clientautocompletefieldse2c9attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.FormDocument$Form$ClientAutocompleteFields.
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
                public static com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields newInstance() {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.FormDocument.Form newInstance() {
              return (com.kyt.xsd.widgetform.FormDocument.Form) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.FormDocument.Form newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.FormDocument.Form) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.FormDocument newInstance() {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.FormDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.FormDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.FormDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.FormDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.FormDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.FormDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.FormDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.FormDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.FormDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.FormDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.FormDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.FormDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.FormDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.FormDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.FormDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.FormDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.FormDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.FormDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
