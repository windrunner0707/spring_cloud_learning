package com.baiqiqi.server.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    public static final String queueName = "hello" ;

    @Bean
    public Queue rabbitMqQueue(){
        return new Queue(queueName);
    }

}
