package com.example.kafkademo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

@EnableKafka
@Configuration
public class ConsumerConfig {

    private static Logger LOGGER = LoggerFactory.getLogger(ConsumerConfig.class);

    private static final String topic = "test-topic";

    @KafkaListener(topics = topic, groupId = "email")
    public void consumerFromKafka(Object payload){
        LOGGER.info("Payload from Kafka : {}", payload);
    }
}
