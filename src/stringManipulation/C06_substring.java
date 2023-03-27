package stringManipulation;

public class C06_substring {
 public static void main(String[] args) {

  String str = "Java ögren, isi kap";

  System.out.println(str.length()); // karakter sayısı :19

  // metnın tam ortasınakı karakter

  System.out.println(str.charAt(str.length() / 2));//n

  // son karakteri yazdır
  System.out.println(str.charAt(str.length() - 1)); //p

  // bir karakteri değil de verilen strıngı içerdeği bir metın parçasını elde etmek istersek
  // örnegın "ögren" kelimesini yazdıralım
  System.out.println(str.substring(5, 9));// ogre

  // substrıng ( bas, bıtıs ) methodunda
  // başlangıç olarak yazılan index dahıl (inclusive)
  //  bitiş olarak yazılan index harıc(exclusıve) dır

  System.out.println(str.substring(5, 10));// ogren

  //str de java kelımesını yazdıralım
  System.out.println(str.substring(0, 4)); // java

  // str den "kap" yazıdr

  System.out.println(str.substring(16, 19)); // kap
  System.out.println(str.substring(str.length() - 3));// kap


  // substring kullanarak sadece j harfını yazıdırn
  System.out.println(str.substring(0, 1));

  // substrıng kullanarak 9. indexi harfı buyuk oalrak yazdırın

  System.out.println(str.substring(9, 10).toUpperCase());// n
 }
}