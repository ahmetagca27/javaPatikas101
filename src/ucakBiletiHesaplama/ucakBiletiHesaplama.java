package ucakBiletiHesaplama;
import java.util.Scanner;
public class ucakBiletiHesaplama {
    public static void main(String[] args) {
        double km, costPerKm = 0.1 , total;
        byte type;
        int age;
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.printf("Lütfen Gidilecek Mesafeyi KM olarak girin : ");
        km = inp.nextDouble();

        System.out.printf("Lütfen Yaşınızı girin : ");
        age = inp.nextInt();

        System.out.printf("Lütfen Yolculuk Tipi Seçiniz : (1- Tek Yön | 2- Gidiş/Dönüş) : ");
        type = inp.nextByte();
        total = km * costPerKm;

        if (age<12){
            total *= 0.5;
        }
        else if (age>=12 && age<=24) {
            total *= 0.9;
        }
        else if (age>65) {
            total *= 0.7;
        }

        switch (type){
            case 2:
                total *= 0.8;
                total *= 2;
                break;
            case 1:
                total = total;
                break;
            default:
                isError = true;
        }

        if (!(km>=0)){
            isError = true;
        }

        if (isError == true){
            System.out.println("Hatalı Veri Girdiniz !");
        }
        else{
            System.out.println("Toplam Tutar: " + total + " TL");
        }
    }
}