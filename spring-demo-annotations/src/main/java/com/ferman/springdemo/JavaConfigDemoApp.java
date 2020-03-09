package com.ferman.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach thatSillyCoach = context.getBean("tennisCoach", Coach.class);
//        TennisCoach thatSillyCoach = context.getBean(TennisCoach.class);

        System.out.println(thatSillyCoach.getDailyWorkout());
        System.out.println(thatSillyCoach.getDailyFortune());

//        SwimCoach mySwimCoach = context.getBean(SwimCoach.class);
//        System.out.println(mySwimCoach.getEmail());
//        System.out.println(mySwimCoach.getTeam());

//        System.out.println(mySwimCoach.getDailyFortune());

        context.close();
    }
}
