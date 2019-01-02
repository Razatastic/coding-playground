/*
 * Problem: Given an array containing all the numbers from 1 to n except two,
 * find the two missing numbers. e.g. - missing([4, 2, 3]) = 1, 5
 */

/*
 * Solution: 
 * I sorted through the initial array. O(n log n)
 * Then, I used the index of the array as a basis of comparison with the value at that index. 
 * For instance, the comparison index starts off as 1 since the problem is from 1 to n. 
 * So if arr[0] is not equal to 1, it is added to the missingNums ArrayList. 
 * Additionally, if the next number isn't the right number in terms of index (e.g. - 1, 2, 3, 45), 
 * then the program will add all the numbers between 3 and 45 to the missingNums list.
 */

import java.util.Arrays;
import java.util.ArrayList;

public class MissingNumbers {

    public static ArrayList<Integer> isMissing(int[] input) { // Sort array and compare value with index
        Arrays.sort(input); // Sort input array O(n log n)
        System.out.println(Arrays.toString(input));
        ArrayList<Integer> missingNums = new ArrayList<Integer>(); // Store missing numbers in this ArrayList
        int comparisonVal = 1; // Used as a basis of comparison with value at current index

        for (int i = 0; i < input.length; i++) {
            if (input[i] != comparisonVal) { // If the value doesn't equal the comparisonVal, then add it to the missing
                                             // list
                int valueBeingCompared = comparisonVal; // This is done so that the value of comparisonVal doesn't
                                                        // affect the for loop
                for (int j = 0; j < (input[i] - valueBeingCompared); j++) { // Add all missingNums in this range
                    missingNums.add(comparisonVal);
                    comparisonVal++;
                }
            }
            comparisonVal++;
        }
        return missingNums;
    }

    public static void main(String[] args) {
        int[] missing = { 1, 4, 2, 3, 7 };
        System.out.println("The missing numbers are " + isMissing(missing));
    }
}
