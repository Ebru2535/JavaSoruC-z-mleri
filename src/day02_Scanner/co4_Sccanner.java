package day02_Scanner;

import java.util.Scanner;

public class co4_Sccanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("isminizi yazın");

        String girilenIsim= scan.nextLine();
        System.out.println(girilenIsim.toUpperCase());


    }
}
