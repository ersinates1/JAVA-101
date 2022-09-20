/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan 
ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
*/
import java.util.Scanner;
public class Mukemmelsayi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int number= inp.nextInt();
        int total=0;

        for(int i=1;i<=number-1;i++){
            if(number%i==0){
                total+=i;
            }

        }
        if(total==number){
            System.out.println(number+" sayısı mükemmel sayıdır.");
        }else{
            System.out.println(number+ " sayısı mükemmel bir sayı değildir.");
        }



    }
}
