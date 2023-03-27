package ifStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        // öğrenciden notunu rakam olarak alıp harf olarak yazdıırn
        // 0-7-49,999 DD
        // 50- 64,999 CC
        // 65-84,999 BB
        // 85 -100 AA

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scan.nextDouble();

        if(0<not && not<50){
            System.out.println("Notunuz DD, malesef kaldınız");
        }
        if (50<=not && not<65){
            System.out.println("Notunuz CC,tebrikler geçtiniz");
        }
        if (65<=not && not<85){
            System.out.println("Notunuz BB,çok iyi");
            if(85<= not && not<=100){
                System.out.println("Notunuz AA, Mükemmel");
            }
        }

    }
}
