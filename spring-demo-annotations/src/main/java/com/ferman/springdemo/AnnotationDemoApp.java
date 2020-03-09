package com.ferman.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TennisCoach thatSillyCoach = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(thatSillyCoach.getDailyWorkout());
        System.out.println(thatSillyCoach.getDailyFortune());

        FootballCoach myFootballCoach = context.getBean(FootballCoach.class);
        System.out.println(myFootballCoach.getEmail());
        System.out.println(myFootballCoach.getTeam());

        System.out.println(myFootballCoach.getDailyFortune());

        context.close();
    }
}
