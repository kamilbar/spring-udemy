package com.luv2code.springdemo;

import com.luv2code.springdemo.services.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30min on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }

}
