package polindromWords;
import java.util.Scanner;

public class polindromWords {
    public static boolean isPalindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) { // With this loop, I look at the letters of the word backwards
            reverse += (word.charAt(i)); // Here I am creating a new String by collecting characters
            // And this String, on the contrary of the word is equal to
        }
        if (word.equals(reverse)) {
            System.out.println("The input is palindrome");
            return true;
        }
        else {
            System.out.println("The input is not palindrome");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String word = input.nextLine();
        System.out.println(isPalindrome(word));
    }
}