package day02_Scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dikdörtgenin iki kenar uzunluğunu girin");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("Dikdörtgenin alanı:" +kenar1*kenar2);

    }
}
