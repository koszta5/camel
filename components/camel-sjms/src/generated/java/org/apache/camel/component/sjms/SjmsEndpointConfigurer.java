/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms;

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
public class SjmsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SjmsEndpoint target = (SjmsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acknowledgementmode":
        case "acknowledgementMode": target.setAcknowledgementMode(property(camelContext, org.apache.camel.component.sjms.jms.SessionAcknowledgementType.class, value)); return true;
        case "allownullbody":
        case "allowNullBody": target.setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "asyncconsumer":
        case "asyncConsumer": target.setAsyncConsumer(property(camelContext, boolean.class, value)); return true;
        case "asyncstartlistener":
        case "asyncStartListener": target.setAsyncStartListener(property(camelContext, boolean.class, value)); return true;
        case "asyncstoplistener":
        case "asyncStopListener": target.setAsyncStopListener(property(camelContext, boolean.class, value)); return true;
        case "autostartup":
        case "autoStartup": target.setAutoStartup(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientid":
        case "clientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": target.setConnectionFactory(property(camelContext, javax.jms.ConnectionFactory.class, value)); return true;
        case "deliverymode":
        case "deliveryMode": target.setDeliveryMode(property(camelContext, java.lang.Integer.class, value)); return true;
        case "deliverypersistent":
        case "deliveryPersistent": target.setDeliveryPersistent(property(camelContext, boolean.class, value)); return true;
        case "destinationcreationstrategy":
        case "destinationCreationStrategy": target.setDestinationCreationStrategy(property(camelContext, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class, value)); return true;
        case "disablereplyto":
        case "disableReplyTo": target.setDisableReplyTo(property(camelContext, boolean.class, value)); return true;
        case "disabletimetolive":
        case "disableTimeToLive": target.setDisableTimeToLive(property(camelContext, boolean.class, value)); return true;
        case "durablesubscriptionname":
        case "durableSubscriptionName": target.setDurableSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        case "eagerloadingofproperties":
        case "eagerLoadingOfProperties": target.setEagerLoadingOfProperties(property(camelContext, boolean.class, value)); return true;
        case "eagerpoisonbody":
        case "eagerPoisonBody": target.setEagerPoisonBody(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exceptionlistener":
        case "exceptionListener": target.setExceptionListener(property(camelContext, javax.jms.ExceptionListener.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "explicitqosenabled":
        case "explicitQosEnabled": target.setExplicitQosEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "includealljmsxproperties":
        case "includeAllJMSXProperties": target.setIncludeAllJMSXProperties(property(camelContext, boolean.class, value)); return true;
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": target.setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mapjmsmessage":
        case "mapJmsMessage": target.setMapJmsMessage(property(camelContext, boolean.class, value)); return true;
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": target.setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class, value)); return true;
        case "messageselector":
        case "messageSelector": target.setMessageSelector(property(camelContext, java.lang.String.class, value)); return true;
        case "preservemessageqos":
        case "preserveMessageQos": target.setPreserveMessageQos(property(camelContext, boolean.class, value)); return true;
        case "priority": target.setPriority(property(camelContext, int.class, value)); return true;
        case "recoveryinterval":
        case "recoveryInterval": target.setRecoveryInterval(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "replyto":
        case "replyTo": target.setReplyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "replytoconcurrentconsumers":
        case "replyToConcurrentConsumers": target.setReplyToConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "replytodeliverypersistent":
        case "replyToDeliveryPersistent": target.setReplyToDeliveryPersistent(property(camelContext, boolean.class, value)); return true;
        case "replytooverride":
        case "replyToOverride": target.setReplyToOverride(property(camelContext, java.lang.String.class, value)); return true;
        case "replytosamedestinationallowed":
        case "replyToSameDestinationAllowed": target.setReplyToSameDestinationAllowed(property(camelContext, boolean.class, value)); return true;
        case "replytotype":
        case "replyToType": target.setReplyToType(property(camelContext, org.apache.camel.component.sjms.ReplyToType.class, value)); return true;
        case "requesttimeout":
        case "requestTimeout": target.setRequestTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": target.setTestConnectionOnStartup(property(camelContext, boolean.class, value)); return true;
        case "timetolive":
        case "timeToLive": target.setTimeToLive(property(camelContext, long.class, value)); return true;
        case "transacted": target.setTransacted(property(camelContext, boolean.class, value)); return true;
        case "transferexception":
        case "transferException": target.setTransferException(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acknowledgementmode":
        case "acknowledgementMode": return org.apache.camel.component.sjms.jms.SessionAcknowledgementType.class;
        case "allownullbody":
        case "allowNullBody": return boolean.class;
        case "asyncconsumer":
        case "asyncConsumer": return boolean.class;
        case "asyncstartlistener":
        case "asyncStartListener": return boolean.class;
        case "asyncstoplistener":
        case "asyncStopListener": return boolean.class;
        case "autostartup":
        case "autoStartup": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "concurrentconsumers":
        case "concurrentConsumers": return int.class;
        case "connectionfactory":
        case "connectionFactory": return javax.jms.ConnectionFactory.class;
        case "deliverymode":
        case "deliveryMode": return java.lang.Integer.class;
        case "deliverypersistent":
        case "deliveryPersistent": return boolean.class;
        case "destinationcreationstrategy":
        case "destinationCreationStrategy": return org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class;
        case "disablereplyto":
        case "disableReplyTo": return boolean.class;
        case "disabletimetolive":
        case "disableTimeToLive": return boolean.class;
        case "durablesubscriptionname":
        case "durableSubscriptionName": return java.lang.String.class;
        case "eagerloadingofproperties":
        case "eagerLoadingOfProperties": return boolean.class;
        case "eagerpoisonbody":
        case "eagerPoisonBody": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exceptionlistener":
        case "exceptionListener": return javax.jms.ExceptionListener.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "explicitqosenabled":
        case "explicitQosEnabled": return java.lang.Boolean.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "includealljmsxproperties":
        case "includeAllJMSXProperties": return boolean.class;
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": return org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "mapjmsmessage":
        case "mapJmsMessage": return boolean.class;
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": return org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class;
        case "messageselector":
        case "messageSelector": return java.lang.String.class;
        case "preservemessageqos":
        case "preserveMessageQos": return boolean.class;
        case "priority": return int.class;
        case "recoveryinterval":
        case "recoveryInterval": return long.class;
        case "replyto":
        case "replyTo": return java.lang.String.class;
        case "replytoconcurrentconsumers":
        case "replyToConcurrentConsumers": return int.class;
        case "replytodeliverypersistent":
        case "replyToDeliveryPersistent": return boolean.class;
        case "replytooverride":
        case "replyToOverride": return java.lang.String.class;
        case "replytosamedestinationallowed":
        case "replyToSameDestinationAllowed": return boolean.class;
        case "replytotype":
        case "replyToType": return org.apache.camel.component.sjms.ReplyToType.class;
        case "requesttimeout":
        case "requestTimeout": return long.class;
        case "synchronous": return boolean.class;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": return boolean.class;
        case "timetolive":
        case "timeToLive": return long.class;
        case "transacted": return boolean.class;
        case "transferexception":
        case "transferException": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SjmsEndpoint target = (SjmsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acknowledgementmode":
        case "acknowledgementMode": return target.getAcknowledgementMode();
        case "allownullbody":
        case "allowNullBody": return target.isAllowNullBody();
        case "asyncconsumer":
        case "asyncConsumer": return target.isAsyncConsumer();
        case "asyncstartlistener":
        case "asyncStartListener": return target.isAsyncStartListener();
        case "asyncstoplistener":
        case "asyncStopListener": return target.isAsyncStopListener();
        case "autostartup":
        case "autoStartup": return target.isAutoStartup();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clientid":
        case "clientId": return target.getClientId();
        case "concurrentconsumers":
        case "concurrentConsumers": return target.getConcurrentConsumers();
        case "connectionfactory":
        case "connectionFactory": return target.getConnectionFactory();
        case "deliverymode":
        case "deliveryMode": return target.getDeliveryMode();
        case "deliverypersistent":
        case "deliveryPersistent": return target.isDeliveryPersistent();
        case "destinationcreationstrategy":
        case "destinationCreationStrategy": return target.getDestinationCreationStrategy();
        case "disablereplyto":
        case "disableReplyTo": return target.isDisableReplyTo();
        case "disabletimetolive":
        case "disableTimeToLive": return target.isDisableTimeToLive();
        case "durablesubscriptionname":
        case "durableSubscriptionName": return target.getDurableSubscriptionName();
        case "eagerloadingofproperties":
        case "eagerLoadingOfProperties": return target.isEagerLoadingOfProperties();
        case "eagerpoisonbody":
        case "eagerPoisonBody": return target.getEagerPoisonBody();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exceptionlistener":
        case "exceptionListener": return target.getExceptionListener();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "explicitqosenabled":
        case "explicitQosEnabled": return target.getExplicitQosEnabled();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "includealljmsxproperties":
        case "includeAllJMSXProperties": return target.isIncludeAllJMSXProperties();
        case "jmskeyformatstrategy":
        case "jmsKeyFormatStrategy": return target.getJmsKeyFormatStrategy();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "mapjmsmessage":
        case "mapJmsMessage": return target.isMapJmsMessage();
        case "messagecreatedstrategy":
        case "messageCreatedStrategy": return target.getMessageCreatedStrategy();
        case "messageselector":
        case "messageSelector": return target.getMessageSelector();
        case "preservemessageqos":
        case "preserveMessageQos": return target.isPreserveMessageQos();
        case "priority": return target.getPriority();
        case "recoveryinterval":
        case "recoveryInterval": return target.getRecoveryInterval();
        case "replyto":
        case "replyTo": return target.getReplyTo();
        case "replytoconcurrentconsumers":
        case "replyToConcurrentConsumers": return target.getReplyToConcurrentConsumers();
        case "replytodeliverypersistent":
        case "replyToDeliveryPersistent": return target.isReplyToDeliveryPersistent();
        case "replytooverride":
        case "replyToOverride": return target.getReplyToOverride();
        case "replytosamedestinationallowed":
        case "replyToSameDestinationAllowed": return target.isReplyToSameDestinationAllowed();
        case "replytotype":
        case "replyToType": return target.getReplyToType();
        case "requesttimeout":
        case "requestTimeout": return target.getRequestTimeout();
        case "synchronous": return target.isSynchronous();
        case "testconnectiononstartup":
        case "testConnectionOnStartup": return target.isTestConnectionOnStartup();
        case "timetolive":
        case "timeToLive": return target.getTimeToLive();
        case "transacted": return target.isTransacted();
        case "transferexception":
        case "transferException": return target.isTransferException();
        default: return null;
        }
    }
}

