package com.ferman.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
public class PropertyFileFortuneService implements FortuneService {

    @Value("${fortune_1}")
    private String fortune_1;
    @Value("${fortune_2}")
    private String fortune_3;
    @Value("${fortune_3}")
    private String fortune_2;

    private String[] fortunes;

    public PropertyFileFortuneService() {
        System.out.println("PropertyFileFortuneService: Default Constructor");
        System.out.println("fortune_1 = " + fortune_1);     // Would be null as @Value has not run till this point
    }

    @PostConstruct
    public void dataSetup() {
        fortunes = new String[3];
        fortunes[0] = fortune_1;
        fortunes[1] = fortune_2;
        fortunes[2] = fortune_3;
    }

    @Override
    public String getFortune() {
        Random random = new Random();
        return fortunes[random.nextInt(fortunes.length)];
    }
}
