package advancedCalc;
import java.util.Scanner;
public class advancedCalc {
    static void sum() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0, i = 1;

        while (counter != i - 1) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            result += number;
            if (number == 0) {
                break;
            }
        }
        System.out.println("Sonuç : " + result);
    }
    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void times() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 1, i = 1;

        while (counter != i - 1 ) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }
    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    static void mod() {
        Scanner scan = new Scanner(System.in);
        int result;
        System.out.print("İlk Sayıyı Giriniz :");
        int a = scan.nextInt();
        System.out.print("İkinci Sayıyı Giriniz :");
        int b = scan.nextInt();

        if ((a <= 0) || (b <= 0)){
            System.out.print("Sıfırdan Küçük Sayı Giremezsiniz...");
        }
        else {
            result = a % b;
            System.out.println("Sonuç : "+result);
        }
    }
    static void calc() {
        Scanner scan = new Scanner(System.in);
        int circle,area;
        System.out.print("Dikdörgenin Uzun Kenarını Giriniz :");
        int a = scan.nextInt();
        System.out.print("Dikdörgenin Kısa Kenarını Giriniz :");
        int b = scan.nextInt();
        if ((a <= 0) || (b <= 0)){
            System.out.print("Dikdörgenin Kenarları Sıfır ve Sıfırdan Küçük Olamaz...");
        }
        else {
            circle = (2*(a+b));
            area = (a*b);
            System.out.println("Dikdörtgenin Çevresi :" +circle);
            System.out.println("Dikdörgenin Alanı :" +area);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        System.out.println(menu);
        do {
            System.out.print("Lütfen bir işlem seçiniz :");
            select = scan.nextInt();
            if (select == 0 ){
                break;
            }
            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    calc();
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}