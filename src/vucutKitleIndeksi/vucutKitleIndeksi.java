package vucutKitleIndeksi;
import java.util.Scanner;
public class vucutKitleIndeksi {
    public static void main(String[] args) {
        double b,vki;
        int kg;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (metre cinsinden) Giriniz .: ");
        b = inp.nextDouble();

        System.out.print("Lütfen Kilonuzu Girin .: ");
        kg = inp.nextInt();

        vki = kg / (b * b);
        System.out.print("Vücut Kitle İndeksiniz : " + vki);

    }
}
