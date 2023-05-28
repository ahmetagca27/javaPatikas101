package fibonacciSeries;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
       int sayi,i,total,n1=0,n2=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi =input.nextInt();

        System.out.print(sayi + " sayısının fibonacci değerleri: ");
        for ( i = 1; i <= sayi; i++){
            System.out.print(n1 + "  ");
            total = n1 + n2;
            n1 = n2;
            n2 = total;
        }
    }
}