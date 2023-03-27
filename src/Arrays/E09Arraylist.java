package Arrays;

import java.util.ArrayList;
import java.util.List;

public class E09Arraylist {
    public static void main(String[] args) {

        int [] arr={3,2,1,5,8,7};

        List<Integer> ebru= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
         ebru.add(arr[i]);
        }
        System.out.println(ebru);  // [3, 2, 1, 5, 8, 7]
        System.out.println(ebru.contains(8)); // true

        List<Integer> savas=new ArrayList<>();
        savas.add(10);
        savas.add(1);
        savas.add(2);
        System.out.println(savas); //[10, 1, 2]
        savas.remove(1);
        System.out.println(savas); // [10, 2] 1. indeksi sildi

        Integer sil=10;
        savas.remove(sil);
        System.out.println(savas);  // [2]

    }
}
