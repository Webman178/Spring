package ru.skypro.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Driver {

    private Transport transport;
    private String name;

    public Driver(String name, Transport ts) {
        this.name=name;
        this.transport=ts;
    }
    public Driver(String name) {
        this.name=name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver: "+name + " - "+transport;
    }
}
