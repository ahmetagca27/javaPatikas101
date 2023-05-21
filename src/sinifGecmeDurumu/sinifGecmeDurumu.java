package sinifGecmeDurumu;
import java.util.Scanner;

public class sinifGecmeDurumu {
    public static void main(String[] args) {
        int i = 5, mat, turkce, kimya, muzik, fizik, total;
        double avarage;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Matematik  ders notunuzu Girin : ");
        mat = input.nextInt();

        System.out.print("Lütfen Turkçe ders notunuzu Girin : ");
        turkce = input.nextInt();

        System.out.print("Lütfen Kimya ders notunuzu Girin : ");
        kimya = input.nextInt();

        System.out.print("Lütfen Müzik ders notunuzu Girin : ");
        muzik = input.nextInt();

        System.out.print("Lütfen Fizik ders notunuzu Girin : ");
        fizik = input.nextInt();

        total = (mat + turkce + fizik + kimya + muzik);

        if ((mat < 0) || (mat> 100)) {
            total = total - mat;
            i--;
        }
        if ((turkce < 0) || (turkce> 100)) {
            total = total - turkce;
            i--;
        }
        if ((fizik < 0) || (fizik> 100)) {
            total = total - fizik;
            i--;
        }
        if ((muzik < 0) || (muzik> 100)) {
            total = total - muzik;
            i--;
        }
        if ((kimya < 0) || (kimya> 100)) {
            total = total - kimya;
            i--;
        }

        avarage = (total / i);
        System.out.println("Not Ortalamanız : " + avarage);
        if (avarage >= 55) {
            System.out.println("Tebrikler Sınıfı Geçtiniz ");
        } else {
            System.out.println("Üzgünüm Sınıf Tekrarı ");
        }

    }
}
