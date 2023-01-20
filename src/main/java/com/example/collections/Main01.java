package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            elements.add(i + 10);
        }
        for (int i : elements) {
            System.out.println(i);
        }

        System.out.println("-----------");

        Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
