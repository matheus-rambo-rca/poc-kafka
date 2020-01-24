package com.rca.pockafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "rcatopico", groupId = "1")
    public void listen(String message) {
        System.out.println("Received Messasge in group foo: " + message);
    }

}
