/*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
Java ile kombinasyon hesaplayan program yazınız.*/
import java.sql.SQLOutput;
import java.util.Scanner;
public class Factoriel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n Sayısını Giriniz: ");
        int n = scan.nextInt();
        System.out.print("r sayısını giriniz: ");
        int r = scan.nextInt();
        int data = 0;
        boolean isError = false;

        int total = 1;
        int total2 = 1;
        int total3 = 1;


            if (r >= n) {
                System.out.println("Math Error!");

            }
            for (int i = 1; i <= n; i++) {
                total = total * i;

            }
            for (int k = 1; k <= r; k++) {
                total2 = total2 * k;
            }

            int y = n - r;
            for (int i = 1; i <= y; i++) {
                total3 = total3 * i;
                data = total / (total2 * total3);

            }

            System.out.print("İşlem sonucu: " + data);


    }
        }


