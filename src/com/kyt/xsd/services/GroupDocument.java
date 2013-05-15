/*
 * An XML document type.
 * Localname: group
 * Namespace: 
 * Java type: com.kyt.xsd.services.GroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.services;


/**
 * A document containing one group(@) element.
 *
 * This is a complex type.
 */
public interface GroupDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GroupDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("group51a6doctype");
    
    /**
     * Gets the "group" element
     */
    com.kyt.xsd.services.GroupDocument.Group getGroup();
    
    /**
     * Sets the "group" element
     */
    void setGroup(com.kyt.xsd.services.GroupDocument.Group group);
    
    /**
     * Appends and returns a new empty "group" element
     */
    com.kyt.xsd.services.GroupDocument.Group addNewGroup();
    
    /**
     * An XML group(@).
     *
     * This is a complex type.
     */
    public interface Group extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Group.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("group67a1elemtype");
        
        /**
         * Gets array of all "invoke" elements
         */
        com.kyt.xsd.services.InvokeDocument.Invoke[] getInvokeArray();
        
        /**
         * Gets ith "invoke" element
         */
        com.kyt.xsd.services.InvokeDocument.Invoke getInvokeArray(int i);
        
        /**
         * Returns number of "invoke" element
         */
        int sizeOfInvokeArray();
        
        /**
         * Sets array of all "invoke" element
         */
        void setInvokeArray(com.kyt.xsd.services.InvokeDocument.Invoke[] invokeArray);
        
        /**
         * Sets ith "invoke" element
         */
        void setInvokeArray(int i, com.kyt.xsd.services.InvokeDocument.Invoke invoke);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "invoke" element
         */
        com.kyt.xsd.services.InvokeDocument.Invoke insertNewInvoke(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "invoke" element
         */
        com.kyt.xsd.services.InvokeDocument.Invoke addNewInvoke();
        
        /**
         * Removes the ith "invoke" element
         */
        void removeInvoke(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
        /**
         * Gets the "send-mode" attribute
         */
        com.kyt.xsd.services.GroupDocument.Group.SendMode.Enum getSendMode();
        
        /**
         * Gets (as xml) the "send-mode" attribute
         */
        com.kyt.xsd.services.GroupDocument.Group.SendMode xgetSendMode();
        
        /**
         * True if has "send-mode" attribute
         */
        boolean isSetSendMode();
        
        /**
         * Sets the "send-mode" attribute
         */
        void setSendMode(com.kyt.xsd.services.GroupDocument.Group.SendMode.Enum sendMode);
        
        /**
         * Sets (as xml) the "send-mode" attribute
         */
        void xsetSendMode(com.kyt.xsd.services.GroupDocument.Group.SendMode sendMode);
        
        /**
         * Unsets the "send-mode" attribute
         */
        void unsetSendMode();
        
        /**
         * An XML send-mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.GroupDocument$Group$SendMode.
         */
        public interface SendMode extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendMode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("sendmode5fd1attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum NONE = Enum.forString("none");
            static final Enum ALL = Enum.forString("all");
            static final Enum FIRST_AVAILABLE = Enum.forString("first-available");
            static final Enum RANDOM = Enum.forString("random");
            static final Enum ROUND_ROBIN = Enum.forString("round-robin");
            
            static final int INT_NONE = Enum.INT_NONE;
            static final int INT_ALL = Enum.INT_ALL;
            static final int INT_FIRST_AVAILABLE = Enum.INT_FIRST_AVAILABLE;
            static final int INT_RANDOM = Enum.INT_RANDOM;
            static final int INT_ROUND_ROBIN = Enum.INT_ROUND_ROBIN;
            
            /**
             * Enumeration value class for com.kyt.xsd.services.GroupDocument$Group$SendMode.
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
                public static com.kyt.xsd.services.GroupDocument.Group.SendMode newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.services.GroupDocument.Group.SendMode) type.newValue( obj ); }
                
                public static com.kyt.xsd.services.GroupDocument.Group.SendMode newInstance() {
                  return (com.kyt.xsd.services.GroupDocument.Group.SendMode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.services.GroupDocument.Group.SendMode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.services.GroupDocument.Group.SendMode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.services.GroupDocument.Group newInstance() {
              return (com.kyt.xsd.services.GroupDocument.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.services.GroupDocument.Group newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.services.GroupDocument.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.services.GroupDocument newInstance() {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.services.GroupDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.services.GroupDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.services.GroupDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.services.GroupDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.services.GroupDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.services.GroupDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.services.GroupDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.services.GroupDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.services.GroupDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.services.GroupDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.services.GroupDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.services.GroupDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.services.GroupDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.services.GroupDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.services.GroupDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.services.GroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.services.GroupDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.services.GroupDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
