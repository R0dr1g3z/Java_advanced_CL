package com.example.regex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main06 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("people.csv");
        List<String> peopleFile = Files.readAllLines(path);
        List<Person> persons = new ArrayList<>();
        String regex = "^[\\d\\w]+@[a-zA-Z]+\\.(?:[a-zA-Z]+,){3}\\d+,[a-zA-Z]+$";
        for (String s : peopleFile){
            if (s.matches(regex)){
                String[] split = s.split(",");
                Person person = new Person(split[1], split[2], Integer.parseInt(split[3]), split[4]);
                persons.add(person);
            }
        }
    }
}
