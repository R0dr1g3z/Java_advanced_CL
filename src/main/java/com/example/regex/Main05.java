package com.example.regex;

public class Main05 {
    public static void main(String[] args) {
        System.out.println(verifyLogin("Testing523-_True"));
        System.out.println(verifyLogin("52False"));
        System.out.println(verifyLogin("Fal3"));
    }

    public static boolean verifyLogin(String login){
        return login.matches("^[^\\d][\\w\\d\\-_]{5,}$");
    }
}
