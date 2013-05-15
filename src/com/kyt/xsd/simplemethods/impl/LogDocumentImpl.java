/*
 * An XML document type.
 * Localname: log
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.LogDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one log(@) element.
 *
 * This is a complex type.
 */
public class LogDocumentImpl extends com.kyt.xsd.simplemethods.impl.OtherOperationsDocumentImpl implements com.kyt.xsd.simplemethods.LogDocument
{
    private static final long serialVersionUID = 1L;
    
    public LogDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOG$0 = 
        new javax.xml.namespace.QName("", "log");
    
    
    /**
     * Gets the "log" element
     */
    public com.kyt.xsd.simplemethods.LogDocument.Log getLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.LogDocument.Log target = null;
            target = (com.kyt.xsd.simplemethods.LogDocument.Log)get_store().find_element_user(LOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "log" element
     */
    public void setLog(com.kyt.xsd.simplemethods.LogDocument.Log log)
    {
        generatedSetterHelperImpl(log, LOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "log" element
     */
    public com.kyt.xsd.simplemethods.LogDocument.Log addNewLog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.LogDocument.Log target = null;
            target = (com.kyt.xsd.simplemethods.LogDocument.Log)get_store().add_element_user(LOG$0);
            return target;
        }
    }
    /**
     * An XML log(@).
     *
     * This is a complex type.
     */
    public static class LogImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.LogDocument.Log
    {
        private static final long serialVersionUID = 1L;
        
        public LogImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELD$0 = 
            new javax.xml.namespace.QName("", "field");
        private static final javax.xml.namespace.QName STRING$2 = 
            new javax.xml.namespace.QName("", "string");
        private static final javax.xml.namespace.QName LEVEL$4 = 
            new javax.xml.namespace.QName("", "level");
        private static final javax.xml.namespace.QName MESSAGE$6 = 
            new javax.xml.namespace.QName("", "message");
        
        
        /**
         * Gets array of all "field" elements
         */
        public com.kyt.xsd.simplemethods.FieldDocument.Field[] getFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELD$0, targetList);
                com.kyt.xsd.simplemethods.FieldDocument.Field[] result = new com.kyt.xsd.simplemethods.FieldDocument.Field[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "field" element
         */
        public com.kyt.xsd.simplemethods.FieldDocument.Field getFieldArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FieldDocument.Field target = null;
                target = (com.kyt.xsd.simplemethods.FieldDocument.Field)get_store().find_element_user(FIELD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "field" element
         */
        public int sizeOfFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELD$0);
            }
        }
        
        /**
         * Sets array of all "field" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFieldArray(com.kyt.xsd.simplemethods.FieldDocument.Field[] fieldArray)
        {
            check_orphaned();
            arraySetterHelper(fieldArray, FIELD$0);
        }
        
        /**
         * Sets ith "field" element
         */
        public void setFieldArray(int i, com.kyt.xsd.simplemethods.FieldDocument.Field field)
        {
            generatedSetterHelperImpl(field, FIELD$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field" element
         */
        public com.kyt.xsd.simplemethods.FieldDocument.Field insertNewField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FieldDocument.Field target = null;
                target = (com.kyt.xsd.simplemethods.FieldDocument.Field)get_store().insert_element_user(FIELD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field" element
         */
        public com.kyt.xsd.simplemethods.FieldDocument.Field addNewField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.FieldDocument.Field target = null;
                target = (com.kyt.xsd.simplemethods.FieldDocument.Field)get_store().add_element_user(FIELD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "field" element
         */
        public void removeField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELD$0, i);
            }
        }
        
        /**
         * Gets array of all "string" elements
         */
        public com.kyt.xsd.simplemethods.StringDocument.String[] getStringArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STRING$2, targetList);
                com.kyt.xsd.simplemethods.StringDocument.String[] result = new com.kyt.xsd.simplemethods.StringDocument.String[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "string" element
         */
        public com.kyt.xsd.simplemethods.StringDocument.String getStringArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.StringDocument.String target = null;
                target = (com.kyt.xsd.simplemethods.StringDocument.String)get_store().find_element_user(STRING$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "string" element
         */
        public int sizeOfStringArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STRING$2);
            }
        }
        
        /**
         * Sets array of all "string" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setStringArray(com.kyt.xsd.simplemethods.StringDocument.String[] stringArray)
        {
            check_orphaned();
            arraySetterHelper(stringArray, STRING$2);
        }
        
        /**
         * Sets ith "string" element
         */
        public void setStringArray(int i, com.kyt.xsd.simplemethods.StringDocument.String string)
        {
            generatedSetterHelperImpl(string, STRING$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "string" element
         */
        public com.kyt.xsd.simplemethods.StringDocument.String insertNewString(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.StringDocument.String target = null;
                target = (com.kyt.xsd.simplemethods.StringDocument.String)get_store().insert_element_user(STRING$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "string" element
         */
        public com.kyt.xsd.simplemethods.StringDocument.String addNewString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.StringDocument.String target = null;
                target = (com.kyt.xsd.simplemethods.StringDocument.String)get_store().add_element_user(STRING$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "string" element
         */
        public void removeString(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STRING$2, i);
            }
        }
        
        /**
         * Gets the "level" attribute
         */
        public com.kyt.xsd.simplemethods.LogDocument.Log.Level.Enum getLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$4);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.simplemethods.LogDocument.Log.Level.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "level" attribute
         */
        public com.kyt.xsd.simplemethods.LogDocument.Log.Level xgetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.LogDocument.Log.Level target = null;
                target = (com.kyt.xsd.simplemethods.LogDocument.Log.Level)get_store().find_attribute_user(LEVEL$4);
                return target;
            }
        }
        
        /**
         * Sets the "level" attribute
         */
        public void setLevel(com.kyt.xsd.simplemethods.LogDocument.Log.Level.Enum level)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$4);
                }
                target.setEnumValue(level);
            }
        }
        
        /**
         * Sets (as xml) the "level" attribute
         */
        public void xsetLevel(com.kyt.xsd.simplemethods.LogDocument.Log.Level level)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.LogDocument.Log.Level target = null;
                target = (com.kyt.xsd.simplemethods.LogDocument.Log.Level)get_store().find_attribute_user(LEVEL$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.simplemethods.LogDocument.Log.Level)get_store().add_attribute_user(LEVEL$4);
                }
                target.set(level);
            }
        }
        
        /**
         * Gets the "message" attribute
         */
        public java.lang.String getMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "message" attribute
         */
        public org.apache.xmlbeans.XmlString xgetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGE$6);
                return target;
            }
        }
        
        /**
         * True if has "message" attribute
         */
        public boolean isSetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(MESSAGE$6) != null;
            }
        }
        
        /**
         * Sets the "message" attribute
         */
        public void setMessage(java.lang.String message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGE$6);
                }
                target.setStringValue(message);
            }
        }
        
        /**
         * Sets (as xml) the "message" attribute
         */
        public void xsetMessage(org.apache.xmlbeans.XmlString message)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MESSAGE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MESSAGE$6);
                }
                target.set(message);
            }
        }
        
        /**
         * Unsets the "message" attribute
         */
        public void unsetMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(MESSAGE$6);
            }
        }
        /**
         * An XML level(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.simplemethods.LogDocument$Log$Level.
         */
        public static class LevelImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.simplemethods.LogDocument.Log.Level
        {
            private static final long serialVersionUID = 1L;
            
            public LevelImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected LevelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
