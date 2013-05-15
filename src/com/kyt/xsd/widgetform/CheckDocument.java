/*
 * An XML document type.
 * Localname: check
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.CheckDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one check(@) element.
 *
 * This is a complex type.
 */
public interface CheckDocument extends com.kyt.xsd.widgetform.AllFieldsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CheckDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("check402fdoctype");
    
    /**
     * Gets the "check" element
     */
    com.kyt.xsd.widgetform.CheckDocument.Check getCheck();
    
    /**
     * Sets the "check" element
     */
    void setCheck(com.kyt.xsd.widgetform.CheckDocument.Check check);
    
    /**
     * Appends and returns a new empty "check" element
     */
    com.kyt.xsd.widgetform.CheckDocument.Check addNewCheck();
    
    /**
     * An XML check(@).
     *
     * This is a complex type.
     */
    public interface Check extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Check.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("checkabb3elemtype");
        
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
         * Gets the "all-checked" attribute
         */
        com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked.Enum getAllChecked();
        
        /**
         * Gets (as xml) the "all-checked" attribute
         */
        com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked xgetAllChecked();
        
        /**
         * True if has "all-checked" attribute
         */
        boolean isSetAllChecked();
        
        /**
         * Sets the "all-checked" attribute
         */
        void setAllChecked(com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked.Enum allChecked);
        
        /**
         * Sets (as xml) the "all-checked" attribute
         */
        void xsetAllChecked(com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked allChecked);
        
        /**
         * Unsets the "all-checked" attribute
         */
        void unsetAllChecked();
        
        /**
         * An XML all-checked(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.CheckDocument$Check$AllChecked.
         */
        public interface AllChecked extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AllChecked.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("allchecked8f96attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.CheckDocument$Check$AllChecked.
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
                public static com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked newInstance() {
                  return (com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.CheckDocument.Check.AllChecked) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.CheckDocument.Check newInstance() {
              return (com.kyt.xsd.widgetform.CheckDocument.Check) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.CheckDocument.Check newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.CheckDocument.Check) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.CheckDocument newInstance() {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.CheckDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.CheckDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.CheckDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.CheckDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.CheckDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.CheckDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.CheckDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.CheckDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.CheckDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.CheckDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.CheckDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.CheckDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.CheckDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.CheckDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.CheckDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.CheckDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.CheckDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.CheckDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
