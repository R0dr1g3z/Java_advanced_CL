package com.example.setmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        Map<String, String> opposites = getMap();
        Set<String> keys = opposites.keySet();
        System.out.println("Indicate a opposite\n");
        for (String s : keys){
            System.out.println(s);
            String answer = scan.nextLine();
            System.out.println();
            if (answer.equals(opposites.get(s))){
                count++;
            }
        }
        System.out.println("Points: " + count + "/" + opposites.size());
    }

    public static Map<String, String> getMap() {
        Map<String, String> opposites = new HashMap<>();
        opposites.put("hot", "cold");
        opposites.put("dark", "light");
        opposites.put("black", "white");
        opposites.put("hard", "soft");
        opposites.put("silence", "loud");
        return opposites;
    }
}
