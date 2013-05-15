/*
 * An XML document type.
 * Localname: screen
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.ScreenDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one screen(@) element.
 *
 * This is a complex type.
 */
public class ScreenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.ScreenDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScreenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCREEN$0 = 
        new javax.xml.namespace.QName("", "screen");
    
    
    /**
     * Gets the "screen" element
     */
    public com.kyt.xsd.widgetscreen.ScreenDocument.Screen getScreen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.ScreenDocument.Screen target = null;
            target = (com.kyt.xsd.widgetscreen.ScreenDocument.Screen)get_store().find_element_user(SCREEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "screen" element
     */
    public void setScreen(com.kyt.xsd.widgetscreen.ScreenDocument.Screen screen)
    {
        generatedSetterHelperImpl(screen, SCREEN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "screen" element
     */
    public com.kyt.xsd.widgetscreen.ScreenDocument.Screen addNewScreen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.ScreenDocument.Screen target = null;
            target = (com.kyt.xsd.widgetscreen.ScreenDocument.Screen)get_store().add_element_user(SCREEN$0);
            return target;
        }
    }
    /**
     * An XML screen(@).
     *
     * This is a complex type.
     */
    public static class ScreenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.ScreenDocument.Screen
    {
        private static final long serialVersionUID = 1L;
        
        public ScreenImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SECTION$0 = 
            new javax.xml.namespace.QName("", "section");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName TRANSACTIONTIMEOUT$4 = 
            new javax.xml.namespace.QName("", "transaction-timeout");
        private static final javax.xml.namespace.QName USETRANSACTION$6 = 
            new javax.xml.namespace.QName("", "use-transaction");
        private static final javax.xml.namespace.QName USECACHE$8 = 
            new javax.xml.namespace.QName("", "use-cache");
        
        
        /**
         * Gets the "section" element
         */
        public com.kyt.xsd.widgetscreen.SectionDocument.Section getSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SectionDocument.Section target = null;
                target = (com.kyt.xsd.widgetscreen.SectionDocument.Section)get_store().find_element_user(SECTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "section" element
         */
        public void setSection(com.kyt.xsd.widgetscreen.SectionDocument.Section section)
        {
            generatedSetterHelperImpl(section, SECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "section" element
         */
        public com.kyt.xsd.widgetscreen.SectionDocument.Section addNewSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.SectionDocument.Section target = null;
                target = (com.kyt.xsd.widgetscreen.SectionDocument.Section)get_store().add_element_user(SECTION$0);
                return target;
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
         * Gets the "transaction-timeout" attribute
         */
        public java.lang.String getTransactionTimeout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSACTIONTIMEOUT$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "transaction-timeout" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTransactionTimeout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSACTIONTIMEOUT$4);
                return target;
            }
        }
        
        /**
         * True if has "transaction-timeout" attribute
         */
        public boolean isSetTransactionTimeout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TRANSACTIONTIMEOUT$4) != null;
            }
        }
        
        /**
         * Sets the "transaction-timeout" attribute
         */
        public void setTransactionTimeout(java.lang.String transactionTimeout)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRANSACTIONTIMEOUT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRANSACTIONTIMEOUT$4);
                }
                target.setStringValue(transactionTimeout);
            }
        }
        
        /**
         * Sets (as xml) the "transaction-timeout" attribute
         */
        public void xsetTransactionTimeout(org.apache.xmlbeans.XmlString transactionTimeout)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TRANSACTIONTIMEOUT$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TRANSACTIONTIMEOUT$4);
                }
                target.set(transactionTimeout);
            }
        }
        
        /**
         * Unsets the "transaction-timeout" attribute
         */
        public void unsetTransactionTimeout()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TRANSACTIONTIMEOUT$4);
            }
        }
        
        /**
         * Gets the "use-transaction" attribute
         */
        public com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseTransaction.Enum getUseTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USETRANSACTION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USETRANSACTION$6);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseTransaction.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "use-transaction" attribute
         */
        public com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseTransaction xgetUseTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseTransaction target = null;
                target = (com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseTransaction)get_store().find_attribute_user(USETRANSACTION$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseTransaction)get_default_attribute_value(USETRANSACTION$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "use-transaction" attribute
         */
        public boolean isSetUseTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USETRANSACTION$6) != null;
            }
        }
        
        /**
         * Sets the "use-transaction" attribute
         */
        public void setUseTransaction(com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseTransaction.Enum useTransaction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USETRANSACTION$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USETRANSACTION$6);
                }
                target.setEnumValue(useTransaction);
            }
        }
        
        /**
         * Sets (as xml) the "use-transaction" attribute
         */
        public void xsetUseTransaction(com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseTransaction useTransaction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseTransaction target = null;
                target = (com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseTransaction)get_store().find_attribute_user(USETRANSACTION$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseTransaction)get_store().add_attribute_user(USETRANSACTION$6);
                }
                target.set(useTransaction);
            }
        }
        
        /**
         * Unsets the "use-transaction" attribute
         */
        public void unsetUseTransaction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USETRANSACTION$6);
            }
        }
        
        /**
         * Gets the "use-cache" attribute
         */
        public com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseCache.Enum getUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(USECACHE$8);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseCache.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "use-cache" attribute
         */
        public com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseCache xgetUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseCache target = null;
                target = (com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseCache)get_store().find_attribute_user(USECACHE$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseCache)get_default_attribute_value(USECACHE$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "use-cache" attribute
         */
        public boolean isSetUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(USECACHE$8) != null;
            }
        }
        
        /**
         * Sets the "use-cache" attribute
         */
        public void setUseCache(com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseCache.Enum useCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USECACHE$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USECACHE$8);
                }
                target.setEnumValue(useCache);
            }
        }
        
        /**
         * Sets (as xml) the "use-cache" attribute
         */
        public void xsetUseCache(com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseCache useCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseCache target = null;
                target = (com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseCache)get_store().find_attribute_user(USECACHE$8);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseCache)get_store().add_attribute_user(USECACHE$8);
                }
                target.set(useCache);
            }
        }
        
        /**
         * Unsets the "use-cache" attribute
         */
        public void unsetUseCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(USECACHE$8);
            }
        }
        /**
         * An XML use-transaction(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.ScreenDocument$Screen$UseTransaction.
         */
        public static class UseTransactionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseTransaction
        {
            private static final long serialVersionUID = 1L;
            
            public UseTransactionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UseTransactionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML use-cache(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetscreen.ScreenDocument$Screen$UseCache.
         */
        public static class UseCacheImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetscreen.ScreenDocument.Screen.UseCache
        {
            private static final long serialVersionUID = 1L;
            
            public UseCacheImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UseCacheImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
