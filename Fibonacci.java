//Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Elaman sayısını giriniz:");
        int x= inp.nextInt();

        int total=1,fib=0,n=1;
        for(int i=1;i<=x;i++){
          total=fib;
          fib+=n;

            System.out.println(total+" ");
            n=total;
        }

    }

}
