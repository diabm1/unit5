package com.devmountain.unit5;

import java.util.Arrays;

public class MissingNumber {
    public static int findMissingNumber(int[] numbers, int maxNum) {
        // Calculate the sum of numbers from 1 to maxNum
        int expectedSum = (maxNum * (maxNum + 1)) / 2;

        // Calculate the actual sum of the given numbers
        int actualSum = Arrays.stream(numbers).sum();

        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;

        int missingNumber = findMissingNumber(numbers, maxNum);
        System.out.println("Missing number: " + missingNumber);
    }
}

