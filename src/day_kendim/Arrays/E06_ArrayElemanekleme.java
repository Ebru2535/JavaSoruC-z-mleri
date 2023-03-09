package day_kendim.Arrays;

import java.util.Arrays;

public class E06_ArrayElemanekleme {
    public static void main(String[] args) {

        // VERİLEN ARRAY E İSTENEN ELEMNETİ EKLEYELİM


        int[] a={1,2,3,4};
        int[] b={4,5,6,7};

        a=b ;
        System.out.println(Arrays.toString(a));

        int[] arr= {4,5,6};
        int eklenecekElement= 10;

        int[] yeniArr= new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniArr [i]=arr[i];

            yeniArr[yeniArr.length-1]=eklenecekElement;
            System.out.println(Arrays.toString(yeniArr));

        arr=yeniArr;
            System.out.println(Arrays.toString(arr));
        }




    }
}
