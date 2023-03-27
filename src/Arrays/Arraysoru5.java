package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysoru5 {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.


        System.out.println(Arrays.toString(arrayCagırma()));

    }

    public static int[]  arrayCagırma() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen arrayın uzunluğunu giriniz ");
        int arrayUzunlugu = scanner.nextInt();

        System.out.println("lütfen elemanları giriniz");

        int [] arr= new int[arrayUzunlugu];
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i+1) + ". elemanı giriniz: ");
            arr[i]= scanner.nextInt();

        }return arr;

    }




}
