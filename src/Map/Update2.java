package Map;

import java.util.Map;

public class Update2 {
    public static void main(String[] args) {


        // VERİLEN BİR  OKUL MAP İNDE
        // ÖĞRENCİLERİN SINIFLARINI BİR ARTIRIN
        // EGER 12. SINIF VARSA , SINIF İLGİDİ OLARAK MEZUN YAZ

        // eger update varsa, key ve value birlikte düşün
        // anı key iel yeni value yu map e eklediğimizde
        // key uniue için eski valeueyu update edip yeni value değrini kaydeder

        Map<Integer, String> okulMap = MapMethotDepo.ornekMapOlustur();

        okulMap=MapMethotDepo.yilSonuSiniflariDegistir(okulMap);
    }

}
