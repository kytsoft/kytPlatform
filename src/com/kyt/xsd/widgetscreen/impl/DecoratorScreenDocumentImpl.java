/*
 * An XML document type.
 * Localname: decorator-screen
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.DecoratorScreenDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one decorator-screen(@) element.
 *
 * This is a complex type.
 */
public class DecoratorScreenDocumentImpl extends com.kyt.xsd.widgetscreen.impl.AllWidgetsDocumentImpl implements com.kyt.xsd.widgetscreen.DecoratorScreenDocument
{
    private static final long serialVersionUID = 1L;
    
    public DecoratorScreenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECORATORSCREEN$0 = 
        new javax.xml.namespace.QName("", "decorator-screen");
    
    
    /**
     * Gets the "decorator-screen" element
     */
    public com.kyt.xsd.widgetscreen.DecoratorScreenDocument.DecoratorScreen getDecoratorScreen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.DecoratorScreenDocument.DecoratorScreen target = null;
            target = (com.kyt.xsd.widgetscreen.DecoratorScreenDocument.DecoratorScreen)get_store().find_element_user(DECORATORSCREEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "decorator-screen" element
     */
    public void setDecoratorScreen(com.kyt.xsd.widgetscreen.DecoratorScreenDocument.DecoratorScreen decoratorScreen)
    {
        generatedSetterHelperImpl(decoratorScreen, DECORATORSCREEN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "decorator-screen" element
     */
    public com.kyt.xsd.widgetscreen.DecoratorScreenDocument.DecoratorScreen addNewDecoratorScreen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.DecoratorScreenDocument.DecoratorScreen target = null;
            target = (com.kyt.xsd.widgetscreen.DecoratorScreenDocument.DecoratorScreen)get_store().add_element_user(DECORATORSCREEN$0);
            return target;
        }
    }
    /**
     * An XML decorator-screen(@).
     *
     * This is a complex type.
     */
    public static class DecoratorScreenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.DecoratorScreenDocument.DecoratorScreen
    {
        private static final long serialVersionUID = 1L;
        
        public DecoratorScreenImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DECORATORSECTION$0 = 
            new javax.xml.namespace.QName("", "decorator-section");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("", "name");
        private static final javax.xml.namespace.QName LOCATION$4 = 
            new javax.xml.namespace.QName("", "location");
        
        
        /**
         * Gets array of all "decorator-section" elements
         */
        public com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection[] getDecoratorSectionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DECORATORSECTION$0, targetList);
                com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection[] result = new com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "decorator-section" element
         */
        public com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection getDecoratorSectionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection target = null;
                target = (com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection)get_store().find_element_user(DECORATORSECTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "decorator-section" element
         */
        public int sizeOfDecoratorSectionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DECORATORSECTION$0);
            }
        }
        
        /**
         * Sets array of all "decorator-section" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setDecoratorSectionArray(com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection[] decoratorSectionArray)
        {
            check_orphaned();
            arraySetterHelper(decoratorSectionArray, DECORATORSECTION$0);
        }
        
        /**
         * Sets ith "decorator-section" element
         */
        public void setDecoratorSectionArray(int i, com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection decoratorSection)
        {
            generatedSetterHelperImpl(decoratorSection, DECORATORSECTION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "decorator-section" element
         */
        public com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection insertNewDecoratorSection(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection target = null;
                target = (com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection)get_store().insert_element_user(DECORATORSECTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "decorator-section" element
         */
        public com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection addNewDecoratorSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection target = null;
                target = (com.kyt.xsd.widgetscreen.DecoratorSectionDocument.DecoratorSection)get_store().add_element_user(DECORATORSECTION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "decorator-section" element
         */
        public void removeDecoratorSection(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DECORATORSECTION$0, i);
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
         * Gets the "location" attribute
         */
        public java.lang.String getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "location" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$4);
                return target;
            }
        }
        
        /**
         * True if has "location" attribute
         */
        public boolean isSetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCATION$4) != null;
            }
        }
        
        /**
         * Sets the "location" attribute
         */
        public void setLocation(java.lang.String location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$4);
                }
                target.setStringValue(location);
            }
        }
        
        /**
         * Sets (as xml) the "location" attribute
         */
        public void xsetLocation(org.apache.xmlbeans.XmlString location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCATION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCATION$4);
                }
                target.set(location);
            }
        }
        
        /**
         * Unsets the "location" attribute
         */
        public void unsetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCATION$4);
            }
        }
    }
}
