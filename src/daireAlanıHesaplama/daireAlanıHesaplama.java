package daireAlanıHesaplama;
import java.util.Scanner;
public class daireAlanıHesaplama {
    public static void main(String [] args){
        int r;
        double pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Dairenin Yarı Çapını Giriniz :");
        r = input.nextInt();

        double alan = pi * r * r ;
        double cevre = 2 * pi * r;

        System.out.println("Dairenizin Alanı : " + alan);
        System.out.println("Dairenizin Çevresi : " + cevre);
    }
}
