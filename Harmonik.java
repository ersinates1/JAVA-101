//Java ile girilen sayının harmonik serisini bulan program yazacağız.

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int data;
        System.out.print("Harmonik sayı giriniz: ");
        data=inp.nextInt();
        double total=0;
        double result=0;
        
            for(double i=1;i<=data;i++){
                result=(i/data);
                 total+=result;
            }
        System.out.println(total);



    }

}
