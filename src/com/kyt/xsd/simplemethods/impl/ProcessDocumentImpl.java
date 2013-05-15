/*
 * An XML document type.
 * Localname: process
 * Namespace: 
 * Java type: com.kyt.xsd.simplemethods.ProcessDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.simplemethods.impl;
/**
 * A document containing one process(@) element.
 *
 * This is a complex type.
 */
public class ProcessDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.ProcessDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProcessDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROCESS$0 = 
        new javax.xml.namespace.QName("", "process");
    
    
    /**
     * Gets the "process" element
     */
    public com.kyt.xsd.simplemethods.ProcessDocument.Process getProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ProcessDocument.Process target = null;
            target = (com.kyt.xsd.simplemethods.ProcessDocument.Process)get_store().find_element_user(PROCESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "process" element
     */
    public void setProcess(com.kyt.xsd.simplemethods.ProcessDocument.Process process)
    {
        generatedSetterHelperImpl(process, PROCESS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "process" element
     */
    public com.kyt.xsd.simplemethods.ProcessDocument.Process addNewProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.simplemethods.ProcessDocument.Process target = null;
            target = (com.kyt.xsd.simplemethods.ProcessDocument.Process)get_store().add_element_user(PROCESS$0);
            return target;
        }
    }
    /**
     * An XML process(@).
     *
     * This is a complex type.
     */
    public static class ProcessImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.simplemethods.ProcessDocument.Process
    {
        private static final long serialVersionUID = 1L;
        
        public ProcessImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALIDATEMETHOD$0 = 
            new javax.xml.namespace.QName("", "validate-method");
        private static final javax.xml.namespace.QName COMPARE$2 = 
            new javax.xml.namespace.QName("", "compare");
        private static final javax.xml.namespace.QName COMPAREFIELD$4 = 
            new javax.xml.namespace.QName("", "compare-field");
        private static final javax.xml.namespace.QName REGEXP$6 = 
            new javax.xml.namespace.QName("", "regexp");
        private static final javax.xml.namespace.QName NOTEMPTY$8 = 
            new javax.xml.namespace.QName("", "not-empty");
        private static final javax.xml.namespace.QName COPY$10 = 
            new javax.xml.namespace.QName("", "copy");
        private static final javax.xml.namespace.QName CONVERT$12 = 
            new javax.xml.namespace.QName("", "convert");
        private static final javax.xml.namespace.QName FIELD$14 = 
            new javax.xml.namespace.QName("", "field");
        
        
        /**
         * Gets array of all "validate-method" elements
         */
        public com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod[] getValidateMethodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VALIDATEMETHOD$0, targetList);
                com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod[] result = new com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "validate-method" element
         */
        public com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod getValidateMethodArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod target = null;
                target = (com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod)get_store().find_element_user(VALIDATEMETHOD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "validate-method" element
         */
        public int sizeOfValidateMethodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VALIDATEMETHOD$0);
            }
        }
        
        /**
         * Sets array of all "validate-method" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setValidateMethodArray(com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod[] validateMethodArray)
        {
            check_orphaned();
            arraySetterHelper(validateMethodArray, VALIDATEMETHOD$0);
        }
        
        /**
         * Sets ith "validate-method" element
         */
        public void setValidateMethodArray(int i, com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod validateMethod)
        {
            generatedSetterHelperImpl(validateMethod, VALIDATEMETHOD$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "validate-method" element
         */
        public com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod insertNewValidateMethod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod target = null;
                target = (com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod)get_store().insert_element_user(VALIDATEMETHOD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "validate-method" element
         */
        public com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod addNewValidateMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod target = null;
                target = (com.kyt.xsd.simplemethods.ValidateMethodDocument.ValidateMethod)get_store().add_element_user(VALIDATEMETHOD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "validate-method" element
         */
        public void removeValidateMethod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VALIDATEMETHOD$0, i);
            }
        }
        
        /**
         * Gets array of all "compare" elements
         */
        public com.kyt.xsd.simplemethods.CompareDocument.Compare[] getCompareArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPARE$2, targetList);
                com.kyt.xsd.simplemethods.CompareDocument.Compare[] result = new com.kyt.xsd.simplemethods.CompareDocument.Compare[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "compare" element
         */
        public com.kyt.xsd.simplemethods.CompareDocument.Compare getCompareArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CompareDocument.Compare target = null;
                target = (com.kyt.xsd.simplemethods.CompareDocument.Compare)get_store().find_element_user(COMPARE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "compare" element
         */
        public int sizeOfCompareArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPARE$2);
            }
        }
        
        /**
         * Sets array of all "compare" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCompareArray(com.kyt.xsd.simplemethods.CompareDocument.Compare[] compareArray)
        {
            check_orphaned();
            arraySetterHelper(compareArray, COMPARE$2);
        }
        
        /**
         * Sets ith "compare" element
         */
        public void setCompareArray(int i, com.kyt.xsd.simplemethods.CompareDocument.Compare compare)
        {
            generatedSetterHelperImpl(compare, COMPARE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "compare" element
         */
        public com.kyt.xsd.simplemethods.CompareDocument.Compare insertNewCompare(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CompareDocument.Compare target = null;
                target = (com.kyt.xsd.simplemethods.CompareDocument.Compare)get_store().insert_element_user(COMPARE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "compare" element
         */
        public com.kyt.xsd.simplemethods.CompareDocument.Compare addNewCompare()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CompareDocument.Compare target = null;
                target = (com.kyt.xsd.simplemethods.CompareDocument.Compare)get_store().add_element_user(COMPARE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "compare" element
         */
        public void removeCompare(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPARE$2, i);
            }
        }
        
        /**
         * Gets array of all "compare-field" elements
         */
        public com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField[] getCompareFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPAREFIELD$4, targetList);
                com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField[] result = new com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "compare-field" element
         */
        public com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField getCompareFieldArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField target = null;
                target = (com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField)get_store().find_element_user(COMPAREFIELD$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "compare-field" element
         */
        public int sizeOfCompareFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPAREFIELD$4);
            }
        }
        
        /**
         * Sets array of all "compare-field" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCompareFieldArray(com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField[] compareFieldArray)
        {
            check_orphaned();
            arraySetterHelper(compareFieldArray, COMPAREFIELD$4);
        }
        
        /**
         * Sets ith "compare-field" element
         */
        public void setCompareFieldArray(int i, com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField compareField)
        {
            generatedSetterHelperImpl(compareField, COMPAREFIELD$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "compare-field" element
         */
        public com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField insertNewCompareField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField target = null;
                target = (com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField)get_store().insert_element_user(COMPAREFIELD$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "compare-field" element
         */
        public com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField addNewCompareField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField target = null;
                target = (com.kyt.xsd.simplemethods.CompareFieldDocument.CompareField)get_store().add_element_user(COMPAREFIELD$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "compare-field" element
         */
        public void removeCompareField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPAREFIELD$4, i);
            }
        }
        
        /**
         * Gets array of all "regexp" elements
         */
        public com.kyt.xsd.simplemethods.RegexpDocument.Regexp[] getRegexpArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REGEXP$6, targetList);
                com.kyt.xsd.simplemethods.RegexpDocument.Regexp[] result = new com.kyt.xsd.simplemethods.RegexpDocument.Regexp[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "regexp" element
         */
        public com.kyt.xsd.simplemethods.RegexpDocument.Regexp getRegexpArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.RegexpDocument.Regexp target = null;
                target = (com.kyt.xsd.simplemethods.RegexpDocument.Regexp)get_store().find_element_user(REGEXP$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "regexp" element
         */
        public int sizeOfRegexpArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REGEXP$6);
            }
        }
        
        /**
         * Sets array of all "regexp" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRegexpArray(com.kyt.xsd.simplemethods.RegexpDocument.Regexp[] regexpArray)
        {
            check_orphaned();
            arraySetterHelper(regexpArray, REGEXP$6);
        }
        
        /**
         * Sets ith "regexp" element
         */
        public void setRegexpArray(int i, com.kyt.xsd.simplemethods.RegexpDocument.Regexp regexp)
        {
            generatedSetterHelperImpl(regexp, REGEXP$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "regexp" element
         */
        public com.kyt.xsd.simplemethods.RegexpDocument.Regexp insertNewRegexp(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.RegexpDocument.Regexp target = null;
                target = (com.kyt.xsd.simplemethods.RegexpDocument.Regexp)get_store().insert_element_user(REGEXP$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "regexp" element
         */
        public com.kyt.xsd.simplemethods.RegexpDocument.Regexp addNewRegexp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.RegexpDocument.Regexp target = null;
                target = (com.kyt.xsd.simplemethods.RegexpDocument.Regexp)get_store().add_element_user(REGEXP$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "regexp" element
         */
        public void removeRegexp(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REGEXP$6, i);
            }
        }
        
        /**
         * Gets array of all "not-empty" elements
         */
        public com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty[] getNotEmptyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NOTEMPTY$8, targetList);
                com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty[] result = new com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "not-empty" element
         */
        public com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty getNotEmptyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty target = null;
                target = (com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty)get_store().find_element_user(NOTEMPTY$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "not-empty" element
         */
        public int sizeOfNotEmptyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOTEMPTY$8);
            }
        }
        
        /**
         * Sets array of all "not-empty" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNotEmptyArray(com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty[] notEmptyArray)
        {
            check_orphaned();
            arraySetterHelper(notEmptyArray, NOTEMPTY$8);
        }
        
        /**
         * Sets ith "not-empty" element
         */
        public void setNotEmptyArray(int i, com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty notEmpty)
        {
            generatedSetterHelperImpl(notEmpty, NOTEMPTY$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "not-empty" element
         */
        public com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty insertNewNotEmpty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty target = null;
                target = (com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty)get_store().insert_element_user(NOTEMPTY$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "not-empty" element
         */
        public com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty addNewNotEmpty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty target = null;
                target = (com.kyt.xsd.simplemethods.NotEmptyDocument.NotEmpty)get_store().add_element_user(NOTEMPTY$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "not-empty" element
         */
        public void removeNotEmpty(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOTEMPTY$8, i);
            }
        }
        
        /**
         * Gets array of all "copy" elements
         */
        public com.kyt.xsd.simplemethods.CopyDocument.Copy[] getCopyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COPY$10, targetList);
                com.kyt.xsd.simplemethods.CopyDocument.Copy[] result = new com.kyt.xsd.simplemethods.CopyDocument.Copy[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "copy" element
         */
        public com.kyt.xsd.simplemethods.CopyDocument.Copy getCopyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CopyDocument.Copy target = null;
                target = (com.kyt.xsd.simplemethods.CopyDocument.Copy)get_store().find_element_user(COPY$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "copy" element
         */
        public int sizeOfCopyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COPY$10);
            }
        }
        
        /**
         * Sets array of all "copy" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setCopyArray(com.kyt.xsd.simplemethods.CopyDocument.Copy[] copyArray)
        {
            check_orphaned();
            arraySetterHelper(copyArray, COPY$10);
        }
        
        /**
         * Sets ith "copy" element
         */
        public void setCopyArray(int i, com.kyt.xsd.simplemethods.CopyDocument.Copy copy)
        {
            generatedSetterHelperImpl(copy, COPY$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "copy" element
         */
        public com.kyt.xsd.simplemethods.CopyDocument.Copy insertNewCopy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CopyDocument.Copy target = null;
                target = (com.kyt.xsd.simplemethods.CopyDocument.Copy)get_store().insert_element_user(COPY$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "copy" element
         */
        public com.kyt.xsd.simplemethods.CopyDocument.Copy addNewCopy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.CopyDocument.Copy target = null;
                target = (com.kyt.xsd.simplemethods.CopyDocument.Copy)get_store().add_element_user(COPY$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "copy" element
         */
        public void removeCopy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COPY$10, i);
            }
        }
        
        /**
         * Gets array of all "convert" elements
         */
        public com.kyt.xsd.simplemethods.ConvertDocument.Convert[] getConvertArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONVERT$12, targetList);
                com.kyt.xsd.simplemethods.ConvertDocument.Convert[] result = new com.kyt.xsd.simplemethods.ConvertDocument.Convert[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "convert" element
         */
        public com.kyt.xsd.simplemethods.ConvertDocument.Convert getConvertArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ConvertDocument.Convert target = null;
                target = (com.kyt.xsd.simplemethods.ConvertDocument.Convert)get_store().find_element_user(CONVERT$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "convert" element
         */
        public int sizeOfConvertArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONVERT$12);
            }
        }
        
        /**
         * Sets array of all "convert" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setConvertArray(com.kyt.xsd.simplemethods.ConvertDocument.Convert[] convertArray)
        {
            check_orphaned();
            arraySetterHelper(convertArray, CONVERT$12);
        }
        
        /**
         * Sets ith "convert" element
         */
        public void setConvertArray(int i, com.kyt.xsd.simplemethods.ConvertDocument.Convert convert)
        {
            generatedSetterHelperImpl(convert, CONVERT$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "convert" element
         */
        public com.kyt.xsd.simplemethods.ConvertDocument.Convert insertNewConvert(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ConvertDocument.Convert target = null;
                target = (com.kyt.xsd.simplemethods.ConvertDocument.Convert)get_store().insert_element_user(CONVERT$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "convert" element
         */
        public com.kyt.xsd.simplemethods.ConvertDocument.Convert addNewConvert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.simplemethods.ConvertDocument.Convert target = null;
                target = (com.kyt.xsd.simplemethods.ConvertDocument.Convert)get_store().add_element_user(CONVERT$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "convert" element
         */
        public void removeConvert(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONVERT$12, i);
            }
        }
        
        /**
         * Gets the "field" attribute
         */
        public java.lang.String getField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "field" attribute
         */
        public org.apache.xmlbeans.XmlString xgetField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$14);
                return target;
            }
        }
        
        /**
         * Sets the "field" attribute
         */
        public void setField(java.lang.String field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELD$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELD$14);
                }
                target.setStringValue(field);
            }
        }
        
        /**
         * Sets (as xml) the "field" attribute
         */
        public void xsetField(org.apache.xmlbeans.XmlString field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FIELD$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FIELD$14);
                }
                target.set(field);
            }
        }
    }
}
