package com.rca.pockafka.controller;

import com.rca.pockafka.MessageProducer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class SendMessageController {

    private final MessageProducer messageProducer;

    public SendMessageController(final MessageProducer messageProducer){
        this.messageProducer = messageProducer;
    }

    @PostMapping(value = "/{topic}" ,consumes = "text/plain")
    public void sendMessage(@RequestBody String message, @PathVariable("topic") final String topic){
        messageProducer.sendMessage(topic, message);
    }

}
