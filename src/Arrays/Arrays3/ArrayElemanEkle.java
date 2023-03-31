package Arrays.Arrays3;

import java.util.Arrays;

public class ArrayElemanEkle {
    public static void main(String[] args) {

        int [] arr={3,5,8,9,10};
        System.out.println(Arrays.toString(arrayElemanEkle(arr, 1)));


    }

    private static int[] arrayElemanEkle(int []arr, int eklenenElema) {
        int [] yeniarr= new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniarr[i]=arr[i];
        }
        yeniarr[yeniarr.length-1]=eklenenElema;
        arr=yeniarr;
        return arr;
    }
}
