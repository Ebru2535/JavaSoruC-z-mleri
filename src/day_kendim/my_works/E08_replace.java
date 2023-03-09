package day_kendim.my_works;

public class E08_replace {
    public static void main(String[] args) {
        String ebru= "    Eb%3ru45 A+lt&un...    ";
        // ebru yu Ebru Altun
        ebru=ebru.trim();
        ebru=ebru.replaceAll("\\d",""); // Eb%ru A+lt&un...
        ebru=ebru.replaceAll(" ","7");
        ebru=ebru.replaceAll("\\W","");  // EbruAltun
        ebru=ebru.replaceAll("7"," ");
        System.out.println(ebru);

    }
}
