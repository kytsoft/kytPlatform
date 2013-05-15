/*
 * An XML document type.
 * Localname: set-calendar
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.SetCalendarDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods;


/**
 * A document containing one set-calendar(@) element.
 *
 * This is a complex type.
 */
public interface SetCalendarDocument extends com.kyt.xsd.simplemethods.OtherOperationsDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetCalendarDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("setcalendarab42doctype");
    
    /**
     * Gets the "set-calendar" element
     */
    com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar getSetCalendar();
    
    /**
     * Sets the "set-calendar" element
     */
    void setSetCalendar(com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar setCalendar);
    
    /**
     * Appends and returns a new empty "set-calendar" element
     */
    com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar addNewSetCalendar();
    
    /**
     * An XML set-calendar(@).
     *
     * This is a complex type.
     */
    public interface SetCalendar extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetCalendar.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("setcalendar77cdelemtype");
        
        /**
         * Gets the "field" attribute
         */
        java.lang.String getField();
        
        /**
         * Gets (as xml) the "field" attribute
         */
        org.apache.xmlbeans.XmlString xgetField();
        
        /**
         * Sets the "field" attribute
         */
        void setField(java.lang.String field);
        
        /**
         * Sets (as xml) the "field" attribute
         */
        void xsetField(org.apache.xmlbeans.XmlString field);
        
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
         * Gets the "set-if-null" attribute
         */
        com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfNull.Enum getSetIfNull();
        
        /**
         * Gets (as xml) the "set-if-null" attribute
         */
        com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfNull xgetSetIfNull();
        
        /**
         * True if has "set-if-null" attribute
         */
        boolean isSetSetIfNull();
        
        /**
         * Sets the "set-if-null" attribute
         */
        void setSetIfNull(com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfNull.Enum setIfNull);
        
        /**
         * Sets (as xml) the "set-if-null" attribute
         */
        void xsetSetIfNull(com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfNull setIfNull);
        
        /**
         * Unsets the "set-if-null" attribute
         */
        void unsetSetIfNull();
        
        /**
         * Gets the "set-if-empty" attribute
         */
        com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfEmpty.Enum getSetIfEmpty();
        
        /**
         * Gets (as xml) the "set-if-empty" attribute
         */
        com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfEmpty xgetSetIfEmpty();
        
        /**
         * True if has "set-if-empty" attribute
         */
        boolean isSetSetIfEmpty();
        
        /**
         * Sets the "set-if-empty" attribute
         */
        void setSetIfEmpty(com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfEmpty.Enum setIfEmpty);
        
        /**
         * Sets (as xml) the "set-if-empty" attribute
         */
        void xsetSetIfEmpty(com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfEmpty setIfEmpty);
        
        /**
         * Unsets the "set-if-empty" attribute
         */
        void unsetSetIfEmpty();
        
        /**
         * Gets the "years" attribute
         */
        java.lang.String getYears();
        
        /**
         * Gets (as xml) the "years" attribute
         */
        org.apache.xmlbeans.XmlString xgetYears();
        
        /**
         * True if has "years" attribute
         */
        boolean isSetYears();
        
        /**
         * Sets the "years" attribute
         */
        void setYears(java.lang.String years);
        
        /**
         * Sets (as xml) the "years" attribute
         */
        void xsetYears(org.apache.xmlbeans.XmlString years);
        
        /**
         * Unsets the "years" attribute
         */
        void unsetYears();
        
        /**
         * Gets the "months" attribute
         */
        java.lang.String getMonths();
        
        /**
         * Gets (as xml) the "months" attribute
         */
        org.apache.xmlbeans.XmlString xgetMonths();
        
        /**
         * True if has "months" attribute
         */
        boolean isSetMonths();
        
        /**
         * Sets the "months" attribute
         */
        void setMonths(java.lang.String months);
        
        /**
         * Sets (as xml) the "months" attribute
         */
        void xsetMonths(org.apache.xmlbeans.XmlString months);
        
        /**
         * Unsets the "months" attribute
         */
        void unsetMonths();
        
        /**
         * Gets the "days" attribute
         */
        java.lang.String getDays();
        
        /**
         * Gets (as xml) the "days" attribute
         */
        org.apache.xmlbeans.XmlString xgetDays();
        
        /**
         * True if has "days" attribute
         */
        boolean isSetDays();
        
        /**
         * Sets the "days" attribute
         */
        void setDays(java.lang.String days);
        
        /**
         * Sets (as xml) the "days" attribute
         */
        void xsetDays(org.apache.xmlbeans.XmlString days);
        
        /**
         * Unsets the "days" attribute
         */
        void unsetDays();
        
        /**
         * Gets the "hours" attribute
         */
        java.lang.String getHours();
        
        /**
         * Gets (as xml) the "hours" attribute
         */
        org.apache.xmlbeans.XmlString xgetHours();
        
        /**
         * True if has "hours" attribute
         */
        boolean isSetHours();
        
        /**
         * Sets the "hours" attribute
         */
        void setHours(java.lang.String hours);
        
        /**
         * Sets (as xml) the "hours" attribute
         */
        void xsetHours(org.apache.xmlbeans.XmlString hours);
        
        /**
         * Unsets the "hours" attribute
         */
        void unsetHours();
        
        /**
         * Gets the "minutes" attribute
         */
        java.lang.String getMinutes();
        
        /**
         * Gets (as xml) the "minutes" attribute
         */
        org.apache.xmlbeans.XmlString xgetMinutes();
        
        /**
         * True if has "minutes" attribute
         */
        boolean isSetMinutes();
        
        /**
         * Sets the "minutes" attribute
         */
        void setMinutes(java.lang.String minutes);
        
        /**
         * Sets (as xml) the "minutes" attribute
         */
        void xsetMinutes(org.apache.xmlbeans.XmlString minutes);
        
        /**
         * Unsets the "minutes" attribute
         */
        void unsetMinutes();
        
        /**
         * Gets the "seconds" attribute
         */
        java.lang.String getSeconds();
        
        /**
         * Gets (as xml) the "seconds" attribute
         */
        org.apache.xmlbeans.XmlString xgetSeconds();
        
        /**
         * True if has "seconds" attribute
         */
        boolean isSetSeconds();
        
        /**
         * Sets the "seconds" attribute
         */
        void setSeconds(java.lang.String seconds);
        
        /**
         * Sets (as xml) the "seconds" attribute
         */
        void xsetSeconds(org.apache.xmlbeans.XmlString seconds);
        
        /**
         * Unsets the "seconds" attribute
         */
        void unsetSeconds();
        
        /**
         * Gets the "millis" attribute
         */
        java.lang.String getMillis();
        
        /**
         * Gets (as xml) the "millis" attribute
         */
        org.apache.xmlbeans.XmlString xgetMillis();
        
        /**
         * True if has "millis" attribute
         */
        boolean isSetMillis();
        
        /**
         * Sets the "millis" attribute
         */
        void setMillis(java.lang.String millis);
        
        /**
         * Sets (as xml) the "millis" attribute
         */
        void xsetMillis(org.apache.xmlbeans.XmlString millis);
        
        /**
         * Unsets the "millis" attribute
         */
        void unsetMillis();
        
        /**
         * Gets the "period-align-start" attribute
         */
        com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignStart.Enum getPeriodAlignStart();
        
        /**
         * Gets (as xml) the "period-align-start" attribute
         */
        com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignStart xgetPeriodAlignStart();
        
        /**
         * True if has "period-align-start" attribute
         */
        boolean isSetPeriodAlignStart();
        
        /**
         * Sets the "period-align-start" attribute
         */
        void setPeriodAlignStart(com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignStart.Enum periodAlignStart);
        
        /**
         * Sets (as xml) the "period-align-start" attribute
         */
        void xsetPeriodAlignStart(com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignStart periodAlignStart);
        
        /**
         * Unsets the "period-align-start" attribute
         */
        void unsetPeriodAlignStart();
        
        /**
         * Gets the "period-align-end" attribute
         */
        com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignEnd.Enum getPeriodAlignEnd();
        
        /**
         * Gets (as xml) the "period-align-end" attribute
         */
        com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignEnd xgetPeriodAlignEnd();
        
        /**
         * True if has "period-align-end" attribute
         */
        boolean isSetPeriodAlignEnd();
        
        /**
         * Sets the "period-align-end" attribute
         */
        void setPeriodAlignEnd(com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignEnd.Enum periodAlignEnd);
        
        /**
         * Sets (as xml) the "period-align-end" attribute
         */
        void xsetPeriodAlignEnd(com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignEnd periodAlignEnd);
        
        /**
         * Unsets the "period-align-end" attribute
         */
        void unsetPeriodAlignEnd();
        
        /**
         * Gets the "locale" attribute
         */
        java.lang.String getLocale();
        
        /**
         * Gets (as xml) the "locale" attribute
         */
        org.apache.xmlbeans.XmlString xgetLocale();
        
        /**
         * True if has "locale" attribute
         */
        boolean isSetLocale();
        
        /**
         * Sets the "locale" attribute
         */
        void setLocale(java.lang.String locale);
        
        /**
         * Sets (as xml) the "locale" attribute
         */
        void xsetLocale(org.apache.xmlbeans.XmlString locale);
        
        /**
         * Unsets the "locale" attribute
         */
        void unsetLocale();
        
        /**
         * Gets the "time-zone" attribute
         */
        java.lang.String getTimeZone();
        
        /**
         * Gets (as xml) the "time-zone" attribute
         */
        org.apache.xmlbeans.XmlString xgetTimeZone();
        
        /**
         * True if has "time-zone" attribute
         */
        boolean isSetTimeZone();
        
        /**
         * Sets the "time-zone" attribute
         */
        void setTimeZone(java.lang.String timeZone);
        
        /**
         * Sets (as xml) the "time-zone" attribute
         */
        void xsetTimeZone(org.apache.xmlbeans.XmlString timeZone);
        
        /**
         * Unsets the "time-zone" attribute
         */
        void unsetTimeZone();
        
        /**
         * An XML set-if-null(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.SetCalendarDocument$SetCalendar$SetIfNull.
         */
        public interface SetIfNull extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetIfNull.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("setifnulld501attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.SetCalendarDocument$SetCalendar$SetIfNull.
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
                public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfNull newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfNull) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfNull newInstance() {
                  return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfNull) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfNull newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfNull) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML set-if-empty(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.SetCalendarDocument$SetCalendar$SetIfEmpty.
         */
        public interface SetIfEmpty extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetIfEmpty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("setifempty9995attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.SetCalendarDocument$SetCalendar$SetIfEmpty.
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
                public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfEmpty newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfEmpty) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfEmpty newInstance() {
                  return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfEmpty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfEmpty newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.SetIfEmpty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML period-align-start(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.SetCalendarDocument$SetCalendar$PeriodAlignStart.
         */
        public interface PeriodAlignStart extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PeriodAlignStart.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("periodalignstart11fbattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum YEAR = Enum.forString("year");
            static final Enum MONTH = Enum.forString("month");
            static final Enum WEEK = Enum.forString("week");
            static final Enum DAY = Enum.forString("day");
            
            static final int INT_YEAR = Enum.INT_YEAR;
            static final int INT_MONTH = Enum.INT_MONTH;
            static final int INT_WEEK = Enum.INT_WEEK;
            static final int INT_DAY = Enum.INT_DAY;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.SetCalendarDocument$SetCalendar$PeriodAlignStart.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_YEAR
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
                
                static final int INT_YEAR = 1;
                static final int INT_MONTH = 2;
                static final int INT_WEEK = 3;
                static final int INT_DAY = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("year", INT_YEAR),
                      new Enum("month", INT_MONTH),
                      new Enum("week", INT_WEEK),
                      new Enum("day", INT_DAY),
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
                public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignStart newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignStart) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignStart newInstance() {
                  return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignStart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignStart newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignStart) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML period-align-end(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.SetCalendarDocument$SetCalendar$PeriodAlignEnd.
         */
        public interface PeriodAlignEnd extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PeriodAlignEnd.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s549C74231BD0A09CD0C4ED9F28F3F2F9").resolveHandle("periodalignendeeb4attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum YEAR = Enum.forString("year");
            static final Enum MONTH = Enum.forString("month");
            static final Enum WEEK = Enum.forString("week");
            static final Enum DAY = Enum.forString("day");
            
            static final int INT_YEAR = Enum.INT_YEAR;
            static final int INT_MONTH = Enum.INT_MONTH;
            static final int INT_WEEK = Enum.INT_WEEK;
            static final int INT_DAY = Enum.INT_DAY;
            
            /**
             * Enumeration value class for com.kyt.xsd.simplemethods.SetCalendarDocument$SetCalendar$PeriodAlignEnd.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_YEAR
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
                
                static final int INT_YEAR = 1;
                static final int INT_MONTH = 2;
                static final int INT_WEEK = 3;
                static final int INT_DAY = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("year", INT_YEAR),
                      new Enum("month", INT_MONTH),
                      new Enum("week", INT_WEEK),
                      new Enum("day", INT_DAY),
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
                public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignEnd newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignEnd) type.newValue( obj ); }
                
                public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignEnd newInstance() {
                  return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignEnd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignEnd newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar.PeriodAlignEnd) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar newInstance() {
              return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.simplemethods.SetCalendarDocument.SetCalendar) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.simplemethods.SetCalendarDocument newInstance() {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.simplemethods.SetCalendarDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.simplemethods.SetCalendarDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.simplemethods.SetCalendarDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
