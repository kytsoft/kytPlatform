/*
 * An XML document type.
 * Localname: having-condition-list
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.HavingConditionListDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one having-condition-list(@) element.
 *
 * This is a complex type.
 */
public interface HavingConditionListDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HavingConditionListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("havingconditionlista5dfdoctype");
    
    /**
     * Gets the "having-condition-list" element
     */
    com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList getHavingConditionList();
    
    /**
     * Sets the "having-condition-list" element
     */
    void setHavingConditionList(com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList havingConditionList);
    
    /**
     * Appends and returns a new empty "having-condition-list" element
     */
    com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList addNewHavingConditionList();
    
    /**
     * An XML having-condition-list(@).
     *
     * This is a complex type.
     */
    public interface HavingConditionList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HavingConditionList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("havingconditionlist1d13elemtype");
        
        /**
         * Gets array of all "condition-expr" elements
         */
        com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr[] getConditionExprArray();
        
        /**
         * Gets ith "condition-expr" element
         */
        com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr getConditionExprArray(int i);
        
        /**
         * Returns number of "condition-expr" element
         */
        int sizeOfConditionExprArray();
        
        /**
         * Sets array of all "condition-expr" element
         */
        void setConditionExprArray(com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr[] conditionExprArray);
        
        /**
         * Sets ith "condition-expr" element
         */
        void setConditionExprArray(int i, com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr conditionExpr);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "condition-expr" element
         */
        com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr insertNewConditionExpr(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "condition-expr" element
         */
        com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr addNewConditionExpr();
        
        /**
         * Removes the ith "condition-expr" element
         */
        void removeConditionExpr(int i);
        
        /**
         * Gets array of all "condition-list" elements
         */
        com.kyt.xsd.widgetform.ConditionListDocument.ConditionList[] getConditionListArray();
        
        /**
         * Gets ith "condition-list" element
         */
        com.kyt.xsd.widgetform.ConditionListDocument.ConditionList getConditionListArray(int i);
        
        /**
         * Returns number of "condition-list" element
         */
        int sizeOfConditionListArray();
        
        /**
         * Sets array of all "condition-list" element
         */
        void setConditionListArray(com.kyt.xsd.widgetform.ConditionListDocument.ConditionList[] conditionListArray);
        
        /**
         * Sets ith "condition-list" element
         */
        void setConditionListArray(int i, com.kyt.xsd.widgetform.ConditionListDocument.ConditionList conditionList);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "condition-list" element
         */
        com.kyt.xsd.widgetform.ConditionListDocument.ConditionList insertNewConditionList(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "condition-list" element
         */
        com.kyt.xsd.widgetform.ConditionListDocument.ConditionList addNewConditionList();
        
        /**
         * Removes the ith "condition-list" element
         */
        void removeConditionList(int i);
        
        /**
         * Gets array of all "condition-object" elements
         */
        com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject[] getConditionObjectArray();
        
        /**
         * Gets ith "condition-object" element
         */
        com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject getConditionObjectArray(int i);
        
        /**
         * Returns number of "condition-object" element
         */
        int sizeOfConditionObjectArray();
        
        /**
         * Sets array of all "condition-object" element
         */
        void setConditionObjectArray(com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject[] conditionObjectArray);
        
        /**
         * Sets ith "condition-object" element
         */
        void setConditionObjectArray(int i, com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject conditionObject);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "condition-object" element
         */
        com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject insertNewConditionObject(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "condition-object" element
         */
        com.kyt.xsd.widgetform.ConditionObjectDocument.ConditionObject addNewConditionObject();
        
        /**
         * Removes the ith "condition-object" element
         */
        void removeConditionObject(int i);
        
        /**
         * Gets the "combine" attribute
         */
        com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList.Combine.Enum getCombine();
        
        /**
         * Gets (as xml) the "combine" attribute
         */
        com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList.Combine xgetCombine();
        
        /**
         * True if has "combine" attribute
         */
        boolean isSetCombine();
        
        /**
         * Sets the "combine" attribute
         */
        void setCombine(com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList.Combine.Enum combine);
        
        /**
         * Sets (as xml) the "combine" attribute
         */
        void xsetCombine(com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList.Combine combine);
        
        /**
         * Unsets the "combine" attribute
         */
        void unsetCombine();
        
        /**
         * An XML combine(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.HavingConditionListDocument$HavingConditionList$Combine.
         */
        public interface Combine extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Combine.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("combine70baattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum AND = Enum.forString("and");
            static final Enum OR = Enum.forString("or");
            
            static final int INT_AND = Enum.INT_AND;
            static final int INT_OR = Enum.INT_OR;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.HavingConditionListDocument$HavingConditionList$Combine.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_AND
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
                
                static final int INT_AND = 1;
                static final int INT_OR = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("and", INT_AND),
                      new Enum("or", INT_OR),
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
                public static com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList.Combine newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList.Combine) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList.Combine newInstance() {
                  return (com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList.Combine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList.Combine newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList.Combine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList newInstance() {
              return (com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.HavingConditionListDocument.HavingConditionList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.HavingConditionListDocument newInstance() {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.HavingConditionListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.HavingConditionListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.HavingConditionListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
