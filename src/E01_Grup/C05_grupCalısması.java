package E01_Grup;

import java.util.Scanner;

public class C05_grupCalısması {
    public static void main(String[] args) {
       // faktötyel hesapla
        faktöryel(5);
        System.out.println(faktöryel(5));

    }
    public static int faktöryel(int a){
        int sonuc=1;

        for (int i = 1; i <=a ; i++) {
            sonuc=sonuc*i;

        }
        return  sonuc;
    }
}
