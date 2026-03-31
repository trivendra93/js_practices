package org.example;

public class Desktop implements Computer{
    public Desktop()
    {
        System.out.println("desktop object created");
    }
    @Override
    public void compile() {
        System.out.println("compiled by desktop");
    }
}
