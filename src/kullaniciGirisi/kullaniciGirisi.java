package kullaniciGirisi;
import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, answer, newPassword;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Kullanıcı Adınızı Girin .: ");
        userName = input.nextLine();
        System.out.print("Lütfen Şifrenizi Girinz .: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris Başarılı.");
        } else if (userName.equals("patika") && !(password.equals("java123"))) {
            System.out.println("Şifenizi Sıfırlamak İster misiniz? \n1-Evet\n2-Hayır");
            answer = input.nextLine();

            if (answer.equals("1")){
                System.out.print("Yeni Bir Şifre Oluşturunuz : ");
                newPassword = input.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.println("Şifre oluşturuldu");
                }
            }else{
                System.out.println("Şifre Oluşturmadınız !");
            }
        }else{
            System.out.println("Girilen Bilgiler Yanlış");
        }
    }
}

