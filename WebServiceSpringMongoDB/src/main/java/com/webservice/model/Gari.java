package com.webservice.model;

import org.springframework.data.annotation.Id;


public class Gari {
    @Id
    private String id;
    private String name;
    private int age;
    private String funcao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String email) {
        this.funcao = email;
    }

}