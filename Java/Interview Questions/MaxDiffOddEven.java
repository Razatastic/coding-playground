import java.util.*;

/**
 * MaxDiffOddEven Solution - I initialized both the odd and even
 */
public class MaxDiffOddEven {
    public static int maxDiff(List<Integer> numList) {
        int smallestOddIndex = -1, largestEvenIndex = -1;
        int possibleOddIndex = -1; // Used for keeping track of a possible smallest odd index (need to check
                                   // following values before switching to this value)

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
                } else {
                    if (currentNum > numList.get(largestEvenIndex)) { // Assign smallest odd index to the possible index
                                                                      // being tracked if an even is found later
                        largestEvenIndex = i;
                        smallestOddIndex = possibleOddIndex;
                    }
                }
            }
        }
        if (smallestOddIndex > largestEvenIndex || smallestOddIndex == 1 || smallestOddIndex == -1
                || largestEvenIndex == 0) { // If odd comes after largest even (e.g. - {12, -11}) or if value never
                                            // occured
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
        System.out.println("The max difference between the smallest odd and the largest even in the list "
                + Arrays.toString(testList.toArray()) + " is " + maxDiff(testList));
    }
}