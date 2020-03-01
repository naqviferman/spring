package com.ferman.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TennisCoach thatSillyCoach = context.getBean("thatSillyCoach", TennisCoach.class);

        System.out.println(thatSillyCoach.getDailyWorkout());

        context.close();
    }
}
