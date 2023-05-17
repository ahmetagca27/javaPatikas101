package ucgenAlanHesaplama;
import java.util.Scanner;
public class ucgenAlanHesaplama {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz : ");
        a = inp.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = inp.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs = " + c);

    }
}
