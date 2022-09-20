//Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.
import java.util.Scanner;
public class Hesapmethod {



    static int sum(int a,int b){
        int result= a + b;
        System.out.println("Toplam: "+result);
        return result;
    }
    static int minus(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma: "+result);
        return result;
    }
    static int times(int a,int b){
        int result=a*b;
        System.out.println("Çarpma: "+result);
        return result;
    }
    static int divided(int a,int b){
        if(b==0){
            System.out.println("İkinci sayı 0'dan farklı olmalı.");
            return 0;
        }
        int result=a/b;
        System.out.println("Bölüm: "+result);
        return result;
    }
    static  int power(int a, int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result *=a;
        }
        return result;
    }
    static int mod(int a,
                   int b){
        return a%b;

    }
    static void cals(int a,int b){
        System.out.println("Çevresi: "+(2*(a+b)));
        System.out.println("Alanı: "+(a*b));

    }



    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int select;
        String menu="1- Toplama İşlemi\n"
                +"2- Çıkarma İşlemi\n"
                +"3- Çarpma İşlemi\n"
                +"4- Bölme İşlemei\n"
                +"5- Üslü Sayı Hesaplama\n"
                +"6- Mod Alma\n"
                +"7- Dikdörtgen Alan ve Çevre Hesabı\n"
                +"8- Çıkış Yap";

        while(true){
            System.out.println(menu);
            System.out.println("Lütfen bir işlem seçiniz:");
            select=scan.nextInt();
            if(select==0){
                break;
            }
            System.out.println("İlk Sayı: ");
            int a= scan.nextInt();
            System.out.println("İkinci Sayıyı Giriniz:");

            switch (select){
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı: "+power(a,b));
                    break;
                case 6:
                    System.out.println("Mod İşlemi: "+mod(a,b));
                case 7:
                    cals(a,b);
                break;
                default:
                    System.out.println("Geçersiz bir seçim girdiniz");

            }




        }
    }
}
