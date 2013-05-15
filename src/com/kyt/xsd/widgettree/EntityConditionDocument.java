/*
 * An XML document type.
 * Localname: entity-condition
 * Namespace: 
 * Java type: com.kyt.xsd.widgettree.EntityConditionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgettree;


/**
 * A document containing one entity-condition(@) element.
 *
 * This is a complex type.
 */
public interface EntityConditionDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityConditionDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("entityconditionea2adoctype");
    
    /**
     * Gets the "entity-condition" element
     */
    com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition getEntityCondition();
    
    /**
     * Sets the "entity-condition" element
     */
    void setEntityCondition(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition entityCondition);
    
    /**
     * Appends and returns a new empty "entity-condition" element
     */
    com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition addNewEntityCondition();
    
    /**
     * An XML entity-condition(@).
     *
     * This is a complex type.
     */
    public interface EntityCondition extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityCondition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("entitycondition50cdelemtype");
        
        /**
         * Gets the "condition-expr" element
         */
        com.kyt.xsd.widgettree.ConditionExprDocument.ConditionExpr getConditionExpr();
        
        /**
         * True if has "condition-expr" element
         */
        boolean isSetConditionExpr();
        
        /**
         * Sets the "condition-expr" element
         */
        void setConditionExpr(com.kyt.xsd.widgettree.ConditionExprDocument.ConditionExpr conditionExpr);
        
        /**
         * Appends and returns a new empty "condition-expr" element
         */
        com.kyt.xsd.widgettree.ConditionExprDocument.ConditionExpr addNewConditionExpr();
        
        /**
         * Unsets the "condition-expr" element
         */
        void unsetConditionExpr();
        
        /**
         * Gets the "condition-list" element
         */
        com.kyt.xsd.widgettree.ConditionListDocument.ConditionList getConditionList();
        
        /**
         * True if has "condition-list" element
         */
        boolean isSetConditionList();
        
        /**
         * Sets the "condition-list" element
         */
        void setConditionList(com.kyt.xsd.widgettree.ConditionListDocument.ConditionList conditionList);
        
        /**
         * Appends and returns a new empty "condition-list" element
         */
        com.kyt.xsd.widgettree.ConditionListDocument.ConditionList addNewConditionList();
        
        /**
         * Unsets the "condition-list" element
         */
        void unsetConditionList();
        
        /**
         * Gets the "having-condition-list" element
         */
        com.kyt.xsd.widgettree.HavingConditionListDocument.HavingConditionList getHavingConditionList();
        
        /**
         * True if has "having-condition-list" element
         */
        boolean isSetHavingConditionList();
        
        /**
         * Sets the "having-condition-list" element
         */
        void setHavingConditionList(com.kyt.xsd.widgettree.HavingConditionListDocument.HavingConditionList havingConditionList);
        
        /**
         * Appends and returns a new empty "having-condition-list" element
         */
        com.kyt.xsd.widgettree.HavingConditionListDocument.HavingConditionList addNewHavingConditionList();
        
        /**
         * Unsets the "having-condition-list" element
         */
        void unsetHavingConditionList();
        
        /**
         * Gets array of all "select-field" elements
         */
        com.kyt.xsd.widgettree.SelectFieldDocument.SelectField[] getSelectFieldArray();
        
        /**
         * Gets ith "select-field" element
         */
        com.kyt.xsd.widgettree.SelectFieldDocument.SelectField getSelectFieldArray(int i);
        
        /**
         * Returns number of "select-field" element
         */
        int sizeOfSelectFieldArray();
        
        /**
         * Sets array of all "select-field" element
         */
        void setSelectFieldArray(com.kyt.xsd.widgettree.SelectFieldDocument.SelectField[] selectFieldArray);
        
        /**
         * Sets ith "select-field" element
         */
        void setSelectFieldArray(int i, com.kyt.xsd.widgettree.SelectFieldDocument.SelectField selectField);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "select-field" element
         */
        com.kyt.xsd.widgettree.SelectFieldDocument.SelectField insertNewSelectField(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "select-field" element
         */
        com.kyt.xsd.widgettree.SelectFieldDocument.SelectField addNewSelectField();
        
        /**
         * Removes the ith "select-field" element
         */
        void removeSelectField(int i);
        
        /**
         * Gets array of all "order-by" elements
         */
        com.kyt.xsd.widgettree.OrderByDocument.OrderBy[] getOrderByArray();
        
        /**
         * Gets ith "order-by" element
         */
        com.kyt.xsd.widgettree.OrderByDocument.OrderBy getOrderByArray(int i);
        
        /**
         * Returns number of "order-by" element
         */
        int sizeOfOrderByArray();
        
        /**
         * Sets array of all "order-by" element
         */
        void setOrderByArray(com.kyt.xsd.widgettree.OrderByDocument.OrderBy[] orderByArray);
        
        /**
         * Sets ith "order-by" element
         */
        void setOrderByArray(int i, com.kyt.xsd.widgettree.OrderByDocument.OrderBy orderBy);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "order-by" element
         */
        com.kyt.xsd.widgettree.OrderByDocument.OrderBy insertNewOrderBy(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "order-by" element
         */
        com.kyt.xsd.widgettree.OrderByDocument.OrderBy addNewOrderBy();
        
        /**
         * Removes the ith "order-by" element
         */
        void removeOrderBy(int i);
        
        /**
         * Gets the "limit-range" element
         */
        com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange getLimitRange();
        
        /**
         * True if has "limit-range" element
         */
        boolean isSetLimitRange();
        
        /**
         * Sets the "limit-range" element
         */
        void setLimitRange(com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange limitRange);
        
        /**
         * Appends and returns a new empty "limit-range" element
         */
        com.kyt.xsd.widgettree.LimitRangeDocument.LimitRange addNewLimitRange();
        
        /**
         * Unsets the "limit-range" element
         */
        void unsetLimitRange();
        
        /**
         * Gets the "limit-view" element
         */
        com.kyt.xsd.widgettree.LimitViewDocument.LimitView getLimitView();
        
        /**
         * True if has "limit-view" element
         */
        boolean isSetLimitView();
        
        /**
         * Sets the "limit-view" element
         */
        void setLimitView(com.kyt.xsd.widgettree.LimitViewDocument.LimitView limitView);
        
        /**
         * Appends and returns a new empty "limit-view" element
         */
        com.kyt.xsd.widgettree.LimitViewDocument.LimitView addNewLimitView();
        
        /**
         * Unsets the "limit-view" element
         */
        void unsetLimitView();
        
        /**
         * Gets the "use-iterator" element
         */
        com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator getUseIterator();
        
        /**
         * True if has "use-iterator" element
         */
        boolean isSetUseIterator();
        
        /**
         * Sets the "use-iterator" element
         */
        void setUseIterator(com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator useIterator);
        
        /**
         * Appends and returns a new empty "use-iterator" element
         */
        com.kyt.xsd.widgettree.UseIteratorDocument.UseIterator addNewUseIterator();
        
        /**
         * Unsets the "use-iterator" element
         */
        void unsetUseIterator();
        
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
         * Gets the "use-cache" attribute
         */
        com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache.Enum getUseCache();
        
        /**
         * Gets (as xml) the "use-cache" attribute
         */
        com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache xgetUseCache();
        
        /**
         * True if has "use-cache" attribute
         */
        boolean isSetUseCache();
        
        /**
         * Sets the "use-cache" attribute
         */
        void setUseCache(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache.Enum useCache);
        
        /**
         * Sets (as xml) the "use-cache" attribute
         */
        void xsetUseCache(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache useCache);
        
        /**
         * Unsets the "use-cache" attribute
         */
        void unsetUseCache();
        
        /**
         * Gets the "filter-by-date" attribute
         */
        com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate.Enum getFilterByDate();
        
        /**
         * Gets (as xml) the "filter-by-date" attribute
         */
        com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate xgetFilterByDate();
        
        /**
         * True if has "filter-by-date" attribute
         */
        boolean isSetFilterByDate();
        
        /**
         * Sets the "filter-by-date" attribute
         */
        void setFilterByDate(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate.Enum filterByDate);
        
        /**
         * Sets (as xml) the "filter-by-date" attribute
         */
        void xsetFilterByDate(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate filterByDate);
        
        /**
         * Unsets the "filter-by-date" attribute
         */
        void unsetFilterByDate();
        
        /**
         * Gets the "distinct" attribute
         */
        com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct.Enum getDistinct();
        
        /**
         * Gets (as xml) the "distinct" attribute
         */
        com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct xgetDistinct();
        
        /**
         * True if has "distinct" attribute
         */
        boolean isSetDistinct();
        
        /**
         * Sets the "distinct" attribute
         */
        void setDistinct(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct.Enum distinct);
        
        /**
         * Sets (as xml) the "distinct" attribute
         */
        void xsetDistinct(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct distinct);
        
        /**
         * Unsets the "distinct" attribute
         */
        void unsetDistinct();
        
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
         * Gets the "list" attribute
         */
        java.lang.String getList();
        
        /**
         * Gets (as xml) the "list" attribute
         */
        org.apache.xmlbeans.XmlString xgetList();
        
        /**
         * True if has "list" attribute
         */
        boolean isSetList();
        
        /**
         * Sets the "list" attribute
         */
        void setList(java.lang.String list);
        
        /**
         * Sets (as xml) the "list" attribute
         */
        void xsetList(org.apache.xmlbeans.XmlString list);
        
        /**
         * Unsets the "list" attribute
         */
        void unsetList();
        
        /**
         * Gets the "result-set-type" attribute
         */
        com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType.Enum getResultSetType();
        
        /**
         * Gets (as xml) the "result-set-type" attribute
         */
        com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType xgetResultSetType();
        
        /**
         * True if has "result-set-type" attribute
         */
        boolean isSetResultSetType();
        
        /**
         * Sets the "result-set-type" attribute
         */
        void setResultSetType(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType.Enum resultSetType);
        
        /**
         * Sets (as xml) the "result-set-type" attribute
         */
        void xsetResultSetType(com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType resultSetType);
        
        /**
         * Unsets the "result-set-type" attribute
         */
        void unsetResultSetType();
        
        /**
         * An XML use-cache(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.EntityConditionDocument$EntityCondition$UseCache.
         */
        public interface UseCache extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UseCache.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("usecache34f1attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgettree.EntityConditionDocument$EntityCondition$UseCache.
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
                public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache newInstance() {
                  return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.UseCache) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML filter-by-date(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.EntityConditionDocument$EntityCondition$FilterByDate.
         */
        public interface FilterByDate extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FilterByDate.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("filterbydate76bcattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            static final Enum BY_NAME = Enum.forString("by-name");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            static final int INT_BY_NAME = Enum.INT_BY_NAME;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgettree.EntityConditionDocument$EntityCondition$FilterByDate.
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
                static final int INT_BY_NAME = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
                      new Enum("by-name", INT_BY_NAME),
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
                public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate newInstance() {
                  return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.FilterByDate) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML distinct(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.EntityConditionDocument$EntityCondition$Distinct.
         */
        public interface Distinct extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Distinct.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("distinct76e9attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgettree.EntityConditionDocument$EntityCondition$Distinct.
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
                public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct newInstance() {
                  return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.Distinct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML result-set-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgettree.EntityConditionDocument$EntityCondition$ResultSetType.
         */
        public interface ResultSetType extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultSetType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFC7A777BFDE8BCEC60FE793CB1332DC9").resolveHandle("resultsettype2ceaattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum FORWARD = Enum.forString("forward");
            static final Enum SCROLL = Enum.forString("scroll");
            
            static final int INT_FORWARD = Enum.INT_FORWARD;
            static final int INT_SCROLL = Enum.INT_SCROLL;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgettree.EntityConditionDocument$EntityCondition$ResultSetType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_FORWARD
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
                
                static final int INT_FORWARD = 1;
                static final int INT_SCROLL = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("forward", INT_FORWARD),
                      new Enum("scroll", INT_SCROLL),
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
                public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType newInstance() {
                  return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition.ResultSetType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition newInstance() {
              return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgettree.EntityConditionDocument.EntityCondition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgettree.EntityConditionDocument newInstance() {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityConditionDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgettree.EntityConditionDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgettree.EntityConditionDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
