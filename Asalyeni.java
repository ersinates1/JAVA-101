//Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan program
import  java.util.Scanner;
public class Asalyeni {
    static int asal(int n){
        int sayi=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sayi++;
            }
        }
        if(sayi==2){
            System.out.println(n+ " sayisi asaldir.");
        }
        else{
            System.out.println(n+" sayisi asal değildir.");
        }
        return sayi;
    }

    public static void main(String[] args) {
      while (true){Scanner scan=new Scanner(System.in);
          System.out.print("Bir  sayi giriniz: ");
          int n= scan.nextInt();
          asal(n);


      }


    }
}
