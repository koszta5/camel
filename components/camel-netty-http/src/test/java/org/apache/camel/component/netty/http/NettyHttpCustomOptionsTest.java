/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.netty.http;

import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;

import static org.apache.camel.Exchange.HTTP_METHOD;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NettyHttpCustomOptionsTest extends BaseNettyTest {

    String expectedResponse = "response";

    @Test
    public void shouldReturnCustomResponseForOptions() throws Exception {
        String response = template.requestBodyAndHeader("netty-http:http://localhost:{{port}}/foo", "", HTTP_METHOD, "OPTIONS",
                String.class);
        assertEquals(expectedResponse, response);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("netty-http:http://0.0.0.0:{{port}}/foo?httpMethodRestrict=OPTIONS").setBody().constant(expectedResponse);
            }
        };
    }

}
