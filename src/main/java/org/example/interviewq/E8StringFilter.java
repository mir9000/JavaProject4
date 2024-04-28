package org.example.interviewq;

//8. You have a list of strings and you want to keep only those that
//start with “A” and you want to return them in lower case".

import java.util.ArrayList;
import java.util.List;

public class E8StringFilter {

        public static List<String> filterAndLowerCase(List<String> inputList) {
            List<String> resultList = new ArrayList<>();
            for (String str : inputList) {
                if (str.startsWith("A")) {
                    resultList.add(str.toLowerCase());
                }
            }
            return resultList;
        }

        public static void main(String[] args) {
            List<String> inputList = new ArrayList<>();
            inputList.add("Apple");
            inputList.add("Banana");
            inputList.add("Austin");
            inputList.add("Cat");
            inputList.add("Afghanistan");

            List<String> filteredList = filterAndLowerCase(inputList);
            System.out.println("Filtered and Lower Case List: " + filteredList);
        }
    }



