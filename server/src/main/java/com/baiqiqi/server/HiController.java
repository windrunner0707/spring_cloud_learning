package com.baiqiqi.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HiController {

    @GetMapping("/hi")
    public String sayHello(String name){
        return "Hello " + name;
    }
}
