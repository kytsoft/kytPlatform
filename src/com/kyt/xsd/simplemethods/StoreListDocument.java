/*
 * An XML document type.
 * Localname: store-list
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.StoreListDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one store-list(@) element.
 *
 * This is a complex type.
 */
public interface StoreListDocument extends com.kyt.xsd.simplemethods.EntityListOperationsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StoreListDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("storelistc343doctype");
    
    /**
     * Gets the "store-list" element
     */
    com.kyt.xsd.simplemethods.StoreListDocument.StoreList getStoreList();
    
    /**
     * Sets the "store-list" element
     */
    void setStoreList(com.kyt.xsd.simplemethods.StoreListDocument.StoreList storeList);
    
    /**
     * Appends and returns a new empty "store-list" element
     */
    com.kyt.xsd.simplemethods.StoreListDocument.StoreList addNewStoreList();
    
    /**
     * An XML store-list(@).
     *
     * This is a complex type.
     */
    public interface StoreList extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StoreList.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("storeliste86delemtype");
        
        /**
         * Gets the "list" attribute
         */
        java.lang.String getList();
        
        /**
         * Gets (as xml) the "list" attribute
         */
        org.apache.xmlbeans.XmlString xgetList();
        
        /**
         * Sets the "list" attribute
         */
        void setList(java.lang.String list);
        
        /**
         * Sets (as xml) the "list" attribute
         */
        void xsetList(org.apache.xmlbeans.XmlString list);
        
        /**
         * Gets the "do-cache-clear" attribute
         */
        com.kyt.xsd.simplemethods.StoreListDocument.StoreList.DoCacheClear.Enum getDoCacheClear();
        
        /**
         * Gets (as xml) the "do-cache-clear" attribute
         */
        com.kyt.xsd.simplemethods.StoreListDocument.StoreList.DoCacheClear xgetDoCacheClear();
        
        /**
         * True if has "do-cache-clear" attribute
         */
        boolean isSetDoCacheClear();
        
        /**
         * Sets the "do-cache-clear" attribute
         */
        void setDoCacheClear(com.kyt.xsd.simplemethods.StoreListDocument.StoreList.DoCacheClear.Enum doCacheClear);
        
        /**
         * Sets (as xml) the "do-cache-clear" attribute
         */
        void xsetDoCacheClear(com.kyt.xsd.simplemethods.StoreListDocument.StoreList.DoCacheClear doCacheClear);
        
        /**
         * Unsets the "do-cache-clear" attribute
         */
        void unsetDoCacheClear();
        
        /**
         * An XML do-cache-clear(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.StoreListDocument$StoreList$DoCacheClear.
         */
        public interface DoCacheClear extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DoCacheClear.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("docacheclear5d8dattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.StoreListDocument$StoreList$DoCacheClear.
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
                public static com.kyt.xsd.simplemethods.StoreListDocument.StoreList.DoCacheClear newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.StoreListDocument.StoreList.DoCacheClear) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.StoreListDocument.StoreList.DoCacheClear newInstance() {
                  return (com.kyt.xsd.simplemethods.StoreListDocument.StoreList.DoCacheClear) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.StoreListDocument.StoreList.DoCacheClear newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.StoreListDocument.StoreList.DoCacheClear) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.StoreListDocument.StoreList newInstance() {
              return (com.kyt.xsd.simplemethods.StoreListDocument.StoreList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.StoreListDocument.StoreList newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.StoreListDocument.StoreList) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.StoreListDocument newInstance() {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.StoreListDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.StoreListDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.StoreListDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
