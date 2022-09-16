//Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
import java.util.Scanner;

public class Minmax {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int numberNumbers,number,min=0,max=0;

        System.out.print("Gireceğiniz sayi sayısı:");
        numberNumbers=inp.nextInt();

          for(int i=1;i<=numberNumbers;i++){
              System.out.print(i+".sayiyi giriniz: ");
              number=inp.nextInt();

              if(i==1){
                  max=number;
                  min=number;
              }if (number>=max){
                  max=number;
              }if (number<min){
                  min=number;
              }
          }
        System.out.println("En büyük sayi: "+max);
        System.out.println("En küçük sayi: "+min);
    }
}
