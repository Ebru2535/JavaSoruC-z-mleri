package day02_Scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String girilenİsim= scan.nextLine();
        System.out.println("Lütfen soyismizi giriniz");
        String girilenSoyisim= scan.nextLine();
        System.out.println("Lütfen yaşınız giriniz");
        int girilenYaş= scan.nextInt();
        System.out.println( "isminiz: " + girilenİsim+
                            " \nsoyisminiz:" +girilenSoyisim+
                            "\nyaşınız :" + girilenYaş +
                            "\nkaydınız başarıyla tamamlanmıştır.");

    }
}
