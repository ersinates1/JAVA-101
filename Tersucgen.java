//Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen program
import java.util.Scanner;
public class Tersucgen {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz:");
        int bas= inp.nextInt();

        for(int i=bas;i>0;i--){
            for(int j=bas;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
