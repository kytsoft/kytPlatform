/*
 * An XML document type.
 * Localname: entity-condition
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.EntityConditionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel;


/**
 * A document containing one entity-condition(@) element.
 *
 * This is a complex type.
 */
public interface EntityConditionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityConditionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC06412D5939EE085657300132FC0B98").resolveHandle("entityconditionea2adoctype");
    
    /**
     * Gets the "entity-condition" element
     */
    com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition getEntityCondition();
    
    /**
     * Sets the "entity-condition" element
     */
    void setEntityCondition(com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition entityCondition);
    
    /**
     * Appends and returns a new empty "entity-condition" element
     */
    com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition addNewEntityCondition();
    
    /**
     * An XML entity-condition(@).
     *
     * This is a complex type.
     */
    public interface EntityCondition extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityCondition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC06412D5939EE085657300132FC0B98").resolveHandle("entitycondition50cdelemtype");
        
        /**
         * Gets the "condition-expr" element
         */
        com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr getConditionExpr();
        
        /**
         * True if has "condition-expr" element
         */
        boolean isSetConditionExpr();
        
        /**
         * Sets the "condition-expr" element
         */
        void setConditionExpr(com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr conditionExpr);
        
        /**
         * Appends and returns a new empty "condition-expr" element
         */
        com.kyt.xsd.entitymodel.ConditionExprDocument.ConditionExpr addNewConditionExpr();
        
        /**
         * Unsets the "condition-expr" element
         */
        void unsetConditionExpr();
        
        /**
         * Gets the "condition-list" element
         */
        com.kyt.xsd.entitymodel.ConditionListDocument.ConditionList getConditionList();
        
        /**
         * True if has "condition-list" element
         */
        boolean isSetConditionList();
        
        /**
         * Sets the "condition-list" element
         */
        void setConditionList(com.kyt.xsd.entitymodel.ConditionListDocument.ConditionList conditionList);
        
        /**
         * Appends and returns a new empty "condition-list" element
         */
        com.kyt.xsd.entitymodel.ConditionListDocument.ConditionList addNewConditionList();
        
        /**
         * Unsets the "condition-list" element
         */
        void unsetConditionList();
        
        /**
         * Gets the "having-condition-list" element
         */
        com.kyt.xsd.entitymodel.HavingConditionListDocument.HavingConditionList getHavingConditionList();
        
        /**
         * True if has "having-condition-list" element
         */
        boolean isSetHavingConditionList();
        
        /**
         * Sets the "having-condition-list" element
         */
        void setHavingConditionList(com.kyt.xsd.entitymodel.HavingConditionListDocument.HavingConditionList havingConditionList);
        
        /**
         * Appends and returns a new empty "having-condition-list" element
         */
        com.kyt.xsd.entitymodel.HavingConditionListDocument.HavingConditionList addNewHavingConditionList();
        
        /**
         * Unsets the "having-condition-list" element
         */
        void unsetHavingConditionList();
        
        /**
         * Gets array of all "order-by" elements
         */
        com.kyt.xsd.entitymodel.OrderByDocument.OrderBy[] getOrderByArray();
        
        /**
         * Gets ith "order-by" element
         */
        com.kyt.xsd.entitymodel.OrderByDocument.OrderBy getOrderByArray(int i);
        
        /**
         * Returns number of "order-by" element
         */
        int sizeOfOrderByArray();
        
        /**
         * Sets array of all "order-by" element
         */
        void setOrderByArray(com.kyt.xsd.entitymodel.OrderByDocument.OrderBy[] orderByArray);
        
        /**
         * Sets ith "order-by" element
         */
        void setOrderByArray(int i, com.kyt.xsd.entitymodel.OrderByDocument.OrderBy orderBy);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "order-by" element
         */
        com.kyt.xsd.entitymodel.OrderByDocument.OrderBy insertNewOrderBy(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "order-by" element
         */
        com.kyt.xsd.entitymodel.OrderByDocument.OrderBy addNewOrderBy();
        
        /**
         * Removes the ith "order-by" element
         */
        void removeOrderBy(int i);
        
        /**
         * Gets the "filter-by-date" attribute
         */
        com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate.Enum getFilterByDate();
        
        /**
         * Gets (as xml) the "filter-by-date" attribute
         */
        com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate xgetFilterByDate();
        
        /**
         * True if has "filter-by-date" attribute
         */
        boolean isSetFilterByDate();
        
        /**
         * Sets the "filter-by-date" attribute
         */
        void setFilterByDate(com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate.Enum filterByDate);
        
        /**
         * Sets (as xml) the "filter-by-date" attribute
         */
        void xsetFilterByDate(com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate filterByDate);
        
        /**
         * Unsets the "filter-by-date" attribute
         */
        void unsetFilterByDate();
        
        /**
         * Gets the "distinct" attribute
         */
        com.kyt.xsd.entitymodel.Boolean.Enum getDistinct();
        
        /**
         * Gets (as xml) the "distinct" attribute
         */
        com.kyt.xsd.entitymodel.Boolean xgetDistinct();
        
        /**
         * True if has "distinct" attribute
         */
        boolean isSetDistinct();
        
        /**
         * Sets the "distinct" attribute
         */
        void setDistinct(com.kyt.xsd.entitymodel.Boolean.Enum distinct);
        
        /**
         * Sets (as xml) the "distinct" attribute
         */
        void xsetDistinct(com.kyt.xsd.entitymodel.Boolean distinct);
        
        /**
         * Unsets the "distinct" attribute
         */
        void unsetDistinct();
        
        /**
         * An XML filter-by-date(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entitymodel.EntityConditionDocument$EntityCondition$FilterByDate.
         */
        public interface FilterByDate extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FilterByDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC06412D5939EE085657300132FC0B98").resolveHandle("filterbydate76bcattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            static final Enum BY_NAME = Enum.forString("by-name");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            static final int INT_BY_NAME = Enum.INT_BY_NAME;
            
            /**
             * Enumeration value class for com.kyt.xsd.entitymodel.EntityConditionDocument$EntityCondition$FilterByDate.
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
                static final int INT_BY_NAME = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
                      new Enum("by-name", INT_BY_NAME),
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
                public static com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate) type.newValue( obj ); }
                
                public static com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate newInstance() {
                  return (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition.FilterByDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition newInstance() {
              return (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.entitymodel.EntityConditionDocument newInstance() {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityConditionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entitymodel.EntityConditionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entitymodel.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
