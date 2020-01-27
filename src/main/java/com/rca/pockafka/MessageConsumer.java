package com.rca.pockafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    private final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);
    private final static String RCA_TOPIC = "rcatopico";
    private final static String JAVA_TOPIC = "javatopic";



    @KafkaListener(topics = RCA_TOPIC, groupId = "1")
    public void listenRca(String message) {
        LOGGER.info(String.format(">>>>> Mensagem recebida no tópico: %s, mensagem: %s", RCA_TOPIC, message));
    }

    @KafkaListener(topics = JAVA_TOPIC, groupId = "1")
    public void listenJava(String message) {
        LOGGER.info(String.format(">>>>> Mensagem recebida no tópico: %s, mensagem: %s", JAVA_TOPIC, message));
    }

}
