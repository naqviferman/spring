package com.ferman.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

//    @Autowired
//    @Qualifier("RESTFortuneService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Tennis Coach: Default Constructor");
    }

    @Autowired
    public TennisCoach(@Qualifier("happyFortuneService") FortuneService fortuneService) {
        System.out.println("Tennis Coach: Parameterized Constructor");
        this.fortuneService = fortuneService;
    }

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

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
