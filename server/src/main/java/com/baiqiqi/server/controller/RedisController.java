package com.baiqiqi.server.controller;

import com.baiqiqi.server.redis.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RedisController {

    @Autowired
    RedisDao redisDao;

    @GetMapping("/redis")
    public String redisTest(){
        redisDao.setKey("hello","spring cloud");
        return redisDao.getValue("hello");
    }
}
