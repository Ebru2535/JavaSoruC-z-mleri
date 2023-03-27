package MethotOlusturma;

import java.util.Scanner;

public class C02_İkiSayıToplama {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz");
        int a= scan.nextInt();
        int b= scan.nextInt();


        int c = ikiSayiTopla1(a,b);
        System.out.println(c);
        int g= scan.nextInt();
        int e= scan.nextInt();
        ikiSayiTopla2(g,e);
    }

    public static int ikiSayiTopla1(int a, int b){
        return a+b;



    }

    public static void ikiSayiTopla2(int a, int b) {
        System.out.println(a+b);
    }

}
