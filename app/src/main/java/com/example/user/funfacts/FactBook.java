package com.example.user.funfacts;

import java.util.Random;

public class FactBook {
    // Properties
    private String[] mFacts = {
            "Coca-Cola would be green if coloring was not added to it.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones, by the time you are an adult you will have up 206.",
            "Bubble wrap was originally designed to be used as wallpaper.",
            "Some bamboo plants can grow almost a metre in one day.",
            "You cannot snore and dream at the same time.",
            "Driving the Kenyan way means fitting 19 people in a 9 passenger van.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked on earth when the Great Pyramid was being built."};

    // Methods
    public String getFact(){
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNum = randomGenerator.nextInt(mFacts.length);

        String fact = mFacts[randomNum];

        return fact;
    }

}
