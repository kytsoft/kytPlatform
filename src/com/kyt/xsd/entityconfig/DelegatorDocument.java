/*
 * An XML document type.
 * Localname: delegator
 * Namespace: 
 * Java type: com.kyt.xsd.entityconfig.DelegatorDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityconfig;


/**
 * A document containing one delegator(@) element.
 *
 * This is a complex type.
 */
public interface DelegatorDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DelegatorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("delegator446adoctype");
    
    /**
     * Gets the "delegator" element
     */
    com.kyt.xsd.entityconfig.DelegatorDocument.Delegator getDelegator();
    
    /**
     * Sets the "delegator" element
     */
    void setDelegator(com.kyt.xsd.entityconfig.DelegatorDocument.Delegator delegator);
    
    /**
     * Appends and returns a new empty "delegator" element
     */
    com.kyt.xsd.entityconfig.DelegatorDocument.Delegator addNewDelegator();
    
    /**
     * An XML delegator(@).
     *
     * This is a complex type.
     */
    public interface Delegator extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Delegator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("delegator8129elemtype");
        
        /**
         * Gets array of all "group-map" elements
         */
        com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap[] getGroupMapArray();
        
        /**
         * Gets ith "group-map" element
         */
        com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap getGroupMapArray(int i);
        
        /**
         * Returns number of "group-map" element
         */
        int sizeOfGroupMapArray();
        
        /**
         * Sets array of all "group-map" element
         */
        void setGroupMapArray(com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap[] groupMapArray);
        
        /**
         * Sets ith "group-map" element
         */
        void setGroupMapArray(int i, com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap groupMap);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "group-map" element
         */
        com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap insertNewGroupMap(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "group-map" element
         */
        com.kyt.xsd.entityconfig.GroupMapDocument.GroupMap addNewGroupMap();
        
        /**
         * Removes the ith "group-map" element
         */
        void removeGroupMap(int i);
        
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
         * Gets the "entity-model-reader" attribute
         */
        java.lang.String getEntityModelReader();
        
        /**
         * Gets (as xml) the "entity-model-reader" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityModelReader();
        
        /**
         * Sets the "entity-model-reader" attribute
         */
        void setEntityModelReader(java.lang.String entityModelReader);
        
        /**
         * Sets (as xml) the "entity-model-reader" attribute
         */
        void xsetEntityModelReader(org.apache.xmlbeans.XmlString entityModelReader);
        
        /**
         * Gets the "entity-group-reader" attribute
         */
        java.lang.String getEntityGroupReader();
        
        /**
         * Gets (as xml) the "entity-group-reader" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityGroupReader();
        
        /**
         * Sets the "entity-group-reader" attribute
         */
        void setEntityGroupReader(java.lang.String entityGroupReader);
        
        /**
         * Sets (as xml) the "entity-group-reader" attribute
         */
        void xsetEntityGroupReader(org.apache.xmlbeans.XmlString entityGroupReader);
        
        /**
         * Gets the "entity-eca-reader" attribute
         */
        java.lang.String getEntityEcaReader();
        
        /**
         * Gets (as xml) the "entity-eca-reader" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityEcaReader();
        
        /**
         * True if has "entity-eca-reader" attribute
         */
        boolean isSetEntityEcaReader();
        
        /**
         * Sets the "entity-eca-reader" attribute
         */
        void setEntityEcaReader(java.lang.String entityEcaReader);
        
        /**
         * Sets (as xml) the "entity-eca-reader" attribute
         */
        void xsetEntityEcaReader(org.apache.xmlbeans.XmlString entityEcaReader);
        
        /**
         * Unsets the "entity-eca-reader" attribute
         */
        void unsetEntityEcaReader();
        
        /**
         * Gets the "entity-eca-enabled" attribute
         */
        com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.EntityEcaEnabled.Enum getEntityEcaEnabled();
        
        /**
         * Gets (as xml) the "entity-eca-enabled" attribute
         */
        com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.EntityEcaEnabled xgetEntityEcaEnabled();
        
        /**
         * True if has "entity-eca-enabled" attribute
         */
        boolean isSetEntityEcaEnabled();
        
        /**
         * Sets the "entity-eca-enabled" attribute
         */
        void setEntityEcaEnabled(com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.EntityEcaEnabled.Enum entityEcaEnabled);
        
        /**
         * Sets (as xml) the "entity-eca-enabled" attribute
         */
        void xsetEntityEcaEnabled(com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.EntityEcaEnabled entityEcaEnabled);
        
        /**
         * Unsets the "entity-eca-enabled" attribute
         */
        void unsetEntityEcaEnabled();
        
        /**
         * Gets the "entity-eca-handler-class-name" attribute
         */
        java.lang.String getEntityEcaHandlerClassName();
        
        /**
         * Gets (as xml) the "entity-eca-handler-class-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityEcaHandlerClassName();
        
        /**
         * True if has "entity-eca-handler-class-name" attribute
         */
        boolean isSetEntityEcaHandlerClassName();
        
        /**
         * Sets the "entity-eca-handler-class-name" attribute
         */
        void setEntityEcaHandlerClassName(java.lang.String entityEcaHandlerClassName);
        
        /**
         * Sets (as xml) the "entity-eca-handler-class-name" attribute
         */
        void xsetEntityEcaHandlerClassName(org.apache.xmlbeans.XmlString entityEcaHandlerClassName);
        
        /**
         * Unsets the "entity-eca-handler-class-name" attribute
         */
        void unsetEntityEcaHandlerClassName();
        
        /**
         * Gets the "distributed-cache-clear-enabled" attribute
         */
        com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.DistributedCacheClearEnabled.Enum getDistributedCacheClearEnabled();
        
        /**
         * Gets (as xml) the "distributed-cache-clear-enabled" attribute
         */
        com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.DistributedCacheClearEnabled xgetDistributedCacheClearEnabled();
        
        /**
         * True if has "distributed-cache-clear-enabled" attribute
         */
        boolean isSetDistributedCacheClearEnabled();
        
        /**
         * Sets the "distributed-cache-clear-enabled" attribute
         */
        void setDistributedCacheClearEnabled(com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.DistributedCacheClearEnabled.Enum distributedCacheClearEnabled);
        
        /**
         * Sets (as xml) the "distributed-cache-clear-enabled" attribute
         */
        void xsetDistributedCacheClearEnabled(com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.DistributedCacheClearEnabled distributedCacheClearEnabled);
        
        /**
         * Unsets the "distributed-cache-clear-enabled" attribute
         */
        void unsetDistributedCacheClearEnabled();
        
        /**
         * Gets the "distributed-cache-clear-class-name" attribute
         */
        java.lang.String getDistributedCacheClearClassName();
        
        /**
         * Gets (as xml) the "distributed-cache-clear-class-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetDistributedCacheClearClassName();
        
        /**
         * True if has "distributed-cache-clear-class-name" attribute
         */
        boolean isSetDistributedCacheClearClassName();
        
        /**
         * Sets the "distributed-cache-clear-class-name" attribute
         */
        void setDistributedCacheClearClassName(java.lang.String distributedCacheClearClassName);
        
        /**
         * Sets (as xml) the "distributed-cache-clear-class-name" attribute
         */
        void xsetDistributedCacheClearClassName(org.apache.xmlbeans.XmlString distributedCacheClearClassName);
        
        /**
         * Unsets the "distributed-cache-clear-class-name" attribute
         */
        void unsetDistributedCacheClearClassName();
        
        /**
         * Gets the "distributed-cache-clear-user-login-id" attribute
         */
        java.lang.String getDistributedCacheClearUserLoginId();
        
        /**
         * Gets (as xml) the "distributed-cache-clear-user-login-id" attribute
         */
        org.apache.xmlbeans.XmlString xgetDistributedCacheClearUserLoginId();
        
        /**
         * True if has "distributed-cache-clear-user-login-id" attribute
         */
        boolean isSetDistributedCacheClearUserLoginId();
        
        /**
         * Sets the "distributed-cache-clear-user-login-id" attribute
         */
        void setDistributedCacheClearUserLoginId(java.lang.String distributedCacheClearUserLoginId);
        
        /**
         * Sets (as xml) the "distributed-cache-clear-user-login-id" attribute
         */
        void xsetDistributedCacheClearUserLoginId(org.apache.xmlbeans.XmlString distributedCacheClearUserLoginId);
        
        /**
         * Unsets the "distributed-cache-clear-user-login-id" attribute
         */
        void unsetDistributedCacheClearUserLoginId();
        
        /**
         * Gets the "sequenced-id-prefix" attribute
         */
        java.lang.String getSequencedIdPrefix();
        
        /**
         * Gets (as xml) the "sequenced-id-prefix" attribute
         */
        org.apache.xmlbeans.XmlString xgetSequencedIdPrefix();
        
        /**
         * True if has "sequenced-id-prefix" attribute
         */
        boolean isSetSequencedIdPrefix();
        
        /**
         * Sets the "sequenced-id-prefix" attribute
         */
        void setSequencedIdPrefix(java.lang.String sequencedIdPrefix);
        
        /**
         * Sets (as xml) the "sequenced-id-prefix" attribute
         */
        void xsetSequencedIdPrefix(org.apache.xmlbeans.XmlString sequencedIdPrefix);
        
        /**
         * Unsets the "sequenced-id-prefix" attribute
         */
        void unsetSequencedIdPrefix();
        
        /**
         * Gets the "default-group-name" attribute
         */
        java.lang.String getDefaultGroupName();
        
        /**
         * Gets (as xml) the "default-group-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultGroupName();
        
        /**
         * True if has "default-group-name" attribute
         */
        boolean isSetDefaultGroupName();
        
        /**
         * Sets the "default-group-name" attribute
         */
        void setDefaultGroupName(java.lang.String defaultGroupName);
        
        /**
         * Sets (as xml) the "default-group-name" attribute
         */
        void xsetDefaultGroupName(org.apache.xmlbeans.XmlString defaultGroupName);
        
        /**
         * Unsets the "default-group-name" attribute
         */
        void unsetDefaultGroupName();
        
        /**
         * An XML entity-eca-enabled(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityconfig.DelegatorDocument$Delegator$EntityEcaEnabled.
         */
        public interface EntityEcaEnabled extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityEcaEnabled.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("entityecaenabledbf56attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.entityconfig.DelegatorDocument$Delegator$EntityEcaEnabled.
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
                public static com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.EntityEcaEnabled newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.EntityEcaEnabled) type.newValue( obj ); }
                
                public static com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.EntityEcaEnabled newInstance() {
                  return (com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.EntityEcaEnabled) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.EntityEcaEnabled newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.EntityEcaEnabled) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML distributed-cache-clear-enabled(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityconfig.DelegatorDocument$Delegator$DistributedCacheClearEnabled.
         */
        public interface DistributedCacheClearEnabled extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DistributedCacheClearEnabled.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s639A325F09F55B752D313518FEEF60AC").resolveHandle("distributedcacheclearenabledcc1dattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.entityconfig.DelegatorDocument$Delegator$DistributedCacheClearEnabled.
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
                public static com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.DistributedCacheClearEnabled newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.DistributedCacheClearEnabled) type.newValue( obj ); }
                
                public static com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.DistributedCacheClearEnabled newInstance() {
                  return (com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.DistributedCacheClearEnabled) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.DistributedCacheClearEnabled newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.entityconfig.DelegatorDocument.Delegator.DistributedCacheClearEnabled) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.entityconfig.DelegatorDocument.Delegator newInstance() {
              return (com.kyt.xsd.entityconfig.DelegatorDocument.Delegator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.entityconfig.DelegatorDocument.Delegator newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.entityconfig.DelegatorDocument.Delegator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.entityconfig.DelegatorDocument newInstance() {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.entityconfig.DelegatorDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.entityconfig.DelegatorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.entityconfig.DelegatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
