/**
 * FibonacciSeq
 */
public class FibonacciSeq {

    public static int fibSeq(int num) {
        int sum = 1; // Initialize at 1 to return
        int firstNum = 0, secondNum = 1;

        while (num != 0) {
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
            num--;
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fibSeq(i));
        }

    }
}