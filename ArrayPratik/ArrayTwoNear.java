package ArrayPratik;
import java.util.Arrays;
import java.util.Scanner;
//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
public class ArrayTwoNear {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int[]list={15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        System.out.print("Bir sayı giriniz:");
        int number= inp.nextInt();
        int maxNear=0;
        int minNear=0;
        for(int i:list){
            if(i<number){
                minNear=i;
            }if(i>number){
                maxNear=i;
                break;
            }

        }
        System.out.println("Girilen Sayıdan Küçük En Yakın Sayı: "+minNear);
        System.out.println("Girilen Sayıdan Büyük En Büyük Sayı: "+maxNear);


    }
}
