package Maps;

import java.util.HashMap;
import java.util.Map;

public class C01 {
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



}}