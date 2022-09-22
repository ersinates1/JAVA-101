package ArrayHomeworks;
//Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz:");
         int n=inp.nextInt();
         int number;
         int[]list=new int[n];
         for(int i=1;i<= list.length;i++){
             System.out.print("Sıradaki elemanı giriniz:");
             number=inp.nextInt();
             list[i-1]=number;
         }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int min=list[0];
        System.out.println("Minimumum Değer: "+min);
        int max=list[list.length-1];
        System.out.println("Maksimum Değer: "+max);





    }

    }


