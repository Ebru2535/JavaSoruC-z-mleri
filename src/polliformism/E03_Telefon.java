package polliformism;

public class E03_Telefon extends E02_Tv {
    public static void main(String[] args) {
        E03_Telefon tel= new E03_Telefon();
        System.out.println(tel.marka);
        tel.ac();
        tel.kapa();

        E01_Cihaz cihaz=new E02_Tv();
        System.out.println(tel.marka);
        tel.ac();

    }

}


