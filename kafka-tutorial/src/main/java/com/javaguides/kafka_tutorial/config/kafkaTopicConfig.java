package com.javaguides.kafka_tutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {

    @Bean
    public NewTopic javaGuiddesTopic (){
        return TopicBuilder.name("javaguides").build();
    }
}
