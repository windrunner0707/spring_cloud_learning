package com.baiqiqi.client.ribbon_rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;
    @RequestMapping(value = "/ribbon/hi")
    public String hiController(@RequestParam String name){
        return ribbonService.hiService(name);
    }

}
