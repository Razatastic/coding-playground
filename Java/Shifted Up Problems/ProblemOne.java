/**
 * ProblemOne
 */
public class ProblemOne {

    public static void main(String[] args) {
        int[] numList = new int[] { 1, 2, 3 };
        int numLength = numList.length;
        System.out.println(compSumFor(numList));
        System.out.println(compSumWhile(numList));
        System.out.println(compSumRecursion(numList, numLength));
    }

    public static int compSumFor(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int compSumWhile(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static int compSumRecursion(int[] arr, int length) {

        if (length <= 0) {
            return 0;
        }

        return (compSumRecursion(arr, length - 1) + arr[length - 1]);
    }
}