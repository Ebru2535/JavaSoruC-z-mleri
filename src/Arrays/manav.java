package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class manav {
    static ArrayList<String> ürünListesi= new ArrayList<>(Arrays.asList("1, domates","2. sogan","3.patlıcan"));
    static ArrayList<Integer>fiyatListesi= new ArrayList<>(Arrays.asList(15,18,10));
static int tutar;
    public static void main(String[] args) {
        System.out.println("****yıldız manav*****");
        urunsec();

    }public  static void urunsec(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ürün seçiniz :");
        for (String each:ürünListesi ) {     // static olan methotlarda dışaıdan alınan değişkenlerde
                                           // sattaic  olmak zorunda) {
            System.out.println(each);
        }
        System.out.println("seçiniz : ");
        int secim= scanner.nextInt();

        System.out.println("kaç kg ürün alacaksınız");
        int miktar= scanner.nextInt();

        tutar+=miktar*fiyatListesi.get(secim);
        System.out.println("devam etmek istiyor musun");
        char cıkıs= scanner.next().toUpperCase().charAt(0);
        if(cıkıs=='H'){
            System.out.println("ödenecek tutar "+tutar);
            System.exit(0);
        }else {
            urunsec();
        }
    }
}
