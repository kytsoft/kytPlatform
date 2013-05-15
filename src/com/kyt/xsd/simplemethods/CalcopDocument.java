/*
 * An XML document type.
 * Localname: calcop
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.CalcopDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one calcop(@) element.
 *
 * This is a complex type.
 */
public interface CalcopDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CalcopDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("calcop50afdoctype");
    
    /**
     * Gets the "calcop" element
     */
    com.kyt.xsd.simplemethods.CalcopDocument.Calcop getCalcop();
    
    /**
     * Sets the "calcop" element
     */
    void setCalcop(com.kyt.xsd.simplemethods.CalcopDocument.Calcop calcop);
    
    /**
     * Appends and returns a new empty "calcop" element
     */
    com.kyt.xsd.simplemethods.CalcopDocument.Calcop addNewCalcop();
    
    /**
     * An XML calcop(@).
     *
     * This is a complex type.
     */
    public interface Calcop extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Calcop.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("calcopd76delemtype");
        
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
         * Gets the "operator" attribute
         */
        com.kyt.xsd.simplemethods.CalcopDocument.Calcop.Operator.Enum getOperator();
        
        /**
         * Gets (as xml) the "operator" attribute
         */
        com.kyt.xsd.simplemethods.CalcopDocument.Calcop.Operator xgetOperator();
        
        /**
         * Sets the "operator" attribute
         */
        void setOperator(com.kyt.xsd.simplemethods.CalcopDocument.Calcop.Operator.Enum operator);
        
        /**
         * Sets (as xml) the "operator" attribute
         */
        void xsetOperator(com.kyt.xsd.simplemethods.CalcopDocument.Calcop.Operator operator);
        
        /**
         * Gets the "field" attribute
         */
        java.lang.String getField();
        
        /**
         * Gets (as xml) the "field" attribute
         */
        org.apache.xmlbeans.XmlString xgetField();
        
        /**
         * True if has "field" attribute
         */
        boolean isSetField();
        
        /**
         * Sets the "field" attribute
         */
        void setField(java.lang.String field);
        
        /**
         * Sets (as xml) the "field" attribute
         */
        void xsetField(org.apache.xmlbeans.XmlString field);
        
        /**
         * Unsets the "field" attribute
         */
        void unsetField();
        
        /**
         * An XML operator(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.CalcopDocument$Calcop$Operator.
         */
        public interface Operator extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Operator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("operator0331attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum GET = Enum.forString("get");
            static final Enum ADD = Enum.forString("add");
            static final Enum SUBTRACT = Enum.forString("subtract");
            static final Enum MULTIPLY = Enum.forString("multiply");
            static final Enum DIVIDE = Enum.forString("divide");
            static final Enum NEGATIVE = Enum.forString("negative");
            
            static final int INT_GET = Enum.INT_GET;
            static final int INT_ADD = Enum.INT_ADD;
            static final int INT_SUBTRACT = Enum.INT_SUBTRACT;
            static final int INT_MULTIPLY = Enum.INT_MULTIPLY;
            static final int INT_DIVIDE = Enum.INT_DIVIDE;
            static final int INT_NEGATIVE = Enum.INT_NEGATIVE;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.CalcopDocument$Calcop$Operator.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_GET
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
                
                static final int INT_GET = 1;
                static final int INT_ADD = 2;
                static final int INT_SUBTRACT = 3;
                static final int INT_MULTIPLY = 4;
                static final int INT_DIVIDE = 5;
                static final int INT_NEGATIVE = 6;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("get", INT_GET),
                      new Enum("add", INT_ADD),
                      new Enum("subtract", INT_SUBTRACT),
                      new Enum("multiply", INT_MULTIPLY),
                      new Enum("divide", INT_DIVIDE),
                      new Enum("negative", INT_NEGATIVE),
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
                public static com.kyt.xsd.simplemethods.CalcopDocument.Calcop.Operator newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.CalcopDocument.Calcop.Operator) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.CalcopDocument.Calcop.Operator newInstance() {
                  return (com.kyt.xsd.simplemethods.CalcopDocument.Calcop.Operator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.CalcopDocument.Calcop.Operator newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.CalcopDocument.Calcop.Operator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.CalcopDocument.Calcop newInstance() {
              return (com.kyt.xsd.simplemethods.CalcopDocument.Calcop) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.CalcopDocument.Calcop newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.CalcopDocument.Calcop) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.CalcopDocument newInstance() {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalcopDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.CalcopDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.CalcopDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
