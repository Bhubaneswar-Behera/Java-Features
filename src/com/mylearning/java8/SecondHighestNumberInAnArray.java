package com.mylearning.java8;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumberInAnArray {

    public static void main(String[] args) {
        int[] numbers = {5,9,11,2,8,21,1};

        int secondHighestNumber = Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondHighestNumber);
    }

}
