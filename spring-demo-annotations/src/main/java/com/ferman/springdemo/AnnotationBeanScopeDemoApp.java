package com.ferman.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach_1 = context.getBean("tennisCoach", Coach.class);
        Coach coach_2 = context.getBean("tennisCoach", Coach.class);

        System.out.println(coach_1 == coach_2 ? "Same object" : "Different Object");

        context.close();
    }
}
