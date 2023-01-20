package com.example.collections;

import java.util.Collections;
import java.util.List;

public class Main04 {
    public static void main(String[] args) {
        List<City> cities = Main03.initialize();
        for (City c : cities){
            System.out.println(c.getName());
        }
        System.out.println("-------");
        for (City c : reverse(cities)){
            System.out.println(c.getName());
        }
    }

    public static List<City> reverse(List<City> list){
        Collections.reverse(list);
        return list;
    }
}
