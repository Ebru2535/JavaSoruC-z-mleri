package IfELseStatements;

import java.util.Scanner;

public class C08_IfElseIf {
    public static void main(String[] args) {
        // kullanıcıdan aldığı ürün adedi ve liste fiyatını alın,
        // kullanıcıya müşterii kartı olup olmadığını sorun
        // müşteriye kartı varsa 10 üründen fazla alırsa %20, yoksa %15 indirimyazdırın
        // müşteri kartı yoksa 10 üründen fazla allırsa %15, yoksa %10 indirim yapın
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ürün adedini giriniz");
        int urunAdedi = scan.nextInt();
        System.out.println("lütfen liste fiyatını giriniz");
        double listeFiyatı = scan.nextDouble();
        System.out.println("müşteri kartınız var m? \nE:Evet H:Hayır");
        char kartVarı = scan.next().charAt(0);

        if (kartVarı == 'E' && urunAdedi > 10) {
            System.out.println("%20 indirimli toplam fiyat :" + urunAdedi * listeFiyatı * 0.8);
        } else if (kartVarı == 'E' && urunAdedi < 10) {
            System.out.println("%15 indrimli toplam fiyat :" + urunAdedi * listeFiyatı * 0.85);
        } else if (kartVarı == 'H' && urunAdedi > 10) {
            System.out.println("%10 indrimli toplam fiyat :" + urunAdedi * listeFiyatı * 0.9);
        } else if (kartVarı == 'E' && urunAdedi < 10) {
            System.out.println("%15 indrimli toplam fiyat :" + urunAdedi * listeFiyatı * 0.85);
        } else {
            System.out.println("hatalı bilgi");
        }
    }
}