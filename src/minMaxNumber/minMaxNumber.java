package minMaxNumber;
import java.util.Scanner;

public class minMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? ");
        int sayiAdedi = scanner.nextInt();

        int enBuyukSayi = Integer.MIN_VALUE;
        int enKucukSayi = Integer.MAX_VALUE;

        for (int i = 1; i <= sayiAdedi; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi > enBuyukSayi) {
                enBuyukSayi = sayi;
            }

            if (sayi < enKucukSayi) {
                enKucukSayi = sayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyukSayi);
        System.out.println("En küçük sayı: " + enKucukSayi);

    }
}
