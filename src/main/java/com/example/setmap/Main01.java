package com.example.setmap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> strings = new HashSet<>();
        int count = 0;
        while(scan.hasNextLine()){
            String s = scan.nextLine();
            if (s.equals("exit")){
                break;
            }
            strings.add(s);
            count++;
        }
        System.out.println("Subtiles given: " + count + " Size collection: " + strings.size());
    }
}
