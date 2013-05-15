/*
 * An XML document type.
 * Localname: request-map
 * Namespace: 
 * Java type: com.kyt.xsd.siteconf.RequestMapDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.siteconf;


/**
 * A document containing one request-map(@) element.
 *
 * This is a complex type.
 */
public interface RequestMapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestMapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s84D90CD5D79D0AAA45EE7E769F6351B0").resolveHandle("requestmap4f05doctype");
    
    /**
     * Gets the "request-map" element
     */
    com.kyt.xsd.siteconf.RequestMapDocument.RequestMap getRequestMap();
    
    /**
     * Sets the "request-map" element
     */
    void setRequestMap(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap requestMap);
    
    /**
     * Appends and returns a new empty "request-map" element
     */
    com.kyt.xsd.siteconf.RequestMapDocument.RequestMap addNewRequestMap();
    
    /**
     * An XML request-map(@).
     *
     * This is a complex type.
     */
    public interface RequestMap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestMap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s84D90CD5D79D0AAA45EE7E769F6351B0").resolveHandle("requestmap371felemtype");
        
        /**
         * Gets the "description" element
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" element
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * True if has "description" element
         */
        boolean isSetDescription();
        
        /**
         * Sets the "description" element
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" element
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Unsets the "description" element
         */
        void unsetDescription();
        
        /**
         * Gets the "security" element
         */
        com.kyt.xsd.siteconf.SecurityDocument.Security getSecurity();
        
        /**
         * True if has "security" element
         */
        boolean isSetSecurity();
        
        /**
         * Sets the "security" element
         */
        void setSecurity(com.kyt.xsd.siteconf.SecurityDocument.Security security);
        
        /**
         * Appends and returns a new empty "security" element
         */
        com.kyt.xsd.siteconf.SecurityDocument.Security addNewSecurity();
        
        /**
         * Unsets the "security" element
         */
        void unsetSecurity();
        
        /**
         * Gets the "metric" element
         */
        com.kyt.xsd.siteconf.MetricDocument.Metric getMetric();
        
        /**
         * True if has "metric" element
         */
        boolean isSetMetric();
        
        /**
         * Sets the "metric" element
         */
        void setMetric(com.kyt.xsd.siteconf.MetricDocument.Metric metric);
        
        /**
         * Appends and returns a new empty "metric" element
         */
        com.kyt.xsd.siteconf.MetricDocument.Metric addNewMetric();
        
        /**
         * Unsets the "metric" element
         */
        void unsetMetric();
        
        /**
         * Gets the "event" element
         */
        com.kyt.xsd.siteconf.EventDocument.Event getEvent();
        
        /**
         * True if has "event" element
         */
        boolean isSetEvent();
        
        /**
         * Sets the "event" element
         */
        void setEvent(com.kyt.xsd.siteconf.EventDocument.Event event);
        
        /**
         * Appends and returns a new empty "event" element
         */
        com.kyt.xsd.siteconf.EventDocument.Event addNewEvent();
        
        /**
         * Unsets the "event" element
         */
        void unsetEvent();
        
        /**
         * Gets array of all "response" elements
         */
        com.kyt.xsd.siteconf.ResponseDocument.Response[] getResponseArray();
        
        /**
         * Gets ith "response" element
         */
        com.kyt.xsd.siteconf.ResponseDocument.Response getResponseArray(int i);
        
        /**
         * Returns number of "response" element
         */
        int sizeOfResponseArray();
        
        /**
         * Sets array of all "response" element
         */
        void setResponseArray(com.kyt.xsd.siteconf.ResponseDocument.Response[] responseArray);
        
        /**
         * Sets ith "response" element
         */
        void setResponseArray(int i, com.kyt.xsd.siteconf.ResponseDocument.Response response);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "response" element
         */
        com.kyt.xsd.siteconf.ResponseDocument.Response insertNewResponse(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "response" element
         */
        com.kyt.xsd.siteconf.ResponseDocument.Response addNewResponse();
        
        /**
         * Removes the ith "response" element
         */
        void removeResponse(int i);
        
        /**
         * Gets the "uri" attribute
         */
        java.lang.String getUri();
        
        /**
         * Gets (as xml) the "uri" attribute
         */
        org.apache.xmlbeans.XmlString xgetUri();
        
        /**
         * Sets the "uri" attribute
         */
        void setUri(java.lang.String uri);
        
        /**
         * Sets (as xml) the "uri" attribute
         */
        void xsetUri(org.apache.xmlbeans.XmlString uri);
        
        /**
         * Gets the "edit" attribute
         */
        com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit.Enum getEdit();
        
        /**
         * Gets (as xml) the "edit" attribute
         */
        com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit xgetEdit();
        
        /**
         * True if has "edit" attribute
         */
        boolean isSetEdit();
        
        /**
         * Sets the "edit" attribute
         */
        void setEdit(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit.Enum edit);
        
        /**
         * Sets (as xml) the "edit" attribute
         */
        void xsetEdit(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit edit);
        
        /**
         * Unsets the "edit" attribute
         */
        void unsetEdit();
        
        /**
         * Gets the "track-visit" attribute
         */
        com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit.Enum getTrackVisit();
        
        /**
         * Gets (as xml) the "track-visit" attribute
         */
        com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit xgetTrackVisit();
        
        /**
         * True if has "track-visit" attribute
         */
        boolean isSetTrackVisit();
        
        /**
         * Sets the "track-visit" attribute
         */
        void setTrackVisit(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit.Enum trackVisit);
        
        /**
         * Sets (as xml) the "track-visit" attribute
         */
        void xsetTrackVisit(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit trackVisit);
        
        /**
         * Unsets the "track-visit" attribute
         */
        void unsetTrackVisit();
        
        /**
         * Gets the "track-serverhit" attribute
         */
        com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit.Enum getTrackServerhit();
        
        /**
         * Gets (as xml) the "track-serverhit" attribute
         */
        com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit xgetTrackServerhit();
        
        /**
         * True if has "track-serverhit" attribute
         */
        boolean isSetTrackServerhit();
        
        /**
         * Sets the "track-serverhit" attribute
         */
        void setTrackServerhit(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit.Enum trackServerhit);
        
        /**
         * Sets (as xml) the "track-serverhit" attribute
         */
        void xsetTrackServerhit(com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit trackServerhit);
        
        /**
         * Unsets the "track-serverhit" attribute
         */
        void unsetTrackServerhit();
        
        /**
         * An XML edit(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.RequestMapDocument$RequestMap$Edit.
         */
        public interface Edit extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Edit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s84D90CD5D79D0AAA45EE7E769F6351B0").resolveHandle("editbc49attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.siteconf.RequestMapDocument$RequestMap$Edit.
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
                public static com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit) type.newValue( obj ); }
                
                public static com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit newInstance() {
                  return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.Edit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML track-visit(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.RequestMapDocument$RequestMap$TrackVisit.
         */
        public interface TrackVisit extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TrackVisit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s84D90CD5D79D0AAA45EE7E769F6351B0").resolveHandle("trackvisit3050attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.siteconf.RequestMapDocument$RequestMap$TrackVisit.
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
                public static com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit) type.newValue( obj ); }
                
                public static com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit newInstance() {
                  return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackVisit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML track-serverhit(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.RequestMapDocument$RequestMap$TrackServerhit.
         */
        public interface TrackServerhit extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TrackServerhit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s84D90CD5D79D0AAA45EE7E769F6351B0").resolveHandle("trackserverhit61f5attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.siteconf.RequestMapDocument$RequestMap$TrackServerhit.
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
                public static com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit) type.newValue( obj ); }
                
                public static com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit newInstance() {
                  return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap.TrackServerhit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.siteconf.RequestMapDocument.RequestMap newInstance() {
              return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.siteconf.RequestMapDocument.RequestMap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.siteconf.RequestMapDocument.RequestMap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.siteconf.RequestMapDocument newInstance() {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.siteconf.RequestMapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.siteconf.RequestMapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.siteconf.RequestMapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
