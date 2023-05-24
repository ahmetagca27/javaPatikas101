package hesapMakinesiProgrami;
import java.util.Scanner;
public class harmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0.0;
        System.out.print("Please Enter the N number: ");
        int n = input.nextInt();

        for (double i = 1; i <= n; i ++){
            result += (1/i);
        }
        System.out.println("Harmonic Number is " + result);
    }
}
