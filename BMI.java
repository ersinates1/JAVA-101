//Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
//Obez sonuçlar için ekrana obez yazılsın.
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu(metre cinsinden) giriniz:");
        boy= inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kilo= inp.nextDouble();

        indeks=kilo/(boy*boy);
       String durum=(indeks>30) ? "    Obez": "    Normal";

        System.out.println("Vücut kitle İndeksiniz:"+indeks +durum );

    }
}
