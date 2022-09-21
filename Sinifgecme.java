import java.sql.SQLOutput;
import  java.util.Scanner;

public class Sinifgecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        Scanner inp=new Scanner(System.in);
        System.out.print("Matematik notunu giriniz:");
        mat= inp.nextInt();
        System.out.print("Fizik notunu giriniz:");
        fizik= inp.nextInt();
        System.out.print("Türkçe notunu giriniz:");
        turkce= inp.nextInt();
        System.out.print("Kimya notunu giriniz:" );
        kimya= inp.nextInt();
        System.out.print("Müzik notunu giriniz:");
        muzik= inp.nextInt();

        double avarage=(mat+fizik+turkce+kimya+muzik)/5;
        System.out.println("Ortalamanız:"+avarage);
        if(avarage>=55){
            System.out.println("Dersleri başarı ile geçti.");
        }else{
            System.out.println("Kaldınız");
        }




    }
}
