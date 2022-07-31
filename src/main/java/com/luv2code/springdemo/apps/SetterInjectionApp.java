package com.luv2code.springdemo.apps;

import com.luv2code.springdemo.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionApp {

    public static void main(String[] args) {

        // loading spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve beans from the container
        CricketCoach theCoach = context.getBean("mySetterCoach", CricketCoach.class);

        // do stuff on beans
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // close the container
        context.close();

    }

}
