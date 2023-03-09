package E01_Grup;

import java.util.Scanner;

public class C03_ikiSayıToplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayı girin");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(sayıCıkar(a, b));

    }

    // public static void sayıCıkar(int a, int b) {
    //  System.out.println(a-b);
    // }

public static int sayıCıkar(int a,int b){
        return a-b;
}
}
