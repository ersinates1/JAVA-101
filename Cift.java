//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
//While kullanarak.

import java.util.Scanner;
public class Cift {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int k;
        int i=0;
        System.out.print("Bir değer giriniz:");
        k= inp.nextInt();
     while(i<=k){
         if(i%3==0&&i%4==0){
             System.out.print(i+",");
         }i++;
     }


    }
}
