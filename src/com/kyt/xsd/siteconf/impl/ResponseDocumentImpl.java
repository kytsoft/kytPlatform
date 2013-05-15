/*
 * An XML document type.
 * Localname: response
 * Namespace: 
 * Java type: com.kyt.xsd.siteconf.ResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.siteconf.impl;
/**
 * A document containing one response(@) element.
 *
 * This is a complex type.
 */
public class ResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.ResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSE$0 = 
        new javax.xml.namespace.QName("", "response");
    
    
    /**
     * Gets the "response" element
     */
    public com.kyt.xsd.siteconf.ResponseDocument.Response getResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.ResponseDocument.Response target = null;
            target = (com.kyt.xsd.siteconf.ResponseDocument.Response)get_store().find_element_user(RESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "response" element
     */
    public void setResponse(com.kyt.xsd.siteconf.ResponseDocument.Response response)
    {
        generatedSetterHelperImpl(response, RESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "response" element
     */
    public com.kyt.xsd.siteconf.ResponseDocument.Response addNewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.siteconf.ResponseDocument.Response target = null;
            target = (com.kyt.xsd.siteconf.ResponseDocument.Response)get_store().add_element_user(RESPONSE$0);
            return target;
        }
    }
    /**
     * An XML response(@).
     *
     * This is a complex type.
     */
    public static class ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.siteconf.ResponseDocument.Response
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REDIRECTPARAMETER$0 = 
            new javax.xml.namespace.QName("", "redirect-parameter");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName TYPE$4 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName VALUE$6 = 
            new javax.xml.namespace.QName("", "value");
        private static final javax.xml.namespace.QName SAVELASTVIEW$8 = 
            new javax.xml.namespace.QName("", "save-last-view");
        private static final javax.xml.namespace.QName SAVECURRENTVIEW$10 = 
            new javax.xml.namespace.QName("", "save-current-view");
        private static final javax.xml.namespace.QName SAVEHOMEVIEW$12 = 
            new javax.xml.namespace.QName("", "save-home-view");
        
        
        /**
         * Gets array of all "redirect-parameter" elements
         */
        public com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter[] getRedirectParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REDIRECTPARAMETER$0, targetList);
                com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter[] result = new com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "redirect-parameter" element
         */
        public com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter getRedirectParameterArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter target = null;
                target = (com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter)get_store().find_element_user(REDIRECTPARAMETER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "redirect-parameter" element
         */
        public int sizeOfRedirectParameterArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REDIRECTPARAMETER$0);
            }
        }
        
        /**
         * Sets array of all "redirect-parameter" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRedirectParameterArray(com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter[] redirectParameterArray)
        {
            check_orphaned();
            arraySetterHelper(redirectParameterArray, REDIRECTPARAMETER$0);
        }
        
        /**
         * Sets ith "redirect-parameter" element
         */
        public void setRedirectParameterArray(int i, com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter redirectParameter)
        {
            generatedSetterHelperImpl(redirectParameter, REDIRECTPARAMETER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "redirect-parameter" element
         */
        public com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter insertNewRedirectParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter target = null;
                target = (com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter)get_store().insert_element_user(REDIRECTPARAMETER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "redirect-parameter" element
         */
        public com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter addNewRedirectParameter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter target = null;
                target = (com.kyt.xsd.siteconf.RedirectParameterDocument.RedirectParameter)get_store().add_element_user(REDIRECTPARAMETER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "redirect-parameter" element
         */
        public void removeRedirectParameter(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REDIRECTPARAMETER$0, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public com.kyt.xsd.siteconf.ResponseDocument.Response.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.ResponseDocument.Response.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.siteconf.ResponseDocument.Response.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.ResponseDocument.Response.Type target = null;
                target = (com.kyt.xsd.siteconf.ResponseDocument.Response.Type)get_store().find_attribute_user(TYPE$4);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.kyt.xsd.siteconf.ResponseDocument.Response.Type.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(com.kyt.xsd.siteconf.ResponseDocument.Response.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.ResponseDocument.Response.Type target = null;
                target = (com.kyt.xsd.siteconf.ResponseDocument.Response.Type)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.ResponseDocument.Response.Type)get_store().add_attribute_user(TYPE$4);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$6);
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$6) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$6);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$6);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$6);
            }
        }
        
        /**
         * Gets the "save-last-view" attribute
         */
        public com.kyt.xsd.siteconf.ResponseDocument.Response.SaveLastView.Enum getSaveLastView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVELASTVIEW$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SAVELASTVIEW$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveLastView.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "save-last-view" attribute
         */
        public com.kyt.xsd.siteconf.ResponseDocument.Response.SaveLastView xgetSaveLastView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.ResponseDocument.Response.SaveLastView target = null;
                target = (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveLastView)get_store().find_attribute_user(SAVELASTVIEW$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveLastView)get_default_attribute_value(SAVELASTVIEW$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "save-last-view" attribute
         */
        public boolean isSetSaveLastView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SAVELASTVIEW$8) != null;
            }
        }
        
        /**
         * Sets the "save-last-view" attribute
         */
        public void setSaveLastView(com.kyt.xsd.siteconf.ResponseDocument.Response.SaveLastView.Enum saveLastView)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVELASTVIEW$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAVELASTVIEW$8);
                }
                target.setEnumValue(saveLastView);
            }
        }
        
        /**
         * Sets (as xml) the "save-last-view" attribute
         */
        public void xsetSaveLastView(com.kyt.xsd.siteconf.ResponseDocument.Response.SaveLastView saveLastView)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.ResponseDocument.Response.SaveLastView target = null;
                target = (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveLastView)get_store().find_attribute_user(SAVELASTVIEW$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveLastView)get_store().add_attribute_user(SAVELASTVIEW$8);
                }
                target.set(saveLastView);
            }
        }
        
        /**
         * Unsets the "save-last-view" attribute
         */
        public void unsetSaveLastView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SAVELASTVIEW$8);
            }
        }
        
        /**
         * Gets the "save-current-view" attribute
         */
        public com.kyt.xsd.siteconf.ResponseDocument.Response.SaveCurrentView.Enum getSaveCurrentView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVECURRENTVIEW$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SAVECURRENTVIEW$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveCurrentView.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "save-current-view" attribute
         */
        public com.kyt.xsd.siteconf.ResponseDocument.Response.SaveCurrentView xgetSaveCurrentView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.ResponseDocument.Response.SaveCurrentView target = null;
                target = (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveCurrentView)get_store().find_attribute_user(SAVECURRENTVIEW$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveCurrentView)get_default_attribute_value(SAVECURRENTVIEW$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "save-current-view" attribute
         */
        public boolean isSetSaveCurrentView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SAVECURRENTVIEW$10) != null;
            }
        }
        
        /**
         * Sets the "save-current-view" attribute
         */
        public void setSaveCurrentView(com.kyt.xsd.siteconf.ResponseDocument.Response.SaveCurrentView.Enum saveCurrentView)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVECURRENTVIEW$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAVECURRENTVIEW$10);
                }
                target.setEnumValue(saveCurrentView);
            }
        }
        
        /**
         * Sets (as xml) the "save-current-view" attribute
         */
        public void xsetSaveCurrentView(com.kyt.xsd.siteconf.ResponseDocument.Response.SaveCurrentView saveCurrentView)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.ResponseDocument.Response.SaveCurrentView target = null;
                target = (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveCurrentView)get_store().find_attribute_user(SAVECURRENTVIEW$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveCurrentView)get_store().add_attribute_user(SAVECURRENTVIEW$10);
                }
                target.set(saveCurrentView);
            }
        }
        
        /**
         * Unsets the "save-current-view" attribute
         */
        public void unsetSaveCurrentView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SAVECURRENTVIEW$10);
            }
        }
        
        /**
         * Gets the "save-home-view" attribute
         */
        public com.kyt.xsd.siteconf.ResponseDocument.Response.SaveHomeView.Enum getSaveHomeView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVEHOMEVIEW$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SAVEHOMEVIEW$12);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveHomeView.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "save-home-view" attribute
         */
        public com.kyt.xsd.siteconf.ResponseDocument.Response.SaveHomeView xgetSaveHomeView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.ResponseDocument.Response.SaveHomeView target = null;
                target = (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveHomeView)get_store().find_attribute_user(SAVEHOMEVIEW$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveHomeView)get_default_attribute_value(SAVEHOMEVIEW$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "save-home-view" attribute
         */
        public boolean isSetSaveHomeView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SAVEHOMEVIEW$12) != null;
            }
        }
        
        /**
         * Sets the "save-home-view" attribute
         */
        public void setSaveHomeView(com.kyt.xsd.siteconf.ResponseDocument.Response.SaveHomeView.Enum saveHomeView)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVEHOMEVIEW$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAVEHOMEVIEW$12);
                }
                target.setEnumValue(saveHomeView);
            }
        }
        
        /**
         * Sets (as xml) the "save-home-view" attribute
         */
        public void xsetSaveHomeView(com.kyt.xsd.siteconf.ResponseDocument.Response.SaveHomeView saveHomeView)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.siteconf.ResponseDocument.Response.SaveHomeView target = null;
                target = (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveHomeView)get_store().find_attribute_user(SAVEHOMEVIEW$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.siteconf.ResponseDocument.Response.SaveHomeView)get_store().add_attribute_user(SAVEHOMEVIEW$12);
                }
                target.set(saveHomeView);
            }
        }
        
        /**
         * Unsets the "save-home-view" attribute
         */
        public void unsetSaveHomeView()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SAVEHOMEVIEW$12);
            }
        }
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.ResponseDocument$Response$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.ResponseDocument.Response.Type
        {
            private static final long serialVersionUID = 1L;
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML save-last-view(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.ResponseDocument$Response$SaveLastView.
         */
        public static class SaveLastViewImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.ResponseDocument.Response.SaveLastView
        {
            private static final long serialVersionUID = 1L;
            
            public SaveLastViewImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SaveLastViewImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML save-current-view(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.ResponseDocument$Response$SaveCurrentView.
         */
        public static class SaveCurrentViewImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.ResponseDocument.Response.SaveCurrentView
        {
            private static final long serialVersionUID = 1L;
            
            public SaveCurrentViewImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SaveCurrentViewImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML save-home-view(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.siteconf.ResponseDocument$Response$SaveHomeView.
         */
        public static class SaveHomeViewImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.siteconf.ResponseDocument.Response.SaveHomeView
        {
            private static final long serialVersionUID = 1L;
            
            public SaveHomeViewImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SaveHomeViewImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
