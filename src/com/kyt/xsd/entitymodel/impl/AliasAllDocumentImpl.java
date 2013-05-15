/*
 * An XML document type.
 * Localname: alias-all
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.AliasAllDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel.impl;
/**
 * A document containing one alias-all(@) element.
 *
 * This is a complex type.
 */
public class AliasAllDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.AliasAllDocument
{
    private static final long serialVersionUID = 1L;
    
    public AliasAllDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIASALL$0 = 
        new javax.xml.namespace.QName("", "alias-all");
    
    
    /**
     * Gets the "alias-all" element
     */
    public com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll getAliasAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll target = null;
            target = (com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll)get_store().find_element_user(ALIASALL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "alias-all" element
     */
    public void setAliasAll(com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll aliasAll)
    {
        generatedSetterHelperImpl(aliasAll, ALIASALL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "alias-all" element
     */
    public com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll addNewAliasAll()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll target = null;
            target = (com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll)get_store().add_element_user(ALIASALL$0);
            return target;
        }
    }
    /**
     * An XML alias-all(@).
     *
     * This is a complex type.
     */
    public static class AliasAllImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll
    {
        private static final long serialVersionUID = 1L;
        
        public AliasAllImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName EXCLUDE$2 = 
            new javax.xml.namespace.QName("", "exclude");
        private static final javax.xml.namespace.QName ENTITYALIAS$4 = 
            new javax.xml.namespace.QName("", "entity-alias");
        private static final javax.xml.namespace.QName PREFIX$6 = 
            new javax.xml.namespace.QName("", "prefix");
        private static final javax.xml.namespace.QName GROUPBY$8 = 
            new javax.xml.namespace.QName("", "group-by");
        private static final javax.xml.namespace.QName FUNCTION$10 = 
            new javax.xml.namespace.QName("", "function");
        private static final javax.xml.namespace.QName FIELDSET$12 = 
            new javax.xml.namespace.QName("", "field-set");
        
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "description" element
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$0) != 0;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
                }
                target.set(description);
            }
        }
        
        /**
         * Unsets the "description" element
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$0, 0);
            }
        }
        
        /**
         * Gets array of all "exclude" elements
         */
        public com.kyt.xsd.entitymodel.ExcludeDocument.Exclude[] getExcludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXCLUDE$2, targetList);
                com.kyt.xsd.entitymodel.ExcludeDocument.Exclude[] result = new com.kyt.xsd.entitymodel.ExcludeDocument.Exclude[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "exclude" element
         */
        public com.kyt.xsd.entitymodel.ExcludeDocument.Exclude getExcludeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ExcludeDocument.Exclude target = null;
                target = (com.kyt.xsd.entitymodel.ExcludeDocument.Exclude)get_store().find_element_user(EXCLUDE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "exclude" element
         */
        public int sizeOfExcludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXCLUDE$2);
            }
        }
        
        /**
         * Sets array of all "exclude" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setExcludeArray(com.kyt.xsd.entitymodel.ExcludeDocument.Exclude[] excludeArray)
        {
            check_orphaned();
            arraySetterHelper(excludeArray, EXCLUDE$2);
        }
        
        /**
         * Sets ith "exclude" element
         */
        public void setExcludeArray(int i, com.kyt.xsd.entitymodel.ExcludeDocument.Exclude exclude)
        {
            generatedSetterHelperImpl(exclude, EXCLUDE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "exclude" element
         */
        public com.kyt.xsd.entitymodel.ExcludeDocument.Exclude insertNewExclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ExcludeDocument.Exclude target = null;
                target = (com.kyt.xsd.entitymodel.ExcludeDocument.Exclude)get_store().insert_element_user(EXCLUDE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "exclude" element
         */
        public com.kyt.xsd.entitymodel.ExcludeDocument.Exclude addNewExclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ExcludeDocument.Exclude target = null;
                target = (com.kyt.xsd.entitymodel.ExcludeDocument.Exclude)get_store().add_element_user(EXCLUDE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "exclude" element
         */
        public void removeExclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXCLUDE$2, i);
            }
        }
        
        /**
         * Gets the "entity-alias" attribute
         */
        public java.lang.String getEntityAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYALIAS$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entity-alias" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEntityAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYALIAS$4);
                return target;
            }
        }
        
        /**
         * Sets the "entity-alias" attribute
         */
        public void setEntityAlias(java.lang.String entityAlias)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYALIAS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYALIAS$4);
                }
                target.setStringValue(entityAlias);
            }
        }
        
        /**
         * Sets (as xml) the "entity-alias" attribute
         */
        public void xsetEntityAlias(org.apache.xmlbeans.XmlString entityAlias)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYALIAS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYALIAS$4);
                }
                target.set(entityAlias);
            }
        }
        
        /**
         * Gets the "prefix" attribute
         */
        public java.lang.String getPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFIX$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "prefix" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREFIX$6);
                return target;
            }
        }
        
        /**
         * True if has "prefix" attribute
         */
        public boolean isSetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PREFIX$6) != null;
            }
        }
        
        /**
         * Sets the "prefix" attribute
         */
        public void setPrefix(java.lang.String prefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREFIX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREFIX$6);
                }
                target.setStringValue(prefix);
            }
        }
        
        /**
         * Sets (as xml) the "prefix" attribute
         */
        public void xsetPrefix(org.apache.xmlbeans.XmlString prefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PREFIX$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PREFIX$6);
                }
                target.set(prefix);
            }
        }
        
        /**
         * Unsets the "prefix" attribute
         */
        public void unsetPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PREFIX$6);
            }
        }
        
        /**
         * Gets the "group-by" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean.Enum getGroupBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPBY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GROUPBY$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entitymodel.Boolean.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "group-by" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean xgetGroupBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(GROUPBY$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_default_attribute_value(GROUPBY$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "group-by" attribute
         */
        public boolean isSetGroupBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GROUPBY$8) != null;
            }
        }
        
        /**
         * Sets the "group-by" attribute
         */
        public void setGroupBy(com.kyt.xsd.entitymodel.Boolean.Enum groupBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPBY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUPBY$8);
                }
                target.setEnumValue(groupBy);
            }
        }
        
        /**
         * Sets (as xml) the "group-by" attribute
         */
        public void xsetGroupBy(com.kyt.xsd.entitymodel.Boolean groupBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(GROUPBY$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_store().add_attribute_user(GROUPBY$8);
                }
                target.set(groupBy);
            }
        }
        
        /**
         * Unsets the "group-by" attribute
         */
        public void unsetGroupBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GROUPBY$8);
            }
        }
        
        /**
         * Gets the "function" attribute
         */
        public com.kyt.xsd.entitymodel.AggregateFunction.Enum getFunction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FUNCTION$10);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entitymodel.AggregateFunction.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "function" attribute
         */
        public com.kyt.xsd.entitymodel.AggregateFunction xgetFunction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.AggregateFunction target = null;
                target = (com.kyt.xsd.entitymodel.AggregateFunction)get_store().find_attribute_user(FUNCTION$10);
                return target;
            }
        }
        
        /**
         * True if has "function" attribute
         */
        public boolean isSetFunction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FUNCTION$10) != null;
            }
        }
        
        /**
         * Sets the "function" attribute
         */
        public void setFunction(com.kyt.xsd.entitymodel.AggregateFunction.Enum function)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FUNCTION$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FUNCTION$10);
                }
                target.setEnumValue(function);
            }
        }
        
        /**
         * Sets (as xml) the "function" attribute
         */
        public void xsetFunction(com.kyt.xsd.entitymodel.AggregateFunction function)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.AggregateFunction target = null;
                target = (com.kyt.xsd.entitymodel.AggregateFunction)get_store().find_attribute_user(FUNCTION$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.AggregateFunction)get_store().add_attribute_user(FUNCTION$10);
                }
                target.set(function);
            }
        }
        
        /**
         * Unsets the "function" attribute
         */
        public void unsetFunction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FUNCTION$10);
            }
        }
        
        /**
         * Gets the "field-set" attribute
         */
        public java.lang.String getFieldSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDSET$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FIELDSET$12);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field-set" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFieldSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDSET$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(FIELDSET$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "field-set" attribute
         */
        public boolean isSetFieldSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FIELDSET$12) != null;
            }
        }
        
        /**
         * Sets the "field-set" attribute
         */
        public void setFieldSet(java.lang.String fieldSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDSET$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDSET$12);
                }
                target.setStringValue(fieldSet);
            }
        }
        
        /**
         * Sets (as xml) the "field-set" attribute
         */
        public void xsetFieldSet(org.apache.xmlbeans.XmlString fieldSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELDSET$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELDSET$12);
                }
                target.set(fieldSet);
            }
        }
        
        /**
         * Unsets the "field-set" attribute
         */
        public void unsetFieldSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FIELDSET$12);
            }
        }
    }
}
