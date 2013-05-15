/*
 * An XML document type.
 * Localname: entity-options
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.EntityOptionsDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one entity-options(@) element.
 *
 * This is a complex type.
 */
public interface EntityOptionsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityOptionsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("entityoptionsfb6ddoctype");
    
    /**
     * Gets the "entity-options" element
     */
    com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions getEntityOptions();
    
    /**
     * Sets the "entity-options" element
     */
    void setEntityOptions(com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions entityOptions);
    
    /**
     * Appends and returns a new empty "entity-options" element
     */
    com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions addNewEntityOptions();
    
    /**
     * An XML entity-options(@).
     *
     * This is a complex type.
     */
    public interface EntityOptions extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityOptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("entityoptionsac2delemtype");
        
        /**
         * Gets array of all "entity-constraint" elements
         */
        com.kyt.xsd.widgetform.EntityConstraintDocument.EntityConstraint[] getEntityConstraintArray();
        
        /**
         * Gets ith "entity-constraint" element
         */
        com.kyt.xsd.widgetform.EntityConstraintDocument.EntityConstraint getEntityConstraintArray(int i);
        
        /**
         * Returns number of "entity-constraint" element
         */
        int sizeOfEntityConstraintArray();
        
        /**
         * Sets array of all "entity-constraint" element
         */
        void setEntityConstraintArray(com.kyt.xsd.widgetform.EntityConstraintDocument.EntityConstraint[] entityConstraintArray);
        
        /**
         * Sets ith "entity-constraint" element
         */
        void setEntityConstraintArray(int i, com.kyt.xsd.widgetform.EntityConstraintDocument.EntityConstraint entityConstraint);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-constraint" element
         */
        com.kyt.xsd.widgetform.EntityConstraintDocument.EntityConstraint insertNewEntityConstraint(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-constraint" element
         */
        com.kyt.xsd.widgetform.EntityConstraintDocument.EntityConstraint addNewEntityConstraint();
        
        /**
         * Removes the ith "entity-constraint" element
         */
        void removeEntityConstraint(int i);
        
        /**
         * Gets array of all "entity-order-by" elements
         */
        com.kyt.xsd.widgetform.EntityOrderByDocument.EntityOrderBy[] getEntityOrderByArray();
        
        /**
         * Gets ith "entity-order-by" element
         */
        com.kyt.xsd.widgetform.EntityOrderByDocument.EntityOrderBy getEntityOrderByArray(int i);
        
        /**
         * Returns number of "entity-order-by" element
         */
        int sizeOfEntityOrderByArray();
        
        /**
         * Sets array of all "entity-order-by" element
         */
        void setEntityOrderByArray(com.kyt.xsd.widgetform.EntityOrderByDocument.EntityOrderBy[] entityOrderByArray);
        
        /**
         * Sets ith "entity-order-by" element
         */
        void setEntityOrderByArray(int i, com.kyt.xsd.widgetform.EntityOrderByDocument.EntityOrderBy entityOrderBy);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity-order-by" element
         */
        com.kyt.xsd.widgetform.EntityOrderByDocument.EntityOrderBy insertNewEntityOrderBy(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity-order-by" element
         */
        com.kyt.xsd.widgetform.EntityOrderByDocument.EntityOrderBy addNewEntityOrderBy();
        
        /**
         * Removes the ith "entity-order-by" element
         */
        void removeEntityOrderBy(int i);
        
        /**
         * Gets the "entity-name" attribute
         */
        java.lang.String getEntityName();
        
        /**
         * Gets (as xml) the "entity-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityName();
        
        /**
         * Sets the "entity-name" attribute
         */
        void setEntityName(java.lang.String entityName);
        
        /**
         * Sets (as xml) the "entity-name" attribute
         */
        void xsetEntityName(org.apache.xmlbeans.XmlString entityName);
        
        /**
         * Gets the "key-field-name" attribute
         */
        java.lang.String getKeyFieldName();
        
        /**
         * Gets (as xml) the "key-field-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetKeyFieldName();
        
        /**
         * True if has "key-field-name" attribute
         */
        boolean isSetKeyFieldName();
        
        /**
         * Sets the "key-field-name" attribute
         */
        void setKeyFieldName(java.lang.String keyFieldName);
        
        /**
         * Sets (as xml) the "key-field-name" attribute
         */
        void xsetKeyFieldName(org.apache.xmlbeans.XmlString keyFieldName);
        
        /**
         * Unsets the "key-field-name" attribute
         */
        void unsetKeyFieldName();
        
        /**
         * Gets the "description" attribute
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" attribute
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * Sets the "description" attribute
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" attribute
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Gets the "cache" attribute
         */
        com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.Cache.Enum getCache();
        
        /**
         * Gets (as xml) the "cache" attribute
         */
        com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.Cache xgetCache();
        
        /**
         * True if has "cache" attribute
         */
        boolean isSetCache();
        
        /**
         * Sets the "cache" attribute
         */
        void setCache(com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.Cache.Enum cache);
        
        /**
         * Sets (as xml) the "cache" attribute
         */
        void xsetCache(com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.Cache cache);
        
        /**
         * Unsets the "cache" attribute
         */
        void unsetCache();
        
        /**
         * Gets the "filter-by-date" attribute
         */
        com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.FilterByDate.Enum getFilterByDate();
        
        /**
         * Gets (as xml) the "filter-by-date" attribute
         */
        com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.FilterByDate xgetFilterByDate();
        
        /**
         * True if has "filter-by-date" attribute
         */
        boolean isSetFilterByDate();
        
        /**
         * Sets the "filter-by-date" attribute
         */
        void setFilterByDate(com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.FilterByDate.Enum filterByDate);
        
        /**
         * Sets (as xml) the "filter-by-date" attribute
         */
        void xsetFilterByDate(com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.FilterByDate filterByDate);
        
        /**
         * Unsets the "filter-by-date" attribute
         */
        void unsetFilterByDate();
        
        /**
         * An XML cache(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.EntityOptionsDocument$EntityOptions$Cache.
         */
        public interface Cache extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cache.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("cache4a97attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.EntityOptionsDocument$EntityOptions$Cache.
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
                public static com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.Cache newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.Cache) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.Cache newInstance() {
                  return (com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.Cache) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.Cache newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.Cache) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML filter-by-date(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.EntityOptionsDocument$EntityOptions$FilterByDate.
         */
        public interface FilterByDate extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FilterByDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("filterbydate219cattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            static final Enum BY_NAME = Enum.forString("by-name");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            static final int INT_BY_NAME = Enum.INT_BY_NAME;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.EntityOptionsDocument$EntityOptions$FilterByDate.
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
                public static com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.FilterByDate newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.FilterByDate) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.FilterByDate newInstance() {
                  return (com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.FilterByDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.FilterByDate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions.FilterByDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions newInstance() {
              return (com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.EntityOptionsDocument.EntityOptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.EntityOptionsDocument newInstance() {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOptionsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.EntityOptionsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.EntityOptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
