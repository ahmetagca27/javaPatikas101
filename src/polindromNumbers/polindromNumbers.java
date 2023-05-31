package polindromNumbers;
import java.util.Scanner;

public class polindromNumbers {
    static boolean isPolindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber) {
            System.out.println(number + " is a polindrom number.");
            return true;
        }else {
            System.out.println(number + " is not a polindrom number.");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println(isPolindrom(number));

    }
}
