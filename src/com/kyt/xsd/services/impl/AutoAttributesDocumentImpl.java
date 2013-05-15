/*
 * An XML document type.
 * Localname: auto-attributes
 * Namespace: 
 * Java type: com.kyt.xsd.services.AutoAttributesDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.services.impl;
/**
 * A document containing one auto-attributes(@) element.
 *
 * This is a complex type.
 */
public class AutoAttributesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.AutoAttributesDocument
{
    private static final long serialVersionUID = 1L;
    
    public AutoAttributesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTOATTRIBUTES$0 = 
        new javax.xml.namespace.QName("", "auto-attributes");
    
    
    /**
     * Gets the "auto-attributes" element
     */
    public com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes getAutoAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes target = null;
            target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes)get_store().find_element_user(AUTOATTRIBUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "auto-attributes" element
     */
    public void setAutoAttributes(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes autoAttributes)
    {
        generatedSetterHelperImpl(autoAttributes, AUTOATTRIBUTES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "auto-attributes" element
     */
    public com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes addNewAutoAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes target = null;
            target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes)get_store().add_element_user(AUTOATTRIBUTES$0);
            return target;
        }
    }
    /**
     * An XML auto-attributes(@).
     *
     * This is a complex type.
     */
    public static class AutoAttributesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes
    {
        private static final long serialVersionUID = 1L;
        
        public AutoAttributesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXCLUDE$0 = 
            new javax.xml.namespace.QName("", "exclude");
        private static final javax.xml.namespace.QName ENTITYNAME$2 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName INCLUDE$4 = 
            new javax.xml.namespace.QName("", "include");
        private static final javax.xml.namespace.QName MODE$6 = 
            new javax.xml.namespace.QName("", "mode");
        private static final javax.xml.namespace.QName OPTIONAL$8 = 
            new javax.xml.namespace.QName("", "optional");
        private static final javax.xml.namespace.QName FORMDISPLAY$10 = 
            new javax.xml.namespace.QName("", "form-display");
        private static final javax.xml.namespace.QName ALLOWHTML$12 = 
            new javax.xml.namespace.QName("", "allow-html");
        
        
        /**
         * Gets array of all "exclude" elements
         */
        public com.kyt.xsd.services.ExcludeDocument.Exclude[] getExcludeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXCLUDE$0, targetList);
                com.kyt.xsd.services.ExcludeDocument.Exclude[] result = new com.kyt.xsd.services.ExcludeDocument.Exclude[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "exclude" element
         */
        public com.kyt.xsd.services.ExcludeDocument.Exclude getExcludeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.ExcludeDocument.Exclude target = null;
                target = (com.kyt.xsd.services.ExcludeDocument.Exclude)get_store().find_element_user(EXCLUDE$0, i);
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
                return get_store().count_elements(EXCLUDE$0);
            }
        }
        
        /**
         * Sets array of all "exclude" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setExcludeArray(com.kyt.xsd.services.ExcludeDocument.Exclude[] excludeArray)
        {
            check_orphaned();
            arraySetterHelper(excludeArray, EXCLUDE$0);
        }
        
        /**
         * Sets ith "exclude" element
         */
        public void setExcludeArray(int i, com.kyt.xsd.services.ExcludeDocument.Exclude exclude)
        {
            generatedSetterHelperImpl(exclude, EXCLUDE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "exclude" element
         */
        public com.kyt.xsd.services.ExcludeDocument.Exclude insertNewExclude(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.ExcludeDocument.Exclude target = null;
                target = (com.kyt.xsd.services.ExcludeDocument.Exclude)get_store().insert_element_user(EXCLUDE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "exclude" element
         */
        public com.kyt.xsd.services.ExcludeDocument.Exclude addNewExclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.ExcludeDocument.Exclude target = null;
                target = (com.kyt.xsd.services.ExcludeDocument.Exclude)get_store().add_element_user(EXCLUDE$0);
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
                get_store().remove_element(EXCLUDE$0, i);
            }
        }
        
        /**
         * Gets the "entity-name" attribute
         */
        public java.lang.String getEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entity-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$2);
                return target;
            }
        }
        
        /**
         * True if has "entity-name" attribute
         */
        public boolean isSetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENTITYNAME$2) != null;
            }
        }
        
        /**
         * Sets the "entity-name" attribute
         */
        public void setEntityName(java.lang.String entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$2);
                }
                target.setStringValue(entityName);
            }
        }
        
        /**
         * Sets (as xml) the "entity-name" attribute
         */
        public void xsetEntityName(org.apache.xmlbeans.XmlString entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$2);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Unsets the "entity-name" attribute
         */
        public void unsetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENTITYNAME$2);
            }
        }
        
        /**
         * Gets the "include" attribute
         */
        public com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include.Enum getInclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCLUDE$4);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "include" attribute
         */
        public com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include xgetInclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include target = null;
                target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include)get_store().find_attribute_user(INCLUDE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include)get_default_attribute_value(INCLUDE$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "include" attribute
         */
        public boolean isSetInclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INCLUDE$4) != null;
            }
        }
        
        /**
         * Sets the "include" attribute
         */
        public void setInclude(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include.Enum include)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUDE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUDE$4);
                }
                target.setEnumValue(include);
            }
        }
        
        /**
         * Sets (as xml) the "include" attribute
         */
        public void xsetInclude(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include include)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include target = null;
                target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include)get_store().find_attribute_user(INCLUDE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include)get_store().add_attribute_user(INCLUDE$4);
                }
                target.set(include);
            }
        }
        
        /**
         * Unsets the "include" attribute
         */
        public void unsetInclude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INCLUDE$4);
            }
        }
        
        /**
         * Gets the "mode" attribute
         */
        public com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode.Enum getMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODE$6);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "mode" attribute
         */
        public com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode xgetMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode target = null;
                target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode)get_store().find_attribute_user(MODE$6);
                return target;
            }
        }
        
        /**
         * Sets the "mode" attribute
         */
        public void setMode(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode.Enum mode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODE$6);
                }
                target.setEnumValue(mode);
            }
        }
        
        /**
         * Sets (as xml) the "mode" attribute
         */
        public void xsetMode(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode mode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode target = null;
                target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode)get_store().find_attribute_user(MODE$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode)get_store().add_attribute_user(MODE$6);
                }
                target.set(mode);
            }
        }
        
        /**
         * Gets the "optional" attribute
         */
        public com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional.Enum getOptional()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPTIONAL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OPTIONAL$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "optional" attribute
         */
        public com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional xgetOptional()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional target = null;
                target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional)get_store().find_attribute_user(OPTIONAL$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional)get_default_attribute_value(OPTIONAL$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "optional" attribute
         */
        public boolean isSetOptional()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OPTIONAL$8) != null;
            }
        }
        
        /**
         * Sets the "optional" attribute
         */
        public void setOptional(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional.Enum optional)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPTIONAL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPTIONAL$8);
                }
                target.setEnumValue(optional);
            }
        }
        
        /**
         * Sets (as xml) the "optional" attribute
         */
        public void xsetOptional(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional optional)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional target = null;
                target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional)get_store().find_attribute_user(OPTIONAL$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional)get_store().add_attribute_user(OPTIONAL$8);
                }
                target.set(optional);
            }
        }
        
        /**
         * Unsets the "optional" attribute
         */
        public void unsetOptional()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OPTIONAL$8);
            }
        }
        
        /**
         * Gets the "form-display" attribute
         */
        public com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay.Enum getFormDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMDISPLAY$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FORMDISPLAY$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "form-display" attribute
         */
        public com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay xgetFormDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay target = null;
                target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay)get_store().find_attribute_user(FORMDISPLAY$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay)get_default_attribute_value(FORMDISPLAY$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "form-display" attribute
         */
        public boolean isSetFormDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FORMDISPLAY$10) != null;
            }
        }
        
        /**
         * Sets the "form-display" attribute
         */
        public void setFormDisplay(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay.Enum formDisplay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMDISPLAY$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMDISPLAY$10);
                }
                target.setEnumValue(formDisplay);
            }
        }
        
        /**
         * Sets (as xml) the "form-display" attribute
         */
        public void xsetFormDisplay(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay formDisplay)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay target = null;
                target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay)get_store().find_attribute_user(FORMDISPLAY$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay)get_store().add_attribute_user(FORMDISPLAY$10);
                }
                target.set(formDisplay);
            }
        }
        
        /**
         * Unsets the "form-display" attribute
         */
        public void unsetFormDisplay()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FORMDISPLAY$10);
            }
        }
        
        /**
         * Gets the "allow-html" attribute
         */
        public com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml.Enum getAllowHtml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWHTML$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALLOWHTML$12);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "allow-html" attribute
         */
        public com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml xgetAllowHtml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml target = null;
                target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml)get_store().find_attribute_user(ALLOWHTML$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml)get_default_attribute_value(ALLOWHTML$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "allow-html" attribute
         */
        public boolean isSetAllowHtml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ALLOWHTML$12) != null;
            }
        }
        
        /**
         * Sets the "allow-html" attribute
         */
        public void setAllowHtml(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml.Enum allowHtml)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALLOWHTML$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALLOWHTML$12);
                }
                target.setEnumValue(allowHtml);
            }
        }
        
        /**
         * Sets (as xml) the "allow-html" attribute
         */
        public void xsetAllowHtml(com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml allowHtml)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml target = null;
                target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml)get_store().find_attribute_user(ALLOWHTML$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml)get_store().add_attribute_user(ALLOWHTML$12);
                }
                target.set(allowHtml);
            }
        }
        
        /**
         * Unsets the "allow-html" attribute
         */
        public void unsetAllowHtml()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ALLOWHTML$12);
            }
        }
        /**
         * An XML include(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$Include.
         */
        public static class IncludeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Include
        {
            private static final long serialVersionUID = 1L;
            
            public IncludeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected IncludeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$Mode.
         */
        public static class ModeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Mode
        {
            private static final long serialVersionUID = 1L;
            
            public ModeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ModeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML optional(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$Optional.
         */
        public static class OptionalImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.Optional
        {
            private static final long serialVersionUID = 1L;
            
            public OptionalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected OptionalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML form-display(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$FormDisplay.
         */
        public static class FormDisplayImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.FormDisplay
        {
            private static final long serialVersionUID = 1L;
            
            public FormDisplayImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected FormDisplayImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML allow-html(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.services.AutoAttributesDocument$AutoAttributes$AllowHtml.
         */
        public static class AllowHtmlImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.services.AutoAttributesDocument.AutoAttributes.AllowHtml
        {
            private static final long serialVersionUID = 1L;
            
            public AllowHtmlImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AllowHtmlImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
