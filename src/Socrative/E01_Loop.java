package Socrative;

public class E01_Loop {
    public static void main(String[] args) {

        guncelle("john", "black");

    }



    public static void guncelle(String s, String t) {

        s = s.substring(0,1).toUpperCase() + t.substring(2);

        System.out.println(s);

    }

    }

