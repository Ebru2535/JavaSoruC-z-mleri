package Arrays.Arrays3;

public class array {
    public static void main(String[] args) {
      //  Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
       //   kullanildigini yazdiran bir method olusturun


        int []arr= {1,2,3,5,3,5,4,2,3,3};
        elemanAra(arr,9);
    }
    public static void elemanAra(int [] a, int aranan) {
        int sayac=0;

       for (int i = 0; i <a.length; i++) {

           if(a[i]==aranan){
               sayac++;
           }
       }
       System.out.println( aranan + " rakamı  " +sayac+ " kez kullanılmıştır");
    }
}
