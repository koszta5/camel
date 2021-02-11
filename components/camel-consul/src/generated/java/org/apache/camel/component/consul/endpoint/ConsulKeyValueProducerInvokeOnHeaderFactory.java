/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.consul.endpoint;

import org.apache.camel.AsyncCallback;
import org.apache.camel.Exchange;
import org.apache.camel.spi.InvokeOnHeaderStrategy;
import org.apache.camel.component.consul.endpoint.ConsulKeyValueProducer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ConsulKeyValueProducerInvokeOnHeaderFactory implements InvokeOnHeaderStrategy {

    @Override
    public Object invoke(Object obj, String key, Exchange exchange, AsyncCallback callback) throws Exception {
        org.apache.camel.component.consul.endpoint.ConsulKeyValueProducer target = (org.apache.camel.component.consul.endpoint.ConsulKeyValueProducer) obj;
        switch (key) {
        case "delete_key":
        case "DELETE_KEY": target.deleteKey(exchange.getMessage()); return null;
        case "delete_keys":
        case "DELETE_KEYS": target.deleteKeys(exchange.getMessage()); return null;
        case "get_keys":
        case "GET_KEYS": target.getKeys(exchange.getMessage()); return null;
        case "get_sessions":
        case "GET_SESSIONS": target.getSessions(exchange.getMessage()); return null;
        case "get_value":
        case "GET_VALUE": target.getValue(exchange.getMessage()); return null;
        case "get_values":
        case "GET_VALUES": target.getValues(exchange.getMessage()); return null;
        case "lock":
        case "LOCK": target.lock(exchange.getMessage()); return null;
        case "put":
        case "PUT": target.put(exchange.getMessage()); return null;
        case "unlock":
        case "UNLOCK": target.unlock(exchange.getMessage()); return null;
        default: return null;
        }
    }

}

