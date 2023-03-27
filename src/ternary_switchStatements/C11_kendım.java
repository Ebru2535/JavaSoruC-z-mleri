package ternary_switchStatements;

import java.util.Scanner;

public class C11_kendım {
    public static void main(String[] args) {
        // öğrenci  0 - 50 notu F
         // 50 - 60 D
        // 60 70 C
        // 70 80 b
        // 80 100 a
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen not giriniz");
        int not = scan.nextInt();
        if(not<0 || not>100){
            System.out.println("gecersiz not");
            System.exit(0);
        }
        if(not>=0 && not<50){
        System.out.println("notunuz: F");
        }else if(not>=50 && not<60){
            System.out.println("notunuz :d");
        }else if (not>=60 && not<70){
            System.out.println("notunuz: C");
        } else if (not>=70 && not<80){
            System.out.println("notunuz: b");
        }else if (not>=80 && not<100) {
            System.out.println("notunuz: a");
        }

        int sayı1= 5;
        int sayı2=2;
        int sonuc=(sayı1/sayı2);
        System.out.println(sonuc); //2
        int ab=5;
        int cb=2;
        double son= ab/cb;
        System.out.println(son);
        }
}
