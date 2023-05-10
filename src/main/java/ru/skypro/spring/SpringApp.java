package ru.skypro.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.skypro.spring.config.AppConfig;
import ru.skypro.spring.pojo.Driver;

public class SpringApp {
    public static void main(String [] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Driver driver1 = context.getBean("Driver1", Driver.class);
        Driver driver2 = context.getBean("Driver2", Driver.class);
        Driver driver3 = context.getBean("Driver3", Driver.class);
        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);
    }
}
