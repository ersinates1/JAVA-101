
import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a,b;
        Scanner inp=new Scanner(System.in);
        System.out.print("A Kenarını Giriniz:");
        a=inp.nextInt();
        System.out.print("B Kenarını Giriniz:");
        b=inp.nextInt();

        double c;
        c=Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus:"+c);



    }
}
