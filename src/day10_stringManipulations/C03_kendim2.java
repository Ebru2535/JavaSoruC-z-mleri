package day10_stringManipulations;

import java.util.Scanner;

public class C03_kendim2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir haef giriniz");
        char girilenHRF= scan.next().charAt(0);

        if(girilenHRF=='o'|| girilenHRF=='O'){
            System.out.println("ocak");
        }
        if(girilenHRF=='ş'|| girilenHRF=='Ş'){
            System.out.println("şubat");
        }
        if(girilenHRF=='m'|| girilenHRF=='M'){
            System.out.println("mart");
        }
        if(girilenHRF=='n'|| girilenHRF=='N'){
            System.out.println("nisan");
        }
        if(girilenHRF=='m'|| girilenHRF=='M'){
            System.out.println("mayıs");
        }
        if(girilenHRF=='h'|| girilenHRF=='H'){
            System.out.println("haziran");
        }
        if(girilenHRF=='t'|| girilenHRF=='T'){
            System.out.println("temmuz");
        }
        if(girilenHRF=='a'|| girilenHRF=='A'){
            System.out.println("agustos");
        }
        if(girilenHRF=='e'|| girilenHRF=='E'){
            System.out.println("eylül");
        }
        if(girilenHRF=='e'|| girilenHRF=='E'){
            System.out.println("ekim");
        }
        if(girilenHRF=='k'|| girilenHRF=='K'){
            System.out.println("kasım");
        }
        if(girilenHRF=='a'|| girilenHRF=='A'){
            System.out.println("aralık");
        }
    }
    }
