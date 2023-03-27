import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class main {


    public static void main(String[] args) {
        /* iteretor neden ihtiyac duydum?
        bir lList de eleman silmek için iterator classındakı hasnesxt opretar kullanmak için
        remove methodunu for i de List in size nı değiştitdiği için kullanamadım.

         */


        List<Integer> sayılar= new ArrayList<>(Arrays.asList(5,6,9,12,3));
        Iterator ebr= sayılar.listIterator();
        while(ebr.hasNext()){
            Integer s = (Integer)ebr.next();
           if(s%2==0){
               ebr.remove();
           }
        }

        System.out.println(sayılar);
         }

    }
