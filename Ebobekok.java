//Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.
import java.util.Scanner;
public class Ebobekok {
    public static void main(String[] args) {
        while (true) {
            Scanner inp = new Scanner(System.in);
            System.out.print("n1 Sayisini Giriniz : ");
            int n1 = inp.nextInt();
            System.out.print("n2 Sayisini Giriniz: ");
            int n2 = inp.nextInt();
            int s, ebob = 1, ekok = 0;

            if (n1<= n2) s = n1;
            else s = n2;
            //System.out.print(a+" "+b+" "+s);
            for (int i = s; i >= 1; i--) {
                //System.out.print(a%i+" "+b%i);
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ebob = i;
                    break;
                }
            }
            System.out.println(n1 + " ve " + n2 + " sayilari için EBOB  : " + ebob);

            ekok = (n1 * n2) / ebob;
            System.out.println(n1 + " ve " + n1 + " sayilari için EKOK  : " + ekok);
        }
    }
}
