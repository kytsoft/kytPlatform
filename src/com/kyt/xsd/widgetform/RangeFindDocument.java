/*
 * An XML document type.
 * Localname: range-find
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.RangeFindDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one range-find(@) element.
 *
 * This is a complex type.
 */
public interface RangeFindDocument extends com.kyt.xsd.widgetform.AllFieldsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RangeFindDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("rangefinda182doctype");
    
    /**
     * Gets the "range-find" element
     */
    com.kyt.xsd.widgetform.RangeFindDocument.RangeFind getRangeFind();
    
    /**
     * Sets the "range-find" element
     */
    void setRangeFind(com.kyt.xsd.widgetform.RangeFindDocument.RangeFind rangeFind);
    
    /**
     * Appends and returns a new empty "range-find" element
     */
    com.kyt.xsd.widgetform.RangeFindDocument.RangeFind addNewRangeFind();
    
    /**
     * An XML range-find(@).
     *
     * This is a complex type.
     */
    public interface RangeFind extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RangeFind.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("rangefind46cdelemtype");
        
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
         * Gets the "size" attribute
         */
        java.math.BigInteger getSize();
        
        /**
         * Gets (as xml) the "size" attribute
         */
        org.apache.xmlbeans.XmlPositiveInteger xgetSize();
        
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
        void xsetSize(org.apache.xmlbeans.XmlPositiveInteger size);
        
        /**
         * Unsets the "size" attribute
         */
        void unsetSize();
        
        /**
         * Gets the "maxlength" attribute
         */
        java.math.BigInteger getMaxlength();
        
        /**
         * Gets (as xml) the "maxlength" attribute
         */
        org.apache.xmlbeans.XmlPositiveInteger xgetMaxlength();
        
        /**
         * True if has "maxlength" attribute
         */
        boolean isSetMaxlength();
        
        /**
         * Sets the "maxlength" attribute
         */
        void setMaxlength(java.math.BigInteger maxlength);
        
        /**
         * Sets (as xml) the "maxlength" attribute
         */
        void xsetMaxlength(org.apache.xmlbeans.XmlPositiveInteger maxlength);
        
        /**
         * Unsets the "maxlength" attribute
         */
        void unsetMaxlength();
        
        /**
         * Gets the "default-value" attribute
         */
        java.lang.String getDefaultValue();
        
        /**
         * Gets (as xml) the "default-value" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultValue();
        
        /**
         * True if has "default-value" attribute
         */
        boolean isSetDefaultValue();
        
        /**
         * Sets the "default-value" attribute
         */
        void setDefaultValue(java.lang.String defaultValue);
        
        /**
         * Sets (as xml) the "default-value" attribute
         */
        void xsetDefaultValue(org.apache.xmlbeans.XmlString defaultValue);
        
        /**
         * Unsets the "default-value" attribute
         */
        void unsetDefaultValue();
        
        /**
         * Gets the "client-autocomplete-field" attribute
         */
        com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.ClientAutocompleteField.Enum getClientAutocompleteField();
        
        /**
         * Gets (as xml) the "client-autocomplete-field" attribute
         */
        com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.ClientAutocompleteField xgetClientAutocompleteField();
        
        /**
         * True if has "client-autocomplete-field" attribute
         */
        boolean isSetClientAutocompleteField();
        
        /**
         * Sets the "client-autocomplete-field" attribute
         */
        void setClientAutocompleteField(com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.ClientAutocompleteField.Enum clientAutocompleteField);
        
        /**
         * Sets (as xml) the "client-autocomplete-field" attribute
         */
        void xsetClientAutocompleteField(com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.ClientAutocompleteField clientAutocompleteField);
        
        /**
         * Unsets the "client-autocomplete-field" attribute
         */
        void unsetClientAutocompleteField();
        
        /**
         * Gets the "default-option-from" attribute
         */
        com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionFrom.Enum getDefaultOptionFrom();
        
        /**
         * Gets (as xml) the "default-option-from" attribute
         */
        com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionFrom xgetDefaultOptionFrom();
        
        /**
         * True if has "default-option-from" attribute
         */
        boolean isSetDefaultOptionFrom();
        
        /**
         * Sets the "default-option-from" attribute
         */
        void setDefaultOptionFrom(com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionFrom.Enum defaultOptionFrom);
        
        /**
         * Sets (as xml) the "default-option-from" attribute
         */
        void xsetDefaultOptionFrom(com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionFrom defaultOptionFrom);
        
        /**
         * Unsets the "default-option-from" attribute
         */
        void unsetDefaultOptionFrom();
        
        /**
         * Gets the "default-option-thru" attribute
         */
        com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionThru.Enum getDefaultOptionThru();
        
        /**
         * Gets (as xml) the "default-option-thru" attribute
         */
        com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionThru xgetDefaultOptionThru();
        
        /**
         * True if has "default-option-thru" attribute
         */
        boolean isSetDefaultOptionThru();
        
        /**
         * Sets the "default-option-thru" attribute
         */
        void setDefaultOptionThru(com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionThru.Enum defaultOptionThru);
        
        /**
         * Sets (as xml) the "default-option-thru" attribute
         */
        void xsetDefaultOptionThru(com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionThru defaultOptionThru);
        
        /**
         * Unsets the "default-option-thru" attribute
         */
        void unsetDefaultOptionThru();
        
        /**
         * An XML client-autocomplete-field(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.RangeFindDocument$RangeFind$ClientAutocompleteField.
         */
        public interface ClientAutocompleteField extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ClientAutocompleteField.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("clientautocompletefield558cattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.RangeFindDocument$RangeFind$ClientAutocompleteField.
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
                public static com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.ClientAutocompleteField newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.ClientAutocompleteField) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.ClientAutocompleteField newInstance() {
                  return (com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.ClientAutocompleteField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.ClientAutocompleteField newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.ClientAutocompleteField) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML default-option-from(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.RangeFindDocument$RangeFind$DefaultOptionFrom.
         */
        public interface DefaultOptionFrom extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DefaultOptionFrom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("defaultoptionfromf82battrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum EQUALS = Enum.forString("equals");
            static final Enum GREATER_THAN = Enum.forString("greaterThan");
            static final Enum GREATER_THAN_EQUAL_TO = Enum.forString("greaterThanEqualTo");
            
            static final int INT_EQUALS = Enum.INT_EQUALS;
            static final int INT_GREATER_THAN = Enum.INT_GREATER_THAN;
            static final int INT_GREATER_THAN_EQUAL_TO = Enum.INT_GREATER_THAN_EQUAL_TO;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.RangeFindDocument$RangeFind$DefaultOptionFrom.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_EQUALS
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
                
                static final int INT_EQUALS = 1;
                static final int INT_GREATER_THAN = 2;
                static final int INT_GREATER_THAN_EQUAL_TO = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("equals", INT_EQUALS),
                      new Enum("greaterThan", INT_GREATER_THAN),
                      new Enum("greaterThanEqualTo", INT_GREATER_THAN_EQUAL_TO),
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
                public static com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionFrom newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionFrom) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionFrom newInstance() {
                  return (com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionFrom newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML default-option-thru(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.RangeFindDocument$RangeFind$DefaultOptionThru.
         */
        public interface DefaultOptionThru extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DefaultOptionThru.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("defaultoptionthru09f8attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum LESS_THAN = Enum.forString("lessThan");
            static final Enum LESS_THAN_EQUAL_TO = Enum.forString("lessThanEqualTo");
            
            static final int INT_LESS_THAN = Enum.INT_LESS_THAN;
            static final int INT_LESS_THAN_EQUAL_TO = Enum.INT_LESS_THAN_EQUAL_TO;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.RangeFindDocument$RangeFind$DefaultOptionThru.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LESS_THAN
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
                
                static final int INT_LESS_THAN = 1;
                static final int INT_LESS_THAN_EQUAL_TO = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("lessThan", INT_LESS_THAN),
                      new Enum("lessThanEqualTo", INT_LESS_THAN_EQUAL_TO),
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
                public static com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionThru newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionThru) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionThru newInstance() {
                  return (com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionThru) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionThru newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.RangeFindDocument.RangeFind.DefaultOptionThru) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.RangeFindDocument.RangeFind newInstance() {
              return (com.kyt.xsd.widgetform.RangeFindDocument.RangeFind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.RangeFindDocument.RangeFind newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.RangeFindDocument.RangeFind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.RangeFindDocument newInstance() {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.RangeFindDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.RangeFindDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.RangeFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
