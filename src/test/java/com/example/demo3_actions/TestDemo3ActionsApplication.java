package com.example.demo3_actions;

import org.springframework.boot.SpringApplication;

public class TestDemo3ActionsApplication {

    public static void main(String[] args) {
        SpringApplication.from(Demo3ActionsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
