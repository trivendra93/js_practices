package org.example;

public class Desktop implements Computer {
    public Desktop()
    {
        System.out.println("desktop object");
    }
    @Override
    public void compile()
    {
        System.out.println("compiled.by Desktop");
    }
}
