//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
import  java.util.Scanner;
public class Exponential {
    public static void main(String[] args) {
        int exp;
        Scanner inp=new Scanner(System.in);

        System.out.print("Sınır değerini giriniz: ");
        exp=inp.nextInt();
        System.out.println("Üçün Katı Olan Sayılar:");
        for(int i=1;i<=exp;i*=3){
            System.out.println(i);
        }
        System.out.println("Beşin Katı Olan Sayılar: ");

        for(int k=1;k<=exp;k*=5){
            System.out.println(k);
        }

    }
}
