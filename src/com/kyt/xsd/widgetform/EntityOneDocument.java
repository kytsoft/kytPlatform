/*
 * An XML document type.
 * Localname: entity-one
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.EntityOneDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one entity-one(@) element.
 *
 * This is a complex type.
 */
public interface EntityOneDocument extends com.kyt.xsd.widgetform.AllActionsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityOneDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("entityonee2b5doctype");
    
    /**
     * Gets the "entity-one" element
     */
    com.kyt.xsd.widgetform.EntityOneDocument.EntityOne getEntityOne();
    
    /**
     * Sets the "entity-one" element
     */
    void setEntityOne(com.kyt.xsd.widgetform.EntityOneDocument.EntityOne entityOne);
    
    /**
     * Appends and returns a new empty "entity-one" element
     */
    com.kyt.xsd.widgetform.EntityOneDocument.EntityOne addNewEntityOne();
    
    /**
     * An XML entity-one(@).
     *
     * This is a complex type.
     */
    public interface EntityOne extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityOne.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("entityone11adelemtype");
        
        /**
         * Gets array of all "field-map" elements
         */
        com.kyt.xsd.widgetform.FieldMapDocument.FieldMap[] getFieldMapArray();
        
        /**
         * Gets ith "field-map" element
         */
        com.kyt.xsd.widgetform.FieldMapDocument.FieldMap getFieldMapArray(int i);
        
        /**
         * Returns number of "field-map" element
         */
        int sizeOfFieldMapArray();
        
        /**
         * Sets array of all "field-map" element
         */
        void setFieldMapArray(com.kyt.xsd.widgetform.FieldMapDocument.FieldMap[] fieldMapArray);
        
        /**
         * Sets ith "field-map" element
         */
        void setFieldMapArray(int i, com.kyt.xsd.widgetform.FieldMapDocument.FieldMap fieldMap);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field-map" element
         */
        com.kyt.xsd.widgetform.FieldMapDocument.FieldMap insertNewFieldMap(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field-map" element
         */
        com.kyt.xsd.widgetform.FieldMapDocument.FieldMap addNewFieldMap();
        
        /**
         * Removes the ith "field-map" element
         */
        void removeFieldMap(int i);
        
        /**
         * Gets array of all "select-field" elements
         */
        com.kyt.xsd.widgetform.SelectFieldDocument.SelectField[] getSelectFieldArray();
        
        /**
         * Gets ith "select-field" element
         */
        com.kyt.xsd.widgetform.SelectFieldDocument.SelectField getSelectFieldArray(int i);
        
        /**
         * Returns number of "select-field" element
         */
        int sizeOfSelectFieldArray();
        
        /**
         * Sets array of all "select-field" element
         */
        void setSelectFieldArray(com.kyt.xsd.widgetform.SelectFieldDocument.SelectField[] selectFieldArray);
        
        /**
         * Sets ith "select-field" element
         */
        void setSelectFieldArray(int i, com.kyt.xsd.widgetform.SelectFieldDocument.SelectField selectField);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "select-field" element
         */
        com.kyt.xsd.widgetform.SelectFieldDocument.SelectField insertNewSelectField(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "select-field" element
         */
        com.kyt.xsd.widgetform.SelectFieldDocument.SelectField addNewSelectField();
        
        /**
         * Removes the ith "select-field" element
         */
        void removeSelectField(int i);
        
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
         * Gets the "value-field" attribute
         */
        java.lang.String getValueField();
        
        /**
         * Gets (as xml) the "value-field" attribute
         */
        org.apache.xmlbeans.XmlString xgetValueField();
        
        /**
         * True if has "value-field" attribute
         */
        boolean isSetValueField();
        
        /**
         * Sets the "value-field" attribute
         */
        void setValueField(java.lang.String valueField);
        
        /**
         * Sets (as xml) the "value-field" attribute
         */
        void xsetValueField(org.apache.xmlbeans.XmlString valueField);
        
        /**
         * Unsets the "value-field" attribute
         */
        void unsetValueField();
        
        /**
         * Gets the "use-cache" attribute
         */
        com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.UseCache.Enum getUseCache();
        
        /**
         * Gets (as xml) the "use-cache" attribute
         */
        com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.UseCache xgetUseCache();
        
        /**
         * True if has "use-cache" attribute
         */
        boolean isSetUseCache();
        
        /**
         * Sets the "use-cache" attribute
         */
        void setUseCache(com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.UseCache.Enum useCache);
        
        /**
         * Sets (as xml) the "use-cache" attribute
         */
        void xsetUseCache(com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.UseCache useCache);
        
        /**
         * Unsets the "use-cache" attribute
         */
        void unsetUseCache();
        
        /**
         * Gets the "auto-field-map" attribute
         */
        com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.AutoFieldMap.Enum getAutoFieldMap();
        
        /**
         * Gets (as xml) the "auto-field-map" attribute
         */
        com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.AutoFieldMap xgetAutoFieldMap();
        
        /**
         * True if has "auto-field-map" attribute
         */
        boolean isSetAutoFieldMap();
        
        /**
         * Sets the "auto-field-map" attribute
         */
        void setAutoFieldMap(com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.AutoFieldMap.Enum autoFieldMap);
        
        /**
         * Sets (as xml) the "auto-field-map" attribute
         */
        void xsetAutoFieldMap(com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.AutoFieldMap autoFieldMap);
        
        /**
         * Unsets the "auto-field-map" attribute
         */
        void unsetAutoFieldMap();
        
        /**
         * An XML use-cache(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.EntityOneDocument$EntityOne$UseCache.
         */
        public interface UseCache extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UseCache.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("usecache0bd1attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.EntityOneDocument$EntityOne$UseCache.
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
                public static com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.UseCache newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.UseCache) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.UseCache newInstance() {
                  return (com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.UseCache) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.UseCache newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.UseCache) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML auto-field-map(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.EntityOneDocument$EntityOne$AutoFieldMap.
         */
        public interface AutoFieldMap extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AutoFieldMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("autofieldmapb078attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.EntityOneDocument$EntityOne$AutoFieldMap.
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
                public static com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.AutoFieldMap newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.AutoFieldMap) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.AutoFieldMap newInstance() {
                  return (com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.AutoFieldMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.AutoFieldMap newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.EntityOneDocument.EntityOne.AutoFieldMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.EntityOneDocument.EntityOne newInstance() {
              return (com.kyt.xsd.widgetform.EntityOneDocument.EntityOne) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.EntityOneDocument.EntityOne newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.EntityOneDocument.EntityOne) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.EntityOneDocument newInstance() {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOneDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.EntityOneDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.EntityOneDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
