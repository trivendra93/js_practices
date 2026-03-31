package org.example;


import org.example.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
        Desktop dk=ac.getBean("com1",Desktop.class);
        dk.compile();
        Desktop dk1=ac.getBean(Desktop.class);
        dk1.compile();
        Alian alian= (Alian) ac.getBean("alian");
        alian.code();

    }
}