package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCaseConverter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("karthik","nandu");

        System.out.println("Original List: " + words);

        List<String> uppercaseList = convertToUppercase(words);
        System.out.println("Uppercase List: " + uppercaseList);

        List<String> lowercaseList = convertToLowercase(words);
        System.out.println("Lowercase List: " + lowercaseList);
    }

    public static List<String> convertToUppercase(List<String> words) {
        return words.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static List<String> convertToLowercase(List<String> words) {
        return words.stream().map(String::toLowerCase).collect(Collectors.toList());
    }
}

