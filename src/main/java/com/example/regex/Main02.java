package com.example.regex;

import java.util.regex.Pattern;

public class Main02 {
    public static void main(String[] args) {
        System.out.println(verifyPassword("Password567"));
        System.out.println(verifyPassword("password567"));
        System.out.println(verifyPassword("Password"));
        System.out.println(verifyPassword("PASSWORD567"));
    }

    public static boolean verifyPassword(String password){
        Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])\\w{10,15}");
        return pattern.matcher(password).matches();
    }
}
