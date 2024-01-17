package org.example;
import java.util.Arrays;
import java.util.List;

public class AvgCalculator{
    public static void main(String[] args){
        List<Integer>nums=Arrays.asList(10,20,30);
        double avg=CalAvg(nums);
        System.out.println("Avg"+avg);
    }
    public static double CalAvg(List<Integer>nums){
        return nums.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

}