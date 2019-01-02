import java.util.*;

/**
 * MaxDiffOddEven Solution:
 * 
 * 1 - Initialize both the smallest odd and largest even elements in the set
 * first.
 * 
 * 2 - If the number is an odd, set it to a temp variable (in this case it's
 * possibleOddIndex). You do this because you want to later compare whether a
 * larger even appears later in the set.
 * 
 * 3 - Look for any larger even number in the set. If it exists, set the
 * smallestOddIndex to possibleOddIndex if possibleOddIndex has a value. This
 * works because you're already past the index for possibleOddIndex at this
 * point. Hence, it fills the condition smallestOddIndex < possibleOddIndex.
 * 
 * 4 - Lastly, you check if any value hasn't been initialized or if the
 * smallestOddIndex is greater than the largestEvenIndex. If so, return 0.
 * Otherwise, return the difference between the two numbers.
 * 
 */
public class MaxDiffOddEven {

    public static int maxDiff(List<Integer> numList) {
        int smallestOddIndex = -1, largestEvenIndex = -1;
        int possibleOddIndex = -1; // Used for keeping track of a possible smallest odd index

        if (numList.size() < 2) { // Check input size
            return 0;
        }

        for (int i = 0; i < numList.size(); i++) {
            int currentNum = numList.get(i); // Current element of list
            if (currentNum % 2 == 1 || currentNum % 2 == -1) {
                if (smallestOddIndex == -1) { // Assign initial value for odd value
                    smallestOddIndex = i;
                } else { // Keep track of possible index
                    if (currentNum < numList.get(smallestOddIndex)) {
                        possibleOddIndex = i;
                    }
                }
            } else {
                if (largestEvenIndex == -1) { // Assign initial value for even value
                    largestEvenIndex = i;
                    if (possibleOddIndex != -1) { // Only assign possible index if it has a value
                        smallestOddIndex = possibleOddIndex;
                    }
                } else {
                    if (currentNum > numList.get(largestEvenIndex)) { // When an even is found, assign smallest odd
                                                                      // index to the possible index being tracked
                        largestEvenIndex = i;
                        if (possibleOddIndex != -1) { // Only assign possible index if it has a value
                            smallestOddIndex = possibleOddIndex;
                        }
                    }
                }
            }
        }
        if (smallestOddIndex > largestEvenIndex) { // If smallest odd comes after largest even
            return 0;
        } else {
            return numList.get(largestEvenIndex) - numList.get(smallestOddIndex);
        }
    }

    public static void main(String[] args) {
        // Test Case to check = -11,6,1,3,-4
        List<Integer> testList = new ArrayList<>();
        testList.add(-11);
        testList.add(6);
        testList.add(1);
        testList.add(3);
        testList.add(-4);

        System.out.println("The max difference between the smallest odd and the largest even in the list " + testList
                + " is " + maxDiff(testList));
    }
}