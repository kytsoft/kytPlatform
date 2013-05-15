/*
 * An XML document type.
 * Localname: screens
 * Namespace: 
 * Java type: com.kyt.xsd.widgetscreen.ScreensDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetscreen.impl;
/**
 * A document containing one screens(@) element.
 *
 * This is a complex type.
 */
public class ScreensDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.ScreensDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScreensDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCREENS$0 = 
        new javax.xml.namespace.QName("", "screens");
    
    
    /**
     * Gets the "screens" element
     */
    public com.kyt.xsd.widgetscreen.ScreensDocument.Screens getScreens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.ScreensDocument.Screens target = null;
            target = (com.kyt.xsd.widgetscreen.ScreensDocument.Screens)get_store().find_element_user(SCREENS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "screens" element
     */
    public void setScreens(com.kyt.xsd.widgetscreen.ScreensDocument.Screens screens)
    {
        generatedSetterHelperImpl(screens, SCREENS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "screens" element
     */
    public com.kyt.xsd.widgetscreen.ScreensDocument.Screens addNewScreens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetscreen.ScreensDocument.Screens target = null;
            target = (com.kyt.xsd.widgetscreen.ScreensDocument.Screens)get_store().add_element_user(SCREENS$0);
            return target;
        }
    }
    /**
     * An XML screens(@).
     *
     * This is a complex type.
     */
    public static class ScreensImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetscreen.ScreensDocument.Screens
    {
        private static final long serialVersionUID = 1L;
        
        public ScreensImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SCREEN$0 = 
            new javax.xml.namespace.QName("", "screen");
        
        
        /**
         * Gets array of all "screen" elements
         */
        public com.kyt.xsd.widgetscreen.ScreenDocument.Screen[] getScreenArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SCREEN$0, targetList);
                com.kyt.xsd.widgetscreen.ScreenDocument.Screen[] result = new com.kyt.xsd.widgetscreen.ScreenDocument.Screen[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "screen" element
         */
        public com.kyt.xsd.widgetscreen.ScreenDocument.Screen getScreenArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ScreenDocument.Screen target = null;
                target = (com.kyt.xsd.widgetscreen.ScreenDocument.Screen)get_store().find_element_user(SCREEN$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "screen" element
         */
        public int sizeOfScreenArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCREEN$0);
            }
        }
        
        /**
         * Sets array of all "screen" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setScreenArray(com.kyt.xsd.widgetscreen.ScreenDocument.Screen[] screenArray)
        {
            check_orphaned();
            arraySetterHelper(screenArray, SCREEN$0);
        }
        
        /**
         * Sets ith "screen" element
         */
        public void setScreenArray(int i, com.kyt.xsd.widgetscreen.ScreenDocument.Screen screen)
        {
            generatedSetterHelperImpl(screen, SCREEN$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "screen" element
         */
        public com.kyt.xsd.widgetscreen.ScreenDocument.Screen insertNewScreen(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetscreen.ScreenDocument.Screen target = null;
                target = (com.kyt.xsd.widgetscreen.ScreenDocument.Screen)get_store().insert_element_user(SCREEN$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "screen" element
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
         * Removes the ith "screen" element
         */
        public void removeScreen(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCREEN$0, i);
            }
        }
    }
}
