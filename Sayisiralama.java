//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.


import java.util.Scanner;

public class Sayisiralama {
    public static void main(String[] args) {
        int x,y,z;
        Scanner inp=new Scanner(System.in);
        System.out.print("x değerini giriniz:");
        x= inp.nextInt();
        System.out.print("y değerini giriniz:");
        y=inp.nextInt();
        System.out.print("z değerini giriniz:");
        z=inp.nextInt();
        if ((x<y)&&(x<z)){
            if (y<z){
                System.out.println("x<y<z");
            }else{
                System.out.println("x<z<y");
            }
        }else if ((y<x)&&(y<z)){
            if(x<z){
                System.out.println("y<x<z");
            }else {
                System.out.println("y<z<x");
            }
        }else{
            if(y<x){
                System.out.println("z<y<x");
            }else{
                System.out.println("z<x<y");
            }
        }
    }
}
