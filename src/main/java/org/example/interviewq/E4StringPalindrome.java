package org.example.interviewq;
/*
Check if a String is Palindrome: Determine whether a given string is a
palindrome, which means it reads the same forwards and backward. For
example, "madam" is a palindrome.
*/


import java.util.Arrays;

public class E4StringPalindrome {
    public static void main(String[] args) {
        String originalStr="madam";
        StringBuilder st=new StringBuilder(originalStr);
        st.reverse();
        String reversedStr=st.toString();
        if(originalStr.equals(reversedStr)){
            System.out.println(originalStr+ " is a palindrome");
        }else {
            System.out.println(originalStr+ " is not palindrome");
        }




    }
    }






