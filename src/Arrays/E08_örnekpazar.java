package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E08_örnekpazar {
    public static void main(String[] args) {
        String [] pazar= new String[6];
        pazar [0]= "patates";
        pazar [1]= "patlıcan";
        pazar [2]= "maydonoz";
        pazar [3]= "çilek";
        pazar [4]= "erik";
        System.out.println(Arrays.toString(pazar));

        for (int i = 0; i <= pazar.length-1; i++) {

            System.out.println( i+1+". aldığın ürün hangisi : " +pazar[i] );

        }
        System.out.println("==========");

        for(String pazarListesi:pazar){
            System.out.println(pazarListesi);
        }
        System.out.println("------------------------------------------------------------");

        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen 1. ürünü seçiniz");
        pazar [0]= scanner.next();
        System.out.println("lütfen 2. ürünü seçiniz");
        pazar [1]= scanner.next();
        System.out.println("lütfen 3. ürünü seçiniz");
        pazar [2]= scanner.next();
        System.out.println("lütfen 4. ürünü seçiniz");
        pazar [3]= scanner.next();
        System.out.println("lütfen 5. ürünü seçiniz");
        pazar [4]= scanner.next();
        System.out.println(Arrays.toString(pazar));







    }
}

