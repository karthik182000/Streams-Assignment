package org.example;

import java.util.List;
import java.util.Arrays;

public class SumCalculator {
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        System.out.println("original list "+ list);

        int evenSum=CalEvenSum(list);
        System.out.println("evensum is "+evenSum);

        int oddSum=CalOddSum(list);
        System.out.println("oddsum is "+oddSum);
    }

    public static int CalEvenSum(List<Integer>list){
        return list.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
    }

    public static int CalOddSum(List<Integer>list){
        return list.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();
    }


}


