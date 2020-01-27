package com.rca.pockafka.configuration;

import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class TopicConfig {

    /*
        Precisamos ter o kafka em nossa máquina.
     https://www.apache.org/dyn/closer.cgi?path=/kafka/2.4.0/kafka_2.12-2.4.0.tgz

      bin/kafka-topics.sh --create \
            --zookeeper <host>:<porta> \
            --replication-factor <fator_replicacao> --partitions <particoes> \
            --topic <nome_topico>
        */

    //@Value(value = "${kafka.bootstrap-address}")
    private String  bootstrapAddress  = "http://localhost:2181";
    private Short   replicationFactor = 1;
    private Integer partitions        = 1;

    private Map<String, Object>  configuration(){
        // o 1 no construtor significa o tamanho inical do hashmap.
        final Map<String, Object> configs = new HashMap<>(1);
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        return configs;
    }

    @Bean
    public KafkaAdmin kafkaAdmin(){
        return new KafkaAdmin(configuration());
    }



}
