package Maps;

import java.util.Map;
import java.util.TreeMap;

public class C02 {

    public static void main(String[] args) {
        //  arrayda eleman kullanım miktarları

        String[]arr={"A","C","C","V","F","F"};
        Map<String,Integer> kullanımmiktarları=new TreeMap<>();
        for (String eachArr:arr) {

         int res=   findFrequency(eachArr,arr);
         kullanımmiktarları.put(eachArr,res);
        }

        System.out.println(kullanımmiktarları);
        System.out.println(kullanımmiktarları.get("C"));
    }

   public static int findFrequency(String word, String[] arr) {

        int counter=0;
        for (String s : arr) {
            if (s.equals(word))
                counter++;
        }
        return counter;
    }
}
