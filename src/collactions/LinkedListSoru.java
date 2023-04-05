package collactions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListSoru {
    public static void main(String[] args) {


     /*
        Soru : Kullanicidan deger alarak iki String liste olusturun. Kullanici deger girmeyi
              birakmak icin 0’a basmalidir.
          Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
         liste1 : …….
         liste2 : …….
         ortak elementler : …….
  */

        System.out.println("once List 1 oluturalım");
        List<String>List1=kullanıcıdanAlarakListOlustur();
        System.out.println("sımdi Liste2 yı oluturalım");
        List<String> List2=kullanıcıdanAlarakListOlustur();

        System.out.println("Liste1 : "+List1);
        System.out.println("List2 :" +List2);
        List1.retainAll(List2);
        System.out.println("ortak elemanlar :"+List1);

    }
     public static List<String>kullanıcıdanAlarakListOlustur(){
        List<String >isimListesi=new LinkedList<>();
         Scanner scanner=new Scanner(System.in);
         String isim="";

         while (!isim.equalsIgnoreCase("0")){
             System.out.println("Listeye eklemek için isim giriniz\n Bitirmek için 0 a basınız");
                     isim=scanner.next();
                     if(!isim.equalsIgnoreCase("0")){
                         isimListesi.add(isim);
                     }
         }
        return isimListesi;
     }

}
