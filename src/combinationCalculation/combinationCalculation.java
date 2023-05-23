package combinationCalculation;
import java.util.Scanner;
public class combinationCalculation {
    public static void main(String[] args) {
        int n,r,ntotal=1,rtotal=1,nrtotal=1,result=1;

        Scanner input= new Scanner(System.in);
        System.out.print("Bu uygulama birinci sayının\n" +
                "ikinci sayıya kombinasyonunu yapar\n" +
                "birinci sayıyı giriniz: ");
        n=input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        r=input.nextInt();

        for(int i=1;i<=n;i++){
            ntotal=ntotal*i;
        }
        System.out.println("Kullanıcıdan gelen birinci sayı 'n': "+ n+"!" + "\n" +
                "Faktöriyel değeri: " + ntotal );

        for(int i=1;i<=r;i++){
            rtotal=rtotal*i;
        }
        System.out.println("Kullanıcıdan gelen ikinci sayı 'r': "+ r+"!" + "\n" +
                "Faktöriyel değeri: " + rtotal);

        for(int i=1;i<=(n-r);i++){
            nrtotal=nrtotal*i;
        }
        System.out.println("n-r: "+ (n-r)+"!" + "\n" + "Faktöriyel değeri: " + nrtotal);

        result=ntotal/(rtotal*nrtotal);

        System.out.println("C(n,r)=n!/(r!*(n-r)!): " +"İşlemin Sonucu: " + result);

    }
}
