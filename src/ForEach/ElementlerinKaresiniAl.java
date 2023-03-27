package ForEach;

public class ElementlerinKaresiniAl {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen int array’deki her elementin karelerini alip,
                karelerinin toplamini
                yazdiran bir method olusturun.
         */
        int [] array ={2,3,6,2,3,9};
        kareleriTopla(array);

    }

    public static void kareleriTopla(int[] array) {
        int toplam=0;
        for (int each:array) {
            toplam+=each*each;
        }
        System.out.println(toplam);
    }
}

