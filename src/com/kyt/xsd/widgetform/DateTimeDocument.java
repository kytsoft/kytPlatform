/*
 * An XML document type.
 * Localname: date-time
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.DateTimeDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform;


/**
 * A document containing one date-time(@) element.
 *
 * This is a complex type.
 */
public interface DateTimeDocument extends com.kyt.xsd.widgetform.AllFieldsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DateTimeDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("datetime9133doctype");
    
    /**
     * Gets the "date-time" element
     */
    com.kyt.xsd.widgetform.DateTimeDocument.DateTime getDateTime();
    
    /**
     * Sets the "date-time" element
     */
    void setDateTime(com.kyt.xsd.widgetform.DateTimeDocument.DateTime dateTime);
    
    /**
     * Appends and returns a new empty "date-time" element
     */
    com.kyt.xsd.widgetform.DateTimeDocument.DateTime addNewDateTime();
    
    /**
     * An XML date-time(@).
     *
     * This is a complex type.
     */
    public interface DateTime extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DateTime.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("datetime353belemtype");
        
        /**
         * Gets the "type" attribute
         */
        com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Type xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Type type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * Gets the "default-value" attribute
         */
        java.lang.String getDefaultValue();
        
        /**
         * Gets (as xml) the "default-value" attribute
         */
        org.apache.xmlbeans.XmlString xgetDefaultValue();
        
        /**
         * True if has "default-value" attribute
         */
        boolean isSetDefaultValue();
        
        /**
         * Sets the "default-value" attribute
         */
        void setDefaultValue(java.lang.String defaultValue);
        
        /**
         * Sets (as xml) the "default-value" attribute
         */
        void xsetDefaultValue(org.apache.xmlbeans.XmlString defaultValue);
        
        /**
         * Unsets the "default-value" attribute
         */
        void unsetDefaultValue();
        
        /**
         * Gets the "input-method" attribute
         */
        com.kyt.xsd.widgetform.DateTimeDocument.DateTime.InputMethod.Enum getInputMethod();
        
        /**
         * Gets (as xml) the "input-method" attribute
         */
        com.kyt.xsd.widgetform.DateTimeDocument.DateTime.InputMethod xgetInputMethod();
        
        /**
         * True if has "input-method" attribute
         */
        boolean isSetInputMethod();
        
        /**
         * Sets the "input-method" attribute
         */
        void setInputMethod(com.kyt.xsd.widgetform.DateTimeDocument.DateTime.InputMethod.Enum inputMethod);
        
        /**
         * Sets (as xml) the "input-method" attribute
         */
        void xsetInputMethod(com.kyt.xsd.widgetform.DateTimeDocument.DateTime.InputMethod inputMethod);
        
        /**
         * Unsets the "input-method" attribute
         */
        void unsetInputMethod();
        
        /**
         * Gets the "clock" attribute
         */
        com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Clock.Enum getClock();
        
        /**
         * Gets (as xml) the "clock" attribute
         */
        com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Clock xgetClock();
        
        /**
         * True if has "clock" attribute
         */
        boolean isSetClock();
        
        /**
         * Sets the "clock" attribute
         */
        void setClock(com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Clock.Enum clock);
        
        /**
         * Sets (as xml) the "clock" attribute
         */
        void xsetClock(com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Clock clock);
        
        /**
         * Unsets the "clock" attribute
         */
        void unsetClock();
        
        /**
         * Gets the "step" attribute
         */
        com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Step.Enum getStep();
        
        /**
         * Gets (as xml) the "step" attribute
         */
        com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Step xgetStep();
        
        /**
         * True if has "step" attribute
         */
        boolean isSetStep();
        
        /**
         * Sets the "step" attribute
         */
        void setStep(com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Step.Enum step);
        
        /**
         * Sets (as xml) the "step" attribute
         */
        void xsetStep(com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Step step);
        
        /**
         * Unsets the "step" attribute
         */
        void unsetStep();
        
        /**
         * Gets the "mask" attribute
         */
        com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Mask.Enum getMask();
        
        /**
         * Gets (as xml) the "mask" attribute
         */
        com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Mask xgetMask();
        
        /**
         * True if has "mask" attribute
         */
        boolean isSetMask();
        
        /**
         * Sets the "mask" attribute
         */
        void setMask(com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Mask.Enum mask);
        
        /**
         * Sets (as xml) the "mask" attribute
         */
        void xsetMask(com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Mask mask);
        
        /**
         * Unsets the "mask" attribute
         */
        void unsetMask();
        
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DateTimeDocument$DateTime$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("type7095attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TIMESTAMP = Enum.forString("timestamp");
            static final Enum DATE = Enum.forString("date");
            static final Enum TIME = Enum.forString("time");
            
            static final int INT_TIMESTAMP = Enum.INT_TIMESTAMP;
            static final int INT_DATE = Enum.INT_DATE;
            static final int INT_TIME = Enum.INT_TIME;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DateTimeDocument$DateTime$Type.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TIMESTAMP
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
                
                static final int INT_TIMESTAMP = 1;
                static final int INT_DATE = 2;
                static final int INT_TIME = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("timestamp", INT_TIMESTAMP),
                      new Enum("date", INT_DATE),
                      new Enum("time", INT_TIME),
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
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Type newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Type) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Type newInstance() {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML input-method(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DateTimeDocument$DateTime$InputMethod.
         */
        public interface InputMethod extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InputMethod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("inputmethod739fattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TEXT = Enum.forString("text");
            static final Enum TIME_DROPDOWN = Enum.forString("time-dropdown");
            
            static final int INT_TEXT = Enum.INT_TEXT;
            static final int INT_TIME_DROPDOWN = Enum.INT_TIME_DROPDOWN;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DateTimeDocument$DateTime$InputMethod.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TEXT
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
                
                static final int INT_TEXT = 1;
                static final int INT_TIME_DROPDOWN = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("text", INT_TEXT),
                      new Enum("time-dropdown", INT_TIME_DROPDOWN),
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
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.InputMethod newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.InputMethod) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.InputMethod newInstance() {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.InputMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.InputMethod newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.InputMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML clock(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DateTimeDocument$DateTime$Clock.
         */
        public interface Clock extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Clock.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("clock38b1attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum X_12 = Enum.forString("12");
            static final Enum X_24 = Enum.forString("24");
            
            static final int INT_X_12 = Enum.INT_X_12;
            static final int INT_X_24 = Enum.INT_X_24;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DateTimeDocument$DateTime$Clock.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_X_12
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
                
                static final int INT_X_12 = 1;
                static final int INT_X_24 = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("12", INT_X_12),
                      new Enum("24", INT_X_24),
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
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Clock newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Clock) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Clock newInstance() {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Clock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Clock newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Clock) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML step(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DateTimeDocument$DateTime$Step.
         */
        public interface Step extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Step.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("stepd227attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum X_1 = Enum.forString("1");
            static final Enum X_5 = Enum.forString("5");
            static final Enum X_10 = Enum.forString("10");
            static final Enum X_15 = Enum.forString("15");
            static final Enum X_30 = Enum.forString("30");
            
            static final int INT_X_1 = Enum.INT_X_1;
            static final int INT_X_5 = Enum.INT_X_5;
            static final int INT_X_10 = Enum.INT_X_10;
            static final int INT_X_15 = Enum.INT_X_15;
            static final int INT_X_30 = Enum.INT_X_30;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DateTimeDocument$DateTime$Step.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_X_1
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
                
                static final int INT_X_1 = 1;
                static final int INT_X_5 = 2;
                static final int INT_X_10 = 3;
                static final int INT_X_15 = 4;
                static final int INT_X_30 = 5;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("1", INT_X_1),
                      new Enum("5", INT_X_5),
                      new Enum("10", INT_X_10),
                      new Enum("15", INT_X_15),
                      new Enum("30", INT_X_30),
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
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Step newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Step) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Step newInstance() {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Step) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Step newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Step) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML mask(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.DateTimeDocument$DateTime$Mask.
         */
        public interface Mask extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mask.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sBB3679A1A2F0A3DFD606ECE7B6CC9EBF").resolveHandle("mask7247attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum Y = Enum.forString("Y");
            static final Enum N = Enum.forString("N");
            
            static final int INT_Y = Enum.INT_Y;
            static final int INT_N = Enum.INT_N;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetform.DateTimeDocument$DateTime$Mask.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_Y
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
                
                static final int INT_Y = 1;
                static final int INT_N = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("Y", INT_Y),
                      new Enum("N", INT_N),
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
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Mask newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Mask) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Mask newInstance() {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Mask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Mask newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime.Mask) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime newInstance() {
              return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetform.DateTimeDocument.DateTime newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetform.DateTimeDocument.DateTime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetform.DateTimeDocument newInstance() {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetform.DateTimeDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetform.DateTimeDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetform.DateTimeDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
