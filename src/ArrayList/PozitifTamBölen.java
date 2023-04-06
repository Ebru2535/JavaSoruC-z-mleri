package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PozitifTamBölen {
    public static void main(String[] args) {
         /*
        Soru 6- Kullanicidan pozitif bir tamsayi alip,
        o tamsayiyi tam bolebilen tum pozitif
        tamsayilari bir liste olarak bize donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        List<Integer> bolenList=tamBolunebilenListesi(sayi);
        System.out.println(bolenList);
    }

    public static List <Integer> tamBolunebilenListesi(int sayi) {

        List <Integer> bolenListesi= new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0){
                bolenListesi.add(i);
            }
        }return bolenListesi;
    }
    }

