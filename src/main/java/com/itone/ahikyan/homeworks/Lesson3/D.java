package com.itone.ahikyan.homeworks.Lesson3;

import org.springframework.beans.factory.annotation.Value;

public class D {
    @Value("${app.property}")
    private String property;

    public void printProperty() {
        System.out.println(property);
    }
}
