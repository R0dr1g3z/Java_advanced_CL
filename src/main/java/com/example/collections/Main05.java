package com.example.collections;

import java.util.Map;

public class Main05 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = GenerateRandom.checkRand(5, 200);
        for (int i : map.keySet()){
            System.out.println(i + " " + map.get(i));
        }

    }
}
