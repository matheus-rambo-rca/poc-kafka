package com.rca.pockafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    private final Logger LOGGER = LoggerFactory.getLogger(MessageProducer.class);


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(final String topic, final String message) {
        LOGGER.info(String.format(">>>>> Enviando mensagem para o tópico: %s, mensagem: %s", topic, message));
        kafkaTemplate.send(topic, message);
    }

}
