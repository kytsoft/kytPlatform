/*
 * An XML document type.
 * Localname: relation
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.RelationDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel.impl;
/**
 * A document containing one relation(@) element.
 *
 * This is a complex type.
 */
public class RelationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.RelationDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATION$0 = 
        new javax.xml.namespace.QName("", "relation");
    
    
    /**
     * Gets the "relation" element
     */
    public com.kyt.xsd.entitymodel.RelationDocument.Relation getRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.RelationDocument.Relation target = null;
            target = (com.kyt.xsd.entitymodel.RelationDocument.Relation)get_store().find_element_user(RELATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "relation" element
     */
    public void setRelation(com.kyt.xsd.entitymodel.RelationDocument.Relation relation)
    {
        generatedSetterHelperImpl(relation, RELATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relation" element
     */
    public com.kyt.xsd.entitymodel.RelationDocument.Relation addNewRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.RelationDocument.Relation target = null;
            target = (com.kyt.xsd.entitymodel.RelationDocument.Relation)get_store().add_element_user(RELATION$0);
            return target;
        }
    }
    /**
     * An XML relation(@).
     *
     * This is a complex type.
     */
    public static class RelationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.RelationDocument.Relation
    {
        private static final long serialVersionUID = 1L;
        
        public RelationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName KEYMAP$2 = 
            new javax.xml.namespace.QName("", "key-map");
        private static final javax.xml.namespace.QName TYPE$4 = 
            new javax.xml.namespace.QName("", "type");
        private static final javax.xml.namespace.QName TITLE$6 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName RELENTITYNAME$8 = 
            new javax.xml.namespace.QName("", "rel-entity-name");
        private static final javax.xml.namespace.QName FKNAME$10 = 
            new javax.xml.namespace.QName("", "fk-name");
        
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
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
                return get_store().count_elements(DESCRIPTION$0) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
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
                get_store().remove_element(DESCRIPTION$0, 0);
            }
        }
        
        /**
         * Gets array of all "key-map" elements
         */
        public com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap[] getKeyMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYMAP$2, targetList);
                com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap[] result = new com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "key-map" element
         */
        public com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap getKeyMapArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap target = null;
                target = (com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap)get_store().find_element_user(KEYMAP$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "key-map" element
         */
        public int sizeOfKeyMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYMAP$2);
            }
        }
        
        /**
         * Sets array of all "key-map" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setKeyMapArray(com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap[] keyMapArray)
        {
            check_orphaned();
            arraySetterHelper(keyMapArray, KEYMAP$2);
        }
        
        /**
         * Sets ith "key-map" element
         */
        public void setKeyMapArray(int i, com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap keyMap)
        {
            generatedSetterHelperImpl(keyMap, KEYMAP$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "key-map" element
         */
        public com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap insertNewKeyMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap target = null;
                target = (com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap)get_store().insert_element_user(KEYMAP$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "key-map" element
         */
        public com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap addNewKeyMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap target = null;
                target = (com.kyt.xsd.entitymodel.KeyMapDocument.KeyMap)get_store().add_element_user(KEYMAP$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "key-map" element
         */
        public void removeKeyMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYMAP$2, i);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public com.kyt.xsd.entitymodel.RelationDocument.Relation.Type.Enum getType()
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
                return (com.kyt.xsd.entitymodel.RelationDocument.Relation.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public com.kyt.xsd.entitymodel.RelationDocument.Relation.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.RelationDocument.Relation.Type target = null;
                target = (com.kyt.xsd.entitymodel.RelationDocument.Relation.Type)get_store().find_attribute_user(TYPE$4);
                return target;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(com.kyt.xsd.entitymodel.RelationDocument.Relation.Type.Enum type)
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
        public void xsetType(com.kyt.xsd.entitymodel.RelationDocument.Relation.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.RelationDocument.Relation.Type target = null;
                target = (com.kyt.xsd.entitymodel.RelationDocument.Relation.Type)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.RelationDocument.Relation.Type)get_store().add_attribute_user(TYPE$4);
                }
                target.set(type);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$6);
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
                return get_store().find_attribute_user(TITLE$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$6);
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
                get_store().remove_attribute(TITLE$6);
            }
        }
        
        /**
         * Gets the "rel-entity-name" attribute
         */
        public java.lang.String getRelEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELENTITYNAME$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "rel-entity-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRelEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELENTITYNAME$8);
                return target;
            }
        }
        
        /**
         * Sets the "rel-entity-name" attribute
         */
        public void setRelEntityName(java.lang.String relEntityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELENTITYNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELENTITYNAME$8);
                }
                target.setStringValue(relEntityName);
            }
        }
        
        /**
         * Sets (as xml) the "rel-entity-name" attribute
         */
        public void xsetRelEntityName(org.apache.xmlbeans.XmlString relEntityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELENTITYNAME$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELENTITYNAME$8);
                }
                target.set(relEntityName);
            }
        }
        
        /**
         * Gets the "fk-name" attribute
         */
        public java.lang.String getFkName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FKNAME$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "fk-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFkName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FKNAME$10);
                return target;
            }
        }
        
        /**
         * True if has "fk-name" attribute
         */
        public boolean isSetFkName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FKNAME$10) != null;
            }
        }
        
        /**
         * Sets the "fk-name" attribute
         */
        public void setFkName(java.lang.String fkName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FKNAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FKNAME$10);
                }
                target.setStringValue(fkName);
            }
        }
        
        /**
         * Sets (as xml) the "fk-name" attribute
         */
        public void xsetFkName(org.apache.xmlbeans.XmlString fkName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FKNAME$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FKNAME$10);
                }
                target.set(fkName);
            }
        }
        
        /**
         * Unsets the "fk-name" attribute
         */
        public void unsetFkName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FKNAME$10);
            }
        }
        /**
         * An XML type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.entitymodel.RelationDocument$Relation$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.entitymodel.RelationDocument.Relation.Type
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
    }
}
