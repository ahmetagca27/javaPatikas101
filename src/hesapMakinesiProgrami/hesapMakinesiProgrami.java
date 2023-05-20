package hesapMakinesiProgrami;
import java.util.Scanner;

public class hesapMakinesiProgrami {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Girin :");
        n1 = input.nextInt();

        System.out.print("ikinci sayıyı girinş :");
        n2 = input.nextInt();

        System.out.println("1-Toplma \n2-Cıkarma\n3-Carpma\n4-Bolme");
        System.out.println("Yapmak istediğiniz İşlemi Seçiniz :");
        select = input.nextInt();

        switch (select){

            case 1:
                System.out.println("Toplam : " + (n1+ n2));
                break;

            case 2:
                System.out.println("Cıkarma : " + (n1 - n2));
                break;

            case 3:
                System.out.println("Carpma :" + (n1 * n2));
                break;

            case 4:
                if (n2!=0) {
                    System.out.println("Bolme : " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı sıfıra bölünemez");
                }
                break;

            default:
                System.out.println("Yanlış Seçim yaptınız. Tekrar Deneyiniz");
                break;
        }

    }
}
