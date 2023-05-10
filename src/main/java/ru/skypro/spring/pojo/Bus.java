package ru.skypro.spring.pojo;

public class Bus extends Transport{
    public Bus(String brand, String model) {
        super(brand, model);
    }
    @Override
    public String toString() {
        return "Bus: "+this.getBrand()+" "+this.getModel();
    }
    @Override
    protected void message() {
        System.out.println("< Bus >  готов к работе");
    }
}
