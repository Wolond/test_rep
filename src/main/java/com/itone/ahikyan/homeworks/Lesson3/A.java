package com.itone.ahikyan.homeworks.Lesson3;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class A {
    private final B b;
    private final C c;

    public A(B b, @Lazy C c) {
        this.b = b;
        this.c = c;
    }
}