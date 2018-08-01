package com.baiqiqi.server.mq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class Producer {

    @Autowired
    private AmqpTemplate rabbitMqTemplate ;

    public void send(){
        String context = "hello" + new Date() ;
        log.info("正在向队列发送消息：{}",context);
        this.rabbitMqTemplate.convertAndSend(RabbitMqConfig.queueName,context);
    }
}
