package collactions;

import polliformism.E02_Tv;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> ebr= new java.util.LinkedList<>();
        ebr.add("E");
        ebr.add("T");
        System.out.println(ebr);  // [E, T]


        List<String> ll2= new java.util.LinkedList<>();
        ll2.add("R");
        ll2.add("Z");
        ll2.add(0,"A");
        System.out.println(ll2);       // [A, R, Z]

        ll2.addAll(1,ebr);

        System.out.println(ll2);     // [A, E, T, R, Z]

        ll2.set(2,"M");
        System.out.println(ll2);   // [A, E, M, R, Z]

        System.out.println(ll2.get(1)); // E

        System.out.println(ll2.retainAll(ebr));  // true
        System.out.println(ll2);  // [E]
        ll2.add("A");
        System.out.println(ll2.hashCode());  // 3165

        System.out.println(ll2.subList(1,2)); // [A]





    }
}
