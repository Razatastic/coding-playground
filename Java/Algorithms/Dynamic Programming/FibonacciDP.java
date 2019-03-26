public class FibonacciDP {

    public static int fibSeq(int n, int[] memo) {
        int result = 0;
        if (memo[n] != 0) { // Check if memo array has value
            return memo[n];
        }
        if (n == 1 || n == 2) {
            result = 1;
        } else {
            result = fibSeq(n - 1, memo) + fibSeq(n - 2, memo);
        }
        memo[n] = result;
        return result;
    }

    public static void main(String[] args) {
        int userInput = Integer.parseInt(args[0]);
        int[] memo = new int[userInput + 1]; // Memoization array
        System.out.println(fibSeq(userInput, memo));
    }
}