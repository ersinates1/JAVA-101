import java.util.Scanner;

public class Kdvhesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Tutar Giriniz:");
        double x=inp.nextDouble();

        double kdv=(x*18)/100;
        System.out.println("KDV Tutarı:"+kdv);

        System.out.println("KDV'siz Tutar:"+x);

        double yesKdv=x+kdv;
        System.out.println("KDV'li Fiyat:"+yesKdv);


    }
}
