package ArrayHomeworks;
//Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
import java.util.Arrays;
public class ArraysFrekans {
    public static void main(String[] args) {
        int[] list={10,20,20,10,10,20,5,20};
        int[]repeat=new int[list.length];
        System.out.println(Arrays.toString(list));
        for (int i = 0; i <list.length; i++) {
            repeat[i]=1;
        }
        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j < list.length ; j++) {
                if ((i != j)&&(list[i]==list[j]))  {
                    repeat[i]++;

                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length ; j++) {
                if ((j!=i)&&(list[i]==list[j]) ) {
                    repeat[j]=repeat[i];
                }
            }
        }
        System.out.println("Tekrar eden sayılar");
        for (int i = 0; i< list.length ; i++) {
            if (i !=0) {
                System.out.println(list[i]+" sayısı "+repeat[i]+" kere tekrar edildi");

            }
        }
    }
}