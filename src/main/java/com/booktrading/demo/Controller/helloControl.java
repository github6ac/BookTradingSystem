package com.booktrading.demo.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class helloControl {
    @RequestMapping("/hello")
    public String helloworld()
    {
        return "hello world";
    }
}
