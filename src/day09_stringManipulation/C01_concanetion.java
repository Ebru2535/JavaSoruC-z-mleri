package day09_stringManipulation;

public class C01_concanetion {
    public static void main(String[] args) {
String str1="Java";
String str2= "eliif";

        System.out.println(str1+' '+str2); //Java eliif
        System.out.println(str1.concat(str2)); //Javaeliif
        System.out.println(str1.concat(" ").concat(str2));// Java eliif

        String a="Java";
        String b=" ";
        String c="kolay";
        String d="";

        int sa=3;
        int yı=4;

        System.out.println(sa*yı+" " + a+" "+c); // 12 java kolay
        System.out.println(sa+yı +" "+a+ " "+c ); //7 java kolay
        System.out.println(""+sa+yı+a+" "+c);    //34java kolay
        System.out.println(a+(sa*yı)+c);     // java12kolay
        System.out.println(a+(sa+yı)+c); // java7kolay


    }
}
