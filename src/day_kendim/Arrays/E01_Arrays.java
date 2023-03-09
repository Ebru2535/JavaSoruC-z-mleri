package day_kendim.Arrays;

import java.util.Arrays;

public class E01_Arrays {
    /// vereln  int variblenın elemanlarını 2 artır döndüren methot oluştur
    // eski array i yeni haiyle  kaydedin

    public static void main(String[] args) {
       int[] arr= {3,4,5,6};
       arr= arrayElemntleriniArtır(arr, 5);
        System.out.println(Arrays.toString(arr));
    }
       public static int [] arrayElemntleriniArtır(int[] ilkArr,int artis){
       for (int i = 0; i < ilkArr.length; i++) {
         ilkArr[i]+=artis;

    }
    return ilkArr;
}

}
