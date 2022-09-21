//Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.
import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        int year;
        boolean leapYear=false;
        Scanner inp=new Scanner(System.in);
        System.out.print("Yıl Giriniz:");
        year= inp.nextInt();
        if(year%4==0){
        if ( year % 100==0){
            if (year%400==0){
                leapYear=true;
            }else {
                leapYear=false;
                  }
            }else {
            leapYear=true;
        }
        }else{
            leapYear=false;
        }
        if (leapYear){
            System.out.println(year+ " yılı bir artık yıldır.");
        }else{
            System.out.println(year+ "yılı bir artık yıl değildir.");
        }
    }

}
