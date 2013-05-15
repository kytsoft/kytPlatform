/*
 * An XML document type.
 * Localname: entitymodel
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.EntitymodelDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel.impl;
/**
 * A document containing one entitymodel(@) element.
 *
 * This is a complex type.
 */
public class EntitymodelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.EntitymodelDocument
{
    private static final long serialVersionUID = 1L;
    
    public EntitymodelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYMODEL$0 = 
        new javax.xml.namespace.QName("", "entitymodel");
    
    
    /**
     * Gets the "entitymodel" element
     */
    public com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel getEntitymodel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel target = null;
            target = (com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel)get_store().find_element_user(ENTITYMODEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "entitymodel" element
     */
    public void setEntitymodel(com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel entitymodel)
    {
        generatedSetterHelperImpl(entitymodel, ENTITYMODEL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "entitymodel" element
     */
    public com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel addNewEntitymodel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel target = null;
            target = (com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel)get_store().add_element_user(ENTITYMODEL$0);
            return target;
        }
    }
    /**
     * An XML entitymodel(@).
     *
     * This is a complex type.
     */
    public static class EntitymodelImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.EntitymodelDocument.Entitymodel
    {
        private static final long serialVersionUID = 1L;
        
        public EntitymodelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName DESCRIPTION$2 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName COPYRIGHT$4 = 
            new javax.xml.namespace.QName("", "copyright");
        private static final javax.xml.namespace.QName AUTHOR$6 = 
            new javax.xml.namespace.QName("", "author");
        private static final javax.xml.namespace.QName VERSION$8 = 
            new javax.xml.namespace.QName("", "version");
        private static final javax.xml.namespace.QName DEFAULTRESOURCENAME$10 = 
            new javax.xml.namespace.QName("", "default-resource-name");
        private static final javax.xml.namespace.QName ENTITY$12 = 
            new javax.xml.namespace.QName("", "entity");
        private static final javax.xml.namespace.QName VIEWENTITY$14 = 
            new javax.xml.namespace.QName("", "view-entity");
        private static final javax.xml.namespace.QName EXTENDENTITY$16 = 
            new javax.xml.namespace.QName("", "extend-entity");
        
        
        /**
         * Gets the "title" element
         */
        public java.lang.String getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "title" element
         */
        public org.apache.xmlbeans.XmlString xgetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "title" element
         */
        public boolean isSetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TITLE$0) != 0;
            }
        }
        
        /**
         * Sets the "title" element
         */
        public void setTitle(java.lang.String title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
                }
                target.setStringValue(title);
            }
        }
        
        /**
         * Sets (as xml) the "title" element
         */
        public void xsetTitle(org.apache.xmlbeans.XmlString title)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
                }
                target.set(title);
            }
        }
        
        /**
         * Unsets the "title" element
         */
        public void unsetTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TITLE$0, 0);
            }
        }
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "description" element
         */
        public boolean isSetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTION$2) != 0;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
                }
                target.set(description);
            }
        }
        
        /**
         * Unsets the "description" element
         */
        public void unsetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTION$2, 0);
            }
        }
        
        /**
         * Gets array of all "copyright" elements
         */
        public java.lang.String[] getCopyrightArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COPYRIGHT$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "copyright" element
         */
        public java.lang.String getCopyrightArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COPYRIGHT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "copyright" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetCopyrightArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COPYRIGHT$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "copyright" element
         */
        public org.apache.xmlbeans.XmlString xgetCopyrightArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COPYRIGHT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "copyright" element
         */
        public int sizeOfCopyrightArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COPYRIGHT$4);
            }
        }
        
        /**
         * Sets array of all "copyright" element
         */
        public void setCopyrightArray(java.lang.String[] copyrightArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(copyrightArray, COPYRIGHT$4);
            }
        }
        
        /**
         * Sets ith "copyright" element
         */
        public void setCopyrightArray(int i, java.lang.String copyright)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COPYRIGHT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(copyright);
            }
        }
        
        /**
         * Sets (as xml) array of all "copyright" element
         */
        public void xsetCopyrightArray(org.apache.xmlbeans.XmlString[]copyrightArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(copyrightArray, COPYRIGHT$4);
            }
        }
        
        /**
         * Sets (as xml) ith "copyright" element
         */
        public void xsetCopyrightArray(int i, org.apache.xmlbeans.XmlString copyright)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COPYRIGHT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(copyright);
            }
        }
        
        /**
         * Inserts the value as the ith "copyright" element
         */
        public void insertCopyright(int i, java.lang.String copyright)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COPYRIGHT$4, i);
                target.setStringValue(copyright);
            }
        }
        
        /**
         * Appends the value as the last "copyright" element
         */
        public void addCopyright(java.lang.String copyright)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COPYRIGHT$4);
                target.setStringValue(copyright);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "copyright" element
         */
        public org.apache.xmlbeans.XmlString insertNewCopyright(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(COPYRIGHT$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "copyright" element
         */
        public org.apache.xmlbeans.XmlString addNewCopyright()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COPYRIGHT$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "copyright" element
         */
        public void removeCopyright(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COPYRIGHT$4, i);
            }
        }
        
        /**
         * Gets array of all "author" elements
         */
        public java.lang.String[] getAuthorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AUTHOR$6, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "author" element
         */
        public java.lang.String getAuthorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHOR$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "author" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetAuthorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AUTHOR$6, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "author" element
         */
        public org.apache.xmlbeans.XmlString xgetAuthorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHOR$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "author" element
         */
        public int sizeOfAuthorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AUTHOR$6);
            }
        }
        
        /**
         * Sets array of all "author" element
         */
        public void setAuthorArray(java.lang.String[] authorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(authorArray, AUTHOR$6);
            }
        }
        
        /**
         * Sets ith "author" element
         */
        public void setAuthorArray(int i, java.lang.String author)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHOR$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(author);
            }
        }
        
        /**
         * Sets (as xml) array of all "author" element
         */
        public void xsetAuthorArray(org.apache.xmlbeans.XmlString[]authorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(authorArray, AUTHOR$6);
            }
        }
        
        /**
         * Sets (as xml) ith "author" element
         */
        public void xsetAuthorArray(int i, org.apache.xmlbeans.XmlString author)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHOR$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(author);
            }
        }
        
        /**
         * Inserts the value as the ith "author" element
         */
        public void insertAuthor(int i, java.lang.String author)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(AUTHOR$6, i);
                target.setStringValue(author);
            }
        }
        
        /**
         * Appends the value as the last "author" element
         */
        public void addAuthor(java.lang.String author)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHOR$6);
                target.setStringValue(author);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "author" element
         */
        public org.apache.xmlbeans.XmlString insertNewAuthor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(AUTHOR$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "author" element
         */
        public org.apache.xmlbeans.XmlString addNewAuthor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHOR$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "author" element
         */
        public void removeAuthor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AUTHOR$6, i);
            }
        }
        
        /**
         * Gets the "version" element
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" element
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "version" element
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VERSION$8) != 0;
            }
        }
        
        /**
         * Sets the "version" element
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$8);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" element
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$8);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "version" element
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VERSION$8, 0);
            }
        }
        
        /**
         * Gets the "default-resource-name" element
         */
        public java.lang.String getDefaultResourceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTRESOURCENAME$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-resource-name" element
         */
        public org.apache.xmlbeans.XmlString xgetDefaultResourceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTRESOURCENAME$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "default-resource-name" element
         */
        public boolean isSetDefaultResourceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEFAULTRESOURCENAME$10) != 0;
            }
        }
        
        /**
         * Sets the "default-resource-name" element
         */
        public void setDefaultResourceName(java.lang.String defaultResourceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTRESOURCENAME$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTRESOURCENAME$10);
                }
                target.setStringValue(defaultResourceName);
            }
        }
        
        /**
         * Sets (as xml) the "default-resource-name" element
         */
        public void xsetDefaultResourceName(org.apache.xmlbeans.XmlString defaultResourceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTRESOURCENAME$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTRESOURCENAME$10);
                }
                target.set(defaultResourceName);
            }
        }
        
        /**
         * Unsets the "default-resource-name" element
         */
        public void unsetDefaultResourceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEFAULTRESOURCENAME$10, 0);
            }
        }
        
        /**
         * Gets array of all "entity" elements
         */
        public com.kyt.xsd.entitymodel.EntityDocument.Entity[] getEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENTITY$12, targetList);
                com.kyt.xsd.entitymodel.EntityDocument.Entity[] result = new com.kyt.xsd.entitymodel.EntityDocument.Entity[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "entity" element
         */
        public com.kyt.xsd.entitymodel.EntityDocument.Entity getEntityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.EntityDocument.Entity target = null;
                target = (com.kyt.xsd.entitymodel.EntityDocument.Entity)get_store().find_element_user(ENTITY$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "entity" element
         */
        public int sizeOfEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITY$12);
            }
        }
        
        /**
         * Sets array of all "entity" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEntityArray(com.kyt.xsd.entitymodel.EntityDocument.Entity[] entityArray)
        {
            check_orphaned();
            arraySetterHelper(entityArray, ENTITY$12);
        }
        
        /**
         * Sets ith "entity" element
         */
        public void setEntityArray(int i, com.kyt.xsd.entitymodel.EntityDocument.Entity entity)
        {
            generatedSetterHelperImpl(entity, ENTITY$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "entity" element
         */
        public com.kyt.xsd.entitymodel.EntityDocument.Entity insertNewEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.EntityDocument.Entity target = null;
                target = (com.kyt.xsd.entitymodel.EntityDocument.Entity)get_store().insert_element_user(ENTITY$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "entity" element
         */
        public com.kyt.xsd.entitymodel.EntityDocument.Entity addNewEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.EntityDocument.Entity target = null;
                target = (com.kyt.xsd.entitymodel.EntityDocument.Entity)get_store().add_element_user(ENTITY$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "entity" element
         */
        public void removeEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITY$12, i);
            }
        }
        
        /**
         * Gets array of all "view-entity" elements
         */
        public com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity[] getViewEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VIEWENTITY$14, targetList);
                com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity[] result = new com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "view-entity" element
         */
        public com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity getViewEntityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity target = null;
                target = (com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity)get_store().find_element_user(VIEWENTITY$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "view-entity" element
         */
        public int sizeOfViewEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIEWENTITY$14);
            }
        }
        
        /**
         * Sets array of all "view-entity" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setViewEntityArray(com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity[] viewEntityArray)
        {
            check_orphaned();
            arraySetterHelper(viewEntityArray, VIEWENTITY$14);
        }
        
        /**
         * Sets ith "view-entity" element
         */
        public void setViewEntityArray(int i, com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity viewEntity)
        {
            generatedSetterHelperImpl(viewEntity, VIEWENTITY$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "view-entity" element
         */
        public com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity insertNewViewEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity target = null;
                target = (com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity)get_store().insert_element_user(VIEWENTITY$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "view-entity" element
         */
        public com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity addNewViewEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity target = null;
                target = (com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity)get_store().add_element_user(VIEWENTITY$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "view-entity" element
         */
        public void removeViewEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIEWENTITY$14, i);
            }
        }
        
        /**
         * Gets array of all "extend-entity" elements
         */
        public com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity[] getExtendEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXTENDENTITY$16, targetList);
                com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity[] result = new com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "extend-entity" element
         */
        public com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity getExtendEntityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity target = null;
                target = (com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity)get_store().find_element_user(EXTENDENTITY$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "extend-entity" element
         */
        public int sizeOfExtendEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENDENTITY$16);
            }
        }
        
        /**
         * Sets array of all "extend-entity" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setExtendEntityArray(com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity[] extendEntityArray)
        {
            check_orphaned();
            arraySetterHelper(extendEntityArray, EXTENDENTITY$16);
        }
        
        /**
         * Sets ith "extend-entity" element
         */
        public void setExtendEntityArray(int i, com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity extendEntity)
        {
            generatedSetterHelperImpl(extendEntity, EXTENDENTITY$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extend-entity" element
         */
        public com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity insertNewExtendEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity target = null;
                target = (com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity)get_store().insert_element_user(EXTENDENTITY$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extend-entity" element
         */
        public com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity addNewExtendEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity target = null;
                target = (com.kyt.xsd.entitymodel.ExtendEntityDocument.ExtendEntity)get_store().add_element_user(EXTENDENTITY$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "extend-entity" element
         */
        public void removeExtendEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENDENTITY$16, i);
            }
        }
    }
}
