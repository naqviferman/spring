package com.ferman.springdemo;

public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    public BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
