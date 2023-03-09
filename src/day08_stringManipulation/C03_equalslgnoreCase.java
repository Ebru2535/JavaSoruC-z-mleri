package day08_stringManipulation;

public class C03_equalslgnoreCase {
    public static void main(String[] args) {
        String str1= "Pazar";
        String str2= "PAZAR";
        String str3= "pazar";
        String str4= "PaZaR";

        System.out.println(str1==str2);// false
        System.out.println(str1==str3); // false
        System.out.println(str1==str4); // false

        System.out.println(str1.equals(str2));// false
        System.out.println(str1.equals(str3));// false
        System.out.println(str1.equals(str4));//false
        /*
        eger iki metnı KARŞILAŞTIRIKEN buyuk harf kucuk harf duyarlılığı ( case sensetive)
                 onemsız ise o zaman
                 equalsIgnoreCase() kullanılır*/
        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3));// true
        System.out.println(str1.equalsIgnoreCase(str4));// true
    }
}
