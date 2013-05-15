/*
 * An XML document type.
 * Localname: invoke
 * Namespace: 
 * Java type: com.kyt.xsd.servicegroup.InvokeDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.servicegroup.impl;
/**
 * A document containing one invoke(@) element.
 *
 * This is a complex type.
 */
public class InvokeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.servicegroup.InvokeDocument
{
    private static final long serialVersionUID = 1L;
    
    public InvokeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVOKE$0 = 
        new javax.xml.namespace.QName("", "invoke");
    
    
    /**
     * Gets the "invoke" element
     */
    public com.kyt.xsd.servicegroup.InvokeDocument.Invoke getInvoke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.servicegroup.InvokeDocument.Invoke target = null;
            target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke)get_store().find_element_user(INVOKE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "invoke" element
     */
    public void setInvoke(com.kyt.xsd.servicegroup.InvokeDocument.Invoke invoke)
    {
        generatedSetterHelperImpl(invoke, INVOKE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "invoke" element
     */
    public com.kyt.xsd.servicegroup.InvokeDocument.Invoke addNewInvoke()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.servicegroup.InvokeDocument.Invoke target = null;
            target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke)get_store().add_element_user(INVOKE$0);
            return target;
        }
    }
    /**
     * An XML invoke(@).
     *
     * This is a complex type.
     */
    public static class InvokeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.servicegroup.InvokeDocument.Invoke
    {
        private static final long serialVersionUID = 1L;
        
        public InvokeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName MODE$2 = 
            new javax.xml.namespace.QName("", "mode");
        private static final javax.xml.namespace.QName PARAMETERS$4 = 
            new javax.xml.namespace.QName("", "parameters");
        private static final javax.xml.namespace.QName RESULTTOCONTEXT$6 = 
            new javax.xml.namespace.QName("", "result-to-context");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "mode" attribute
         */
        public com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Mode.Enum getMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MODE$2);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Mode.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "mode" attribute
         */
        public com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Mode xgetMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Mode target = null;
                target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Mode)get_store().find_attribute_user(MODE$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Mode)get_default_attribute_value(MODE$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "mode" attribute
         */
        public boolean isSetMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MODE$2) != null;
            }
        }
        
        /**
         * Sets the "mode" attribute
         */
        public void setMode(com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Mode.Enum mode)
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
        public void xsetMode(com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Mode mode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Mode target = null;
                target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Mode)get_store().find_attribute_user(MODE$2);
                if (target == null)
                {
                    target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Mode)get_store().add_attribute_user(MODE$2);
                }
                target.set(mode);
            }
        }
        
        /**
         * Unsets the "mode" attribute
         */
        public void unsetMode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MODE$2);
            }
        }
        
        /**
         * Gets the "parameters" attribute
         */
        public com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Parameters.Enum getParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARAMETERS$4);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Parameters.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "parameters" attribute
         */
        public com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Parameters xgetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Parameters target = null;
                target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Parameters)get_store().find_attribute_user(PARAMETERS$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Parameters)get_default_attribute_value(PARAMETERS$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "parameters" attribute
         */
        public boolean isSetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARAMETERS$4) != null;
            }
        }
        
        /**
         * Sets the "parameters" attribute
         */
        public void setParameters(com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Parameters.Enum parameters)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMETERS$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARAMETERS$4);
                }
                target.setEnumValue(parameters);
            }
        }
        
        /**
         * Sets (as xml) the "parameters" attribute
         */
        public void xsetParameters(com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Parameters parameters)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Parameters target = null;
                target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Parameters)get_store().find_attribute_user(PARAMETERS$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Parameters)get_store().add_attribute_user(PARAMETERS$4);
                }
                target.set(parameters);
            }
        }
        
        /**
         * Unsets the "parameters" attribute
         */
        public void unsetParameters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARAMETERS$4);
            }
        }
        
        /**
         * Gets the "result-to-context" attribute
         */
        public com.kyt.xsd.servicegroup.InvokeDocument.Invoke.ResultToContext.Enum getResultToContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTTOCONTEXT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RESULTTOCONTEXT$6);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.ResultToContext.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "result-to-context" attribute
         */
        public com.kyt.xsd.servicegroup.InvokeDocument.Invoke.ResultToContext xgetResultToContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.servicegroup.InvokeDocument.Invoke.ResultToContext target = null;
                target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.ResultToContext)get_store().find_attribute_user(RESULTTOCONTEXT$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.ResultToContext)get_default_attribute_value(RESULTTOCONTEXT$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "result-to-context" attribute
         */
        public boolean isSetResultToContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RESULTTOCONTEXT$6) != null;
            }
        }
        
        /**
         * Sets the "result-to-context" attribute
         */
        public void setResultToContext(com.kyt.xsd.servicegroup.InvokeDocument.Invoke.ResultToContext.Enum resultToContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESULTTOCONTEXT$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESULTTOCONTEXT$6);
                }
                target.setEnumValue(resultToContext);
            }
        }
        
        /**
         * Sets (as xml) the "result-to-context" attribute
         */
        public void xsetResultToContext(com.kyt.xsd.servicegroup.InvokeDocument.Invoke.ResultToContext resultToContext)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.servicegroup.InvokeDocument.Invoke.ResultToContext target = null;
                target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.ResultToContext)get_store().find_attribute_user(RESULTTOCONTEXT$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.servicegroup.InvokeDocument.Invoke.ResultToContext)get_store().add_attribute_user(RESULTTOCONTEXT$6);
                }
                target.set(resultToContext);
            }
        }
        
        /**
         * Unsets the "result-to-context" attribute
         */
        public void unsetResultToContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RESULTTOCONTEXT$6);
            }
        }
        /**
         * An XML mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.servicegroup.InvokeDocument$Invoke$Mode.
         */
        public static class ModeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Mode
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
         * An XML parameters(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.servicegroup.InvokeDocument$Invoke$Parameters.
         */
        public static class ParametersImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.servicegroup.InvokeDocument.Invoke.Parameters
        {
            private static final long serialVersionUID = 1L;
            
            public ParametersImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ParametersImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML result-to-context(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.servicegroup.InvokeDocument$Invoke$ResultToContext.
         */
        public static class ResultToContextImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.servicegroup.InvokeDocument.Invoke.ResultToContext
        {
            private static final long serialVersionUID = 1L;
            
            public ResultToContextImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ResultToContextImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
