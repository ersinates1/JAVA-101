//Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
import  java.util.Scanner;
public class Uslusayimethod {
    static int pow(int a,int b){
       int  total=1;
        for(int i=1;i<=b;i++){
            total*=a;
        }
     return total;
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       while(true){
           System.out.print("Taban Sayısını Giriniz:");
           int a=scan.nextInt();
           System.out.print("Üssü Giriniz:");
           int b=scan.nextInt();
           System.out.print("Sonuc: "+pow(a,b));
           System.out.println(" ");

       }

    }
}
