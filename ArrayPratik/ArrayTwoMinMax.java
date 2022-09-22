
package ArrayPratik;
//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

import java.util.Arrays;
public class ArrayTwoMinMax {
    public static void main(String[] args) {
        int[]list={56,34,1,8,101,-3,-33};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int min=list[0];
        System.out.println("Minimumum Değer: "+min);
        int max=list[list.length-1];
        System.out.println("Maksimum Değer: "+max);



        //int max=0;

        /*for(int i=0;i< list.length;i++){
            min=list[0];
        }
        for(int i=0;i< list.length;i--){
            max=list[0];
        }

        */


    }






}
