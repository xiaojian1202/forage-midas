package com.jpmc.midascore;

import com.jpmc.midascore.foundation.Transaction;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
public class MidasCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MidasCoreApplication.class, args);
    }

    @KafkaListener(
            groupId = "{spring.kafka.consumer.group-id}",
            topics="${general.kafka-topic}"
    )
    public void listen(Transaction transaction) {
        System.out.println(transaction);
    }
}
