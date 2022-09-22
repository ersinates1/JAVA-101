package ArrayPratik;
//Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.


public class ArrayOne {
    public static void main(String[] args) {
        double[] list={1,2,3,4,5};
        double sum=0.0;
        double result=0.0;
        for(double i=0;i< list.length;i++){
            result=(1/list[(int) i]);
            sum+=result;

        }
        double harmonik=list.length/sum;
        System.out.println(harmonik);



    }
}
