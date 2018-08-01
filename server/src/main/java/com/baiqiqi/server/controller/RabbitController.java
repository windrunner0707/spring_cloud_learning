package com.baiqiqi.server.controller;

import com.baiqiqi.server.mq.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RabbitController {

    @Autowired
    Producer producer;
    @GetMapping("/message")
    public void message(){
        producer.send();
    }

}
