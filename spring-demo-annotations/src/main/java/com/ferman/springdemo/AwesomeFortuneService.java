package com.ferman.springdemo;

public class AwesomeFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "It is going to be an awesome day";
    }
}
