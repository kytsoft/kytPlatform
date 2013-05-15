/*
 * An XML document type.
 * Localname: date-find
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.DateFindDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one date-find(@) element.
 *
 * This is a complex type.
 */
public interface DateFindDocument extends com.kyt.xsd.widgetform.AllFieldsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DateFindDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("datefind341fdoctype");
    
    /**
     * Gets the "date-find" element
     */
    com.kyt.xsd.widgetform.DateFindDocument.DateFind getDateFind();
    
    /**
     * Sets the "date-find" element
     */
    void setDateFind(com.kyt.xsd.widgetform.DateFindDocument.DateFind dateFind);
    
    /**
     * Appends and returns a new empty "date-find" element
     */
    com.kyt.xsd.widgetform.DateFindDocument.DateFind addNewDateFind();
    
    /**
     * An XML date-find(@).
     *
     * This is a complex type.
     */
    public interface DateFind extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DateFind.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("datefind7913elemtype");
        
        /**
         * Gets the "type" attribute
         */
        com.kyt.xsd.widgetform.DateFindDocument.DateFind.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        com.kyt.xsd.widgetform.DateFindDocument.DateFind.Type xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(com.kyt.xsd.widgetform.DateFindDocument.DateFind.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(com.kyt.xsd.widgetform.DateFindDocument.DateFind.Type type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
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
         * Gets the "default-option-from" attribute
         */
        com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionFrom.Enum getDefaultOptionFrom();
        
        /**
         * Gets (as xml) the "default-option-from" attribute
         */
        com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionFrom xgetDefaultOptionFrom();
        
        /**
         * True if has "default-option-from" attribute
         */
        boolean isSetDefaultOptionFrom();
        
        /**
         * Sets the "default-option-from" attribute
         */
        void setDefaultOptionFrom(com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionFrom.Enum defaultOptionFrom);
        
        /**
         * Sets (as xml) the "default-option-from" attribute
         */
        void xsetDefaultOptionFrom(com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionFrom defaultOptionFrom);
        
        /**
         * Unsets the "default-option-from" attribute
         */
        void unsetDefaultOptionFrom();
        
        /**
         * Gets the "default-option-thru" attribute
         */
        com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionThru.Enum getDefaultOptionThru();
        
        /**
         * Gets (as xml) the "default-option-thru" attribute
         */
        com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionThru xgetDefaultOptionThru();
        
        /**
         * True if has "default-option-thru" attribute
         */
        boolean isSetDefaultOptionThru();
        
        /**
         * Sets the "default-option-thru" attribute
         */
        void setDefaultOptionThru(com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionThru.Enum defaultOptionThru);
        
        /**
         * Sets (as xml) the "default-option-thru" attribute
         */
        void xsetDefaultOptionThru(com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionThru defaultOptionThru);
        
        /**
         * Unsets the "default-option-thru" attribute
         */
        void unsetDefaultOptionThru();
        
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DateFindDocument$DateFind$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("typeb46dattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TIMESTAMP = Enum.forString("timestamp");
            static final Enum DATE = Enum.forString("date");
            static final Enum TIME = Enum.forString("time");
            
            static final int INT_TIMESTAMP = Enum.INT_TIMESTAMP;
            static final int INT_DATE = Enum.INT_DATE;
            static final int INT_TIME = Enum.INT_TIME;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DateFindDocument$DateFind$Type.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TIMESTAMP
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
                
                static final int INT_TIMESTAMP = 1;
                static final int INT_DATE = 2;
                static final int INT_TIME = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("timestamp", INT_TIMESTAMP),
                      new Enum("date", INT_DATE),
                      new Enum("time", INT_TIME),
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
                public static com.kyt.xsd.widgetform.DateFindDocument.DateFind.Type newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DateFindDocument.DateFind.Type) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DateFindDocument.DateFind.Type newInstance() {
                  return (com.kyt.xsd.widgetform.DateFindDocument.DateFind.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DateFindDocument.DateFind.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DateFindDocument.DateFind.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML default-option-from(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DateFindDocument$DateFind$DefaultOptionFrom.
         */
        public interface DefaultOptionFrom extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DefaultOptionFrom.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("defaultoptionfrome9f1attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum EQUALS = Enum.forString("equals");
            static final Enum SAME_DAY = Enum.forString("sameDay");
            static final Enum GREATER_THAN_FROM_DAY_START = Enum.forString("greaterThanFromDayStart");
            static final Enum GREATER_THAN = Enum.forString("greaterThan");
            
            static final int INT_EQUALS = Enum.INT_EQUALS;
            static final int INT_SAME_DAY = Enum.INT_SAME_DAY;
            static final int INT_GREATER_THAN_FROM_DAY_START = Enum.INT_GREATER_THAN_FROM_DAY_START;
            static final int INT_GREATER_THAN = Enum.INT_GREATER_THAN;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DateFindDocument$DateFind$DefaultOptionFrom.
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
                static final int INT_SAME_DAY = 2;
                static final int INT_GREATER_THAN_FROM_DAY_START = 3;
                static final int INT_GREATER_THAN = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("equals", INT_EQUALS),
                      new Enum("sameDay", INT_SAME_DAY),
                      new Enum("greaterThanFromDayStart", INT_GREATER_THAN_FROM_DAY_START),
                      new Enum("greaterThan", INT_GREATER_THAN),
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
                public static com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionFrom newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionFrom) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionFrom newInstance() {
                  return (com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionFrom newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionFrom) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML default-option-thru(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DateFindDocument$DateFind$DefaultOptionThru.
         */
        public interface DefaultOptionThru extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DefaultOptionThru.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("defaultoptionthru0afeattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum LESS_THAN = Enum.forString("lessThan");
            static final Enum UP_TO_DAY = Enum.forString("upToDay");
            static final Enum UP_THRU_DAY = Enum.forString("upThruDay");
            static final Enum EMPTY = Enum.forString("empty");
            
            static final int INT_LESS_THAN = Enum.INT_LESS_THAN;
            static final int INT_UP_TO_DAY = Enum.INT_UP_TO_DAY;
            static final int INT_UP_THRU_DAY = Enum.INT_UP_THRU_DAY;
            static final int INT_EMPTY = Enum.INT_EMPTY;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DateFindDocument$DateFind$DefaultOptionThru.
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
                static final int INT_UP_TO_DAY = 2;
                static final int INT_UP_THRU_DAY = 3;
                static final int INT_EMPTY = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("lessThan", INT_LESS_THAN),
                      new Enum("upToDay", INT_UP_TO_DAY),
                      new Enum("upThruDay", INT_UP_THRU_DAY),
                      new Enum("empty", INT_EMPTY),
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
                public static com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionThru newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionThru) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionThru newInstance() {
                  return (com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionThru) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionThru newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DateFindDocument.DateFind.DefaultOptionThru) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.DateFindDocument.DateFind newInstance() {
              return (com.kyt.xsd.widgetform.DateFindDocument.DateFind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.DateFindDocument.DateFind newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.DateFindDocument.DateFind) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.DateFindDocument newInstance() {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.DateFindDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.DateFindDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateFindDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.DateFindDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateFindDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.DateFindDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateFindDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.DateFindDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateFindDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.DateFindDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateFindDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.DateFindDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateFindDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.DateFindDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateFindDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.DateFindDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.DateFindDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.DateFindDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
