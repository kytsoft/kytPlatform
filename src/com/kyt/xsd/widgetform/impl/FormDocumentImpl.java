/*
 * An XML document type.
 * Localname: form
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.FormDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one form(@) element.
 *
 * This is a complex type.
 */
public class FormDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.FormDocument
{
    private static final long serialVersionUID = 1L;
    
    public FormDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORM$0 = 
        new javax.xml.namespace.QName("", "form");
    
    
    /**
     * Gets the "form" element
     */
    public com.kyt.xsd.widgetform.FormDocument.Form getForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.FormDocument.Form target = null;
            target = (com.kyt.xsd.widgetform.FormDocument.Form)get_store().find_element_user(FORM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "form" element
     */
    public void setForm(com.kyt.xsd.widgetform.FormDocument.Form form)
    {
        generatedSetterHelperImpl(form, FORM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "form" element
     */
    public com.kyt.xsd.widgetform.FormDocument.Form addNewForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.FormDocument.Form target = null;
            target = (com.kyt.xsd.widgetform.FormDocument.Form)get_store().add_element_user(FORM$0);
            return target;
        }
    }
    /**
     * An XML form(@).
     *
     * This is a complex type.
     */
    public static class FormImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.FormDocument.Form
    {
        private static final long serialVersionUID = 1L;
        
        public FormImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACTIONS$0 = 
            new javax.xml.namespace.QName("", "actions");
        private static final javax.xml.namespace.QName ROWACTIONS$2 = 
            new javax.xml.namespace.QName("", "row-actions");
        private static final javax.xml.namespace.QName ALTROWSTYLE$4 = 
            new javax.xml.namespace.QName("", "alt-row-style");
        private static final javax.xml.namespace.QName ALTTARGET$6 = 
            new javax.xml.namespace.QName("", "alt-target");
        private static final javax.xml.namespace.QName AUTOFIELDSSERVICE$8 = 
            new javax.xml.namespace.QName("", "auto-fields-service");
        private static final javax.xml.namespace.QName AUTOFIELDSENTITY$10 = 
            new javax.xml.namespace.QName("", "auto-fields-entity");
        private static final javax.xml.namespace.QName FIELD$12 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName ONEVENTUPDATEAREA$14 = 
            new javax.xml.namespace.QName("", "on-event-update-area");
        private static final javax.xml.namespace.QName SORTORDER$16 = 
            new javax.xml.namespace.QName("", "sort-order");
        private static final javax.xml.namespace.QName NAME$18 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName TYPE$20 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName TARGET$22 = 
            new javax.xml.namespace.QName("", "target");
        private static final javax.xml.namespace.QName TARGETWINDOW$24 = 
            new javax.xml.namespace.QName("", "target-window");
        private static final javax.xml.namespace.QName TARGETTYPE$26 = 
            new javax.xml.namespace.QName("", "target-type");
        private static final javax.xml.namespace.QName ID$28 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName STYLE$30 = 
            new javax.xml.namespace.QName("", "style");
        private static final javax.xml.namespace.QName FOCUSFIELDNAME$32 = 
            new javax.xml.namespace.QName("", "focus-field-name");
        private static final javax.xml.namespace.QName TITLE$34 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName TOOLTIP$36 = 
            new javax.xml.namespace.QName("", "tooltip");
        private static final javax.xml.namespace.QName LISTNAME$38 = 
            new javax.xml.namespace.QName("", "list-name");
        private static final javax.xml.namespace.QName LISTENTRYNAME$40 = 
            new javax.xml.namespace.QName("", "list-entry-name");
        private static final javax.xml.namespace.QName DEFAULTMAPNAME$42 = 
            new javax.xml.namespace.QName("", "default-map-name");
        private static final javax.xml.namespace.QName DEFAULTENTITYNAME$44 = 
            new javax.xml.namespace.QName("", "default-entity-name");
        private static final javax.xml.namespace.QName DEFAULTSERVICENAME$46 = 
            new javax.xml.namespace.QName("", "default-service-name");
        private static final javax.xml.namespace.QName FORMTITLEAREASTYLE$48 = 
            new javax.xml.namespace.QName("", "form-title-area-style");
        private static final javax.xml.namespace.QName FORMWIDGETAREASTYLE$50 = 
            new javax.xml.namespace.QName("", "form-widget-area-style");
        private static final javax.xml.namespace.QName DEFAULTTITLEAREASTYLE$52 = 
            new javax.xml.namespace.QName("", "default-title-area-style");
        private static final javax.xml.namespace.QName DEFAULTWIDGETAREASTYLE$54 = 
            new javax.xml.namespace.QName("", "default-widget-area-style");
        private static final javax.xml.namespace.QName DEFAULTTITLESTYLE$56 = 
            new javax.xml.namespace.QName("", "default-title-style");
        private static final javax.xml.namespace.QName DEFAULTWIDGETSTYLE$58 = 
            new javax.xml.namespace.QName("", "default-widget-style");
        private static final javax.xml.namespace.QName DEFAULTTOOLTIPSTYLE$60 = 
            new javax.xml.namespace.QName("", "default-tooltip-style");
        private static final javax.xml.namespace.QName DEFAULTREQUIREDFIELDSTYLE$62 = 
            new javax.xml.namespace.QName("", "default-required-field-style");
        private static final javax.xml.namespace.QName DEFAULTSORTFIELDSTYLE$64 = 
            new javax.xml.namespace.QName("", "default-sort-field-style");
        private static final javax.xml.namespace.QName DEFAULTSORTFIELDASCSTYLE$66 = 
            new javax.xml.namespace.QName("", "default-sort-field-asc-style");
        private static final javax.xml.namespace.QName DEFAULTSORTFIELDDESCSTYLE$68 = 
            new javax.xml.namespace.QName("", "default-sort-field-desc-style");
        private static final javax.xml.namespace.QName PAGINATE$70 = 
            new javax.xml.namespace.QName("", "paginate");
        private static final javax.xml.namespace.QName PAGINATETARGET$72 = 
            new javax.xml.namespace.QName("", "paginate-target");
        private static final javax.xml.namespace.QName PAGINATETARGETANCHOR$74 = 
            new javax.xml.namespace.QName("", "paginate-target-anchor");
        private static final javax.xml.namespace.QName PAGINATESIZEFIELD$76 = 
            new javax.xml.namespace.QName("", "paginate-size-field");
        private static final javax.xml.namespace.QName PAGINATEINDEXFIELD$78 = 
            new javax.xml.namespace.QName("", "paginate-index-field");
        private static final javax.xml.namespace.QName OVERRIDELISTSIZE$80 = 
            new javax.xml.namespace.QName("", "override-list-size");
        private static final javax.xml.namespace.QName PAGINATEFIRSTLABEL$82 = 
            new javax.xml.namespace.QName("", "paginate-first-label");
        private static final javax.xml.namespace.QName PAGINATEPREVIOUSLABEL$84 = 
            new javax.xml.namespace.QName("", "paginate-previous-label");
        private static final javax.xml.namespace.QName PAGINATENEXTLABEL$86 = 
            new javax.xml.namespace.QName("", "paginate-next-label");
        private static final javax.xml.namespace.QName PAGINATELASTLABEL$88 = 
            new javax.xml.namespace.QName("", "paginate-last-label");
        private static final javax.xml.namespace.QName PAGINATESTYLE$90 = 
            new javax.xml.namespace.QName("", "paginate-style");
        private static final javax.xml.namespace.QName ITEMINDEXSEPARATOR$92 = 
            new javax.xml.namespace.QName("", "item-index-separator");
        private static final javax.xml.namespace.QName EXTENDS$94 = 
            new javax.xml.namespace.QName("", "extends");
        private static final javax.xml.namespace.QName EXTENDSRESOURCE$96 = 
            new javax.xml.namespace.QName("", "extends-resource");
        private static final javax.xml.namespace.QName SEPARATECOLUMNS$98 = 
            new javax.xml.namespace.QName("", "separate-columns");
        private static final javax.xml.namespace.QName GROUPCOLUMNS$100 = 
            new javax.xml.namespace.QName("", "group-columns");
        private static final javax.xml.namespace.QName VIEWSIZE$102 = 
            new javax.xml.namespace.QName("", "view-size");
        private static final javax.xml.namespace.QName ROWCOUNT$104 = 
            new javax.xml.namespace.QName("", "row-count");
        private static final javax.xml.namespace.QName USEROWSUBMIT$106 = 
            new javax.xml.namespace.QName("", "use-row-submit");
        private static final javax.xml.namespace.QName SKIPSTART$108 = 
            new javax.xml.namespace.QName("", "skip-start");
        private static final javax.xml.namespace.QName SKIPEND$110 = 
            new javax.xml.namespace.QName("", "skip-end");
        private static final javax.xml.namespace.QName HIDEHEADER$112 = 
            new javax.xml.namespace.QName("", "hide-header");
        private static final javax.xml.namespace.QName ODDROWSTYLE$114 = 
            new javax.xml.namespace.QName("", "odd-row-style");
        private static final javax.xml.namespace.QName EVENROWSTYLE$116 = 
            new javax.xml.namespace.QName("", "even-row-style");
        private static final javax.xml.namespace.QName HEADERROWSTYLE$118 = 
            new javax.xml.namespace.QName("", "header-row-style");
        private static final javax.xml.namespace.QName DEFAULTTABLESTYLE$120 = 
            new javax.xml.namespace.QName("", "default-table-style");
        private static final javax.xml.namespace.QName CLIENTAUTOCOMPLETEFIELDS$122 = 
            new javax.xml.namespace.QName("", "client-autocomplete-fields");
        
        
        /**
         * Gets the "actions" element
         */
        public com.kyt.xsd.widgetform.ActionsDocument.Actions getActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ActionsDocument.Actions target = null;
                target = (com.kyt.xsd.widgetform.ActionsDocument.Actions)get_store().find_element_user(ACTIONS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "actions" element
         */
        public boolean isSetActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACTIONS$0) != 0;
            }
        }
        
