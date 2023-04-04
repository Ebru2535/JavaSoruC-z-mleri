package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MükerriSil {
    public static void main(String[] args) {
        /*
        Soru 4-Verilen bir array’de tekrar eden elementler icin,
               mukerrer olanlari silip, tum elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
         */

        int[] arr={4,6,8,9,4,7,8,2,9,1,3,6,5};
        // int [] yeniArr=new int[]

        System.out.println(Arrays.toString(tekrarlariSil(arr)));


    }

    public static int[] tekrarlariSil(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for (Integer each:arr
        ) {
            if (!list.contains(each)){
                list.add(each);
            }
        }
        //System.out.println(list);

        arr=new int[list.size()];
        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i]+= list.get(i);
        }

        return arr;
    }
}

