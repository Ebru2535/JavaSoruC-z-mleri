package Arrays;

import java.util.Arrays;

public class E05_SağaKaydırma {
    public static void main(String[] args) {
        // verieln bir array deki tüm elemntleri bir saga kaydır
        // sondaki elementi de en başa alıp kaydet

       // [3,4,5,6] ==> [6,3,4,5]

        int [] arr={3,4,5,6};

        int temp=arr[arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {
            arr[arr.length-1-i] =arr[arr.length-2-i];

        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
