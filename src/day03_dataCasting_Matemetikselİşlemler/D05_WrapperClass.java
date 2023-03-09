package day03_dataCasting_Matemetikselİşlemler;

public class D05_WrapperClass {
    public static void main(String[] args) {
        int sayı=10;
        String str = "Java Candır";
        /*int primite olduğundan hazır metotarı yoktur.
        string ise non primitive olduğu için hazır metotları vardır.

        int, char,boolean gibi primite variabla türlerinde hazır metot  kullanmak için
        Java INTEGER, Character, Boolean gibi wrapper classlar oluşturabilir.
        */
        Integer sayı2=20;
        /* işlemlerimizi yapaerkennbazen SATRİNG OLARAK TANIMLANMIŞ ancak matematıksel
        içerikbarındıran varıable ile karşılaşabiliriz. bu duruda bu tur String varıannlelerı
        sayıya çevirmek ihtiyacımız olabiliri
        string tamamen sayılardan oluştuğunu biliyosam
         */
        String str2="123";
        String str3="354";
        System.out.println(str2+str3); //12354

        int str4 =Integer.parseInt(str2 );
        int str5 =Integer.parseInt(str3);

        System.out.println(str4 + str5); //477

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        char krk1='a';
        System.out.println(Character.isDigit(krk1)); // false
        System.out.println(Character.isAlphabetic(krk1));// true


        short sayı3=4;
        int sayı5= sayı3;

                //wrapper class larda casting olmaz

        short sayı6= (short) 4500000;
        //İnteger sayı7= (ınteger)sayı6

        double dBl = 10.5;
        int a= (int) dBl;

    }
}
