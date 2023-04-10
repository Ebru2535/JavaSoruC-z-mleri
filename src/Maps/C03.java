package Maps;

import java.util.Map;

public class C03 {
    public static void main(String[] args) {
        /// verilen bir map te soyismi büyük harf yap

        Map<Integer,String>okulMap=C01.ornekMapOlustur();
        C01.soyisimleriBuyukHarfyap(okulMap);
    }
}
