package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIOCContext.xml");
        UserDatabase userDatabase = (UserDatabase) context.getBean("userDatabase");
        userDatabase.getUserDetails();
    }
}