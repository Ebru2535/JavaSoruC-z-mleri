package dataCasting_Matemetikselİşlemler;

public class Modulus {
    public static void main(String[] args) {
        // % modulus : Java da bölme işelminde kalan sayıyu verir//
        System.out.println(15%5); // 0
        System.out.println(45%4); // 1
        /* kullanıcıdan girdiği değer çift sayı mı?
          girienSayı %2 işleminin sonucu 0 ise çift sayıdır.

          kulanıcın giridği sayı 7nın katı mı?
          girilen sayı %7 şleminin sonucu 0 ise 7 nin katıdır.

          kullanıcın girdiği sayının birler basamağı
          kullanıcı 3426 girdi
         */
        int girilenSayı =3426;

        int birlerBasamağı= 3426 % 10;
        System.out.println("birler basamağı:"+birlerBasamağı);
        girilenSayı= girilenSayı/10;
        System.out.println(girilenSayı); //342


        birlerBasamağı= girilenSayı % 10;
        System.out.println("birler basamağı:"+birlerBasamağı);
        girilenSayı= girilenSayı/10;
        System.out.println(girilenSayı); //342

        birlerBasamağı= girilenSayı % 10;
        System.out.println("birler basamağı:"+birlerBasamağı);
        girilenSayı= girilenSayı/10;
        System.out.println(girilenSayı); //342





    }





}
