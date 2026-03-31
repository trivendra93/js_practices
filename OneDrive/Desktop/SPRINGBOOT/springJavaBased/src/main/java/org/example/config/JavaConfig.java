package org.example.config;

import org.example.Alian;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
    @Bean(name="com1")
    @Primary
   // @Scope("prototype")
    public Desktop desktop()
    {
        return new Desktop();
    }
    @Bean

    public Laptop laptop()
    {
        return new Laptop();
    }
    @Bean

    public Alian alian(Computer computer) { // Spring injects dependency
        return new Alian(25, computer);
    }
}

