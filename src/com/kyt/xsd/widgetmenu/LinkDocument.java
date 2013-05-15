/*
 * An XML document type.
 * Localname: link
 * Namespace: 
 * Java type: com.kyt.xsd.widgetmenu.LinkDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.widgetmenu;


/**
 * A document containing one link(@) element.
 *
 * This is a complex type.
 */
public interface LinkDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LinkDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("linkd3f3doctype");
    
    /**
     * Gets the "link" element
     */
    com.kyt.xsd.widgetmenu.LinkDocument.Link getLink();
    
    /**
     * Sets the "link" element
     */
    void setLink(com.kyt.xsd.widgetmenu.LinkDocument.Link link);
    
    /**
     * Appends and returns a new empty "link" element
     */
    com.kyt.xsd.widgetmenu.LinkDocument.Link addNewLink();
    
    /**
     * An XML link(@).
     *
     * This is a complex type.
     */
    public interface Link extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Link.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("link5aadelemtype");
        
        /**
         * Gets array of all "parameter" elements
         */
        com.kyt.xsd.widgetmenu.ParameterDocument.Parameter[] getParameterArray();
        
        /**
         * Gets ith "parameter" element
         */
        com.kyt.xsd.widgetmenu.ParameterDocument.Parameter getParameterArray(int i);
        
        /**
         * Returns number of "parameter" element
         */
        int sizeOfParameterArray();
        
        /**
         * Sets array of all "parameter" element
         */
        void setParameterArray(com.kyt.xsd.widgetmenu.ParameterDocument.Parameter[] parameterArray);
        
        /**
         * Sets ith "parameter" element
         */
        void setParameterArray(int i, com.kyt.xsd.widgetmenu.ParameterDocument.Parameter parameter);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "parameter" element
         */
        com.kyt.xsd.widgetmenu.ParameterDocument.Parameter insertNewParameter(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "parameter" element
         */
        com.kyt.xsd.widgetmenu.ParameterDocument.Parameter addNewParameter();
        
        /**
         * Removes the ith "parameter" element
         */
        void removeParameter(int i);
        
        /**
         * Gets the "image" element
         */
        com.kyt.xsd.widgetmenu.ImageDocument.Image getImage();
        
        /**
         * True if has "image" element
         */
        boolean isSetImage();
        
        /**
         * Sets the "image" element
         */
        void setImage(com.kyt.xsd.widgetmenu.ImageDocument.Image image);
        
        /**
         * Appends and returns a new empty "image" element
         */
        com.kyt.xsd.widgetmenu.ImageDocument.Image addNewImage();
        
        /**
         * Unsets the "image" element
         */
        void unsetImage();
        
        /**
         * Gets the "text" attribute
         */
        java.lang.String getText();
        
        /**
         * Gets (as xml) the "text" attribute
         */
        org.apache.xmlbeans.XmlString xgetText();
        
        /**
         * True if has "text" attribute
         */
        boolean isSetText();
        
        /**
         * Sets the "text" attribute
         */
        void setText(java.lang.String text);
        
        /**
         * Sets (as xml) the "text" attribute
         */
        void xsetText(org.apache.xmlbeans.XmlString text);
        
        /**
         * Unsets the "text" attribute
         */
        void unsetText();
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlString xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlString id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
        /**
         * Gets the "style" attribute
         */
        java.lang.String getStyle();
        
        /**
         * Gets (as xml) the "style" attribute
         */
        org.apache.xmlbeans.XmlString xgetStyle();
        
        /**
         * True if has "style" attribute
         */
        boolean isSetStyle();
        
        /**
         * Sets the "style" attribute
         */
        void setStyle(java.lang.String style);
        
        /**
         * Sets (as xml) the "style" attribute
         */
        void xsetStyle(org.apache.xmlbeans.XmlString style);
        
        /**
         * Unsets the "style" attribute
         */
        void unsetStyle();
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
        /**
         * Gets the "target" attribute
         */
        java.lang.String getTarget();
        
        /**
         * Gets (as xml) the "target" attribute
         */
        org.apache.xmlbeans.XmlString xgetTarget();
        
        /**
         * True if has "target" attribute
         */
        boolean isSetTarget();
        
        /**
         * Sets the "target" attribute
         */
        void setTarget(java.lang.String target);
        
        /**
         * Sets (as xml) the "target" attribute
         */
        void xsetTarget(org.apache.xmlbeans.XmlString target);
        
        /**
         * Unsets the "target" attribute
         */
        void unsetTarget();
        
        /**
         * Gets the "target-window" attribute
         */
        java.lang.String getTargetWindow();
        
        /**
         * Gets (as xml) the "target-window" attribute
         */
        org.apache.xmlbeans.XmlString xgetTargetWindow();
        
        /**
         * True if has "target-window" attribute
         */
        boolean isSetTargetWindow();
        
        /**
         * Sets the "target-window" attribute
         */
        void setTargetWindow(java.lang.String targetWindow);
        
        /**
         * Sets (as xml) the "target-window" attribute
         */
        void xsetTargetWindow(org.apache.xmlbeans.XmlString targetWindow);
        
        /**
         * Unsets the "target-window" attribute
         */
        void unsetTargetWindow();
        
        /**
         * Gets the "prefix" attribute
         */
        java.lang.String getPrefix();
        
        /**
         * Gets (as xml) the "prefix" attribute
         */
        org.apache.xmlbeans.XmlString xgetPrefix();
        
        /**
         * True if has "prefix" attribute
         */
        boolean isSetPrefix();
        
        /**
         * Sets the "prefix" attribute
         */
        void setPrefix(java.lang.String prefix);
        
        /**
         * Sets (as xml) the "prefix" attribute
         */
        void xsetPrefix(org.apache.xmlbeans.XmlString prefix);
        
        /**
         * Unsets the "prefix" attribute
         */
        void unsetPrefix();
        
        /**
         * Gets the "link-type" attribute
         */
        com.kyt.xsd.widgetmenu.LinkDocument.Link.LinkType.Enum getLinkType();
        
        /**
         * Gets (as xml) the "link-type" attribute
         */
        com.kyt.xsd.widgetmenu.LinkDocument.Link.LinkType xgetLinkType();
        
        /**
         * True if has "link-type" attribute
         */
        boolean isSetLinkType();
        
        /**
         * Sets the "link-type" attribute
         */
        void setLinkType(com.kyt.xsd.widgetmenu.LinkDocument.Link.LinkType.Enum linkType);
        
        /**
         * Sets (as xml) the "link-type" attribute
         */
        void xsetLinkType(com.kyt.xsd.widgetmenu.LinkDocument.Link.LinkType linkType);
        
        /**
         * Unsets the "link-type" attribute
         */
        void unsetLinkType();
        
        /**
         * Gets the "url-mode" attribute
         */
        com.kyt.xsd.widgetmenu.LinkDocument.Link.UrlMode.Enum getUrlMode();
        
        /**
         * Gets (as xml) the "url-mode" attribute
         */
        com.kyt.xsd.widgetmenu.LinkDocument.Link.UrlMode xgetUrlMode();
        
        /**
         * True if has "url-mode" attribute
         */
        boolean isSetUrlMode();
        
        /**
         * Sets the "url-mode" attribute
         */
        void setUrlMode(com.kyt.xsd.widgetmenu.LinkDocument.Link.UrlMode.Enum urlMode);
        
        /**
         * Sets (as xml) the "url-mode" attribute
         */
        void xsetUrlMode(com.kyt.xsd.widgetmenu.LinkDocument.Link.UrlMode urlMode);
        
        /**
         * Unsets the "url-mode" attribute
         */
        void unsetUrlMode();
        
        /**
         * Gets the "full-path" attribute
         */
        com.kyt.xsd.widgetmenu.LinkDocument.Link.FullPath.Enum getFullPath();
        
        /**
         * Gets (as xml) the "full-path" attribute
         */
        com.kyt.xsd.widgetmenu.LinkDocument.Link.FullPath xgetFullPath();
        
        /**
         * True if has "full-path" attribute
         */
        boolean isSetFullPath();
        
        /**
         * Sets the "full-path" attribute
         */
        void setFullPath(com.kyt.xsd.widgetmenu.LinkDocument.Link.FullPath.Enum fullPath);
        
        /**
         * Sets (as xml) the "full-path" attribute
         */
        void xsetFullPath(com.kyt.xsd.widgetmenu.LinkDocument.Link.FullPath fullPath);
        
        /**
         * Unsets the "full-path" attribute
         */
        void unsetFullPath();
        
        /**
         * Gets the "secure" attribute
         */
        com.kyt.xsd.widgetmenu.LinkDocument.Link.Secure.Enum getSecure();
        
        /**
         * Gets (as xml) the "secure" attribute
         */
        com.kyt.xsd.widgetmenu.LinkDocument.Link.Secure xgetSecure();
        
        /**
         * True if has "secure" attribute
         */
        boolean isSetSecure();
        
        /**
         * Sets the "secure" attribute
         */
        void setSecure(com.kyt.xsd.widgetmenu.LinkDocument.Link.Secure.Enum secure);
        
        /**
         * Sets (as xml) the "secure" attribute
         */
        void xsetSecure(com.kyt.xsd.widgetmenu.LinkDocument.Link.Secure secure);
        
        /**
         * Unsets the "secure" attribute
         */
        void unsetSecure();
        
        /**
         * Gets the "encode" attribute
         */
        com.kyt.xsd.widgetmenu.LinkDocument.Link.Encode.Enum getEncode();
        
        /**
         * Gets (as xml) the "encode" attribute
         */
        com.kyt.xsd.widgetmenu.LinkDocument.Link.Encode xgetEncode();
        
        /**
         * True if has "encode" attribute
         */
        boolean isSetEncode();
        
        /**
         * Sets the "encode" attribute
         */
        void setEncode(com.kyt.xsd.widgetmenu.LinkDocument.Link.Encode.Enum encode);
        
        /**
         * Sets (as xml) the "encode" attribute
         */
        void xsetEncode(com.kyt.xsd.widgetmenu.LinkDocument.Link.Encode encode);
        
        /**
         * Unsets the "encode" attribute
         */
        void unsetEncode();
        
        /**
         * Gets the "request-confirmation" attribute
         */
        com.kyt.xsd.widgetmenu.LinkDocument.Link.RequestConfirmation.Enum getRequestConfirmation();
        
        /**
         * Gets (as xml) the "request-confirmation" attribute
         */
        com.kyt.xsd.widgetmenu.LinkDocument.Link.RequestConfirmation xgetRequestConfirmation();
        
        /**
         * True if has "request-confirmation" attribute
         */
        boolean isSetRequestConfirmation();
        
        /**
         * Sets the "request-confirmation" attribute
         */
        void setRequestConfirmation(com.kyt.xsd.widgetmenu.LinkDocument.Link.RequestConfirmation.Enum requestConfirmation);
        
        /**
         * Sets (as xml) the "request-confirmation" attribute
         */
        void xsetRequestConfirmation(com.kyt.xsd.widgetmenu.LinkDocument.Link.RequestConfirmation requestConfirmation);
        
        /**
         * Unsets the "request-confirmation" attribute
         */
        void unsetRequestConfirmation();
        
        /**
         * Gets the "confirmation-message" attribute
         */
        java.lang.String getConfirmationMessage();
        
        /**
         * Gets (as xml) the "confirmation-message" attribute
         */
        org.apache.xmlbeans.XmlString xgetConfirmationMessage();
        
        /**
         * True if has "confirmation-message" attribute
         */
        boolean isSetConfirmationMessage();
        
        /**
         * Sets the "confirmation-message" attribute
         */
        void setConfirmationMessage(java.lang.String confirmationMessage);
        
        /**
         * Sets (as xml) the "confirmation-message" attribute
         */
        void xsetConfirmationMessage(org.apache.xmlbeans.XmlString confirmationMessage);
        
        /**
         * Unsets the "confirmation-message" attribute
         */
        void unsetConfirmationMessage();
        
        /**
         * Gets the "parameters-map" attribute
         */
        java.lang.String getParametersMap();
        
        /**
         * Gets (as xml) the "parameters-map" attribute
         */
        org.apache.xmlbeans.XmlString xgetParametersMap();
        
        /**
         * True if has "parameters-map" attribute
         */
        boolean isSetParametersMap();
        
        /**
         * Sets the "parameters-map" attribute
         */
        void setParametersMap(java.lang.String parametersMap);
        
        /**
         * Sets (as xml) the "parameters-map" attribute
         */
        void xsetParametersMap(org.apache.xmlbeans.XmlString parametersMap);
        
        /**
         * Unsets the "parameters-map" attribute
         */
        void unsetParametersMap();
        
        /**
         * An XML link-type(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.LinkDocument$Link$LinkType.
         */
        public interface LinkType extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LinkType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("linktype7682attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum AUTO = Enum.forString("auto");
            static final Enum ANCHOR = Enum.forString("anchor");
            static final Enum HIDDEN_FORM = Enum.forString("hidden-form");
            
            static final int INT_AUTO = Enum.INT_AUTO;
            static final int INT_ANCHOR = Enum.INT_ANCHOR;
            static final int INT_HIDDEN_FORM = Enum.INT_HIDDEN_FORM;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.LinkDocument$Link$LinkType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_AUTO
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_AUTO = 1;
                static final int INT_ANCHOR = 2;
                static final int INT_HIDDEN_FORM = 3;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("auto", INT_AUTO),
                      new Enum("anchor", INT_ANCHOR),
                      new Enum("hidden-form", INT_HIDDEN_FORM),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.LinkType newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.LinkType) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.LinkType newInstance() {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.LinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.LinkType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.LinkType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML url-mode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.LinkDocument$Link$UrlMode.
         */
        public interface UrlMode extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UrlMode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("urlmode2c4eattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum INTRA_APP = Enum.forString("intra-app");
            static final Enum INTER_APP = Enum.forString("inter-app");
            static final Enum CONTENT = Enum.forString("content");
            static final Enum PLAIN = Enum.forString("plain");
            
            static final int INT_INTRA_APP = Enum.INT_INTRA_APP;
            static final int INT_INTER_APP = Enum.INT_INTER_APP;
            static final int INT_CONTENT = Enum.INT_CONTENT;
            static final int INT_PLAIN = Enum.INT_PLAIN;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.LinkDocument$Link$UrlMode.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_INTRA_APP
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_INTRA_APP = 1;
                static final int INT_INTER_APP = 2;
                static final int INT_CONTENT = 3;
                static final int INT_PLAIN = 4;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("intra-app", INT_INTRA_APP),
                      new Enum("inter-app", INT_INTER_APP),
                      new Enum("content", INT_CONTENT),
                      new Enum("plain", INT_PLAIN),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.UrlMode newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.UrlMode) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.UrlMode newInstance() {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.UrlMode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.UrlMode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.UrlMode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML full-path(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.LinkDocument$Link$FullPath.
         */
        public interface FullPath extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FullPath.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("fullpathe778attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.LinkDocument$Link$FullPath.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TRUE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_TRUE = 1;
                static final int INT_FALSE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.FullPath newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.FullPath) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.FullPath newInstance() {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.FullPath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.FullPath newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.FullPath) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML secure(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.LinkDocument$Link$Secure.
         */
        public interface Secure extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Secure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("secure6504attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.LinkDocument$Link$Secure.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TRUE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_TRUE = 1;
                static final int INT_FALSE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.Secure newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.Secure) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.Secure newInstance() {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.Secure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.Secure newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.Secure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML encode(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.LinkDocument$Link$Encode.
         */
        public interface Encode extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Encode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("encodec563attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.LinkDocument$Link$Encode.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TRUE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_TRUE = 1;
                static final int INT_FALSE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.Encode newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.Encode) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.Encode newInstance() {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.Encode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.Encode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.Encode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML request-confirmation(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.widgetmenu.LinkDocument$Link$RequestConfirmation.
         */
        public interface RequestConfirmation extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestConfirmation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s45601C314ADD40D42E830FEFDE601EC1").resolveHandle("requestconfirmation6e40attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.widgetmenu.LinkDocument$Link$RequestConfirmation.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_TRUE
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_TRUE = 1;
                static final int INT_FALSE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("true", INT_TRUE),
                      new Enum("false", INT_FALSE),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.RequestConfirmation newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.RequestConfirmation) type.newValue( obj ); }
                
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.RequestConfirmation newInstance() {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.RequestConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.widgetmenu.LinkDocument.Link.RequestConfirmation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.widgetmenu.LinkDocument.Link.RequestConfirmation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.widgetmenu.LinkDocument.Link newInstance() {
              return (com.kyt.xsd.widgetmenu.LinkDocument.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.widgetmenu.LinkDocument.Link newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.widgetmenu.LinkDocument.Link) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.widgetmenu.LinkDocument newInstance() {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.widgetmenu.LinkDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.widgetmenu.LinkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.widgetmenu.LinkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
