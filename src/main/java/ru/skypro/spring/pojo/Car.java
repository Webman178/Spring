package ru.skypro.spring.pojo;

import javax.annotation.PostConstruct;

public class Car extends Transport{
    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String toString() {
        return "Car: "+this.getBrand()+" "+this.getModel();
    }
    @Override
    protected void message() {
        System.out.println("< Car >  готов к работе");
    }
}
