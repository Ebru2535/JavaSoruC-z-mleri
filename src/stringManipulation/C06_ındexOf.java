package stringManipulation;

import java.util.Scanner;

public class C06_ındexOf {
    public static void main(String[] args) {

        //kullanıcıdan aldığımız cümle "çok" ile başlayan ilk kelimeyi yazdıırın
        // cümlede cok  kelimesi geçmiyorsa "cümlede cok ile başlayan kelime yok" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String girilenCumle = scan.nextLine();


        // sınablarımızda coktan secmeli sroular kullanıyoruz
        // javayı cok seviyoruz
        // u kadar cok secenek olur mu?

        if (!girilenCumle.contains("cok")) {
            System.out.println("cumlede cok ile baslayan kelime yok");
        } else {

            int cokIndexi = girilenCumle.indexOf("cok");
            int boslukIndex = girilenCumle.indexOf(" ", cokIndexi + 1);

            System.out.println(girilenCumle.substring(cokIndexi, boslukIndex));
        }

    }
}
