package com.itcorey.demoboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ：Corey
 * 17:26 2019/1/29
 */
@RestController
@EnableAutoConfiguration
public class HelloBoot {

    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "hello world.....";
    }

}
