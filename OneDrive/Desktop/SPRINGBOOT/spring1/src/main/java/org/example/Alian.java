package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Alian {
    private int age;

    private Computer com;
    public Alian(){
        System.out.println("alian object is created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    //    public Alian(int age, Laptop laptop) {
//        this.age = age;
//        this.laptop = laptop;
//    }

    //    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLap(Laptop laptop) {//here property name should be same in spring.xml
//        this.laptop = laptop;
//    }

    public void code()
    {
        System.out.println("coding...");
        com.compile();
    }
}
