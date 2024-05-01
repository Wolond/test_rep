package com.itone.ahikyan.homeworks.Lesson3;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.itone.ahikyan.homeworks.Lesson3")
public class AppConfig {


    @Bean
    @Scope(value = "prototype")
    public D d() {
        return new D();
    }
}
