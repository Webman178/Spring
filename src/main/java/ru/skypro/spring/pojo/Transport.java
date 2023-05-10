package ru.skypro.spring.pojo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public abstract class Transport {
    private String brand;
    private String model;

    public Transport(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @PostConstruct
    protected void message() {
        System.out.println("<Transport>  готов к работе");
    }
}
