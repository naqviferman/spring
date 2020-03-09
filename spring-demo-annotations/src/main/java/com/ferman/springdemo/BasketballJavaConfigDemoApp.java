package com.ferman.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasketballJavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("basketballCoach", Coach.class);

        System.out.println(coach.getDailyFortune());

        context.close();    }
}
