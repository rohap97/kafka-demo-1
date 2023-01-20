package com.example.kafkademo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@SpringBootApplication
public class KafkaDemo1Application {


	public static void main(String[] args) {
		SpringApplication.run(KafkaDemo1Application.class, args);
	}

}
