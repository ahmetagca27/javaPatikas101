package tersUcgen;
import java.util.Scanner;
public class tersUcgen {
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner input = new Scanner(System.in);
        System.out.println("n.: ");
        n = input.nextInt();

        for(i=n; i >= 0; i--){
            for (j=1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (k=1; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
