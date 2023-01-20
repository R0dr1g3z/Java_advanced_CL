package com.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main01 {
    public static void main(String[] args) {
        System.out.println(verifyEmail("Tru3Mail@gmail.com"));
        System.out.println(verifyEmail("FalseMail@asdas"));
    }

    public static boolean verifyEmail(String email){
        Pattern pattern = Pattern.compile(".+@\\w+\\.\\w+");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
