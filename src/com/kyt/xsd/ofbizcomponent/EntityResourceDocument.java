/*
 * An XML document type.
 * Localname: entity-resource
 * Namespace: 
 * Java type: com.kyt.xsd.ofbizcomponent.EntityResourceDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.ofbizcomponent;


/**
 * A document containing one entity-resource(@) element.
 *
 * This is a complex type.
 */
public interface EntityResourceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityResourceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s687A08F778A9610EDD21673788D906F2").resolveHandle("entityresourcee91fdoctype");
    
    /**
     * Gets the "entity-resource" element
     */
    com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource getEntityResource();
    
    /**
     * Sets the "entity-resource" element
     */
    void setEntityResource(com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource entityResource);
    
    /**
     * Appends and returns a new empty "entity-resource" element
     */
    com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource addNewEntityResource();
    
    /**
     * An XML entity-resource(@).
     *
     * This is a complex type.
     */
    public interface EntityResource extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityResource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s687A08F778A9610EDD21673788D906F2").resolveHandle("entityresourceab53elemtype");
        
        /**
         * Gets the "type" attribute
         */
        com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type xgetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type type);
        
        /**
         * Gets the "reader-name" attribute
         */
        java.lang.String getReaderName();
        
        /**
         * Gets (as xml) the "reader-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetReaderName();
        
        /**
         * Sets the "reader-name" attribute
         */
        void setReaderName(java.lang.String readerName);
        
        /**
         * Sets (as xml) the "reader-name" attribute
         */
        void xsetReaderName(org.apache.xmlbeans.XmlString readerName);
        
        /**
         * Gets the "loader" attribute
         */
        java.lang.String getLoader();
        
        /**
         * Gets (as xml) the "loader" attribute
         */
        org.apache.xmlbeans.XmlString xgetLoader();
        
        /**
         * Sets the "loader" attribute
         */
        void setLoader(java.lang.String loader);
        
        /**
         * Sets (as xml) the "loader" attribute
         */
        void xsetLoader(org.apache.xmlbeans.XmlString loader);
        
        /**
         * Gets the "location" attribute
         */
        java.lang.String getLocation();
        
        /**
         * Gets (as xml) the "location" attribute
         */
        org.apache.xmlbeans.XmlString xgetLocation();
        
        /**
         * Sets the "location" attribute
         */
        void setLocation(java.lang.String location);
        
        /**
         * Sets (as xml) the "location" attribute
         */
        void xsetLocation(org.apache.xmlbeans.XmlString location);
        
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.ofbizcomponent.EntityResourceDocument$EntityResource$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s687A08F778A9610EDD21673788D906F2").resolveHandle("typeafadattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum MODEL = Enum.forString("model");
            static final Enum GROUP = Enum.forString("group");
            static final Enum ECA = Enum.forString("eca");
            static final Enum DATA = Enum.forString("data");
            
            static final int INT_MODEL = Enum.INT_MODEL;
            static final int INT_GROUP = Enum.INT_GROUP;
            static final int INT_ECA = Enum.INT_ECA;
            static final int INT_DATA = Enum.INT_DATA;
            
            /**
             * Enumeration value class for com.kyt.xsd.ofbizcomponent.EntityResourceDocument$EntityResource$Type.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_MODEL
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
                
                static final int INT_MODEL = 1;
                static final int INT_GROUP = 2;
                static final int INT_ECA = 3;
                static final int INT_DATA = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("model", INT_MODEL),
                      new Enum("group", INT_GROUP),
                      new Enum("eca", INT_ECA),
                      new Enum("data", INT_DATA),
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
                public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type) type.newValue( obj ); }
                
                public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type newInstance() {
                  return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource newInstance() {
              return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument.EntityResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument newInstance() {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.ofbizcomponent.EntityResourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.ofbizcomponent.EntityResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
