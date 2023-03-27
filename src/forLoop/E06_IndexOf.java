package forLoop;

public class E06_IndexOf {
    public static void main(String[] args) {
      /* : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
                  icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
                - String aranan metni icermiyor
                - Aranan metin String’de sadece 1 kere kullanilmis
                - Aranan metin String’de sadece 1’den fazla kullanilmis*/


        String metin="Hayat sevince cok amacok güzel";
        String kelime="cok";
        int ilkIndek =metin.indexOf(kelime);
        int lastIndeks=metin.lastIndexOf(kelime);
        System.out.println(ilkIndek); // 14        // last indeks son kullanaı buluor
                                                    // indeksof da ilk kullananı buluto
        System.out.println(lastIndeks); // 21
         if(!metin.contains(kelime)){
             System.out.println("string aranan metni icermiyor");
         } else if (ilkIndek==lastIndeks) {
             System.out.println("aranan metin 1 kere kullanılmıs");
         }else {
             System.out.println("metin string de birden fazla kullanılmış");
         }


    }
}