        /**
         * Sets the "actions" element
         */
        public void setActions(com.kyt.xsd.widgetform.ActionsDocument.Actions actions)
        {
            generatedSetterHelperImpl(actions, ACTIONS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "actions" element
         */
        public com.kyt.xsd.widgetform.ActionsDocument.Actions addNewActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.ActionsDocument.Actions target = null;
                target = (com.kyt.xsd.widgetform.ActionsDocument.Actions)get_store().add_element_user(ACTIONS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "actions" element
         */
        public void unsetActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACTIONS$0, 0);
            }
        }
        
        /**
         * Gets the "row-actions" element
         */
        public com.kyt.xsd.widgetform.RowActionsDocument.RowActions getRowActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.RowActionsDocument.RowActions target = null;
                target = (com.kyt.xsd.widgetform.RowActionsDocument.RowActions)get_store().find_element_user(ROWACTIONS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "row-actions" element
         */
        public boolean isSetRowActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROWACTIONS$2) != 0;
            }
        }
        
        /**
         * Sets the "row-actions" element
         */
        public void setRowActions(com.kyt.xsd.widgetform.RowActionsDocument.RowActions rowActions)
        {
            generatedSetterHelperImpl(rowActions, ROWACTIONS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "row-actions" element
         */
        public com.kyt.xsd.widgetform.RowActionsDocument.RowActions addNewRowActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.RowActionsDocument.RowActions target = null;
                target = (com.kyt.xsd.widgetform.RowActionsDocument.RowActions)get_store().add_element_user(ROWACTIONS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "row-actions" element
         */
        public void unsetRowActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROWACTIONS$2, 0);
            }
        }
        
        /**
         * Gets array of all "alt-row-style" elements
         */
        public com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle[] getAltRowStyleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALTROWSTYLE$4, targetList);
                com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle[] result = new com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "alt-row-style" element
         */
        public com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle getAltRowStyleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle target = null;
                target = (com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle)get_store().find_element_user(ALTROWSTYLE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "alt-row-style" element
         */
        public int sizeOfAltRowStyleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTROWSTYLE$4);
            }
        }
        
        /**
         * Sets array of all "alt-row-style" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAltRowStyleArray(com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle[] altRowStyleArray)
        {
            check_orphaned();
            arraySetterHelper(altRowStyleArray, ALTROWSTYLE$4);
        }
        
        /**
         * Sets ith "alt-row-style" element
         */
        public void setAltRowStyleArray(int i, com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle altRowStyle)
        {
            generatedSetterHelperImpl(altRowStyle, ALTROWSTYLE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alt-row-style" element
         */
        public com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle insertNewAltRowStyle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle target = null;
                target = (com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle)get_store().insert_element_user(ALTROWSTYLE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alt-row-style" element
         */
        public com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle addNewAltRowStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle target = null;
                target = (com.kyt.xsd.widgetform.AltRowStyleDocument.AltRowStyle)get_store().add_element_user(ALTROWSTYLE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "alt-row-style" element
         */
        public void removeAltRowStyle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTROWSTYLE$4, i);
            }
        }
        
        /**
         * Gets array of all "alt-target" elements
         */
        public com.kyt.xsd.widgetform.AltTargetDocument.AltTarget[] getAltTargetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALTTARGET$6, targetList);
                com.kyt.xsd.widgetform.AltTargetDocument.AltTarget[] result = new com.kyt.xsd.widgetform.AltTargetDocument.AltTarget[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "alt-target" element
         */
        public com.kyt.xsd.widgetform.AltTargetDocument.AltTarget getAltTargetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AltTargetDocument.AltTarget target = null;
                target = (com.kyt.xsd.widgetform.AltTargetDocument.AltTarget)get_store().find_element_user(ALTTARGET$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "alt-target" element
         */
        public int sizeOfAltTargetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALTTARGET$6);
            }
        }
        
        /**
         * Sets array of all "alt-target" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAltTargetArray(com.kyt.xsd.widgetform.AltTargetDocument.AltTarget[] altTargetArray)
        {
            check_orphaned();
            arraySetterHelper(altTargetArray, ALTTARGET$6);
        }
        
        /**
         * Sets ith "alt-target" element
         */
        public void setAltTargetArray(int i, com.kyt.xsd.widgetform.AltTargetDocument.AltTarget altTarget)
        {
            generatedSetterHelperImpl(altTarget, ALTTARGET$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alt-target" element
         */
        public com.kyt.xsd.widgetform.AltTargetDocument.AltTarget insertNewAltTarget(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AltTargetDocument.AltTarget target = null;
                target = (com.kyt.xsd.widgetform.AltTargetDocument.AltTarget)get_store().insert_element_user(ALTTARGET$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alt-target" element
         */
        public com.kyt.xsd.widgetform.AltTargetDocument.AltTarget addNewAltTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AltTargetDocument.AltTarget target = null;
                target = (com.kyt.xsd.widgetform.AltTargetDocument.AltTarget)get_store().add_element_user(ALTTARGET$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "alt-target" element
         */
        public void removeAltTarget(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALTTARGET$6, i);
            }
        }
        
        /**
         * Gets array of all "auto-fields-service" elements
         */
        public com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService[] getAutoFieldsServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AUTOFIELDSSERVICE$8, targetList);
                com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService[] result = new com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "auto-fields-service" element
         */
        public com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService getAutoFieldsServiceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService target = null;
                target = (com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService)get_store().find_element_user(AUTOFIELDSSERVICE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "auto-fields-service" element
         */
        public int sizeOfAutoFieldsServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AUTOFIELDSSERVICE$8);
            }
        }
        
        /**
         * Sets array of all "auto-fields-service" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAutoFieldsServiceArray(com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService[] autoFieldsServiceArray)
        {
            check_orphaned();
            arraySetterHelper(autoFieldsServiceArray, AUTOFIELDSSERVICE$8);
        }
        
        /**
         * Sets ith "auto-fields-service" element
         */
        public void setAutoFieldsServiceArray(int i, com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService autoFieldsService)
        {
            generatedSetterHelperImpl(autoFieldsService, AUTOFIELDSSERVICE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "auto-fields-service" element
         */
        public com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService insertNewAutoFieldsService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService target = null;
                target = (com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService)get_store().insert_element_user(AUTOFIELDSSERVICE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "auto-fields-service" element
         */
        public com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService addNewAutoFieldsService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService target = null;
                target = (com.kyt.xsd.widgetform.AutoFieldsServiceDocument.AutoFieldsService)get_store().add_element_user(AUTOFIELDSSERVICE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "auto-fields-service" element
         */
        public void removeAutoFieldsService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AUTOFIELDSSERVICE$8, i);
            }
        }
        
        /**
         * Gets array of all "auto-fields-entity" elements
         */
        public com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity[] getAutoFieldsEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AUTOFIELDSENTITY$10, targetList);
                com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity[] result = new com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "auto-fields-entity" element
         */
        public com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity getAutoFieldsEntityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity target = null;
                target = (com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity)get_store().find_element_user(AUTOFIELDSENTITY$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "auto-fields-entity" element
         */
        public int sizeOfAutoFieldsEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AUTOFIELDSENTITY$10);
            }
        }
        
        /**
         * Sets array of all "auto-fields-entity" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAutoFieldsEntityArray(com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity[] autoFieldsEntityArray)
        {
            check_orphaned();
            arraySetterHelper(autoFieldsEntityArray, AUTOFIELDSENTITY$10);
        }
        
        /**
         * Sets ith "auto-fields-entity" element
         */
        public void setAutoFieldsEntityArray(int i, com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity autoFieldsEntity)
        {
            generatedSetterHelperImpl(autoFieldsEntity, AUTOFIELDSENTITY$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "auto-fields-entity" element
         */
        public com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity insertNewAutoFieldsEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity target = null;
                target = (com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity)get_store().insert_element_user(AUTOFIELDSENTITY$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "auto-fields-entity" element
         */
        public com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity addNewAutoFieldsEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity target = null;
                target = (com.kyt.xsd.widgetform.AutoFieldsEntityDocument.AutoFieldsEntity)get_store().add_element_user(AUTOFIELDSENTITY$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "auto-fields-entity" element
         */
        public void removeAutoFieldsEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AUTOFIELDSENTITY$10, i);
            }
        }
        
        /**
         * Gets array of all "field" elements
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field[] getFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELD$12, targetList);
                com.kyt.xsd.widgetform.FieldDocument.Field[] result = new com.kyt.xsd.widgetform.FieldDocument.Field[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "field" element
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field getFieldArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldDocument.Field target = null;
                target = (com.kyt.xsd.widgetform.FieldDocument.Field)get_store().find_element_user(FIELD$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "field" element
         */
        public int sizeOfFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELD$12);
            }
        }
        
        /**
         * Sets array of all "field" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFieldArray(com.kyt.xsd.widgetform.FieldDocument.Field[] fieldArray)
        {
            check_orphaned();
            arraySetterHelper(fieldArray, FIELD$12);
        }
        
        /**
         * Sets ith "field" element
         */
        public void setFieldArray(int i, com.kyt.xsd.widgetform.FieldDocument.Field field)
        {
            generatedSetterHelperImpl(field, FIELD$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field" element
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field insertNewField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldDocument.Field target = null;
                target = (com.kyt.xsd.widgetform.FieldDocument.Field)get_store().insert_element_user(FIELD$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field" element
         */
        public com.kyt.xsd.widgetform.FieldDocument.Field addNewField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldDocument.Field target = null;
                target = (com.kyt.xsd.widgetform.FieldDocument.Field)get_store().add_element_user(FIELD$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "field" element
         */
        public void removeField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELD$12, i);
            }
        }
        
        /**
         * Gets array of all "on-event-update-area" elements
         */
        public com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea[] getOnEventUpdateAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ONEVENTUPDATEAREA$14, targetList);
                com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea[] result = new com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "on-event-update-area" element
         */
        public com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea getOnEventUpdateAreaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea target = null;
                target = (com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea)get_store().find_element_user(ONEVENTUPDATEAREA$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "on-event-update-area" element
         */
        public int sizeOfOnEventUpdateAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ONEVENTUPDATEAREA$14);
            }
        }
        
        /**
         * Sets array of all "on-event-update-area" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOnEventUpdateAreaArray(com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea[] onEventUpdateAreaArray)
        {
            check_orphaned();
            arraySetterHelper(onEventUpdateAreaArray, ONEVENTUPDATEAREA$14);
        }
        
        /**
         * Sets ith "on-event-update-area" element
         */
        public void setOnEventUpdateAreaArray(int i, com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea onEventUpdateArea)
        {
            generatedSetterHelperImpl(onEventUpdateArea, ONEVENTUPDATEAREA$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "on-event-update-area" element
         */
        public com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea insertNewOnEventUpdateArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea target = null;
                target = (com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea)get_store().insert_element_user(ONEVENTUPDATEAREA$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "on-event-update-area" element
         */
        public com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea addNewOnEventUpdateArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea target = null;
                target = (com.kyt.xsd.widgetform.OnEventUpdateAreaDocument.OnEventUpdateArea)get_store().add_element_user(ONEVENTUPDATEAREA$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "on-event-update-area" element
         */
        public void removeOnEventUpdateArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ONEVENTUPDATEAREA$14, i);
            }
        }
        
        /**
         * Gets the "sort-order" element
         */
        public com.kyt.xsd.widgetform.SortOrderDocument.SortOrder getSortOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SortOrderDocument.SortOrder target = null;
                target = (com.kyt.xsd.widgetform.SortOrderDocument.SortOrder)get_store().find_element_user(SORTORDER$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "sort-order" element
         */
        public boolean isSetSortOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SORTORDER$16) != 0;
            }
        }
        
        /**
         * Sets the "sort-order" element
         */
        public void setSortOrder(com.kyt.xsd.widgetform.SortOrderDocument.SortOrder sortOrder)
        {
            generatedSetterHelperImpl(sortOrder, SORTORDER$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "sort-order" element
         */
        public com.kyt.xsd.widgetform.SortOrderDocument.SortOrder addNewSortOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SortOrderDocument.SortOrder target = null;
                target = (com.kyt.xsd.widgetform.SortOrderDocument.SortOrder)get_store().add_element_user(SORTORDER$16);
                return target;
            }
        }
        
        /**
         * Unsets the "sort-order" element
         */
        public void unsetSortOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SORTORDER$16, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$18);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$18);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$20);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FormDocument.Form.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.Type target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.Type)get_store().find_attribute_user(TYPE$20);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$20) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.kyt.xsd.widgetform.FormDocument.Form.Type.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$20);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(com.kyt.xsd.widgetform.FormDocument.Form.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.Type target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.Type)get_store().find_attribute_user(TYPE$20);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.Type)get_store().add_attribute_user(TYPE$20);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$20);
            }
        }
        
        /**
         * Gets the "target" attribute
         */
        public java.lang.String getTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "target" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$22);
                return target;
            }
        }
        
        /**
         * True if has "target" attribute
         */
        public boolean isSetTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGET$22) != null;
            }
        }
        
        /**
         * Sets the "target" attribute
         */
        public void setTarget(java.lang.String targetValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGET$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGET$22);
                }
                target.setStringValue(targetValue);
            }
        }
        
        /**
         * Sets (as xml) the "target" attribute
         */
        public void xsetTarget(org.apache.xmlbeans.XmlString targetValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGET$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGET$22);
                }
                target.set(targetValue);
            }
        }
        
        /**
         * Unsets the "target" attribute
         */
        public void unsetTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGET$22);
            }
        }
        
        /**
         * Gets the "target-window" attribute
         */
        public java.lang.String getTargetWindow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETWINDOW$24);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "target-window" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTargetWindow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGETWINDOW$24);
                return target;
            }
        }
        
        /**
         * True if has "target-window" attribute
         */
        public boolean isSetTargetWindow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGETWINDOW$24) != null;
            }
        }
        
        /**
         * Sets the "target-window" attribute
         */
        public void setTargetWindow(java.lang.String targetWindow)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETWINDOW$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETWINDOW$24);
                }
                target.setStringValue(targetWindow);
            }
        }
        
        /**
         * Sets (as xml) the "target-window" attribute
         */
        public void xsetTargetWindow(org.apache.xmlbeans.XmlString targetWindow)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TARGETWINDOW$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TARGETWINDOW$24);
                }
                target.set(targetWindow);
            }
        }
        
        /**
         * Unsets the "target-window" attribute
         */
        public void unsetTargetWindow()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGETWINDOW$24);
            }
        }
        
        /**
         * Gets the "target-type" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.TargetType.Enum getTargetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETTYPE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TARGETTYPE$26);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FormDocument.Form.TargetType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "target-type" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.TargetType xgetTargetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.TargetType target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.TargetType)get_store().find_attribute_user(TARGETTYPE$26);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.TargetType)get_default_attribute_value(TARGETTYPE$26);
                }
                return target;
            }
        }
        
        /**
         * True if has "target-type" attribute
         */
        public boolean isSetTargetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TARGETTYPE$26) != null;
            }
        }
        
        /**
         * Sets the "target-type" attribute
         */
        public void setTargetType(com.kyt.xsd.widgetform.FormDocument.Form.TargetType.Enum targetType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETTYPE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETTYPE$26);
                }
                target.setEnumValue(targetType);
            }
        }
        
        /**
         * Sets (as xml) the "target-type" attribute
         */
        public void xsetTargetType(com.kyt.xsd.widgetform.FormDocument.Form.TargetType targetType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.TargetType target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.TargetType)get_store().find_attribute_user(TARGETTYPE$26);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.TargetType)get_store().add_attribute_user(TARGETTYPE$26);
                }
                target.set(targetType);
            }
        }
        
        /**
         * Unsets the "target-type" attribute
         */
        public void unsetTargetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TARGETTYPE$26);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$28);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$28) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$28);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$28);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$28);
            }
        }
        
        /**
         * Gets the "style" attribute
         */
        public java.lang.String getStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$30);
                return target;
            }
        }
        
        /**
         * True if has "style" attribute
         */
        public boolean isSetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STYLE$30) != null;
            }
        }
        
        /**
         * Sets the "style" attribute
         */
        public void setStyle(java.lang.String style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLE$30);
                }
                target.setStringValue(style);
            }
        }
        
        /**
         * Sets (as xml) the "style" attribute
         */
        public void xsetStyle(org.apache.xmlbeans.XmlString style)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(STYLE$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(STYLE$30);
                }
                target.set(style);
            }
        }
        
        /**
         * Unsets the "style" attribute
         */
        public void unsetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STYLE$30);
            }
        }
        
        /**
         * Gets the "focus-field-name" attribute
         */
        public java.lang.String getFocusFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOCUSFIELDNAME$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "focus-field-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFocusFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FOCUSFIELDNAME$32);
                return target;
            }
        }
        
        /**
         * True if has "focus-field-name" attribute
         */
        public boolean isSetFocusFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FOCUSFIELDNAME$32) != null;
            }
        }
        
        /**
         * Sets the "focus-field-name" attribute
         */
        public void setFocusFieldName(java.lang.String focusFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOCUSFIELDNAME$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOCUSFIELDNAME$32);
                }
                target.setStringValue(focusFieldName);
            }
        }
        
        /**
         * Sets (as xml) the "focus-field-name" attribute
         */
        public void xsetFocusFieldName(org.apache.xmlbeans.XmlString focusFieldName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FOCUSFIELDNAME$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FOCUSFIELDNAME$32);
                }
                target.set(focusFieldName);
            }
        }
        
        /**
         * Unsets the "focus-field-name" attribute
         */
        public void unsetFocusFieldName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FOCUSFIELDNAME$32);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$34);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$34);
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
                return get_store().find_attribute_user(TITLE$34) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$34);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$34);
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
                get_store().remove_attribute(TITLE$34);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOOLTIP$36);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOOLTIP$36);
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
                return get_store().find_attribute_user(TOOLTIP$36) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOOLTIP$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOOLTIP$36);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TOOLTIP$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TOOLTIP$36);
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
                get_store().remove_attribute(TOOLTIP$36);
            }
        }
        
        /**
         * Gets the "list-name" attribute
         */
        public java.lang.String getListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTNAME$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "list-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTNAME$38);
                return target;
            }
        }
        
        /**
         * True if has "list-name" attribute
         */
        public boolean isSetListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LISTNAME$38) != null;
            }
        }
        
        /**
         * Sets the "list-name" attribute
         */
        public void setListName(java.lang.String listName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTNAME$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTNAME$38);
                }
                target.setStringValue(listName);
            }
        }
        
        /**
         * Sets (as xml) the "list-name" attribute
         */
        public void xsetListName(org.apache.xmlbeans.XmlString listName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTNAME$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LISTNAME$38);
                }
                target.set(listName);
            }
        }
        
        /**
         * Unsets the "list-name" attribute
         */
        public void unsetListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LISTNAME$38);
            }
        }
        
        /**
         * Gets the "list-entry-name" attribute
         */
        public java.lang.String getListEntryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTENTRYNAME$40);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "list-entry-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetListEntryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTENTRYNAME$40);
                return target;
            }
        }
        
        /**
         * True if has "list-entry-name" attribute
         */
        public boolean isSetListEntryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LISTENTRYNAME$40) != null;
            }
        }
        
        /**
         * Sets the "list-entry-name" attribute
         */
        public void setListEntryName(java.lang.String listEntryName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTENTRYNAME$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTENTRYNAME$40);
                }
                target.setStringValue(listEntryName);
            }
        }
        
        /**
         * Sets (as xml) the "list-entry-name" attribute
         */
        public void xsetListEntryName(org.apache.xmlbeans.XmlString listEntryName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LISTENTRYNAME$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LISTENTRYNAME$40);
                }
                target.set(listEntryName);
            }
        }
        
        /**
         * Unsets the "list-entry-name" attribute
         */
        public void unsetListEntryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LISTENTRYNAME$40);
            }
        }
        
        /**
         * Gets the "default-map-name" attribute
         */
        public java.lang.String getDefaultMapName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTMAPNAME$42);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-map-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultMapName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTMAPNAME$42);
                return target;
            }
        }
        
        /**
         * True if has "default-map-name" attribute
         */
        public boolean isSetDefaultMapName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTMAPNAME$42) != null;
            }
        }
        
        /**
         * Sets the "default-map-name" attribute
         */
        public void setDefaultMapName(java.lang.String defaultMapName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTMAPNAME$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTMAPNAME$42);
                }
                target.setStringValue(defaultMapName);
            }
        }
        
        /**
         * Sets (as xml) the "default-map-name" attribute
         */
        public void xsetDefaultMapName(org.apache.xmlbeans.XmlString defaultMapName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTMAPNAME$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTMAPNAME$42);
                }
                target.set(defaultMapName);
            }
        }
        
        /**
         * Unsets the "default-map-name" attribute
         */
        public void unsetDefaultMapName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTMAPNAME$42);
            }
        }
        
        /**
         * Gets the "default-entity-name" attribute
         */
        public java.lang.String getDefaultEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTENTITYNAME$44);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-entity-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTENTITYNAME$44);
                return target;
            }
        }
        
        /**
         * True if has "default-entity-name" attribute
         */
        public boolean isSetDefaultEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTENTITYNAME$44) != null;
            }
        }
        
        /**
         * Sets the "default-entity-name" attribute
         */
        public void setDefaultEntityName(java.lang.String defaultEntityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTENTITYNAME$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTENTITYNAME$44);
                }
                target.setStringValue(defaultEntityName);
            }
        }
        
        /**
         * Sets (as xml) the "default-entity-name" attribute
         */
        public void xsetDefaultEntityName(org.apache.xmlbeans.XmlString defaultEntityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTENTITYNAME$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTENTITYNAME$44);
                }
                target.set(defaultEntityName);
            }
        }
        
        /**
         * Unsets the "default-entity-name" attribute
         */
        public void unsetDefaultEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTENTITYNAME$44);
            }
        }
        
        /**
         * Gets the "default-service-name" attribute
         */
        public java.lang.String getDefaultServiceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSERVICENAME$46);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-service-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultServiceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTSERVICENAME$46);
                return target;
            }
        }
        
        /**
         * True if has "default-service-name" attribute
         */
        public boolean isSetDefaultServiceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTSERVICENAME$46) != null;
            }
        }
        
        /**
         * Sets the "default-service-name" attribute
         */
        public void setDefaultServiceName(java.lang.String defaultServiceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSERVICENAME$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTSERVICENAME$46);
                }
                target.setStringValue(defaultServiceName);
            }
        }
        
        /**
         * Sets (as xml) the "default-service-name" attribute
         */
        public void xsetDefaultServiceName(org.apache.xmlbeans.XmlString defaultServiceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTSERVICENAME$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTSERVICENAME$46);
                }
                target.set(defaultServiceName);
            }
        }
        
        /**
         * Unsets the "default-service-name" attribute
         */
        public void unsetDefaultServiceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTSERVICENAME$46);
            }
        }
        
        /**
         * Gets the "form-title-area-style" attribute
         */
        public java.lang.String getFormTitleAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMTITLEAREASTYLE$48);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "form-title-area-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFormTitleAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMTITLEAREASTYLE$48);
                return target;
            }
        }
        
        /**
         * True if has "form-title-area-style" attribute
         */
        public boolean isSetFormTitleAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FORMTITLEAREASTYLE$48) != null;
            }
        }
        
        /**
         * Sets the "form-title-area-style" attribute
         */
        public void setFormTitleAreaStyle(java.lang.String formTitleAreaStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMTITLEAREASTYLE$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMTITLEAREASTYLE$48);
                }
                target.setStringValue(formTitleAreaStyle);
            }
        }
        
        /**
         * Sets (as xml) the "form-title-area-style" attribute
         */
        public void xsetFormTitleAreaStyle(org.apache.xmlbeans.XmlString formTitleAreaStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMTITLEAREASTYLE$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMTITLEAREASTYLE$48);
                }
                target.set(formTitleAreaStyle);
            }
        }
        
        /**
         * Unsets the "form-title-area-style" attribute
         */
        public void unsetFormTitleAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FORMTITLEAREASTYLE$48);
            }
        }
        
        /**
         * Gets the "form-widget-area-style" attribute
         */
        public java.lang.String getFormWidgetAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMWIDGETAREASTYLE$50);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "form-widget-area-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFormWidgetAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMWIDGETAREASTYLE$50);
                return target;
            }
        }
        
        /**
         * True if has "form-widget-area-style" attribute
         */
        public boolean isSetFormWidgetAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FORMWIDGETAREASTYLE$50) != null;
            }
        }
        
        /**
         * Sets the "form-widget-area-style" attribute
         */
        public void setFormWidgetAreaStyle(java.lang.String formWidgetAreaStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMWIDGETAREASTYLE$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMWIDGETAREASTYLE$50);
                }
                target.setStringValue(formWidgetAreaStyle);
            }
        }
        
        /**
         * Sets (as xml) the "form-widget-area-style" attribute
         */
        public void xsetFormWidgetAreaStyle(org.apache.xmlbeans.XmlString formWidgetAreaStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMWIDGETAREASTYLE$50);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMWIDGETAREASTYLE$50);
                }
                target.set(formWidgetAreaStyle);
            }
        }
        
        /**
         * Unsets the "form-widget-area-style" attribute
         */
        public void unsetFormWidgetAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FORMWIDGETAREASTYLE$50);
            }
        }
        
        /**
         * Gets the "default-title-area-style" attribute
         */
        public java.lang.String getDefaultTitleAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTITLEAREASTYLE$52);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-title-area-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultTitleAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTITLEAREASTYLE$52);
                return target;
            }
        }
        
        /**
         * True if has "default-title-area-style" attribute
         */
        public boolean isSetDefaultTitleAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTTITLEAREASTYLE$52) != null;
            }
        }
        
        /**
         * Sets the "default-title-area-style" attribute
         */
        public void setDefaultTitleAreaStyle(java.lang.String defaultTitleAreaStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTITLEAREASTYLE$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTTITLEAREASTYLE$52);
                }
                target.setStringValue(defaultTitleAreaStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-title-area-style" attribute
         */
        public void xsetDefaultTitleAreaStyle(org.apache.xmlbeans.XmlString defaultTitleAreaStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTITLEAREASTYLE$52);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTTITLEAREASTYLE$52);
                }
                target.set(defaultTitleAreaStyle);
            }
        }
        
        /**
         * Unsets the "default-title-area-style" attribute
         */
        public void unsetDefaultTitleAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTTITLEAREASTYLE$52);
            }
        }
        
        /**
         * Gets the "default-widget-area-style" attribute
         */
        public java.lang.String getDefaultWidgetAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTWIDGETAREASTYLE$54);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-widget-area-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultWidgetAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTWIDGETAREASTYLE$54);
                return target;
            }
        }
        
        /**
         * True if has "default-widget-area-style" attribute
         */
        public boolean isSetDefaultWidgetAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTWIDGETAREASTYLE$54) != null;
            }
        }
        
        /**
         * Sets the "default-widget-area-style" attribute
         */
        public void setDefaultWidgetAreaStyle(java.lang.String defaultWidgetAreaStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTWIDGETAREASTYLE$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTWIDGETAREASTYLE$54);
                }
                target.setStringValue(defaultWidgetAreaStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-widget-area-style" attribute
         */
        public void xsetDefaultWidgetAreaStyle(org.apache.xmlbeans.XmlString defaultWidgetAreaStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTWIDGETAREASTYLE$54);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTWIDGETAREASTYLE$54);
                }
                target.set(defaultWidgetAreaStyle);
            }
        }
        
        /**
         * Unsets the "default-widget-area-style" attribute
         */
        public void unsetDefaultWidgetAreaStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTWIDGETAREASTYLE$54);
            }
        }
        
        /**
         * Gets the "default-title-style" attribute
         */
        public java.lang.String getDefaultTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTITLESTYLE$56);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-title-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTITLESTYLE$56);
                return target;
            }
        }
        
        /**
         * True if has "default-title-style" attribute
         */
        public boolean isSetDefaultTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTTITLESTYLE$56) != null;
            }
        }
        
        /**
         * Sets the "default-title-style" attribute
         */
        public void setDefaultTitleStyle(java.lang.String defaultTitleStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTITLESTYLE$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTTITLESTYLE$56);
                }
                target.setStringValue(defaultTitleStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-title-style" attribute
         */
        public void xsetDefaultTitleStyle(org.apache.xmlbeans.XmlString defaultTitleStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTITLESTYLE$56);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTTITLESTYLE$56);
                }
                target.set(defaultTitleStyle);
            }
        }
        
        /**
         * Unsets the "default-title-style" attribute
         */
        public void unsetDefaultTitleStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTTITLESTYLE$56);
            }
        }
        
        /**
         * Gets the "default-widget-style" attribute
         */
        public java.lang.String getDefaultWidgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTWIDGETSTYLE$58);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-widget-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultWidgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTWIDGETSTYLE$58);
                return target;
            }
        }
        
        /**
         * True if has "default-widget-style" attribute
         */
        public boolean isSetDefaultWidgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTWIDGETSTYLE$58) != null;
            }
        }
        
        /**
         * Sets the "default-widget-style" attribute
         */
        public void setDefaultWidgetStyle(java.lang.String defaultWidgetStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTWIDGETSTYLE$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTWIDGETSTYLE$58);
                }
                target.setStringValue(defaultWidgetStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-widget-style" attribute
         */
        public void xsetDefaultWidgetStyle(org.apache.xmlbeans.XmlString defaultWidgetStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTWIDGETSTYLE$58);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTWIDGETSTYLE$58);
                }
                target.set(defaultWidgetStyle);
            }
        }
        
        /**
         * Unsets the "default-widget-style" attribute
         */
        public void unsetDefaultWidgetStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTWIDGETSTYLE$58);
            }
        }
        
        /**
         * Gets the "default-tooltip-style" attribute
         */
        public java.lang.String getDefaultTooltipStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTOOLTIPSTYLE$60);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-tooltip-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultTooltipStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTOOLTIPSTYLE$60);
                return target;
            }
        }
        
        /**
         * True if has "default-tooltip-style" attribute
         */
        public boolean isSetDefaultTooltipStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTTOOLTIPSTYLE$60) != null;
            }
        }
        
        /**
         * Sets the "default-tooltip-style" attribute
         */
        public void setDefaultTooltipStyle(java.lang.String defaultTooltipStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTOOLTIPSTYLE$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTTOOLTIPSTYLE$60);
                }
                target.setStringValue(defaultTooltipStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-tooltip-style" attribute
         */
        public void xsetDefaultTooltipStyle(org.apache.xmlbeans.XmlString defaultTooltipStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTOOLTIPSTYLE$60);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTTOOLTIPSTYLE$60);
                }
                target.set(defaultTooltipStyle);
            }
        }
        
        /**
         * Unsets the "default-tooltip-style" attribute
         */
        public void unsetDefaultTooltipStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTTOOLTIPSTYLE$60);
            }
        }
        
        /**
         * Gets the "default-required-field-style" attribute
         */
        public java.lang.String getDefaultRequiredFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTREQUIREDFIELDSTYLE$62);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-required-field-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultRequiredFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTREQUIREDFIELDSTYLE$62);
                return target;
            }
        }
        
        /**
         * True if has "default-required-field-style" attribute
         */
        public boolean isSetDefaultRequiredFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTREQUIREDFIELDSTYLE$62) != null;
            }
        }
        
        /**
         * Sets the "default-required-field-style" attribute
         */
        public void setDefaultRequiredFieldStyle(java.lang.String defaultRequiredFieldStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTREQUIREDFIELDSTYLE$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTREQUIREDFIELDSTYLE$62);
                }
                target.setStringValue(defaultRequiredFieldStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-required-field-style" attribute
         */
        public void xsetDefaultRequiredFieldStyle(org.apache.xmlbeans.XmlString defaultRequiredFieldStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTREQUIREDFIELDSTYLE$62);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTREQUIREDFIELDSTYLE$62);
                }
                target.set(defaultRequiredFieldStyle);
            }
        }
        
        /**
         * Unsets the "default-required-field-style" attribute
         */
        public void unsetDefaultRequiredFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTREQUIREDFIELDSTYLE$62);
            }
        }
        
        /**
         * Gets the "default-sort-field-style" attribute
         */
        public java.lang.String getDefaultSortFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSORTFIELDSTYLE$64);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-sort-field-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultSortFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTSORTFIELDSTYLE$64);
                return target;
            }
        }
        
        /**
         * True if has "default-sort-field-style" attribute
         */
        public boolean isSetDefaultSortFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTSORTFIELDSTYLE$64) != null;
            }
        }
        
        /**
         * Sets the "default-sort-field-style" attribute
         */
        public void setDefaultSortFieldStyle(java.lang.String defaultSortFieldStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSORTFIELDSTYLE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTSORTFIELDSTYLE$64);
                }
                target.setStringValue(defaultSortFieldStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-sort-field-style" attribute
         */
        public void xsetDefaultSortFieldStyle(org.apache.xmlbeans.XmlString defaultSortFieldStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTSORTFIELDSTYLE$64);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTSORTFIELDSTYLE$64);
                }
                target.set(defaultSortFieldStyle);
            }
        }
        
        /**
         * Unsets the "default-sort-field-style" attribute
         */
        public void unsetDefaultSortFieldStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTSORTFIELDSTYLE$64);
            }
        }
        
        /**
         * Gets the "default-sort-field-asc-style" attribute
         */
        public java.lang.String getDefaultSortFieldAscStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSORTFIELDASCSTYLE$66);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-sort-field-asc-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultSortFieldAscStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTSORTFIELDASCSTYLE$66);
                return target;
            }
        }
        
        /**
         * True if has "default-sort-field-asc-style" attribute
         */
        public boolean isSetDefaultSortFieldAscStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTSORTFIELDASCSTYLE$66) != null;
            }
        }
        
        /**
         * Sets the "default-sort-field-asc-style" attribute
         */
        public void setDefaultSortFieldAscStyle(java.lang.String defaultSortFieldAscStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSORTFIELDASCSTYLE$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTSORTFIELDASCSTYLE$66);
                }
                target.setStringValue(defaultSortFieldAscStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-sort-field-asc-style" attribute
         */
        public void xsetDefaultSortFieldAscStyle(org.apache.xmlbeans.XmlString defaultSortFieldAscStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTSORTFIELDASCSTYLE$66);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTSORTFIELDASCSTYLE$66);
                }
                target.set(defaultSortFieldAscStyle);
            }
        }
        
        /**
         * Unsets the "default-sort-field-asc-style" attribute
         */
        public void unsetDefaultSortFieldAscStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTSORTFIELDASCSTYLE$66);
            }
        }
        
        /**
         * Gets the "default-sort-field-desc-style" attribute
         */
        public java.lang.String getDefaultSortFieldDescStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSORTFIELDDESCSTYLE$68);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-sort-field-desc-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultSortFieldDescStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTSORTFIELDDESCSTYLE$68);
                return target;
            }
        }
        
        /**
         * True if has "default-sort-field-desc-style" attribute
         */
        public boolean isSetDefaultSortFieldDescStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTSORTFIELDDESCSTYLE$68) != null;
            }
        }
        
        /**
         * Sets the "default-sort-field-desc-style" attribute
         */
        public void setDefaultSortFieldDescStyle(java.lang.String defaultSortFieldDescStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTSORTFIELDDESCSTYLE$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTSORTFIELDDESCSTYLE$68);
                }
                target.setStringValue(defaultSortFieldDescStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-sort-field-desc-style" attribute
         */
        public void xsetDefaultSortFieldDescStyle(org.apache.xmlbeans.XmlString defaultSortFieldDescStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTSORTFIELDDESCSTYLE$68);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTSORTFIELDDESCSTYLE$68);
                }
                target.set(defaultSortFieldDescStyle);
            }
        }
        
        /**
         * Unsets the "default-sort-field-desc-style" attribute
         */
        public void unsetDefaultSortFieldDescStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTSORTFIELDDESCSTYLE$68);
            }
        }
        
        /**
         * Gets the "paginate" attribute
         */
        public java.lang.String getPaginate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATE$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PAGINATE$70);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paginate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPaginate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATE$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(PAGINATE$70);
                }
                return target;
            }
        }
        
        /**
         * True if has "paginate" attribute
         */
        public boolean isSetPaginate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGINATE$70) != null;
            }
        }
        
        /**
         * Sets the "paginate" attribute
         */
        public void setPaginate(java.lang.String paginate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATE$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINATE$70);
                }
                target.setStringValue(paginate);
            }
        }
        
        /**
         * Sets (as xml) the "paginate" attribute
         */
        public void xsetPaginate(org.apache.xmlbeans.XmlString paginate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATE$70);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGINATE$70);
                }
                target.set(paginate);
            }
        }
        
        /**
         * Unsets the "paginate" attribute
         */
        public void unsetPaginate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGINATE$70);
            }
        }
        
        /**
         * Gets the "paginate-target" attribute
         */
        public java.lang.String getPaginateTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATETARGET$72);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paginate-target" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPaginateTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATETARGET$72);
                return target;
            }
        }
        
        /**
         * True if has "paginate-target" attribute
         */
        public boolean isSetPaginateTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGINATETARGET$72) != null;
            }
        }
        
        /**
         * Sets the "paginate-target" attribute
         */
        public void setPaginateTarget(java.lang.String paginateTarget)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATETARGET$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINATETARGET$72);
                }
                target.setStringValue(paginateTarget);
            }
        }
        
        /**
         * Sets (as xml) the "paginate-target" attribute
         */
        public void xsetPaginateTarget(org.apache.xmlbeans.XmlString paginateTarget)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATETARGET$72);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGINATETARGET$72);
                }
                target.set(paginateTarget);
            }
        }
        
        /**
         * Unsets the "paginate-target" attribute
         */
        public void unsetPaginateTarget()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGINATETARGET$72);
            }
        }
        
        /**
         * Gets the "paginate-target-anchor" attribute
         */
        public java.lang.String getPaginateTargetAnchor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATETARGETANCHOR$74);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paginate-target-anchor" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPaginateTargetAnchor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATETARGETANCHOR$74);
                return target;
            }
        }
        
        /**
         * True if has "paginate-target-anchor" attribute
         */
        public boolean isSetPaginateTargetAnchor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGINATETARGETANCHOR$74) != null;
            }
        }
        
        /**
         * Sets the "paginate-target-anchor" attribute
         */
        public void setPaginateTargetAnchor(java.lang.String paginateTargetAnchor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATETARGETANCHOR$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINATETARGETANCHOR$74);
                }
                target.setStringValue(paginateTargetAnchor);
            }
        }
        
        /**
         * Sets (as xml) the "paginate-target-anchor" attribute
         */
        public void xsetPaginateTargetAnchor(org.apache.xmlbeans.XmlString paginateTargetAnchor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATETARGETANCHOR$74);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGINATETARGETANCHOR$74);
                }
                target.set(paginateTargetAnchor);
            }
        }
        
        /**
         * Unsets the "paginate-target-anchor" attribute
         */
        public void unsetPaginateTargetAnchor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGINATETARGETANCHOR$74);
            }
        }
        
        /**
         * Gets the "paginate-size-field" attribute
         */
        public java.lang.String getPaginateSizeField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATESIZEFIELD$76);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paginate-size-field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPaginateSizeField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATESIZEFIELD$76);
                return target;
            }
        }
        
        /**
         * True if has "paginate-size-field" attribute
         */
        public boolean isSetPaginateSizeField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGINATESIZEFIELD$76) != null;
            }
        }
        
        /**
         * Sets the "paginate-size-field" attribute
         */
        public void setPaginateSizeField(java.lang.String paginateSizeField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATESIZEFIELD$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINATESIZEFIELD$76);
                }
                target.setStringValue(paginateSizeField);
            }
        }
        
        /**
         * Sets (as xml) the "paginate-size-field" attribute
         */
        public void xsetPaginateSizeField(org.apache.xmlbeans.XmlString paginateSizeField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATESIZEFIELD$76);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGINATESIZEFIELD$76);
                }
                target.set(paginateSizeField);
            }
        }
        
        /**
         * Unsets the "paginate-size-field" attribute
         */
        public void unsetPaginateSizeField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGINATESIZEFIELD$76);
            }
        }
        
        /**
         * Gets the "paginate-index-field" attribute
         */
        public java.lang.String getPaginateIndexField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATEINDEXFIELD$78);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paginate-index-field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPaginateIndexField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATEINDEXFIELD$78);
                return target;
            }
        }
        
        /**
         * True if has "paginate-index-field" attribute
         */
        public boolean isSetPaginateIndexField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGINATEINDEXFIELD$78) != null;
            }
        }
        
        /**
         * Sets the "paginate-index-field" attribute
         */
        public void setPaginateIndexField(java.lang.String paginateIndexField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATEINDEXFIELD$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINATEINDEXFIELD$78);
                }
                target.setStringValue(paginateIndexField);
            }
        }
        
        /**
         * Sets (as xml) the "paginate-index-field" attribute
         */
        public void xsetPaginateIndexField(org.apache.xmlbeans.XmlString paginateIndexField)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATEINDEXFIELD$78);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGINATEINDEXFIELD$78);
                }
                target.set(paginateIndexField);
            }
        }
        
        /**
         * Unsets the "paginate-index-field" attribute
         */
        public void unsetPaginateIndexField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGINATEINDEXFIELD$78);
            }
        }
        
        /**
         * Gets the "override-list-size" attribute
         */
        public java.lang.String getOverrideListSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERRIDELISTSIZE$80);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "override-list-size" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOverrideListSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OVERRIDELISTSIZE$80);
                return target;
            }
        }
        
        /**
         * True if has "override-list-size" attribute
         */
        public boolean isSetOverrideListSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OVERRIDELISTSIZE$80) != null;
            }
        }
        
        /**
         * Sets the "override-list-size" attribute
         */
        public void setOverrideListSize(java.lang.String overrideListSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OVERRIDELISTSIZE$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OVERRIDELISTSIZE$80);
                }
                target.setStringValue(overrideListSize);
            }
        }
        
        /**
         * Sets (as xml) the "override-list-size" attribute
         */
        public void xsetOverrideListSize(org.apache.xmlbeans.XmlString overrideListSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OVERRIDELISTSIZE$80);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OVERRIDELISTSIZE$80);
                }
                target.set(overrideListSize);
            }
        }
        
        /**
         * Unsets the "override-list-size" attribute
         */
        public void unsetOverrideListSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OVERRIDELISTSIZE$80);
            }
        }
        
        /**
         * Gets the "paginate-first-label" attribute
         */
        public java.lang.String getPaginateFirstLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATEFIRSTLABEL$82);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paginate-first-label" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPaginateFirstLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATEFIRSTLABEL$82);
                return target;
            }
        }
        
        /**
         * True if has "paginate-first-label" attribute
         */
        public boolean isSetPaginateFirstLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGINATEFIRSTLABEL$82) != null;
            }
        }
        
        /**
         * Sets the "paginate-first-label" attribute
         */
        public void setPaginateFirstLabel(java.lang.String paginateFirstLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATEFIRSTLABEL$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINATEFIRSTLABEL$82);
                }
                target.setStringValue(paginateFirstLabel);
            }
        }
        
        /**
         * Sets (as xml) the "paginate-first-label" attribute
         */
        public void xsetPaginateFirstLabel(org.apache.xmlbeans.XmlString paginateFirstLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATEFIRSTLABEL$82);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGINATEFIRSTLABEL$82);
                }
                target.set(paginateFirstLabel);
            }
        }
        
        /**
         * Unsets the "paginate-first-label" attribute
         */
        public void unsetPaginateFirstLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGINATEFIRSTLABEL$82);
            }
        }
        
        /**
         * Gets the "paginate-previous-label" attribute
         */
        public java.lang.String getPaginatePreviousLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATEPREVIOUSLABEL$84);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paginate-previous-label" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPaginatePreviousLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATEPREVIOUSLABEL$84);
                return target;
            }
        }
        
        /**
         * True if has "paginate-previous-label" attribute
         */
        public boolean isSetPaginatePreviousLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGINATEPREVIOUSLABEL$84) != null;
            }
        }
        
        /**
         * Sets the "paginate-previous-label" attribute
         */
        public void setPaginatePreviousLabel(java.lang.String paginatePreviousLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATEPREVIOUSLABEL$84);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINATEPREVIOUSLABEL$84);
                }
                target.setStringValue(paginatePreviousLabel);
            }
        }
        
        /**
         * Sets (as xml) the "paginate-previous-label" attribute
         */
        public void xsetPaginatePreviousLabel(org.apache.xmlbeans.XmlString paginatePreviousLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATEPREVIOUSLABEL$84);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGINATEPREVIOUSLABEL$84);
                }
                target.set(paginatePreviousLabel);
            }
        }
        
        /**
         * Unsets the "paginate-previous-label" attribute
         */
        public void unsetPaginatePreviousLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGINATEPREVIOUSLABEL$84);
            }
        }
        
        /**
         * Gets the "paginate-next-label" attribute
         */
        public java.lang.String getPaginateNextLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATENEXTLABEL$86);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paginate-next-label" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPaginateNextLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATENEXTLABEL$86);
                return target;
            }
        }
        
        /**
         * True if has "paginate-next-label" attribute
         */
        public boolean isSetPaginateNextLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGINATENEXTLABEL$86) != null;
            }
        }
        
        /**
         * Sets the "paginate-next-label" attribute
         */
        public void setPaginateNextLabel(java.lang.String paginateNextLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATENEXTLABEL$86);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINATENEXTLABEL$86);
                }
                target.setStringValue(paginateNextLabel);
            }
        }
        
        /**
         * Sets (as xml) the "paginate-next-label" attribute
         */
        public void xsetPaginateNextLabel(org.apache.xmlbeans.XmlString paginateNextLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATENEXTLABEL$86);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGINATENEXTLABEL$86);
                }
                target.set(paginateNextLabel);
            }
        }
        
        /**
         * Unsets the "paginate-next-label" attribute
         */
        public void unsetPaginateNextLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGINATENEXTLABEL$86);
            }
        }
        
        /**
         * Gets the "paginate-last-label" attribute
         */
        public java.lang.String getPaginateLastLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATELASTLABEL$88);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paginate-last-label" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPaginateLastLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATELASTLABEL$88);
                return target;
            }
        }
        
        /**
         * True if has "paginate-last-label" attribute
         */
        public boolean isSetPaginateLastLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGINATELASTLABEL$88) != null;
            }
        }
        
        /**
         * Sets the "paginate-last-label" attribute
         */
        public void setPaginateLastLabel(java.lang.String paginateLastLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATELASTLABEL$88);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINATELASTLABEL$88);
                }
                target.setStringValue(paginateLastLabel);
            }
        }
        
        /**
         * Sets (as xml) the "paginate-last-label" attribute
         */
        public void xsetPaginateLastLabel(org.apache.xmlbeans.XmlString paginateLastLabel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATELASTLABEL$88);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGINATELASTLABEL$88);
                }
                target.set(paginateLastLabel);
            }
        }
        
        /**
         * Unsets the "paginate-last-label" attribute
         */
        public void unsetPaginateLastLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGINATELASTLABEL$88);
            }
        }
        
        /**
         * Gets the "paginate-style" attribute
         */
        public java.lang.String getPaginateStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATESTYLE$90);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "paginate-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPaginateStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATESTYLE$90);
                return target;
            }
        }
        
        /**
         * True if has "paginate-style" attribute
         */
        public boolean isSetPaginateStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PAGINATESTYLE$90) != null;
            }
        }
        
        /**
         * Sets the "paginate-style" attribute
         */
        public void setPaginateStyle(java.lang.String paginateStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PAGINATESTYLE$90);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PAGINATESTYLE$90);
                }
                target.setStringValue(paginateStyle);
            }
        }
        
        /**
         * Sets (as xml) the "paginate-style" attribute
         */
        public void xsetPaginateStyle(org.apache.xmlbeans.XmlString paginateStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PAGINATESTYLE$90);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PAGINATESTYLE$90);
                }
                target.set(paginateStyle);
            }
        }
        
        /**
         * Unsets the "paginate-style" attribute
         */
        public void unsetPaginateStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PAGINATESTYLE$90);
            }
        }
        
        /**
         * Gets the "item-index-separator" attribute
         */
        public java.lang.String getItemIndexSeparator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMINDEXSEPARATOR$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ITEMINDEXSEPARATOR$92);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "item-index-separator" attribute
         */
        public org.apache.xmlbeans.XmlString xgetItemIndexSeparator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ITEMINDEXSEPARATOR$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(ITEMINDEXSEPARATOR$92);
                }
                return target;
            }
        }
        
        /**
         * True if has "item-index-separator" attribute
         */
        public boolean isSetItemIndexSeparator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ITEMINDEXSEPARATOR$92) != null;
            }
        }
        
        /**
         * Sets the "item-index-separator" attribute
         */
        public void setItemIndexSeparator(java.lang.String itemIndexSeparator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMINDEXSEPARATOR$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITEMINDEXSEPARATOR$92);
                }
                target.setStringValue(itemIndexSeparator);
            }
        }
        
        /**
         * Sets (as xml) the "item-index-separator" attribute
         */
        public void xsetItemIndexSeparator(org.apache.xmlbeans.XmlString itemIndexSeparator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ITEMINDEXSEPARATOR$92);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ITEMINDEXSEPARATOR$92);
                }
                target.set(itemIndexSeparator);
            }
        }
        
        /**
         * Unsets the "item-index-separator" attribute
         */
        public void unsetItemIndexSeparator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ITEMINDEXSEPARATOR$92);
            }
        }
        
        /**
         * Gets the "extends" attribute
         */
        public java.lang.String getExtends()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDS$94);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "extends" attribute
         */
        public org.apache.xmlbeans.XmlString xgetExtends()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXTENDS$94);
                return target;
            }
        }
        
        /**
         * True if has "extends" attribute
         */
        public boolean isSetExtends()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXTENDS$94) != null;
            }
        }
        
        /**
         * Sets the "extends" attribute
         */
        public void setExtends(java.lang.String xextends)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDS$94);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENDS$94);
                }
                target.setStringValue(xextends);
            }
        }
        
        /**
         * Sets (as xml) the "extends" attribute
         */
        public void xsetExtends(org.apache.xmlbeans.XmlString xextends)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXTENDS$94);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXTENDS$94);
                }
                target.set(xextends);
            }
        }
        
        /**
         * Unsets the "extends" attribute
         */
        public void unsetExtends()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXTENDS$94);
            }
        }
        
        /**
         * Gets the "extends-resource" attribute
         */
        public java.lang.String getExtendsResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDSRESOURCE$96);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "extends-resource" attribute
         */
        public org.apache.xmlbeans.XmlString xgetExtendsResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXTENDSRESOURCE$96);
                return target;
            }
        }
        
        /**
         * True if has "extends-resource" attribute
         */
        public boolean isSetExtendsResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXTENDSRESOURCE$96) != null;
            }
        }
        
        /**
         * Sets the "extends-resource" attribute
         */
        public void setExtendsResource(java.lang.String extendsResource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENDSRESOURCE$96);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENDSRESOURCE$96);
                }
                target.setStringValue(extendsResource);
            }
        }
        
        /**
         * Sets (as xml) the "extends-resource" attribute
         */
        public void xsetExtendsResource(org.apache.xmlbeans.XmlString extendsResource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EXTENDSRESOURCE$96);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EXTENDSRESOURCE$96);
                }
                target.set(extendsResource);
            }
        }
        
        /**
         * Unsets the "extends-resource" attribute
         */
        public void unsetExtendsResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXTENDSRESOURCE$96);
            }
        }
        
        /**
         * Gets the "separate-columns" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns.Enum getSeparateColumns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEPARATECOLUMNS$98);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SEPARATECOLUMNS$98);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "separate-columns" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns xgetSeparateColumns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns)get_store().find_attribute_user(SEPARATECOLUMNS$98);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns)get_default_attribute_value(SEPARATECOLUMNS$98);
                }
                return target;
            }
        }
        
        /**
         * True if has "separate-columns" attribute
         */
        public boolean isSetSeparateColumns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SEPARATECOLUMNS$98) != null;
            }
        }
        
        /**
         * Sets the "separate-columns" attribute
         */
        public void setSeparateColumns(com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns.Enum separateColumns)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEPARATECOLUMNS$98);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEPARATECOLUMNS$98);
                }
                target.setEnumValue(separateColumns);
            }
        }
        
        /**
         * Sets (as xml) the "separate-columns" attribute
         */
        public void xsetSeparateColumns(com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns separateColumns)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns)get_store().find_attribute_user(SEPARATECOLUMNS$98);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns)get_store().add_attribute_user(SEPARATECOLUMNS$98);
                }
                target.set(separateColumns);
            }
        }
        
        /**
         * Unsets the "separate-columns" attribute
         */
        public void unsetSeparateColumns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SEPARATECOLUMNS$98);
            }
        }
        
        /**
         * Gets the "group-columns" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns.Enum getGroupColumns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPCOLUMNS$100);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GROUPCOLUMNS$100);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "group-columns" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns xgetGroupColumns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns)get_store().find_attribute_user(GROUPCOLUMNS$100);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns)get_default_attribute_value(GROUPCOLUMNS$100);
                }
                return target;
            }
        }
        
        /**
         * True if has "group-columns" attribute
         */
        public boolean isSetGroupColumns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GROUPCOLUMNS$100) != null;
            }
        }
        
        /**
         * Sets the "group-columns" attribute
         */
        public void setGroupColumns(com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns.Enum groupColumns)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPCOLUMNS$100);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUPCOLUMNS$100);
                }
                target.setEnumValue(groupColumns);
            }
        }
        
        /**
         * Sets (as xml) the "group-columns" attribute
         */
        public void xsetGroupColumns(com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns groupColumns)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns)get_store().find_attribute_user(GROUPCOLUMNS$100);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns)get_store().add_attribute_user(GROUPCOLUMNS$100);
                }
                target.set(groupColumns);
            }
        }
        
        /**
         * Unsets the "group-columns" attribute
         */
        public void unsetGroupColumns()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GROUPCOLUMNS$100);
            }
        }
        
        /**
         * Gets the "view-size" attribute
         */
        public java.math.BigInteger getViewSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWSIZE$102);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "view-size" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetViewSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIEWSIZE$102);
                return target;
            }
        }
        
        /**
         * True if has "view-size" attribute
         */
        public boolean isSetViewSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VIEWSIZE$102) != null;
            }
        }
        
        /**
         * Sets the "view-size" attribute
         */
        public void setViewSize(java.math.BigInteger viewSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VIEWSIZE$102);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VIEWSIZE$102);
                }
                target.setBigIntegerValue(viewSize);
            }
        }
        
        /**
         * Sets (as xml) the "view-size" attribute
         */
        public void xsetViewSize(org.apache.xmlbeans.XmlInteger viewSize)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(VIEWSIZE$102);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(VIEWSIZE$102);
                }
                target.set(viewSize);
            }
        }
        
        /**
         * Unsets the "view-size" attribute
         */
        public void unsetViewSize()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VIEWSIZE$102);
            }
        }
        
        /**
         * Gets the "row-count" attribute
         */
        public java.lang.String getRowCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWCOUNT$104);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "row-count" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRowCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROWCOUNT$104);
                return target;
            }
        }
        
        /**
         * True if has "row-count" attribute
         */
        public boolean isSetRowCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROWCOUNT$104) != null;
            }
        }
        
        /**
         * Sets the "row-count" attribute
         */
        public void setRowCount(java.lang.String rowCount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWCOUNT$104);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWCOUNT$104);
                }
                target.setStringValue(rowCount);
            }
        }
        
        /**
         * Sets (as xml) the "row-count" attribute
         */
        public void xsetRowCount(org.apache.xmlbeans.XmlString rowCount)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROWCOUNT$104);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROWCOUNT$104);
                }
                target.set(rowCount);
            }
        }
        
        /**
         * Unsets the "row-count" attribute
         */
        public void unsetRowCount()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROWCOUNT$104);
            }
        }
        
        /**
         * Gets the "use-row-submit" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit.Enum getUseRowSubmit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEROWSUBMIT$106);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USEROWSUBMIT$106);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "use-row-submit" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit xgetUseRowSubmit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit)get_store().find_attribute_user(USEROWSUBMIT$106);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit)get_default_attribute_value(USEROWSUBMIT$106);
                }
                return target;
            }
        }
        
        /**
         * True if has "use-row-submit" attribute
         */
        public boolean isSetUseRowSubmit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USEROWSUBMIT$106) != null;
            }
        }
        
        /**
         * Sets the "use-row-submit" attribute
         */
        public void setUseRowSubmit(com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit.Enum useRowSubmit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEROWSUBMIT$106);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEROWSUBMIT$106);
                }
                target.setEnumValue(useRowSubmit);
            }
        }
        
        /**
         * Sets (as xml) the "use-row-submit" attribute
         */
        public void xsetUseRowSubmit(com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit useRowSubmit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit)get_store().find_attribute_user(USEROWSUBMIT$106);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit)get_store().add_attribute_user(USEROWSUBMIT$106);
                }
                target.set(useRowSubmit);
            }
        }
        
        /**
         * Unsets the "use-row-submit" attribute
         */
        public void unsetUseRowSubmit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USEROWSUBMIT$106);
            }
        }
        
        /**
         * Gets the "skip-start" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.SkipStart.Enum getSkipStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPSTART$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SKIPSTART$108);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FormDocument.Form.SkipStart.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "skip-start" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.SkipStart xgetSkipStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.SkipStart target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.SkipStart)get_store().find_attribute_user(SKIPSTART$108);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.SkipStart)get_default_attribute_value(SKIPSTART$108);
                }
                return target;
            }
        }
        
        /**
         * True if has "skip-start" attribute
         */
        public boolean isSetSkipStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SKIPSTART$108) != null;
            }
        }
        
        /**
         * Sets the "skip-start" attribute
         */
        public void setSkipStart(com.kyt.xsd.widgetform.FormDocument.Form.SkipStart.Enum skipStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPSTART$108);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SKIPSTART$108);
                }
                target.setEnumValue(skipStart);
            }
        }
        
        /**
         * Sets (as xml) the "skip-start" attribute
         */
        public void xsetSkipStart(com.kyt.xsd.widgetform.FormDocument.Form.SkipStart skipStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.SkipStart target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.SkipStart)get_store().find_attribute_user(SKIPSTART$108);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.SkipStart)get_store().add_attribute_user(SKIPSTART$108);
                }
                target.set(skipStart);
            }
        }
        
        /**
         * Unsets the "skip-start" attribute
         */
        public void unsetSkipStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SKIPSTART$108);
            }
        }
        
        /**
         * Gets the "skip-end" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd.Enum getSkipEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPEND$110);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SKIPEND$110);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "skip-end" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd xgetSkipEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd)get_store().find_attribute_user(SKIPEND$110);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd)get_default_attribute_value(SKIPEND$110);
                }
                return target;
            }
        }
        
        /**
         * True if has "skip-end" attribute
         */
        public boolean isSetSkipEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SKIPEND$110) != null;
            }
        }
        
        /**
         * Sets the "skip-end" attribute
         */
        public void setSkipEnd(com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd.Enum skipEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SKIPEND$110);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SKIPEND$110);
                }
                target.setEnumValue(skipEnd);
            }
        }
        
        /**
         * Sets (as xml) the "skip-end" attribute
         */
        public void xsetSkipEnd(com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd skipEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd)get_store().find_attribute_user(SKIPEND$110);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd)get_store().add_attribute_user(SKIPEND$110);
                }
                target.set(skipEnd);
            }
        }
        
        /**
         * Unsets the "skip-end" attribute
         */
        public void unsetSkipEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SKIPEND$110);
            }
        }
        
        /**
         * Gets the "hide-header" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.HideHeader.Enum getHideHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDEHEADER$112);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HIDEHEADER$112);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FormDocument.Form.HideHeader.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "hide-header" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.HideHeader xgetHideHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.HideHeader target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.HideHeader)get_store().find_attribute_user(HIDEHEADER$112);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.HideHeader)get_default_attribute_value(HIDEHEADER$112);
                }
                return target;
            }
        }
        
        /**
         * True if has "hide-header" attribute
         */
        public boolean isSetHideHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HIDEHEADER$112) != null;
            }
        }
        
        /**
         * Sets the "hide-header" attribute
         */
        public void setHideHeader(com.kyt.xsd.widgetform.FormDocument.Form.HideHeader.Enum hideHeader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDEHEADER$112);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDEHEADER$112);
                }
                target.setEnumValue(hideHeader);
            }
        }
        
        /**
         * Sets (as xml) the "hide-header" attribute
         */
        public void xsetHideHeader(com.kyt.xsd.widgetform.FormDocument.Form.HideHeader hideHeader)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.HideHeader target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.HideHeader)get_store().find_attribute_user(HIDEHEADER$112);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.HideHeader)get_store().add_attribute_user(HIDEHEADER$112);
                }
                target.set(hideHeader);
            }
        }
        
        /**
         * Unsets the "hide-header" attribute
         */
        public void unsetHideHeader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HIDEHEADER$112);
            }
        }
        
        /**
         * Gets the "odd-row-style" attribute
         */
        public java.lang.String getOddRowStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ODDROWSTYLE$114);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "odd-row-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOddRowStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ODDROWSTYLE$114);
                return target;
            }
        }
        
        /**
         * True if has "odd-row-style" attribute
         */
        public boolean isSetOddRowStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ODDROWSTYLE$114) != null;
            }
        }
        
        /**
         * Sets the "odd-row-style" attribute
         */
        public void setOddRowStyle(java.lang.String oddRowStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ODDROWSTYLE$114);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ODDROWSTYLE$114);
                }
                target.setStringValue(oddRowStyle);
            }
        }
        
        /**
         * Sets (as xml) the "odd-row-style" attribute
         */
        public void xsetOddRowStyle(org.apache.xmlbeans.XmlString oddRowStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ODDROWSTYLE$114);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ODDROWSTYLE$114);
                }
                target.set(oddRowStyle);
            }
        }
        
        /**
         * Unsets the "odd-row-style" attribute
         */
        public void unsetOddRowStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ODDROWSTYLE$114);
            }
        }
        
        /**
         * Gets the "even-row-style" attribute
         */
        public java.lang.String getEvenRowStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENROWSTYLE$116);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "even-row-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEvenRowStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVENROWSTYLE$116);
                return target;
            }
        }
        
        /**
         * True if has "even-row-style" attribute
         */
        public boolean isSetEvenRowStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EVENROWSTYLE$116) != null;
            }
        }
        
        /**
         * Sets the "even-row-style" attribute
         */
        public void setEvenRowStyle(java.lang.String evenRowStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EVENROWSTYLE$116);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EVENROWSTYLE$116);
                }
                target.setStringValue(evenRowStyle);
            }
        }
        
        /**
         * Sets (as xml) the "even-row-style" attribute
         */
        public void xsetEvenRowStyle(org.apache.xmlbeans.XmlString evenRowStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EVENROWSTYLE$116);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EVENROWSTYLE$116);
                }
                target.set(evenRowStyle);
            }
        }
        
        /**
         * Unsets the "even-row-style" attribute
         */
        public void unsetEvenRowStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EVENROWSTYLE$116);
            }
        }
        
        /**
         * Gets the "header-row-style" attribute
         */
        public java.lang.String getHeaderRowStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWSTYLE$118);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "header-row-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHeaderRowStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADERROWSTYLE$118);
                return target;
            }
        }
        
        /**
         * True if has "header-row-style" attribute
         */
        public boolean isSetHeaderRowStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HEADERROWSTYLE$118) != null;
            }
        }
        
        /**
         * Sets the "header-row-style" attribute
         */
        public void setHeaderRowStyle(java.lang.String headerRowStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERROWSTYLE$118);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERROWSTYLE$118);
                }
                target.setStringValue(headerRowStyle);
            }
        }
        
        /**
         * Sets (as xml) the "header-row-style" attribute
         */
        public void xsetHeaderRowStyle(org.apache.xmlbeans.XmlString headerRowStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADERROWSTYLE$118);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEADERROWSTYLE$118);
                }
                target.set(headerRowStyle);
            }
        }
        
        /**
         * Unsets the "header-row-style" attribute
         */
        public void unsetHeaderRowStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HEADERROWSTYLE$118);
            }
        }
        
        /**
         * Gets the "default-table-style" attribute
         */
        public java.lang.String getDefaultTableStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTABLESTYLE$120);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-table-style" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultTableStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTABLESTYLE$120);
                return target;
            }
        }
        
        /**
         * True if has "default-table-style" attribute
         */
        public boolean isSetDefaultTableStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTTABLESTYLE$120) != null;
            }
        }
        
        /**
         * Sets the "default-table-style" attribute
         */
        public void setDefaultTableStyle(java.lang.String defaultTableStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTTABLESTYLE$120);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTTABLESTYLE$120);
                }
                target.setStringValue(defaultTableStyle);
            }
        }
        
        /**
         * Sets (as xml) the "default-table-style" attribute
         */
        public void xsetDefaultTableStyle(org.apache.xmlbeans.XmlString defaultTableStyle)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTTABLESTYLE$120);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTTABLESTYLE$120);
                }
                target.set(defaultTableStyle);
            }
        }
        
        /**
         * Unsets the "default-table-style" attribute
         */
        public void unsetDefaultTableStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTTABLESTYLE$120);
            }
        }
        
        /**
         * Gets the "client-autocomplete-fields" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields.Enum getClientAutocompleteFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTAUTOCOMPLETEFIELDS$122);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLIENTAUTOCOMPLETEFIELDS$122);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "client-autocomplete-fields" attribute
         */
        public com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields xgetClientAutocompleteFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields)get_store().find_attribute_user(CLIENTAUTOCOMPLETEFIELDS$122);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields)get_default_attribute_value(CLIENTAUTOCOMPLETEFIELDS$122);
                }
                return target;
            }
        }
        
        /**
         * True if has "client-autocomplete-fields" attribute
         */
        public boolean isSetClientAutocompleteFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLIENTAUTOCOMPLETEFIELDS$122) != null;
            }
        }
        
        /**
         * Sets the "client-autocomplete-fields" attribute
         */
        public void setClientAutocompleteFields(com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields.Enum clientAutocompleteFields)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLIENTAUTOCOMPLETEFIELDS$122);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLIENTAUTOCOMPLETEFIELDS$122);
                }
                target.setEnumValue(clientAutocompleteFields);
            }
        }
        
        /**
         * Sets (as xml) the "client-autocomplete-fields" attribute
         */
        public void xsetClientAutocompleteFields(com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields clientAutocompleteFields)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields target = null;
                target = (com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields)get_store().find_attribute_user(CLIENTAUTOCOMPLETEFIELDS$122);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields)get_store().add_attribute_user(CLIENTAUTOCOMPLETEFIELDS$122);
                }
                target.set(clientAutocompleteFields);
            }
        }
        
        /**
         * Unsets the "client-autocomplete-fields" attribute
         */
        public void unsetClientAutocompleteFields()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLIENTAUTOCOMPLETEFIELDS$122);
            }
        }
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FormDocument.Form.Type
        {
            private static final long serialVersionUID = 1L;
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML target-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$TargetType.
         */
        public static class TargetTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FormDocument.Form.TargetType
        {
            private static final long serialVersionUID = 1L;
            
            public TargetTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TargetTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML separate-columns(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$SeparateColumns.
         */
        public static class SeparateColumnsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FormDocument.Form.SeparateColumns
        {
            private static final long serialVersionUID = 1L;
            
            public SeparateColumnsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SeparateColumnsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML group-columns(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$GroupColumns.
         */
        public static class GroupColumnsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FormDocument.Form.GroupColumns
        {
            private static final long serialVersionUID = 1L;
            
            public GroupColumnsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected GroupColumnsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML use-row-submit(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$UseRowSubmit.
         */
        public static class UseRowSubmitImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FormDocument.Form.UseRowSubmit
        {
            private static final long serialVersionUID = 1L;
            
            public UseRowSubmitImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UseRowSubmitImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML skip-start(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$SkipStart.
         */
        public static class SkipStartImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FormDocument.Form.SkipStart
        {
            private static final long serialVersionUID = 1L;
            
            public SkipStartImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SkipStartImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML skip-end(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$SkipEnd.
         */
        public static class SkipEndImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FormDocument.Form.SkipEnd
        {
            private static final long serialVersionUID = 1L;
            
            public SkipEndImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SkipEndImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML hide-header(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$HideHeader.
         */
        public static class HideHeaderImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FormDocument.Form.HideHeader
        {
            private static final long serialVersionUID = 1L;
            
            public HideHeaderImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected HideHeaderImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML client-autocomplete-fields(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.FormDocument$Form$ClientAutocompleteFields.
         */
        public static class ClientAutocompleteFieldsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.FormDocument.Form.ClientAutocompleteFields
        {
            private static final long serialVersionUID = 1L;
            
            public ClientAutocompleteFieldsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ClientAutocompleteFieldsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
