package day08_stringManipulation;

import java.util.Locale;

public class C04_charAt {
    public static void main(String[] args) {
        String str= "Java guzeldır"; // 13 tane karakter barındırır

        // java da ındeks 0 dan başlar
        // J==> 0. r==>12
        // charAt(index) ile istedğimiz index tekı char a ulaşabılıtız

       // ilk a yı yazdır
        System.out.println(str.charAt(1));

        // sondan 2. harfı yazudr
        System.out.println(str.charAt(13-2));// karakter sayısı -2. indexdeki eleman

        // sondan 4. karakteri buyuk harf olarak yazdırın
        System.out.println(str.toUpperCase().charAt(13-4));

        //charAt() methodu bze char döndürdüğü için toUppercase() çalışmaz
        // String methodlarını charAt() ile kullanmak isterseniz
        //charAt() den önce kullanmalıısnız
        System.out.println(str.charAt(13)); // StrıngIndexOutOfBoundsException
// eger index olarak karakter sayısı veya daha buyuk ir değer girersek
        // o ındexsi bulamayacagı ıcın hta verir

    }
}
