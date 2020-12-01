package com.liuwjg.provider.impl;

import com.liuwjg.provider.HelloService;

public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "hello"+name;
    }
}
