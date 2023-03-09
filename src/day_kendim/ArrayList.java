package day_kendim;

import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {
        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.

        int []arr={3,4,5};
      elementArtır(arr,2);
        System.out.println(Arrays.toString(arr));
    }


    public static int[] elementArtır(int[] arr, int artısmiktarı) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=artısmiktarı;

        }return arr;

    }


}
