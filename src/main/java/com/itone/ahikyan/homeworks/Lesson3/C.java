package com.itone.ahikyan.homeworks.Lesson3;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class C {
    private final A a;
    private final D d;

    public C(@Lazy A a, D d) {
        this.a = a;
        this.d = d;
    }
}