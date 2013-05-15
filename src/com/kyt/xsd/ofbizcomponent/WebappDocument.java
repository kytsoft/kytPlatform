/*
 * An XML document type.
 * Localname: webapp
 * Namespace: 
 * Java type: com.kyt.xsd.ofbizcomponent.WebappDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.ofbizcomponent;


/**
 * A document containing one webapp(@) element.
 *
 * This is a complex type.
 */
public interface WebappDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WebappDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s687A08F778A9610EDD21673788D906F2").resolveHandle("webapp0806doctype");
    
    /**
     * Gets the "webapp" element
     */
    com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp getWebapp();
    
    /**
     * Sets the "webapp" element
     */
    void setWebapp(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp webapp);
    
    /**
     * Appends and returns a new empty "webapp" element
     */
    com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp addNewWebapp();
    
    /**
     * An XML webapp(@).
     *
     * This is a complex type.
     */
    public interface Webapp extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Webapp.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s687A08F778A9610EDD21673788D906F2").resolveHandle("webapp294delemtype");
        
        /**
         * Gets array of all "virtual-host" elements
         */
        com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost[] getVirtualHostArray();
        
        /**
         * Gets ith "virtual-host" element
         */
        com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost getVirtualHostArray(int i);
        
        /**
         * Returns number of "virtual-host" element
         */
        int sizeOfVirtualHostArray();
        
        /**
         * Sets array of all "virtual-host" element
         */
        void setVirtualHostArray(com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost[] virtualHostArray);
        
        /**
         * Sets ith "virtual-host" element
         */
        void setVirtualHostArray(int i, com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost virtualHost);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "virtual-host" element
         */
        com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost insertNewVirtualHost(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "virtual-host" element
         */
        com.kyt.xsd.ofbizcomponent.VirtualHostDocument.VirtualHost addNewVirtualHost();
        
        /**
         * Removes the ith "virtual-host" element
         */
        void removeVirtualHost(int i);
        
        /**
         * Gets array of all "init-param" elements
         */
        com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam[] getInitParamArray();
        
        /**
         * Gets ith "init-param" element
         */
        com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam getInitParamArray(int i);
        
        /**
         * Returns number of "init-param" element
         */
        int sizeOfInitParamArray();
        
        /**
         * Sets array of all "init-param" element
         */
        void setInitParamArray(com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam[] initParamArray);
        
        /**
         * Sets ith "init-param" element
         */
        void setInitParamArray(int i, com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam initParam);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "init-param" element
         */
        com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam insertNewInitParam(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "init-param" element
         */
        com.kyt.xsd.ofbizcomponent.InitParamDocument.InitParam addNewInitParam();
        
        /**
         * Removes the ith "init-param" element
         */
        void removeInitParam(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "title" attribute
         */
        java.lang.String getTitle();
        
        /**
         * Gets (as xml) the "title" attribute
         */
        org.apache.xmlbeans.XmlString xgetTitle();
        
        /**
         * True if has "title" attribute
         */
        boolean isSetTitle();
        
        /**
         * Sets the "title" attribute
         */
        void setTitle(java.lang.String title);
        
        /**
         * Sets (as xml) the "title" attribute
         */
        void xsetTitle(org.apache.xmlbeans.XmlString title);
        
        /**
         * Unsets the "title" attribute
         */
        void unsetTitle();
        
        /**
         * Gets the "description" attribute
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" attribute
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * True if has "description" attribute
         */
        boolean isSetDescription();
        
        /**
         * Sets the "description" attribute
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" attribute
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Unsets the "description" attribute
         */
        void unsetDescription();
        
        /**
         * Gets the "menu-name" attribute
         */
        com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName.Enum getMenuName();
        
        /**
         * Gets (as xml) the "menu-name" attribute
         */
        com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName xgetMenuName();
        
        /**
         * True if has "menu-name" attribute
         */
        boolean isSetMenuName();
        
        /**
         * Sets the "menu-name" attribute
         */
        void setMenuName(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName.Enum menuName);
        
        /**
         * Sets (as xml) the "menu-name" attribute
         */
        void xsetMenuName(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName menuName);
        
        /**
         * Unsets the "menu-name" attribute
         */
        void unsetMenuName();
        
        /**
         * Gets the "position" attribute
         */
        java.lang.String getPosition();
        
        /**
         * Gets (as xml) the "position" attribute
         */
        org.apache.xmlbeans.XmlString xgetPosition();
        
        /**
         * True if has "position" attribute
         */
        boolean isSetPosition();
        
        /**
         * Sets the "position" attribute
         */
        void setPosition(java.lang.String position);
        
        /**
         * Sets (as xml) the "position" attribute
         */
        void xsetPosition(org.apache.xmlbeans.XmlString position);
        
        /**
         * Unsets the "position" attribute
         */
        void unsetPosition();
        
        /**
         * Gets the "server" attribute
         */
        java.lang.String getServer();
        
        /**
         * Gets (as xml) the "server" attribute
         */
        org.apache.xmlbeans.XmlString xgetServer();
        
        /**
         * Sets the "server" attribute
         */
        void setServer(java.lang.String server);
        
        /**
         * Sets (as xml) the "server" attribute
         */
        void xsetServer(org.apache.xmlbeans.XmlString server);
        
        /**
         * Gets the "location" attribute
         */
        java.lang.String getLocation();
        
        /**
         * Gets (as xml) the "location" attribute
         */
        org.apache.xmlbeans.XmlString xgetLocation();
        
        /**
         * Sets the "location" attribute
         */
        void setLocation(java.lang.String location);
        
        /**
         * Sets (as xml) the "location" attribute
         */
        void xsetLocation(org.apache.xmlbeans.XmlString location);
        
        /**
         * Gets the "mount-point" attribute
         */
        java.lang.String getMountPoint();
        
        /**
         * Gets (as xml) the "mount-point" attribute
         */
        org.apache.xmlbeans.XmlString xgetMountPoint();
        
        /**
         * True if has "mount-point" attribute
         */
        boolean isSetMountPoint();
        
        /**
         * Sets the "mount-point" attribute
         */
        void setMountPoint(java.lang.String mountPoint);
        
        /**
         * Sets (as xml) the "mount-point" attribute
         */
        void xsetMountPoint(org.apache.xmlbeans.XmlString mountPoint);
        
        /**
         * Unsets the "mount-point" attribute
         */
        void unsetMountPoint();
        
        /**
         * Gets the "base-permission" attribute
         */
        java.lang.String getBasePermission();
        
        /**
         * Gets (as xml) the "base-permission" attribute
         */
        org.apache.xmlbeans.XmlString xgetBasePermission();
        
        /**
         * True if has "base-permission" attribute
         */
        boolean isSetBasePermission();
        
        /**
         * Sets the "base-permission" attribute
         */
        void setBasePermission(java.lang.String basePermission);
        
        /**
         * Sets (as xml) the "base-permission" attribute
         */
        void xsetBasePermission(org.apache.xmlbeans.XmlString basePermission);
        
        /**
         * Unsets the "base-permission" attribute
         */
        void unsetBasePermission();
        
        /**
         * Gets the "privileged" attribute
         */
        com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged.Enum getPrivileged();
        
        /**
         * Gets (as xml) the "privileged" attribute
         */
        com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged xgetPrivileged();
        
        /**
         * True if has "privileged" attribute
         */
        boolean isSetPrivileged();
        
        /**
         * Sets the "privileged" attribute
         */
        void setPrivileged(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged.Enum privileged);
        
        /**
         * Sets (as xml) the "privileged" attribute
         */
        void xsetPrivileged(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged privileged);
        
        /**
         * Unsets the "privileged" attribute
         */
        void unsetPrivileged();
        
        /**
         * Gets the "app-bar-display" attribute
         */
        com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay.Enum getAppBarDisplay();
        
        /**
         * Gets (as xml) the "app-bar-display" attribute
         */
        com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay xgetAppBarDisplay();
        
        /**
         * True if has "app-bar-display" attribute
         */
        boolean isSetAppBarDisplay();
        
        /**
         * Sets the "app-bar-display" attribute
         */
        void setAppBarDisplay(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay.Enum appBarDisplay);
        
        /**
         * Sets (as xml) the "app-bar-display" attribute
         */
        void xsetAppBarDisplay(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay appBarDisplay);
        
        /**
         * Unsets the "app-bar-display" attribute
         */
        void unsetAppBarDisplay();
        
        /**
         * Gets the "session-cookie-accepted" attribute
         */
        com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted.Enum getSessionCookieAccepted();
        
        /**
         * Gets (as xml) the "session-cookie-accepted" attribute
         */
        com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted xgetSessionCookieAccepted();
        
        /**
         * True if has "session-cookie-accepted" attribute
         */
        boolean isSetSessionCookieAccepted();
        
        /**
         * Sets the "session-cookie-accepted" attribute
         */
        void setSessionCookieAccepted(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted.Enum sessionCookieAccepted);
        
        /**
         * Sets (as xml) the "session-cookie-accepted" attribute
         */
        void xsetSessionCookieAccepted(com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted sessionCookieAccepted);
        
        /**
         * Unsets the "session-cookie-accepted" attribute
         */
        void unsetSessionCookieAccepted();
        
        /**
         * An XML menu-name(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.ofbizcomponent.WebappDocument$Webapp$MenuName.
         */
        public interface MenuName extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MenuName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s687A08F778A9610EDD21673788D906F2").resolveHandle("menunamec4aeattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum MAIN = Enum.forString("main");
            static final Enum SECONDARY = Enum.forString("secondary");
            
            static final int INT_MAIN = Enum.INT_MAIN;
            static final int INT_SECONDARY = Enum.INT_SECONDARY;
            
            /**
             * Enumeration value class for com.kyt.xsd.ofbizcomponent.WebappDocument$Webapp$MenuName.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_MAIN
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
                
                static final int INT_MAIN = 1;
                static final int INT_SECONDARY = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("main", INT_MAIN),
                      new Enum("secondary", INT_SECONDARY),
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
                public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName) type.newValue( obj ); }
                
                public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName newInstance() {
                  return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.MenuName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML privileged(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.ofbizcomponent.WebappDocument$Webapp$Privileged.
         */
        public interface Privileged extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Privileged.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s687A08F778A9610EDD21673788D906F2").resolveHandle("privileged6780attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.ofbizcomponent.WebappDocument$Webapp$Privileged.
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
                public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged) type.newValue( obj ); }
                
                public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged newInstance() {
                  return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.Privileged) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML app-bar-display(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.ofbizcomponent.WebappDocument$Webapp$AppBarDisplay.
         */
        public interface AppBarDisplay extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AppBarDisplay.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s687A08F778A9610EDD21673788D906F2").resolveHandle("appbardisplay9411attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.ofbizcomponent.WebappDocument$Webapp$AppBarDisplay.
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
                public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay) type.newValue( obj ); }
                
                public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay newInstance() {
                  return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.AppBarDisplay) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML session-cookie-accepted(@).
         *
         * This is an atomic type that is a restriction of com.kyt.xsd.ofbizcomponent.WebappDocument$Webapp$SessionCookieAccepted.
         */
        public interface SessionCookieAccepted extends org.apache.xmlbeans.XmlToken
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SessionCookieAccepted.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s687A08F778A9610EDD21673788D906F2").resolveHandle("sessioncookieaccepted7b2eattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum TRUE = Enum.forString("true");
            static final Enum FALSE = Enum.forString("false");
            
            static final int INT_TRUE = Enum.INT_TRUE;
            static final int INT_FALSE = Enum.INT_FALSE;
            
            /**
             * Enumeration value class for com.kyt.xsd.ofbizcomponent.WebappDocument$Webapp$SessionCookieAccepted.
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
                public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted newValue(java.lang.Object obj) {
                  return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted) type.newValue( obj ); }
                
                public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted newInstance() {
                  return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp.SessionCookieAccepted) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp newInstance() {
              return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.kyt.xsd.ofbizcomponent.WebappDocument.Webapp) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.kyt.xsd.ofbizcomponent.WebappDocument newInstance() {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.WebappDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.kyt.xsd.ofbizcomponent.WebappDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.kyt.xsd.ofbizcomponent.WebappDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
