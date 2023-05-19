package karsilastirmaOperatorleri;

public class karsilastirmaOperatorleri {
    public static void  main (String[] args){
        int A = 10;
        int B = 20;
        int C = 10;
        int D = 40 ;

        // == Operatörü
        System.out.println("Eşit mi=");
        System.out.println(A == B);
        System.out.println(A == C);
        System.out.println(C == D);

        // != Eşit Değil Operatörü

        System.out.println("Eşit değil mi=");
        System.out.println(A != D);
        System.out.println(A != C);
        System.out.println(C != B);

        // > Büyüktür Operatörü

        System.out.println("Büyük mü =");
        System.out.println(A > D);
        System.out.println(D > C);
        System.out.println(C > B);

        // >= Büyük-Eşittir Operatörü

        System.out.println("Büyük eşit mi =");
        System.out.println(A >= D);
        System.out.println(A >= C);
        System.out.println(C >= B);

        // < Küçüktür Operatörü
        System.out.println("küçük mü =");
        System.out.println(A < D);
        System.out.println(D < C);
        System.out.println(C < B);


        // <= Küçük-Eşittir Operatörü

        System.out.println("Küçük eşit mierişi =");
        System.out.println(A <= D);
        System.out.println(A <= C);
        System.out.println(C <= B);
    }
}
