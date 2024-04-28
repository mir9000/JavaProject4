package org.example.interviewq;

public class E1StringSwap {

    //1. Write a program to swap 2 String without a temporary variable?
    public static void main(String[] args) {
        String word1 = "Syntax";
        String word2 = "Corp";

        System.out.println("Before: ");
        System.out.println("str1 = " + word1);
        System.out.println("str2 = " + word2);






        word1 = word1.concat(word2);
        word2 = word1.substring(0, word1.length() - word2.length());
        word1 = word1.substring(word2.length());

        System.out.println("\nAfter:");
        System.out.println("str1 = " + word1);
        System.out.println("str2 = " + word2);


    }



}
