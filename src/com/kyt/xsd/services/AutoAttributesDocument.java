/*
 * An XML document type.
 * Localname: auto-attributes
 * Namespace: 
 * Java type: com.kyt.xsd.services.AutoAttributesDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.services;


/**
 * A document containing one auto-attributes(@) element.
 *
 * This is a complex type.
 */
public interface AutoAttributesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AutoAttributesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("autoattributesfa9cdoctype");
    
    /**
     * Gets the "auto-attributes" element
     */
    com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes getAutoAttributes();
    
    /**
     * Sets the "auto-attributes" element
     */
    void setAutoAttributes(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes autoAttributes);
    
    /**
     * Appends and returns a new empty "auto-attributes" element
     */
    com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes addNewAutoAttributes();
    
    /**
     * An XML auto-attributes(@).
     *
     * This is a complex type.
     */
    public interface AutoAttributes extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AutoAttributes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("autoattributes490delemtype");
        
        /**
         * Gets array of all "exclude" elements
         */
        com.kyt.xsd.services.ExcludeDocument.Exclude[] getExcludeArray();
        
        /**
         * Gets ith "exclude" element
         */
        com.kyt.xsd.services.ExcludeDocument.Exclude getExcludeArray(int i);
        
        /**
         * Returns number of "exclude" element
         */
        int sizeOfExcludeArray();
        
        /**
         * Sets array of all "exclude" element
         */
        void setExcludeArray(com.kyt.xsd.services.ExcludeDocument.Exclude[] excludeArray);
        
        /**
         * Sets ith "exclude" element
         */
        void setExcludeArray(int i, com.kyt.xsd.services.ExcludeDocument.Exclude exclude);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "exclude" element
         */
        com.kyt.xsd.services.ExcludeDocument.Exclude insertNewExclude(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "exclude" element
         */
        com.kyt.xsd.services.ExcludeDocument.Exclude addNewExclude();
        
        /**
         * Removes the ith "exclude" element
         */
        void removeExclude(int i);
        
        /**
         * Gets the "entity-name" attribute
         */
        java.lang.String getEntityName();
        
        /**
         * Gets (as xml) the "entity-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetEntityName();
        
        /**
         * True if has "entity-name" attribute
         */
        boolean isSetEntityName();
        
        /**
         * Sets the "entity-name" attribute
         */
        void setEntityName(java.lang.String entityName);
        
        /**
         * Sets (as xml) the "entity-name" attribute
         */
        void xsetEntityName(org.apache.xmlbeans.XmlString entityName);
        
        /**
         * Unsets the "entity-name" attribute
         */
        void unsetEntityName();
        
        /**
         * Gets the "include" attribute
         */
        com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include.Enum getInclude();
        
        /**
         * Gets (as xml) the "include" attribute
         */
        com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include xgetInclude();
        
        /**
         * True if has "include" attribute
         */
        boolean isSetInclude();
        
        /**
         * Sets the "include" attribute
         */
        void setInclude(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include.Enum include);
        
        /**
         * Sets (as xml) the "include" attribute
         */
        void xsetInclude(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include include);
        
        /**
         * Unsets the "include" attribute
         */
        void unsetInclude();
        
        /**
         * Gets the "mode" attribute
         */
        com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode.Enum getMode();
        
        /**
         * Gets (as xml) the "mode" attribute
         */
        com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode xgetMode();
        
        /**
         * Sets the "mode" attribute
         */
        void setMode(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode.Enum mode);
        
        /**
         * Sets (as xml) the "mode" attribute
         */
        void xsetMode(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode mode);
        
        /**
         * Gets the "optional" attribute
         */
        com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional.Enum getOptional();
        
        /**
         * Gets (as xml) the "optional" attribute
         */
        com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional xgetOptional();
        
        /**
         * True if has "optional" attribute
         */
        boolean isSetOptional();
        
        /**
         * Sets the "optional" attribute
         */
        void setOptional(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional.Enum optional);
        
        /**
         * Sets (as xml) the "optional" attribute
         */
        void xsetOptional(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional optional);
        
        /**
         * Unsets the "optional" attribute
         */
        void unsetOptional();
        
        /**
         * Gets the "form-display" attribute
         */
        com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay.Enum getFormDisplay();
        
        /**
         * Gets (as xml) the "form-display" attribute
         */
        com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay xgetFormDisplay();
        
        /**
         * True if has "form-display" attribute
         */
        boolean isSetFormDisplay();
        
        /**
         * Sets the "form-display" attribute
         */
        void setFormDisplay(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay.Enum formDisplay);
        
        /**
         * Sets (as xml) the "form-display" attribute
         */
        void xsetFormDisplay(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay formDisplay);
        
        /**
         * Unsets the "form-display" attribute
         */
        void unsetFormDisplay();
        
        /**
         * Gets the "allow-html" attribute
         */
        com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml.Enum getAllowHtml();
        
        /**
         * Gets (as xml) the "allow-html" attribute
         */
        com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml xgetAllowHtml();
        
        /**
         * True if has "allow-html" attribute
         */
        boolean isSetAllowHtml();
        
        /**
         * Sets the "allow-html" attribute
         */
        void setAllowHtml(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml.Enum allowHtml);
        
        /**
         * Sets (as xml) the "allow-html" attribute
         */
        void xsetAllowHtml(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml allowHtml);
        
        /**
         * Unsets the "allow-html" attribute
         */
        void unsetAllowHtml();
        
        /**
         * An XML include(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$Include.
         */
        public interface Include extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Include.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("include361dattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum PK = Enum.forString("pk");
            static final Enum NONPK = Enum.forString("nonpk");
            static final Enum ALL = Enum.forString("all");
            
            static final int INT_PK = Enum.INT_PK;
            static final int INT_NONPK = Enum.INT_NONPK;
            static final int INT_ALL = Enum.INT_ALL;
            
            /**
             * Enumeration value class for com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$Include.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PK
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
                
                static final int INT_PK = 1;
                static final int INT_NONPK = 2;
                static final int INT_ALL = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("pk", INT_PK),
                      new Enum("nonpk", INT_NONPK),
                      new Enum("all", INT_ALL),
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
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include) type.newValue( obj ); }
                
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include newInstance() {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$Mode.
         */
        public interface Mode extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("modeb750attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum IN = Enum.forString("IN");
            static final Enum OUT = Enum.forString("OUT");
            static final Enum INOUT = Enum.forString("INOUT");
            
            static final int INT_IN = Enum.INT_IN;
            static final int INT_OUT = Enum.INT_OUT;
            static final int INT_INOUT = Enum.INT_INOUT;
            
            /**
             * Enumeration value class for com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$Mode.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_IN
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
                
                static final int INT_IN = 1;
                static final int INT_OUT = 2;
                static final int INT_INOUT = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("IN", INT_IN),
                      new Enum("OUT", INT_OUT),
                      new Enum("INOUT", INT_INOUT),
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
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode) type.newValue( obj ); }
                
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode newInstance() {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML optional(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$Optional.
         */
        public interface Optional extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Optional.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("optional008dattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$Optional.
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
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional) type.newValue( obj ); }
                
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional newInstance() {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML form-display(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$FormDisplay.
         */
        public interface FormDisplay extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FormDisplay.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("formdisplay5366attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$FormDisplay.
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
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay) type.newValue( obj ); }
                
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay newInstance() {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML allow-html(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$AllowHtml.
         */
        public interface AllowHtml extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AllowHtml.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sAC8463A17CF4B4AA4407D6B3DCA5645F").resolveHandle("allowhtml0e5cattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum ANY = Enum.forString("any");
            static final Enum SAFE = Enum.forString("safe");
            static final Enum NONE = Enum.forString("none");
            
            static final int INT_ANY = Enum.INT_ANY;
            static final int INT_SAFE = Enum.INT_SAFE;
            static final int INT_NONE = Enum.INT_NONE;
            
            /**
             * Enumeration value class for com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$AllowHtml.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_ANY
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
                
                static final int INT_ANY = 1;
                static final int INT_SAFE = 2;
                static final int INT_NONE = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("any", INT_ANY),
                      new Enum("safe", INT_SAFE),
                      new Enum("none", INT_NONE),
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
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml) type.newValue( obj ); }
                
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml newInstance() {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes newInstance() {
              return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.services.AutoAttributesDocument newInstance() {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.services.AutoAttributesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.services.AutoAttributesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.services.AutoAttributesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.services.AutoAttributesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.services.AutoAttributesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.services.AutoAttributesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.services.AutoAttributesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.services.AutoAttributesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.services.AutoAttributesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.services.AutoAttributesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.services.AutoAttributesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.services.AutoAttributesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.services.AutoAttributesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.services.AutoAttributesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.services.AutoAttributesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.services.AutoAttributesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.services.AutoAttributesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.services.AutoAttributesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
