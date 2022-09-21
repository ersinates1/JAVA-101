import java.util.Scanner;
public class Hesapmakinesi {
    public static void main(String[] args) {
        int a,b,select;
        Scanner inp=new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        a= inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        b=inp.nextInt();

        System.out.println("1-Toplama \n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        select=inp.nextInt();
        switch (select){
            case 1:
                System.out.println("Sayıların Toplamı: "+(a+b));
                break;
            case 2:
                System.out.println("Çıkarma: "+(a-b));
                break;
            case 3:
                System.out.println("Çarpma: "+(a*b));
                break;
            case 4:
                if (b!=0)
                System.out.println("Bölme:"+(a/b));
                else System.out.println("Hatalı Giriş!Bölen 0 Olamaz");
                break;
            default:
                System.out.println("Yanlış bir sayı girdiniz!Tekrar deneyin!");
        }

    }
}
