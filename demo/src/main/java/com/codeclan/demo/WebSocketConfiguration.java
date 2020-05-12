package com.codeclan.demo;

import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@Component
@EnableWebSocketMessageBroker // <1>
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {

    static final String MESSAGE_PREFIX = "/employees"; //

    @Override
    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry)
    {
        stompEndpointRegistry.addEndpoint("/employees-socket").setAllowedOrigins("*");
        stompEndpointRegistry.addEndpoint("/employees-socket").setAllowedOrigins("*").withSockJS();
    }

//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry) {
//        registry.enableSimpleBroker("/topic");
//    }

//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry registry) { // <5>
//        registry.enableSimpleBroker(MESSAGE_PREFIX);
//        registry.setApplicationDestinationPrefixes("/app");
//    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app");
        registry.enableSimpleBroker("/topic");
    }
}
// end::code[]

