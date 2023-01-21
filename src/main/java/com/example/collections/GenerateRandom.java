package com.example.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {
    public static Map<Integer, Integer> checkRand(int amount, int interval){
        Random r = new Random();
        Map<Integer, Integer> mapRandom = new HashMap<>();
        for (int i = 0; i < amount; i++) {
            mapRandom.put(i, r.nextInt(interval));
        }
        return mapRandom;
    }
}
