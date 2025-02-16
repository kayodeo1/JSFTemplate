package com.example;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("helloWorld") // This makes it accessible in JSF as #{helloWorld}
@RequestScoped
public class HelloWorld {

    

    public String getMessage() {
        return "Hello, this is Kayode's JSF template!,Clone this project to get started with building enterprise apps with JSF and prime faces";
    }
    
}
