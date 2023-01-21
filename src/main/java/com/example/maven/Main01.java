package com.example.maven;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main01 {
    public static void main(String[] args) {
        Connection connect = Jsoup.connect("https://dev.java/news/");
        try {
            Document document = connect.get();
            Elements links = document.select("a.title");
            for (Element elem : links) {
                System.out.println(elem.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
