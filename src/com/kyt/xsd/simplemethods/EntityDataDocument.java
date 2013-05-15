/*
 * An XML document type.
 * Localname: entity-data
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.EntityDataDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one entity-data(@) element.
 *
 * This is a complex type.
 */
public interface EntityDataDocument extends com.kyt.xsd.simplemethods.EntityMiscOperationsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityDataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("entitydata453bdoctype");
    
    /**
     * Gets the "entity-data" element
     */
    com.kyt.xsd.simplemethods.EntityDataDocument.EntityData getEntityData();
    
    /**
     * Sets the "entity-data" element
     */
    void setEntityData(com.kyt.xsd.simplemethods.EntityDataDocument.EntityData entityData);
    
    /**
     * Appends and returns a new empty "entity-data" element
     */
    com.kyt.xsd.simplemethods.EntityDataDocument.EntityData addNewEntityData();
    
    /**
     * An XML entity-data(@).
     *
     * This is a complex type.
     */
    public interface EntityData extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("entitydata0d0belemtype");
        
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
         * Gets the "delegator-name" attribute
         */
        java.lang.String getDelegatorName();
        
        /**
         * Gets (as xml) the "delegator-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetDelegatorName();
        
        /**
         * True if has "delegator-name" attribute
         */
        boolean isSetDelegatorName();
        
        /**
         * Sets the "delegator-name" attribute
         */
        void setDelegatorName(java.lang.String delegatorName);
        
        /**
         * Sets (as xml) the "delegator-name" attribute
         */
        void xsetDelegatorName(org.apache.xmlbeans.XmlString delegatorName);
        
        /**
         * Unsets the "delegator-name" attribute
         */
        void unsetDelegatorName();
        
        /**
         * Gets the "timeout" attribute
         */
        java.math.BigInteger getTimeout();
        
        /**
         * Gets (as xml) the "timeout" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetTimeout();
        
        /**
         * True if has "timeout" attribute
         */
        boolean isSetTimeout();
        
        /**
         * Sets the "timeout" attribute
         */
        void setTimeout(java.math.BigInteger timeout);
        
        /**
         * Sets (as xml) the "timeout" attribute
         */
        void xsetTimeout(org.apache.xmlbeans.XmlInteger timeout);
        
        /**
         * Unsets the "timeout" attribute
         */
        void unsetTimeout();
        
        /**
         * Gets the "error-list-name" attribute
         */
        java.lang.String getErrorListName();
        
        /**
         * Gets (as xml) the "error-list-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetErrorListName();
        
        /**
         * True if has "error-list-name" attribute
         */
        boolean isSetErrorListName();
        
        /**
         * Sets the "error-list-name" attribute
         */
        void setErrorListName(java.lang.String errorListName);
        
        /**
         * Sets (as xml) the "error-list-name" attribute
         */
        void xsetErrorListName(org.apache.xmlbeans.XmlString errorListName);
        
        /**
         * Unsets the "error-list-name" attribute
         */
        void unsetErrorListName();
        
        /**
         * Gets the "mode" attribute
         */
        com.kyt.xsd.simplemethods.EntityDataDocument.EntityData.Mode.Enum getMode();
        
        /**
         * Gets (as xml) the "mode" attribute
         */
        com.kyt.xsd.simplemethods.EntityDataDocument.EntityData.Mode xgetMode();
        
        /**
         * True if has "mode" attribute
         */
        boolean isSetMode();
        
        /**
         * Sets the "mode" attribute
         */
        void setMode(com.kyt.xsd.simplemethods.EntityDataDocument.EntityData.Mode.Enum mode);
        
        /**
         * Sets (as xml) the "mode" attribute
         */
        void xsetMode(com.kyt.xsd.simplemethods.EntityDataDocument.EntityData.Mode mode);
        
        /**
         * Unsets the "mode" attribute
         */
        void unsetMode();
        
        /**
         * An XML mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.EntityDataDocument$EntityData$Mode.
         */
        public interface Mode extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("mode6e4eattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum LOAD = Enum.forString("load");
            static final Enum ASSERT = Enum.forString("assert");
            
            static final int INT_LOAD = Enum.INT_LOAD;
            static final int INT_ASSERT = Enum.INT_ASSERT;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.EntityDataDocument$EntityData$Mode.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LOAD
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
                
                static final int INT_LOAD = 1;
                static final int INT_ASSERT = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("load", INT_LOAD),
                      new Enum("assert", INT_ASSERT),
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
                public static com.kyt.xsd.simplemethods.EntityDataDocument.EntityData.Mode newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.EntityDataDocument.EntityData.Mode) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.EntityDataDocument.EntityData.Mode newInstance() {
                  return (com.kyt.xsd.simplemethods.EntityDataDocument.EntityData.Mode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.EntityDataDocument.EntityData.Mode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.EntityDataDocument.EntityData.Mode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.EntityDataDocument.EntityData newInstance() {
              return (com.kyt.xsd.simplemethods.EntityDataDocument.EntityData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.EntityDataDocument.EntityData newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.EntityDataDocument.EntityData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.EntityDataDocument newInstance() {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityDataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.EntityDataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.EntityDataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
