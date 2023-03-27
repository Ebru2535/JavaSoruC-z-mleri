package stringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {
     // str cok içeriyo mu
        String str = "Java ogrenmek cok kolay";

        System.out.println(str.contains("cok")); // true

        // kullanıcıdan aldığımız cumle "cok" ile baslayan ilk  kelimeyı yazdırın

        System.out.println(str.endsWith("cok")); // false
        System.out.println(str.indexOf('a'));   // 1
        System.out.println(str.indexOf("v"));   //2
        System.out.println(str.indexOf("cok")); // 14
        System.out.println(str.indexOf("a", 5)); //21

        // 2. o nun ındexını bulunun
        //bilk once ilk o nun indexını bulurm
        // sonra o ındexden sonra ikicnş o yu bulurum
        //"Java ogrenmek cok kolay";

        int index1Of= str.indexOf("o");
        System.out.println(index1Of); //5
        int index2Of= str.indexOf("o",index1Of);
        System.out.print(index2Of+ " ");  // 5 5

        int indeb2Of= str.indexOf("o",index1Of+1);
        System.out.print(indeb2Of); // 5 15

    }
}
