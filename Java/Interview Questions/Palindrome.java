// import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    // try (Scanner scanner = new Scanner(System.in)) { // Prompts user for input
    // checks for whether or not it is a string
    // System.out.println("Please enter your input: ");
    // String input = scanner.nextLine();
    for (int i = 0; i < args.length; i++) { // Alternative input method
      if (stringIsPalindrome(args[i])) {
        System.out.println("Your input is a palindrome");
      } else {
        System.out.println("Your input is NOT a palindrome");
      }
    }
  }
  // }

  public static boolean stringIsPalindrome(String input) { // Use StringBuilder to create a reverse string of input
    StringBuilder reverse = new StringBuilder(input.toLowerCase()).reverse();
    return input.toLowerCase().equals(reverse.toString());
  }

  // public static boolean numIsPalindrome(int input) {
  // int reverse = 0;
  // int count = 0;
  // while (input %)
  // }
}