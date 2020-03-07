package com.ferman.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

//    @Autowired
//    @Qualifier("RESTFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Tennis Coach: Default Constructor");
    }

    /*@Autowired
    public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        System.out.println("Tennis Coach: Parameterized Constructor");
        this.fortuneService = fortuneService;
    }*/

    @Autowired
    @Qualifier("randomFortuneService")
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Tennis Coach: Setting Fortune Service");
        this.fortuneService = fortuneService;
    }

    /*@Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println("Tennis Coach: Inside doSomeCrazyStuff");
        this.fortuneService = fortuneService;
    }*/

    @PostConstruct
    public void myInit() {
        System.out.println("Custom init method");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("Custom destroy method");
    }


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
