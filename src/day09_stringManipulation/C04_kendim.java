package day09_stringManipulation;

public class C04_kendim {
    public static void main(String[] args) {
        String str="saVas altun";

        boolean a = str.toLowerCase().contains("v");
        System.out.println("a = " + a);

        boolean sa = str.startsWith("sa");
        System.out.println("sa = " + sa);

        System.out.println(str.endsWith("altun"));


    }
}
