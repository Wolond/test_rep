package com.itone.ahikyan.homeworks.Lesson3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

@SpringBootApplication
@PropertySource("app.yaml")
public class Main {
    public static void main(String[] args) throws IOException {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        A a = context.getBean(A.class);
        B b = context.getBean(B.class);
        C c = context.getBean(C.class);
        D d = context.getBean(D.class);

        FileReader fileReader = context.getBean(FileReader.class);
        fileReader.readTextFile();
        d.printProperty();
    }
}