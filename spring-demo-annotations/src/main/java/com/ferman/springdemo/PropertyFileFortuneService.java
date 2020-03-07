package com.ferman.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PropertyFileFortuneService implements FortuneService {

    @Value("${fortune_1}")
    private String fortune_1;
    @Value("${fortune_2}")
    private String fortune_3;
    @Value("${fortune_3}")
    private String fortune_2;

    public PropertyFileFortuneService() {
        System.out.println("PropertyFileFortuneService: Default Constructor");
        System.out.println("fortune_1 = " + fortune_1);     // Would be null
    }

    @Override
    public String getFortune() {
        String[] fortunes = {fortune_1, fortune_2, fortune_3};
        Random random = new Random();
        return fortunes[random.nextInt(fortunes.length)];
    }
}
