package ForEach;

import java.util.ArrayList;
import java.util.List;

public class HarfKacKereKullanılmıs {
    /*
    Soru 5- Verilen iki array’in elementlerini karsilastirip,
            ikisinde ortak olan elementleri
            ayri bir liste olarak veren bir program yazin
     */
    public static void main(String[] args) {


        int [] array1={2,4,6,9,6};
        int [] array2={2,4,8,9,8};
        List<Integer> liste=new ArrayList<>();

        for (int each:array1) {
            for (int each2:array2) {
                if (each==each2 && !liste.contains(array1)){
                    liste.add(each);
                }
            }

        }

        System.out.println(liste);

    }
}

