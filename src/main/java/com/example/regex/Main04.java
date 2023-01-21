package com.example.regex;

public class Main04 {
    private static final String REGEX1 = "\\d+\\.\\d+"; //float number
    private static final String REGEX2 = "\\d+\\.\\d+\\w+[+\\-*\\/]+\\d+"; //scientific notation
    private static final String REGEX3 = "([0-2]\\d|3[01])\\/(0[0-9]|1[0-2])\\/\\d{4}"; //date format dd/mm/yyyy
}
