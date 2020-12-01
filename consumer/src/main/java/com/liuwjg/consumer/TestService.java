package com.liuwjg.consumer;

import com.liuwjg.provider.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    HelloService helloService;

    public void sayHello(String name) {
        String s = helloService.sayHello(name);
        System.out.println(s);
    }
}
