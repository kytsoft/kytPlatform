/*
 * An XML document type.
 * Localname: calculate
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.CalculateDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one calculate(@) element.
 *
 * This is a complex type.
 */
public interface CalculateDocument extends com.kyt.xsd.simplemethods.OtherOperationsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CalculateDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("calculate730ddoctype");
    
    /**
     * Gets the "calculate" element
     */
    com.kyt.xsd.simplemethods.CalculateDocument.Calculate getCalculate();
    
    /**
     * Sets the "calculate" element
     */
    void setCalculate(com.kyt.xsd.simplemethods.CalculateDocument.Calculate calculate);
    
    /**
     * Appends and returns a new empty "calculate" element
     */
    com.kyt.xsd.simplemethods.CalculateDocument.Calculate addNewCalculate();
    
    /**
     * An XML calculate(@).
     *
     * This is a complex type.
     */
    public interface Calculate extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Calculate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("calculate01efelemtype");
        
        /**
         * Gets array of all "calcop" elements
         */
        com.kyt.xsd.simplemethods.CalcopDocument.Calcop[] getCalcopArray();
        
        /**
         * Gets ith "calcop" element
         */
        com.kyt.xsd.simplemethods.CalcopDocument.Calcop getCalcopArray(int i);
        
        /**
         * Returns number of "calcop" element
         */
        int sizeOfCalcopArray();
        
        /**
         * Sets array of all "calcop" element
         */
        void setCalcopArray(com.kyt.xsd.simplemethods.CalcopDocument.Calcop[] calcopArray);
        
        /**
         * Sets ith "calcop" element
         */
        void setCalcopArray(int i, com.kyt.xsd.simplemethods.CalcopDocument.Calcop calcop);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "calcop" element
         */
        com.kyt.xsd.simplemethods.CalcopDocument.Calcop insertNewCalcop(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "calcop" element
         */
        com.kyt.xsd.simplemethods.CalcopDocument.Calcop addNewCalcop();
        
        /**
         * Removes the ith "calcop" element
         */
        void removeCalcop(int i);
        
        /**
         * Gets array of all "number" elements
         */
        com.kyt.xsd.simplemethods.NumberDocument.Number[] getNumberArray();
        
        /**
         * Gets ith "number" element
         */
        com.kyt.xsd.simplemethods.NumberDocument.Number getNumberArray(int i);
        
        /**
         * Returns number of "number" element
         */
        int sizeOfNumberArray();
        
        /**
         * Sets array of all "number" element
         */
        void setNumberArray(com.kyt.xsd.simplemethods.NumberDocument.Number[] numberArray);
        
        /**
         * Sets ith "number" element
         */
        void setNumberArray(int i, com.kyt.xsd.simplemethods.NumberDocument.Number number);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "number" element
         */
        com.kyt.xsd.simplemethods.NumberDocument.Number insertNewNumber(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "number" element
         */
        com.kyt.xsd.simplemethods.NumberDocument.Number addNewNumber();
        
        /**
         * Removes the ith "number" element
         */
        void removeNumber(int i);
        
        /**
         * Gets the "field" attribute
         */
        java.lang.String getField();
        
        /**
         * Gets (as xml) the "field" attribute
         */
        org.apache.xmlbeans.XmlString xgetField();
        
        /**
         * Sets the "field" attribute
         */
        void setField(java.lang.String field);
        
        /**
         * Sets (as xml) the "field" attribute
         */
        void xsetField(org.apache.xmlbeans.XmlString field);
        
        /**
         * Gets the "type" attribute
         */
        com.kyt.xsd.simplemethods.CalculateDocument.Calculate.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        com.kyt.xsd.simplemethods.CalculateDocument.Calculate.Type xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(com.kyt.xsd.simplemethods.CalculateDocument.Calculate.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(com.kyt.xsd.simplemethods.CalculateDocument.Calculate.Type type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "rounding-mode" attribute
         */
        com.kyt.xsd.simplemethods.CalculateDocument.Calculate.RoundingMode.Enum getRoundingMode();
        
        /**
         * Gets (as xml) the "rounding-mode" attribute
         */
        com.kyt.xsd.simplemethods.CalculateDocument.Calculate.RoundingMode xgetRoundingMode();
        
        /**
         * True if has "rounding-mode" attribute
         */
        boolean isSetRoundingMode();
        
        /**
         * Sets the "rounding-mode" attribute
         */
        void setRoundingMode(com.kyt.xsd.simplemethods.CalculateDocument.Calculate.RoundingMode.Enum roundingMode);
        
        /**
         * Sets (as xml) the "rounding-mode" attribute
         */
        void xsetRoundingMode(com.kyt.xsd.simplemethods.CalculateDocument.Calculate.RoundingMode roundingMode);
        
        /**
         * Unsets the "rounding-mode" attribute
         */
        void unsetRoundingMode();
        
        /**
         * Gets the "decimal-scale" attribute
         */
        java.lang.String getDecimalScale();
        
        /**
         * Gets (as xml) the "decimal-scale" attribute
         */
        org.apache.xmlbeans.XmlString xgetDecimalScale();
        
        /**
         * True if has "decimal-scale" attribute
         */
        boolean isSetDecimalScale();
        
        /**
         * Sets the "decimal-scale" attribute
         */
        void setDecimalScale(java.lang.String decimalScale);
        
        /**
         * Sets (as xml) the "decimal-scale" attribute
         */
        void xsetDecimalScale(org.apache.xmlbeans.XmlString decimalScale);
        
        /**
         * Unsets the "decimal-scale" attribute
         */
        void unsetDecimalScale();
        
        /**
         * Gets the "decimal-format" attribute
         */
        java.lang.String getDecimalFormat();
        
        /**
         * Gets (as xml) the "decimal-format" attribute
         */
        org.apache.xmlbeans.XmlString xgetDecimalFormat();
        
        /**
         * True if has "decimal-format" attribute
         */
        boolean isSetDecimalFormat();
        
        /**
         * Sets the "decimal-format" attribute
         */
        void setDecimalFormat(java.lang.String decimalFormat);
        
        /**
         * Sets (as xml) the "decimal-format" attribute
         */
        void xsetDecimalFormat(org.apache.xmlbeans.XmlString decimalFormat);
        
        /**
         * Unsets the "decimal-format" attribute
         */
        void unsetDecimalFormat();
        
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.CalculateDocument$Calculate$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("type3d49attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum STRING = Enum.forString("String");
            static final Enum DOUBLE = Enum.forString("Double");
            static final Enum FLOAT = Enum.forString("Float");
            static final Enum LONG = Enum.forString("Long");
            static final Enum INTEGER = Enum.forString("Integer");
            static final Enum BIG_DECIMAL = Enum.forString("BigDecimal");
            
            static final int INT_STRING = Enum.INT_STRING;
            static final int INT_DOUBLE = Enum.INT_DOUBLE;
            static final int INT_FLOAT = Enum.INT_FLOAT;
            static final int INT_LONG = Enum.INT_LONG;
            static final int INT_INTEGER = Enum.INT_INTEGER;
            static final int INT_BIG_DECIMAL = Enum.INT_BIG_DECIMAL;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.CalculateDocument$Calculate$Type.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_STRING
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
                
                static final int INT_STRING = 1;
                static final int INT_DOUBLE = 2;
                static final int INT_FLOAT = 3;
                static final int INT_LONG = 4;
                static final int INT_INTEGER = 5;
                static final int INT_BIG_DECIMAL = 6;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("String", INT_STRING),
                      new Enum("Double", INT_DOUBLE),
                      new Enum("Float", INT_FLOAT),
                      new Enum("Long", INT_LONG),
                      new Enum("Integer", INT_INTEGER),
                      new Enum("BigDecimal", INT_BIG_DECIMAL),
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
                public static com.kyt.xsd.simplemethods.CalculateDocument.Calculate.Type newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.CalculateDocument.Calculate.Type) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.CalculateDocument.Calculate.Type newInstance() {
                  return (com.kyt.xsd.simplemethods.CalculateDocument.Calculate.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.CalculateDocument.Calculate.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.CalculateDocument.Calculate.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML rounding-mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.CalculateDocument$Calculate$RoundingMode.
         */
        public interface RoundingMode extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RoundingMode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("roundingmodeff93attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum CEILING = Enum.forString("Ceiling");
            static final Enum FLOOR = Enum.forString("Floor");
            static final Enum UP = Enum.forString("Up");
            static final Enum DOWN = Enum.forString("Down");
            static final Enum HALF_UP = Enum.forString("HalfUp");
            static final Enum HALF_DOWN = Enum.forString("HalfDown");
            static final Enum HALF_EVEN = Enum.forString("HalfEven");
            static final Enum UNNECESSARY = Enum.forString("Unnecessary");
            static final Enum $_ROUNDING_MODE = Enum.forString("${roundingMode}");
            
            static final int INT_CEILING = Enum.INT_CEILING;
            static final int INT_FLOOR = Enum.INT_FLOOR;
            static final int INT_UP = Enum.INT_UP;
            static final int INT_DOWN = Enum.INT_DOWN;
            static final int INT_HALF_UP = Enum.INT_HALF_UP;
            static final int INT_HALF_DOWN = Enum.INT_HALF_DOWN;
            static final int INT_HALF_EVEN = Enum.INT_HALF_EVEN;
            static final int INT_UNNECESSARY = Enum.INT_UNNECESSARY;
            static final int INT_$_ROUNDING_MODE = Enum.INT_$_ROUNDING_MODE;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.CalculateDocument$Calculate$RoundingMode.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CEILING
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
                
                static final int INT_CEILING = 1;
                static final int INT_FLOOR = 2;
                static final int INT_UP = 3;
                static final int INT_DOWN = 4;
                static final int INT_HALF_UP = 5;
                static final int INT_HALF_DOWN = 6;
                static final int INT_HALF_EVEN = 7;
                static final int INT_UNNECESSARY = 8;
                static final int INT_$_ROUNDING_MODE = 9;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("Ceiling", INT_CEILING),
                      new Enum("Floor", INT_FLOOR),
                      new Enum("Up", INT_UP),
                      new Enum("Down", INT_DOWN),
                      new Enum("HalfUp", INT_HALF_UP),
                      new Enum("HalfDown", INT_HALF_DOWN),
                      new Enum("HalfEven", INT_HALF_EVEN),
                      new Enum("Unnecessary", INT_UNNECESSARY),
                      new Enum("${roundingMode}", INT_$_ROUNDING_MODE),
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
                public static com.kyt.xsd.simplemethods.CalculateDocument.Calculate.RoundingMode newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.CalculateDocument.Calculate.RoundingMode) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.CalculateDocument.Calculate.RoundingMode newInstance() {
                  return (com.kyt.xsd.simplemethods.CalculateDocument.Calculate.RoundingMode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.CalculateDocument.Calculate.RoundingMode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.CalculateDocument.Calculate.RoundingMode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.CalculateDocument.Calculate newInstance() {
              return (com.kyt.xsd.simplemethods.CalculateDocument.Calculate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.CalculateDocument.Calculate newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.CalculateDocument.Calculate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.CalculateDocument newInstance() {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalculateDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.CalculateDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.CalculateDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
