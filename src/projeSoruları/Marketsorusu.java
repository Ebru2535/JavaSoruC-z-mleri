package projeSoruları;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Marketsorusu {

    static int tutar;
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // /*
        //    Basit bir 4 ürünlü manav alisveris programi yaziniz.
        //
        //      1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
        //      2. Adim : Baska bir urun almak isteyip istemedigini sor.
        //                 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
        //                 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
        //      3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
        //      4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
        //
        //     */

        List<String> urunListesi= new ArrayList<>(Arrays.asList("1 portakal","2 elma","3 armut","4 marul"));
        List<Integer> fiyatlistesi= new ArrayList<>(Arrays.asList(15,10,14,12));

        System.out.println("**bizim market**");

        char devamMı= 'e';
        while (devamMı!='h'){
            for (String each:urunListesi) {
                System.out.println(each);
            }
            System.out.println("Almak istediğiniz ürünü giriniz");
            int secilenUrun= scanner.nextInt();

            System.out.println( "kaç kilo almak istiyorsunuz");
            int kilo=scanner.nextInt();
            tutar+=kilo*fiyatlistesi.get(secilenUrun-1);
            System.out.println(tutar);
            System.out.println("Alışverişe devam etmek ister misiniz?");
            devamMı= scanner.next().charAt(0);
        }
        System.out.println(tutar);


    }
}
