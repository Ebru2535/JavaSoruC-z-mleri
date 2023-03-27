package MethotOlusturma;

import java.util.Scanner;

public class C14_method {
    public static void main(String[] args) {
        //
        Scanner scanner= new Scanner(System.in);
        System.out.println("isminizzi girini");
        String isim= scanner.nextLine();

        System.out.println("soyadınızı girinix");
        String soyisim= scanner.nextLine();
        String birlesikKelime=isimSoyisimBirlestirme(isim,soyisim);
        System.out.println(isimSoyisimBirlestirme(isim, soyisim));

    }
    public  static String isimSoyisimBirlestirme(String name, String surname){
       String kelime=name.toUpperCase().charAt(0)+
                name.substring(1).toLowerCase()+
        " "+surname.toUpperCase().charAt(0)+
                surname.substring(1).toLowerCase();
        return kelime;
    }

}
