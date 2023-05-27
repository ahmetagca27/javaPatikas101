package asalSayi;
import java.util.Scanner;
public class asalSayi {
    public static void main(String[] args) {
        int i, j; // i ve j kontrol değişkenleri atıyoruz
        boolean asal; // asal değişkeni, bir sayının asal olup olmadığını tutar

        System.out.println("1-100 arasindaki asal sayilar:");
        for (i = 2; i <= 100; i++) { // 2-100 arası sayılar için döngü
            asal = true; // başlangıçta sayıların asal olduğu varsayılı
            for (j = 2; j <= i / 2; j++) { // i'nin yarısına kadar olan sayılar için döngü
                if (i % j == 0) { // i, j'ye tam bölünebiliyorsa
                    asal = false; // i, asal değildir
                    break; // iç döngüden çıkılır
                }
            }
            if (asal) { // eğer i asalsa
                System.out.print(i + " "); // i ekrana yazdırılır
            }
        }
    }
}