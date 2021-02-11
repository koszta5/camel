/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.MainConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MainConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.MainConfigurationProperties target = (org.apache.camel.main.MainConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowuseoriginalmessage":
        case "AllowUseOriginalMessage": target.setAllowUseOriginalMessage(property(camelContext, boolean.class, value)); return true;
        case "autoconfigurationenabled":
        case "AutoConfigurationEnabled": target.setAutoConfigurationEnabled(property(camelContext, boolean.class, value)); return true;
        case "autoconfigurationenvironmentvariablesenabled":
        case "AutoConfigurationEnvironmentVariablesEnabled": target.setAutoConfigurationEnvironmentVariablesEnabled(property(camelContext, boolean.class, value)); return true;
        case "autoconfigurationfailfast":
        case "AutoConfigurationFailFast": target.setAutoConfigurationFailFast(property(camelContext, boolean.class, value)); return true;
        case "autoconfigurationlogsummary":
        case "AutoConfigurationLogSummary": target.setAutoConfigurationLogSummary(property(camelContext, boolean.class, value)); return true;
        case "autoconfigurationsystempropertiesenabled":
        case "AutoConfigurationSystemPropertiesEnabled": target.setAutoConfigurationSystemPropertiesEnabled(property(camelContext, boolean.class, value)); return true;
        case "autostartup":
        case "AutoStartup": target.setAutoStartup(property(camelContext, boolean.class, value)); return true;
        case "autowiredenabled":
        case "AutowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "backlogtracing":
        case "BacklogTracing": target.setBacklogTracing(property(camelContext, boolean.class, value)); return true;
        case "beanintrospectionextendedstatistics":
        case "BeanIntrospectionExtendedStatistics": target.setBeanIntrospectionExtendedStatistics(property(camelContext, boolean.class, value)); return true;
        case "beanintrospectionlogginglevel":
        case "BeanIntrospectionLoggingLevel": target.setBeanIntrospectionLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "beanpostprocessorenabled":
        case "BeanPostProcessorEnabled": target.setBeanPostProcessorEnabled(property(camelContext, boolean.class, value)); return true;
        case "caseinsensitiveheaders":
        case "CaseInsensitiveHeaders": target.setCaseInsensitiveHeaders(property(camelContext, boolean.class, value)); return true;
        case "configurationclasses":
        case "ConfigurationClasses": target.setConfigurationClasses(property(camelContext, java.lang.String.class, value)); return true;
        case "configurations":
        case "Configurations": target.setConfigurations(property(camelContext, java.util.List.class, value)); return true;
        case "consumertemplatecachesize":
        case "ConsumerTemplateCacheSize": target.setConsumerTemplateCacheSize(property(camelContext, int.class, value)); return true;
        case "durationhitexitcode":
        case "DurationHitExitCode": target.setDurationHitExitCode(property(camelContext, int.class, value)); return true;
        case "durationmaxidleseconds":
        case "DurationMaxIdleSeconds": target.setDurationMaxIdleSeconds(property(camelContext, int.class, value)); return true;
        case "durationmaxmessages":
        case "DurationMaxMessages": target.setDurationMaxMessages(property(camelContext, int.class, value)); return true;
        case "durationmaxseconds":
        case "DurationMaxSeconds": target.setDurationMaxSeconds(property(camelContext, int.class, value)); return true;
        case "endpointbridgeerrorhandler":
        case "EndpointBridgeErrorHandler": target.setEndpointBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "endpointlazystartproducer":
        case "EndpointLazyStartProducer": target.setEndpointLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "endpointruntimestatisticsenabled":
        case "EndpointRuntimeStatisticsEnabled": target.setEndpointRuntimeStatisticsEnabled(property(camelContext, boolean.class, value)); return true;
        case "fileconfigurations":
        case "FileConfigurations": target.setFileConfigurations(property(camelContext, java.lang.String.class, value)); return true;
        case "inflightrepositorybrowseenabled":
        case "InflightRepositoryBrowseEnabled": target.setInflightRepositoryBrowseEnabled(property(camelContext, boolean.class, value)); return true;
        case "javaroutesexcludepattern":
        case "JavaRoutesExcludePattern": target.setJavaRoutesExcludePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "javaroutesincludepattern":
        case "JavaRoutesIncludePattern": target.setJavaRoutesIncludePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "jmxenabled":
        case "JmxEnabled": target.setJmxEnabled(property(camelContext, boolean.class, value)); return true;
        case "jmxmanagementnamepattern":
        case "JmxManagementNamePattern": target.setJmxManagementNamePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "jmxmanagementstatisticslevel":
        case "JmxManagementStatisticsLevel": target.setJmxManagementStatisticsLevel(property(camelContext, org.apache.camel.ManagementStatisticsLevel.class, value)); return true;
        case "lightweight":
        case "Lightweight": target.setLightweight(property(camelContext, boolean.class, value)); return true;
        case "loadtypeconverters":
        case "LoadTypeConverters": target.setLoadTypeConverters(property(camelContext, boolean.class, value)); return true;
        case "logdebugmaxchars":
        case "LogDebugMaxChars": target.setLogDebugMaxChars(property(camelContext, int.class, value)); return true;
        case "logexhaustedmessagebody":
        case "LogExhaustedMessageBody": target.setLogExhaustedMessageBody(property(camelContext, boolean.class, value)); return true;
        case "logmask":
        case "LogMask": target.setLogMask(property(camelContext, boolean.class, value)); return true;
        case "mdcloggingkeyspattern":
        case "MdcLoggingKeysPattern": target.setMdcLoggingKeysPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "messagehistory":
        case "MessageHistory": target.setMessageHistory(property(camelContext, boolean.class, value)); return true;
        case "name":
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
        case "packagescanroutebuilders":
        case "PackageScanRouteBuilders": target.setPackageScanRouteBuilders(property(camelContext, java.lang.String.class, value)); return true;
        case "producertemplatecachesize":
        case "ProducerTemplateCacheSize": target.setProducerTemplateCacheSize(property(camelContext, int.class, value)); return true;
        case "routecontrollerbackoffdelay":
        case "RouteControllerBackOffDelay": target.setRouteControllerBackOffDelay(property(camelContext, long.class, value)); return true;
        case "routecontrollerbackoffmaxattempts":
        case "RouteControllerBackOffMaxAttempts": target.setRouteControllerBackOffMaxAttempts(property(camelContext, long.class, value)); return true;
        case "routecontrollerbackoffmaxdelay":
        case "RouteControllerBackOffMaxDelay": target.setRouteControllerBackOffMaxDelay(property(camelContext, long.class, value)); return true;
        case "routecontrollerbackoffmaxelapsedtime":
        case "RouteControllerBackOffMaxElapsedTime": target.setRouteControllerBackOffMaxElapsedTime(property(camelContext, long.class, value)); return true;
        case "routecontrollerbackoffmultiplier":
        case "RouteControllerBackOffMultiplier": target.setRouteControllerBackOffMultiplier(property(camelContext, double.class, value)); return true;
        case "routecontrollerexcluderoutes":
        case "RouteControllerExcludeRoutes": target.setRouteControllerExcludeRoutes(property(camelContext, java.lang.String.class, value)); return true;
        case "routecontrollerincluderoutes":
        case "RouteControllerIncludeRoutes": target.setRouteControllerIncludeRoutes(property(camelContext, java.lang.String.class, value)); return true;
        case "routecontrollerinitialdelay":
        case "RouteControllerInitialDelay": target.setRouteControllerInitialDelay(property(camelContext, long.class, value)); return true;
        case "routecontrollerlogginglevel":
        case "RouteControllerLoggingLevel": target.setRouteControllerLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "routecontrollersuperviseenabled":
        case "RouteControllerSuperviseEnabled": target.setRouteControllerSuperviseEnabled(property(camelContext, boolean.class, value)); return true;
        case "routecontrollerthreadpoolsize":
        case "RouteControllerThreadPoolSize": target.setRouteControllerThreadPoolSize(property(camelContext, int.class, value)); return true;
        case "routecontrollerunhealthyonexhausted":
        case "RouteControllerUnhealthyOnExhausted": target.setRouteControllerUnhealthyOnExhausted(property(camelContext, boolean.class, value)); return true;
        case "routefilterexcludepattern":
        case "RouteFilterExcludePattern": target.setRouteFilterExcludePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "routefilterincludepattern":
        case "RouteFilterIncludePattern": target.setRouteFilterIncludePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "routesbuilderclasses":
        case "RoutesBuilderClasses": target.setRoutesBuilderClasses(property(camelContext, java.lang.String.class, value)); return true;
        case "routesbuilders":
        case "RoutesBuilders": target.setRoutesBuilders(property(camelContext, java.util.List.class, value)); return true;
        case "routescollectorenabled":
        case "RoutesCollectorEnabled": target.setRoutesCollectorEnabled(property(camelContext, boolean.class, value)); return true;
        case "routesexcludepattern":
        case "RoutesExcludePattern": target.setRoutesExcludePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "routesincludepattern":
        case "RoutesIncludePattern": target.setRoutesIncludePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "shutdownloginflightexchangesontimeout":
        case "ShutdownLogInflightExchangesOnTimeout": target.setShutdownLogInflightExchangesOnTimeout(property(camelContext, boolean.class, value)); return true;
        case "shutdownnowontimeout":
        case "ShutdownNowOnTimeout": target.setShutdownNowOnTimeout(property(camelContext, boolean.class, value)); return true;
        case "shutdownroutesinreverseorder":
        case "ShutdownRoutesInReverseOrder": target.setShutdownRoutesInReverseOrder(property(camelContext, boolean.class, value)); return true;
        case "shutdownsuppressloggingontimeout":
        case "ShutdownSuppressLoggingOnTimeout": target.setShutdownSuppressLoggingOnTimeout(property(camelContext, boolean.class, value)); return true;
        case "shutdowntimeout":
        case "ShutdownTimeout": target.setShutdownTimeout(property(camelContext, int.class, value)); return true;
        case "startuprecorder":
        case "StartupRecorder": target.setStartupRecorder(property(camelContext, java.lang.String.class, value)); return true;
        case "startuprecorderdir":
        case "StartupRecorderDir": target.setStartupRecorderDir(property(camelContext, java.lang.String.class, value)); return true;
        case "startuprecorderduration":
        case "StartupRecorderDuration": target.setStartupRecorderDuration(property(camelContext, long.class, value)); return true;
        case "startuprecordermaxdepth":
        case "StartupRecorderMaxDepth": target.setStartupRecorderMaxDepth(property(camelContext, int.class, value)); return true;
        case "startuprecorderprofile":
        case "StartupRecorderProfile": target.setStartupRecorderProfile(property(camelContext, java.lang.String.class, value)); return true;
        case "startuprecorderrecording":
        case "StartupRecorderRecording": target.setStartupRecorderRecording(property(camelContext, boolean.class, value)); return true;
        case "startupsummarylevel":
        case "StartupSummaryLevel": target.setStartupSummaryLevel(property(camelContext, org.apache.camel.StartupSummaryLevel.class, value)); return true;
        case "streamcachinganyspoolrules":
        case "StreamCachingAnySpoolRules": target.setStreamCachingAnySpoolRules(property(camelContext, boolean.class, value)); return true;
        case "streamcachingbuffersize":
        case "StreamCachingBufferSize": target.setStreamCachingBufferSize(property(camelContext, int.class, value)); return true;
        case "streamcachingenabled":
        case "StreamCachingEnabled": target.setStreamCachingEnabled(property(camelContext, boolean.class, value)); return true;
        case "streamcachingremovespooldirectorywhenstopping":
        case "StreamCachingRemoveSpoolDirectoryWhenStopping": target.setStreamCachingRemoveSpoolDirectoryWhenStopping(property(camelContext, boolean.class, value)); return true;
        case "streamcachingspoolcipher":
        case "StreamCachingSpoolCipher": target.setStreamCachingSpoolCipher(property(camelContext, java.lang.String.class, value)); return true;
        case "streamcachingspooldirectory":
        case "StreamCachingSpoolDirectory": target.setStreamCachingSpoolDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "streamcachingspoolthreshold":
        case "StreamCachingSpoolThreshold": target.setStreamCachingSpoolThreshold(property(camelContext, long.class, value)); return true;
        case "streamcachingspoolusedheapmemorylimit":
        case "StreamCachingSpoolUsedHeapMemoryLimit": target.setStreamCachingSpoolUsedHeapMemoryLimit(property(camelContext, java.lang.String.class, value)); return true;
        case "streamcachingspoolusedheapmemorythreshold":
        case "StreamCachingSpoolUsedHeapMemoryThreshold": target.setStreamCachingSpoolUsedHeapMemoryThreshold(property(camelContext, int.class, value)); return true;
        case "streamcachingstatisticsenabled":
        case "StreamCachingStatisticsEnabled": target.setStreamCachingStatisticsEnabled(property(camelContext, boolean.class, value)); return true;
        case "threadnamepattern":
        case "ThreadNamePattern": target.setThreadNamePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "tracing":
        case "Tracing": target.setTracing(property(camelContext, boolean.class, value)); return true;
        case "tracingpattern":
        case "TracingPattern": target.setTracingPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "usebreadcrumb":
        case "UseBreadcrumb": target.setUseBreadcrumb(property(camelContext, boolean.class, value)); return true;
        case "usedatatype":
        case "UseDataType": target.setUseDataType(property(camelContext, boolean.class, value)); return true;
        case "usemdclogging":
        case "UseMdcLogging": target.setUseMdcLogging(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowuseoriginalmessage":
        case "AllowUseOriginalMessage": return boolean.class;
        case "autoconfigurationenabled":
        case "AutoConfigurationEnabled": return boolean.class;
        case "autoconfigurationenvironmentvariablesenabled":
        case "AutoConfigurationEnvironmentVariablesEnabled": return boolean.class;
        case "autoconfigurationfailfast":
        case "AutoConfigurationFailFast": return boolean.class;
        case "autoconfigurationlogsummary":
        case "AutoConfigurationLogSummary": return boolean.class;
        case "autoconfigurationsystempropertiesenabled":
        case "AutoConfigurationSystemPropertiesEnabled": return boolean.class;
        case "autostartup":
        case "AutoStartup": return boolean.class;
        case "autowiredenabled":
        case "AutowiredEnabled": return boolean.class;
        case "backlogtracing":
        case "BacklogTracing": return boolean.class;
        case "beanintrospectionextendedstatistics":
        case "BeanIntrospectionExtendedStatistics": return boolean.class;
        case "beanintrospectionlogginglevel":
        case "BeanIntrospectionLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "beanpostprocessorenabled":
        case "BeanPostProcessorEnabled": return boolean.class;
        case "caseinsensitiveheaders":
        case "CaseInsensitiveHeaders": return boolean.class;
        case "configurationclasses":
        case "ConfigurationClasses": return java.lang.String.class;
        case "configurations":
        case "Configurations": return java.util.List.class;
        case "consumertemplatecachesize":
        case "ConsumerTemplateCacheSize": return int.class;
        case "durationhitexitcode":
        case "DurationHitExitCode": return int.class;
        case "durationmaxidleseconds":
        case "DurationMaxIdleSeconds": return int.class;
        case "durationmaxmessages":
        case "DurationMaxMessages": return int.class;
        case "durationmaxseconds":
        case "DurationMaxSeconds": return int.class;
        case "endpointbridgeerrorhandler":
        case "EndpointBridgeErrorHandler": return boolean.class;
        case "endpointlazystartproducer":
        case "EndpointLazyStartProducer": return boolean.class;
        case "endpointruntimestatisticsenabled":
        case "EndpointRuntimeStatisticsEnabled": return boolean.class;
        case "fileconfigurations":
        case "FileConfigurations": return java.lang.String.class;
        case "inflightrepositorybrowseenabled":
        case "InflightRepositoryBrowseEnabled": return boolean.class;
        case "javaroutesexcludepattern":
        case "JavaRoutesExcludePattern": return java.lang.String.class;
        case "javaroutesincludepattern":
        case "JavaRoutesIncludePattern": return java.lang.String.class;
        case "jmxenabled":
        case "JmxEnabled": return boolean.class;
        case "jmxmanagementnamepattern":
        case "JmxManagementNamePattern": return java.lang.String.class;
        case "jmxmanagementstatisticslevel":
        case "JmxManagementStatisticsLevel": return org.apache.camel.ManagementStatisticsLevel.class;
        case "lightweight":
        case "Lightweight": return boolean.class;
        case "loadtypeconverters":
        case "LoadTypeConverters": return boolean.class;
        case "logdebugmaxchars":
        case "LogDebugMaxChars": return int.class;
        case "logexhaustedmessagebody":
        case "LogExhaustedMessageBody": return boolean.class;
        case "logmask":
        case "LogMask": return boolean.class;
        case "mdcloggingkeyspattern":
        case "MdcLoggingKeysPattern": return java.lang.String.class;
        case "messagehistory":
        case "MessageHistory": return boolean.class;
        case "name":
        case "Name": return java.lang.String.class;
        case "packagescanroutebuilders":
        case "PackageScanRouteBuilders": return java.lang.String.class;
        case "producertemplatecachesize":
        case "ProducerTemplateCacheSize": return int.class;
        case "routecontrollerbackoffdelay":
        case "RouteControllerBackOffDelay": return long.class;
        case "routecontrollerbackoffmaxattempts":
        case "RouteControllerBackOffMaxAttempts": return long.class;
        case "routecontrollerbackoffmaxdelay":
        case "RouteControllerBackOffMaxDelay": return long.class;
        case "routecontrollerbackoffmaxelapsedtime":
        case "RouteControllerBackOffMaxElapsedTime": return long.class;
        case "routecontrollerbackoffmultiplier":
        case "RouteControllerBackOffMultiplier": return double.class;
        case "routecontrollerexcluderoutes":
        case "RouteControllerExcludeRoutes": return java.lang.String.class;
        case "routecontrollerincluderoutes":
        case "RouteControllerIncludeRoutes": return java.lang.String.class;
        case "routecontrollerinitialdelay":
        case "RouteControllerInitialDelay": return long.class;
        case "routecontrollerlogginglevel":
        case "RouteControllerLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "routecontrollersuperviseenabled":
        case "RouteControllerSuperviseEnabled": return boolean.class;
        case "routecontrollerthreadpoolsize":
        case "RouteControllerThreadPoolSize": return int.class;
        case "routecontrollerunhealthyonexhausted":
        case "RouteControllerUnhealthyOnExhausted": return boolean.class;
        case "routefilterexcludepattern":
        case "RouteFilterExcludePattern": return java.lang.String.class;
        case "routefilterincludepattern":
        case "RouteFilterIncludePattern": return java.lang.String.class;
        case "routesbuilderclasses":
        case "RoutesBuilderClasses": return java.lang.String.class;
        case "routesbuilders":
        case "RoutesBuilders": return java.util.List.class;
        case "routescollectorenabled":
        case "RoutesCollectorEnabled": return boolean.class;
        case "routesexcludepattern":
        case "RoutesExcludePattern": return java.lang.String.class;
        case "routesincludepattern":
        case "RoutesIncludePattern": return java.lang.String.class;
        case "shutdownloginflightexchangesontimeout":
        case "ShutdownLogInflightExchangesOnTimeout": return boolean.class;
        case "shutdownnowontimeout":
        case "ShutdownNowOnTimeout": return boolean.class;
        case "shutdownroutesinreverseorder":
        case "ShutdownRoutesInReverseOrder": return boolean.class;
        case "shutdownsuppressloggingontimeout":
        case "ShutdownSuppressLoggingOnTimeout": return boolean.class;
        case "shutdowntimeout":
        case "ShutdownTimeout": return int.class;
        case "startuprecorder":
        case "StartupRecorder": return java.lang.String.class;
        case "startuprecorderdir":
        case "StartupRecorderDir": return java.lang.String.class;
        case "startuprecorderduration":
        case "StartupRecorderDuration": return long.class;
        case "startuprecordermaxdepth":
        case "StartupRecorderMaxDepth": return int.class;
        case "startuprecorderprofile":
        case "StartupRecorderProfile": return java.lang.String.class;
        case "startuprecorderrecording":
        case "StartupRecorderRecording": return boolean.class;
        case "startupsummarylevel":
        case "StartupSummaryLevel": return org.apache.camel.StartupSummaryLevel.class;
        case "streamcachinganyspoolrules":
        case "StreamCachingAnySpoolRules": return boolean.class;
        case "streamcachingbuffersize":
        case "StreamCachingBufferSize": return int.class;
        case "streamcachingenabled":
        case "StreamCachingEnabled": return boolean.class;
        case "streamcachingremovespooldirectorywhenstopping":
        case "StreamCachingRemoveSpoolDirectoryWhenStopping": return boolean.class;
        case "streamcachingspoolcipher":
        case "StreamCachingSpoolCipher": return java.lang.String.class;
        case "streamcachingspooldirectory":
        case "StreamCachingSpoolDirectory": return java.lang.String.class;
        case "streamcachingspoolthreshold":
        case "StreamCachingSpoolThreshold": return long.class;
        case "streamcachingspoolusedheapmemorylimit":
        case "StreamCachingSpoolUsedHeapMemoryLimit": return java.lang.String.class;
        case "streamcachingspoolusedheapmemorythreshold":
        case "StreamCachingSpoolUsedHeapMemoryThreshold": return int.class;
        case "streamcachingstatisticsenabled":
        case "StreamCachingStatisticsEnabled": return boolean.class;
        case "threadnamepattern":
        case "ThreadNamePattern": return java.lang.String.class;
        case "tracing":
        case "Tracing": return boolean.class;
        case "tracingpattern":
        case "TracingPattern": return java.lang.String.class;
        case "usebreadcrumb":
        case "UseBreadcrumb": return boolean.class;
        case "usedatatype":
        case "UseDataType": return boolean.class;
        case "usemdclogging":
        case "UseMdcLogging": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.MainConfigurationProperties target = (org.apache.camel.main.MainConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowuseoriginalmessage":
        case "AllowUseOriginalMessage": return target.isAllowUseOriginalMessage();
        case "autoconfigurationenabled":
        case "AutoConfigurationEnabled": return target.isAutoConfigurationEnabled();
        case "autoconfigurationenvironmentvariablesenabled":
        case "AutoConfigurationEnvironmentVariablesEnabled": return target.isAutoConfigurationEnvironmentVariablesEnabled();
        case "autoconfigurationfailfast":
        case "AutoConfigurationFailFast": return target.isAutoConfigurationFailFast();
        case "autoconfigurationlogsummary":
        case "AutoConfigurationLogSummary": return target.isAutoConfigurationLogSummary();
        case "autoconfigurationsystempropertiesenabled":
        case "AutoConfigurationSystemPropertiesEnabled": return target.isAutoConfigurationSystemPropertiesEnabled();
        case "autostartup":
        case "AutoStartup": return target.isAutoStartup();
        case "autowiredenabled":
        case "AutowiredEnabled": return target.isAutowiredEnabled();
        case "backlogtracing":
        case "BacklogTracing": return target.isBacklogTracing();
        case "beanintrospectionextendedstatistics":
        case "BeanIntrospectionExtendedStatistics": return target.isBeanIntrospectionExtendedStatistics();
        case "beanintrospectionlogginglevel":
        case "BeanIntrospectionLoggingLevel": return target.getBeanIntrospectionLoggingLevel();
        case "beanpostprocessorenabled":
        case "BeanPostProcessorEnabled": return target.isBeanPostProcessorEnabled();
        case "caseinsensitiveheaders":
        case "CaseInsensitiveHeaders": return target.isCaseInsensitiveHeaders();
        case "configurationclasses":
        case "ConfigurationClasses": return target.getConfigurationClasses();
        case "configurations":
        case "Configurations": return target.getConfigurations();
        case "consumertemplatecachesize":
        case "ConsumerTemplateCacheSize": return target.getConsumerTemplateCacheSize();
        case "durationhitexitcode":
        case "DurationHitExitCode": return target.getDurationHitExitCode();
        case "durationmaxidleseconds":
        case "DurationMaxIdleSeconds": return target.getDurationMaxIdleSeconds();
        case "durationmaxmessages":
        case "DurationMaxMessages": return target.getDurationMaxMessages();
        case "durationmaxseconds":
        case "DurationMaxSeconds": return target.getDurationMaxSeconds();
        case "endpointbridgeerrorhandler":
        case "EndpointBridgeErrorHandler": return target.isEndpointBridgeErrorHandler();
        case "endpointlazystartproducer":
        case "EndpointLazyStartProducer": return target.isEndpointLazyStartProducer();
        case "endpointruntimestatisticsenabled":
        case "EndpointRuntimeStatisticsEnabled": return target.isEndpointRuntimeStatisticsEnabled();
        case "fileconfigurations":
        case "FileConfigurations": return target.getFileConfigurations();
        case "inflightrepositorybrowseenabled":
        case "InflightRepositoryBrowseEnabled": return target.isInflightRepositoryBrowseEnabled();
        case "javaroutesexcludepattern":
        case "JavaRoutesExcludePattern": return target.getJavaRoutesExcludePattern();
        case "javaroutesincludepattern":
        case "JavaRoutesIncludePattern": return target.getJavaRoutesIncludePattern();
        case "jmxenabled":
        case "JmxEnabled": return target.isJmxEnabled();
        case "jmxmanagementnamepattern":
        case "JmxManagementNamePattern": return target.getJmxManagementNamePattern();
        case "jmxmanagementstatisticslevel":
        case "JmxManagementStatisticsLevel": return target.getJmxManagementStatisticsLevel();
        case "lightweight":
        case "Lightweight": return target.isLightweight();
        case "loadtypeconverters":
        case "LoadTypeConverters": return target.isLoadTypeConverters();
        case "logdebugmaxchars":
        case "LogDebugMaxChars": return target.getLogDebugMaxChars();
        case "logexhaustedmessagebody":
        case "LogExhaustedMessageBody": return target.isLogExhaustedMessageBody();
        case "logmask":
        case "LogMask": return target.isLogMask();
        case "mdcloggingkeyspattern":
        case "MdcLoggingKeysPattern": return target.getMdcLoggingKeysPattern();
        case "messagehistory":
        case "MessageHistory": return target.isMessageHistory();
        case "name":
        case "Name": return target.getName();
        case "packagescanroutebuilders":
        case "PackageScanRouteBuilders": return target.getPackageScanRouteBuilders();
        case "producertemplatecachesize":
        case "ProducerTemplateCacheSize": return target.getProducerTemplateCacheSize();
        case "routecontrollerbackoffdelay":
        case "RouteControllerBackOffDelay": return target.getRouteControllerBackOffDelay();
        case "routecontrollerbackoffmaxattempts":
        case "RouteControllerBackOffMaxAttempts": return target.getRouteControllerBackOffMaxAttempts();
        case "routecontrollerbackoffmaxdelay":
        case "RouteControllerBackOffMaxDelay": return target.getRouteControllerBackOffMaxDelay();
        case "routecontrollerbackoffmaxelapsedtime":
        case "RouteControllerBackOffMaxElapsedTime": return target.getRouteControllerBackOffMaxElapsedTime();
        case "routecontrollerbackoffmultiplier":
        case "RouteControllerBackOffMultiplier": return target.getRouteControllerBackOffMultiplier();
        case "routecontrollerexcluderoutes":
        case "RouteControllerExcludeRoutes": return target.getRouteControllerExcludeRoutes();
        case "routecontrollerincluderoutes":
        case "RouteControllerIncludeRoutes": return target.getRouteControllerIncludeRoutes();
        case "routecontrollerinitialdelay":
        case "RouteControllerInitialDelay": return target.getRouteControllerInitialDelay();
        case "routecontrollerlogginglevel":
        case "RouteControllerLoggingLevel": return target.getRouteControllerLoggingLevel();
        case "routecontrollersuperviseenabled":
        case "RouteControllerSuperviseEnabled": return target.isRouteControllerSuperviseEnabled();
        case "routecontrollerthreadpoolsize":
        case "RouteControllerThreadPoolSize": return target.getRouteControllerThreadPoolSize();
        case "routecontrollerunhealthyonexhausted":
        case "RouteControllerUnhealthyOnExhausted": return target.isRouteControllerUnhealthyOnExhausted();
        case "routefilterexcludepattern":
        case "RouteFilterExcludePattern": return target.getRouteFilterExcludePattern();
        case "routefilterincludepattern":
        case "RouteFilterIncludePattern": return target.getRouteFilterIncludePattern();
        case "routesbuilderclasses":
        case "RoutesBuilderClasses": return target.getRoutesBuilderClasses();
        case "routesbuilders":
        case "RoutesBuilders": return target.getRoutesBuilders();
        case "routescollectorenabled":
        case "RoutesCollectorEnabled": return target.isRoutesCollectorEnabled();
        case "routesexcludepattern":
        case "RoutesExcludePattern": return target.getRoutesExcludePattern();
        case "routesincludepattern":
        case "RoutesIncludePattern": return target.getRoutesIncludePattern();
        case "shutdownloginflightexchangesontimeout":
        case "ShutdownLogInflightExchangesOnTimeout": return target.isShutdownLogInflightExchangesOnTimeout();
        case "shutdownnowontimeout":
        case "ShutdownNowOnTimeout": return target.isShutdownNowOnTimeout();
        case "shutdownroutesinreverseorder":
        case "ShutdownRoutesInReverseOrder": return target.isShutdownRoutesInReverseOrder();
        case "shutdownsuppressloggingontimeout":
        case "ShutdownSuppressLoggingOnTimeout": return target.isShutdownSuppressLoggingOnTimeout();
        case "shutdowntimeout":
        case "ShutdownTimeout": return target.getShutdownTimeout();
        case "startuprecorder":
        case "StartupRecorder": return target.getStartupRecorder();
        case "startuprecorderdir":
        case "StartupRecorderDir": return target.getStartupRecorderDir();
        case "startuprecorderduration":
        case "StartupRecorderDuration": return target.getStartupRecorderDuration();
        case "startuprecordermaxdepth":
        case "StartupRecorderMaxDepth": return target.getStartupRecorderMaxDepth();
        case "startuprecorderprofile":
        case "StartupRecorderProfile": return target.getStartupRecorderProfile();
        case "startuprecorderrecording":
        case "StartupRecorderRecording": return target.isStartupRecorderRecording();
        case "startupsummarylevel":
        case "StartupSummaryLevel": return target.getStartupSummaryLevel();
        case "streamcachinganyspoolrules":
        case "StreamCachingAnySpoolRules": return target.isStreamCachingAnySpoolRules();
        case "streamcachingbuffersize":
        case "StreamCachingBufferSize": return target.getStreamCachingBufferSize();
        case "streamcachingenabled":
        case "StreamCachingEnabled": return target.isStreamCachingEnabled();
        case "streamcachingremovespooldirectorywhenstopping":
        case "StreamCachingRemoveSpoolDirectoryWhenStopping": return target.isStreamCachingRemoveSpoolDirectoryWhenStopping();
        case "streamcachingspoolcipher":
        case "StreamCachingSpoolCipher": return target.getStreamCachingSpoolCipher();
        case "streamcachingspooldirectory":
        case "StreamCachingSpoolDirectory": return target.getStreamCachingSpoolDirectory();
        case "streamcachingspoolthreshold":
        case "StreamCachingSpoolThreshold": return target.getStreamCachingSpoolThreshold();
        case "streamcachingspoolusedheapmemorylimit":
        case "StreamCachingSpoolUsedHeapMemoryLimit": return target.getStreamCachingSpoolUsedHeapMemoryLimit();
        case "streamcachingspoolusedheapmemorythreshold":
        case "StreamCachingSpoolUsedHeapMemoryThreshold": return target.getStreamCachingSpoolUsedHeapMemoryThreshold();
        case "streamcachingstatisticsenabled":
        case "StreamCachingStatisticsEnabled": return target.isStreamCachingStatisticsEnabled();
        case "threadnamepattern":
        case "ThreadNamePattern": return target.getThreadNamePattern();
        case "tracing":
        case "Tracing": return target.isTracing();
        case "tracingpattern":
        case "TracingPattern": return target.getTracingPattern();
        case "usebreadcrumb":
        case "UseBreadcrumb": return target.isUseBreadcrumb();
        case "usedatatype":
        case "UseDataType": return target.isUseDataType();
        case "usemdclogging":
        case "UseMdcLogging": return target.isUseMdcLogging();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "configurations":
        case "Configurations": return java.lang.Object.class;
        case "routesbuilders":
        case "RoutesBuilders": return org.apache.camel.RoutesBuilder.class;
        default: return null;
        }
    }
}

