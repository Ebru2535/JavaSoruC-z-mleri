package day_kendim.my_works;

import java.util.Scanner;

public class E05_googleOrnek {
    public static void main(String[] args) {

        int bas= 20;
        int bit = 30;


        int sayıTop= 0;

        if(bit<bas){
            System.out.println("uyarı");
        }else {
            for (int i = bas; i <=bit ; i++) {
                sayıTop+=i;

            }
            System.out.println(sayıTop);
        }
    }


}
