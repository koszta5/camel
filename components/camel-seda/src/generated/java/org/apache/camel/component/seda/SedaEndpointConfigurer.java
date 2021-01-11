/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.seda;

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
public class SedaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SedaEndpoint target = (SedaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "blockwhenfull":
        case "blockWhenFull": target.setBlockWhenFull(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "discardifnoconsumers":
        case "discardIfNoConsumers": target.setDiscardIfNoConsumers(property(camelContext, boolean.class, value)); return true;
        case "discardwhenfull":
        case "discardWhenFull": target.setDiscardWhenFull(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "failifnoconsumers":
        case "failIfNoConsumers": target.setFailIfNoConsumers(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "limitconcurrentconsumers":
        case "limitConcurrentConsumers": target.setLimitConcurrentConsumers(property(camelContext, boolean.class, value)); return true;
        case "multipleconsumers":
        case "multipleConsumers": target.setMultipleConsumers(property(camelContext, boolean.class, value)); return true;
        case "offertimeout":
        case "offerTimeout": target.setOfferTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "polltimeout":
        case "pollTimeout": target.setPollTimeout(property(camelContext, int.class, value)); return true;
        case "purgewhenstopping":
        case "purgeWhenStopping": target.setPurgeWhenStopping(property(camelContext, boolean.class, value)); return true;
        case "queue": target.setQueue(property(camelContext, java.util.concurrent.BlockingQueue.class, value)); return true;
        case "size": target.setSize(property(camelContext, int.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "waitfortasktocomplete":
        case "waitForTaskToComplete": target.setWaitForTaskToComplete(property(camelContext, org.apache.camel.WaitForTaskToComplete.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "blockwhenfull":
        case "blockWhenFull": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "concurrentconsumers":
        case "concurrentConsumers": return int.class;
        case "discardifnoconsumers":
        case "discardIfNoConsumers": return boolean.class;
        case "discardwhenfull":
        case "discardWhenFull": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "failifnoconsumers":
        case "failIfNoConsumers": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "limitconcurrentconsumers":
        case "limitConcurrentConsumers": return boolean.class;
        case "multipleconsumers":
        case "multipleConsumers": return boolean.class;
        case "offertimeout":
        case "offerTimeout": return long.class;
        case "polltimeout":
        case "pollTimeout": return int.class;
        case "purgewhenstopping":
        case "purgeWhenStopping": return boolean.class;
        case "queue": return java.util.concurrent.BlockingQueue.class;
        case "size": return int.class;
        case "synchronous": return boolean.class;
        case "timeout": return long.class;
        case "waitfortasktocomplete":
        case "waitForTaskToComplete": return org.apache.camel.WaitForTaskToComplete.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SedaEndpoint target = (SedaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "blockwhenfull":
        case "blockWhenFull": return target.isBlockWhenFull();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "concurrentconsumers":
        case "concurrentConsumers": return target.getConcurrentConsumers();
        case "discardifnoconsumers":
        case "discardIfNoConsumers": return target.isDiscardIfNoConsumers();
        case "discardwhenfull":
        case "discardWhenFull": return target.isDiscardWhenFull();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "failifnoconsumers":
        case "failIfNoConsumers": return target.isFailIfNoConsumers();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "limitconcurrentconsumers":
        case "limitConcurrentConsumers": return target.isLimitConcurrentConsumers();
        case "multipleconsumers":
        case "multipleConsumers": return target.isMultipleConsumers();
        case "offertimeout":
        case "offerTimeout": return target.getOfferTimeout();
        case "polltimeout":
        case "pollTimeout": return target.getPollTimeout();
        case "purgewhenstopping":
        case "purgeWhenStopping": return target.isPurgeWhenStopping();
        case "queue": return target.getQueue();
        case "size": return target.getSize();
        case "synchronous": return target.isSynchronous();
        case "timeout": return target.getTimeout();
        case "waitfortasktocomplete":
        case "waitForTaskToComplete": return target.getWaitForTaskToComplete();
        default: return null;
        }
    }
}

