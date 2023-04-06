package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsimSil {
    static  Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        // - Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
        //  liste olarak dondurecek bir method olusturun.

   //  List<String>yenisimler=isimListele();

      System.out.println(isimListele());

    }
    public static List<String> isimListele() {
        String isim="";
        List<String> isimler= new ArrayList<>();

        while( !isim.equalsIgnoreCase("Q")) {
            System.out.println("Lütfen bir isim giriniz \n Bitirmek için Q ya basınız");
            isim = scanner.nextLine();

           if(!isim.equalsIgnoreCase("q")){
               isimler.add(isim);
           }
        }
        return isimler;
    }

    public static class E09Arraylist {
        public static void main(String[] args) {

            int [] arr={3,2,1,5,8,7};

            List<Integer> ebru= new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
             ebru.add(arr[i]);
            }
            System.out.println(ebru);  // [3, 2, 1, 5, 8, 7]
            System.out.println(ebru.contains(8)); // true

            List<Integer> savas=new ArrayList<>();
            savas.add(10);
            savas.add(1);
            savas.add(2);
            System.out.println(savas); //[10, 1, 2]
            savas.remove(1);
            System.out.println(savas); // [10, 2] 1. indeksi sildi

            Integer sil=10;
            savas.remove(sil);
            System.out.println(savas);  // [2]

        }
    }
}
