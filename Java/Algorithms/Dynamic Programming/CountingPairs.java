import java.util.HashSet;

public class CountingPairs {

    public static int pairCounter(int[] inputs, int k) {
        int pairCount = 0;
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < inputs.length; i++) {
            s.add(inputs[i] + 2);
        }
        for (int i = 0; i < inputs.length; i++) {
            if (s.contains(inputs[i])) {
                pairCount++;
            }
        }
        return pairCount;
    }

    public static void main(String[] args) {
        int[] inputs = new int[] { 1, 7, 5, 9, 2, 13, 3 };
        int k = 2;
        System.out.println(pairCounter(inputs, k));
    }
}