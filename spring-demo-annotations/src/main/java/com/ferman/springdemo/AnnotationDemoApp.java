package com.ferman.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TennisCoach thatSillyCoach = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(thatSillyCoach.getDailyWorkout());
        System.out.println(thatSillyCoach.getDailyFortune());

//        SwimCoach mySwimCoach = context.getBean(SwimCoach.class);
//        System.out.println(mySwimCoach.getEmail());
//        System.out.println(mySwimCoach.getTeam());

//        System.out.println(mySwimCoach.getDailyFortune());

        context.close();
    }
}
