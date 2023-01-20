package com.example.regex;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String regex = "^(\\d+[+\\-*/]?)+[^+\\-*/]=\\d+$";
        while(scan.hasNextLine()){
            String data = scan.nextLine().replaceAll("\\s+", "");
            if (data.equals("exit")){
                break;
            }
            if (data.matches(regex)){
                try(FileWriter fileWriter = new FileWriter("operations.txt", true)){
                    fileWriter.append(data + "\n");
                }
            }
        }
    }
}
