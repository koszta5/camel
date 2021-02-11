/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

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
public class DebeziumSqlserverEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DebeziumSqlserverEndpoint target = (DebeziumSqlserverEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": target.getConfiguration().setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "binaryhandlingmode":
        case "binaryHandlingMode": target.getConfiguration().setBinaryHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "columnblacklist":
        case "columnBlacklist": target.getConfiguration().setColumnBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "columnexcludelist":
        case "columnExcludeList": target.getConfiguration().setColumnExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "columnincludelist":
        case "columnIncludeList": target.getConfiguration().setColumnIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "columnpropagatesourcetype":
        case "columnPropagateSourceType": target.getConfiguration().setColumnPropagateSourceType(property(camelContext, java.lang.String.class, value)); return true;
        case "columnwhitelist":
        case "columnWhitelist": target.getConfiguration().setColumnWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "converters": target.getConfiguration().setConverters(property(camelContext, java.lang.String.class, value)); return true;
        case "databasedbname":
        case "databaseDbname": target.getConfiguration().setDatabaseDbname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistory":
        case "databaseHistory": target.getConfiguration().setDatabaseHistory(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": target.getConfiguration().setDatabaseHistoryFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkabootstrapservers":
        case "databaseHistoryKafkaBootstrapServers": target.getConfiguration().setDatabaseHistoryKafkaBootstrapServers(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkarecoveryattempts":
        case "databaseHistoryKafkaRecoveryAttempts": target.getConfiguration().setDatabaseHistoryKafkaRecoveryAttempts(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkarecoverypollintervalms":
        case "databaseHistoryKafkaRecoveryPollIntervalMs": target.getConfiguration().setDatabaseHistoryKafkaRecoveryPollIntervalMs(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkatopic":
        case "databaseHistoryKafkaTopic": target.getConfiguration().setDatabaseHistoryKafkaTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehostname":
        case "databaseHostname": target.getConfiguration().setDatabaseHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseinstance":
        case "databaseInstance": target.getConfiguration().setDatabaseInstance(property(camelContext, java.lang.String.class, value)); return true;
        case "databasepassword":
        case "databasePassword": target.getConfiguration().setDatabasePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseport":
        case "databasePort": target.getConfiguration().setDatabasePort(property(camelContext, int.class, value)); return true;
        case "databaseservername":
        case "databaseServerName": target.getConfiguration().setDatabaseServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseservertimezone":
        case "databaseServerTimezone": target.getConfiguration().setDatabaseServerTimezone(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseuser":
        case "databaseUser": target.getConfiguration().setDatabaseUser(property(camelContext, java.lang.String.class, value)); return true;
        case "datatypepropagatesourcetype":
        case "datatypePropagateSourceType": target.getConfiguration().setDatatypePropagateSourceType(property(camelContext, java.lang.String.class, value)); return true;
        case "decimalhandlingmode":
        case "decimalHandlingMode": target.getConfiguration().setDecimalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": target.getConfiguration().setEventProcessingFailureHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": target.getConfiguration().setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": target.getConfiguration().setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "includeschemachanges":
        case "includeSchemaChanges": target.getConfiguration().setIncludeSchemaChanges(property(camelContext, boolean.class, value)); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": target.getConfiguration().setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter":
        case "internalValueConverter": target.getConfiguration().setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize":
        case "maxBatchSize": target.getConfiguration().setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": target.getConfiguration().setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": target.getConfiguration().setMaxQueueSizeInBytes(property(camelContext, long.class, value)); return true;
        case "messagekeycolumns":
        case "messageKeyColumns": target.getConfiguration().setMessageKeyColumns(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": target.getConfiguration().setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": target.getConfiguration().setOffsetCommitTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": target.getConfiguration().setOffsetFlushIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetstorage":
        case "offsetStorage": target.getConfiguration().setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": target.getConfiguration().setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": target.getConfiguration().setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": target.getConfiguration().setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": target.getConfiguration().setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "pollintervalms":
        case "pollIntervalMs": target.getConfiguration().setPollIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "providetransactionmetadata":
        case "provideTransactionMetadata": target.getConfiguration().setProvideTransactionMetadata(property(camelContext, boolean.class, value)); return true;
        case "queryfetchsize":
        case "queryFetchSize": target.getConfiguration().setQueryFetchSize(property(camelContext, int.class, value)); return true;
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": target.getConfiguration().setRetriableRestartConnectorWaitMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "sanitizefieldnames":
        case "sanitizeFieldNames": target.getConfiguration().setSanitizeFieldNames(property(camelContext, boolean.class, value)); return true;
        case "skippedoperations":
        case "skippedOperations": target.getConfiguration().setSkippedOperations(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": target.getConfiguration().setSnapshotDelayMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": target.getConfiguration().setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": target.getConfiguration().setSnapshotIncludeCollectionList(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotisolationmode":
        case "snapshotIsolationMode": target.getConfiguration().setSnapshotIsolationMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": target.getConfiguration().setSnapshotLockTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "snapshotmaxthreads":
        case "snapshotMaxThreads": target.getConfiguration().setSnapshotMaxThreads(property(camelContext, int.class, value)); return true;
        case "snapshotmode":
        case "snapshotMode": target.getConfiguration().setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": target.getConfiguration().setSnapshotSelectStatementOverrides(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcestructversion":
        case "sourceStructVersion": target.getConfiguration().setSourceStructVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcetimestampmode":
        case "sourceTimestampMode": target.getConfiguration().setSourceTimestampMode(property(camelContext, java.lang.String.class, value)); return true;
        case "tableblacklist":
        case "tableBlacklist": target.getConfiguration().setTableBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "tableexcludelist":
        case "tableExcludeList": target.getConfiguration().setTableExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": target.getConfiguration().setTableIgnoreBuiltin(property(camelContext, boolean.class, value)); return true;
        case "tableincludelist":
        case "tableIncludeList": target.getConfiguration().setTableIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "tablewhitelist":
        case "tableWhitelist": target.getConfiguration().setTableWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "timeprecisionmode":
        case "timePrecisionMode": target.getConfiguration().setTimePrecisionMode(property(camelContext, java.lang.String.class, value)); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": target.getConfiguration().setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return java.util.Map.class;
        case "binaryhandlingmode":
        case "binaryHandlingMode": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "columnblacklist":
        case "columnBlacklist": return java.lang.String.class;
        case "columnexcludelist":
        case "columnExcludeList": return java.lang.String.class;
        case "columnincludelist":
        case "columnIncludeList": return java.lang.String.class;
        case "columnpropagatesourcetype":
        case "columnPropagateSourceType": return java.lang.String.class;
        case "columnwhitelist":
        case "columnWhitelist": return java.lang.String.class;
        case "converters": return java.lang.String.class;
        case "databasedbname":
        case "databaseDbname": return java.lang.String.class;
        case "databasehistory":
        case "databaseHistory": return java.lang.String.class;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": return java.lang.String.class;
        case "databasehistorykafkabootstrapservers":
        case "databaseHistoryKafkaBootstrapServers": return java.lang.String.class;
        case "databasehistorykafkarecoveryattempts":
        case "databaseHistoryKafkaRecoveryAttempts": return int.class;
        case "databasehistorykafkarecoverypollintervalms":
        case "databaseHistoryKafkaRecoveryPollIntervalMs": return int.class;
        case "databasehistorykafkatopic":
        case "databaseHistoryKafkaTopic": return java.lang.String.class;
        case "databasehostname":
        case "databaseHostname": return java.lang.String.class;
        case "databaseinstance":
        case "databaseInstance": return java.lang.String.class;
        case "databasepassword":
        case "databasePassword": return java.lang.String.class;
        case "databaseport":
        case "databasePort": return int.class;
        case "databaseservername":
        case "databaseServerName": return java.lang.String.class;
        case "databaseservertimezone":
        case "databaseServerTimezone": return java.lang.String.class;
        case "databaseuser":
        case "databaseUser": return java.lang.String.class;
        case "datatypepropagatesourcetype":
        case "datatypePropagateSourceType": return java.lang.String.class;
        case "decimalhandlingmode":
        case "decimalHandlingMode": return java.lang.String.class;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return int.class;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return java.lang.String.class;
        case "includeschemachanges":
        case "includeSchemaChanges": return boolean.class;
        case "internalkeyconverter":
        case "internalKeyConverter": return java.lang.String.class;
        case "internalvalueconverter":
        case "internalValueConverter": return java.lang.String.class;
        case "maxbatchsize":
        case "maxBatchSize": return int.class;
        case "maxqueuesize":
        case "maxQueueSize": return int.class;
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": return long.class;
        case "messagekeycolumns":
        case "messageKeyColumns": return java.lang.String.class;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return java.lang.String.class;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return long.class;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return long.class;
        case "offsetstorage":
        case "offsetStorage": return java.lang.String.class;
        case "offsetstoragefilename":
        case "offsetStorageFileName": return java.lang.String.class;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return int.class;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return int.class;
        case "offsetstoragetopic":
        case "offsetStorageTopic": return java.lang.String.class;
        case "pollintervalms":
        case "pollIntervalMs": return long.class;
        case "providetransactionmetadata":
        case "provideTransactionMetadata": return boolean.class;
        case "queryfetchsize":
        case "queryFetchSize": return int.class;
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": return long.class;
        case "sanitizefieldnames":
        case "sanitizeFieldNames": return boolean.class;
        case "skippedoperations":
        case "skippedOperations": return java.lang.String.class;
        case "snapshotdelayms":
        case "snapshotDelayMs": return long.class;
        case "snapshotfetchsize":
        case "snapshotFetchSize": return int.class;
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": return java.lang.String.class;
        case "snapshotisolationmode":
        case "snapshotIsolationMode": return java.lang.String.class;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": return long.class;
        case "snapshotmaxthreads":
        case "snapshotMaxThreads": return int.class;
        case "snapshotmode":
        case "snapshotMode": return java.lang.String.class;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": return java.lang.String.class;
        case "sourcestructversion":
        case "sourceStructVersion": return java.lang.String.class;
        case "sourcetimestampmode":
        case "sourceTimestampMode": return java.lang.String.class;
        case "tableblacklist":
        case "tableBlacklist": return java.lang.String.class;
        case "tableexcludelist":
        case "tableExcludeList": return java.lang.String.class;
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": return boolean.class;
        case "tableincludelist":
        case "tableIncludeList": return java.lang.String.class;
        case "tablewhitelist":
        case "tableWhitelist": return java.lang.String.class;
        case "timeprecisionmode":
        case "timePrecisionMode": return java.lang.String.class;
        case "tombstonesondelete":
        case "tombstonesOnDelete": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DebeziumSqlserverEndpoint target = (DebeziumSqlserverEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return target.getConfiguration().getAdditionalProperties();
        case "binaryhandlingmode":
        case "binaryHandlingMode": return target.getConfiguration().getBinaryHandlingMode();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "columnblacklist":
        case "columnBlacklist": return target.getConfiguration().getColumnBlacklist();
        case "columnexcludelist":
        case "columnExcludeList": return target.getConfiguration().getColumnExcludeList();
        case "columnincludelist":
        case "columnIncludeList": return target.getConfiguration().getColumnIncludeList();
        case "columnpropagatesourcetype":
        case "columnPropagateSourceType": return target.getConfiguration().getColumnPropagateSourceType();
        case "columnwhitelist":
        case "columnWhitelist": return target.getConfiguration().getColumnWhitelist();
        case "converters": return target.getConfiguration().getConverters();
        case "databasedbname":
        case "databaseDbname": return target.getConfiguration().getDatabaseDbname();
        case "databasehistory":
        case "databaseHistory": return target.getConfiguration().getDatabaseHistory();
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": return target.getConfiguration().getDatabaseHistoryFileFilename();
        case "databasehistorykafkabootstrapservers":
        case "databaseHistoryKafkaBootstrapServers": return target.getConfiguration().getDatabaseHistoryKafkaBootstrapServers();
        case "databasehistorykafkarecoveryattempts":
        case "databaseHistoryKafkaRecoveryAttempts": return target.getConfiguration().getDatabaseHistoryKafkaRecoveryAttempts();
        case "databasehistorykafkarecoverypollintervalms":
        case "databaseHistoryKafkaRecoveryPollIntervalMs": return target.getConfiguration().getDatabaseHistoryKafkaRecoveryPollIntervalMs();
        case "databasehistorykafkatopic":
        case "databaseHistoryKafkaTopic": return target.getConfiguration().getDatabaseHistoryKafkaTopic();
        case "databasehostname":
        case "databaseHostname": return target.getConfiguration().getDatabaseHostname();
        case "databaseinstance":
        case "databaseInstance": return target.getConfiguration().getDatabaseInstance();
        case "databasepassword":
        case "databasePassword": return target.getConfiguration().getDatabasePassword();
        case "databaseport":
        case "databasePort": return target.getConfiguration().getDatabasePort();
        case "databaseservername":
        case "databaseServerName": return target.getConfiguration().getDatabaseServerName();
        case "databaseservertimezone":
        case "databaseServerTimezone": return target.getConfiguration().getDatabaseServerTimezone();
        case "databaseuser":
        case "databaseUser": return target.getConfiguration().getDatabaseUser();
        case "datatypepropagatesourcetype":
        case "datatypePropagateSourceType": return target.getConfiguration().getDatatypePropagateSourceType();
        case "decimalhandlingmode":
        case "decimalHandlingMode": return target.getConfiguration().getDecimalHandlingMode();
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return target.getConfiguration().getEventProcessingFailureHandlingMode();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return target.getConfiguration().getHeartbeatIntervalMs();
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return target.getConfiguration().getHeartbeatTopicsPrefix();
        case "includeschemachanges":
        case "includeSchemaChanges": return target.getConfiguration().isIncludeSchemaChanges();
        case "internalkeyconverter":
        case "internalKeyConverter": return target.getConfiguration().getInternalKeyConverter();
        case "internalvalueconverter":
        case "internalValueConverter": return target.getConfiguration().getInternalValueConverter();
        case "maxbatchsize":
        case "maxBatchSize": return target.getConfiguration().getMaxBatchSize();
        case "maxqueuesize":
        case "maxQueueSize": return target.getConfiguration().getMaxQueueSize();
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": return target.getConfiguration().getMaxQueueSizeInBytes();
        case "messagekeycolumns":
        case "messageKeyColumns": return target.getConfiguration().getMessageKeyColumns();
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return target.getConfiguration().getOffsetCommitPolicy();
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return target.getConfiguration().getOffsetCommitTimeoutMs();
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return target.getConfiguration().getOffsetFlushIntervalMs();
        case "offsetstorage":
        case "offsetStorage": return target.getConfiguration().getOffsetStorage();
        case "offsetstoragefilename":
        case "offsetStorageFileName": return target.getConfiguration().getOffsetStorageFileName();
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return target.getConfiguration().getOffsetStoragePartitions();
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return target.getConfiguration().getOffsetStorageReplicationFactor();
        case "offsetstoragetopic":
        case "offsetStorageTopic": return target.getConfiguration().getOffsetStorageTopic();
        case "pollintervalms":
        case "pollIntervalMs": return target.getConfiguration().getPollIntervalMs();
        case "providetransactionmetadata":
        case "provideTransactionMetadata": return target.getConfiguration().isProvideTransactionMetadata();
        case "queryfetchsize":
        case "queryFetchSize": return target.getConfiguration().getQueryFetchSize();
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": return target.getConfiguration().getRetriableRestartConnectorWaitMs();
        case "sanitizefieldnames":
        case "sanitizeFieldNames": return target.getConfiguration().isSanitizeFieldNames();
        case "skippedoperations":
        case "skippedOperations": return target.getConfiguration().getSkippedOperations();
        case "snapshotdelayms":
        case "snapshotDelayMs": return target.getConfiguration().getSnapshotDelayMs();
        case "snapshotfetchsize":
        case "snapshotFetchSize": return target.getConfiguration().getSnapshotFetchSize();
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": return target.getConfiguration().getSnapshotIncludeCollectionList();
        case "snapshotisolationmode":
        case "snapshotIsolationMode": return target.getConfiguration().getSnapshotIsolationMode();
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": return target.getConfiguration().getSnapshotLockTimeoutMs();
        case "snapshotmaxthreads":
        case "snapshotMaxThreads": return target.getConfiguration().getSnapshotMaxThreads();
        case "snapshotmode":
        case "snapshotMode": return target.getConfiguration().getSnapshotMode();
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": return target.getConfiguration().getSnapshotSelectStatementOverrides();
        case "sourcestructversion":
        case "sourceStructVersion": return target.getConfiguration().getSourceStructVersion();
        case "sourcetimestampmode":
        case "sourceTimestampMode": return target.getConfiguration().getSourceTimestampMode();
        case "tableblacklist":
        case "tableBlacklist": return target.getConfiguration().getTableBlacklist();
        case "tableexcludelist":
        case "tableExcludeList": return target.getConfiguration().getTableExcludeList();
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": return target.getConfiguration().isTableIgnoreBuiltin();
        case "tableincludelist":
        case "tableIncludeList": return target.getConfiguration().getTableIncludeList();
        case "tablewhitelist":
        case "tableWhitelist": return target.getConfiguration().getTableWhitelist();
        case "timeprecisionmode":
        case "timePrecisionMode": return target.getConfiguration().getTimePrecisionMode();
        case "tombstonesondelete":
        case "tombstonesOnDelete": return target.getConfiguration().isTombstonesOnDelete();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

