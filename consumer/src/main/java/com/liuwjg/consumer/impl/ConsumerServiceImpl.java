package com.liuwjg.consumer.impl;

import com.liuwjg.consumer.IConsumerService;

public class ConsumerServiceImpl implements IConsumerService {
    public String sayGoodbye(String name) {
        return "GOODBYE "+name;
    }
}
