/*
 * An XML document type.
 * Localname: drop-down
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.DropDownDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one drop-down(@) element.
 *
 * This is a complex type.
 */
public interface DropDownDocument extends com.kyt.xsd.widgetform.AllFieldsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DropDownDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("dropdown8467doctype");
    
    /**
     * Gets the "drop-down" element
     */
    com.kyt.xsd.widgetform.DropDownDocument.DropDown getDropDown();
    
    /**
     * Sets the "drop-down" element
     */
    void setDropDown(com.kyt.xsd.widgetform.DropDownDocument.DropDown dropDown);
    
    /**
     * Appends and returns a new empty "drop-down" element
     */
    com.kyt.xsd.widgetform.DropDownDocument.DropDown addNewDropDown();
    
    /**
     * An XML drop-down(@).
     *
     * This is a complex type.
     */
    public interface DropDown extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DropDown.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("dropdowneda3elemtype");
        
        /**
         * Gets the "auto-complete" element
         */
        com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete getAutoComplete();
        
        /**
         * True if has "auto-complete" element
         */
        boolean isSetAutoComplete();
        
        /**
         * Sets the "auto-complete" element
         */
        void setAutoComplete(com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete autoComplete);
        
        /**
         * Appends and returns a new empty "auto-complete" element
         */
        com.kyt.xsd.widgetform.AutoCompleteDocument.AutoComplete addNewAutoComplete();
        
        /**
         * Unsets the "auto-complete" element
         */
        void unsetAutoComplete();
        
        /**
         * Gets array of all "entity-options" elements
         */
        com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions[] getEntityOptionsArray();
        
        /**
         * Gets ith "entity-options" element
         */
        com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions getEntityOptionsArray(int i);
        
        /**
         * Returns number of "entity-options" element
         */
        int sizeOfEntityOptionsArray();
        
        /**
         * Sets array of all "entity-options" element
         */
        void setEntityOptionsArray(com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions[] entityOptionsArray);
        
        /**
         * Sets ith "entity-options" element
         */
        void setEntityOptionsArray(int i, com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions entityOptions);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-options" element
         */
        com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions insertNewEntityOptions(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-options" element
         */
        com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions addNewEntityOptions();
        
        /**
         * Removes the ith "entity-options" element
         */
        void removeEntityOptions(int i);
        
        /**
         * Gets array of all "list-options" elements
         */
        com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions[] getListOptionsArray();
        
        /**
         * Gets ith "list-options" element
         */
        com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions getListOptionsArray(int i);
        
        /**
         * Returns number of "list-options" element
         */
        int sizeOfListOptionsArray();
        
        /**
         * Sets array of all "list-options" element
         */
        void setListOptionsArray(com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions[] listOptionsArray);
        
        /**
         * Sets ith "list-options" element
         */
        void setListOptionsArray(int i, com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions listOptions);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "list-options" element
         */
        com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions insertNewListOptions(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "list-options" element
         */
        com.kyt.xsd.widgetform.ListOptionsDocument.ListOptions addNewListOptions();
        
        /**
         * Removes the ith "list-options" element
         */
        void removeListOptions(int i);
        
        /**
         * Gets array of all "option" elements
         */
        com.kyt.xsd.widgetform.OptionDocument.Option[] getOptionArray();
        
        /**
         * Gets ith "option" element
         */
        com.kyt.xsd.widgetform.OptionDocument.Option getOptionArray(int i);
        
        /**
         * Returns number of "option" element
         */
        int sizeOfOptionArray();
        
        /**
         * Sets array of all "option" element
         */
        void setOptionArray(com.kyt.xsd.widgetform.OptionDocument.Option[] optionArray);
        
        /**
         * Sets ith "option" element
         */
        void setOptionArray(int i, com.kyt.xsd.widgetform.OptionDocument.Option option);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "option" element
         */
        com.kyt.xsd.widgetform.OptionDocument.Option insertNewOption(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "option" element
         */
        com.kyt.xsd.widgetform.OptionDocument.Option addNewOption();
        
        /**
         * Removes the ith "option" element
         */
        void removeOption(int i);
        
        /**
         * Gets the "sub-hyperlink" element
         */
        com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink getSubHyperlink();
        
        /**
         * True if has "sub-hyperlink" element
         */
        boolean isSetSubHyperlink();
        
        /**
         * Sets the "sub-hyperlink" element
         */
        void setSubHyperlink(com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink subHyperlink);
        
        /**
         * Appends and returns a new empty "sub-hyperlink" element
         */
        com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink addNewSubHyperlink();
        
        /**
         * Unsets the "sub-hyperlink" element
         */
        void unsetSubHyperlink();
        
        /**
         * Gets the "allow-empty" attribute
         */
        com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowEmpty.Enum getAllowEmpty();
        
        /**
         * Gets (as xml) the "allow-empty" attribute
         */
        com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowEmpty xgetAllowEmpty();
        
        /**
         * True if has "allow-empty" attribute
         */
        boolean isSetAllowEmpty();
        
        /**
         * Sets the "allow-empty" attribute
         */
        void setAllowEmpty(com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowEmpty.Enum allowEmpty);
        
        /**
         * Sets (as xml) the "allow-empty" attribute
         */
        void xsetAllowEmpty(com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowEmpty allowEmpty);
        
        /**
         * Unsets the "allow-empty" attribute
         */
        void unsetAllowEmpty();
        
        /**
         * Gets the "allow-multiple" attribute
         */
        com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowMultiple.Enum getAllowMultiple();
        
        /**
         * Gets (as xml) the "allow-multiple" attribute
         */
        com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowMultiple xgetAllowMultiple();
        
        /**
         * True if has "allow-multiple" attribute
         */
        boolean isSetAllowMultiple();
        
        /**
         * Sets the "allow-multiple" attribute
         */
        void setAllowMultiple(com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowMultiple.Enum allowMultiple);
        
        /**
         * Sets (as xml) the "allow-multiple" attribute
         */
        void xsetAllowMultiple(com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowMultiple allowMultiple);
        
        /**
         * Unsets the "allow-multiple" attribute
         */
        void unsetAllowMultiple();
        
        /**
         * Gets the "current" attribute
         */
        com.kyt.xsd.widgetform.DropDownDocument.DropDown.Current.Enum getCurrent();
        
        /**
         * Gets (as xml) the "current" attribute
         */
        com.kyt.xsd.widgetform.DropDownDocument.DropDown.Current xgetCurrent();
        
        /**
         * True if has "current" attribute
         */
        boolean isSetCurrent();
        
        /**
         * Sets the "current" attribute
         */
        void setCurrent(com.kyt.xsd.widgetform.DropDownDocument.DropDown.Current.Enum current);
        
        /**
         * Sets (as xml) the "current" attribute
         */
        void xsetCurrent(com.kyt.xsd.widgetform.DropDownDocument.DropDown.Current current);
        
        /**
         * Unsets the "current" attribute
         */
        void unsetCurrent();
        
        /**
         * Gets the "no-current-selected-key" attribute
         */
        java.lang.String getNoCurrentSelectedKey();
        
        /**
         * Gets (as xml) the "no-current-selected-key" attribute
         */
        org.apache.xmlbeans.XmlString xgetNoCurrentSelectedKey();
        
        /**
         * True if has "no-current-selected-key" attribute
         */
        boolean isSetNoCurrentSelectedKey();
        
        /**
         * Sets the "no-current-selected-key" attribute
         */
        void setNoCurrentSelectedKey(java.lang.String noCurrentSelectedKey);
        
        /**
         * Sets (as xml) the "no-current-selected-key" attribute
         */
        void xsetNoCurrentSelectedKey(org.apache.xmlbeans.XmlString noCurrentSelectedKey);
        
        /**
         * Unsets the "no-current-selected-key" attribute
         */
        void unsetNoCurrentSelectedKey();
        
        /**
         * Gets the "size" attribute
         */
        java.math.BigInteger getSize();
        
        /**
         * Gets (as xml) the "size" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetSize();
        
        /**
         * True if has "size" attribute
         */
        boolean isSetSize();
        
        /**
         * Sets the "size" attribute
         */
        void setSize(java.math.BigInteger size);
        
        /**
         * Sets (as xml) the "size" attribute
         */
        void xsetSize(org.apache.xmlbeans.XmlInteger size);
        
        /**
         * Unsets the "size" attribute
         */
        void unsetSize();
        
        /**
         * Gets the "current-description" attribute
         */
        java.lang.String getCurrentDescription();
        
        /**
         * Gets (as xml) the "current-description" attribute
         */
        org.apache.xmlbeans.XmlString xgetCurrentDescription();
        
        /**
         * True if has "current-description" attribute
         */
        boolean isSetCurrentDescription();
        
        /**
         * Sets the "current-description" attribute
         */
        void setCurrentDescription(java.lang.String currentDescription);
        
        /**
         * Sets (as xml) the "current-description" attribute
         */
        void xsetCurrentDescription(org.apache.xmlbeans.XmlString currentDescription);
        
        /**
         * Unsets the "current-description" attribute
         */
        void unsetCurrentDescription();
        
        /**
         * Gets the "other-field-size" attribute
         */
        java.math.BigInteger getOtherFieldSize();
        
        /**
         * Gets (as xml) the "other-field-size" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetOtherFieldSize();
        
        /**
         * True if has "other-field-size" attribute
         */
        boolean isSetOtherFieldSize();
        
        /**
         * Sets the "other-field-size" attribute
         */
        void setOtherFieldSize(java.math.BigInteger otherFieldSize);
        
        /**
         * Sets (as xml) the "other-field-size" attribute
         */
        void xsetOtherFieldSize(org.apache.xmlbeans.XmlInteger otherFieldSize);
        
        /**
         * Unsets the "other-field-size" attribute
         */
        void unsetOtherFieldSize();
        
        /**
         * Gets the "text-size" attribute
         */
        java.math.BigInteger getTextSize();
        
        /**
         * Gets (as xml) the "text-size" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetTextSize();
        
        /**
         * True if has "text-size" attribute
         */
        boolean isSetTextSize();
        
        /**
         * Sets the "text-size" attribute
         */
        void setTextSize(java.math.BigInteger textSize);
        
        /**
         * Sets (as xml) the "text-size" attribute
         */
        void xsetTextSize(org.apache.xmlbeans.XmlInteger textSize);
        
        /**
         * Unsets the "text-size" attribute
         */
        void unsetTextSize();
        
        /**
         * An XML allow-empty(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DropDownDocument$DropDown$AllowEmpty.
         */
        public interface AllowEmpty extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AllowEmpty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("allowempty9ad4attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DropDownDocument$DropDown$AllowEmpty.
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
                public static com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowEmpty newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowEmpty) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowEmpty newInstance() {
                  return (com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowEmpty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowEmpty newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowEmpty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML allow-multiple(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DropDownDocument$DropDown$AllowMultiple.
         */
        public interface AllowMultiple extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AllowMultiple.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("allowmultiple60d7attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DropDownDocument$DropDown$AllowMultiple.
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
                public static com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowMultiple newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowMultiple) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowMultiple newInstance() {
                  return (com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowMultiple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowMultiple newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DropDownDocument.DropDown.AllowMultiple) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML current(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DropDownDocument$DropDown$Current.
         */
        public interface Current extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Current.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("current3884attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum FIRST_IN_LIST = Enum.forString("first-in-list");
            static final Enum SELECTED = Enum.forString("selected");
            
            static final int INT_FIRST_IN_LIST = Enum.INT_FIRST_IN_LIST;
            static final int INT_SELECTED = Enum.INT_SELECTED;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DropDownDocument$DropDown$Current.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_FIRST_IN_LIST
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
                
                static final int INT_FIRST_IN_LIST = 1;
                static final int INT_SELECTED = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("first-in-list", INT_FIRST_IN_LIST),
                      new Enum("selected", INT_SELECTED),
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
                public static com.kyt.xsd.widgetform.DropDownDocument.DropDown.Current newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DropDownDocument.DropDown.Current) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DropDownDocument.DropDown.Current newInstance() {
                  return (com.kyt.xsd.widgetform.DropDownDocument.DropDown.Current) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DropDownDocument.DropDown.Current newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DropDownDocument.DropDown.Current) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.DropDownDocument.DropDown newInstance() {
              return (com.kyt.xsd.widgetform.DropDownDocument.DropDown) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.DropDownDocument.DropDown newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.DropDownDocument.DropDown) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.DropDownDocument newInstance() {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.DropDownDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.DropDownDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.DropDownDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.DropDownDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.DropDownDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.DropDownDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.DropDownDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.DropDownDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.DropDownDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.DropDownDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.DropDownDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.DropDownDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.DropDownDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.DropDownDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.DropDownDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.DropDownDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.DropDownDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.DropDownDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
