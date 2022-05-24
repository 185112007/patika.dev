package com.gafur.springcore.bean;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "helloWorld")
@ApplicationScoped
@Setter
@Getter
public class JsfBean {
    private String message;

    public JsfBean() {
        this.message = "Spring Boot Eğitimine Hoş Geldiniz";
    }
}
