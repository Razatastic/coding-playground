
/**
 * isPermutation
 */
import java.util.Scanner;

public class isPermutation {

    // public static boolean permutationCheck(String one, String two) {
    // for(int i = 0; i < one.length(); i++) {

    // }
    // return true;
    // }

    public static void main(String[] args) {
        // System.out.println(permutationCheck("car", "rac"));
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println("Hello " + name + " I am also " + age + " years old.");
        input.close();
    }
}