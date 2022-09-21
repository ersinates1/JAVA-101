//Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

import java.util.Scanner;
public class Exponential2 {
    public static void main(String[] args) {
        int n,k;
        Scanner input=new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz:");
        n=input.nextInt();
        System.out.print("Üs olcak sayıyı giriniz:");
        k= input.nextInt();
        int product=1;

        for(int i=1;i<=k;i++){
            product*=n;
        }
        System.out.println("Çarpım sonucu:"+product);
    }
}
