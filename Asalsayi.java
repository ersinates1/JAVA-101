//Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
import java.util.Scanner;
public class Asalsayi {
    public static void main(String[] args) {
        int value=0;
        for(int i=2;i<=100;i++){
            for(int k=2;k<i;k++){
                if(i%k==0){
                    value++;
                }
            }
            if(value==0){
                System.out.println(i);
        }
            value=0;
        }
    }
}
