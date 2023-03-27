package ternary_switchStatements;

public class C07_NestedTernary {
    public static void main(String[] args) {
        // kullanıcıdan bir tamsayı alın
        // sayı poztıf ise çift sayı veya cift sayı değil sceneklerimden uygunolanı yazdırın
        // sayı pzotıf değilse,  basamaklı veya 3basamaklı değil seceneklerınden uygun olanı yazdırın


        int sayı= 23;
        //System.out.println( sayı>0 ? "sayı pozıtıf" : "sayı pozıtıf değil");

        System.out.println(sayı>0
                             ?
                             sayı%2==0 ? "çift sayı" : "tek sayı"
                              :
                             -100>= sayı && sayı>=-99 ? "3 basamaklı" : "3 basamaklı değil"
                              );
    }
}
