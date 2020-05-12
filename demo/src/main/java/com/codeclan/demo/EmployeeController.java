package com.codeclan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageExceptionHandler;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/employees" )
public class EmployeeController {

    @Autowired
    EmployeeRepo employeeRepo;

//    @RequestMapping(value = "/test-notification", method = RequestMethod.POST)
//    public void testNotification(@RequestBody String recipientId) throws InterruptedException {
//        this.template.convertAndSendToUser(recipientId,"/greetings", new Notify("ALERT: There is a new notification for you!"));
//    }
}
