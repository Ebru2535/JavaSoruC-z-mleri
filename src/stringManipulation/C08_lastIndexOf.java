package stringManipulation;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str= "Javayi iyi ogrenmek icin cok calişmak lazim cok";
         // ilk a nın indexını yazdıralım
        System.out.println(str.indexOf("a")); // 1

        // son a nın indexını yazdr
        System.out.println(str.lastIndexOf("a")); // 39

        // verilen str da cok kelimesinin kullanımınnkontrol edip b
        // bir kere kullanılmış
        // cok kelımesi kullanılmamış
        // birden fazla kullnılmış  sonuclarından uygunolanı yazdıralım

          int ilkCokIndexi= str.indexOf("cok");
          int sonCokIndexi= str.lastIndexOf("cok");

        if(!str.contains("cok")){
            System.out.println("cok kelimesi kullnılmamış");
        }else if(ilkCokIndexi==sonCokIndexi) {
            System.out.println("cok kelimesi birkere kullanılmış");
        }else{
            System.out.println("cok kelimesi birden fazla kullanılmış");
        }
    }
}
