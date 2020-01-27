package com.rca.pockafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    private final Logger LOGGER = LoggerFactory.getLogger(MessageProducer.class);

    private final static String RCA_TOPIC = "rcatopico";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        LOGGER.info(String.format(">>>>> Enviando mensagem para o tópico: %s, mensagem: %s", RCA_TOPIC, message));
        kafkaTemplate.send(RCA_TOPIC, message);
    }

}
