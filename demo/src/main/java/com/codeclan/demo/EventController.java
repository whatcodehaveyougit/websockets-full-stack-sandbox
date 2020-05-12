//package com.codeclan.demo;
//
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.util.HtmlUtils;
//
//
//@Controller
//public class EventController {
//
//    @MessageMapping("/employees-socket")
//    @SendTo("/employees")
//    public void broadcastNews(@Payload String message) {
//    }
//
//}