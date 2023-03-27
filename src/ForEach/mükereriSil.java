package ForEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mükereriSil {
    public static void main(String[] args) {


           /*
       -Verilen bir array’de tekrar eden elementler icin,
        mukerrer olanlari silip, tum
        elemanlardan sadece 1 tane yapip eski
        array’e yeni halini atayip yazdirin
            */

        int[] array = {2, 3, 6, 2, 3, 9};
       List<Integer> listMükerrer = new ArrayList<>();

        for (int each : array) {
            if (!listMükerrer.contains(each)) {
                listMükerrer.add(each);
            }
        }
        System.out.println(listMükerrer);
        int[] yeniarray = new int[listMükerrer.size()];

        for (int i = 0; i < listMükerrer.size(); i++) {
            yeniarray[i] = listMükerrer.get(i);
        }
        System.out.println(Arrays.toString(yeniarray));
    }
}