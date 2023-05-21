package etkinlikOner;
import java.util.Scanner;
public class etkinlikOner {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int heat;

        System.out.print("Lütfen Hava sıcaklığını Belirtiniz : ");
        heat = inp.nextInt();

        if (heat<5){
            System.out.print("Kayak yapabilirsiniz");
        }
        else if (heat>=5 && heat<10) {
            System.out.print("Sinemaya gidebilirsiniz");
        }
        else if(heat>=10 && heat<=15){
            System.out.print("Sinemaya  veya Pikniğe gidebilirsiniz");
        }
        else if (heat>15 && heat<=25){
            System.out.print("Pikniğe gidebilirsiniz");
        }
        else {
            System.out.print("Yüzmeye gidebilirsiniz");
        }
    }
}