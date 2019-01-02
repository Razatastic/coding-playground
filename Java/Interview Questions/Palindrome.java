public class Palindrome {
  public static boolean stringIsPalindrome(String input) { // Use StringBuilder to create a reverse string of input
    StringBuilder reverse = new StringBuilder(input.toLowerCase()).reverse();
    return input.toLowerCase().equals(reverse.toString());
  }

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) { // Alternative input method
      System.out.println(stringIsPalindrome(args[i]) ? "Your input is a palindrome" : "Your input is NOT a palindrome");
    }
  }
}