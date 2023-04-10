package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01 {


    public static Map<Integer,String > ornekMapOlustur(){

        Map<Integer,String> okulMap= new HashMap<>();
        okulMap.put(101, "Ali-Cem-10-H-MF");
        okulMap.put(102, "Veli-Can-10-M-TM");
        okulMap.put(103, "Ali-Can-11-M-Soz");
        okulMap.put(104, "Ayse-Cem-11-H-TM");
        okulMap.put(105, "Ayse-Han-10-H-MF");
        okulMap.put(106, "Veli-Han-10-H-MF");


        return okulMap;
    }

    public static void main(String[] args) {
        Map<Integer,String>ogrenciMap=new HashMap<>();
        ogrenciMap.put(12,"Ali-Can-10-H-MF");
        ogrenciMap.put(13,"Ayse-Cem-10-H-MF");
        ogrenciMap.put(14,"Vel-Han-11-H-MF");
        ogrenciMap.put(15,"Ali-gn-11-A-MF");
        ogrenciMap.put(16,"Ahmti-Can-10-K-Soz");

        System.out.println(ogrenciMap.size());    // 5
        System.out.println(ogrenciMap.keySet()); // [16, 12, 13, 14, 15]
        System.out.println(ogrenciMap.values()); // [Ahmti-Can-10-K-Soz, Ali-Can-10-H-MF, Ayse-Cem-10-H-MF, Vel-Han-11-H-MF, Ali-gn-11-A-MF]



}

    public static Map<Integer,String> soyisimleriBuyukHarfyap(Map<Integer, String> okulMap) {

        Set<Map.Entry<Integer,String>> okulentrySet=okulMap.entrySet();
        System.out.println(okulentrySet);

        for (Map.Entry<Integer,String> eachEntry:okulentrySet
             ) {
            String value=eachEntry.getValue();
            String [] array=value.split("-");
            array[1].toUpperCase();
            eachEntry.setValue(array[0]+"-"+array[1]+"-"+array[2]+"-"+
                  array[3]+"-"+array[4]+"-");

        } return okulMap;

}}