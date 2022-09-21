//Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

//Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
//Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
//Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
//Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
//Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

import java.util.Scanner;

public class planeticket {

    public static void main(String[] args) {
        // create variables
        double km, roundTripDiscount, ageDiscount, cost;
        int age, trip;

        // take the value from keybord

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter distance as KM: ");
        km = inp.nextDouble();

        System.out.print("Please enter age: ");
        age = inp.nextInt();

        System.out.print("Please enter trip(One Way =>1 ,Round Trip => 2): ");
        trip = inp.nextInt();


        cost = km * 0.10;

        if ((trip == 1) || (trip == 2)) {
            if (trip == 1) {
                if ((age >= 1) && (age < 12)) {
                    ageDiscount = cost * 0.5;
                    cost -= ageDiscount;
                } else if ((age >= 12) && (age <= 24)) {
                    ageDiscount = cost * 0.1;
                    cost -= ageDiscount;
                } else if ((age >= 65)) {
                    ageDiscount = cost * 0.3;
                    cost -= ageDiscount;
                }
                System.out.println("Total Cost is: " + cost + " TL");
            } else {
                if ((age >= 1) && (age < 12)) {
                    ageDiscount = cost * 0.5;
                    cost -= ageDiscount;
                } else if ((age >= 12) && (age <= 24)) {
                    ageDiscount = cost * 0.1;
                    cost -= ageDiscount;
                } else if ((age >= 65)) {
                    ageDiscount = cost * 0.3;
                    cost -= ageDiscount;
                }
                roundTripDiscount = cost * 0.2;
                System.out.println("Total cost is: " + ((cost - roundTripDiscount) * 2) + " TL");
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
