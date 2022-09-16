//Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.
import java.util.Scanner;
public class Atm2 {
    public static void main(String[] args){
        String userName,password;
        Scanner inp=new Scanner(System.in);
        int right=3;
        int balance=1500;
        int select;

        while(right>0){
            System.out.print("Kullanıcı adını giriniz:");
            userName= inp.nextLine();
            System.out.print("Şifre giriniz:");
            password= inp.nextLine();
            if(userName.equals("patika")&&password.equals("dev123")){
                System.out.println("Merhaba,Kodluyoruz Bankasına Hoşgeldiniz!");
                do {

                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    select = inp.nextInt();
                    switch (select) {
                        case 1: {
                            System.out.print("Para miktarı: ");
                            int price = inp.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz: " + balance);
                        }
                        case 2: {
                            System.out.print("Para Miktarı: ");
                            int price = inp.nextInt();
                            System.out.println("Yeni bakiyeniz: " + balance);
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz.");
                            } else {
                                balance -= price;
                            }
                        }
                        case 3: {
                            System.out.println("Bakiyeniz: " + balance);
                        }
                    }
                }
                while(select!=4);
                System.out.println("Tekrar Görüşmek Üzere.");
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre.Tekrar deneyiniz.");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
                }else{System.out.println("Kalan hakkınız: "+right);}

            }
        }

    }
}
