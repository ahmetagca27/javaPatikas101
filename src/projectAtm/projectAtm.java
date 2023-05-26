package projectAtm;
import java.util.Scanner;

public class projectAtm {
    public static void main(String[] args) {
        String username, password;
        int right=3;
        int select;
        int balance = 1500;

        Scanner input = new Scanner(System.in);

        while (right > 0){
            System.out.print("Username.: ");
            username = input.nextLine();
            System.out.print("Password.: ");
            password = input.nextLine();
            if(username.equals ("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seciniz.");
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı:  ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para Miktarı: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz Yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                }
                    while (select != 4);
                        System.out.println("Tekrar Görüşmek Üzere.");
                    break;
            }else{
                right--;
                System.out.println("Hatalı Giriş Yaptınız.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
