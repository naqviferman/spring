package com.ferman.springdemo;

public class FootBallCoach implements Coach {

    private FortuneService fortuneService;

    private String email;
    private String team;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Daily 2 hours Free kick practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
