package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");

        Alian alian= (Alian) ac.getBean("alian1");
        alian.code();

    }
}