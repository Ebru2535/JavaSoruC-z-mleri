package day07_ternary_switchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        /* kullanıcıdan bir tamsayı alın
        syı rakam ise "girilen sayı rakam"
        sayı ikii basamaklı şse "gieiln sayı iki basamaklı1
        sayı 2 basamakta byüükse "büyük sayı" yazdırın
         */

           /*
           eger if else cümleleri ELSE ile btmiyorsa tum durumları kapsamaz
           yanı bazı değerler için hiç br if badysı çalışmayabişr

            bu tür soruları çözerken sartlrıjntammaını dikkatli yazmak gerekeir
            */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
         int tamsayı = scan.nextInt();

         if (0<=tamsayı && tamsayı<=9) System.out.println("girilen sayı rakam");
         else if(10<=tamsayı && tamsayı<=99) System.out.println("girilen sayaı 2 basamaklı");
         else if(tamsayı>100) System.out.println("büyük sayı");

    }
}
