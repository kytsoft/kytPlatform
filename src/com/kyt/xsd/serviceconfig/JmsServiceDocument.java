/*
 * An XML document type.
 * Localname: jms-service
 * Namespace: 
 * Java type: com.kyt.xsd.serviceconfig.JmsServiceDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceconfig;


/**
 * A document containing one jms-service(@) element.
 *
 * This is a complex type.
 */
public interface JmsServiceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JmsServiceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D637E5802563A0747322C44F433925D").resolveHandle("jmsserviced75fdoctype");
    
    /**
     * Gets the "jms-service" element
     */
    com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService getJmsService();
    
    /**
     * Sets the "jms-service" element
     */
    void setJmsService(com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService jmsService);
    
    /**
     * Appends and returns a new empty "jms-service" element
     */
    com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService addNewJmsService();
    
    /**
     * An XML jms-service(@).
     *
     * This is a complex type.
     */
    public interface JmsService extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JmsService.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D637E5802563A0747322C44F433925D").resolveHandle("jmsservicea253elemtype");
        
        /**
         * Gets array of all "server" elements
         */
        com.kyt.xsd.serviceconfig.ServerDocument.Server[] getServerArray();
        
        /**
         * Gets ith "server" element
         */
        com.kyt.xsd.serviceconfig.ServerDocument.Server getServerArray(int i);
        
        /**
         * Returns number of "server" element
         */
        int sizeOfServerArray();
        
        /**
         * Sets array of all "server" element
         */
        void setServerArray(com.kyt.xsd.serviceconfig.ServerDocument.Server[] serverArray);
        
        /**
         * Sets ith "server" element
         */
        void setServerArray(int i, com.kyt.xsd.serviceconfig.ServerDocument.Server server);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "server" element
         */
        com.kyt.xsd.serviceconfig.ServerDocument.Server insertNewServer(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "server" element
         */
        com.kyt.xsd.serviceconfig.ServerDocument.Server addNewServer();
        
        /**
         * Removes the ith "server" element
         */
        void removeServer(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "send-mode" attribute
         */
        com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode.Enum getSendMode();
        
        /**
         * Gets (as xml) the "send-mode" attribute
         */
        com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode xgetSendMode();
        
        /**
         * True if has "send-mode" attribute
         */
        boolean isSetSendMode();
        
        /**
         * Sets the "send-mode" attribute
         */
        void setSendMode(com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode.Enum sendMode);
        
        /**
         * Sets (as xml) the "send-mode" attribute
         */
        void xsetSendMode(com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode sendMode);
        
        /**
         * Unsets the "send-mode" attribute
         */
        void unsetSendMode();
        
        /**
         * An XML send-mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.serviceconfig.JmsServiceDocument$JmsService$SendMode.
         */
        public interface SendMode extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendMode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0D637E5802563A0747322C44F433925D").resolveHandle("sendmoded283attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum NONE = Enum.forString("none");
            static final Enum ALL = Enum.forString("all");
            static final Enum FIRST_AVAILABLE = Enum.forString("first-available");
            static final Enum RANDOM = Enum.forString("random");
            static final Enum ROUND_ROBIN = Enum.forString("round-robin");
            static final Enum LEAST_LOAD = Enum.forString("least-load");
            
            static final int INT_NONE = Enum.INT_NONE;
            static final int INT_ALL = Enum.INT_ALL;
            static final int INT_FIRST_AVAILABLE = Enum.INT_FIRST_AVAILABLE;
            static final int INT_RANDOM = Enum.INT_RANDOM;
            static final int INT_ROUND_ROBIN = Enum.INT_ROUND_ROBIN;
            static final int INT_LEAST_LOAD = Enum.INT_LEAST_LOAD;
            
            /**
             * Enumeration value class for com.kyt.xsd.serviceconfig.JmsServiceDocument$JmsService$SendMode.
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
                static final int INT_ALL = 2;
                static final int INT_FIRST_AVAILABLE = 3;
                static final int INT_RANDOM = 4;
                static final int INT_ROUND_ROBIN = 5;
                static final int INT_LEAST_LOAD = 6;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("none", INT_NONE),
                      new Enum("all", INT_ALL),
                      new Enum("first-available", INT_FIRST_AVAILABLE),
                      new Enum("random", INT_RANDOM),
                      new Enum("round-robin", INT_ROUND_ROBIN),
                      new Enum("least-load", INT_LEAST_LOAD),
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
                public static com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode) type.newValue( obj ); }
                
                public static com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode newInstance() {
                  return (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService.SendMode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService newInstance() {
              return (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument newInstance() {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.serviceconfig.JmsServiceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.serviceconfig.JmsServiceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
