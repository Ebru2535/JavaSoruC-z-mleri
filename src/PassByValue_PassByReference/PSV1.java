package PassByValue_PassByReference;

import java.util.Arrays;

public class PSV1 {
    public static void main(String[] args) {
        System.out.println("githup çalıştı");
        int [] arr={10,20,30};
        System.out.println(Arrays.toString(arrayeYeniDegerAta(arr))); // [40, 50, 60]
        System.out.println(Arrays.toString(arr));  // [10, 20, 30]   java byPasvalue yu kullanır.


        System.out.println(Arrays.toString(arrayElementDegistir(arr))); //[80, 90, 30]

        System.out.println(Arrays.toString(arrayElementDegistir(arr)));//[80, 90, 30]
        // elementleri değiştirdiğimizde objenın referansı değişmediği için elemntlerin değişikliği kalıcı olur
    }


         public static int[] arrayeYeniDegerAta(int [] arr) {
           int [] yeniarr={40,50,60};
           arr=yeniarr;
           return arr;
    }
    public static int[] arrayElementDegistir(int[]arr){
        arr[0]=80;
        arr[1]=90;
        return arr;
    }
}
