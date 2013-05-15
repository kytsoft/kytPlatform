/*
 * An XML document type.
 * Localname: sub-hyperlink
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.SubHyperlinkDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one sub-hyperlink(@) element.
 *
 * This is a complex type.
 */
public interface SubHyperlinkDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubHyperlinkDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("subhyperlinked40doctype");
    
    /**
     * Gets the "sub-hyperlink" element
     */
    com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink getSubHyperlink();
    
    /**
     * Sets the "sub-hyperlink" element
     */
    void setSubHyperlink(com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink subHyperlink);
    
    /**
     * Appends and returns a new empty "sub-hyperlink" element
     */
    com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink addNewSubHyperlink();
    
    /**
     * An XML sub-hyperlink(@).
     *
     * This is a complex type.
     */
    public interface SubHyperlink extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubHyperlink.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("subhyperlink1ed5elemtype");
        
        /**
         * Gets array of all "parameter" elements
         */
        com.kyt.xsd.widgetform.ParameterDocument.Parameter[] getParameterArray();
        
        /**
         * Gets ith "parameter" element
         */
        com.kyt.xsd.widgetform.ParameterDocument.Parameter getParameterArray(int i);
        
        /**
         * Returns number of "parameter" element
         */
        int sizeOfParameterArray();
        
        /**
         * Sets array of all "parameter" element
         */
        void setParameterArray(com.kyt.xsd.widgetform.ParameterDocument.Parameter[] parameterArray);
        
        /**
         * Sets ith "parameter" element
         */
        void setParameterArray(int i, com.kyt.xsd.widgetform.ParameterDocument.Parameter parameter);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "parameter" element
         */
        com.kyt.xsd.widgetform.ParameterDocument.Parameter insertNewParameter(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "parameter" element
         */
        com.kyt.xsd.widgetform.ParameterDocument.Parameter addNewParameter();
        
        /**
         * Removes the ith "parameter" element
         */
        void removeParameter(int i);
        
        /**
         * Gets the "use-when" attribute
         */
        java.lang.String getUseWhen();
        
        /**
         * Gets (as xml) the "use-when" attribute
         */
        org.apache.xmlbeans.XmlString xgetUseWhen();
        
        /**
         * True if has "use-when" attribute
         */
        boolean isSetUseWhen();
        
        /**
         * Sets the "use-when" attribute
         */
        void setUseWhen(java.lang.String useWhen);
        
        /**
         * Sets (as xml) the "use-when" attribute
         */
        void xsetUseWhen(org.apache.xmlbeans.XmlString useWhen);
        
        /**
         * Unsets the "use-when" attribute
         */
        void unsetUseWhen();
        
        /**
         * Gets the "link-style" attribute
         */
        java.lang.String getLinkStyle();
        
        /**
         * Gets (as xml) the "link-style" attribute
         */
        org.apache.xmlbeans.XmlString xgetLinkStyle();
        
        /**
         * True if has "link-style" attribute
         */
        boolean isSetLinkStyle();
        
        /**
         * Sets the "link-style" attribute
         */
        void setLinkStyle(java.lang.String linkStyle);
        
        /**
         * Sets (as xml) the "link-style" attribute
         */
        void xsetLinkStyle(org.apache.xmlbeans.XmlString linkStyle);
        
        /**
         * Unsets the "link-style" attribute
         */
        void unsetLinkStyle();
        
        /**
         * Gets the "link-type" attribute
         */
        com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.LinkType.Enum getLinkType();
        
        /**
         * Gets (as xml) the "link-type" attribute
         */
        com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.LinkType xgetLinkType();
        
        /**
         * True if has "link-type" attribute
         */
        boolean isSetLinkType();
        
        /**
         * Sets the "link-type" attribute
         */
        void setLinkType(com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.LinkType.Enum linkType);
        
        /**
         * Sets (as xml) the "link-type" attribute
         */
        void xsetLinkType(com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.LinkType linkType);
        
        /**
         * Unsets the "link-type" attribute
         */
        void unsetLinkType();
        
        /**
         * Gets the "target-type" attribute
         */
        com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.TargetType.Enum getTargetType();
        
        /**
         * Gets (as xml) the "target-type" attribute
         */
        com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.TargetType xgetTargetType();
        
        /**
         * True if has "target-type" attribute
         */
        boolean isSetTargetType();
        
        /**
         * Sets the "target-type" attribute
         */
        void setTargetType(com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.TargetType.Enum targetType);
        
        /**
         * Sets (as xml) the "target-type" attribute
         */
        void xsetTargetType(com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.TargetType targetType);
        
        /**
         * Unsets the "target-type" attribute
         */
        void unsetTargetType();
        
        /**
         * Gets the "target" attribute
         */
        java.lang.String getTarget();
        
        /**
         * Gets (as xml) the "target" attribute
         */
        org.apache.xmlbeans.XmlString xgetTarget();
        
        /**
         * Sets the "target" attribute
         */
        void setTarget(java.lang.String target);
        
        /**
         * Sets (as xml) the "target" attribute
         */
        void xsetTarget(org.apache.xmlbeans.XmlString target);
        
        /**
         * Gets the "description" attribute
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" attribute
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * True if has "description" attribute
         */
        boolean isSetDescription();
        
        /**
         * Sets the "description" attribute
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" attribute
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Unsets the "description" attribute
         */
        void unsetDescription();
        
        /**
         * Gets the "target-window" attribute
         */
        java.lang.String getTargetWindow();
        
        /**
         * Gets (as xml) the "target-window" attribute
         */
        org.apache.xmlbeans.XmlString xgetTargetWindow();
        
        /**
         * True if has "target-window" attribute
         */
        boolean isSetTargetWindow();
        
        /**
         * Sets the "target-window" attribute
         */
        void setTargetWindow(java.lang.String targetWindow);
        
        /**
         * Sets (as xml) the "target-window" attribute
         */
        void xsetTargetWindow(org.apache.xmlbeans.XmlString targetWindow);
        
        /**
         * Unsets the "target-window" attribute
         */
        void unsetTargetWindow();
        
        /**
         * An XML link-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.SubHyperlinkDocument$SubHyperlink$LinkType.
         */
        public interface LinkType extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LinkType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("linktypecf6aattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum AUTO = Enum.forString("auto");
            static final Enum ANCHOR = Enum.forString("anchor");
            static final Enum HIDDEN_FORM = Enum.forString("hidden-form");
            
            static final int INT_AUTO = Enum.INT_AUTO;
            static final int INT_ANCHOR = Enum.INT_ANCHOR;
            static final int INT_HIDDEN_FORM = Enum.INT_HIDDEN_FORM;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.SubHyperlinkDocument$SubHyperlink$LinkType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_AUTO
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
                
                static final int INT_AUTO = 1;
                static final int INT_ANCHOR = 2;
                static final int INT_HIDDEN_FORM = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("auto", INT_AUTO),
                      new Enum("anchor", INT_ANCHOR),
                      new Enum("hidden-form", INT_HIDDEN_FORM),
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
                public static com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.LinkType newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.LinkType) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.LinkType newInstance() {
                  return (com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.LinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.LinkType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.LinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML target-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.SubHyperlinkDocument$SubHyperlink$TargetType.
         */
        public interface TargetType extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TargetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("targettypec733attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum INTRA_APP = Enum.forString("intra-app");
            static final Enum INTER_APP = Enum.forString("inter-app");
            static final Enum CONTENT = Enum.forString("content");
            static final Enum PLAIN = Enum.forString("plain");
            
            static final int INT_INTRA_APP = Enum.INT_INTRA_APP;
            static final int INT_INTER_APP = Enum.INT_INTER_APP;
            static final int INT_CONTENT = Enum.INT_CONTENT;
            static final int INT_PLAIN = Enum.INT_PLAIN;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.SubHyperlinkDocument$SubHyperlink$TargetType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_INTRA_APP
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
                
                static final int INT_INTRA_APP = 1;
                static final int INT_INTER_APP = 2;
                static final int INT_CONTENT = 3;
                static final int INT_PLAIN = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("intra-app", INT_INTRA_APP),
                      new Enum("inter-app", INT_INTER_APP),
                      new Enum("content", INT_CONTENT),
                      new Enum("plain", INT_PLAIN),
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
                public static com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.TargetType newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.TargetType) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.TargetType newInstance() {
                  return (com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.TargetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.TargetType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink.TargetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink newInstance() {
              return (com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.SubHyperlinkDocument.SubHyperlink) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument newInstance() {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.SubHyperlinkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.SubHyperlinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
