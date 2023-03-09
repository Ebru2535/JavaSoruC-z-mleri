package day_kendim.Arrays;

public class E03_Arrays {

    public static void main(String[] args) {
        // verilen bir array de istenen bir elemanın var olup olmadığını
        // ve varsa kaç kere kullanıldığını yazdıran bir methot oluşturun


        int[] arr1= {2,5,6,8,1,3,2};
        elemanSayısıyazdır(arr1,3); // 1



    }
    public static void elemanSayısıyazdır(int[]arr,int arananSayi){

        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
             if(arr[i]==arananSayi){
                 sayac++;
             }

        }
        System.out.println(sayac);
    }
}
