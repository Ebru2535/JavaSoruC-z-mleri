package Socrative;

import java.util.Scanner;

public interface C02_s0ru {
    public static void main(String[] args) {
       // Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("kelime giriniz");
        String kelime= scan.nextLine();
       String sonuc="";//ebru
        for (int i = kelime.length()-1; i>=0 ; i--) {
            char harf=kelime.charAt(i);
            sonuc+=harf;
        }
        System.out.println(sonuc);
        if(kelime.equals(sonuc)){
            System.out.println("palindrome :"+kelime);
        }else {
            System.out.println("kelime palindrome değil");
        }

    }

}
