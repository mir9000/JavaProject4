package org.example.interviewq;

/*
3. Reverse a String: Write a function to reverse a given string.
For example, given the input "Hello", the output should be "olleH".
 */

public class E3ReverseString {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello world");
        String str1=str.reverse().toString();
        System.out.println(str1);

    }
}
