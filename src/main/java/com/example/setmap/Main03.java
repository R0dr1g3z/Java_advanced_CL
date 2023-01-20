package com.example.setmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main03 {
    public static void main(String[] args) {
        Map<String, Country> map = getMap(initialize());
        for (String key : map.keySet()){
            System.out.println(key + " - " + map.get(key).getName());
        }
    }

    public static List<Country> initialize(){
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Poland", "Warsaw"));
        countries.add(new Country("USA", "Washington"));
        countries.add(new Country("Spanish", "Madrid"));
        countries.add(new Country("Germany", "Berlin"));
        countries.add(new Country("UK", "London"));
        return countries;
    }
    public static Map<String, Country> getMap(List<Country> list){
        Map<String, Country> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i).getCapital(), list.get(i));
        }
        return map;
    }
}
