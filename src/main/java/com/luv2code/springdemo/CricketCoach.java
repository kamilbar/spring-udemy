package com.luv2code.springdemo;

import com.luv2code.springdemo.services.FortuneService;

// example of setter injection
public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortuneService();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("  -> Cricket Coach: inside setter method - setFortune Service");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress (String emailAddress) {
        System.out.println("  -> Cricket Coach: inside setter method - setAddress");
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setTeam (String team) {
        System.out.println("  -> Cricket Coach: inside setter method - setTeam");
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public CricketCoach() {
        System.out.println(" > Inside Cricket Coach Constructor");
    }

}
