package com.ferman.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        System.out.println("Starting Application");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // will run bean init method (Other than prototype scope)

        System.out.println("Context loaded");

        Coach coach = context.getBean("myCoach", Coach.class);

        // will run bean init method (for prototype scope)

        System.out.println(coach.getDailyWorkout());

        // will run bean destroy method

        context.close();

        System.out.println("Context closed");
    }
}
