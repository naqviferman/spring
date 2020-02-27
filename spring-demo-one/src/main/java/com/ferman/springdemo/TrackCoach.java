package com.ferman.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "TrackCoach says: " + fortuneService.getFortune();
    }

    // init method
    public void myInit() {
        System.out.println("TrackCoach init method");
    }

    // destroy method
    public void myDestroy() {
        System.out.println("TrackCoach destroy method");
    }
}
