/*
 * An XML document type.
 * Localname: condition-expr
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.ConditionExprDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one condition-expr(@) element.
 *
 * This is a complex type.
 */
public interface ConditionExprDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConditionExprDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("conditionexpra820doctype");
    
    /**
     * Gets the "condition-expr" element
     */
    com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr getConditionExpr();
    
    /**
     * Sets the "condition-expr" element
     */
    void setConditionExpr(com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr conditionExpr);
    
    /**
     * Appends and returns a new empty "condition-expr" element
     */
    com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr addNewConditionExpr();
    
    /**
     * An XML condition-expr(@).
     *
     * This is a complex type.
     */
    public interface ConditionExpr extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConditionExpr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("conditionexpr488delemtype");
        
        /**
         * Gets the "field-name" attribute
         */
        java.lang.String getFieldName();
        
        /**
         * Gets (as xml) the "field-name" attribute
         */
        org.apache.xmlbeans.XmlString xgetFieldName();
        
        /**
         * Sets the "field-name" attribute
         */
        void setFieldName(java.lang.String fieldName);
        
        /**
         * Sets (as xml) the "field-name" attribute
         */
        void xsetFieldName(org.apache.xmlbeans.XmlString fieldName);
        
        /**
         * Gets the "operator" attribute
         */
        com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.Operator.Enum getOperator();
        
        /**
         * Gets (as xml) the "operator" attribute
         */
        com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.Operator xgetOperator();
        
        /**
         * True if has "operator" attribute
         */
        boolean isSetOperator();
        
        /**
         * Sets the "operator" attribute
         */
        void setOperator(com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.Operator.Enum operator);
        
        /**
         * Sets (as xml) the "operator" attribute
         */
        void xsetOperator(com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.Operator operator);
        
        /**
         * Unsets the "operator" attribute
         */
        void unsetOperator();
        
        /**
         * Gets the "from-field" attribute
         */
        java.lang.String getFromField();
        
        /**
         * Gets (as xml) the "from-field" attribute
         */
        org.apache.xmlbeans.XmlString xgetFromField();
        
        /**
         * True if has "from-field" attribute
         */
        boolean isSetFromField();
        
        /**
         * Sets the "from-field" attribute
         */
        void setFromField(java.lang.String fromField);
        
        /**
         * Sets (as xml) the "from-field" attribute
         */
        void xsetFromField(org.apache.xmlbeans.XmlString fromField);
        
        /**
         * Unsets the "from-field" attribute
         */
        void unsetFromField();
        
        /**
         * Gets the "value" attribute
         */
        java.lang.String getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        org.apache.xmlbeans.XmlString xgetValue();
        
        /**
         * True if has "value" attribute
         */
        boolean isSetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(java.lang.String value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(org.apache.xmlbeans.XmlString value);
        
        /**
         * Unsets the "value" attribute
         */
        void unsetValue();
        
        /**
         * Gets the "ignore-if-null" attribute
         */
        com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfNull.Enum getIgnoreIfNull();
        
        /**
         * Gets (as xml) the "ignore-if-null" attribute
         */
        com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfNull xgetIgnoreIfNull();
        
        /**
         * True if has "ignore-if-null" attribute
         */
        boolean isSetIgnoreIfNull();
        
        /**
         * Sets the "ignore-if-null" attribute
         */
        void setIgnoreIfNull(com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfNull.Enum ignoreIfNull);
        
        /**
         * Sets (as xml) the "ignore-if-null" attribute
         */
        void xsetIgnoreIfNull(com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfNull ignoreIfNull);
        
        /**
         * Unsets the "ignore-if-null" attribute
         */
        void unsetIgnoreIfNull();
        
        /**
         * Gets the "ignore-if-empty" attribute
         */
        com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfEmpty.Enum getIgnoreIfEmpty();
        
        /**
         * Gets (as xml) the "ignore-if-empty" attribute
         */
        com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfEmpty xgetIgnoreIfEmpty();
        
        /**
         * True if has "ignore-if-empty" attribute
         */
        boolean isSetIgnoreIfEmpty();
        
        /**
         * Sets the "ignore-if-empty" attribute
         */
        void setIgnoreIfEmpty(com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfEmpty.Enum ignoreIfEmpty);
        
        /**
         * Sets (as xml) the "ignore-if-empty" attribute
         */
        void xsetIgnoreIfEmpty(com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfEmpty ignoreIfEmpty);
        
        /**
         * Unsets the "ignore-if-empty" attribute
         */
        void unsetIgnoreIfEmpty();
        
        /**
         * Gets the "ignore-case" attribute
         */
        com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreCase.Enum getIgnoreCase();
        
        /**
         * Gets (as xml) the "ignore-case" attribute
         */
        com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreCase xgetIgnoreCase();
        
        /**
         * True if has "ignore-case" attribute
         */
        boolean isSetIgnoreCase();
        
        /**
         * Sets the "ignore-case" attribute
         */
        void setIgnoreCase(com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreCase.Enum ignoreCase);
        
        /**
         * Sets (as xml) the "ignore-case" attribute
         */
        void xsetIgnoreCase(com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreCase ignoreCase);
        
        /**
         * Unsets the "ignore-case" attribute
         */
        void unsetIgnoreCase();
        
        /**
         * Gets the "ignore" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getIgnore();
        
        /**
         * True if has "ignore" attribute
         */
        boolean isSetIgnore();
        
        /**
         * Sets the "ignore" attribute
         */
        void setIgnore(org.apache.xmlbeans.XmlAnySimpleType ignore);
        
        /**
         * Appends and returns a new empty "ignore" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewIgnore();
        
        /**
         * Unsets the "ignore" attribute
         */
        void unsetIgnore();
        
        /**
         * An XML operator(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.ConditionExprDocument$ConditionExpr$Operator.
         */
        public interface Operator extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Operator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("operator6c51attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum LESS = Enum.forString("less");
            static final Enum GREATER = Enum.forString("greater");
            static final Enum LESS_EQUALS = Enum.forString("less-equals");
            static final Enum GREATER_EQUALS = Enum.forString("greater-equals");
            static final Enum EQUALS = Enum.forString("equals");
            static final Enum NOT_EQUALS = Enum.forString("not-equals");
            static final Enum IN = Enum.forString("in");
            static final Enum BETWEEN = Enum.forString("between");
            static final Enum LIKE = Enum.forString("like");
            
            static final int INT_LESS = Enum.INT_LESS;
            static final int INT_GREATER = Enum.INT_GREATER;
            static final int INT_LESS_EQUALS = Enum.INT_LESS_EQUALS;
            static final int INT_GREATER_EQUALS = Enum.INT_GREATER_EQUALS;
            static final int INT_EQUALS = Enum.INT_EQUALS;
            static final int INT_NOT_EQUALS = Enum.INT_NOT_EQUALS;
            static final int INT_IN = Enum.INT_IN;
            static final int INT_BETWEEN = Enum.INT_BETWEEN;
            static final int INT_LIKE = Enum.INT_LIKE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.ConditionExprDocument$ConditionExpr$Operator.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_LESS
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
                
                static final int INT_LESS = 1;
                static final int INT_GREATER = 2;
                static final int INT_LESS_EQUALS = 3;
                static final int INT_GREATER_EQUALS = 4;
                static final int INT_EQUALS = 5;
                static final int INT_NOT_EQUALS = 6;
                static final int INT_IN = 7;
                static final int INT_BETWEEN = 8;
                static final int INT_LIKE = 9;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("less", INT_LESS),
                      new Enum("greater", INT_GREATER),
                      new Enum("less-equals", INT_LESS_EQUALS),
                      new Enum("greater-equals", INT_GREATER_EQUALS),
                      new Enum("equals", INT_EQUALS),
                      new Enum("not-equals", INT_NOT_EQUALS),
                      new Enum("in", INT_IN),
                      new Enum("between", INT_BETWEEN),
                      new Enum("like", INT_LIKE),
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
                public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.Operator newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.Operator) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.Operator newInstance() {
                  return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.Operator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.Operator newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.Operator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ignore-if-null(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.ConditionExprDocument$ConditionExpr$IgnoreIfNull.
         */
        public interface IgnoreIfNull extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IgnoreIfNull.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("ignoreifnullcbe9attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.ConditionExprDocument$ConditionExpr$IgnoreIfNull.
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
                public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfNull newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfNull) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfNull newInstance() {
                  return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfNull) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfNull newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfNull) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ignore-if-empty(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.ConditionExprDocument$ConditionExpr$IgnoreIfEmpty.
         */
        public interface IgnoreIfEmpty extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IgnoreIfEmpty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("ignoreifempty6b2dattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.ConditionExprDocument$ConditionExpr$IgnoreIfEmpty.
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
                public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfEmpty newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfEmpty) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfEmpty newInstance() {
                  return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfEmpty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfEmpty newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreIfEmpty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ignore-case(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.ConditionExprDocument$ConditionExpr$IgnoreCase.
         */
        public interface IgnoreCase extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IgnoreCase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("ignorecasedc80attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.ConditionExprDocument$ConditionExpr$IgnoreCase.
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
                public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreCase newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreCase) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreCase newInstance() {
                  return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreCase newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr.IgnoreCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr newInstance() {
              return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.ConditionExprDocument.ConditionExpr) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.ConditionExprDocument newInstance() {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.ConditionExprDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.ConditionExprDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.ConditionExprDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
