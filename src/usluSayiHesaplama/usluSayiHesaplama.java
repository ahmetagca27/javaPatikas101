package usluSayiHesaplama;
import java.util.Scanner;

public class usluSayiHesaplama {
    public static void main(String[] args) {
        int k,n;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayi : ");
        k = input.nextInt();
        System.out.print("Üs olacak Sayi : ");
        n = input.nextInt();
        int total =1;

        for (int i = 1; i <= n; i++){
            total *= k;
        }
        System.out.println("===================");
        System.out.println("CEVAP : " + total);
    }
}
