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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform queries, inserts, updates or deletes in a relational database using
 * MyBatis.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MyBatisBeanEndpointBuilderFactory {


    /**
     * Builder for endpoint for the MyBatis Bean component.
     */
    public interface MyBatisBeanEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedMyBatisBeanEndpointBuilder advanced() {
            return (AdvancedMyBatisBeanEndpointBuilder) this;
        }
        /**
         * The executor type to be used while executing statements. simple -
         * executor does nothing special. reuse - executor reuses prepared
         * statements. batch - executor reuses statements and batches updates.
         * 
         * The option is a: <code>org.apache.ibatis.session.ExecutorType</code>
         * type.
         * 
         * Default: SIMPLE
         * Group: producer
         */
        default MyBatisBeanEndpointBuilder executorType(
                ExecutorType executorType) {
            doSetProperty("executorType", executorType);
            return this;
        }
        /**
         * The executor type to be used while executing statements. simple -
         * executor does nothing special. reuse - executor reuses prepared
         * statements. batch - executor reuses statements and batches updates.
         * 
         * The option will be converted to a
         * <code>org.apache.ibatis.session.ExecutorType</code> type.
         * 
         * Default: SIMPLE
         * Group: producer
         */
        default MyBatisBeanEndpointBuilder executorType(String executorType) {
            doSetProperty("executorType", executorType);
            return this;
        }
        /**
         * User the header value for input parameters instead of the message
         * body. By default, inputHeader == null and the input parameters are
         * taken from the message body. If outputHeader is set, the value is
         * used and query parameters will be taken from the header instead of
         * the body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MyBatisBeanEndpointBuilder inputHeader(String inputHeader) {
            doSetProperty("inputHeader", inputHeader);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MyBatisBeanEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MyBatisBeanEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Store the query result in a header instead of the message body. By
         * default, outputHeader == null and the query result is stored in the
         * message body, any existing content in the message body is discarded.
         * If outputHeader is set, the value is used as the name of the header
         * to store the query result and the original message body is preserved.
         * Setting outputHeader will also omit populating the default
         * CamelMyBatisResult header since it would be the same as outputHeader
         * all the time.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default MyBatisBeanEndpointBuilder outputHeader(String outputHeader) {
            doSetProperty("outputHeader", outputHeader);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the MyBatis Bean component.
     */
    public interface AdvancedMyBatisBeanEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MyBatisBeanEndpointBuilder basic() {
            return (MyBatisBeanEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMyBatisBeanEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMyBatisBeanEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMyBatisBeanEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMyBatisBeanEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for <code>org.apache.ibatis.session.ExecutorType</code> enum.
     */
    enum ExecutorType {
        SIMPLE,
        REUSE,
        BATCH;
    }

    public interface MyBatisBeanBuilders {
        /**
         * MyBatis Bean (camel-mybatis)
         * Perform queries, inserts, updates or deletes in a relational database
         * using MyBatis.
         * 
         * Category: database,sql
         * Since: 2.22
         * Maven coordinates: org.apache.camel:camel-mybatis
         * 
         * Syntax: <code>mybatis-bean:beanName:methodName</code>
         * 
         * Path parameter: beanName (required)
         * Name of the bean with the MyBatis annotations. This can either by a
         * type alias or a FQN class name.
         * 
         * Path parameter: methodName (required)
         * Name of the method on the bean that has the SQL query to be executed.
         */
        default MyBatisBeanEndpointBuilder mybatisBean(String path) {
            return MyBatisBeanEndpointBuilderFactory.mybatisBean(path);
        }
    }
    /**
     * MyBatis Bean (camel-mybatis)
     * Perform queries, inserts, updates or deletes in a relational database
     * using MyBatis.
     * 
     * Category: database,sql
     * Since: 2.22
     * Maven coordinates: org.apache.camel:camel-mybatis
     * 
     * Syntax: <code>mybatis-bean:beanName:methodName</code>
     * 
     * Path parameter: beanName (required)
     * Name of the bean with the MyBatis annotations. This can either by a type
     * alias or a FQN class name.
     * 
     * Path parameter: methodName (required)
     * Name of the method on the bean that has the SQL query to be executed.
     */
    static MyBatisBeanEndpointBuilder mybatisBean(String path) {
        class MyBatisBeanEndpointBuilderImpl extends AbstractEndpointBuilder implements MyBatisBeanEndpointBuilder, AdvancedMyBatisBeanEndpointBuilder {
            public MyBatisBeanEndpointBuilderImpl(String path) {
                super("mybatis-bean", path);
            }
        }
        return new MyBatisBeanEndpointBuilderImpl(path);
    }
}