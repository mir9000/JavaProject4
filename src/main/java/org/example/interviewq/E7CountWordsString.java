package org.example.interviewq;

/*
7. Count the Number of Words in a String: Write a function to count the number of words in a given string.
Words are separated by spaces or punctuation.
 For example, the input "Hello, world!" should return 2.
 */

public class E7CountWordsString {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();

        String sentence="Hello,Syntax,students,of,batch19";
        System.out.println("Number of Words in a String is "+sentence.split("[,]").length);


    }
}
