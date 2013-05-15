/*
 * An XML document type.
 * Localname: in-place-editor
 * Namespace: 
 * Java type: com.kyt.xsd.widgetform.InPlaceEditorDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetform.impl;
/**
 * A document containing one in-place-editor(@) element.
 *
 * This is a complex type.
 */
public class InPlaceEditorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.InPlaceEditorDocument
{
    private static final long serialVersionUID = 1L;
    
    public InPlaceEditorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INPLACEEDITOR$0 = 
        new javax.xml.namespace.QName("", "in-place-editor");
    
    
    /**
     * Gets the "in-place-editor" element
     */
    public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor getInPlaceEditor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor target = null;
            target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor)get_store().find_element_user(INPLACEEDITOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "in-place-editor" element
     */
    public void setInPlaceEditor(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor inPlaceEditor)
    {
        generatedSetterHelperImpl(inPlaceEditor, INPLACEEDITOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "in-place-editor" element
     */
    public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor addNewInPlaceEditor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor target = null;
            target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor)get_store().add_element_user(INPLACEEDITOR$0);
            return target;
        }
    }
    /**
     * An XML in-place-editor(@).
     *
     * This is a complex type.
     */
    public static class InPlaceEditorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor
    {
        private static final long serialVersionUID = 1L;
        
        public InPlaceEditorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SIMPLEEDITOR$0 = 
            new javax.xml.namespace.QName("", "simple-editor");
        private static final javax.xml.namespace.QName FIELDMAP$2 = 
            new javax.xml.namespace.QName("", "field-map");
        private static final javax.xml.namespace.QName URL$4 = 
            new javax.xml.namespace.QName("", "url");
        private static final javax.xml.namespace.QName CANCELCONTROL$6 = 
            new javax.xml.namespace.QName("", "cancel-control");
        private static final javax.xml.namespace.QName CANCELTEXT$8 = 
            new javax.xml.namespace.QName("", "cancel-text");
        private static final javax.xml.namespace.QName CLICKTOEDITTEXT$10 = 
            new javax.xml.namespace.QName("", "click-to-edit-text");
        private static final javax.xml.namespace.QName FIELDPOSTCREATION$12 = 
            new javax.xml.namespace.QName("", "field-post-creation");
        private static final javax.xml.namespace.QName FORMCLASSNAME$14 = 
            new javax.xml.namespace.QName("", "form-class-name");
        private static final javax.xml.namespace.QName FORMID$16 = 
            new javax.xml.namespace.QName("", "form-id");
        private static final javax.xml.namespace.QName HIGHLIGHTCOLOR$18 = 
            new javax.xml.namespace.QName("", "highlight-color");
        private static final javax.xml.namespace.QName HIGHLIGHTENDCOLOR$20 = 
            new javax.xml.namespace.QName("", "highlight-end-color");
        private static final javax.xml.namespace.QName HOVERCLASSNAME$22 = 
            new javax.xml.namespace.QName("", "hover-class-name");
        private static final javax.xml.namespace.QName HTMLRESPONSE$24 = 
            new javax.xml.namespace.QName("", "html-response");
        private static final javax.xml.namespace.QName LOADINGCLASSNAME$26 = 
            new javax.xml.namespace.QName("", "loading-class-name");
        private static final javax.xml.namespace.QName LOADINGTEXT$28 = 
            new javax.xml.namespace.QName("", "loading-text");
        private static final javax.xml.namespace.QName OKCONTROL$30 = 
            new javax.xml.namespace.QName("", "ok-control");
        private static final javax.xml.namespace.QName OKTEXT$32 = 
            new javax.xml.namespace.QName("", "ok-text");
        private static final javax.xml.namespace.QName PARAMNAME$34 = 
            new javax.xml.namespace.QName("", "param-name");
        private static final javax.xml.namespace.QName SAVINGCLASSNAME$36 = 
            new javax.xml.namespace.QName("", "saving-class-name");
        private static final javax.xml.namespace.QName SAVINGTEXT$38 = 
            new javax.xml.namespace.QName("", "saving-text");
        private static final javax.xml.namespace.QName SUBMITONBLUR$40 = 
            new javax.xml.namespace.QName("", "submit-on-blur");
        private static final javax.xml.namespace.QName TEXTAFTERCONTROLS$42 = 
            new javax.xml.namespace.QName("", "text-after-controls");
        private static final javax.xml.namespace.QName TEXTBEFORECONTROLS$44 = 
            new javax.xml.namespace.QName("", "text-before-controls");
        private static final javax.xml.namespace.QName TEXTBETWEENCONTROLS$46 = 
            new javax.xml.namespace.QName("", "text-between-controls");
        private static final javax.xml.namespace.QName UPDATEAFTERREQUESTCALL$48 = 
            new javax.xml.namespace.QName("", "update-after-request-call");
        
        
        /**
         * Gets the "simple-editor" element
         */
        public com.kyt.xsd.widgetform.SimpleEditorDocument.SimpleEditor getSimpleEditor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SimpleEditorDocument.SimpleEditor target = null;
                target = (com.kyt.xsd.widgetform.SimpleEditorDocument.SimpleEditor)get_store().find_element_user(SIMPLEEDITOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "simple-editor" element
         */
        public void setSimpleEditor(com.kyt.xsd.widgetform.SimpleEditorDocument.SimpleEditor simpleEditor)
        {
            generatedSetterHelperImpl(simpleEditor, SIMPLEEDITOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "simple-editor" element
         */
        public com.kyt.xsd.widgetform.SimpleEditorDocument.SimpleEditor addNewSimpleEditor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.SimpleEditorDocument.SimpleEditor target = null;
                target = (com.kyt.xsd.widgetform.SimpleEditorDocument.SimpleEditor)get_store().add_element_user(SIMPLEEDITOR$0);
                return target;
            }
        }
        
        /**
         * Gets array of all "field-map" elements
         */
        public com.kyt.xsd.widgetform.FieldMapDocument.FieldMap[] getFieldMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELDMAP$2, targetList);
                com.kyt.xsd.widgetform.FieldMapDocument.FieldMap[] result = new com.kyt.xsd.widgetform.FieldMapDocument.FieldMap[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "field-map" element
         */
        public com.kyt.xsd.widgetform.FieldMapDocument.FieldMap getFieldMapArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldMapDocument.FieldMap target = null;
                target = (com.kyt.xsd.widgetform.FieldMapDocument.FieldMap)get_store().find_element_user(FIELDMAP$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "field-map" element
         */
        public int sizeOfFieldMapArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELDMAP$2);
            }
        }
        
        /**
         * Sets array of all "field-map" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFieldMapArray(com.kyt.xsd.widgetform.FieldMapDocument.FieldMap[] fieldMapArray)
        {
            check_orphaned();
            arraySetterHelper(fieldMapArray, FIELDMAP$2);
        }
        
        /**
         * Sets ith "field-map" element
         */
        public void setFieldMapArray(int i, com.kyt.xsd.widgetform.FieldMapDocument.FieldMap fieldMap)
        {
            generatedSetterHelperImpl(fieldMap, FIELDMAP$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "field-map" element
         */
        public com.kyt.xsd.widgetform.FieldMapDocument.FieldMap insertNewFieldMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldMapDocument.FieldMap target = null;
                target = (com.kyt.xsd.widgetform.FieldMapDocument.FieldMap)get_store().insert_element_user(FIELDMAP$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "field-map" element
         */
        public com.kyt.xsd.widgetform.FieldMapDocument.FieldMap addNewFieldMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.FieldMapDocument.FieldMap target = null;
                target = (com.kyt.xsd.widgetform.FieldMapDocument.FieldMap)get_store().add_element_user(FIELDMAP$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "field-map" element
         */
        public void removeFieldMap(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELDMAP$2, i);
            }
        }
        
        /**
         * Gets the "url" attribute
         */
        public java.lang.String getUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "url" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URL$4);
                return target;
            }
        }
        
        /**
         * Sets the "url" attribute
         */
        public void setUrl(java.lang.String url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URL$4);
                }
                target.setStringValue(url);
            }
        }
        
        /**
         * Sets (as xml) the "url" attribute
         */
        public void xsetUrl(org.apache.xmlbeans.XmlString url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URL$4);
                }
                target.set(url);
            }
        }
        
        /**
         * Gets the "cancel-control" attribute
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.CancelControl.Enum getCancelControl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANCELCONTROL$6);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.CancelControl.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "cancel-control" attribute
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.CancelControl xgetCancelControl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.CancelControl target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.CancelControl)get_store().find_attribute_user(CANCELCONTROL$6);
                return target;
            }
        }
        
        /**
         * True if has "cancel-control" attribute
         */
        public boolean isSetCancelControl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CANCELCONTROL$6) != null;
            }
        }
        
        /**
         * Sets the "cancel-control" attribute
         */
        public void setCancelControl(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.CancelControl.Enum cancelControl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANCELCONTROL$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CANCELCONTROL$6);
                }
                target.setEnumValue(cancelControl);
            }
        }
        
        /**
         * Sets (as xml) the "cancel-control" attribute
         */
        public void xsetCancelControl(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.CancelControl cancelControl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.CancelControl target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.CancelControl)get_store().find_attribute_user(CANCELCONTROL$6);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.CancelControl)get_store().add_attribute_user(CANCELCONTROL$6);
                }
                target.set(cancelControl);
            }
        }
        
        /**
         * Unsets the "cancel-control" attribute
         */
        public void unsetCancelControl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CANCELCONTROL$6);
            }
        }
        
        /**
         * Gets the "cancel-text" attribute
         */
        public java.lang.String getCancelText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANCELTEXT$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "cancel-text" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCancelText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CANCELTEXT$8);
                return target;
            }
        }
        
        /**
         * True if has "cancel-text" attribute
         */
        public boolean isSetCancelText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CANCELTEXT$8) != null;
            }
        }
        
        /**
         * Sets the "cancel-text" attribute
         */
        public void setCancelText(java.lang.String cancelText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANCELTEXT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CANCELTEXT$8);
                }
                target.setStringValue(cancelText);
            }
        }
        
        /**
         * Sets (as xml) the "cancel-text" attribute
         */
        public void xsetCancelText(org.apache.xmlbeans.XmlString cancelText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CANCELTEXT$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CANCELTEXT$8);
                }
                target.set(cancelText);
            }
        }
        
        /**
         * Unsets the "cancel-text" attribute
         */
        public void unsetCancelText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CANCELTEXT$8);
            }
        }
        
        /**
         * Gets the "click-to-edit-text" attribute
         */
        public java.lang.String getClickToEditText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLICKTOEDITTEXT$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "click-to-edit-text" attribute
         */
        public org.apache.xmlbeans.XmlString xgetClickToEditText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLICKTOEDITTEXT$10);
                return target;
            }
        }
        
        /**
         * True if has "click-to-edit-text" attribute
         */
        public boolean isSetClickToEditText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLICKTOEDITTEXT$10) != null;
            }
        }
        
        /**
         * Sets the "click-to-edit-text" attribute
         */
        public void setClickToEditText(java.lang.String clickToEditText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLICKTOEDITTEXT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLICKTOEDITTEXT$10);
                }
                target.setStringValue(clickToEditText);
            }
        }
        
        /**
         * Sets (as xml) the "click-to-edit-text" attribute
         */
        public void xsetClickToEditText(org.apache.xmlbeans.XmlString clickToEditText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CLICKTOEDITTEXT$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CLICKTOEDITTEXT$10);
                }
                target.set(clickToEditText);
            }
        }
        
        /**
         * Unsets the "click-to-edit-text" attribute
         */
        public void unsetClickToEditText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLICKTOEDITTEXT$10);
            }
        }
        
        /**
         * Gets the "field-post-creation" attribute
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.FieldPostCreation.Enum getFieldPostCreation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDPOSTCREATION$12);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.FieldPostCreation.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "field-post-creation" attribute
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.FieldPostCreation xgetFieldPostCreation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.FieldPostCreation target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.FieldPostCreation)get_store().find_attribute_user(FIELDPOSTCREATION$12);
                return target;
            }
        }
        
        /**
         * True if has "field-post-creation" attribute
         */
        public boolean isSetFieldPostCreation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FIELDPOSTCREATION$12) != null;
            }
        }
        
        /**
         * Sets the "field-post-creation" attribute
         */
        public void setFieldPostCreation(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.FieldPostCreation.Enum fieldPostCreation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FIELDPOSTCREATION$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FIELDPOSTCREATION$12);
                }
                target.setEnumValue(fieldPostCreation);
            }
        }
        
        /**
         * Sets (as xml) the "field-post-creation" attribute
         */
        public void xsetFieldPostCreation(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.FieldPostCreation fieldPostCreation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.FieldPostCreation target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.FieldPostCreation)get_store().find_attribute_user(FIELDPOSTCREATION$12);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.FieldPostCreation)get_store().add_attribute_user(FIELDPOSTCREATION$12);
                }
                target.set(fieldPostCreation);
            }
        }
        
        /**
         * Unsets the "field-post-creation" attribute
         */
        public void unsetFieldPostCreation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FIELDPOSTCREATION$12);
            }
        }
        
        /**
         * Gets the "form-class-name" attribute
         */
        public java.lang.String getFormClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMCLASSNAME$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "form-class-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFormClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMCLASSNAME$14);
                return target;
            }
        }
        
        /**
         * True if has "form-class-name" attribute
         */
        public boolean isSetFormClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FORMCLASSNAME$14) != null;
            }
        }
        
        /**
         * Sets the "form-class-name" attribute
         */
        public void setFormClassName(java.lang.String formClassName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMCLASSNAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMCLASSNAME$14);
                }
                target.setStringValue(formClassName);
            }
        }
        
        /**
         * Sets (as xml) the "form-class-name" attribute
         */
        public void xsetFormClassName(org.apache.xmlbeans.XmlString formClassName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMCLASSNAME$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMCLASSNAME$14);
                }
                target.set(formClassName);
            }
        }
        
        /**
         * Unsets the "form-class-name" attribute
         */
        public void unsetFormClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FORMCLASSNAME$14);
            }
        }
        
        /**
         * Gets the "form-id" attribute
         */
        public java.lang.String getFormId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMID$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "form-id" attribute
         */
        public org.apache.xmlbeans.XmlString xgetFormId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMID$16);
                return target;
            }
        }
        
        /**
         * True if has "form-id" attribute
         */
        public boolean isSetFormId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(FORMID$16) != null;
            }
        }
        
        /**
         * Sets the "form-id" attribute
         */
        public void setFormId(java.lang.String formId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMID$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMID$16);
                }
                target.setStringValue(formId);
            }
        }
        
        /**
         * Sets (as xml) the "form-id" attribute
         */
        public void xsetFormId(org.apache.xmlbeans.XmlString formId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMID$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMID$16);
                }
                target.set(formId);
            }
        }
        
        /**
         * Unsets the "form-id" attribute
         */
        public void unsetFormId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(FORMID$16);
            }
        }
        
        /**
         * Gets the "highlight-color" attribute
         */
        public java.lang.String getHighlightColor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIGHLIGHTCOLOR$18);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "highlight-color" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHighlightColor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HIGHLIGHTCOLOR$18);
                return target;
            }
        }
        
        /**
         * True if has "highlight-color" attribute
         */
        public boolean isSetHighlightColor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HIGHLIGHTCOLOR$18) != null;
            }
        }
        
        /**
         * Sets the "highlight-color" attribute
         */
        public void setHighlightColor(java.lang.String highlightColor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIGHLIGHTCOLOR$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIGHLIGHTCOLOR$18);
                }
                target.setStringValue(highlightColor);
            }
        }
        
        /**
         * Sets (as xml) the "highlight-color" attribute
         */
        public void xsetHighlightColor(org.apache.xmlbeans.XmlString highlightColor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HIGHLIGHTCOLOR$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HIGHLIGHTCOLOR$18);
                }
                target.set(highlightColor);
            }
        }
        
        /**
         * Unsets the "highlight-color" attribute
         */
        public void unsetHighlightColor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HIGHLIGHTCOLOR$18);
            }
        }
        
        /**
         * Gets the "highlight-end-color" attribute
         */
        public java.lang.String getHighlightEndColor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIGHLIGHTENDCOLOR$20);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "highlight-end-color" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHighlightEndColor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HIGHLIGHTENDCOLOR$20);
                return target;
            }
        }
        
        /**
         * True if has "highlight-end-color" attribute
         */
        public boolean isSetHighlightEndColor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HIGHLIGHTENDCOLOR$20) != null;
            }
        }
        
        /**
         * Sets the "highlight-end-color" attribute
         */
        public void setHighlightEndColor(java.lang.String highlightEndColor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIGHLIGHTENDCOLOR$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIGHLIGHTENDCOLOR$20);
                }
                target.setStringValue(highlightEndColor);
            }
        }
        
        /**
         * Sets (as xml) the "highlight-end-color" attribute
         */
        public void xsetHighlightEndColor(org.apache.xmlbeans.XmlString highlightEndColor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HIGHLIGHTENDCOLOR$20);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HIGHLIGHTENDCOLOR$20);
                }
                target.set(highlightEndColor);
            }
        }
        
        /**
         * Unsets the "highlight-end-color" attribute
         */
        public void unsetHighlightEndColor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HIGHLIGHTENDCOLOR$20);
            }
        }
        
        /**
         * Gets the "hover-class-name" attribute
         */
        public java.lang.String getHoverClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOVERCLASSNAME$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "hover-class-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHoverClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOVERCLASSNAME$22);
                return target;
            }
        }
        
        /**
         * True if has "hover-class-name" attribute
         */
        public boolean isSetHoverClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HOVERCLASSNAME$22) != null;
            }
        }
        
        /**
         * Sets the "hover-class-name" attribute
         */
        public void setHoverClassName(java.lang.String hoverClassName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HOVERCLASSNAME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HOVERCLASSNAME$22);
                }
                target.setStringValue(hoverClassName);
            }
        }
        
        /**
         * Sets (as xml) the "hover-class-name" attribute
         */
        public void xsetHoverClassName(org.apache.xmlbeans.XmlString hoverClassName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HOVERCLASSNAME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HOVERCLASSNAME$22);
                }
                target.set(hoverClassName);
            }
        }
        
        /**
         * Unsets the "hover-class-name" attribute
         */
        public void unsetHoverClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HOVERCLASSNAME$22);
            }
        }
        
        /**
         * Gets the "html-response" attribute
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.HtmlResponse.Enum getHtmlResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTMLRESPONSE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(HTMLRESPONSE$24);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.HtmlResponse.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "html-response" attribute
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.HtmlResponse xgetHtmlResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.HtmlResponse target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.HtmlResponse)get_store().find_attribute_user(HTMLRESPONSE$24);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.HtmlResponse)get_default_attribute_value(HTMLRESPONSE$24);
                }
                return target;
            }
        }
        
        /**
         * True if has "html-response" attribute
         */
        public boolean isSetHtmlResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HTMLRESPONSE$24) != null;
            }
        }
        
        /**
         * Sets the "html-response" attribute
         */
        public void setHtmlResponse(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.HtmlResponse.Enum htmlResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HTMLRESPONSE$24);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HTMLRESPONSE$24);
                }
                target.setEnumValue(htmlResponse);
            }
        }
        
        /**
         * Sets (as xml) the "html-response" attribute
         */
        public void xsetHtmlResponse(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.HtmlResponse htmlResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.HtmlResponse target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.HtmlResponse)get_store().find_attribute_user(HTMLRESPONSE$24);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.HtmlResponse)get_store().add_attribute_user(HTMLRESPONSE$24);
                }
                target.set(htmlResponse);
            }
        }
        
        /**
         * Unsets the "html-response" attribute
         */
        public void unsetHtmlResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HTMLRESPONSE$24);
            }
        }
        
        /**
         * Gets the "loading-class-name" attribute
         */
        public java.lang.String getLoadingClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADINGCLASSNAME$26);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "loading-class-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLoadingClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOADINGCLASSNAME$26);
                return target;
            }
        }
        
        /**
         * True if has "loading-class-name" attribute
         */
        public boolean isSetLoadingClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOADINGCLASSNAME$26) != null;
            }
        }
        
        /**
         * Sets the "loading-class-name" attribute
         */
        public void setLoadingClassName(java.lang.String loadingClassName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADINGCLASSNAME$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOADINGCLASSNAME$26);
                }
                target.setStringValue(loadingClassName);
            }
        }
        
        /**
         * Sets (as xml) the "loading-class-name" attribute
         */
        public void xsetLoadingClassName(org.apache.xmlbeans.XmlString loadingClassName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOADINGCLASSNAME$26);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOADINGCLASSNAME$26);
                }
                target.set(loadingClassName);
            }
        }
        
        /**
         * Unsets the "loading-class-name" attribute
         */
        public void unsetLoadingClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOADINGCLASSNAME$26);
            }
        }
        
        /**
         * Gets the "loading-text" attribute
         */
        public java.lang.String getLoadingText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADINGTEXT$28);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "loading-text" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLoadingText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOADINGTEXT$28);
                return target;
            }
        }
        
        /**
         * True if has "loading-text" attribute
         */
        public boolean isSetLoadingText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOADINGTEXT$28) != null;
            }
        }
        
        /**
         * Sets the "loading-text" attribute
         */
        public void setLoadingText(java.lang.String loadingText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOADINGTEXT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOADINGTEXT$28);
                }
                target.setStringValue(loadingText);
            }
        }
        
        /**
         * Sets (as xml) the "loading-text" attribute
         */
        public void xsetLoadingText(org.apache.xmlbeans.XmlString loadingText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOADINGTEXT$28);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOADINGTEXT$28);
                }
                target.set(loadingText);
            }
        }
        
        /**
         * Unsets the "loading-text" attribute
         */
        public void unsetLoadingText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOADINGTEXT$28);
            }
        }
        
        /**
         * Gets the "ok-control" attribute
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.OkControl.Enum getOkControl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OKCONTROL$30);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.OkControl.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "ok-control" attribute
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.OkControl xgetOkControl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.OkControl target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.OkControl)get_store().find_attribute_user(OKCONTROL$30);
                return target;
            }
        }
        
        /**
         * True if has "ok-control" attribute
         */
        public boolean isSetOkControl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OKCONTROL$30) != null;
            }
        }
        
        /**
         * Sets the "ok-control" attribute
         */
        public void setOkControl(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.OkControl.Enum okControl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OKCONTROL$30);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OKCONTROL$30);
                }
                target.setEnumValue(okControl);
            }
        }
        
        /**
         * Sets (as xml) the "ok-control" attribute
         */
        public void xsetOkControl(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.OkControl okControl)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.OkControl target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.OkControl)get_store().find_attribute_user(OKCONTROL$30);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.OkControl)get_store().add_attribute_user(OKCONTROL$30);
                }
                target.set(okControl);
            }
        }
        
        /**
         * Unsets the "ok-control" attribute
         */
        public void unsetOkControl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OKCONTROL$30);
            }
        }
        
        /**
         * Gets the "ok-text" attribute
         */
        public java.lang.String getOkText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OKTEXT$32);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ok-text" attribute
         */
        public org.apache.xmlbeans.XmlString xgetOkText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OKTEXT$32);
                return target;
            }
        }
        
        /**
         * True if has "ok-text" attribute
         */
        public boolean isSetOkText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(OKTEXT$32) != null;
            }
        }
        
        /**
         * Sets the "ok-text" attribute
         */
        public void setOkText(java.lang.String okText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OKTEXT$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OKTEXT$32);
                }
                target.setStringValue(okText);
            }
        }
        
        /**
         * Sets (as xml) the "ok-text" attribute
         */
        public void xsetOkText(org.apache.xmlbeans.XmlString okText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OKTEXT$32);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OKTEXT$32);
                }
                target.set(okText);
            }
        }
        
        /**
         * Unsets the "ok-text" attribute
         */
        public void unsetOkText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(OKTEXT$32);
            }
        }
        
        /**
         * Gets the "param-name" attribute
         */
        public java.lang.String getParamName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMNAME$34);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "param-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetParamName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAMNAME$34);
                return target;
            }
        }
        
        /**
         * True if has "param-name" attribute
         */
        public boolean isSetParamName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARAMNAME$34) != null;
            }
        }
        
        /**
         * Sets the "param-name" attribute
         */
        public void setParamName(java.lang.String paramName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARAMNAME$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARAMNAME$34);
                }
                target.setStringValue(paramName);
            }
        }
        
        /**
         * Sets (as xml) the "param-name" attribute
         */
        public void xsetParamName(org.apache.xmlbeans.XmlString paramName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PARAMNAME$34);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PARAMNAME$34);
                }
                target.set(paramName);
            }
        }
        
        /**
         * Unsets the "param-name" attribute
         */
        public void unsetParamName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARAMNAME$34);
            }
        }
        
        /**
         * Gets the "saving-class-name" attribute
         */
        public java.lang.String getSavingClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVINGCLASSNAME$36);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "saving-class-name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSavingClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SAVINGCLASSNAME$36);
                return target;
            }
        }
        
        /**
         * True if has "saving-class-name" attribute
         */
        public boolean isSetSavingClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SAVINGCLASSNAME$36) != null;
            }
        }
        
        /**
         * Sets the "saving-class-name" attribute
         */
        public void setSavingClassName(java.lang.String savingClassName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVINGCLASSNAME$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAVINGCLASSNAME$36);
                }
                target.setStringValue(savingClassName);
            }
        }
        
        /**
         * Sets (as xml) the "saving-class-name" attribute
         */
        public void xsetSavingClassName(org.apache.xmlbeans.XmlString savingClassName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SAVINGCLASSNAME$36);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SAVINGCLASSNAME$36);
                }
                target.set(savingClassName);
            }
        }
        
        /**
         * Unsets the "saving-class-name" attribute
         */
        public void unsetSavingClassName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SAVINGCLASSNAME$36);
            }
        }
        
        /**
         * Gets the "saving-text" attribute
         */
        public java.lang.String getSavingText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVINGTEXT$38);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "saving-text" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSavingText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SAVINGTEXT$38);
                return target;
            }
        }
        
        /**
         * True if has "saving-text" attribute
         */
        public boolean isSetSavingText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SAVINGTEXT$38) != null;
            }
        }
        
        /**
         * Sets the "saving-text" attribute
         */
        public void setSavingText(java.lang.String savingText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SAVINGTEXT$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SAVINGTEXT$38);
                }
                target.setStringValue(savingText);
            }
        }
        
        /**
         * Sets (as xml) the "saving-text" attribute
         */
        public void xsetSavingText(org.apache.xmlbeans.XmlString savingText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SAVINGTEXT$38);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SAVINGTEXT$38);
                }
                target.set(savingText);
            }
        }
        
        /**
         * Unsets the "saving-text" attribute
         */
        public void unsetSavingText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SAVINGTEXT$38);
            }
        }
        
        /**
         * Gets the "submit-on-blur" attribute
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.SubmitOnBlur.Enum getSubmitOnBlur()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBMITONBLUR$40);
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.SubmitOnBlur.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "submit-on-blur" attribute
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.SubmitOnBlur xgetSubmitOnBlur()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.SubmitOnBlur target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.SubmitOnBlur)get_store().find_attribute_user(SUBMITONBLUR$40);
                return target;
            }
        }
        
        /**
         * True if has "submit-on-blur" attribute
         */
        public boolean isSetSubmitOnBlur()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUBMITONBLUR$40) != null;
            }
        }
        
        /**
         * Sets the "submit-on-blur" attribute
         */
        public void setSubmitOnBlur(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.SubmitOnBlur.Enum submitOnBlur)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUBMITONBLUR$40);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUBMITONBLUR$40);
                }
                target.setEnumValue(submitOnBlur);
            }
        }
        
        /**
         * Sets (as xml) the "submit-on-blur" attribute
         */
        public void xsetSubmitOnBlur(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.SubmitOnBlur submitOnBlur)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.SubmitOnBlur target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.SubmitOnBlur)get_store().find_attribute_user(SUBMITONBLUR$40);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.SubmitOnBlur)get_store().add_attribute_user(SUBMITONBLUR$40);
                }
                target.set(submitOnBlur);
            }
        }
        
        /**
         * Unsets the "submit-on-blur" attribute
         */
        public void unsetSubmitOnBlur()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUBMITONBLUR$40);
            }
        }
        
        /**
         * Gets the "text-after-controls" attribute
         */
        public java.lang.String getTextAfterControls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTAFTERCONTROLS$42);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text-after-controls" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTextAfterControls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTAFTERCONTROLS$42);
                return target;
            }
        }
        
        /**
         * True if has "text-after-controls" attribute
         */
        public boolean isSetTextAfterControls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEXTAFTERCONTROLS$42) != null;
            }
        }
        
        /**
         * Sets the "text-after-controls" attribute
         */
        public void setTextAfterControls(java.lang.String textAfterControls)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTAFTERCONTROLS$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTAFTERCONTROLS$42);
                }
                target.setStringValue(textAfterControls);
            }
        }
        
        /**
         * Sets (as xml) the "text-after-controls" attribute
         */
        public void xsetTextAfterControls(org.apache.xmlbeans.XmlString textAfterControls)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTAFTERCONTROLS$42);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTAFTERCONTROLS$42);
                }
                target.set(textAfterControls);
            }
        }
        
        /**
         * Unsets the "text-after-controls" attribute
         */
        public void unsetTextAfterControls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEXTAFTERCONTROLS$42);
            }
        }
        
        /**
         * Gets the "text-before-controls" attribute
         */
        public java.lang.String getTextBeforeControls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTBEFORECONTROLS$44);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text-before-controls" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTextBeforeControls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTBEFORECONTROLS$44);
                return target;
            }
        }
        
        /**
         * True if has "text-before-controls" attribute
         */
        public boolean isSetTextBeforeControls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEXTBEFORECONTROLS$44) != null;
            }
        }
        
        /**
         * Sets the "text-before-controls" attribute
         */
        public void setTextBeforeControls(java.lang.String textBeforeControls)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTBEFORECONTROLS$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTBEFORECONTROLS$44);
                }
                target.setStringValue(textBeforeControls);
            }
        }
        
        /**
         * Sets (as xml) the "text-before-controls" attribute
         */
        public void xsetTextBeforeControls(org.apache.xmlbeans.XmlString textBeforeControls)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTBEFORECONTROLS$44);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTBEFORECONTROLS$44);
                }
                target.set(textBeforeControls);
            }
        }
        
        /**
         * Unsets the "text-before-controls" attribute
         */
        public void unsetTextBeforeControls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEXTBEFORECONTROLS$44);
            }
        }
        
        /**
         * Gets the "text-between-controls" attribute
         */
        public java.lang.String getTextBetweenControls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTBETWEENCONTROLS$46);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "text-between-controls" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTextBetweenControls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTBETWEENCONTROLS$46);
                return target;
            }
        }
        
        /**
         * True if has "text-between-controls" attribute
         */
        public boolean isSetTextBetweenControls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TEXTBETWEENCONTROLS$46) != null;
            }
        }
        
        /**
         * Sets the "text-between-controls" attribute
         */
        public void setTextBetweenControls(java.lang.String textBetweenControls)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEXTBETWEENCONTROLS$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEXTBETWEENCONTROLS$46);
                }
                target.setStringValue(textBetweenControls);
            }
        }
        
        /**
         * Sets (as xml) the "text-between-controls" attribute
         */
        public void xsetTextBetweenControls(org.apache.xmlbeans.XmlString textBetweenControls)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TEXTBETWEENCONTROLS$46);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TEXTBETWEENCONTROLS$46);
                }
                target.set(textBetweenControls);
            }
        }
        
        /**
         * Unsets the "text-between-controls" attribute
         */
        public void unsetTextBetweenControls()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TEXTBETWEENCONTROLS$46);
            }
        }
        
        /**
         * Gets the "update-after-request-call" attribute
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.UpdateAfterRequestCall.Enum getUpdateAfterRequestCall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEAFTERREQUESTCALL$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UPDATEAFTERREQUESTCALL$48);
                }
                if (target == null)
                {
                    return null;
                }
                return (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.UpdateAfterRequestCall.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "update-after-request-call" attribute
         */
        public com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.UpdateAfterRequestCall xgetUpdateAfterRequestCall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.UpdateAfterRequestCall target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.UpdateAfterRequestCall)get_store().find_attribute_user(UPDATEAFTERREQUESTCALL$48);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.UpdateAfterRequestCall)get_default_attribute_value(UPDATEAFTERREQUESTCALL$48);
                }
                return target;
            }
        }
        
        /**
         * True if has "update-after-request-call" attribute
         */
        public boolean isSetUpdateAfterRequestCall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(UPDATEAFTERREQUESTCALL$48) != null;
            }
        }
        
        /**
         * Sets the "update-after-request-call" attribute
         */
        public void setUpdateAfterRequestCall(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.UpdateAfterRequestCall.Enum updateAfterRequestCall)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEAFTERREQUESTCALL$48);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPDATEAFTERREQUESTCALL$48);
                }
                target.setEnumValue(updateAfterRequestCall);
            }
        }
        
        /**
         * Sets (as xml) the "update-after-request-call" attribute
         */
        public void xsetUpdateAfterRequestCall(com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.UpdateAfterRequestCall updateAfterRequestCall)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.UpdateAfterRequestCall target = null;
                target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.UpdateAfterRequestCall)get_store().find_attribute_user(UPDATEAFTERREQUESTCALL$48);
                if (target == null)
                {
                    target = (com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.UpdateAfterRequestCall)get_store().add_attribute_user(UPDATEAFTERREQUESTCALL$48);
                }
                target.set(updateAfterRequestCall);
            }
        }
        
        /**
         * Unsets the "update-after-request-call" attribute
         */
        public void unsetUpdateAfterRequestCall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(UPDATEAFTERREQUESTCALL$48);
            }
        }
        /**
         * An XML cancel-control(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.InPlaceEditorDocument$InPlaceEditor$CancelControl.
         */
        public static class CancelControlImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.CancelControl
        {
            private static final long serialVersionUID = 1L;
            
            public CancelControlImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected CancelControlImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML field-post-creation(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.InPlaceEditorDocument$InPlaceEditor$FieldPostCreation.
         */
        public static class FieldPostCreationImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.FieldPostCreation
        {
            private static final long serialVersionUID = 1L;
            
            public FieldPostCreationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected FieldPostCreationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML html-response(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.InPlaceEditorDocument$InPlaceEditor$HtmlResponse.
         */
        public static class HtmlResponseImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.HtmlResponse
        {
            private static final long serialVersionUID = 1L;
            
            public HtmlResponseImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected HtmlResponseImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML ok-control(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.InPlaceEditorDocument$InPlaceEditor$OkControl.
         */
        public static class OkControlImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.OkControl
        {
            private static final long serialVersionUID = 1L;
            
            public OkControlImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected OkControlImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML submit-on-blur(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.InPlaceEditorDocument$InPlaceEditor$SubmitOnBlur.
         */
        public static class SubmitOnBlurImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.SubmitOnBlur
        {
            private static final long serialVersionUID = 1L;
            
            public SubmitOnBlurImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SubmitOnBlurImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML update-after-request-call(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetform.InPlaceEditorDocument$InPlaceEditor$UpdateAfterRequestCall.
         */
        public static class UpdateAfterRequestCallImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.kyt.xsd.widgetform.InPlaceEditorDocument.InPlaceEditor.UpdateAfterRequestCall
        {
            private static final long serialVersionUID = 1L;
            
            public UpdateAfterRequestCallImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UpdateAfterRequestCallImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
