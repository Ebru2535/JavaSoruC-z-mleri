package Arrays.Arrays3;

import java.util.Arrays;

public class ArraySagakaydırma {
    public static void main(String[] args) {
        int [] arr= {3,2,1};
        sagaKaydır(arr);
        System.out.println(Arrays.toString(arr));  // [1, 3, 2]
    }

    public static void sagaKaydır(int [] arr) {

        int temp= arr[arr.length-1];
        for (int i = arr.length-1 ; i > 0; i--) {
            arr[i]=arr[i-1];

        }arr[0]=temp;



    }
}
