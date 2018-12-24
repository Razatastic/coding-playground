import java.util.*;

/**
 * MaxDiffOddEven
 */
public class MaxDiffOddEven {
    public static int maxDiff(List<Integer> numList) {
        int smallestOddIndex = -1, largestEvenIndex = -1;
        // int possibleOddSwitch = 0, possibleEvenSwitch = 0;
        int x = 0;

        if (numList.size() < 2) { // Check input size
            return 0;
        }

        while (smallestOddIndex == -1 && largestEvenIndex == -1) {
            if (numList.get(x) % 2 == 1) {

            } else {

            }
        }

        for (int i = 0; i < numList.size() - 1; i++) {
            if (numList.get(i) % 2 == 1) {
                if (numList.get(i) < numList.get(smallestOddIndex) && smallestOddIndex < largestEvenIndex) {
                    smallestOddIndex = i;
                }
            } else {
                if (numList.get(i) > numList.get(largestEvenIndex) && largestEvenIndex > smallestOddIndex) {
                    largestEvenIndex = i;
                }
            }
        }

        return numList.get(largestEvenIndex) - numList.get(smallestOddIndex);
    }

    public static void main(String[] args) {
        // -11,6,1,3,-4
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