/*
 * An XML document type.
 * Localname: view-entity
 * Namespace: 
 * Java type: com.kyt.xsd.entitymodel.ViewEntityDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.entitymodel.impl;
/**
 * A document containing one view-entity(@) element.
 *
 * This is a complex type.
 */
public class ViewEntityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.ViewEntityDocument
{
    private static final long serialVersionUID = 1L;
    
    public ViewEntityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWENTITY$0 = 
        new javax.xml.namespace.QName("", "view-entity");
    
    
    /**
     * Gets the "view-entity" element
     */
    public com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity getViewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity target = null;
            target = (com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity)get_store().find_element_user(VIEWENTITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "view-entity" element
     */
    public void setViewEntity(com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity viewEntity)
    {
        generatedSetterHelperImpl(viewEntity, VIEWENTITY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "view-entity" element
     */
    public com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity addNewViewEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity target = null;
            target = (com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity)get_store().add_element_user(VIEWENTITY$0);
            return target;
        }
    }
    /**
     * An XML view-entity(@).
     *
     * This is a complex type.
     */
    public static class ViewEntityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.entitymodel.ViewEntityDocument.ViewEntity
    {
        private static final long serialVersionUID = 1L;
        
        public ViewEntityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTION$0 = 
            new javax.xml.namespace.QName("", "description");
        private static final javax.xml.namespace.QName MEMBERENTITY$2 = 
            new javax.xml.namespace.QName("", "member-entity");
        private static final javax.xml.namespace.QName ALIASALL$4 = 
            new javax.xml.namespace.QName("", "alias-all");
        private static final javax.xml.namespace.QName ALIAS$6 = 
            new javax.xml.namespace.QName("", "alias");
        private static final javax.xml.namespace.QName VIEWLINK$8 = 
            new javax.xml.namespace.QName("", "view-link");
        private static final javax.xml.namespace.QName RELATION$10 = 
            new javax.xml.namespace.QName("", "relation");
        private static final javax.xml.namespace.QName ENTITYCONDITION$12 = 
            new javax.xml.namespace.QName("", "entity-condition");
        private static final javax.xml.namespace.QName ENTITYNAME$14 = 
            new javax.xml.namespace.QName("", "entity-name");
        private static final javax.xml.namespace.QName PACKAGENAME$16 = 
            new javax.xml.namespace.QName("", "package-name");
        private static final javax.xml.namespace.QName DEPENDENTON$18 = 
            new javax.xml.namespace.QName("", "dependent-on");
        private static final javax.xml.namespace.QName DEFAULTRESOURCENAME$20 = 
            new javax.xml.namespace.QName("", "default-resource-name");
        private static final javax.xml.namespace.QName NEVERCACHE$22 = 
            new javax.xml.namespace.QName("", "never-cache");
        private static final javax.xml.namespace.QName AUTOCLEARCACHE$24 = 
            new javax.xml.namespace.QName("", "auto-clear-cache");
        private static final javax.xml.namespace.QName TITLE$26 = 
            new javax.xml.namespace.QName("", "title");
        private static final javax.xml.namespace.QName COPYRIGHT$28 = 
            new javax.xml.namespace.QName("", "copyright");
        private static final javax.xml.namespace.QName AUTHOR$30 = 
            new javax.xml.namespace.QName("", "author");
        private static final javax.xml.namespace.QName VERSION$32 = 
            new javax.xml.namespace.QName("", "version");
        
        
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
         * Gets array of all "member-entity" elements
         */
        public com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity[] getMemberEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MEMBERENTITY$2, targetList);
                com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity[] result = new com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "member-entity" element
         */
        public com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity getMemberEntityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity target = null;
                target = (com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity)get_store().find_element_user(MEMBERENTITY$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "member-entity" element
         */
        public int sizeOfMemberEntityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEMBERENTITY$2);
            }
        }
        
        /**
         * Sets array of all "member-entity" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setMemberEntityArray(com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity[] memberEntityArray)
        {
            check_orphaned();
            arraySetterHelper(memberEntityArray, MEMBERENTITY$2);
        }
        
        /**
         * Sets ith "member-entity" element
         */
        public void setMemberEntityArray(int i, com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity memberEntity)
        {
            generatedSetterHelperImpl(memberEntity, MEMBERENTITY$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "member-entity" element
         */
        public com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity insertNewMemberEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity target = null;
                target = (com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity)get_store().insert_element_user(MEMBERENTITY$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "member-entity" element
         */
        public com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity addNewMemberEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity target = null;
                target = (com.kyt.xsd.entitymodel.MemberEntityDocument.MemberEntity)get_store().add_element_user(MEMBERENTITY$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "member-entity" element
         */
        public void removeMemberEntity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEMBERENTITY$2, i);
            }
        }
        
        /**
         * Gets array of all "alias-all" elements
         */
        public com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll[] getAliasAllArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALIASALL$4, targetList);
                com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll[] result = new com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "alias-all" element
         */
        public com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll getAliasAllArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll target = null;
                target = (com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll)get_store().find_element_user(ALIASALL$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "alias-all" element
         */
        public int sizeOfAliasAllArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALIASALL$4);
            }
        }
        
        /**
         * Sets array of all "alias-all" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAliasAllArray(com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll[] aliasAllArray)
        {
            check_orphaned();
            arraySetterHelper(aliasAllArray, ALIASALL$4);
        }
        
        /**
         * Sets ith "alias-all" element
         */
        public void setAliasAllArray(int i, com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll aliasAll)
        {
            generatedSetterHelperImpl(aliasAll, ALIASALL$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alias-all" element
         */
        public com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll insertNewAliasAll(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll target = null;
                target = (com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll)get_store().insert_element_user(ALIASALL$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alias-all" element
         */
        public com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll addNewAliasAll()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll target = null;
                target = (com.kyt.xsd.entitymodel.AliasAllDocument.AliasAll)get_store().add_element_user(ALIASALL$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "alias-all" element
         */
        public void removeAliasAll(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALIASALL$4, i);
            }
        }
        
        /**
         * Gets array of all "alias" elements
         */
        public com.kyt.xsd.entitymodel.AliasDocument.Alias[] getAliasArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALIAS$6, targetList);
                com.kyt.xsd.entitymodel.AliasDocument.Alias[] result = new com.kyt.xsd.entitymodel.AliasDocument.Alias[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "alias" element
         */
        public com.kyt.xsd.entitymodel.AliasDocument.Alias getAliasArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.AliasDocument.Alias target = null;
                target = (com.kyt.xsd.entitymodel.AliasDocument.Alias)get_store().find_element_user(ALIAS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "alias" element
         */
        public int sizeOfAliasArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALIAS$6);
            }
        }
        
        /**
         * Sets array of all "alias" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAliasArray(com.kyt.xsd.entitymodel.AliasDocument.Alias[] aliasArray)
        {
            check_orphaned();
            arraySetterHelper(aliasArray, ALIAS$6);
        }
        
        /**
         * Sets ith "alias" element
         */
        public void setAliasArray(int i, com.kyt.xsd.entitymodel.AliasDocument.Alias alias)
        {
            generatedSetterHelperImpl(alias, ALIAS$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alias" element
         */
        public com.kyt.xsd.entitymodel.AliasDocument.Alias insertNewAlias(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.AliasDocument.Alias target = null;
                target = (com.kyt.xsd.entitymodel.AliasDocument.Alias)get_store().insert_element_user(ALIAS$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alias" element
         */
        public com.kyt.xsd.entitymodel.AliasDocument.Alias addNewAlias()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.AliasDocument.Alias target = null;
                target = (com.kyt.xsd.entitymodel.AliasDocument.Alias)get_store().add_element_user(ALIAS$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "alias" element
         */
        public void removeAlias(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALIAS$6, i);
            }
        }
        
        /**
         * Gets array of all "view-link" elements
         */
        public com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink[] getViewLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(VIEWLINK$8, targetList);
                com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink[] result = new com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "view-link" element
         */
        public com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink getViewLinkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink target = null;
                target = (com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink)get_store().find_element_user(VIEWLINK$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "view-link" element
         */
        public int sizeOfViewLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VIEWLINK$8);
            }
        }
        
        /**
         * Sets array of all "view-link" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setViewLinkArray(com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink[] viewLinkArray)
        {
            check_orphaned();
            arraySetterHelper(viewLinkArray, VIEWLINK$8);
        }
        
        /**
         * Sets ith "view-link" element
         */
        public void setViewLinkArray(int i, com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink viewLink)
        {
            generatedSetterHelperImpl(viewLink, VIEWLINK$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "view-link" element
         */
        public com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink insertNewViewLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink target = null;
                target = (com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink)get_store().insert_element_user(VIEWLINK$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "view-link" element
         */
        public com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink addNewViewLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink target = null;
                target = (com.kyt.xsd.entitymodel.ViewLinkDocument.ViewLink)get_store().add_element_user(VIEWLINK$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "view-link" element
         */
        public void removeViewLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VIEWLINK$8, i);
            }
        }
        
        /**
         * Gets array of all "relation" elements
         */
        public com.kyt.xsd.entitymodel.RelationDocument.Relation[] getRelationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RELATION$10, targetList);
                com.kyt.xsd.entitymodel.RelationDocument.Relation[] result = new com.kyt.xsd.entitymodel.RelationDocument.Relation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "relation" element
         */
        public com.kyt.xsd.entitymodel.RelationDocument.Relation getRelationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.RelationDocument.Relation target = null;
                target = (com.kyt.xsd.entitymodel.RelationDocument.Relation)get_store().find_element_user(RELATION$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "relation" element
         */
        public int sizeOfRelationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATION$10);
            }
        }
        
        /**
         * Sets array of all "relation" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRelationArray(com.kyt.xsd.entitymodel.RelationDocument.Relation[] relationArray)
        {
            check_orphaned();
            arraySetterHelper(relationArray, RELATION$10);
        }
        
        /**
         * Sets ith "relation" element
         */
        public void setRelationArray(int i, com.kyt.xsd.entitymodel.RelationDocument.Relation relation)
        {
            generatedSetterHelperImpl(relation, RELATION$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "relation" element
         */
        public com.kyt.xsd.entitymodel.RelationDocument.Relation insertNewRelation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.RelationDocument.Relation target = null;
                target = (com.kyt.xsd.entitymodel.RelationDocument.Relation)get_store().insert_element_user(RELATION$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "relation" element
         */
        public com.kyt.xsd.entitymodel.RelationDocument.Relation addNewRelation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.RelationDocument.Relation target = null;
                target = (com.kyt.xsd.entitymodel.RelationDocument.Relation)get_store().add_element_user(RELATION$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "relation" element
         */
        public void removeRelation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATION$10, i);
            }
        }
        
        /**
         * Gets the "entity-condition" element
         */
        public com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition getEntityCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition target = null;
                target = (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition)get_store().find_element_user(ENTITYCONDITION$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "entity-condition" element
         */
        public boolean isSetEntityCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITYCONDITION$12) != 0;
            }
        }
        
        /**
         * Sets the "entity-condition" element
         */
        public void setEntityCondition(com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition entityCondition)
        {
            generatedSetterHelperImpl(entityCondition, ENTITYCONDITION$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "entity-condition" element
         */
        public com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition addNewEntityCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition target = null;
                target = (com.kyt.xsd.entitymodel.EntityConditionDocument.EntityCondition)get_store().add_element_user(ENTITYCONDITION$12);
                return target;
            }
        }
        
        /**
         * Unsets the "entity-condition" element
         */
        public void unsetEntityCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITYCONDITION$12, 0);
            }
        }
        
        /**
         * Gets the "entity-name" attribute
         */
        public java.lang.String getEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entity-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEntityName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$14);
                return target;
            }
        }
        
        /**
         * Sets the "entity-name" attribute
         */
        public void setEntityName(java.lang.String entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENTITYNAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENTITYNAME$14);
                }
                target.setStringValue(entityName);
            }
        }
        
        /**
         * Sets (as xml) the "entity-name" attribute
         */
        public void xsetEntityName(org.apache.xmlbeans.XmlString entityName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENTITYNAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENTITYNAME$14);
                }
                target.set(entityName);
            }
        }
        
        /**
         * Gets the "package-name" attribute
         */
        public java.lang.String getPackageName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGENAME$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "package-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPackageName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGENAME$16);
                return target;
            }
        }
        
        /**
         * Sets the "package-name" attribute
         */
        public void setPackageName(java.lang.String packageName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PACKAGENAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PACKAGENAME$16);
                }
                target.setStringValue(packageName);
            }
        }
        
        /**
         * Sets (as xml) the "package-name" attribute
         */
        public void xsetPackageName(org.apache.xmlbeans.XmlString packageName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PACKAGENAME$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PACKAGENAME$16);
                }
                target.set(packageName);
            }
        }
        
        /**
         * Gets the "dependent-on" attribute
         */
        public java.lang.String getDependentOn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPENDENTON$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "dependent-on" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDependentOn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEPENDENTON$18);
                return target;
            }
        }
        
        /**
         * True if has "dependent-on" attribute
         */
        public boolean isSetDependentOn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEPENDENTON$18) != null;
            }
        }
        
        /**
         * Sets the "dependent-on" attribute
         */
        public void setDependentOn(java.lang.String dependentOn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEPENDENTON$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEPENDENTON$18);
                }
                target.setStringValue(dependentOn);
            }
        }
        
        /**
         * Sets (as xml) the "dependent-on" attribute
         */
        public void xsetDependentOn(org.apache.xmlbeans.XmlString dependentOn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEPENDENTON$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEPENDENTON$18);
                }
                target.set(dependentOn);
            }
        }
        
        /**
         * Unsets the "dependent-on" attribute
         */
        public void unsetDependentOn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEPENDENTON$18);
            }
        }
        
        /**
         * Gets the "default-resource-name" attribute
         */
        public java.lang.String getDefaultResourceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTRESOURCENAME$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "default-resource-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetDefaultResourceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTRESOURCENAME$20);
                return target;
            }
        }
        
        /**
         * True if has "default-resource-name" attribute
         */
        public boolean isSetDefaultResourceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DEFAULTRESOURCENAME$20) != null;
            }
        }
        
        /**
         * Sets the "default-resource-name" attribute
         */
        public void setDefaultResourceName(java.lang.String defaultResourceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULTRESOURCENAME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULTRESOURCENAME$20);
                }
                target.setStringValue(defaultResourceName);
            }
        }
        
        /**
         * Sets (as xml) the "default-resource-name" attribute
         */
        public void xsetDefaultResourceName(org.apache.xmlbeans.XmlString defaultResourceName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULTRESOURCENAME$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULTRESOURCENAME$20);
                }
                target.set(defaultResourceName);
            }
        }
        
        /**
         * Unsets the "default-resource-name" attribute
         */
        public void unsetDefaultResourceName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DEFAULTRESOURCENAME$20);
            }
        }
        
        /**
         * Gets the "never-cache" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean.Enum getNeverCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEVERCACHE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NEVERCACHE$22);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entitymodel.Boolean.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "never-cache" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean xgetNeverCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(NEVERCACHE$22);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_default_attribute_value(NEVERCACHE$22);
                }
                return target;
            }
        }
        
        /**
         * True if has "never-cache" attribute
         */
        public boolean isSetNeverCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(NEVERCACHE$22) != null;
            }
        }
        
        /**
         * Sets the "never-cache" attribute
         */
        public void setNeverCache(com.kyt.xsd.entitymodel.Boolean.Enum neverCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEVERCACHE$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NEVERCACHE$22);
                }
                target.setEnumValue(neverCache);
            }
        }
        
        /**
         * Sets (as xml) the "never-cache" attribute
         */
        public void xsetNeverCache(com.kyt.xsd.entitymodel.Boolean neverCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(NEVERCACHE$22);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_store().add_attribute_user(NEVERCACHE$22);
                }
                target.set(neverCache);
            }
        }
        
        /**
         * Unsets the "never-cache" attribute
         */
        public void unsetNeverCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(NEVERCACHE$22);
            }
        }
        
        /**
         * Gets the "auto-clear-cache" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean.Enum getAutoClearCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOCLEARCACHE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(AUTOCLEARCACHE$24);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.entitymodel.Boolean.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "auto-clear-cache" attribute
         */
        public com.kyt.xsd.entitymodel.Boolean xgetAutoClearCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(AUTOCLEARCACHE$24);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_default_attribute_value(AUTOCLEARCACHE$24);
                }
                return target;
            }
        }
        
        /**
         * True if has "auto-clear-cache" attribute
         */
        public boolean isSetAutoClearCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AUTOCLEARCACHE$24) != null;
            }
        }
        
        /**
         * Sets the "auto-clear-cache" attribute
         */
        public void setAutoClearCache(com.kyt.xsd.entitymodel.Boolean.Enum autoClearCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTOCLEARCACHE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTOCLEARCACHE$24);
                }
                target.setEnumValue(autoClearCache);
            }
        }
        
        /**
         * Sets (as xml) the "auto-clear-cache" attribute
         */
        public void xsetAutoClearCache(com.kyt.xsd.entitymodel.Boolean autoClearCache)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.entitymodel.Boolean target = null;
                target = (com.kyt.xsd.entitymodel.Boolean)get_store().find_attribute_user(AUTOCLEARCACHE$24);
                if (target == null)
                {
                    target = (com.kyt.xsd.entitymodel.Boolean)get_store().add_attribute_user(AUTOCLEARCACHE$24);
                }
                target.set(autoClearCache);
            }
        }
        
        /**
         * Unsets the "auto-clear-cache" attribute
         */
        public void unsetAutoClearCache()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AUTOCLEARCACHE$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$26);
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
                return get_store().find_attribute_user(TITLE$26) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$26);
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
                get_store().remove_attribute(TITLE$26);
            }
        }
        
        /**
         * Gets the "copyright" attribute
         */
        public java.lang.String getCopyright()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPYRIGHT$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "copyright" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCopyright()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COPYRIGHT$28);
                return target;
            }
        }
        
        /**
         * True if has "copyright" attribute
         */
        public boolean isSetCopyright()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COPYRIGHT$28) != null;
            }
        }
        
        /**
         * Sets the "copyright" attribute
         */
        public void setCopyright(java.lang.String copyright)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPYRIGHT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COPYRIGHT$28);
                }
                target.setStringValue(copyright);
            }
        }
        
        /**
         * Sets (as xml) the "copyright" attribute
         */
        public void xsetCopyright(org.apache.xmlbeans.XmlString copyright)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COPYRIGHT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COPYRIGHT$28);
                }
                target.set(copyright);
            }
        }
        
        /**
         * Unsets the "copyright" attribute
         */
        public void unsetCopyright()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COPYRIGHT$28);
            }
        }
        
        /**
         * Gets the "author" attribute
         */
        public java.lang.String getAuthor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHOR$30);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "author" attribute
         */
        public org.apache.xmlbeans.XmlString xgetAuthor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AUTHOR$30);
                return target;
            }
        }
        
        /**
         * True if has "author" attribute
         */
        public boolean isSetAuthor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(AUTHOR$30) != null;
            }
        }
        
        /**
         * Sets the "author" attribute
         */
        public void setAuthor(java.lang.String author)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AUTHOR$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AUTHOR$30);
                }
                target.setStringValue(author);
            }
        }
        
        /**
         * Sets (as xml) the "author" attribute
         */
        public void xsetAuthor(org.apache.xmlbeans.XmlString author)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AUTHOR$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AUTHOR$30);
                }
                target.set(author);
            }
        }
        
        /**
         * Unsets the "author" attribute
         */
        public void unsetAuthor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(AUTHOR$30);
            }
        }
        
        /**
         * Gets the "version" attribute
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$32);
                return target;
            }
        }
        
        /**
         * True if has "version" attribute
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERSION$32) != null;
            }
        }
        
        /**
         * Sets the "version" attribute
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$32);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" attribute
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$32);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "version" attribute
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERSION$32);
            }
        }
    }
}
