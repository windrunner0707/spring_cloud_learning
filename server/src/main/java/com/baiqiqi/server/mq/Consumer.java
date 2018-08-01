package com.baiqiqi.server.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RabbitListener(queues = RabbitMqConfig.queueName)
public class Consumer {

    @RabbitHandler
    public void consumer(String message){
        log.info("从队列获取到的消息:{}",message);
    }

}
