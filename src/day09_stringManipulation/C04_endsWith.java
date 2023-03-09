package day09_stringManipulation;

public class C04_endsWith {
    public static void main(String[] args) {
        String str= "Java ogrenen, ıssız kalmaz";

        System.out.println(str.endsWith("kalmaz")); // true
        System.out.println(str.endsWith("Java ogrenen, ıssız kalmaz"));// true
        System.out.println(str.endsWith(""));// true

    }
}
