package com.ferman.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterAppDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FootBallCoach myFootBallCoach = context.getBean("myFootballCoach", FootBallCoach.class);
        System.out.println(myFootBallCoach.getDailyFortune());
        System.out.println(myFootBallCoach.getEmail());
        System.out.println(myFootBallCoach.getTeam());
        context.close();
    }
}
