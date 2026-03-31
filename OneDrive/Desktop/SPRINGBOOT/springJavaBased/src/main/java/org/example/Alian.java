package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Alian {
    private int age;
   //@Autowired  feild injection.
    private Computer com;
    @Autowired
    public Alian(int i, Computer com) {   // Spring injects dependency
        this.com = com;
        this.age = 25;
    }


    //    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public Computer getCom() {
//        return com;
//    }
//    //@Autowired setter injection
//    public void setCom(Computer com) {
//        this.com = com;
//    }
  public void code()
  {
      System.out.println("coding..");
      com.compile();
  }

}
