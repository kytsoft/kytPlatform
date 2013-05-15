/*
 * An XML document type.
 * Localname: field-type-def
 * Namespace: 
 * Java type: com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.fieldtypemodel.impl;
/**
 * A document containing one field-type-def(@) element.
 *
 * This is a complex type.
 */
public class FieldTypeDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument
{
    private static final long serialVersionUID = 1L;
    
    public FieldTypeDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FIELDTYPEDEF$0 = 
        new javax.xml.namespace.QName("", "field-type-def");
    
    
    /**
     * Gets the "field-type-def" element
     */
    public com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef getFieldTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef target = null;
            target = (com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef)get_store().find_element_user(FIELDTYPEDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "field-type-def" element
     */
    public void setFieldTypeDef(com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef fieldTypeDef)
    {
        generatedSetterHelperImpl(fieldTypeDef, FIELDTYPEDEF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "field-type-def" element
     */
    public com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef addNewFieldTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef target = null;
            target = (com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef)get_store().add_element_user(FIELDTYPEDEF$0);
            return target;
        }
    }
    /**
     * An XML field-type-def(@).
     *
     * This is a complex type.
     */
    public static class FieldTypeDefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef
    {
        private static final long serialVersionUID = 1L;
        
        public FieldTypeDefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName SQLTYPE$2 = 
            new javax.xml.namespace.QName("", "sql-type");
        private static final javax.xml.namespace.QName SQLTYPEALIAS$4 = 
            new javax.xml.namespace.QName("", "sql-type-alias");
        private static final javax.xml.namespace.QName JAVATYPE$6 = 
            new javax.xml.namespace.QName("", "java-type");
        
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "sql-type" attribute
         */
        public java.lang.String getSqlType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQLTYPE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sql-type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSqlType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SQLTYPE$2);
                return target;
            }
        }
        
        /**
         * Sets the "sql-type" attribute
         */
        public void setSqlType(java.lang.String sqlType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQLTYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SQLTYPE$2);
                }
                target.setStringValue(sqlType);
            }
        }
        
        /**
         * Sets (as xml) the "sql-type" attribute
         */
        public void xsetSqlType(org.apache.xmlbeans.XmlString sqlType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SQLTYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SQLTYPE$2);
                }
                target.set(sqlType);
            }
        }
        
        /**
         * Gets the "sql-type-alias" attribute
         */
        public java.lang.String getSqlTypeAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQLTYPEALIAS$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sql-type-alias" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSqlTypeAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SQLTYPEALIAS$4);
                return target;
            }
        }
        
        /**
         * True if has "sql-type-alias" attribute
         */
        public boolean isSetSqlTypeAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SQLTYPEALIAS$4) != null;
            }
        }
        
        /**
         * Sets the "sql-type-alias" attribute
         */
        public void setSqlTypeAlias(java.lang.String sqlTypeAlias)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SQLTYPEALIAS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SQLTYPEALIAS$4);
                }
                target.setStringValue(sqlTypeAlias);
            }
        }
        
        /**
         * Sets (as xml) the "sql-type-alias" attribute
         */
        public void xsetSqlTypeAlias(org.apache.xmlbeans.XmlString sqlTypeAlias)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SQLTYPEALIAS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SQLTYPEALIAS$4);
                }
                target.set(sqlTypeAlias);
            }
        }
        
        /**
         * Unsets the "sql-type-alias" attribute
         */
        public void unsetSqlTypeAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SQLTYPEALIAS$4);
            }
        }
        
        /**
         * Gets the "java-type" attribute
         */
        public com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef.JavaType.Enum getJavaType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVATYPE$6);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef.JavaType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "java-type" attribute
         */
        public com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef.JavaType xgetJavaType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef.JavaType target = null;
                target = (com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef.JavaType)get_store().find_attribute_user(JAVATYPE$6);
                return target;
            }
        }
        
        /**
         * Sets the "java-type" attribute
         */
        public void setJavaType(com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef.JavaType.Enum javaType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(JAVATYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(JAVATYPE$6);
                }
                target.setEnumValue(javaType);
            }
        }
        
        /**
         * Sets (as xml) the "java-type" attribute
         */
        public void xsetJavaType(com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef.JavaType javaType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef.JavaType target = null;
                target = (com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef.JavaType)get_store().find_attribute_user(JAVATYPE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef.JavaType)get_store().add_attribute_user(JAVATYPE$6);
                }
                target.set(javaType);
            }
        }
        /**
         * An XML java-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument$FieldTypeDef$JavaType.
         */
        public static class JavaTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.fieldtypemodel.FieldTypeDefDocument.FieldTypeDef.JavaType
        {
            private static final long serialVersionUID = 1L;
            
            public JavaTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected JavaTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
