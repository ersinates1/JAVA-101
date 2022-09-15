import java.util.Scanner;

public class Armstrongodev {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        System.out.print("Sayı giriniz:");
        number = inp.nextInt();
        int basValue;
        int total = 0;

        while (number != 0) {
            basValue = number % 10;
            total +=basValue;
            number /= 10;

        }
        System.out.println("Basamak değerleri toplamı: "+total);

    }

}