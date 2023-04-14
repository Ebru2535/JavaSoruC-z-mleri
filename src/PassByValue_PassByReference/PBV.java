package PassByValue_PassByReference;

import java.util.ArrayList;
import java.util.List;

public class PBV {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        System.out.println(listeyiYeniDegerAta(liste));  //  [30, 40]
        System.out.println(liste); // [10, 20]

        System.out.println(listeElementleriniDegistir(liste));  // [50, 60]
        System.out.println(liste);      // [50, 60]


    } public static List<Integer>listeyiYeniDegerAta(List<Integer>liste){
        List<Integer>yeniListe=new ArrayList<>();
        yeniListe.add(30);
        yeniListe.add(40);
        liste=yeniListe;
        return liste;

    } public static List<Integer> listeElementleriniDegistir(List<Integer> liste){
        liste.set(0,50);
        liste.set(1,60);
        return liste;
    }

}
