package MethotOlusturma;

import java.util.Scanner;

public class C11_MethodTekrar {
    public static void main(String[] args) {

        /*
        Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
         baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
          bir method olusturun.
             - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
                mesaji verin
                - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
                yazdirin.
         */
   baslangicbitisMethod();
    }
    public static void baslangicbitisMethod(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime= scanner.nextLine();

        System.out.println("başlangıc indexi griniz");
        int baslangıc= scanner.nextInt();

        System.out.println("biitis indexi griniz");
        int bitis= scanner.nextInt();

        if(baslangıc>bitis){
            System.out.println("başlangıc bitişten büyük olamaz");
        } else if (baslangıc>kelime.length()-1 || bitis>kelime.length()-1) {
            System.out.println("keliemnın index numarasından büyük bir değr girdinix");
        }else {
           // System.out.println(kelime.substring(baslangıc,baslangıc));
            for (int i = baslangıc; i <bitis ; i++) {
                System.out.print(kelime.charAt(i)+", ");
            }
        }


    }

}
