/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve
4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/

import java.util.Scanner;
public class Tekodev {
    public static void main(String[] args) {
        int even;
        int total=0;

        Scanner scan=new Scanner(System.in);

        do{
            System.out.print("Bir sayı giriniz:");
            even= scan.nextInt();
            if(even%2==0 && even%4==0){
                total+=even;
            }

        }while(even%2==0);
        System.out.println("Çift Sayılar Toplamı: "+total);




    }
}
