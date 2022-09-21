//Koşullar :

//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

import java.util.Scanner;

public class Havasicaklik {
    public static void main(String[] args) {
        int heat;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz:");
        heat=inp.nextInt();

        if (heat <5){
            System.out.println("Kayak yapmayı tercih edebilirsiniz.");
        }  else if (heat>=5&&heat<=25) {
            if (heat<=15) {
                System.out.println("Sinemaya gitmeyi tercih edebilirsiniz.");
            }
            if(heat>=10){
                System.out.println("Pikniğe gidebilirsiniz");
            }
        }else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }


    }
}
