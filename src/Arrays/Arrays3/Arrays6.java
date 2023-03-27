package Arrays.Arrays3;

import java.util.Arrays;

public class Arrays6 {
    public static void main(String[] args) {
        // Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        //olusturun.
        String [] array={"ebru","sevgi","gülsüm","ali","sadesayan"};
        System.out.println(Arrays.toString(uzunvekısaKelimeYazdır(array)));
    }

   public static String [] uzunvekısaKelimeYazdır(String[] array) {
        String enuzunkelime=array[0];
        String enKısakelime= array[0];

       for (int i = 0; i < array.length; i++) {
           if(array[i].length()>enuzunkelime.length()){
               enuzunkelime=array[i];
           }
           if(array[i].length()<enKısakelime.length()){
               enKısakelime=array[i];
           }

       }
       String[] enUzunVeEnKisa = {enuzunkelime,enKısakelime};
       return enUzunVeEnKisa;


    }
}
