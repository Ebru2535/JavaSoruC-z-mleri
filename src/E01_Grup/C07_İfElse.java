package E01_Grup;

import java.util.Scanner;

public class C07_İfElse {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
       // yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen yasınızı girin");
        int yas= scan.nextInt();
        if(yas>=65 ){
            System.out.println("emekli olabilirsin");
        } else {
            System.out.println("emekli olabilmek içim"+(65- yas)+"yıl daha çalışmalısın");
        }
    }
}
