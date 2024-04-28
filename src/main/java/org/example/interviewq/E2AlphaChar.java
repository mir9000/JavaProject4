package org.example.interviewq;

public class E2AlphaChar {

    // Find out how many alpha characters are present in a string?

    public static void main(String[] args) {

            String str = "ABcDEfGHi";
            System.out.println(str.replaceAll("[^A-Z]", "").length());
        }

    }