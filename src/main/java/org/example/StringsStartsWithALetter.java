package org.example;

import java.util.Arrays;
import java.util.List;

public class StringsStartsWithALetter {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("saiKishore", "karthik", "nandu", "saiCharan");
        System.out.println("Original list: " + s);
        int countWithS = countOfStartsWithS(s);
        System.out.println("Count of strings that start with 's': " + countWithS);
    }

    public static Integer countOfStartsWithS(List<String> s) {
        return (int) s.stream().filter(sw -> sw.startsWith("s")).count();
    }
}
