//Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
//Çin Zodyağı nedir?
//4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
//Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
import  java.util.Scanner;


public class Cinzodyak {
    public static void main(String[] args) {
        int year;
        Scanner inp=new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz:");
        year= inp.nextInt();
        String yzodyak="";
        int zodyak=year%12;


        if(zodyak==0){
              yzodyak="Maymun";

        } else if (zodyak==1){
            yzodyak="Horoz";
        }else if (zodyak==2){
            yzodyak="Köpek";
        }else if (zodyak==3){
            yzodyak="Domuz";
        }else if (zodyak==4){
            yzodyak="Fare";
        }else if (zodyak==5){
            yzodyak="Öküz";
        }else if(zodyak==6){
            yzodyak="Kaplan";
        }else if(zodyak==7){
            yzodyak="Tavşan";
        }else if(zodyak==8){
            yzodyak="Ejderha";
        }else if(zodyak==9){
            yzodyak="Yılan";
        }else if(zodyak==10){
            yzodyak="At";
        }else {
            yzodyak="Koyun";
        }
        System.out.println("Çin Zodyağı Burcunuz: "+yzodyak);
        }



}
