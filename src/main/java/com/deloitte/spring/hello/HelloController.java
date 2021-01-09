package com.deloitte.spring.hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloservice;
    @RequestMapping("/hello")
    public String HelloWorld() {
        return helloservice.HelloWorld();
    }
}
