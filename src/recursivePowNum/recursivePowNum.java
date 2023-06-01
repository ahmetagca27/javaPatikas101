package recursivePowNum;
import java.util.Scanner;
public class recursivePowNum {
    ////// RECURSİVE İLE ÜSLÜ SAYI İŞLEMİ ////// RECURSİVE EXPONENTİAL CALCULATİON ////////
    static int powNum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini Giriniz : ");
        int base = input.nextInt();
        System.out.print("Üs değerini Giriniz : ");
        int exponent = input.nextInt();
        int result = 1;
        if(exponent == 0 ){
            return 1;
        }else {
            for (int i = 1; i <= exponent; i++) {
                result *= base;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.print("Sonuc : " + powNum());
    }
}
