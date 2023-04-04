package ForEach;

import java.util.ArrayList;
import java.util.List;

public class KelimeUzunlugu {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
              - Kelimenin uzunlugu cift sayi ise ilk yarisini
              - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
                 yeni bir listeye ekleyip yazdirin.
       */
        String [] array={"ayse", "eda", "veda"};
        List<String> yeni=new ArrayList<>();
        for (String each:array) {
            if (each.length()%2==0){
                each.substring(0, (array.length/2)+1);
                yeni.add(each.substring(0, each.length()/2));

            }else {
                each.substring((array.length/2));
                yeni.add(each.substring(each.length()/2));
            }
        }
        System.out.println(yeni);

    }
}

