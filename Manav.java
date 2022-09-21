//Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut,af=2.14,elma,ef=3.67,domates,df=1.11,muz,mf=0.95,patlican,pf=5,tt;
        Scanner inp=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo?:");
        armut= inp.nextDouble();
        System.out.print("Elma Kaç Kilo:");
        elma=inp.nextDouble();
        System.out.print("Domates Kaç Kilo:");
        domates=inp.nextDouble();
        System.out.print("Muz Kaç Kilo:");
        muz=inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo:");
        patlican= inp.nextDouble();

        tt=(armut*af)+(elma*ef)+(domates*df)+(muz*mf)+(patlican*pf);
        System.out.println("Toplam Tutar:"+tt+" TL");


    }
}
