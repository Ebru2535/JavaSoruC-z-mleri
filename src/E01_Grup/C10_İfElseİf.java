package E01_Grup;

import java.util.Scanner;

public class C10_İfElseİf {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yasınızı girin");
        int yas= scan.nextInt();
        System.out.println("lütfen cinsiyetinizi kadınsa 'K', erkekse 'E' giriniz");
        char cinsiyet= scan.next().charAt(0);

        if(cinsiyet=='E'|| cinsiyet=='e'){
            if(yas>=65){
                System.out.println("emekli olabilirsiniz");
            }else {
                System.out.println("emekli olmak için " +(65-yas)+ " yıl daha çalışmanız gerekir");
            }
        }else if(cinsiyet=='K'){
            if(yas>=60){
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olmak için " +(60-yas)+ " yıl daha çalışmanız gerekir");
            }
        }else {
            System.out.println("yanlş cinsyet girişi");
        }


    }
}
