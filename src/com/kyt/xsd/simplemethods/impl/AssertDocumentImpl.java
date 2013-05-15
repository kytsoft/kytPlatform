/*
 * An XML document type.
 * Localname: assert
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.AssertDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one assert(@) element.
 *
 * This is a complex type.
 */
public class AssertDocumentImpl extends com.kyt.xsd.simplemethods.impl.IfOtherOperationsDocumentImpl implements com.kyt.xsd.simplemethods.AssertDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssertDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSERT$0 = 
        new javax.xml.namespace.QName("", "assert");
    
    
    /**
     * Gets the "assert" element
     */
    public com.kyt.xsd.simplemethods.AssertDocument.Assert getAssert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.AssertDocument.Assert target = null;
            target = (com.kyt.xsd.simplemethods.AssertDocument.Assert)get_store().find_element_user(ASSERT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "assert" element
     */
    public void setAssert(com.kyt.xsd.simplemethods.AssertDocument.Assert xassert)
    {
        generatedSetterHelperImpl(xassert, ASSERT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "assert" element
     */
    public com.kyt.xsd.simplemethods.AssertDocument.Assert addNewAssert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.AssertDocument.Assert target = null;
            target = (com.kyt.xsd.simplemethods.AssertDocument.Assert)get_store().add_element_user(ASSERT$0);
            return target;
        }
    }
    /**
     * An XML assert(@).
     *
     * This is a complex type.
     */
    public static class AssertImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.AssertDocument.Assert
    {
        private static final long serialVersionUID = 1L;
        
        public AssertImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IFCOMBINECONDITIONS$0 = 
            new javax.xml.namespace.QName("", "IfCombineConditions");
        private static final org.apache.xmlbeans.QNameSet IFCOMBINECONDITIONS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("", "not"),
            new javax.xml.namespace.QName("", "xor"),
            new javax.xml.namespace.QName("", "or"),
            new javax.xml.namespace.QName("", "IfCombineConditions"),
            new javax.xml.namespace.QName("", "and"),
        });
        private static final javax.xml.namespace.QName IFBASICOPERATIONS$2 = 
            new javax.xml.namespace.QName("", "IfBasicOperations");
        private static final org.apache.xmlbeans.QNameSet IFBASICOPERATIONS$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("", "if-instance-of"),
            new javax.xml.namespace.QName("", "if-validate-method"),
            new javax.xml.namespace.QName("", "if-compare"),
            new javax.xml.namespace.QName("", "IfBasicOperations"),
            new javax.xml.namespace.QName("", "if-empty"),
            new javax.xml.namespace.QName("", "if-regexp"),
            new javax.xml.namespace.QName("", "if-has-permission"),
            new javax.xml.namespace.QName("", "if-compare-field"),
        });
        private static final javax.xml.namespace.QName TITLE$4 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName ERRORLISTNAME$6 = 
            new javax.xml.namespace.QName("", "error-list-name");
        
        
        /**
         * Gets array of all "IfCombineConditions" elements
         */
        public org.apache.xmlbeans.XmlObject[] getIfCombineConditionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IFCOMBINECONDITIONS$1, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "IfCombineConditions" element
         */
        public org.apache.xmlbeans.XmlObject getIfCombineConditionsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFCOMBINECONDITIONS$1, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "IfCombineConditions" element
         */
        public int sizeOfIfCombineConditionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IFCOMBINECONDITIONS$1);
            }
        }
        
        /**
         * Sets array of all "IfCombineConditions" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIfCombineConditionsArray(org.apache.xmlbeans.XmlObject[] ifCombineConditionsArray)
        {
            check_orphaned();
            arraySetterHelper(ifCombineConditionsArray, IFCOMBINECONDITIONS$0, IFCOMBINECONDITIONS$1);
        }
        
        /**
         * Sets ith "IfCombineConditions" element
         */
        public void setIfCombineConditionsArray(int i, org.apache.xmlbeans.XmlObject ifCombineConditions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFCOMBINECONDITIONS$1, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ifCombineConditions);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IfCombineConditions" element
         */
        public org.apache.xmlbeans.XmlObject insertNewIfCombineConditions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(IFCOMBINECONDITIONS$1, IFCOMBINECONDITIONS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IfCombineConditions" element
         */
        public org.apache.xmlbeans.XmlObject addNewIfCombineConditions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IFCOMBINECONDITIONS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "IfCombineConditions" element
         */
        public void removeIfCombineConditions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IFCOMBINECONDITIONS$1, i);
            }
        }
        
        /**
         * Gets array of all "IfBasicOperations" elements
         */
        public org.apache.xmlbeans.XmlObject[] getIfBasicOperationsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(IFBASICOPERATIONS$3, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "IfBasicOperations" element
         */
        public org.apache.xmlbeans.XmlObject getIfBasicOperationsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFBASICOPERATIONS$3, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "IfBasicOperations" element
         */
        public int sizeOfIfBasicOperationsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IFBASICOPERATIONS$3);
            }
        }
        
        /**
         * Sets array of all "IfBasicOperations" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIfBasicOperationsArray(org.apache.xmlbeans.XmlObject[] ifBasicOperationsArray)
        {
            check_orphaned();
            arraySetterHelper(ifBasicOperationsArray, IFBASICOPERATIONS$2, IFBASICOPERATIONS$3);
        }
        
        /**
         * Sets ith "IfBasicOperations" element
         */
        public void setIfBasicOperationsArray(int i, org.apache.xmlbeans.XmlObject ifBasicOperations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IFBASICOPERATIONS$3, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ifBasicOperations);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IfBasicOperations" element
         */
        public org.apache.xmlbeans.XmlObject insertNewIfBasicOperations(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(IFBASICOPERATIONS$3, IFBASICOPERATIONS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IfBasicOperations" element
         */
        public org.apache.xmlbeans.XmlObject addNewIfBasicOperations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IFBASICOPERATIONS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "IfBasicOperations" element
         */
        public void removeIfBasicOperations(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IFBASICOPERATIONS$3, i);
            }
        }
        
        /**
         * Gets the "title" attribute
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$4);
                return target;
            }
        }
        
        /**
         * True if has "title" attribute
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TITLE$4) != null;
            }
        }
        
        /**
         * Sets the "title" attribute
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$4);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" attribute
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$4);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "title" attribute
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TITLE$4);
            }
        }
        
        /**
         * Gets the "error-list-name" attribute
         */
        public java.lang.String getErrorListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORLISTNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ERRORLISTNAME$6);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "error-list-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetErrorListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORLISTNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(ERRORLISTNAME$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "error-list-name" attribute
         */
        public boolean isSetErrorListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ERRORLISTNAME$6) != null;
            }
        }
        
        /**
         * Sets the "error-list-name" attribute
         */
        public void setErrorListName(java.lang.String errorListName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ERRORLISTNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ERRORLISTNAME$6);
                }
                target.setStringValue(errorListName);
            }
        }
        
        /**
         * Sets (as xml) the "error-list-name" attribute
         */
        public void xsetErrorListName(org.apache.xmlbeans.XmlString errorListName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ERRORLISTNAME$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ERRORLISTNAME$6);
                }
                target.set(errorListName);
            }
        }
        
        /**
         * Unsets the "error-list-name" attribute
         */
        public void unsetErrorListName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ERRORLISTNAME$6);
            }
        }
    }
}
