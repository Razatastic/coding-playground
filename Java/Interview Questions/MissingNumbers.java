
/*
 * Problem: Given an array containing all the numbers from 1 to n except two,
 * find the two missing numbers. e.g. - missing([4, 2, 3]) = 1, 5
 */

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] missing = { 1, 4, 2, 3, 7 };
        for (int i = 0; i < 2; i++) {
            System.out.println("The " + (i + 1) + "st number missing is " + isMissing(missing)[i]);
        }
    }

    // Sort array + check if next value in array is 1 bigger than last element
    public static int[] isMissing(int[] input) {
        Arrays.sort(input); // Sort input array O(n log n)
        int[] missingNums = new int[2]; // Array to store missing numbers
        int firstIndex = 1; // Start 1st index with 1 because index 0 should always be 1
        int secondIndex = 2; // Used for comparison

        if (input[0] != 1) { // Check if 1 exists in array, if not, add it to list of missingNums
            missingNums[0] = 1;
        }

        while (firstIndex < input.length && secondIndex != input.length) {
            if (input[firstIndex] + 1 != input[secondIndex]) {
                if (missingNums[0] == 0) {
                    missingNums[0] = input[firstIndex] + 1;
                } else {
                    missingNums[1] = input[firstIndex] + 1;
                }
            }
            firstIndex++;
            secondIndex++;
        }

        if (missingNums[1] == 0) {
            missingNums[1] = input[input.length - 1] + 1;
        }
        return missingNums; // Return array of missing numbers
    }
}