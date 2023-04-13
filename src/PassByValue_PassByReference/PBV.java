package PassByValue_PassByReference;

import java.util.ArrayList;
import java.util.List;

public class PBV {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);


    } public static List<Integer>ListeyiYeniDegerAta(List<Integer>liste){
        List<Integer>yeniListe=new ArrayList<>();
        yeniListe.add(30);
        yeniListe.add(40);
        liste=yeniListe;
        return liste;
        // sayfa no 46
    }
}
