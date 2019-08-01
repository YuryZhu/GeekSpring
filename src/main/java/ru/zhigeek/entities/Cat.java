package ru.zhigeek.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Кошка";
}
