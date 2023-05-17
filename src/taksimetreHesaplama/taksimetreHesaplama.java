package taksimetreHesaplama;

import java.util.Scanner;

public class taksimetreHesaplama {
    public static void main(String[] args) {
        int km;
        double perKm = 2.0, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Mesafeyi KM olarak Giriniz :");
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total; // total 20'den küçükse total'e 20 değerini ata değilse total değeri oldugu gibi'dir.
        System.out.println("Ödenecek Toplam Tutar : " + total);

    }
}
