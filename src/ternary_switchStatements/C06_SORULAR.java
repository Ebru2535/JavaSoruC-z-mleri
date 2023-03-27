package ternary_switchStatements;

public class C06_SORULAR {
    public static void main(String[] args) {
        // kullanıcıdan notunu alın 50 veya daha buyukse "sınıfı geçtın"
        // 50 den kucukse"malesef kaldınız" yazdınız

        int input =54;
        System.out.println(input>=50 ? "sınıfı gectın" : "malesef kaldın");

        // kullanıcıdan bır harf isteyın ,
        // grilen karakter kucuk harf ise onu buyuk harf olarak yazdıırn,
        // yoksa girilen harfı yazdırın
        char karakter ='a';
        System.out.println(karakter>='a' && karakter<='z' ? (char)(karakter-32) : karakter);

        // kullanıcıdan bbir sayı alın ve mutlak değerini yazdırın
         input=5;
        System.out.println(input>0 ? input : (-1)*input);

    }
}
