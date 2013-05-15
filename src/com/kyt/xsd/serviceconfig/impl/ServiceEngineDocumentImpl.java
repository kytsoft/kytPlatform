/*
 * An XML document type.
 * Localname: service-engine
 * Namespace: 
 * Java type: com.kyt.xsd.serviceconfig.ServiceEngineDocument
 *
 * Automatically generated - do not modify.
 */
package com.kyt.xsd.serviceconfig.impl;
/**
 * A document containing one service-engine(@) element.
 *
 * This is a complex type.
 */
public class ServiceEngineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.serviceconfig.ServiceEngineDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceEngineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEENGINE$0 = 
        new javax.xml.namespace.QName("", "service-engine");
    
    
    /**
     * Gets the "service-engine" element
     */
    public com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine getServiceEngine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine target = null;
            target = (com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine)get_store().find_element_user(SERVICEENGINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service-engine" element
     */
    public void setServiceEngine(com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine serviceEngine)
    {
        generatedSetterHelperImpl(serviceEngine, SERVICEENGINE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "service-engine" element
     */
    public com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine addNewServiceEngine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine target = null;
            target = (com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine)get_store().add_element_user(SERVICEENGINE$0);
            return target;
        }
    }
    /**
     * An XML service-engine(@).
     *
     * This is a complex type.
     */
    public static class ServiceEngineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.kyt.xsd.serviceconfig.ServiceEngineDocument.ServiceEngine
    {
        private static final long serialVersionUID = 1L;
        
        public ServiceEngineImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AUTHORIZATION$0 = 
            new javax.xml.namespace.QName("", "authorization");
        private static final javax.xml.namespace.QName THREADPOOL$2 = 
            new javax.xml.namespace.QName("", "thread-pool");
        private static final javax.xml.namespace.QName ENGINE$4 = 
            new javax.xml.namespace.QName("", "engine");
        private static final javax.xml.namespace.QName SERVICELOCATION$6 = 
            new javax.xml.namespace.QName("", "service-location");
        private static final javax.xml.namespace.QName NOTIFICATIONGROUP$8 = 
            new javax.xml.namespace.QName("", "notification-group");
        private static final javax.xml.namespace.QName STARTUPSERVICE$10 = 
            new javax.xml.namespace.QName("", "startup-service");
        private static final javax.xml.namespace.QName RESOURCELOADER$12 = 
            new javax.xml.namespace.QName("", "resource-loader");
        private static final javax.xml.namespace.QName GLOBALSERVICES$14 = 
            new javax.xml.namespace.QName("", "global-services");
        private static final javax.xml.namespace.QName SERVICEGROUPS$16 = 
            new javax.xml.namespace.QName("", "service-groups");
        private static final javax.xml.namespace.QName SERVICEECAS$18 = 
            new javax.xml.namespace.QName("", "service-ecas");
        private static final javax.xml.namespace.QName JMSSERVICE$20 = 
            new javax.xml.namespace.QName("", "jms-service");
        private static final javax.xml.namespace.QName NAME$22 = 
            new javax.xml.namespace.QName("", "name");
        
        
        /**
         * Gets the "authorization" element
         */
        public com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization getAuthorization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization target = null;
                target = (com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization)get_store().find_element_user(AUTHORIZATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "authorization" element
         */
        public void setAuthorization(com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization authorization)
        {
            generatedSetterHelperImpl(authorization, AUTHORIZATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "authorization" element
         */
        public com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization addNewAuthorization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization target = null;
                target = (com.kyt.xsd.serviceconfig.AuthorizationDocument.Authorization)get_store().add_element_user(AUTHORIZATION$0);
                return target;
            }
        }
        
        /**
         * Gets the "thread-pool" element
         */
        public com.kyt.xsd.serviceconfig.ThreadPoolDocument.ThreadPool getThreadPool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ThreadPoolDocument.ThreadPool target = null;
                target = (com.kyt.xsd.serviceconfig.ThreadPoolDocument.ThreadPool)get_store().find_element_user(THREADPOOL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "thread-pool" element
         */
        public void setThreadPool(com.kyt.xsd.serviceconfig.ThreadPoolDocument.ThreadPool threadPool)
        {
            generatedSetterHelperImpl(threadPool, THREADPOOL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "thread-pool" element
         */
        public com.kyt.xsd.serviceconfig.ThreadPoolDocument.ThreadPool addNewThreadPool()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ThreadPoolDocument.ThreadPool target = null;
                target = (com.kyt.xsd.serviceconfig.ThreadPoolDocument.ThreadPool)get_store().add_element_user(THREADPOOL$2);
                return target;
            }
        }
        
        /**
         * Gets array of all "engine" elements
         */
        public com.kyt.xsd.serviceconfig.EngineDocument.Engine[] getEngineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ENGINE$4, targetList);
                com.kyt.xsd.serviceconfig.EngineDocument.Engine[] result = new com.kyt.xsd.serviceconfig.EngineDocument.Engine[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "engine" element
         */
        public com.kyt.xsd.serviceconfig.EngineDocument.Engine getEngineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.EngineDocument.Engine target = null;
                target = (com.kyt.xsd.serviceconfig.EngineDocument.Engine)get_store().find_element_user(ENGINE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "engine" element
         */
        public int sizeOfEngineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENGINE$4);
            }
        }
        
        /**
         * Sets array of all "engine" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setEngineArray(com.kyt.xsd.serviceconfig.EngineDocument.Engine[] engineArray)
        {
            check_orphaned();
            arraySetterHelper(engineArray, ENGINE$4);
        }
        
        /**
         * Sets ith "engine" element
         */
        public void setEngineArray(int i, com.kyt.xsd.serviceconfig.EngineDocument.Engine engine)
        {
            generatedSetterHelperImpl(engine, ENGINE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "engine" element
         */
        public com.kyt.xsd.serviceconfig.EngineDocument.Engine insertNewEngine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.EngineDocument.Engine target = null;
                target = (com.kyt.xsd.serviceconfig.EngineDocument.Engine)get_store().insert_element_user(ENGINE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "engine" element
         */
        public com.kyt.xsd.serviceconfig.EngineDocument.Engine addNewEngine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.EngineDocument.Engine target = null;
                target = (com.kyt.xsd.serviceconfig.EngineDocument.Engine)get_store().add_element_user(ENGINE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "engine" element
         */
        public void removeEngine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENGINE$4, i);
            }
        }
        
        /**
         * Gets array of all "service-location" elements
         */
        public com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation[] getServiceLocationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SERVICELOCATION$6, targetList);
                com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation[] result = new com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "service-location" element
         */
        public com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation getServiceLocationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation target = null;
                target = (com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation)get_store().find_element_user(SERVICELOCATION$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "service-location" element
         */
        public int sizeOfServiceLocationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICELOCATION$6);
            }
        }
        
        /**
         * Sets array of all "service-location" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setServiceLocationArray(com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation[] serviceLocationArray)
        {
            check_orphaned();
            arraySetterHelper(serviceLocationArray, SERVICELOCATION$6);
        }
        
        /**
         * Sets ith "service-location" element
         */
        public void setServiceLocationArray(int i, com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation serviceLocation)
        {
            generatedSetterHelperImpl(serviceLocation, SERVICELOCATION$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "service-location" element
         */
        public com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation insertNewServiceLocation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation target = null;
                target = (com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation)get_store().insert_element_user(SERVICELOCATION$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "service-location" element
         */
        public com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation addNewServiceLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation target = null;
                target = (com.kyt.xsd.serviceconfig.ServiceLocationDocument.ServiceLocation)get_store().add_element_user(SERVICELOCATION$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "service-location" element
         */
        public void removeServiceLocation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICELOCATION$6, i);
            }
        }
        
        /**
         * Gets array of all "notification-group" elements
         */
        public com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup[] getNotificationGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NOTIFICATIONGROUP$8, targetList);
                com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup[] result = new com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "notification-group" element
         */
        public com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup getNotificationGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup target = null;
                target = (com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup)get_store().find_element_user(NOTIFICATIONGROUP$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "notification-group" element
         */
        public int sizeOfNotificationGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOTIFICATIONGROUP$8);
            }
        }
        
        /**
         * Sets array of all "notification-group" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNotificationGroupArray(com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup[] notificationGroupArray)
        {
            check_orphaned();
            arraySetterHelper(notificationGroupArray, NOTIFICATIONGROUP$8);
        }
        
        /**
         * Sets ith "notification-group" element
         */
        public void setNotificationGroupArray(int i, com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup notificationGroup)
        {
            generatedSetterHelperImpl(notificationGroup, NOTIFICATIONGROUP$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "notification-group" element
         */
        public com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup insertNewNotificationGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup target = null;
                target = (com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup)get_store().insert_element_user(NOTIFICATIONGROUP$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "notification-group" element
         */
        public com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup addNewNotificationGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup target = null;
                target = (com.kyt.xsd.serviceconfig.NotificationGroupDocument.NotificationGroup)get_store().add_element_user(NOTIFICATIONGROUP$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "notification-group" element
         */
        public void removeNotificationGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOTIFICATIONGROUP$8, i);
            }
        }
        
        /**
         * Gets array of all "startup-service" elements
         */
        public com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService[] getStartupServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STARTUPSERVICE$10, targetList);
                com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService[] result = new com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "startup-service" element
         */
        public com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService getStartupServiceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService target = null;
                target = (com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService)get_store().find_element_user(STARTUPSERVICE$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "startup-service" element
         */
        public int sizeOfStartupServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STARTUPSERVICE$10);
            }
        }
        
        /**
         * Sets array of all "startup-service" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setStartupServiceArray(com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService[] startupServiceArray)
        {
            check_orphaned();
            arraySetterHelper(startupServiceArray, STARTUPSERVICE$10);
        }
        
        /**
         * Sets ith "startup-service" element
         */
        public void setStartupServiceArray(int i, com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService startupService)
        {
            generatedSetterHelperImpl(startupService, STARTUPSERVICE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "startup-service" element
         */
        public com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService insertNewStartupService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService target = null;
                target = (com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService)get_store().insert_element_user(STARTUPSERVICE$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "startup-service" element
         */
        public com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService addNewStartupService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService target = null;
                target = (com.kyt.xsd.serviceconfig.StartupServiceDocument.StartupService)get_store().add_element_user(STARTUPSERVICE$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "startup-service" element
         */
        public void removeStartupService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STARTUPSERVICE$10, i);
            }
        }
        
        /**
         * Gets array of all "resource-loader" elements
         */
        public com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader[] getResourceLoaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESOURCELOADER$12, targetList);
                com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader[] result = new com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resource-loader" element
         */
        public com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader getResourceLoaderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader target = null;
                target = (com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader)get_store().find_element_user(RESOURCELOADER$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resource-loader" element
         */
        public int sizeOfResourceLoaderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCELOADER$12);
            }
        }
        
        /**
         * Sets array of all "resource-loader" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setResourceLoaderArray(com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader[] resourceLoaderArray)
        {
            check_orphaned();
            arraySetterHelper(resourceLoaderArray, RESOURCELOADER$12);
        }
        
        /**
         * Sets ith "resource-loader" element
         */
        public void setResourceLoaderArray(int i, com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader resourceLoader)
        {
            generatedSetterHelperImpl(resourceLoader, RESOURCELOADER$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resource-loader" element
         */
        public com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader insertNewResourceLoader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader target = null;
                target = (com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader)get_store().insert_element_user(RESOURCELOADER$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resource-loader" element
         */
        public com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader addNewResourceLoader()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader target = null;
                target = (com.kyt.xsd.serviceconfig.ResourceLoaderDocument.ResourceLoader)get_store().add_element_user(RESOURCELOADER$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "resource-loader" element
         */
        public void removeResourceLoader(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCELOADER$12, i);
            }
        }
        
        /**
         * Gets array of all "global-services" elements
         */
        public com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices[] getGlobalServicesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GLOBALSERVICES$14, targetList);
                com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices[] result = new com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "global-services" element
         */
        public com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices getGlobalServicesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices target = null;
                target = (com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices)get_store().find_element_user(GLOBALSERVICES$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "global-services" element
         */
        public int sizeOfGlobalServicesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GLOBALSERVICES$14);
            }
        }
        
        /**
         * Sets array of all "global-services" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setGlobalServicesArray(com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices[] globalServicesArray)
        {
            check_orphaned();
            arraySetterHelper(globalServicesArray, GLOBALSERVICES$14);
        }
        
        /**
         * Sets ith "global-services" element
         */
        public void setGlobalServicesArray(int i, com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices globalServices)
        {
            generatedSetterHelperImpl(globalServices, GLOBALSERVICES$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "global-services" element
         */
        public com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices insertNewGlobalServices(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices target = null;
                target = (com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices)get_store().insert_element_user(GLOBALSERVICES$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "global-services" element
         */
        public com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices addNewGlobalServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices target = null;
                target = (com.kyt.xsd.serviceconfig.GlobalServicesDocument.GlobalServices)get_store().add_element_user(GLOBALSERVICES$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "global-services" element
         */
        public void removeGlobalServices(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GLOBALSERVICES$14, i);
            }
        }
        
        /**
         * Gets array of all "service-groups" elements
         */
        public com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups[] getServiceGroupsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SERVICEGROUPS$16, targetList);
                com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups[] result = new com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "service-groups" element
         */
        public com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups getServiceGroupsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups target = null;
                target = (com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups)get_store().find_element_user(SERVICEGROUPS$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "service-groups" element
         */
        public int sizeOfServiceGroupsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICEGROUPS$16);
            }
        }
        
        /**
         * Sets array of all "service-groups" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setServiceGroupsArray(com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups[] serviceGroupsArray)
        {
            check_orphaned();
            arraySetterHelper(serviceGroupsArray, SERVICEGROUPS$16);
        }
        
        /**
         * Sets ith "service-groups" element
         */
        public void setServiceGroupsArray(int i, com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups serviceGroups)
        {
            generatedSetterHelperImpl(serviceGroups, SERVICEGROUPS$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "service-groups" element
         */
        public com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups insertNewServiceGroups(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups target = null;
                target = (com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups)get_store().insert_element_user(SERVICEGROUPS$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "service-groups" element
         */
        public com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups addNewServiceGroups()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups target = null;
                target = (com.kyt.xsd.serviceconfig.ServiceGroupsDocument.ServiceGroups)get_store().add_element_user(SERVICEGROUPS$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "service-groups" element
         */
        public void removeServiceGroups(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICEGROUPS$16, i);
            }
        }
        
        /**
         * Gets array of all "service-ecas" elements
         */
        public com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas[] getServiceEcasArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SERVICEECAS$18, targetList);
                com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas[] result = new com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "service-ecas" element
         */
        public com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas getServiceEcasArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas target = null;
                target = (com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas)get_store().find_element_user(SERVICEECAS$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "service-ecas" element
         */
        public int sizeOfServiceEcasArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICEECAS$18);
            }
        }
        
        /**
         * Sets array of all "service-ecas" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setServiceEcasArray(com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas[] serviceEcasArray)
        {
            check_orphaned();
            arraySetterHelper(serviceEcasArray, SERVICEECAS$18);
        }
        
        /**
         * Sets ith "service-ecas" element
         */
        public void setServiceEcasArray(int i, com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas serviceEcas)
        {
            generatedSetterHelperImpl(serviceEcas, SERVICEECAS$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "service-ecas" element
         */
        public com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas insertNewServiceEcas(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas target = null;
                target = (com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas)get_store().insert_element_user(SERVICEECAS$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "service-ecas" element
         */
        public com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas addNewServiceEcas()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas target = null;
                target = (com.kyt.xsd.serviceconfig.ServiceEcasDocument.ServiceEcas)get_store().add_element_user(SERVICEECAS$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "service-ecas" element
         */
        public void removeServiceEcas(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICEECAS$18, i);
            }
        }
        
        /**
         * Gets array of all "jms-service" elements
         */
        public com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService[] getJmsServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(JMSSERVICE$20, targetList);
                com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService[] result = new com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "jms-service" element
         */
        public com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService getJmsServiceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService target = null;
                target = (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService)get_store().find_element_user(JMSSERVICE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "jms-service" element
         */
        public int sizeOfJmsServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(JMSSERVICE$20);
            }
        }
        
        /**
         * Sets array of all "jms-service" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setJmsServiceArray(com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService[] jmsServiceArray)
        {
            check_orphaned();
            arraySetterHelper(jmsServiceArray, JMSSERVICE$20);
        }
        
        /**
         * Sets ith "jms-service" element
         */
        public void setJmsServiceArray(int i, com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService jmsService)
        {
            generatedSetterHelperImpl(jmsService, JMSSERVICE$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "jms-service" element
         */
        public com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService insertNewJmsService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService target = null;
                target = (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService)get_store().insert_element_user(JMSSERVICE$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "jms-service" element
         */
        public com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService addNewJmsService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService target = null;
                target = (com.kyt.xsd.serviceconfig.JmsServiceDocument.JmsService)get_store().add_element_user(JMSSERVICE$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "jms-service" element
         */
        public void removeJmsService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(JMSSERVICE$20, i);
            }
        }
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$22);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$22);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$22);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$22);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$22);
                }
                target.set(name);
            }
        }
    }
}
