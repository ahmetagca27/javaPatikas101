package dortveBesinKuvvetleri;
import java.util.Scanner;

public class dortveBesinKuvvetleri {
    public static void main(String[] args) {
        int n,i;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bir sayı giriniz: ");
        n = input.nextInt();
        System.out.println("Girilen sayıya kadar olan 4'ün kuvvetleri:");
        for(i=1; i<=n; i*=4){
            if(i>1) {
                System.out.println(i);
            }
        }

        System.out.println("===========================");
        System.out.println("Girilen sayıya kadar olan 5'in kuvvetleri:");
        for(i=1; i<=n; i*=5){
            if(i>1){
                System.out.println(i);
            }
        }
    }
}
