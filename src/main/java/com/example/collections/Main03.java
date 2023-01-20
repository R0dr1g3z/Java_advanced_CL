package com.example.collections;

import java.util.ArrayList;
import java.util.List;

public class Main03 {
    public static void main(String[] args) {
        List<City> cities = initialize();
        for (City c : firstSubList(cities, 0, 2)){
            System.out.println(c.getName());
        }
    }

    public static List<City> initialize(){
        List<City> cities = new ArrayList<>();
        cities.add(new City("Warszawa", 500000));
        cities.add(new City("Gdanks", 1231432));
        cities.add(new City("Gniezno", 5234));
        cities.add(new City("Poznan", 12332));
        cities.add(new City("Lodz", 23424));
        return cities;
    }
    
    public static List<City> firstSubList(List<City> list, int start, int end){
        return list.subList(start, end);
    }
}
