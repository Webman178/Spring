package ru.skypro.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.skypro.spring.pojo.*;

@Configuration
public class AppConfig {
    @Bean(name="Car")
    public Transport getTransport1() {
        return new Car("Lada","Vesta");
    }
    @Bean(name="Bus")
    public Transport getTransport2() {
        return new Bus("Bus1","1");
    }

    @Bean(name="Pickup")
    public Transport getTransport3() {
        return new Pickup("Laz","2");
    }


    @Bean(name = "Driver1")
    public Driver getDriver1() {
        return new Driver("Vasa",getTransport1());
    }
    @Bean(name = "Driver2")
    public Driver getDriver2() {
        return new Driver("Lesha",getTransport2());
    }
    @Bean(name = "Driver3")
    public Driver getDriver3() {
        return new Driver("Peta",getTransport3());
    }
}
