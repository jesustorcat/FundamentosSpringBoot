package com.fundamentos.Fundamentos.components;
import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency {

    @Override
    public void hello() {
        System.out.println("Hello World!");
    }
}
