/*
 * An XML document type.
 * Localname: inline-jdbc
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.InlineJdbcDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig;


/**
 * A document containing one inline-jdbc(@) element.
 *
 * This is a complex type.
 */
public interface InlineJdbcDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InlineJdbcDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("inlinejdbc0b96doctype");
    
    /**
     * Gets the "inline-jdbc" element
     */
    com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc getInlineJdbc();
    
    /**
     * Sets the "inline-jdbc" element
     */
    void setInlineJdbc(com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc inlineJdbc);
    
    /**
     * Appends and returns a new empty "inline-jdbc" element
     */
    com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc addNewInlineJdbc();
    
    /**
     * An XML inline-jdbc(@).
     *
     * This is a complex type.
     */
    public interface InlineJdbc extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InlineJdbc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("inlinejdbcde81elemtype");
        
        /**
         * Gets the "jdbc-driver" attribute
         */
        java.lang.String getJdbcDriver();
        
        /**
         * Gets (as xml) the "jdbc-driver" attribute
         */
        org.apache.xmlbeans.XmlString xgetJdbcDriver();
        
        /**
         * Sets the "jdbc-driver" attribute
         */
        void setJdbcDriver(java.lang.String jdbcDriver);
        
        /**
         * Sets (as xml) the "jdbc-driver" attribute
         */
        void xsetJdbcDriver(org.apache.xmlbeans.XmlString jdbcDriver);
        
        /**
         * Gets the "jdbc-uri" attribute
         */
        java.lang.String getJdbcUri();
        
        /**
         * Gets (as xml) the "jdbc-uri" attribute
         */
        org.apache.xmlbeans.XmlString xgetJdbcUri();
        
        /**
         * Sets the "jdbc-uri" attribute
         */
        void setJdbcUri(java.lang.String jdbcUri);
        
        /**
         * Sets (as xml) the "jdbc-uri" attribute
         */
        void xsetJdbcUri(org.apache.xmlbeans.XmlString jdbcUri);
        
        /**
         * Gets the "jdbc-username" attribute
         */
        java.lang.String getJdbcUsername();
        
        /**
         * Gets (as xml) the "jdbc-username" attribute
         */
        org.apache.xmlbeans.XmlString xgetJdbcUsername();
        
        /**
         * Sets the "jdbc-username" attribute
         */
        void setJdbcUsername(java.lang.String jdbcUsername);
        
        /**
         * Sets (as xml) the "jdbc-username" attribute
         */
        void xsetJdbcUsername(org.apache.xmlbeans.XmlString jdbcUsername);
        
        /**
         * Gets the "jdbc-password" attribute
         */
        java.lang.String getJdbcPassword();
        
        /**
         * Gets (as xml) the "jdbc-password" attribute
         */
        org.apache.xmlbeans.XmlString xgetJdbcPassword();
        
        /**
         * Sets the "jdbc-password" attribute
         */
        void setJdbcPassword(java.lang.String jdbcPassword);
        
        /**
         * Sets (as xml) the "jdbc-password" attribute
         */
        void xsetJdbcPassword(org.apache.xmlbeans.XmlString jdbcPassword);
        
        /**
         * Gets the "isolation-level" attribute
         */
        com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel.Enum getIsolationLevel();
        
        /**
         * Gets (as xml) the "isolation-level" attribute
         */
        com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel xgetIsolationLevel();
        
        /**
         * True if has "isolation-level" attribute
         */
        boolean isSetIsolationLevel();
        
        /**
         * Sets the "isolation-level" attribute
         */
        void setIsolationLevel(com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel.Enum isolationLevel);
        
        /**
         * Sets (as xml) the "isolation-level" attribute
         */
        void xsetIsolationLevel(com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel isolationLevel);
        
        /**
         * Unsets the "isolation-level" attribute
         */
        void unsetIsolationLevel();
        
        /**
         * Gets the "pool-maxsize" attribute
         */
        java.math.BigInteger getPoolMaxsize();
        
        /**
         * Gets (as xml) the "pool-maxsize" attribute
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetPoolMaxsize();
        
        /**
         * True if has "pool-maxsize" attribute
         */
        boolean isSetPoolMaxsize();
        
        /**
         * Sets the "pool-maxsize" attribute
         */
        void setPoolMaxsize(java.math.BigInteger poolMaxsize);
        
        /**
         * Sets (as xml) the "pool-maxsize" attribute
         */
        void xsetPoolMaxsize(org.apache.xmlbeans.XmlNonNegativeInteger poolMaxsize);
        
        /**
         * Unsets the "pool-maxsize" attribute
         */
        void unsetPoolMaxsize();
        
        /**
         * Gets the "pool-minsize" attribute
         */
        java.math.BigInteger getPoolMinsize();
        
        /**
         * Gets (as xml) the "pool-minsize" attribute
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetPoolMinsize();
        
        /**
         * True if has "pool-minsize" attribute
         */
        boolean isSetPoolMinsize();
        
        /**
         * Sets the "pool-minsize" attribute
         */
        void setPoolMinsize(java.math.BigInteger poolMinsize);
        
        /**
         * Sets (as xml) the "pool-minsize" attribute
         */
        void xsetPoolMinsize(org.apache.xmlbeans.XmlNonNegativeInteger poolMinsize);
        
        /**
         * Unsets the "pool-minsize" attribute
         */
        void unsetPoolMinsize();
        
        /**
         * Gets the "idle-maxsize" attribute
         */
        java.math.BigInteger getIdleMaxsize();
        
        /**
         * Gets (as xml) the "idle-maxsize" attribute
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetIdleMaxsize();
        
        /**
         * True if has "idle-maxsize" attribute
         */
        boolean isSetIdleMaxsize();
        
        /**
         * Sets the "idle-maxsize" attribute
         */
        void setIdleMaxsize(java.math.BigInteger idleMaxsize);
        
        /**
         * Sets (as xml) the "idle-maxsize" attribute
         */
        void xsetIdleMaxsize(org.apache.xmlbeans.XmlNonNegativeInteger idleMaxsize);
        
        /**
         * Unsets the "idle-maxsize" attribute
         */
        void unsetIdleMaxsize();
        
        /**
         * Gets the "time-between-eviction-runs-millis" attribute
         */
        java.math.BigInteger getTimeBetweenEvictionRunsMillis();
        
        /**
         * Gets (as xml) the "time-between-eviction-runs-millis" attribute
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetTimeBetweenEvictionRunsMillis();
        
        /**
         * True if has "time-between-eviction-runs-millis" attribute
         */
        boolean isSetTimeBetweenEvictionRunsMillis();
        
        /**
         * Sets the "time-between-eviction-runs-millis" attribute
         */
        void setTimeBetweenEvictionRunsMillis(java.math.BigInteger timeBetweenEvictionRunsMillis);
        
        /**
         * Sets (as xml) the "time-between-eviction-runs-millis" attribute
         */
        void xsetTimeBetweenEvictionRunsMillis(org.apache.xmlbeans.XmlNonNegativeInteger timeBetweenEvictionRunsMillis);
        
        /**
         * Unsets the "time-between-eviction-runs-millis" attribute
         */
        void unsetTimeBetweenEvictionRunsMillis();
        
        /**
         * Gets the "pool-sleeptime" attribute
         */
        java.math.BigInteger getPoolSleeptime();
        
        /**
         * Gets (as xml) the "pool-sleeptime" attribute
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetPoolSleeptime();
        
        /**
         * True if has "pool-sleeptime" attribute
         */
        boolean isSetPoolSleeptime();
        
        /**
         * Sets the "pool-sleeptime" attribute
         */
        void setPoolSleeptime(java.math.BigInteger poolSleeptime);
        
        /**
         * Sets (as xml) the "pool-sleeptime" attribute
         */
        void xsetPoolSleeptime(org.apache.xmlbeans.XmlNonNegativeInteger poolSleeptime);
        
        /**
         * Unsets the "pool-sleeptime" attribute
         */
        void unsetPoolSleeptime();
        
        /**
         * Gets the "pool-lifetime" attribute
         */
        java.math.BigInteger getPoolLifetime();
        
        /**
         * Gets (as xml) the "pool-lifetime" attribute
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetPoolLifetime();
        
        /**
         * True if has "pool-lifetime" attribute
         */
        boolean isSetPoolLifetime();
        
        /**
         * Sets the "pool-lifetime" attribute
         */
        void setPoolLifetime(java.math.BigInteger poolLifetime);
        
        /**
         * Sets (as xml) the "pool-lifetime" attribute
         */
        void xsetPoolLifetime(org.apache.xmlbeans.XmlNonNegativeInteger poolLifetime);
        
        /**
         * Unsets the "pool-lifetime" attribute
         */
        void unsetPoolLifetime();
        
        /**
         * Gets the "pool-deadlock-maxwait" attribute
         */
        java.math.BigInteger getPoolDeadlockMaxwait();
        
        /**
         * Gets (as xml) the "pool-deadlock-maxwait" attribute
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetPoolDeadlockMaxwait();
        
        /**
         * True if has "pool-deadlock-maxwait" attribute
         */
        boolean isSetPoolDeadlockMaxwait();
        
        /**
         * Sets the "pool-deadlock-maxwait" attribute
         */
        void setPoolDeadlockMaxwait(java.math.BigInteger poolDeadlockMaxwait);
        
        /**
         * Sets (as xml) the "pool-deadlock-maxwait" attribute
         */
        void xsetPoolDeadlockMaxwait(org.apache.xmlbeans.XmlNonNegativeInteger poolDeadlockMaxwait);
        
        /**
         * Unsets the "pool-deadlock-maxwait" attribute
         */
        void unsetPoolDeadlockMaxwait();
        
        /**
         * Gets the "pool-deadlock-retrywait" attribute
         */
        java.math.BigInteger getPoolDeadlockRetrywait();
        
        /**
         * Gets (as xml) the "pool-deadlock-retrywait" attribute
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetPoolDeadlockRetrywait();
        
        /**
         * True if has "pool-deadlock-retrywait" attribute
         */
        boolean isSetPoolDeadlockRetrywait();
        
        /**
         * Sets the "pool-deadlock-retrywait" attribute
         */
        void setPoolDeadlockRetrywait(java.math.BigInteger poolDeadlockRetrywait);
        
        /**
         * Sets (as xml) the "pool-deadlock-retrywait" attribute
         */
        void xsetPoolDeadlockRetrywait(org.apache.xmlbeans.XmlNonNegativeInteger poolDeadlockRetrywait);
        
        /**
         * Unsets the "pool-deadlock-retrywait" attribute
         */
        void unsetPoolDeadlockRetrywait();
        
        /**
         * Gets the "pool-jdbc-test-stmt" attribute
         */
        java.lang.String getPoolJdbcTestStmt();
        
        /**
         * Gets (as xml) the "pool-jdbc-test-stmt" attribute
         */
        org.apache.xmlbeans.XmlString xgetPoolJdbcTestStmt();
        
        /**
         * True if has "pool-jdbc-test-stmt" attribute
         */
        boolean isSetPoolJdbcTestStmt();
        
        /**
         * Sets the "pool-jdbc-test-stmt" attribute
         */
        void setPoolJdbcTestStmt(java.lang.String poolJdbcTestStmt);
        
        /**
         * Sets (as xml) the "pool-jdbc-test-stmt" attribute
         */
        void xsetPoolJdbcTestStmt(org.apache.xmlbeans.XmlString poolJdbcTestStmt);
        
        /**
         * Unsets the "pool-jdbc-test-stmt" attribute
         */
        void unsetPoolJdbcTestStmt();
        
        /**
         * Gets the "pool-xa-wrapper-class" attribute
         */
        java.lang.String getPoolXaWrapperClass();
        
        /**
         * Gets (as xml) the "pool-xa-wrapper-class" attribute
         */
        org.apache.xmlbeans.XmlString xgetPoolXaWrapperClass();
        
        /**
         * True if has "pool-xa-wrapper-class" attribute
         */
        boolean isSetPoolXaWrapperClass();
        
        /**
         * Sets the "pool-xa-wrapper-class" attribute
         */
        void setPoolXaWrapperClass(java.lang.String poolXaWrapperClass);
        
        /**
         * Sets (as xml) the "pool-xa-wrapper-class" attribute
         */
        void xsetPoolXaWrapperClass(org.apache.xmlbeans.XmlString poolXaWrapperClass);
        
        /**
         * Unsets the "pool-xa-wrapper-class" attribute
         */
        void unsetPoolXaWrapperClass();
        
        /**
         * An XML isolation-level(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityconfig.InlineJdbcDocument$InlineJdbc$IsolationLevel.
         */
        public interface IsolationLevel extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IsolationLevel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("isolationlevel212eattrtype");
            
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
             * Enumeration value class for com.kyt.xsd.entityconfig.InlineJdbcDocument$InlineJdbc$IsolationLevel.
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
                public static com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel) type.newValue( obj ); }
                
                public static com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel newInstance() {
                  return (com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc.IsolationLevel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc newInstance() {
              return (com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.entityconfig.InlineJdbcDocument.InlineJdbc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument newInstance() {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityconfig.InlineJdbcDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityconfig.InlineJdbcDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
