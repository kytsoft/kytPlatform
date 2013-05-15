/*
 * An XML document type.
 * Localname: menu
 * Namespace: 
 * Java type: com.kyt.xsd.widgetmenu.MenuDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetmenu;


/**
 * A document containing one menu(@) element.
 *
 * This is a complex type.
 */
public interface MenuDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MenuDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("menu3958doctype");
    
    /**
     * Gets the "menu" element
     */
    com.kyt.xsd.widgetmenu.MenuDocument.Menu getMenu();
    
    /**
     * Sets the "menu" element
     */
    void setMenu(com.kyt.xsd.widgetmenu.MenuDocument.Menu menu);
    
    /**
     * Appends and returns a new empty "menu" element
     */
    com.kyt.xsd.widgetmenu.MenuDocument.Menu addNewMenu();
    
    /**
     * An XML menu(@).
     *
     * This is a complex type.
     */
    public interface Menu extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Menu.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("menu6f0delemtype");
        
        /**
         * Gets the "actions" element
         */
        com.kyt.xsd.widgetmenu.ActionsDocument.Actions getActions();
        
        /**
         * True if has "actions" element
         */
        boolean isSetActions();
        
        /**
         * Sets the "actions" element
         */
        void setActions(com.kyt.xsd.widgetmenu.ActionsDocument.Actions actions);
        
        /**
         * Appends and returns a new empty "actions" element
         */
        com.kyt.xsd.widgetmenu.ActionsDocument.Actions addNewActions();
        
        /**
         * Unsets the "actions" element
         */
        void unsetActions();
        
        /**
         * Gets array of all "menu-item" elements
         */
        com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem[] getMenuItemArray();
        
        /**
         * Gets ith "menu-item" element
         */
        com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem getMenuItemArray(int i);
        
        /**
         * Returns number of "menu-item" element
         */
        int sizeOfMenuItemArray();
        
        /**
         * Sets array of all "menu-item" element
         */
        void setMenuItemArray(com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem[] menuItemArray);
        
        /**
         * Sets ith "menu-item" element
         */
        void setMenuItemArray(int i, com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem menuItem);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "menu-item" element
         */
        com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem insertNewMenuItem(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "menu-item" element
         */
        com.kyt.xsd.widgetmenu.MenuItemDocument.MenuItem addNewMenuItem();
        
        /**
         * Removes the ith "menu-item" element
         */
        void removeMenuItem(int i);
        
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
        com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
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
         * Gets the "default-selected-style" attribute
         */
        java.lang.String getDefaultSelectedStyle();
        
        /**
         * Gets (as xml) the "default-selected-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultSelectedStyle();
        
        /**
         * True if has "default-selected-style" attribute
         */
        boolean isSetDefaultSelectedStyle();
        
        /**
         * Sets the "default-selected-style" attribute
         */
        void setDefaultSelectedStyle(java.lang.String defaultSelectedStyle);
        
        /**
         * Sets (as xml) the "default-selected-style" attribute
         */
        void xsetDefaultSelectedStyle(org.apache.xmlbeans.XmlString defaultSelectedStyle);
        
        /**
         * Unsets the "default-selected-style" attribute
         */
        void unsetDefaultSelectedStyle();
        
        /**
         * Gets the "default-align-style" attribute
         */
        java.lang.String getDefaultAlignStyle();
        
        /**
         * Gets (as xml) the "default-align-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultAlignStyle();
        
        /**
         * True if has "default-align-style" attribute
         */
        boolean isSetDefaultAlignStyle();
        
        /**
         * Sets the "default-align-style" attribute
         */
        void setDefaultAlignStyle(java.lang.String defaultAlignStyle);
        
        /**
         * Sets (as xml) the "default-align-style" attribute
         */
        void xsetDefaultAlignStyle(org.apache.xmlbeans.XmlString defaultAlignStyle);
        
        /**
         * Unsets the "default-align-style" attribute
         */
        void unsetDefaultAlignStyle();
        
        /**
         * Gets the "orientation" attribute
         */
        com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation.Enum getOrientation();
        
        /**
         * Gets (as xml) the "orientation" attribute
         */
        com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation xgetOrientation();
        
        /**
         * True if has "orientation" attribute
         */
        boolean isSetOrientation();
        
        /**
         * Sets the "orientation" attribute
         */
        void setOrientation(com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation.Enum orientation);
        
        /**
         * Sets (as xml) the "orientation" attribute
         */
        void xsetOrientation(com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation orientation);
        
        /**
         * Unsets the "orientation" attribute
         */
        void unsetOrientation();
        
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
         * Gets the "default-menu-item-name" attribute
         */
        java.lang.String getDefaultMenuItemName();
        
        /**
         * Gets (as xml) the "default-menu-item-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultMenuItemName();
        
        /**
         * True if has "default-menu-item-name" attribute
         */
        boolean isSetDefaultMenuItemName();
        
        /**
         * Sets the "default-menu-item-name" attribute
         */
        void setDefaultMenuItemName(java.lang.String defaultMenuItemName);
        
        /**
         * Sets (as xml) the "default-menu-item-name" attribute
         */
        void xsetDefaultMenuItemName(org.apache.xmlbeans.XmlString defaultMenuItemName);
        
        /**
         * Unsets the "default-menu-item-name" attribute
         */
        void unsetDefaultMenuItemName();
        
        /**
         * Gets the "default-associated-content-id" attribute
         */
        java.lang.String getDefaultAssociatedContentId();
        
        /**
         * Gets (as xml) the "default-associated-content-id" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultAssociatedContentId();
        
        /**
         * True if has "default-associated-content-id" attribute
         */
        boolean isSetDefaultAssociatedContentId();
        
        /**
         * Sets the "default-associated-content-id" attribute
         */
        void setDefaultAssociatedContentId(java.lang.String defaultAssociatedContentId);
        
        /**
         * Sets (as xml) the "default-associated-content-id" attribute
         */
        void xsetDefaultAssociatedContentId(org.apache.xmlbeans.XmlString defaultAssociatedContentId);
        
        /**
         * Unsets the "default-associated-content-id" attribute
         */
        void unsetDefaultAssociatedContentId();
        
        /**
         * Gets the "default-hide-if-selected" attribute
         */
        com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected.Enum getDefaultHideIfSelected();
        
        /**
         * Gets (as xml) the "default-hide-if-selected" attribute
         */
        com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected xgetDefaultHideIfSelected();
        
        /**
         * True if has "default-hide-if-selected" attribute
         */
        boolean isSetDefaultHideIfSelected();
        
        /**
         * Sets the "default-hide-if-selected" attribute
         */
        void setDefaultHideIfSelected(com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected.Enum defaultHideIfSelected);
        
        /**
         * Sets (as xml) the "default-hide-if-selected" attribute
         */
        void xsetDefaultHideIfSelected(com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected defaultHideIfSelected);
        
        /**
         * Unsets the "default-hide-if-selected" attribute
         */
        void unsetDefaultHideIfSelected();
        
        /**
         * Gets the "menu-width" attribute
         */
        java.lang.String getMenuWidth();
        
        /**
         * Gets (as xml) the "menu-width" attribute
         */
        org.apache.xmlbeans.XmlString xgetMenuWidth();
        
        /**
         * True if has "menu-width" attribute
         */
        boolean isSetMenuWidth();
        
        /**
         * Sets the "menu-width" attribute
         */
        void setMenuWidth(java.lang.String menuWidth);
        
        /**
         * Sets (as xml) the "menu-width" attribute
         */
        void xsetMenuWidth(org.apache.xmlbeans.XmlString menuWidth);
        
        /**
         * Unsets the "menu-width" attribute
         */
        void unsetMenuWidth();
        
        /**
         * Gets the "default-cell-width" attribute
         */
        java.lang.String getDefaultCellWidth();
        
        /**
         * Gets (as xml) the "default-cell-width" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultCellWidth();
        
        /**
         * True if has "default-cell-width" attribute
         */
        boolean isSetDefaultCellWidth();
        
        /**
         * Sets the "default-cell-width" attribute
         */
        void setDefaultCellWidth(java.lang.String defaultCellWidth);
        
        /**
         * Sets (as xml) the "default-cell-width" attribute
         */
        void xsetDefaultCellWidth(org.apache.xmlbeans.XmlString defaultCellWidth);
        
        /**
         * Unsets the "default-cell-width" attribute
         */
        void unsetDefaultCellWidth();
        
        /**
         * Gets the "default-disabled-title-style" attribute
         */
        java.lang.String getDefaultDisabledTitleStyle();
        
        /**
         * Gets (as xml) the "default-disabled-title-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultDisabledTitleStyle();
        
        /**
         * True if has "default-disabled-title-style" attribute
         */
        boolean isSetDefaultDisabledTitleStyle();
        
        /**
         * Sets the "default-disabled-title-style" attribute
         */
        void setDefaultDisabledTitleStyle(java.lang.String defaultDisabledTitleStyle);
        
        /**
         * Sets (as xml) the "default-disabled-title-style" attribute
         */
        void xsetDefaultDisabledTitleStyle(org.apache.xmlbeans.XmlString defaultDisabledTitleStyle);
        
        /**
         * Unsets the "default-disabled-title-style" attribute
         */
        void unsetDefaultDisabledTitleStyle();
        
        /**
         * Gets the "selected-menuitem-context-field-name" attribute
         */
        java.lang.String getSelectedMenuitemContextFieldName();
        
        /**
         * Gets (as xml) the "selected-menuitem-context-field-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetSelectedMenuitemContextFieldName();
        
        /**
         * True if has "selected-menuitem-context-field-name" attribute
         */
        boolean isSetSelectedMenuitemContextFieldName();
        
        /**
         * Sets the "selected-menuitem-context-field-name" attribute
         */
        void setSelectedMenuitemContextFieldName(java.lang.String selectedMenuitemContextFieldName);
        
        /**
         * Sets (as xml) the "selected-menuitem-context-field-name" attribute
         */
        void xsetSelectedMenuitemContextFieldName(org.apache.xmlbeans.XmlString selectedMenuitemContextFieldName);
        
        /**
         * Unsets the "selected-menuitem-context-field-name" attribute
         */
        void unsetSelectedMenuitemContextFieldName();
        
        /**
         * Gets the "menu-container-style" attribute
         */
        java.lang.String getMenuContainerStyle();
        
        /**
         * Gets (as xml) the "menu-container-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetMenuContainerStyle();
        
        /**
         * True if has "menu-container-style" attribute
         */
        boolean isSetMenuContainerStyle();
        
        /**
         * Sets the "menu-container-style" attribute
         */
        void setMenuContainerStyle(java.lang.String menuContainerStyle);
        
        /**
         * Sets (as xml) the "menu-container-style" attribute
         */
        void xsetMenuContainerStyle(org.apache.xmlbeans.XmlString menuContainerStyle);
        
        /**
         * Unsets the "menu-container-style" attribute
         */
        void unsetMenuContainerStyle();
        
        /**
         * Gets the "default-align" attribute
         */
        com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign.Enum getDefaultAlign();
        
        /**
         * Gets (as xml) the "default-align" attribute
         */
        com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign xgetDefaultAlign();
        
        /**
         * True if has "default-align" attribute
         */
        boolean isSetDefaultAlign();
        
        /**
         * Sets the "default-align" attribute
         */
        void setDefaultAlign(com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign.Enum defaultAlign);
        
        /**
         * Sets (as xml) the "default-align" attribute
         */
        void xsetDefaultAlign(com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign defaultAlign);
        
        /**
         * Unsets the "default-align" attribute
         */
        void unsetDefaultAlign();
        
        /**
         * Gets the "fill-style" attribute
         */
        java.lang.String getFillStyle();
        
        /**
         * Gets (as xml) the "fill-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetFillStyle();
        
        /**
         * True if has "fill-style" attribute
         */
        boolean isSetFillStyle();
        
        /**
         * Sets the "fill-style" attribute
         */
        void setFillStyle(java.lang.String fillStyle);
        
        /**
         * Sets (as xml) the "fill-style" attribute
         */
        void xsetFillStyle(org.apache.xmlbeans.XmlString fillStyle);
        
        /**
         * Unsets the "fill-style" attribute
         */
        void unsetFillStyle();
        
        /**
         * Gets the "default-permission-operation" attribute
         */
        java.lang.String getDefaultPermissionOperation();
        
        /**
         * Gets (as xml) the "default-permission-operation" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultPermissionOperation();
        
        /**
         * True if has "default-permission-operation" attribute
         */
        boolean isSetDefaultPermissionOperation();
        
        /**
         * Sets the "default-permission-operation" attribute
         */
        void setDefaultPermissionOperation(java.lang.String defaultPermissionOperation);
        
        /**
         * Sets (as xml) the "default-permission-operation" attribute
         */
        void xsetDefaultPermissionOperation(org.apache.xmlbeans.XmlString defaultPermissionOperation);
        
        /**
         * Unsets the "default-permission-operation" attribute
         */
        void unsetDefaultPermissionOperation();
        
        /**
         * Gets the "default-permission-entity-action" attribute
         */
        java.lang.String getDefaultPermissionEntityAction();
        
        /**
         * Gets (as xml) the "default-permission-entity-action" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultPermissionEntityAction();
        
        /**
         * True if has "default-permission-entity-action" attribute
         */
        boolean isSetDefaultPermissionEntityAction();
        
        /**
         * Sets the "default-permission-entity-action" attribute
         */
        void setDefaultPermissionEntityAction(java.lang.String defaultPermissionEntityAction);
        
        /**
         * Sets (as xml) the "default-permission-entity-action" attribute
         */
        void xsetDefaultPermissionEntityAction(org.apache.xmlbeans.XmlString defaultPermissionEntityAction);
        
        /**
         * Unsets the "default-permission-entity-action" attribute
         */
        void unsetDefaultPermissionEntityAction();
        
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.MenuDocument$Menu$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("type32e7attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum SIMPLE = Enum.forString("simple");
            static final Enum CASCADE = Enum.forString("cascade");
            
            static final int INT_SIMPLE = Enum.INT_SIMPLE;
            static final int INT_CASCADE = Enum.INT_CASCADE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.MenuDocument$Menu$Type.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SIMPLE
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
                
                static final int INT_SIMPLE = 1;
                static final int INT_CASCADE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("simple", INT_SIMPLE),
                      new Enum("cascade", INT_CASCADE),
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
                public static com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type newInstance() {
                  return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML orientation(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.MenuDocument$Menu$Orientation.
         */
        public interface Orientation extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Orientation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("orientationb145attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum VERTICAL = Enum.forString("vertical");
            static final Enum HORIZONTAL = Enum.forString("horizontal");
            
            static final int INT_VERTICAL = Enum.INT_VERTICAL;
            static final int INT_HORIZONTAL = Enum.INT_HORIZONTAL;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.MenuDocument$Menu$Orientation.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_VERTICAL
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
                
                static final int INT_VERTICAL = 1;
                static final int INT_HORIZONTAL = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("vertical", INT_VERTICAL),
                      new Enum("horizontal", INT_HORIZONTAL),
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
                public static com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation newInstance() {
                  return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.Orientation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML default-hide-if-selected(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.MenuDocument$Menu$DefaultHideIfSelected.
         */
        public interface DefaultHideIfSelected extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DefaultHideIfSelected.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("defaulthideifselectedc579attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.MenuDocument$Menu$DefaultHideIfSelected.
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
                public static com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected newInstance() {
                  return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultHideIfSelected) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML default-align(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.MenuDocument$Menu$DefaultAlign.
         */
        public interface DefaultAlign extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DefaultAlign.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("defaultalign232eattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum LEFT = Enum.forString("left");
            static final Enum RIGHT = Enum.forString("right");
            
            static final int INT_LEFT = Enum.INT_LEFT;
            static final int INT_RIGHT = Enum.INT_RIGHT;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.MenuDocument$Menu$DefaultAlign.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LEFT
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
                
                static final int INT_LEFT = 1;
                static final int INT_RIGHT = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("left", INT_LEFT),
                      new Enum("right", INT_RIGHT),
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
                public static com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign newInstance() {
                  return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.MenuDocument.Menu.DefaultAlign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetmenu.MenuDocument.Menu newInstance() {
              return (com.kyt.xsd.widgetmenu.MenuDocument.Menu) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetmenu.MenuDocument.Menu newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetmenu.MenuDocument.Menu) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetmenu.MenuDocument newInstance() {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetmenu.MenuDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetmenu.MenuDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetmenu.MenuDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
