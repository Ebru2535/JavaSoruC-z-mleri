package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethotDepo {
    public static Map<Integer, String> ornekMapOlustur() {

        Map<Integer, String> okulMap = new HashMap<>();
        okulMap.put(101, "Ali-Cem-10-H-MF");
        okulMap.put(102, "Veli-Can-10-M-TM");
        okulMap.put(103, "Ali-Can-11-M-Soz");
        okulMap.put(104, "Ayse-Cem-11-H-TM");
        okulMap.put(105, "Ayse-Han-10-H-MF");
        okulMap.put(106, "Veli-Han-10-H-MF");


        return okulMap;
    }

    public static Map<Integer, String> topluSubeDegistirme(Map<Integer, String> okulMap, String eskiSube, String yeniSube) {
        Set<Integer> okulKeySeti=okulMap.keySet(); // Set oluşturma yapıtk

        for (Integer eachKey:okulKeySeti
        ) {
            String [] valueArr=okulMap.get(eachKey).split("-");

            if(valueArr[3].equalsIgnoreCase(eskiSube)){
                valueArr[3]=yeniSube;
            }
            String yeniValue="";
            for (int i = 0; i < valueArr.length-1; i++) {
                yeniValue+=valueArr[i]+ "-";
            }

            yeniValue+=valueArr[valueArr.length-1];
            okulMap.put(eachKey,yeniValue);
        }
        return okulMap;
    }

    public static Map<Integer, String> yilSonuSiniflariDegistir(Map<Integer,String>okulMap) {
        //Setteki her br key e ait valueyu for each loop ile ele al
        // her bir key e ait valueyu, split(), ile ayrıp, array olarak kaydet
        //array olarak kaydettiğmizi update i yapalım
        // once keyleri set ile al
        Set<Integer>keySeti=okulMap.keySet();
        for (Integer eachKey:keySeti
        ) {
            String []valueArr=okulMap.get(eachKey).split("-"); // bu hangi key i getirdiyse ona ait valueyu getircek
            if(valueArr[2].equalsIgnoreCase("12")){
                valueArr[2]="Mezun";
            }else { // bunun dısındaki ihtiamllar "9" "10""11"
                int sınıf=Integer.parseInt(valueArr[2]);
                sınıf++;
                valueArr[2]=sınıf+""; // tekrar
            }
            String yeniValue="";
            for (int i = 0; i < valueArr.length-1; i++) {
                yeniValue+=valueArr[i]+"-";
            }
            yeniValue=valueArr[valueArr.length-1];
            okulMap.put(eachKey,yeniValue);
        }
        return okulMap;
    }
}
