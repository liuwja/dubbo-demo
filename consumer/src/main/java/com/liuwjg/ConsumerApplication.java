package com.liuwjg;

import com.liuwjg.consumer.TestService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        TestService service = (TestService) context.getBean("testService");
        service.sayHello("liuwjg");
        System.in.read();

    }
}
