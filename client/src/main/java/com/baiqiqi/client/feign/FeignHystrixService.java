package com.baiqiqi.client.feign;

import org.springframework.stereotype.Component;

@Component
public class FeignHystrixService implements FeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Hi,bro,you are wrong!";
    }
}
