package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class IstenmeyeniSil {
    public static void main(String[] args) {


      /*
        Soru 2-Verilen String bir listede istenmeyen harf iceren elementleri silip,
               kalan kismini list olarak bize donduren bir method olusturun
         */


   List<String> list= new ArrayList<>();
       list.add("Ankara") ;
        list.add("Izmir") ;
        list.add("Bursa") ;
        list.add("Afyon") ;
    List<String> yeniList = istenmeyeniSil(list, "A");

        System.out.println(yeniList);

}

    private static List<String> istenmeyeniSil(List<String> list, String istenmeyenHarf) {

        // istenmeyenHarf=istenmeyenHarf.toUpperCase();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(istenmeyenHarf)) {
                list.remove(i);

            }
        }
        return list;
    }
}
