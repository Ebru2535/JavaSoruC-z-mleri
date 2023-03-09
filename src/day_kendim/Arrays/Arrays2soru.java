package day_kendim.Arrays;

import java.sql.Array;
import java.util.Arrays;

public class Arrays2soru {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz. arrray olarak yazdır

        int[] arr={3,5,6,-2,-1,0};
    arr=pozitifTamsayıtopla(arr);
        System.out.println(Arrays.toString(arr));  // [14]


    }

    public static int[] pozitifTamsayıtopla(int [] arr) {
        int[] toplam= new int[1];
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]>0){
            toplam[0]+=arr[i];
           }


        }    return toplam;

    }

}
