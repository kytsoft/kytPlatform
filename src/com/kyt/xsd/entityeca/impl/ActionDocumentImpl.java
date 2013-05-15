/*
 * An XML document type.
 * Localname: action
 * Namespace: 
 * Java type: com.kyt.xsd.entityeca.ActionDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entityeca.impl;
/**
 * A document containing one action(@) element.
 *
 * This is a complex type.
 */
public class ActionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityeca.ActionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTION$0 = 
        new javax.xml.namespace.QName("", "action");
    
    
    /**
     * Gets the "action" element
     */
    public com.kyt.xsd.entityeca.ActionDocument.Action getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityeca.ActionDocument.Action target = null;
            target = (com.kyt.xsd.entityeca.ActionDocument.Action)get_store().find_element_user(ACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "action" element
     */
    public void setAction(com.kyt.xsd.entityeca.ActionDocument.Action action)
    {
        generatedSetterHelperImpl(action, ACTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "action" element
     */
    public com.kyt.xsd.entityeca.ActionDocument.Action addNewAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entityeca.ActionDocument.Action target = null;
            target = (com.kyt.xsd.entityeca.ActionDocument.Action)get_store().add_element_user(ACTION$0);
            return target;
        }
    }
    /**
     * An XML action(@).
     *
     * This is a complex type.
     */
    public static class ActionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entityeca.ActionDocument.Action
    {
        private static final long serialVersionUID = 1L;
        
        public ActionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVICE$0 = 
            new javax.xml.namespace.QName("", "service");
        private static final javax.xml.namespace.QName MODE$2 = 
            new javax.xml.namespace.QName("", "mode");
        private static final javax.xml.namespace.QName RESULTTOVALUE$4 = 
            new javax.xml.namespace.QName("", "result-to-value");
        private static final javax.xml.namespace.QName ABORTONERROR$6 = 
            new javax.xml.namespace.QName("", "abort-on-error");
        private static final javax.xml.namespace.QName ROLLBACKONERROR$8 = 
            new javax.xml.namespace.QName("", "rollback-on-error");
        private static final javax.xml.namespace.QName PERSIST$10 = 
            new javax.xml.namespace.QName("", "persist");
        private static final javax.xml.namespace.QName RUNASUSER$12 = 
            new javax.xml.namespace.QName("", "run-as-user");
        private static final javax.xml.namespace.QName VALUEATTR$14 = 
            new javax.xml.namespace.QName("", "value-attr");
        
        
        /**
         * Gets the "service" attribute
         */
        public java.lang.String getService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "service" attribute
         */
        public org.apache.xmlbeans.XmlString xgetService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICE$0);
                return target;
            }
        }
        
        /**
         * Sets the "service" attribute
         */
        public void setService(java.lang.String service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICE$0);
                }
                target.setStringValue(service);
            }
        }
        
        /**
         * Sets (as xml) the "service" attribute
         */
        public void xsetService(org.apache.xmlbeans.XmlString service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SERVICE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SERVICE$0);
                }
                target.set(service);
            }
        }
        
        /**
         * Gets the "mode" attribute
         */
        public com.kyt.xsd.entityeca.ActionDocument.Action.Mode.Enum getMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODE$2);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entityeca.ActionDocument.Action.Mode.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "mode" attribute
         */
        public com.kyt.xsd.entityeca.ActionDocument.Action.Mode xgetMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ActionDocument.Action.Mode target = null;
                target = (com.kyt.xsd.entityeca.ActionDocument.Action.Mode)get_store().find_attribute_user(MODE$2);
                return target;
            }
        }
        
        /**
         * Sets the "mode" attribute
         */
        public void setMode(com.kyt.xsd.entityeca.ActionDocument.Action.Mode.Enum mode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODE$2);
                }
                target.setEnumValue(mode);
            }
        }
        
        /**
         * Sets (as xml) the "mode" attribute
         */
        public void xsetMode(com.kyt.xsd.entityeca.ActionDocument.Action.Mode mode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ActionDocument.Action.Mode target = null;
                target = (com.kyt.xsd.entityeca.ActionDocument.Action.Mode)get_store().find_attribute_user(MODE$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ActionDocument.Action.Mode)get_store().add_attribute_user(MODE$2);
                }
                target.set(mode);
            }
        }
        
        /**
         * Gets the "result-to-value" attribute
         */
        public com.kyt.xsd.entityeca.ActionDocument.Action.ResultToValue.Enum getResultToValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTTOVALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RESULTTOVALUE$4);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entityeca.ActionDocument.Action.ResultToValue.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "result-to-value" attribute
         */
        public com.kyt.xsd.entityeca.ActionDocument.Action.ResultToValue xgetResultToValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ActionDocument.Action.ResultToValue target = null;
                target = (com.kyt.xsd.entityeca.ActionDocument.Action.ResultToValue)get_store().find_attribute_user(RESULTTOVALUE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ActionDocument.Action.ResultToValue)get_default_attribute_value(RESULTTOVALUE$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "result-to-value" attribute
         */
        public boolean isSetResultToValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESULTTOVALUE$4) != null;
            }
        }
        
        /**
         * Sets the "result-to-value" attribute
         */
        public void setResultToValue(com.kyt.xsd.entityeca.ActionDocument.Action.ResultToValue.Enum resultToValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTTOVALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESULTTOVALUE$4);
                }
                target.setEnumValue(resultToValue);
            }
        }
        
        /**
         * Sets (as xml) the "result-to-value" attribute
         */
        public void xsetResultToValue(com.kyt.xsd.entityeca.ActionDocument.Action.ResultToValue resultToValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ActionDocument.Action.ResultToValue target = null;
                target = (com.kyt.xsd.entityeca.ActionDocument.Action.ResultToValue)get_store().find_attribute_user(RESULTTOVALUE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ActionDocument.Action.ResultToValue)get_store().add_attribute_user(RESULTTOVALUE$4);
                }
                target.set(resultToValue);
            }
        }
        
        /**
         * Unsets the "result-to-value" attribute
         */
        public void unsetResultToValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESULTTOVALUE$4);
            }
        }
        
        /**
         * Gets the "abort-on-error" attribute
         */
        public com.kyt.xsd.entityeca.ActionDocument.Action.AbortOnError.Enum getAbortOnError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABORTONERROR$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ABORTONERROR$6);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entityeca.ActionDocument.Action.AbortOnError.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "abort-on-error" attribute
         */
        public com.kyt.xsd.entityeca.ActionDocument.Action.AbortOnError xgetAbortOnError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ActionDocument.Action.AbortOnError target = null;
                target = (com.kyt.xsd.entityeca.ActionDocument.Action.AbortOnError)get_store().find_attribute_user(ABORTONERROR$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ActionDocument.Action.AbortOnError)get_default_attribute_value(ABORTONERROR$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "abort-on-error" attribute
         */
        public boolean isSetAbortOnError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ABORTONERROR$6) != null;
            }
        }
        
        /**
         * Sets the "abort-on-error" attribute
         */
        public void setAbortOnError(com.kyt.xsd.entityeca.ActionDocument.Action.AbortOnError.Enum abortOnError)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABORTONERROR$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABORTONERROR$6);
                }
                target.setEnumValue(abortOnError);
            }
        }
        
        /**
         * Sets (as xml) the "abort-on-error" attribute
         */
        public void xsetAbortOnError(com.kyt.xsd.entityeca.ActionDocument.Action.AbortOnError abortOnError)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ActionDocument.Action.AbortOnError target = null;
                target = (com.kyt.xsd.entityeca.ActionDocument.Action.AbortOnError)get_store().find_attribute_user(ABORTONERROR$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ActionDocument.Action.AbortOnError)get_store().add_attribute_user(ABORTONERROR$6);
                }
                target.set(abortOnError);
            }
        }
        
        /**
         * Unsets the "abort-on-error" attribute
         */
        public void unsetAbortOnError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ABORTONERROR$6);
            }
        }
        
        /**
         * Gets the "rollback-on-error" attribute
         */
        public com.kyt.xsd.entityeca.ActionDocument.Action.RollbackOnError.Enum getRollbackOnError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLLBACKONERROR$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ROLLBACKONERROR$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entityeca.ActionDocument.Action.RollbackOnError.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "rollback-on-error" attribute
         */
        public com.kyt.xsd.entityeca.ActionDocument.Action.RollbackOnError xgetRollbackOnError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ActionDocument.Action.RollbackOnError target = null;
                target = (com.kyt.xsd.entityeca.ActionDocument.Action.RollbackOnError)get_store().find_attribute_user(ROLLBACKONERROR$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ActionDocument.Action.RollbackOnError)get_default_attribute_value(ROLLBACKONERROR$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "rollback-on-error" attribute
         */
        public boolean isSetRollbackOnError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROLLBACKONERROR$8) != null;
            }
        }
        
        /**
         * Sets the "rollback-on-error" attribute
         */
        public void setRollbackOnError(com.kyt.xsd.entityeca.ActionDocument.Action.RollbackOnError.Enum rollbackOnError)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLLBACKONERROR$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLLBACKONERROR$8);
                }
                target.setEnumValue(rollbackOnError);
            }
        }
        
        /**
         * Sets (as xml) the "rollback-on-error" attribute
         */
        public void xsetRollbackOnError(com.kyt.xsd.entityeca.ActionDocument.Action.RollbackOnError rollbackOnError)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ActionDocument.Action.RollbackOnError target = null;
                target = (com.kyt.xsd.entityeca.ActionDocument.Action.RollbackOnError)get_store().find_attribute_user(ROLLBACKONERROR$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ActionDocument.Action.RollbackOnError)get_store().add_attribute_user(ROLLBACKONERROR$8);
                }
                target.set(rollbackOnError);
            }
        }
        
        /**
         * Unsets the "rollback-on-error" attribute
         */
        public void unsetRollbackOnError()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROLLBACKONERROR$8);
            }
        }
        
        /**
         * Gets the "persist" attribute
         */
        public com.kyt.xsd.entityeca.ActionDocument.Action.Persist.Enum getPersist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSIST$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PERSIST$10);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entityeca.ActionDocument.Action.Persist.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "persist" attribute
         */
        public com.kyt.xsd.entityeca.ActionDocument.Action.Persist xgetPersist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ActionDocument.Action.Persist target = null;
                target = (com.kyt.xsd.entityeca.ActionDocument.Action.Persist)get_store().find_attribute_user(PERSIST$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ActionDocument.Action.Persist)get_default_attribute_value(PERSIST$10);
                }
                return target;
            }
        }
        
        /**
         * True if has "persist" attribute
         */
        public boolean isSetPersist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PERSIST$10) != null;
            }
        }
        
        /**
         * Sets the "persist" attribute
         */
        public void setPersist(com.kyt.xsd.entityeca.ActionDocument.Action.Persist.Enum persist)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSIST$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERSIST$10);
                }
                target.setEnumValue(persist);
            }
        }
        
        /**
         * Sets (as xml) the "persist" attribute
         */
        public void xsetPersist(com.kyt.xsd.entityeca.ActionDocument.Action.Persist persist)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entityeca.ActionDocument.Action.Persist target = null;
                target = (com.kyt.xsd.entityeca.ActionDocument.Action.Persist)get_store().find_attribute_user(PERSIST$10);
                if (target == null)
                {
                    target = (com.kyt.xsd.entityeca.ActionDocument.Action.Persist)get_store().add_attribute_user(PERSIST$10);
                }
                target.set(persist);
            }
        }
        
        /**
         * Unsets the "persist" attribute
         */
        public void unsetPersist()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PERSIST$10);
            }
        }
        
        /**
         * Gets the "run-as-user" attribute
         */
        public java.lang.String getRunAsUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNASUSER$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RUNASUSER$12);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "run-as-user" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRunAsUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RUNASUSER$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(RUNASUSER$12);
                }
                return target;
            }
        }
        
        /**
         * True if has "run-as-user" attribute
         */
        public boolean isSetRunAsUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RUNASUSER$12) != null;
            }
        }
        
        /**
         * Sets the "run-as-user" attribute
         */
        public void setRunAsUser(java.lang.String runAsUser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RUNASUSER$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RUNASUSER$12);
                }
                target.setStringValue(runAsUser);
            }
        }
        
        /**
         * Sets (as xml) the "run-as-user" attribute
         */
        public void xsetRunAsUser(org.apache.xmlbeans.XmlString runAsUser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RUNASUSER$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RUNASUSER$12);
                }
                target.set(runAsUser);
            }
        }
        
        /**
         * Unsets the "run-as-user" attribute
         */
        public void unsetRunAsUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RUNASUSER$12);
            }
        }
        
        /**
         * Gets the "value-attr" attribute
         */
        public java.lang.String getValueAttr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUEATTR$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value-attr" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValueAttr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUEATTR$14);
                return target;
            }
        }
        
        /**
         * True if has "value-attr" attribute
         */
        public boolean isSetValueAttr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUEATTR$14) != null;
            }
        }
        
        /**
         * Sets the "value-attr" attribute
         */
        public void setValueAttr(java.lang.String valueAttr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUEATTR$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUEATTR$14);
                }
                target.setStringValue(valueAttr);
            }
        }
        
        /**
         * Sets (as xml) the "value-attr" attribute
         */
        public void xsetValueAttr(org.apache.xmlbeans.XmlString valueAttr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUEATTR$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUEATTR$14);
                }
                target.set(valueAttr);
            }
        }
        
        /**
         * Unsets the "value-attr" attribute
         */
        public void unsetValueAttr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUEATTR$14);
            }
        }
        /**
         * An XML mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityeca.ActionDocument$Action$Mode.
         */
        public static class ModeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entityeca.ActionDocument.Action.Mode
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
         * An XML result-to-value(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityeca.ActionDocument$Action$ResultToValue.
         */
        public static class ResultToValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entityeca.ActionDocument.Action.ResultToValue
        {
            private static final long serialVersionUID = 1L;
            
            public ResultToValueImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ResultToValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML abort-on-error(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityeca.ActionDocument$Action$AbortOnError.
         */
        public static class AbortOnErrorImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entityeca.ActionDocument.Action.AbortOnError
        {
            private static final long serialVersionUID = 1L;
            
            public AbortOnErrorImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected AbortOnErrorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML rollback-on-error(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityeca.ActionDocument$Action$RollbackOnError.
         */
        public static class RollbackOnErrorImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entityeca.ActionDocument.Action.RollbackOnError
        {
            private static final long serialVersionUID = 1L;
            
            public RollbackOnErrorImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RollbackOnErrorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML persist(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entityeca.ActionDocument$Action$Persist.
         */
        public static class PersistImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entityeca.ActionDocument.Action.Persist
        {
            private static final long serialVersionUID = 1L;
            
            public PersistImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PersistImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
