package perfectNumber;
import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total=0, n;
        System.out.print("Please Enter a Number : ");
        n = input.nextInt();

        for (int i = 1; i < n; i++){
            if(n % i == 0){
                total = total + i;
            }
        }
        if (total == n){
            System.out.println("It's Perfeect Number.");
        }else{
            System.out.println("It's not Perfect Number. ");
        }
    }
}
