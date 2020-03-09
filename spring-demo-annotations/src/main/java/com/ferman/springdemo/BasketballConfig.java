package com.ferman.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasketballConfig {

    @Bean
    public FortuneService awesomeFortuneService() {
        return new AwesomeFortuneService();
    }

    @Bean
    public Coach basketballCoach() {
        return new BasketballCoach(awesomeFortuneService());
    }
}
