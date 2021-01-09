package com.deloitte.spring.hello;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class HelloService {

    public String HelloWorld() {
        return "Hello World";
    }
}
