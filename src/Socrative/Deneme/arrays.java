package Socrative.Deneme;

import java.util.ArrayList;
import java.util.List;

public class arrays {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>() ;



        list.add( "Ali" );

        list.add( "Can" );

        list.add( "Ayse" );

        list.add( 0, "Havva");

        System.out.println(list);
    }

    public static class Socrative {
        public static void main(String[] args) {
            ArrayList<Character> list = new ArrayList<Character>();



            for (char i = 'a'; i <= 'e' ; i++) {

                list.clear();

                list.add(i);

            }

            System.out.println(list);

        }

        }
}
