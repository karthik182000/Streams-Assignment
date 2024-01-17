package org.example;

import java.util.*;
import java.util.stream.Collectors;


public class DuplicateElements {
    public static void main(String[]args){
        List<Integer> nums= Arrays.asList(1, 2, 4, 6, 7, 2, 4, 2, 1);
        System.out.println("original list"+nums);

        List<Integer> uniqueNums=removeDup(nums);
        System.out.println("List without dups"+uniqueNums);
    }
    public static List<Integer> removeDup(List<Integer>nums){
        return nums.stream().distinct().collect(Collectors.toList());
    }
}
