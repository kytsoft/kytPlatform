/*
 * An XML document type.
 * Localname: entity-and
 * Namespace: 
 * Java type: com.kyt.xsd.widgettree.EntityAndDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgettree;


/**
 * A document containing one entity-and(@) element.
 *
 * This is a complex type.
 */
public interface EntityAndDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityAndDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("entityandae26doctype");
    
    /**
     * Gets the "entity-and" element
     */
    com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd getEntityAnd();
    
    /**
     * Sets the "entity-and" element
     */
    void setEntityAnd(com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd entityAnd);
    
    /**
     * Appends and returns a new empty "entity-and" element
     */
    com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd addNewEntityAnd();
    
    /**
     * An XML entity-and(@).
     *
     * This is a complex type.
     */
    public interface EntityAnd extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityAnd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("entityandf14delemtype");
        
        /**
         * Gets array of all "field-map" elements
         */
        com.kyt.xsd.widgettree.FieldMapDocument.FieldMap[] getFieldMapArray();
        
        /**
         * Gets ith "field-map" element
         */
        com.kyt.xsd.widgettree.FieldMapDocument.FieldMap getFieldMapArray(int i);
        
        /**
         * Returns number of "field-map" element
         */
        int sizeOfFieldMapArray();
        
        /**
         * Sets array of all "field-map" element
         */
        void setFieldMapArray(com.kyt.xsd.widgettree.FieldMapDocument.FieldMap[] fieldMapArray);
        
        /**
         * Sets ith "field-map" element
         */
        void setFieldMapArray(int i, com.kyt.xsd.widgettree.FieldMapDocument.FieldMap fieldMap);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field-map" element
         */
        com.kyt.xsd.widgettree.FieldMapDocument.FieldMap insertNewFieldMap(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field-map" element
         */
        com.kyt.xsd.widgettree.FieldMapDocument.FieldMap addNewFieldMap();
        
        /**
         * Removes the ith "field-map" element
         */
        void removeFieldMap(int i);
        
        /**
         * Gets array of all "select-field" elements
         */
        com.kyt.xsd.widgettree.SelectFieldDocument.SelectField[] getSelectFieldArray();
        
        /**
         * Gets ith "select-field" element
         */
        com.kyt.xsd.widgettree.SelectFieldDocument.SelectField getSelectFieldArray(int i);
        
        /**
         * Returns number of "select-field" element
         */
        int sizeOfSelectFieldArray();
        
        /**
         * Sets array of all "select-field" element
         */
        void setSelectFieldArray(com.kyt.xsd.widgettree.SelectFieldDocument.SelectField[] selectFieldArray);
        
        /**
         * Sets ith "select-field" element
         */
        void setSelectFieldArray(int i, com.kyt.xsd.widgettree.SelectFieldDocument.SelectField selectField);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "select-field" element
         */
        com.kyt.xsd.widgettree.SelectFieldDocument.SelectField insertNewSelectField(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "select-field" element
         */
        com.kyt.xsd.widgettree.SelectFieldDocument.SelectField addNewSelectField();
        
        /**
         * Removes the ith "select-field" element
         */
        void removeSelectField(int i);
        
        /**
         * Gets array of all "order-by" elements
         */
        com.kyt.xsd.widgettree.OrderByDocument.OrderBy[] getOrderByArray();
        
        /**
         * Gets ith "order-by" element
         */
        com.kyt.xsd.widgettree.OrderByDocument.OrderBy getOrderByArray(int i);
        
        /**
         * Returns number of "order-by" element
         */
        int sizeOfOrderByArray();
        
        /**
         * Sets array of all "order-by" element
         */
        void setOrderByArray(com.kyt.xsd.widgettree.OrderByDocument.OrderBy[] orderByArray);
        
        /**
         * Sets ith "order-by" element
         */
        void setOrderByArray(int i, com.kyt.xsd.widgettree.OrderByDocument.OrderBy orderBy);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "order-by" element
         */
        com.kyt.xsd.widgettree.OrderByDocument.OrderBy insertNewOrderBy(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "order-by" element
         */
        com.kyt.xsd.widgettree.OrderByDocument.OrderBy addNewOrderBy();
        
        /**
         * Removes the ith "order-by" element
         */
        void removeOrderBy(int i);
        
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
         * Gets the "list" attribute
         */
        java.lang.String getList();
        
        /**
         * Gets (as xml) the "list" attribute
         */
        org.apache.xmlbeans.XmlString xgetList();
        
        /**
         * True if has "list" attribute
         */
        boolean isSetList();
        
        /**
         * Sets the "list" attribute
         */
        void setList(java.lang.String list);
        
        /**
         * Sets (as xml) the "list" attribute
         */
        void xsetList(org.apache.xmlbeans.XmlString list);
        
        /**
         * Unsets the "list" attribute
         */
        void unsetList();
        
        /**
         * Gets the "use-cache" attribute
         */
        com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.UseCache.Enum getUseCache();
        
        /**
         * Gets (as xml) the "use-cache" attribute
         */
        com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.UseCache xgetUseCache();
        
        /**
         * True if has "use-cache" attribute
         */
        boolean isSetUseCache();
        
        /**
         * Sets the "use-cache" attribute
         */
        void setUseCache(com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.UseCache.Enum useCache);
        
        /**
         * Sets (as xml) the "use-cache" attribute
         */
        void xsetUseCache(com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.UseCache useCache);
        
        /**
         * Unsets the "use-cache" attribute
         */
        void unsetUseCache();
        
        /**
         * Gets the "filter-by-date" attribute
         */
        com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.FilterByDate.Enum getFilterByDate();
        
        /**
         * Gets (as xml) the "filter-by-date" attribute
         */
        com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.FilterByDate xgetFilterByDate();
        
        /**
         * True if has "filter-by-date" attribute
         */
        boolean isSetFilterByDate();
        
        /**
         * Sets the "filter-by-date" attribute
         */
        void setFilterByDate(com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.FilterByDate.Enum filterByDate);
        
        /**
         * Sets (as xml) the "filter-by-date" attribute
         */
        void xsetFilterByDate(com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.FilterByDate filterByDate);
        
        /**
         * Unsets the "filter-by-date" attribute
         */
        void unsetFilterByDate();
        
        /**
         * Gets the "result-set-type" attribute
         */
        com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.ResultSetType.Enum getResultSetType();
        
        /**
         * Gets (as xml) the "result-set-type" attribute
         */
        com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.ResultSetType xgetResultSetType();
        
        /**
         * True if has "result-set-type" attribute
         */
        boolean isSetResultSetType();
        
        /**
         * Sets the "result-set-type" attribute
         */
        void setResultSetType(com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.ResultSetType.Enum resultSetType);
        
        /**
         * Sets (as xml) the "result-set-type" attribute
         */
        void xsetResultSetType(com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.ResultSetType resultSetType);
        
        /**
         * Unsets the "result-set-type" attribute
         */
        void unsetResultSetType();
        
        /**
         * An XML use-cache(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.EntityAndDocument$EntityAnd$UseCache.
         */
        public interface UseCache extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UseCache.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("usecacheeb71attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgettree.EntityAndDocument$EntityAnd$UseCache.
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
                public static com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.UseCache newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.UseCache) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.UseCache newInstance() {
                  return (com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.UseCache) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.UseCache newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.UseCache) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML filter-by-date(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.EntityAndDocument$EntityAnd$FilterByDate.
         */
        public interface FilterByDate extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FilterByDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("filterbydate45bcattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            static final Enum BY_NAME = Enum.forString("by-name");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            static final int INT_BY_NAME = Enum.INT_BY_NAME;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgettree.EntityAndDocument$EntityAnd$FilterByDate.
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
                public static com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.FilterByDate newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.FilterByDate) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.FilterByDate newInstance() {
                  return (com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.FilterByDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.FilterByDate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.FilterByDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML result-set-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.EntityAndDocument$EntityAnd$ResultSetType.
         */
        public interface ResultSetType extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultSetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("resultsettype50eaattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum FORWARD = Enum.forString("forward");
            static final Enum SCROLL = Enum.forString("scroll");
            
            static final int INT_FORWARD = Enum.INT_FORWARD;
            static final int INT_SCROLL = Enum.INT_SCROLL;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgettree.EntityAndDocument$EntityAnd$ResultSetType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_FORWARD
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
                
                static final int INT_FORWARD = 1;
                static final int INT_SCROLL = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("forward", INT_FORWARD),
                      new Enum("scroll", INT_SCROLL),
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
                public static com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.ResultSetType newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.ResultSetType) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.ResultSetType newInstance() {
                  return (com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.ResultSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.ResultSetType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd.ResultSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd newInstance() {
              return (com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgettree.EntityAndDocument.EntityAnd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgettree.EntityAndDocument newInstance() {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityAndDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgettree.EntityAndDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgettree.EntityAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
