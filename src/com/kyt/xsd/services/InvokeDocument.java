/*
 * An XML document type.
 * Localname: invoke
 * Namespace: 
 * Java type: com.kyt.xsd.services.InvokeDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.services;


/**
 * A document containing one invoke(@) element.
 *
 * This is a complex type.
 */
public interface InvokeDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InvokeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("invoke4e31doctype");
    
    /**
     * Gets the "invoke" element
     */
    com.kyt.xsd.services.InvokeDocument.Invoke getInvoke();
    
    /**
     * Sets the "invoke" element
     */
    void setInvoke(com.kyt.xsd.services.InvokeDocument.Invoke invoke);
    
    /**
     * Appends and returns a new empty "invoke" element
     */
    com.kyt.xsd.services.InvokeDocument.Invoke addNewInvoke();
    
    /**
     * An XML invoke(@).
     *
     * This is a complex type.
     */
    public interface Invoke extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Invoke.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("invokee9adelemtype");
        
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
         * Gets the "mode" attribute
         */
        com.kyt.xsd.services.InvokeDocument.Invoke.Mode.Enum getMode();
        
        /**
         * Gets (as xml) the "mode" attribute
         */
        com.kyt.xsd.services.InvokeDocument.Invoke.Mode xgetMode();
        
        /**
         * True if has "mode" attribute
         */
        boolean isSetMode();
        
        /**
         * Sets the "mode" attribute
         */
        void setMode(com.kyt.xsd.services.InvokeDocument.Invoke.Mode.Enum mode);
        
        /**
         * Sets (as xml) the "mode" attribute
         */
        void xsetMode(com.kyt.xsd.services.InvokeDocument.Invoke.Mode mode);
        
        /**
         * Unsets the "mode" attribute
         */
        void unsetMode();
        
        /**
         * Gets the "parameters" attribute
         */
        com.kyt.xsd.services.InvokeDocument.Invoke.Parameters.Enum getParameters();
        
        /**
         * Gets (as xml) the "parameters" attribute
         */
        com.kyt.xsd.services.InvokeDocument.Invoke.Parameters xgetParameters();
        
        /**
         * True if has "parameters" attribute
         */
        boolean isSetParameters();
        
        /**
         * Sets the "parameters" attribute
         */
        void setParameters(com.kyt.xsd.services.InvokeDocument.Invoke.Parameters.Enum parameters);
        
        /**
         * Sets (as xml) the "parameters" attribute
         */
        void xsetParameters(com.kyt.xsd.services.InvokeDocument.Invoke.Parameters parameters);
        
        /**
         * Unsets the "parameters" attribute
         */
        void unsetParameters();
        
        /**
         * Gets the "result-to-context" attribute
         */
        com.kyt.xsd.services.InvokeDocument.Invoke.ResultToContext.Enum getResultToContext();
        
        /**
         * Gets (as xml) the "result-to-context" attribute
         */
        com.kyt.xsd.services.InvokeDocument.Invoke.ResultToContext xgetResultToContext();
        
        /**
         * True if has "result-to-context" attribute
         */
        boolean isSetResultToContext();
        
        /**
         * Sets the "result-to-context" attribute
         */
        void setResultToContext(com.kyt.xsd.services.InvokeDocument.Invoke.ResultToContext.Enum resultToContext);
        
        /**
         * Sets (as xml) the "result-to-context" attribute
         */
        void xsetResultToContext(com.kyt.xsd.services.InvokeDocument.Invoke.ResultToContext resultToContext);
        
        /**
         * Unsets the "result-to-context" attribute
         */
        void unsetResultToContext();
        
        /**
         * An XML mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.InvokeDocument$Invoke$Mode.
         */
        public interface Mode extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("mode72b0attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum SYNC = Enum.forString("sync");
            static final Enum ASYNC = Enum.forString("async");
            
            static final int INT_SYNC = Enum.INT_SYNC;
            static final int INT_ASYNC = Enum.INT_ASYNC;
            
            /**
             * Enumeration value class for com.kyt.xsd.services.InvokeDocument$Invoke$Mode.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SYNC
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
                
                static final int INT_SYNC = 1;
                static final int INT_ASYNC = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("sync", INT_SYNC),
                      new Enum("async", INT_ASYNC),
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
                public static com.kyt.xsd.services.InvokeDocument.Invoke.Mode newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.services.InvokeDocument.Invoke.Mode) type.newValue( obj ); }
                
                public static com.kyt.xsd.services.InvokeDocument.Invoke.Mode newInstance() {
                  return (com.kyt.xsd.services.InvokeDocument.Invoke.Mode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.services.InvokeDocument.Invoke.Mode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.services.InvokeDocument.Invoke.Mode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML parameters(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.InvokeDocument$Invoke$Parameters.
         */
        public interface Parameters extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("parameters5237attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum OPTIONAL = Enum.forString("optional");
            static final Enum PRESERVE = Enum.forString("preserve");
            
            static final int INT_OPTIONAL = Enum.INT_OPTIONAL;
            static final int INT_PRESERVE = Enum.INT_PRESERVE;
            
            /**
             * Enumeration value class for com.kyt.xsd.services.InvokeDocument$Invoke$Parameters.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_OPTIONAL
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
                
                static final int INT_OPTIONAL = 1;
                static final int INT_PRESERVE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("optional", INT_OPTIONAL),
                      new Enum("preserve", INT_PRESERVE),
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
                public static com.kyt.xsd.services.InvokeDocument.Invoke.Parameters newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.services.InvokeDocument.Invoke.Parameters) type.newValue( obj ); }
                
                public static com.kyt.xsd.services.InvokeDocument.Invoke.Parameters newInstance() {
                  return (com.kyt.xsd.services.InvokeDocument.Invoke.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.services.InvokeDocument.Invoke.Parameters newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.services.InvokeDocument.Invoke.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML result-to-context(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.InvokeDocument$Invoke$ResultToContext.
         */
        public interface ResultToContext extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultToContext.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("resulttocontext65e2attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.services.InvokeDocument$Invoke$ResultToContext.
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
                public static com.kyt.xsd.services.InvokeDocument.Invoke.ResultToContext newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.services.InvokeDocument.Invoke.ResultToContext) type.newValue( obj ); }
                
                public static com.kyt.xsd.services.InvokeDocument.Invoke.ResultToContext newInstance() {
                  return (com.kyt.xsd.services.InvokeDocument.Invoke.ResultToContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.services.InvokeDocument.Invoke.ResultToContext newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.services.InvokeDocument.Invoke.ResultToContext) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.services.InvokeDocument.Invoke newInstance() {
              return (com.kyt.xsd.services.InvokeDocument.Invoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.services.InvokeDocument.Invoke newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.services.InvokeDocument.Invoke) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.services.InvokeDocument newInstance() {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.services.InvokeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.services.InvokeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.services.InvokeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.services.InvokeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.services.InvokeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.services.InvokeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.services.InvokeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.services.InvokeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.services.InvokeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.services.InvokeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.services.InvokeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.services.InvokeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.services.InvokeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.services.InvokeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.services.InvokeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.services.InvokeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.services.InvokeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.services.InvokeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
