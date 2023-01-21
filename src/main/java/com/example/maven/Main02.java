package com.example.maven;

import java.util.List;

import com.google.common.collect.Lists;

public class Main02 {
    public static void main(String[] args) {
        List<String> names = Lists.newArrayList("Arek", "Czarek", "Darek");
        List<String> reversed = Lists.reverse(names);
        System.out.println(reversed);
    }
}
