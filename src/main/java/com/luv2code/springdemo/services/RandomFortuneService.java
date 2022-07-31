package com.luv2code.springdemo.services;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private Random random = new Random(); // random number generator
    private File file = new File("src/main/resources/randomFortunes.txt");
    private List<String> randomFortunes;

    @Override
    public String getFortuneService() {
        return getRandomFortune();
    }

//    private String[] fortunes = {"Good Luck Today!", "All the luck!", "Sending Good Vibes!"};
//    private String getRandomFortune() {
//        int randomNumber = random.nextInt(fortunes.length);
//        return fortunes[randomNumber];
//    }

    public RandomFortuneService() {

        randomFortunes = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String fileLine;
            while ((fileLine = reader.readLine()) != null) {
                randomFortunes.add(fileLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getRandomFortune() {
        int randomNumber = random.nextInt(randomFortunes.size());
        return randomFortunes.get(randomNumber);
    }

}
