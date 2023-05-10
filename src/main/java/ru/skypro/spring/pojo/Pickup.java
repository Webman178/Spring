package ru.skypro.spring.pojo;

public class Pickup extends Transport{
    public Pickup(String brand, String model) {
        super(brand, model);
    }
    @Override
    public String toString() {
        return "Pickup: "+this.getBrand()+" "+this.getModel();
    }
    @Override
    protected void message() {
        System.out.println("< Pickup >  готов к работе");
    }
}
