/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.s3;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class S3EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        S3Endpoint target = (S3Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acceleratemodeenabled":
        case "accelerateModeEnabled": target.getConfiguration().setAccelerateModeEnabled(property(camelContext, boolean.class, value)); return true;
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazons3client":
        case "amazonS3Client": target.getConfiguration().setAmazonS3Client(property(camelContext, com.amazonaws.services.s3.AmazonS3.class, value)); return true;
        case "autocreatebucket":
        case "autoCreateBucket": target.getConfiguration().setAutoCreateBucket(property(camelContext, boolean.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": target.getConfiguration().setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "autoclosebody":
        case "autocloseBody": target.getConfiguration().setAutocloseBody(property(camelContext, boolean.class, value)); return true;
        case "awskmskeyid":
        case "awsKMSKeyId": target.getConfiguration().setAwsKMSKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "chunkedencodingdisabled":
        case "chunkedEncodingDisabled": target.getConfiguration().setChunkedEncodingDisabled(property(camelContext, boolean.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "deleteafterread":
        case "deleteAfterRead": target.getConfiguration().setDeleteAfterRead(property(camelContext, boolean.class, value)); return true;
        case "deleteafterwrite":
        case "deleteAfterWrite": target.getConfiguration().setDeleteAfterWrite(property(camelContext, boolean.class, value)); return true;
        case "delimiter": target.getConfiguration().setDelimiter(property(camelContext, java.lang.String.class, value)); return true;
        case "donefilename":
        case "doneFileName": target.getConfiguration().setDoneFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "dualstackenabled":
        case "dualstackEnabled": target.getConfiguration().setDualstackEnabled(property(camelContext, boolean.class, value)); return true;
        case "encryptionmaterials":
        case "encryptionMaterials": target.getConfiguration().setEncryptionMaterials(property(camelContext, com.amazonaws.services.s3.model.EncryptionMaterials.class, value)); return true;
        case "endpointconfiguration":
        case "endpointConfiguration": target.getConfiguration().setEndpointConfiguration(property(camelContext, com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "filename":
        case "fileName": target.getConfiguration().setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "forceglobalbucketaccessenabled":
        case "forceGlobalBucketAccessEnabled": target.getConfiguration().setForceGlobalBucketAccessEnabled(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "includebody":
        case "includeBody": target.getConfiguration().setIncludeBody(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "keyname":
        case "keyName": target.getConfiguration().setKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxconnections":
        case "maxConnections": target.setMaxConnections(property(camelContext, int.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "multipartupload":
        case "multiPartUpload": target.getConfiguration().setMultiPartUpload(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws.s3.S3Operations.class, value)); return true;
        case "partsize":
        case "partSize": target.getConfiguration().setPartSize(property(camelContext, long.class, value)); return true;
        case "pathstyleaccess":
        case "pathStyleAccess": target.getConfiguration().setPathStyleAccess(property(camelContext, boolean.class, value)); return true;
        case "payloadsigningenabled":
        case "payloadSigningEnabled": target.getConfiguration().setPayloadSigningEnabled(property(camelContext, boolean.class, value)); return true;
        case "policy": target.getConfiguration().setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "prefix": target.getConfiguration().setPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "serversideencryption":
        case "serverSideEncryption": target.getConfiguration().setServerSideEncryption(property(camelContext, java.lang.String.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "storageclass":
        case "storageClass": target.getConfiguration().setStorageClass(property(camelContext, java.lang.String.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useawskms":
        case "useAwsKMS": target.getConfiguration().setUseAwsKMS(property(camelContext, boolean.class, value)); return true;
        case "useencryption":
        case "useEncryption": target.getConfiguration().setUseEncryption(property(camelContext, boolean.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "useiamcredentials":
        case "useIAMCredentials": target.getConfiguration().setUseIAMCredentials(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acceleratemodeenabled":
        case "accelerateModeEnabled": return boolean.class;
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "amazons3client":
        case "amazonS3Client": return com.amazonaws.services.s3.AmazonS3.class;
        case "autocreatebucket":
        case "autoCreateBucket": return boolean.class;
        case "autodiscoverclient":
        case "autoDiscoverClient": return boolean.class;
        case "autoclosebody":
        case "autocloseBody": return boolean.class;
        case "awskmskeyid":
        case "awsKMSKeyId": return java.lang.String.class;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return int.class;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return int.class;
        case "backoffmultiplier":
        case "backoffMultiplier": return int.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "chunkedencodingdisabled":
        case "chunkedEncodingDisabled": return boolean.class;
        case "delay": return long.class;
        case "deleteafterread":
        case "deleteAfterRead": return boolean.class;
        case "deleteafterwrite":
        case "deleteAfterWrite": return boolean.class;
        case "delimiter": return java.lang.String.class;
        case "donefilename":
        case "doneFileName": return java.lang.String.class;
        case "dualstackenabled":
        case "dualstackEnabled": return boolean.class;
        case "encryptionmaterials":
        case "encryptionMaterials": return com.amazonaws.services.s3.model.EncryptionMaterials.class;
        case "endpointconfiguration":
        case "endpointConfiguration": return com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "filename":
        case "fileName": return java.lang.String.class;
        case "forceglobalbucketaccessenabled":
        case "forceGlobalBucketAccessEnabled": return boolean.class;
        case "greedy": return boolean.class;
        case "includebody":
        case "includeBody": return boolean.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "keyname":
        case "keyName": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxconnections":
        case "maxConnections": return int.class;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return int.class;
        case "multipartupload":
        case "multiPartUpload": return boolean.class;
        case "operation": return org.apache.camel.component.aws.s3.S3Operations.class;
        case "partsize":
        case "partSize": return long.class;
        case "pathstyleaccess":
        case "pathStyleAccess": return boolean.class;
        case "payloadsigningenabled":
        case "payloadSigningEnabled": return boolean.class;
        case "policy": return java.lang.String.class;
        case "pollstrategy":
        case "pollStrategy": return org.apache.camel.spi.PollingConsumerPollStrategy.class;
        case "prefix": return java.lang.String.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyprotocol":
        case "proxyProtocol": return com.amazonaws.Protocol.class;
        case "region": return java.lang.String.class;
        case "repeatcount":
        case "repeatCount": return long.class;
        case "runlogginglevel":
        case "runLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "scheduler": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.util.Map.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return boolean.class;
        case "serversideencryption":
        case "serverSideEncryption": return java.lang.String.class;
        case "startscheduler":
        case "startScheduler": return boolean.class;
        case "storageclass":
        case "storageClass": return java.lang.String.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        case "useawskms":
        case "useAwsKMS": return boolean.class;
        case "useencryption":
        case "useEncryption": return boolean.class;
        case "usefixeddelay":
        case "useFixedDelay": return boolean.class;
        case "useiamcredentials":
        case "useIAMCredentials": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        S3Endpoint target = (S3Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acceleratemodeenabled":
        case "accelerateModeEnabled": return target.getConfiguration().isAccelerateModeEnabled();
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "amazons3client":
        case "amazonS3Client": return target.getConfiguration().getAmazonS3Client();
        case "autocreatebucket":
        case "autoCreateBucket": return target.getConfiguration().isAutoCreateBucket();
        case "autodiscoverclient":
        case "autoDiscoverClient": return target.getConfiguration().isAutoDiscoverClient();
        case "autoclosebody":
        case "autocloseBody": return target.getConfiguration().isAutocloseBody();
        case "awskmskeyid":
        case "awsKMSKeyId": return target.getConfiguration().getAwsKMSKeyId();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "chunkedencodingdisabled":
        case "chunkedEncodingDisabled": return target.getConfiguration().isChunkedEncodingDisabled();
        case "delay": return target.getDelay();
        case "deleteafterread":
        case "deleteAfterRead": return target.getConfiguration().isDeleteAfterRead();
        case "deleteafterwrite":
        case "deleteAfterWrite": return target.getConfiguration().isDeleteAfterWrite();
        case "delimiter": return target.getConfiguration().getDelimiter();
        case "donefilename":
        case "doneFileName": return target.getConfiguration().getDoneFileName();
        case "dualstackenabled":
        case "dualstackEnabled": return target.getConfiguration().isDualstackEnabled();
        case "encryptionmaterials":
        case "encryptionMaterials": return target.getConfiguration().getEncryptionMaterials();
        case "endpointconfiguration":
        case "endpointConfiguration": return target.getConfiguration().getEndpointConfiguration();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "filename":
        case "fileName": return target.getConfiguration().getFileName();
        case "forceglobalbucketaccessenabled":
        case "forceGlobalBucketAccessEnabled": return target.getConfiguration().isForceGlobalBucketAccessEnabled();
        case "greedy": return target.isGreedy();
        case "includebody":
        case "includeBody": return target.getConfiguration().isIncludeBody();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "keyname":
        case "keyName": return target.getConfiguration().getKeyName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxconnections":
        case "maxConnections": return target.getMaxConnections();
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": return target.getMaxMessagesPerPoll();
        case "multipartupload":
        case "multiPartUpload": return target.getConfiguration().isMultiPartUpload();
        case "operation": return target.getConfiguration().getOperation();
        case "partsize":
        case "partSize": return target.getConfiguration().getPartSize();
        case "pathstyleaccess":
        case "pathStyleAccess": return target.getConfiguration().isPathStyleAccess();
        case "payloadsigningenabled":
        case "payloadSigningEnabled": return target.getConfiguration().isPayloadSigningEnabled();
        case "policy": return target.getConfiguration().getPolicy();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "prefix": return target.getConfiguration().getPrefix();
        case "proxyhost":
        case "proxyHost": return target.getConfiguration().getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return target.getConfiguration().getProxyProtocol();
        case "region": return target.getConfiguration().getRegion();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "serversideencryption":
        case "serverSideEncryption": return target.getConfiguration().getServerSideEncryption();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "storageclass":
        case "storageClass": return target.getConfiguration().getStorageClass();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "useawskms":
        case "useAwsKMS": return target.getConfiguration().isUseAwsKMS();
        case "useencryption":
        case "useEncryption": return target.getConfiguration().isUseEncryption();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "useiamcredentials":
        case "useIAMCredentials": return target.getConfiguration().isUseIAMCredentials();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "schedulerproperties":
        case "schedulerProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

