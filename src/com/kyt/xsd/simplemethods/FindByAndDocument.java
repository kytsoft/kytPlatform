/*
 * An XML document type.
 * Localname: find-by-and
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.FindByAndDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one find-by-and(@) element.
 *
 * This is a complex type.
 */
public interface FindByAndDocument extends com.kyt.xsd.simplemethods.EntityFindOperationsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FindByAndDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("findbyand5bdcdoctype");
    
    /**
     * Gets the "find-by-and" element
     */
    com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd getFindByAnd();
    
    /**
     * Sets the "find-by-and" element
     */
    void setFindByAnd(com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd findByAnd);
    
    /**
     * Appends and returns a new empty "find-by-and" element
     */
    com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd addNewFindByAnd();
    
    /**
     * An XML find-by-and(@).
     *
     * This is a complex type.
     */
    public interface FindByAnd extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FindByAnd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("findbyand8c8delemtype");
        
        /**
         * Gets the "entity-name" attribute
         */
        java.lang.String getEntityName();
        
        /**
         * Gets (as xml) the "entity-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityName();
        
        /**
         * Sets the "entity-name" attribute
         */
        void setEntityName(java.lang.String entityName);
        
        /**
         * Sets (as xml) the "entity-name" attribute
         */
        void xsetEntityName(org.apache.xmlbeans.XmlString entityName);
        
        /**
         * Gets the "map" attribute
         */
        java.lang.String getMap();
        
        /**
         * Gets (as xml) the "map" attribute
         */
        org.apache.xmlbeans.XmlString xgetMap();
        
        /**
         * Sets the "map" attribute
         */
        void setMap(java.lang.String map);
        
        /**
         * Sets (as xml) the "map" attribute
         */
        void xsetMap(org.apache.xmlbeans.XmlString map);
        
        /**
         * Gets the "order-by-list" attribute
         */
        java.lang.String getOrderByList();
        
        /**
         * Gets (as xml) the "order-by-list" attribute
         */
        org.apache.xmlbeans.XmlString xgetOrderByList();
        
        /**
         * True if has "order-by-list" attribute
         */
        boolean isSetOrderByList();
        
        /**
         * Sets the "order-by-list" attribute
         */
        void setOrderByList(java.lang.String orderByList);
        
        /**
         * Sets (as xml) the "order-by-list" attribute
         */
        void xsetOrderByList(org.apache.xmlbeans.XmlString orderByList);
        
        /**
         * Unsets the "order-by-list" attribute
         */
        void unsetOrderByList();
        
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
         * Gets the "use-cache" attribute
         */
        java.lang.String getUseCache();
        
        /**
         * Gets (as xml) the "use-cache" attribute
         */
        org.apache.xmlbeans.XmlString xgetUseCache();
        
        /**
         * True if has "use-cache" attribute
         */
        boolean isSetUseCache();
        
        /**
         * Sets the "use-cache" attribute
         */
        void setUseCache(java.lang.String useCache);
        
        /**
         * Sets (as xml) the "use-cache" attribute
         */
        void xsetUseCache(org.apache.xmlbeans.XmlString useCache);
        
        /**
         * Unsets the "use-cache" attribute
         */
        void unsetUseCache();
        
        /**
         * Gets the "use-iterator" attribute
         */
        com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator.Enum getUseIterator();
        
        /**
         * Gets (as xml) the "use-iterator" attribute
         */
        com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator xgetUseIterator();
        
        /**
         * True if has "use-iterator" attribute
         */
        boolean isSetUseIterator();
        
        /**
         * Sets the "use-iterator" attribute
         */
        void setUseIterator(com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator.Enum useIterator);
        
        /**
         * Sets (as xml) the "use-iterator" attribute
         */
        void xsetUseIterator(com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator useIterator);
        
        /**
         * Unsets the "use-iterator" attribute
         */
        void unsetUseIterator();
        
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
         * An XML use-iterator(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.FindByAndDocument$FindByAnd$UseIterator.
         */
        public interface UseIterator extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UseIterator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("useiterator32a1attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.FindByAndDocument$FindByAnd$UseIterator.
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
                public static com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator newInstance() {
                  return (com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd.UseIterator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd newInstance() {
              return (com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.FindByAndDocument.FindByAnd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.FindByAndDocument newInstance() {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.FindByAndDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.FindByAndDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.FindByAndDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
