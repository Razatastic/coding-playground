import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) { // Takes in user input
      System.out.println("Please enter your input: ");
      String input = scanner.nextLine();
      if (isPalindrome(input)) {
        System.out.println("Your input is a palindrome");
      } else {
        System.out.println("Your input is NOT a palindrome");
      }
    }
  }

  public static boolean isPalindrome(String input) {
    StringBuilder reverse = new StringBuilder(input.toLowerCase()).reverse();
    return input.toLowerCase().equals(reverse.toString());
  }
}