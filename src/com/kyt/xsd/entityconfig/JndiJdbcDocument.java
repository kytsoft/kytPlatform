/*
 * An XML document type.
 * Localname: jndi-jdbc
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.JndiJdbcDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig;


/**
 * A document containing one jndi-jdbc(@) element.
 *
 * This is a complex type.
 */
public interface JndiJdbcDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JndiJdbcDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("jndijdbc8126doctype");
    
    /**
     * Gets the "jndi-jdbc" element
     */
    com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc getJndiJdbc();
    
    /**
     * Sets the "jndi-jdbc" element
     */
    void setJndiJdbc(com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc jndiJdbc);
    
    /**
     * Appends and returns a new empty "jndi-jdbc" element
     */
    com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc addNewJndiJdbc();
    
    /**
     * An XML jndi-jdbc(@).
     *
     * This is a complex type.
     */
    public interface JndiJdbc extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JndiJdbc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("jndijdbcc0a1elemtype");
        
        /**
         * Gets the "jndi-server-name" attribute
         */
        java.lang.String getJndiServerName();
        
        /**
         * Gets (as xml) the "jndi-server-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetJndiServerName();
        
        /**
         * Sets the "jndi-server-name" attribute
         */
        void setJndiServerName(java.lang.String jndiServerName);
        
        /**
         * Sets (as xml) the "jndi-server-name" attribute
         */
        void xsetJndiServerName(org.apache.xmlbeans.XmlString jndiServerName);
        
        /**
         * Gets the "jndi-name" attribute
         */
        java.lang.String getJndiName();
        
        /**
         * Gets (as xml) the "jndi-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetJndiName();
        
        /**
         * Sets the "jndi-name" attribute
         */
        void setJndiName(java.lang.String jndiName);
        
        /**
         * Sets (as xml) the "jndi-name" attribute
         */
        void xsetJndiName(org.apache.xmlbeans.XmlString jndiName);
        
        /**
         * Gets the "isolation-level" attribute
         */
        com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel.Enum getIsolationLevel();
        
        /**
         * Gets (as xml) the "isolation-level" attribute
         */
        com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel xgetIsolationLevel();
        
        /**
         * True if has "isolation-level" attribute
         */
        boolean isSetIsolationLevel();
        
        /**
         * Sets the "isolation-level" attribute
         */
        void setIsolationLevel(com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel.Enum isolationLevel);
        
        /**
         * Sets (as xml) the "isolation-level" attribute
         */
        void xsetIsolationLevel(com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel isolationLevel);
        
        /**
         * Unsets the "isolation-level" attribute
         */
        void unsetIsolationLevel();
        
        /**
         * An XML isolation-level(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityconfig.JndiJdbcDocument$JndiJdbc$IsolationLevel.
         */
        public interface IsolationLevel extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IsolationLevel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("isolationlevel61ceattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum NONE = Enum.forString("None");
            static final Enum READ_COMMITTED = Enum.forString("ReadCommitted");
            static final Enum READ_UNCOMMITTED = Enum.forString("ReadUncommitted");
            static final Enum REPEATABLE_READ = Enum.forString("RepeatableRead");
            static final Enum SERIALIZABLE = Enum.forString("Serializable");
            
            static final int INT_NONE = Enum.INT_NONE;
            static final int INT_READ_COMMITTED = Enum.INT_READ_COMMITTED;
            static final int INT_READ_UNCOMMITTED = Enum.INT_READ_UNCOMMITTED;
            static final int INT_REPEATABLE_READ = Enum.INT_REPEATABLE_READ;
            static final int INT_SERIALIZABLE = Enum.INT_SERIALIZABLE;
            
            /**
             * Enumeration value class for com.kyt.xsd.entityconfig.JndiJdbcDocument$JndiJdbc$IsolationLevel.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_NONE
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
                
                static final int INT_NONE = 1;
                static final int INT_READ_COMMITTED = 2;
                static final int INT_READ_UNCOMMITTED = 3;
                static final int INT_REPEATABLE_READ = 4;
                static final int INT_SERIALIZABLE = 5;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("None", INT_NONE),
                      new Enum("ReadCommitted", INT_READ_COMMITTED),
                      new Enum("ReadUncommitted", INT_READ_UNCOMMITTED),
                      new Enum("RepeatableRead", INT_REPEATABLE_READ),
                      new Enum("Serializable", INT_SERIALIZABLE),
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
                public static com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel) type.newValue( obj ); }
                
                public static com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel newInstance() {
                  return (com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc.IsolationLevel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc newInstance() {
              return (com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.entityconfig.JndiJdbcDocument.JndiJdbc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument newInstance() {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityconfig.JndiJdbcDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityconfig.JndiJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
