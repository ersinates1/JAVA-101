/*Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. 
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
*/
import java.util.Scanner;

public class DesenMetot {
    static int dnegatif(int n){

       if(n<=0){
           return n;
       }else  {
           System.out.print(n+ " ");
           return dnegatif(n-5);
       }
    }
    static int dpozitif(int n,int j){
        if(n>j){
            return n;
        }else{
            System.out.print(n+ " ");
            return dpozitif(n+5,j);
        }


    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int n= inp.nextInt();
        dpozitif(dnegatif(n),n);

    }
}
